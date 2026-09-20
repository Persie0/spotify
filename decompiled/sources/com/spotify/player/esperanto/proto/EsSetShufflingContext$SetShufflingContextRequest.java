package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sow;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsSetShufflingContext$SetShufflingContextRequest extends AbstractC0269h implements sre0 {
    private static final EsSetShufflingContext$SetShufflingContextRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private boolean shufflingContext_;

    static {
        EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest = new EsSetShufflingContext$SetShufflingContextRequest();
        DEFAULT_INSTANCE = esSetShufflingContext$SetShufflingContextRequest;
        AbstractC0269h.registerDefaultInstance(EsSetShufflingContext$SetShufflingContextRequest.class, esSetShufflingContext$SetShufflingContextRequest);
    }

    private EsSetShufflingContext$SetShufflingContextRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17975n(EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSetShufflingContext$SetShufflingContextRequest.getClass();
        esSetShufflingContext$SetShufflingContextRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esSetShufflingContext$SetShufflingContextRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m17976o(EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSetShufflingContext$SetShufflingContextRequest.getClass();
        esSetShufflingContext$SetShufflingContextRequest.options_ = esCommandOptions$CommandOptions;
        esSetShufflingContext$SetShufflingContextRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m17977p(EsSetShufflingContext$SetShufflingContextRequest esSetShufflingContext$SetShufflingContextRequest, boolean z) {
        esSetShufflingContext$SetShufflingContextRequest.shufflingContext_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static sow m17978q() {
        return (sow) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "shufflingContext_", "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsSetShufflingContext$SetShufflingContextRequest();
        }
        if (iOrdinal == 4) {
            return new sow(DEFAULT_INSTANCE);
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
        synchronized (EsSetShufflingContext$SetShufflingContextRequest.class) {
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
