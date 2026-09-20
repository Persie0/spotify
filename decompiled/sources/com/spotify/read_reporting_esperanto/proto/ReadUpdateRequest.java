package com.spotify.read_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cru0;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ReadUpdateRequest extends AbstractC0269h implements sre0 {
    private static final ReadUpdateRequest DEFAULT_INSTANCE;
    public static final int INTERVAL_FIELD_NUMBER = 2;
    public static final int IS_BACKGROUND_FIELD_NUMBER = 6;
    public static final int IS_VISIBLE_FIELD_NUMBER = 7;
    public static final int MONOTONIC_TIMESTAMP_MS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int WALL_TIMESTAMP_MS_FIELD_NUMBER = 4;
    private int bitField0_;
    private ReadInterval interval_;
    private boolean isBackground_;
    private boolean isVisible_;
    private long monotonicTimestampMs_;
    private gva sessionId_ = gva.f84678b;
    private long wallTimestampMs_;

    static {
        ReadUpdateRequest readUpdateRequest = new ReadUpdateRequest();
        DEFAULT_INSTANCE = readUpdateRequest;
        AbstractC0269h.registerDefaultInstance(ReadUpdateRequest.class, readUpdateRequest);
    }

    private ReadUpdateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20198n(ReadUpdateRequest readUpdateRequest, ReadInterval readInterval) {
        readUpdateRequest.getClass();
        readInterval.getClass();
        readUpdateRequest.interval_ = readInterval;
        readUpdateRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m20199o(ReadUpdateRequest readUpdateRequest, boolean z) {
        readUpdateRequest.bitField0_ |= 2;
        readUpdateRequest.isBackground_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m20200p(ReadUpdateRequest readUpdateRequest, boolean z) {
        readUpdateRequest.bitField0_ |= 4;
        readUpdateRequest.isVisible_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20201q(ReadUpdateRequest readUpdateRequest, long j) {
        readUpdateRequest.monotonicTimestampMs_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static void m20202r(ReadUpdateRequest readUpdateRequest, gva gvaVar) {
        readUpdateRequest.getClass();
        gvaVar.getClass();
        readUpdateRequest.sessionId_ = gvaVar;
    }

    /* JADX INFO: renamed from: s */
    public static void m20203s(ReadUpdateRequest readUpdateRequest, long j) {
        readUpdateRequest.wallTimestampMs_ = j;
    }

    /* JADX INFO: renamed from: t */
    public static cru0 m20204t() {
        return (cru0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\n\u0002ဉ\u0000\u0004\u0002\u0005\u0002\u0006ဇ\u0001\u0007ဇ\u0002", new Object[]{"bitField0_", "sessionId_", "interval_", "wallTimestampMs_", "monotonicTimestampMs_", "isBackground_", "isVisible_"});
        }
        if (iOrdinal == 3) {
            return new ReadUpdateRequest();
        }
        if (iOrdinal == 4) {
            return new cru0(DEFAULT_INSTANCE);
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
        synchronized (ReadUpdateRequest.class) {
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
