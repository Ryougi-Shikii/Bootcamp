"""
Example:
    Input:
        grid = [['A','B','C','E'],
                ['S','F','C','S'],
                ['A','D','E','E']]
        word = "ABCCED"
    Output: true
"""
grid = [['A','B','C','E'], ['S','F','C','S'], ['A','D','E','E']]
word = "ABCCED"
def func(board, word):
    m = len(board)
    n = len(board[0])

    if len(word) > m * n:
        return False

    boardFreq = [0] * 128

    for row in board:
        for c in row:
            boardFreq[ord(c)] += 1

    wordFreq = [0] * 128

    for c in word:
        idx = ord(c)
        wordFreq[idx] += 1

        if wordFreq[idx] > boardFreq[idx]:
            return False

    if boardFreq[ord(word[-1])] < boardFreq[ord(word[0])]:
        word = word[::-1]

    chars = list(word)

    for r in range(m):
        for c in range(n):
            if board[r][c] == chars[0] and dfs(board, r, c, 0, chars):
                return True

    return False

def dfs(board, r, c, idx, word):
    if idx == len(word):
        return True

    if (r < 0 or r >= len(board) or
        c < 0 or c >= len(board[0]) or
        board[r][c] != word[idx]):
        return False

    temp = board[r][c]
    board[r][c] = '#'

    found = (
        dfs(board, r + 1, c, idx + 1, word) or
        dfs(board, r - 1, c, idx + 1, word) or
        dfs(board, r, c + 1, idx + 1, word) or
        dfs(board, r, c - 1, idx + 1, word)
    )

    board[r][c] = temp

    return found