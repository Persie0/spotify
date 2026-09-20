package io.ably.lib.types;

import java.io.UnsupportedEncodingException;
import p204p.qtz0;
import p204p.ug30;

/* JADX INFO: loaded from: classes16.dex */
public class StatsReader {
    public static ug30 statsResponseHandler = new ug30() { // from class: io.ably.lib.types.StatsReader.1
        /* JADX INFO: renamed from: handleResponseBody, reason: merged with bridge method [inline-methods] */
        public Stats[] m98362handleResponseBody(String str, byte[] bArr) {
            if ("application/json".equals(str)) {
                return StatsReader.readJson(bArr);
            }
            return null;
        }
    };

    public static Stats[] readJson(byte[] bArr) throws AblyException {
        try {
            return readJson(new String(bArr, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw AblyException.fromThrowable(e);
        }
    }

    public static Stats[] readJson(String str) {
        return (Stats[]) qtz0.f192515b.fromJson(str, Stats[].class);
    }
}
