package com.mechanitis.demo.boilerplate.example2;

@SuppressWarnings("unused")
public class Conditional {

    PortType getPortType(final String portInputValue) {

        int port = Integer.valueOf(portInputValue);
        PortType type = PortType.UNKNOWN;
        switch (port) {
            case 20:
                type = PortType.FTP;
                break;
            case 80:
                type = PortType.HTTP;
                break;
            case 8080:
                type = PortType.HTTP;
                break;
            case 27017:
                type = PortType.DATABASE;
                break;
            default:
                if (port >= 20_001 && port <= 30_000) {
                    type = PortType.SAFE;
                } else if (port >= 9080 && port <= 9092) {
                    type = PortType.BUSY;
                }
        }

        return type;
    }

    public enum PortType {
        HTTP, DATABASE, UNUSED, UNKNOWN, FTP, BUSY, SAFE;
    }
}
