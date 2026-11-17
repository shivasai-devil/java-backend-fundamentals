package com.backend.prep;

import java.time.LocalDate;

public class HelloWorld {
   // Java 17+ immutable record (replaces verbose POJO boilerplate)
   record EngineerProfile(String name, double yoe, String primarySkill, String targetRole) {}

    public static void main(String[] args) {
        var profile = new EngineerProfile("Backend Engineer", 3.2, "Oracle PL/SQL & Java", "Java Backend Developer");

        String banner = """
                ========================================
                Week 1 Day 1 Environment Verified!
                Java Runtime : %s
                Date         : %s
                Profile      : %s
                ========================================
                """.formatted(System.getProperty("java.version"), LocalDate.now(), profile);

        System.out.println(banner);
    }
}
