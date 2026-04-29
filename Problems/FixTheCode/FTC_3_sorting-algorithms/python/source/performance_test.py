import time

class PerformanceTest:
    def __init__(self):
        pass

    def evaluate_performance(self, sorter, array, expected_sorted_array):
        start_time = time.time()
        sorter.sort()
        sorted_array = sorter.array
        end_time = time.time()
        duration = (end_time - start_time) * 1000  # Convert to milliseconds

        if sorted_array != expected_sorted_array:
            print("[ERROR] Sorting failed. Expected array different from sorted one.")
        print(f"Sorting took {duration:.2f} milliseconds.")