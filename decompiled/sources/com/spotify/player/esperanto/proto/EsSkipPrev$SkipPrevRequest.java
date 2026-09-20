package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wow;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsSkipPrev$SkipPrevRequest extends AbstractC0269h implements sre0 {
    public static final int ALLOW_SEEKING_FIELD_NUMBER = 2;
    private static final EsSkipPrev$SkipPrevRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 4;
    private boolean allowSeeking_;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsContextTrack$ContextTrack track_;

    static {
        EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest = new EsSkipPrev$SkipPrevRequest();
        DEFAULT_INSTANCE = esSkipPrev$SkipPrevRequest;
        AbstractC0269h.registerDefaultInstance(EsSkipPrev$SkipPrevRequest.class, esSkipPrev$SkipPrevRequest);
    }

    private EsSkipPrev$SkipPrevRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17998n(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest, boolean z) {
        esSkipPrev$SkipPrevRequest.allowSeeking_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m17999o(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSkipPrev$SkipPrevRequest.getClass();
        esSkipPrev$SkipPrevRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esSkipPrev$SkipPrevRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m18000p(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSkipPrev$SkipPrevRequest.getClass();
        esSkipPrev$SkipPrevRequest.options_ = esCommandOptions$CommandOptions;
        esSkipPrev$SkipPrevRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m18001q(EsSkipPrev$SkipPrevRequest esSkipPrev$SkipPrevRequest, EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        esSkipPrev$SkipPrevRequest.getClass();
        esSkipPrev$SkipPrevRequest.track_ = esContextTrack$ContextTrack;
        esSkipPrev$SkipPrevRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: r */
    public static wow m18002r() {
        return (wow) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "options_", "allowSeeking_", "loggingParams_", "track_"});
        }
        if (iOrdinal == 3) {
            return new EsSkipPrev$SkipPrevRequest();
        }
        if (iOrdinal == 4) {
            return new wow(DEFAULT_INSTANCE);
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
        synchronized (EsSkipPrev$SkipPrevRequest.class) {
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
