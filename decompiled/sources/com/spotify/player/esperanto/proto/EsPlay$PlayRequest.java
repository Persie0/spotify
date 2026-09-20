package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ymw;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsPlay$PlayRequest extends AbstractC0269h implements sre0 {
    private static final EsPlay$PlayRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 4;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_OPTIONS_FIELD_NUMBER = 2;
    public static final int PREPARE_PLAY_REQUEST_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsPlayOptions$PlayOptions playOptions_;
    private EsPreparePlay$PreparePlayRequest preparePlayRequest_;

    static {
        EsPlay$PlayRequest esPlay$PlayRequest = new EsPlay$PlayRequest();
        DEFAULT_INSTANCE = esPlay$PlayRequest;
        AbstractC0269h.registerDefaultInstance(EsPlay$PlayRequest.class, esPlay$PlayRequest);
    }

    private EsPlay$PlayRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17790n(EsPlay$PlayRequest esPlay$PlayRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esPlay$PlayRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esPlay$PlayRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esPlay$PlayRequest.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: o */
    public static void m17791o(EsPlay$PlayRequest esPlay$PlayRequest, EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
        esPlay$PlayRequest.getClass();
        esPlayOptions$PlayOptions.getClass();
        esPlay$PlayRequest.playOptions_ = esPlayOptions$PlayOptions;
        esPlay$PlayRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m17792p(EsPlay$PlayRequest esPlay$PlayRequest, EsPreparePlay$PreparePlayRequest esPreparePlay$PreparePlayRequest) {
        esPlay$PlayRequest.getClass();
        esPreparePlay$PreparePlayRequest.getClass();
        esPlay$PlayRequest.preparePlayRequest_ = esPreparePlay$PreparePlayRequest;
        esPlay$PlayRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ymw m17793q() {
        return (ymw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "preparePlayRequest_", "playOptions_", "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsPlay$PlayRequest();
        }
        if (iOrdinal == 4) {
            return new ymw(DEFAULT_INSTANCE);
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
        synchronized (EsPlay$PlayRequest.class) {
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
