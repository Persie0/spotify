package com.spotify.read_reporting_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fqu0;
import p204p.gva;
import p204p.gwu0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ReadEndRequest extends AbstractC0269h implements sre0 {
    private static final ReadEndRequest DEFAULT_INSTANCE;
    public static final int MONOTONIC_TIMESTAMP_MS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_END_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int WALL_TIMESTAMP_MS_FIELD_NUMBER = 2;
    private long monotonicTimestampMs_;
    private int reasonEnd_;
    private gva sessionId_ = gva.f84678b;
    private long wallTimestampMs_;

    static {
        ReadEndRequest readEndRequest = new ReadEndRequest();
        DEFAULT_INSTANCE = readEndRequest;
        AbstractC0269h.registerDefaultInstance(ReadEndRequest.class, readEndRequest);
    }

    private ReadEndRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20180n(ReadEndRequest readEndRequest, long j) {
        readEndRequest.monotonicTimestampMs_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m20181o(ReadEndRequest readEndRequest) {
        readEndRequest.getClass();
        readEndRequest.reasonEnd_ = gwu0.REASON_END_END_READ.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m20182p(ReadEndRequest readEndRequest, gva gvaVar) {
        readEndRequest.getClass();
        gvaVar.getClass();
        readEndRequest.sessionId_ = gvaVar;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20183q(ReadEndRequest readEndRequest, long j) {
        readEndRequest.wallTimestampMs_ = j;
    }

    /* JADX INFO: renamed from: r */
    public static fqu0 m20184r() {
        return (fqu0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\u0002\u0003\u0002\u0004\f", new Object[]{"sessionId_", "wallTimestampMs_", "monotonicTimestampMs_", "reasonEnd_"});
        }
        if (iOrdinal == 3) {
            return new ReadEndRequest();
        }
        if (iOrdinal == 4) {
            return new fqu0(DEFAULT_INSTANCE);
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
        synchronized (ReadEndRequest.class) {
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
