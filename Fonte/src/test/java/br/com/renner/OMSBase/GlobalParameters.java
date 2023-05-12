package br.com.renner.OMSBase;


import br.com.renner.Core.BaseTest;

public class GlobalParameters {

    private static BaseTest baseTest;
    private static String report;

    public static String reportName() {
        baseTest = new BaseTest();
        report = new StringBuilder()
                .append(baseTest.getSetupProperty("report.name"))
                .toString();
        return report;
    }
    public static String reportPath() {
        baseTest = new BaseTest();
        report = new StringBuilder()
                .append(baseTest.getSetupProperty("report.path"))
                .toString();
        return report;
    }
}
