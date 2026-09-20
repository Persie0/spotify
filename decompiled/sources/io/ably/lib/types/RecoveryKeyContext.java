package io.ably.lib.types;

import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Map;
import p204p.qtz0;
import p204p.tx8;

/* JADX INFO: loaded from: classes16.dex */
public class RecoveryKeyContext {
    private static final String TAG = "RecoveryKeyContext";
    private final Map<String, String> channelSerials;
    private final String connectionKey;
    private final long msgSerial;

    public RecoveryKeyContext(String str, long j, Map<String, String> map) {
        HashMap map2 = new HashMap();
        this.channelSerials = map2;
        this.connectionKey = str;
        this.msgSerial = j;
        map2.putAll(map);
    }

    public static RecoveryKeyContext decode(String str) {
        try {
            return (RecoveryKeyContext) qtz0.f192515b.fromJson(str, RecoveryKeyContext.class);
        } catch (JsonSyntaxException e) {
            tx8.m81889d(TAG, "Cannot create recovery key from json: " + e.getMessage());
            return null;
        }
    }

    public String encode() {
        return qtz0.f192515b.toJson(this);
    }

    public Map<String, String> getChannelSerials() {
        return this.channelSerials;
    }

    public String getConnectionKey() {
        return this.connectionKey;
    }

    public long getMsgSerial() {
        return this.msgSerial;
    }
}
