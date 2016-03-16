cmake_minimum_required(VERSION 3.3)
project(Tree)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp BinarySearchTree.h BinarySearchTree.cpp)
add_executable(Tree ${SOURCE_FILES})