package com.solveConflicts;

public enum Browsers {
	
	CHROME("chrome"),
    FIREFOX("firefox"),
    OPERA("Opera"),
    INTERNET_EXPLORER("ie"),
    EDGE("edge");

    private String browserName;

    Browsers(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserName() {
        return browserName;
    }
	
}
