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
import p204p.row;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class EsSetQueueRequest$SetQueueRequest extends AbstractC0269h implements sre0 {
    private static final EsSetQueueRequest$SetQueueRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER = 5;
    public static final int NEXT_TRACKS_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PREV_TRACKS_FIELD_NUMBER = 2;
    public static final int QUEUE_REVISION_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private long queueRevision_;
    private ae50 nextTracks_ = AbstractC0269h.emptyProtobufList();
    private ae50 prevTracks_ = AbstractC0269h.emptyProtobufList();

    static {
        EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest = new EsSetQueueRequest$SetQueueRequest();
        DEFAULT_INSTANCE = esSetQueueRequest$SetQueueRequest;
        AbstractC0269h.registerDefaultInstance(EsSetQueueRequest$SetQueueRequest.class, esSetQueueRequest$SetQueueRequest);
    }

    private EsSetQueueRequest$SetQueueRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m17969n(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, ArrayList arrayList) {
        ae50 ae50Var = esSetQueueRequest$SetQueueRequest.nextTracks_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esSetQueueRequest$SetQueueRequest.nextTracks_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, esSetQueueRequest$SetQueueRequest.nextTracks_);
    }

    /* JADX INFO: renamed from: o */
    public static void m17970o(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, ArrayList arrayList) {
        ae50 ae50Var = esSetQueueRequest$SetQueueRequest.prevTracks_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esSetQueueRequest$SetQueueRequest.prevTracks_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, esSetQueueRequest$SetQueueRequest.prevTracks_);
    }

    /* JADX INFO: renamed from: p */
    public static void m17971p(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, EsLoggingParams$LoggingParams esLoggingParams$LoggingParams) {
        esSetQueueRequest$SetQueueRequest.getClass();
        esSetQueueRequest$SetQueueRequest.loggingParams_ = esLoggingParams$LoggingParams;
        esSetQueueRequest$SetQueueRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m17972q(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, EsCommandOptions$CommandOptions esCommandOptions$CommandOptions) {
        esSetQueueRequest$SetQueueRequest.getClass();
        esSetQueueRequest$SetQueueRequest.options_ = esCommandOptions$CommandOptions;
        esSetQueueRequest$SetQueueRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m17973r(EsSetQueueRequest$SetQueueRequest esSetQueueRequest$SetQueueRequest, long j) {
        esSetQueueRequest$SetQueueRequest.queueRevision_ = j;
    }

    /* JADX INFO: renamed from: s */
    public static row m17974s() {
        return (row) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u0003\u0004ဉ\u0000\u0005ဉ\u0001", new Object[]{"bitField0_", "nextTracks_", EsProvidedTrack$ProvidedTrack.class, "prevTracks_", EsProvidedTrack$ProvidedTrack.class, "queueRevision_", "options_", "loggingParams_"});
        }
        if (iOrdinal == 3) {
            return new EsSetQueueRequest$SetQueueRequest();
        }
        if (iOrdinal == 4) {
            return new row(DEFAULT_INSTANCE);
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
        synchronized (EsSetQueueRequest$SetQueueRequest.class) {
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
