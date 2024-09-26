# Datatypes

- Literals: Literals are fixed values that represent data directly.
- Types of Datatypes
1. Primitive
    - Integer
        - Byte (1 byte) -> Range: -2^7 to 2^7-1 -> -128 to 127
        - Short (2 bytes) -> Range: -2^15 to 2^15+1 -> -32768 to 32761
        - Int (4 bytes) -> Range: -2^32 to 2^32+1
        - Long (8 bytes) -> Range: -2^64 to 2^64+1 -> In long, we need to put uppercase L at the end to initialise it. For eg: double d = 80.978473276473L;
    - Float
        - Double (8 bytes) -> By default decimal values are considered to be double.
        - Float (4 bytes) -> If we wanna explicitly declare that this is float then we need to put f after it. For eg: float f=5.6f;
    - Character (2 bytes) Unicode Encoding -> It needs to be put inside single colons
    - Boolean (1 byte) true or false
2. Non-Primitive
