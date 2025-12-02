/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess10;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;

/**
 *
 * @author Victor
 */
public class ZonedDateAndTimeAPIDemo {

    // Class Methods
    // 1. Demonstrate the OffsetDateTime class
    private static void demoOffsetDateTime()
    {
        System.out.println("1. OffsetDateTime: Handles Date-time with an offset "
                + "from the UTC/Greenwich.");

        // Get & display the current date & time with an offset from UTC
        OffsetDateTime nowWithOffset = OffsetDateTime.now();
        System.out.println("Current OffsetDateTime (with system default "
                + "offset): " + nowWithOffset);

        OffsetDateTime twoHoursEarlier = nowWithOffset.minusHours(2);
        System.out.println("Two hours before nowWithOffset: " + twoHoursEarlier);

        // Create & display a specific OffsetDateTime (e.g., 2025-03-25T07:30:00+03:00)
        OffsetDateTime birthdayOffsetDateTime = OffsetDateTime.of(2025, 3, 25,
                7, 30, 0, 0, ZoneOffset.ofHours(3));
        System.out.println("Birthday with OffsetDateTime: "
                + "(2025-03-25T07:30:00+03:00): " + birthdayOffsetDateTime);
    }

    // 2. Demonstrate the OffsetTime class
    private static void demoOffsetTime()
    {
        System.out.println("2. OffsetTime: Handles time with an offset (no Date) "
                + "from the UTC/Greenwich.");

        // Get and display the current time with an offset from the UTC
        OffsetTime currentOffsetTime = OffsetTime.now();
        System.out.println("Current OffsetTime (with system default "
                + "offset): " + currentOffsetTime);
    }

    // 3. Demonstrate the ZonedDateTime class
    private static void demoZonedDateTime()
    {
        System.out.println("3. ZonedDateTime: Handles Date-time with a time zone.");

        ZonedDateTime tokyoZonedDateTime =
                ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Current ZonedDateTime in Tokyo [Asia/Tokyo] is: "
                + tokyoZonedDateTime);

        ZonedDateTime newYorkZonedDateTime =
                ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Current ZonedDateTime in New York [America/New_York] is: "
                + newYorkZonedDateTime);

        // Convert ZonedDateTime to a different time zone (e.g. UTC)
        System.out.println("NewYork ZonedDateTime converted to UTC is: "
                + newYorkZonedDateTime.withZoneSameInstant(ZoneId.of("UTC")));
    }

    //=============================================
    // Demonstrating the ZoneId class
    //=============================================
    private static void demoZoneId()
    {
        System.out.println("4. ZoneId: Handling Time Zone Identifiers");

        // Get the system's default time zone
        ZoneId systemZoneId = ZoneId.systemDefault();
        System.out.println("System Default Time Zone: " + systemZoneId);

        // Get a time zone by ID (e.g., Nairobi)
        ZoneId nairobiZone = ZoneId.of("Africa/Nairobi");
        System.out.println("Nairobi Time Zone: " + nairobiZone);

        // Get all available time zones
        System.out.println("Available Time Zones:");
        ZoneId.getAvailableZoneIds().forEach(System.out::println);
    }

    //=============================================
    // Demonstrating the ZoneOffset class
    //=============================================
    private static void demoZoneOffset()
    {
        System.out.println("5. ZoneOffset: Handling Fixed Offsets from UTC");

        // Get the system's current UTC offset
        ZoneId systemZoneId = ZoneId.systemDefault();
        ZoneOffset systemOffset =
                systemZoneId.getRules().getOffset(Instant.now());
        System.out.println("System's Current UTC Offset: " + systemOffset);

        // Create a specific ZoneOffset (e.g., UTC+2 hours)
        ZoneOffset offsetPlusTwo = ZoneOffset.ofHours(2);
        System.out.println("ZoneOffset UTC+2: " + offsetPlusTwo);

        // Create a specific ZoneOffset (e.g., UTC-5 hours)
        ZoneOffset offsetMinusFive = ZoneOffset.ofHours(-5);
        System.out.println("ZoneOffset UTC-5: " + offsetMinusFive);
    }

    // main method begins program execution
    public static void main(String[] args)
    {
        // 1. Demonstrate the OffsetDateTime class
        demoOffsetDateTime();
        Spacer.separator();

        // 2. Demonstrate the OffsetTime class
        demoOffsetTime();
        Spacer.separator();

        // 3. Demonstrate the ZonedDateTime class
        demoZonedDateTime();
        Spacer.separator();

        // 4. Demonstrate the ZoneId class
        demoZoneId();
        Spacer.separator();

        // 5. Demonstrate the ZoneOffset class
        demoZoneOffset();
        Spacer.separator();
    }
}
