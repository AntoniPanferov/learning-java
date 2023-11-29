// Given are two classes(superclass and subclass).
// 1. While compiling, the compiler will initially display one or more errors. Where and why?
// 2. Now assume that all lines that cause errors are commented out, and provide the output in the main file.

import demo.*;
import usedemo.*;

public class Main {
    public static void main(String[] args) {
        new Super().hello();
        new Sub().hello();
    }
}