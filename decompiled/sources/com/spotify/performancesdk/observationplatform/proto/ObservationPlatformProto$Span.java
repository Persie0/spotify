package com.spotify.performancesdk.observationplatform.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kok0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ObservationPlatformProto$Span extends AbstractC0269h implements sre0 {
    private static final ObservationPlatformProto$Span DEFAULT_INSTANCE;
    public static final int END_TIME_NS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SPAN_KEY_FIELD_NUMBER = 1;
    public static final int START_TIME_NS_FIELD_NUMBER = 2;
    private long endTimeNs_;
    private String spanKey_ = "";
    private long startTimeNs_;

    static {
        ObservationPlatformProto$Span observationPlatformProto$Span = new ObservationPlatformProto$Span();
        DEFAULT_INSTANCE = observationPlatformProto$Span;
        AbstractC0269h.registerDefaultInstance(ObservationPlatformProto$Span.class, observationPlatformProto$Span);
    }

    private ObservationPlatformProto$Span() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17336n(ObservationPlatformProto$Span observationPlatformProto$Span, long j) {
        observationPlatformProto$Span.endTimeNs_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m17337o(ObservationPlatformProto$Span observationPlatformProto$Span, String str) {
        observationPlatformProto$Span.getClass();
        str.getClass();
        observationPlatformProto$Span.spanKey_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m17338p(ObservationPlatformProto$Span observationPlatformProto$Span, long j) {
        observationPlatformProto$Span.startTimeNs_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static kok0 m17339q() {
        return (kok0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002", new Object[]{"spanKey_", "startTimeNs_", "endTimeNs_"});
        }
        if (iOrdinal == 3) {
            return new ObservationPlatformProto$Span();
        }
        if (iOrdinal == 4) {
            return new kok0(DEFAULT_INSTANCE);
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
        synchronized (ObservationPlatformProto$Span.class) {
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
