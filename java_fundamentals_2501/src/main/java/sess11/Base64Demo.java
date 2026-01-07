/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess11;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

/**
 * Java program to demonstrate Base64 encoding and decoding in Java. This
 * class showcases encoding in standard, URL, and MIME formats
 *
 * @author Victor
 */
public class Base64Demo {

    // Class constant string to store the encoding characterset
    private static final String UTF_8 = StandardCharsets.UTF_8.name();

    /**
     * Encodes a string to Base64 (Standard encoding).
     *
     * @param input The input string to be encoded.
     * @return The Base64 encoded string.
     *
     * @throws UnsupportedEncodingException
     */
    private static String encodeBase64(String input)
            throws UnsupportedEncodingException
    {
        return Base64.getEncoder().encodeToString(input.getBytes(UTF_8));
    }

    /**
     * Decodes a Base64 encoded string.
     *
     * @param encoded The Base64 encoded string.
     * @return The decoded string.
     * @throws UnsupportedEncodingException
     */
    private static String decodeBase64(String encoded)
            throws UnsupportedEncodingException
    {
        byte[] decodedBytes = Base64.getDecoder().decode(encoded);
        return new String(decodedBytes, UTF_8);
    }

    /**
     * Encodes a string to Base64 using URL-safe encoding (RFC 4648 5).
     * Uses '-' instead of '+', '_' instead of '/' and omits padding '='.
     *
     * @param input The input string to be encoded.
     * @return The URL-safe Base64-encoded string (no padding).
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String encodeBase64URL(String input)
            throws UnsupportedEncodingException
    {
        return Base64.getUrlEncoder().encodeToString(input.getBytes(UTF_8));
    }

    /**
     * Decodes a URL-safe Base64-encoded string.
     * Accepts strings encoded with {@link Base64#getUrlEncoder()}
     * (i.e., using '-' and '_', no padding).
     *
     * @param encoded The URL-safe Base64-encoded string.
     * @return The original decoded string
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String decodeBase64URL(String encoded)
            throws UnsupportedEncodingException
    {
        byte[] decodedBytes = Base64.getUrlDecoder().decode(encoded);
        return new String(decodedBytes, UTF_8);
    }

    /**
     * Encodes a string to Base64 using MIME encoding (RFC 2045). Uses standard
     * alphabet but inserts line breaks every 76 characters.
     *
     * @param input The input string to encode.
     * @return The MIME Base64-encoded string (with line breaks and padding).
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String encodeBase64Mime(String input)
            throws UnsupportedEncodingException
    {
        return Base64.getMimeEncoder().encodeToString(input.getBytes(UTF_8));
    }

    /**
     * Decodes a MIME Base64-encoded string. Handles line breaks and padding as
     * produced by {@link Base64#getMimeEncoder()}.
     *
     * @param encoded The MIME Base64-encoded string (may contain line breaks).
     * @return The original decoded string.
     * @throws IllegalArgumentException If the input is not valid MIME Base64.
     * @throws UnsupportedEncodingException If UTF-8 is not supported.
     */
    private static String decodeBase64Mime(String encoded)
            throws UnsupportedEncodingException
    {
        byte[] decodedBytes = Base64.getMimeDecoder().decode(encoded);
        return new String(decodedBytes, UTF_8);
    }

    // Helper to generate a long text for MIME encoding demo
    private static String generateRandomUUIDs(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(UUID.randomUUID().toString());
        }
        return sb.toString();
    }

    // Simple spacer helper to match Spacer.separator() in the screenshots
    private static class Spacer {
        static void separator() {
            System.out.println("--------------------------------------------------");
        }
    }

    public static void main(String[] args) {
        try {
            String original = "Hello Base64 Demo";

            // --------------------------------------------------------------
            // Standard Base64
            // --------------------------------------------------------------
            String encodedBasic = encodeBase64(original);
            String decodedBasic = decodeBase64(encodedBasic);
            System.out.printf("Standard Encoded: %s%nStandard Decoded %s%n",
                    encodedBasic, decodedBasic);
            Spacer.separator();

            // --------------------------------------------------------------
            // URL-Safe Base64
            // --------------------------------------------------------------
            String encodedURL = encodeBase64URL(original);
            String decodedURL = decodeBase64URL(encodedURL);
            System.out.printf("URL-Safe Encoded: %s%nURL-Safe Decoded %s%n",
                    encodedURL, decodedURL);
            Spacer.separator();

            // --------------------------------------------------------------
            // MIME Base64
            // --------------------------------------------------------------
            String longText = generateRandomUUIDs(10);
            String encodedMIME = encodeBase64Mime(longText);
            String decodedMIME = decodeBase64Mime(encodedMIME);
            System.out.printf(
                    "MIME Encoded (with line breaks): %s%nMIME "
                    + "Decoded matches original %b%n",
                    encodedMIME, longText.equals(decodedMIME));
            Spacer.separator();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
