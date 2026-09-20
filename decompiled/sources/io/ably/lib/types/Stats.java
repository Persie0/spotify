package io.ably.lib.types;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public class Stats {
    private static String[] intervalFormatString = {"yyyy-MM-dd:hh:mm", "yyyy-MM-dd:hh", "yyyy-MM-dd", "yyyy-MM"};
    public MessageTypes all;
    public RequestCount apiRequests;
    public ResourceCount channels;
    public ConnectionTypes connections;
    public int count;
    public String inProgress;
    public MessageTraffic inbound;
    public String intervalId;
    public MessageTraffic outbound;
    public MessageTypes persisted;
    public ProcessedMessages processed;
    public PushedMessages push;
    public RequestCount tokenRequests;
    public String unit;

    public static class ConnectionTypes {
        public ResourceCount all;
        public ResourceCount plain;
        public ResourceCount tls;
    }

    public enum Granularity {
        minute,
        hour,
        day,
        month
    }

    public static class MessageCategory extends MessageCount {
        public Map<String, MessageCount> category;
    }

    public static class MessageCount {
        public double count;
        public double data;
        public double uncompressedData;
    }

    public static class MessageTraffic {
        public MessageTypes all;
        public MessageTypes realtime;
        public MessageTypes rest;
        public MessageTypes webhook;
    }

    public static class MessageTypes {
        public MessageCategory all;
        public MessageCategory messages;
        public MessageCategory presence;
    }

    public static class ProcessedCount {
        public double failed;
        public double skipped;
        public double succeeded;
    }

    public static class ProcessedMessages {
        public Map<String, ProcessedCount> delta;
    }

    public static class PushedMessages {
        public int directPublishes;
        public int messages;
        public Map<String, Integer> notifications;
    }

    public static class RequestCount {
        public double failed;
        public double refused;
        public double succeeded;
    }

    public static class ResourceCount {
        public double mean;
        public double min;
        public double opened;
        public double peak;
        public double refused;
    }

    public static long fromIntervalId(String str) {
        try {
            return new SimpleDateFormat(intervalFormatString[0].substring(0, str.length())).parse(str).getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static String toIntervalId(long j, Granularity granularity) {
        return new SimpleDateFormat(intervalFormatString[granularity.ordinal()]).format(new Date(j));
    }
}
