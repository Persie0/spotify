package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.how;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsResume$ResumeRequest extends AbstractC0269h implements sre0 {
    private static final EsResume$ResumeRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RESUME_ORIGIN_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsPauseresumeOrigin$PauseResumeOrigin resumeOrigin_;

    static {
        EsResume$ResumeRequest esResume$ResumeRequest = new EsResume$ResumeRequest();
        DEFAULT_INSTANCE = esResume$ResumeRequest;
        AbstractC0269h.registerDefaultInstance(EsResume$ResumeRequest.class, esResume$ResumeRequest);
    }

    private EsResume$ResumeRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17950n(EsResume$ResumeRequest esResume$ResumeRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esResume$ResumeRequest.getClass();
        esResume$ResumeRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esResume$ResumeRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m17951o(EsResume$ResumeRequest esResume$ResumeRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esResume$ResumeRequest.getClass();
        esCommandOptions$CommandOptions.getClass();
        esResume$ResumeRequest.options_ = esCommandOptions$CommandOptions;
        esResume$ResumeRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m17952p(EsResume$ResumeRequest esResume$ResumeRequest, EsPauseresumeOrigin$PauseResumeOrigin esPauseresumeOrigin$PauseResumeOrigin) {
        esResume$ResumeRequest.getClass();
        esPauseresumeOrigin$PauseResumeOrigin.getClass();
        esResume$ResumeRequest.resumeOrigin_ = esPauseresumeOrigin$PauseResumeOrigin;
        esResume$ResumeRequest.bitField0_ |= 4;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static how m17953q() {
        return (how) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "options_", "loggingParams_", "resumeOrigin_"});
        }
        if (iOrdinal == 3) {
            return new EsResume$ResumeRequest();
        }
        if (iOrdinal == 4) {
            return new how(DEFAULT_INSTANCE);
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
        synchronized (EsResume$ResumeRequest.class) {
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
