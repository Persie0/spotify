package com.spotify.p010ad.detection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDetectionOuterClass$UserTimestamp extends AbstractC0269h implements sre0 {
    private static final AdDetectionOuterClass$UserTimestamp DEFAULT_INSTANCE;
    public static final int IS_FALLBACK_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int USER_TIMESTAMP_MS_FIELD_NUMBER = 1;
    private boolean isFallback_;
    private int userTimestampMs_;

    static {
        AdDetectionOuterClass$UserTimestamp adDetectionOuterClass$UserTimestamp = new AdDetectionOuterClass$UserTimestamp();
        DEFAULT_INSTANCE = adDetectionOuterClass$UserTimestamp;
        AbstractC0269h.registerDefaultInstance(AdDetectionOuterClass$UserTimestamp.class, adDetectionOuterClass$UserTimestamp);
    }

    private AdDetectionOuterClass$UserTimestamp() {
    }

    /* JADX INFO: renamed from: n */
    public static AdDetectionOuterClass$UserTimestamp m2306n() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0007", new Object[]{"userTimestampMs_", "isFallback_"});
        }
        if (iOrdinal == 3) {
            return new AdDetectionOuterClass$UserTimestamp();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 26);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        r2n0 r2n0Var = PARSER;
        if (r2n0Var != null) {
            return r2n0Var;
        }
        synchronized (AdDetectionOuterClass$UserTimestamp.class) {
            try {
                r110Var = PARSER;
                if (r110Var == null) {
                    r110Var = new r110(DEFAULT_INSTANCE);
                    PARSER = r110Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r110Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2307o() {
        return this.isFallback_;
    }

    /* JADX INFO: renamed from: p */
    public final int m2308p() {
        return this.userTimestampMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
