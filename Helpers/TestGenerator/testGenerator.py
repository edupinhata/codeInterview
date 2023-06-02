import math
import os
import random
import shutil
import zipfile

from testProblems import TestProblems
from constants import *
from problemType import ProblemType
from problem import Problem


class TestGenerator:

    def __init__(self, output_file):
        self.test_num_problems = TEST_NUM_PROBLEMS
        self.test_max_types_per_problem = TEST_MAX_TYPES_PER_PROBLEM
        self.test_dir_name = "NewTest"
        self.test_dir_path = r"./{}".format(self.test_dir_name)
        self.output_file = "{}/{}".format(self.test_dir_path, output_file)
        # Load all problems
        self.problems = TestProblems()


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
        print('Init generation')

        os.makedirs(self.test_dir_path, exist_ok=True)

        self.write_file(HEADER_PATH)

        for max_types in range(math.ceil(self.test_num_problems/len(ProblemType))):
            for type in ProblemType:
                types.append(type.value)

        for problem_number in range(self.test_num_problems):
            type_to_select = types.pop(random.randint(0, len(types)-1))
            problem = self.get_random_problem_per_level(type_to_select, MIN_TEST_LEVEL, MAX_TEST_LEVEL)
            problem_readme = problem.path + '/README.md'
            self.write_file(problem_readme, True)

            print('PATH: ' + problem.path)
            print('self.test_dir: ' + self.test_dir_path)

            self.copy_problem_dir(problem)

        self.zip_test(self.test_dir_path + "/Test.zip", self.test_dir_path)

    def copy_problem_dir(self, problem):
        dst_problem_path = "{}/{}".format(self.test_dir_path, problem.name)
        src_source_path = "{}/source".format(problem.path)
        if os.path.isdir(src_source_path):
            os.mkdir(dst_problem_path)
            shutil.copytree(src_source_path, dst_problem_path, dirs_exist_ok=True)

    def zip_test(self, dst_dir_zipname, dir_to_zip):
        with zipfile.ZipFile(dst_dir_zipname, mode='w') as archive:
            for foldername, subfolders, filenames in os.walk(dir_to_zip):
                count = 1
                for filename in filenames:
                    print("Writing {}/{} - {}".format(count, len(filenames), filename))
                    if filename[-4:] == ".zip":
                        continue
                    file_path = os.path.join(foldername, filename)
                    archive.write(file_path, arcname=os.path.relpath(file_path, dir_to_zip))
                    count += 1


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


tg = TestGenerator('README.md')
tg.generate_test()
