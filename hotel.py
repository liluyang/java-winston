DISTANCE_PER_DAY = 200

def penalty(x: int):
  return (DISTANCE_PER_DAY - x)**2

def optimal_sequence_of_hotels(a, n):
  dp = [0] * (n + 1)
  for i in range(1, n + 1):
    dp[i] = min(dp[j] + penalty(a[i] - a[j]) for j in range(i))
  return dp[n]

def solution_o_n(a, n):
  dp = [0] * (n + 1)
  prev = [0] * (n + 1)

  for i in range(1, n + 1):
    prev[i] = prev[i - 1]
    mininx = prev[i]
    minval = dp[mininx] + penalty(abs(a[i] - a[mininx]))
    while prev[i] < i and a[i] - a[prev[i]] > 0:
      if (dp[prev[i]] + penalty(abs(a[i] - a[prev[i]])) > 0):
        mininx = prev[i]
        minval = dp[prev[i]] + penalty(abs(a[i] - a[prev[i]]))
      
      prev[i] = prev[i] + 1

    prev[i] = mininx
    dp[i] = minval

  return dp[n]


if __name__ == "__main__":
  # a = [0, 250, 400, 600, 850]
  a = [0, 190, 200, 400]
  n = len(a) - 1
  print('expected result = ', optimal_sequence_of_hotels(a, n))
  print('O(n) result = ', solution_o_n(a, n))
