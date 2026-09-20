package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes3.dex */
public class JsonProcessingException extends JacksonException {
    public JsonLocation getLocation() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        getLocation();
        String messageSuffix = getMessageSuffix();
        if (messageSuffix == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (messageSuffix != null) {
            sb.append(messageSuffix);
        }
        return sb.toString();
    }

    public String getMessageSuffix() {
        return null;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
