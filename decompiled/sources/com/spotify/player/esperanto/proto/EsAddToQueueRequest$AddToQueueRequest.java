package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ohw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsAddToQueueRequest$AddToQueueRequest extends AbstractC0269h implements sre0 {
    private static final EsAddToQueueRequest$AddToQueueRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsContextTrack$ContextTrack track_;

    static {
        EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest = new EsAddToQueueRequest$AddToQueueRequest();
        DEFAULT_INSTANCE = esAddToQueueRequest$AddToQueueRequest;
        AbstractC0269h.registerDefaultInstance(EsAddToQueueRequest$AddToQueueRequest.class, esAddToQueueRequest$AddToQueueRequest);
    }

    private EsAddToQueueRequest$AddToQueueRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17660n(EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esAddToQueueRequest$AddToQueueRequest.getClass();
        esAddToQueueRequest$AddToQueueRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esAddToQueueRequest$AddToQueueRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m17661o(EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esAddToQueueRequest$AddToQueueRequest.getClass();
        esAddToQueueRequest$AddToQueueRequest.options_ = esCommandOptions$CommandOptions;
        esAddToQueueRequest$AddToQueueRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m17662p(EsAddToQueueRequest$AddToQueueRequest esAddToQueueRequest$AddToQueueRequest, EsContextTrack$ContextTrack esContextTrack$ContextTrack) {
        esAddToQueueRequest$AddToQueueRequest.getClass();
        esAddToQueueRequest$AddToQueueRequest.track_ = esContextTrack$ContextTrack;
        esAddToQueueRequest$AddToQueueRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ohw m17663q() {
        return (ohw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "track_", "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsAddToQueueRequest$AddToQueueRequest();
        }
        if (iOrdinal == 4) {
            return new ohw(DEFAULT_INSTANCE);
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
        synchronized (EsAddToQueueRequest$AddToQueueRequest.class) {
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
