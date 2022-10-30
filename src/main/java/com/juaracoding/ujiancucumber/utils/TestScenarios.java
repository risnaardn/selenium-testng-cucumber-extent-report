package com.juaracoding.ujiancucumber.utils;

public enum TestScenarios {

    T1("User login page"),
    T2("User search item One"),
    T3("User search item Two"),
    T4("User search item One to checkout"),
    T5("User search item Two to checkout"),
    T6("User checkout item");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
