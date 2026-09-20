package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vow;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsSkipNext$SkipNextRequest extends AbstractC0269h implements sre0 {
    private static final EsSkipNext$SkipNextRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsContextTrack$ContextTrack track_;

    static {
        EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest = new EsSkipNext$SkipNextRequest();
        DEFAULT_INSTANCE = esSkipNext$SkipNextRequest;
        AbstractC0269h.registerDefaultInstance(EsSkipNext$SkipNextRequest.class, esSkipNext$SkipNextRequest);
    }

    private EsSkipNext$SkipNextRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17993n(EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSkipNext$SkipNextRequest.getClass();
        esSkipNext$SkipNextRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esSkipNext$SkipNextRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m17994o(EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSkipNext$SkipNextRequest.getClass();
        esSkipNext$SkipNextRequest.options_ = esCommandOptions$CommandOptions;
        esSkipNext$SkipNextRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m17995p(EsSkipNext$SkipNextRequest esSkipNext$SkipNextRequest, EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        esSkipNext$SkipNextRequest.getClass();
        esSkipNext$SkipNextRequest.track_ = esContextTrack$ContextTrack;
        esSkipNext$SkipNextRequest.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsSkipNext$SkipNextRequest m17996q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static vow m17997r() {
        return (vow) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "options_", "loggingParams_", "track_"});
        }
        if (iOrdinal == 3) {
            return new EsSkipNext$SkipNextRequest();
        }
        if (iOrdinal == 4) {
            return new vow(DEFAULT_INSTANCE);
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
        synchronized (EsSkipNext$SkipNextRequest.class) {
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
