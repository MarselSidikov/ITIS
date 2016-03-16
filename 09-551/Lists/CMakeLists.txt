cmake_minimum_required(VERSION 3.3)
project(Lists)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp ArrayList.h ArrayList.cpp)
add_executable(Lists ${SOURCE_FILES})