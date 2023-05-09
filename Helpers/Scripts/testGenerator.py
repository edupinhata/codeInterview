import os
import random
import shutil
from enum import Enum

PROBLEMS_PATH = "../../Problems/"
HEADER_PATH = PROBLEMS_PATH + 'TestHeader.md'
PROBLEMS_MAX_LEVEL = 10
TEST_NUM_PROBLEMS = 3
TEST_MAX_TYPES_PER_PROBLEM = 1
MIN_TEST_LEVEL = 1
MAX_TEST_LEVEL = 2


class ProblemType(str, Enum):
    CR = 'CodeReview'
    DB = 'Database'
    FTC = 'FixTheCode'
    I = 'Implementation'


class Problem:

    def __init__(self, problem_folder_name):
        splitted_problem = problem_folder_name.split('_')
        self.name = problem_folder_name
        self.path = r"{}{}/{}".format(PROBLEMS_PATH, ProblemType[splitted_problem[0]], problem_folder_name)
        self.level = int(splitted_problem[1])
        self.description = splitted_problem[2]


class TestGenerator:

    def __init__(self, output_file):
        self.test_num_problems = TEST_NUM_PROBLEMS
        self.test_max_types_per_problem = TEST_MAX_TYPES_PER_PROBLEM
        self.problems = {}
        self.test_dir = r'./NewTest'
        self.output_file = "{}/{}".format(self.test_dir, output_file)
        # Load all problems
        for type in ProblemType:
            self.problems[type] = self.get_all_problems(type)


    def get_all_problems(selfself, type):
        problems = []
        for dir in os.listdir(PROBLEMS_PATH + type):
           problems.append(Problem(dir))

        return problems

    def get_random_problem_per_level(self, problem_type, level_lower, level_higher):
        if level_lower < 1:
            level_lower = 1
        if level_higher > PROBLEMS_MAX_LEVEL:
            level_higher = PROBLEMS_MAX_LEVEL

        problems_per_type = self.problems[problem_type]
        problems_filtered = list(filter(lambda p: level_lower <= p.level <= level_higher, problems_per_type))
        if len(problems_filtered) > 0:
            return problems_filtered[random.randint(0, len(problems_filtered)-1)]
        return self.get_random_problem_per_level(problem_type, level_lower-1, level_higher+1)

    def get_random_problem(self, problem_type):
        problems_per_type = self.problems[problem_type]
        return problems_per_type[random.randint(0, len(problems_per_type)-1)]

    def generate_test(self):
        types = []

        os.makedirs(self.test_dir, exist_ok=True)

        self.write_file(HEADER_PATH)

        for max_types in range(self.test_max_types_per_problem):
            for type in ProblemType:
                types.append(type.value)

        for problem_number in range(self.test_num_problems):
            type_to_select = types.pop(random.randint(0, len(types)-1))
            problem = self.get_random_problem_per_level(type_to_select, MIN_TEST_LEVEL, MAX_TEST_LEVEL)
            problem_readme = problem.path + '/README.md'
            self.write_file(problem_readme, True)
            print('PATH: ' + problem.path)
            print('self.test_dir: ' + self.test_dir)

            dst_problem_path = "{}/{}".format(self.test_dir, problem.name)
            src_source_path = "{}/source".format(problem.path)
            if os.path.isdir(src_source_path):
                os.mkdir(dst_problem_path)
                shutil.copytree(src_source_path, dst_problem_path , dirs_exist_ok=True)

    def write_file(self, file_path, append=False):
        option = 'a' if append else 'w'

        input = open(file_path, 'r')
        out = open(self.output_file, option)
        for line in input:
            out.writelines(line)
        out.close()

        self.add_separator()

    def add_separator(self):
        out = open(self.output_file, 'a')
        out.writelines("\n\n---\n")


tg = TestGenerator('Test.md')
tg.generate_test()
