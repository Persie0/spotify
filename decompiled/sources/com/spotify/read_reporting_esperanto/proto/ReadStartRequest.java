package com.spotify.read_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bru0;
import p204p.hwu0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ReadStartRequest extends AbstractC0269h implements sre0 {
    public static final int CONTENT_URI_FIELD_NUMBER = 1;
    private static final ReadStartRequest DEFAULT_INSTANCE;
    public static final int INTERVAL_FIELD_NUMBER = 2;
    public static final int IS_VISIBLE_FIELD_NUMBER = 8;
    public static final int MONOTONIC_TIMESTAMP_MS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_START_FIELD_NUMBER = 6;
    public static final int TOTAL_LENGTH_FIELD_NUMBER = 7;
    public static final int WALL_TIMESTAMP_MS_FIELD_NUMBER = 4;
    private int bitField0_;
    private String contentUri_ = "";
    private ReadInterval interval_;
    private boolean isVisible_;
    private long monotonicTimestampMs_;
    private int reasonStart_;
    private long totalLength_;
    private long wallTimestampMs_;

    static {
        ReadStartRequest readStartRequest = new ReadStartRequest();
        DEFAULT_INSTANCE = readStartRequest;
        AbstractC0269h.registerDefaultInstance(ReadStartRequest.class, readStartRequest);
    }

    private ReadStartRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20188n(ReadStartRequest readStartRequest, String str) {
        readStartRequest.getClass();
        str.getClass();
        readStartRequest.contentUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m20189o(ReadStartRequest readStartRequest, ReadInterval readInterval) {
        readStartRequest.getClass();
        readInterval.getClass();
        readStartRequest.interval_ = readInterval;
        readStartRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m20190p(ReadStartRequest readStartRequest, boolean z) {
        readStartRequest.bitField0_ |= 2;
        readStartRequest.isVisible_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20191q(ReadStartRequest readStartRequest, long j) {
        readStartRequest.monotonicTimestampMs_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m20192r(ReadStartRequest readStartRequest) {
        readStartRequest.getClass();
        readStartRequest.reasonStart_ = hwu0.REASON_START_OPEN.getNumber();
    }

    /* JADX INFO: renamed from: s */
    public static void m20193s(ReadStartRequest readStartRequest, long j) {
        readStartRequest.wallTimestampMs_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static bru0 m20194t() {
        return (bru0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0004\u0002\u0005\u0002\u0006\f\u0007\u0002\bဇ\u0001", new Object[]{"bitField0_", "contentUri_", "interval_", "wallTimestampMs_", "monotonicTimestampMs_", "reasonStart_", "totalLength_", "isVisible_"});
        }
        if (iOrdinal == 3) {
            return new ReadStartRequest();
        }
        if (iOrdinal == 4) {
            return new bru0(DEFAULT_INSTANCE);
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
        synchronized (ReadStartRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
