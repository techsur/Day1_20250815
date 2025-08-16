package com.day1.languagefundamentals._4literals;

public class Q13NumberBaseConversion1 {

    public static void main(String[] args) {
        int number = 42; // integer literal

        // Converting to binary, octal, hexadecimal
        String binary = Integer.toBinaryString(number);
        String octal = Integer.toOctalString(number);
        String hex = Integer.toHexString(number);

        // Printing the converted strings
        System.out.println("Number: " + number);          // Output: Number: 42
        System.out.println("Binary: " + binary);          // Output: Binary: 101010
        System.out.println("Octal: " + octal);            // Output: Octal: 52
        System.out.println("Hexadecimal: " + hex);        // Output: Hexadecimal: 2a

        // Converting back to integer
        int fromBinary = Integer.parseInt(binary, 2);
        int fromOctal = Integer.parseInt(octal, 8);
        int fromHex = Integer.parseInt(hex, 16);

        // Printing integers converted back
        System.out.println("\nConverted back to integer:");
        System.out.println("From binary: " + fromBinary);   // Output: 42
        System.out.println("From octal: " + fromOctal);     // Output: 42
        System.out.println("From hexadecimal: " + fromHex); // Output: 42
    }
}
