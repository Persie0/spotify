package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xmw;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsPlay$PlayPreparedRequest extends AbstractC0269h implements sre0 {
    private static final EsPlay$PlayPreparedRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 4;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_OPTIONS_FIELD_NUMBER = 2;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsPlayOptions$PlayOptions playOptions_;
    private String sessionId_ = "";

    static {
        EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest = new EsPlay$PlayPreparedRequest();
        DEFAULT_INSTANCE = esPlay$PlayPreparedRequest;
        AbstractC0269h.registerDefaultInstance(EsPlay$PlayPreparedRequest.class, esPlay$PlayPreparedRequest);
    }

    private EsPlay$PlayPreparedRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17785n(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esPlay$PlayPreparedRequest.getClass();
        esPlay$PlayPreparedRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esPlay$PlayPreparedRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m17786o(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esPlay$PlayPreparedRequest.getClass();
        esPlay$PlayPreparedRequest.options_ = esCommandOptions$CommandOptions;
        esPlay$PlayPreparedRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m17787p(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest, EsPlayOptions$PlayOptions esPlayOptions$PlayOptions) {
        esPlay$PlayPreparedRequest.getClass();
        esPlay$PlayPreparedRequest.playOptions_ = esPlayOptions$PlayOptions;
        esPlay$PlayPreparedRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17788q(EsPlay$PlayPreparedRequest esPlay$PlayPreparedRequest, String str) {
        esPlay$PlayPreparedRequest.getClass();
        str.getClass();
        esPlay$PlayPreparedRequest.sessionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static xmw m17789r() {
        return (xmw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002", new Object[]{"bitField0_", "sessionId_", "playOptions_", "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsPlay$PlayPreparedRequest();
        }
        if (iOrdinal == 4) {
            return new xmw(DEFAULT_INSTANCE);
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
        synchronized (EsPlay$PlayPreparedRequest.class) {
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
