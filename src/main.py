# 2. Function to return the mean
def average(scores):
    return sum(scores) / len(scores)

# 3. Function to determine the letter grade
def letter(avg):
    if avg >= 80:
        return 'A'
    elif avg >= 70:
        return 'B'
    elif avg >= 60:
        return 'C'
    elif avg >= 50:
        return 'D'
    else:
        return 'F'

def main():
    # 1. Store five exam scores in a list
    scores = [85.0, 72.5, 90.0, 65.0, 78.0]

    # 4. Loop over the scores and print each one with its position
    print("Exam Scores:")
    for i, score in enumerate(scores, start=1):
        print(f"Score {i}: {score}")

    # 5. Print a summary line with string interpolation
    avg = average(scores)
    grade = letter(avg)
    print(f"Average: {avg:.2f} ({grade})")

if __name__ == "__main__":
    main()