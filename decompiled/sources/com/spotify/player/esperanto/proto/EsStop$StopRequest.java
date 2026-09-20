package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yow;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsStop$StopRequest extends AbstractC0269h implements sre0 {
    private static final EsStop$StopRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REASON_FIELD_NUMBER = 2;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private int reason_;

    static {
        EsStop$StopRequest esStop$StopRequest = new EsStop$StopRequest();
        DEFAULT_INSTANCE = esStop$StopRequest;
        AbstractC0269h.registerDefaultInstance(EsStop$StopRequest.class, esStop$StopRequest);
    }

    private EsStop$StopRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18020n(EsStop$StopRequest esStop$StopRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esStop$StopRequest.getClass();
        esStop$StopRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esStop$StopRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static EsStop$StopRequest m18021o() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static yow m18022p() {
        return (yow) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001", new Object[]{"bitField0_", "options_", "reason_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsStop$StopRequest();
        }
        if (iOrdinal == 4) {
            return new yow(DEFAULT_INSTANCE);
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
        synchronized (EsStop$StopRequest.class) {
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
