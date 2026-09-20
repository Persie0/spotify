package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ore0;
import p204p.p361;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class SummaryRequest extends AbstractC0269h implements sre0 {
    private static final SummaryRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    public static final int TIME_ZONE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String timeZone_ = "";
    private Timestamp timestamp_;

    static {
        SummaryRequest summaryRequest = new SummaryRequest();
        DEFAULT_INSTANCE = summaryRequest;
        AbstractC0269h.registerDefaultInstance(SummaryRequest.class, summaryRequest);
    }

    private SummaryRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11686n(SummaryRequest summaryRequest, String str) {
        summaryRequest.getClass();
        summaryRequest.timeZone_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11687o(SummaryRequest summaryRequest, Timestamp timestamp) {
        summaryRequest.getClass();
        summaryRequest.timestamp_ = timestamp;
        summaryRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static p361 m11688p() {
        return (p361) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ", new Object[]{"bitField0_", "timestamp_", "timeZone_"});
        }
        if (iOrdinal == 3) {
            return new SummaryRequest();
        }
        if (iOrdinal == 4) {
            return new p361(DEFAULT_INSTANCE);
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
        synchronized (SummaryRequest.class) {
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
