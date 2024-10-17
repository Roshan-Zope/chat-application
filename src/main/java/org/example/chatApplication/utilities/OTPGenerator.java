package org.example.chatApplication.utilities;

import java.util.Random;

/**
 * The OTPGenerator class is responsible for generating a random One-Time Password (OTP).
 * This OTP can be used for authentication purposes like email verification or two-factor authentication.
 */
public class OTPGenerator {

    /**
     * Generates a random 6-digit OTP.
     *
     * @return A string representing the 6-digit OTP.
     */
    public static String generateOTP() {
        Random random = new Random();
        // Generate a random 6-digit number and return it as a string
        int otpValue = 100000 + random.nextInt(900000); // Ensures the OTP is a 6-digit number
        return String.valueOf(otpValue);
    }
}
