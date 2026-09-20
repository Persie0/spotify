package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tow;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsSignalRequest$SignalRequest extends AbstractC0269h implements sre0 {
    private static final EsSignalRequest$SignalRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 4;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNAL_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private String signalId_ = "";
    private String parameters_ = "";

    static {
        EsSignalRequest$SignalRequest esSignalRequest$SignalRequest = new EsSignalRequest$SignalRequest();
        DEFAULT_INSTANCE = esSignalRequest$SignalRequest;
        AbstractC0269h.registerDefaultInstance(EsSignalRequest$SignalRequest.class, esSignalRequest$SignalRequest);
    }

    private EsSignalRequest$SignalRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17989n(EsSignalRequest$SignalRequest esSignalRequest$SignalRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSignalRequest$SignalRequest.getClass();
        esLoggingParams$LoggingParams.getClass();
        esSignalRequest$SignalRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esSignalRequest$SignalRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m17990o(EsSignalRequest$SignalRequest esSignalRequest$SignalRequest, String str) {
        esSignalRequest$SignalRequest.getClass();
        esSignalRequest$SignalRequest.parameters_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m17991p(EsSignalRequest$SignalRequest esSignalRequest$SignalRequest, String str) {
        esSignalRequest$SignalRequest.getClass();
        str.getClass();
        esSignalRequest$SignalRequest.signalId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static tow m17992q() {
        return (tow) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "signalId_", "parameters_", "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsSignalRequest$SignalRequest();
        }
        if (iOrdinal == 4) {
            return new tow(DEFAULT_INSTANCE);
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
        synchronized (EsSignalRequest$SignalRequest.class) {
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
