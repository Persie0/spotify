package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zmw;

/* JADX INFO: loaded from: classes9.dex */
public final class EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest extends AbstractC0269h implements sre0 {
    private static final EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TRACKS_FIELD_NUMBER = 1;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private ae50 tracks_ = AbstractC0269h.emptyProtobufList();

    static {
        EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest = new EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest();
        DEFAULT_INSTANCE = esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest;
        AbstractC0269h.registerDefaultInstance(EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.class, esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest);
    }

    private EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17794n(EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest, ArrayList arrayList) {
        ae50 ae50Var = esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.tracks_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.tracks_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.tracks_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17795o(EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.getClass();
        esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m17796p(EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.getClass();
        esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.options_ = esCommandOptions$CommandOptions;
        esPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static zmw m17797q() {
        return (zmw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "tracks_", EsContextTrack$ContextTrack.class, "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest();
        }
        if (iOrdinal == 4) {
            return new zmw(DEFAULT_INSTANCE);
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
        synchronized (EsPlayAsNextInQueueRequest$PlayAsNextInQueueRequest.class) {
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
