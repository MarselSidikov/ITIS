cmake_minimum_required(VERSION 3.3)
project(Headers)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")

set(SOURCE_FILES main.cpp Summator.cpp Summator.h)
add_executable(Headers ${SOURCE_FILES})