package com.spotify.player.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vlw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsQueue$Queue extends AbstractC0269h implements sre0 {
    private static final EsQueue$Queue DEFAULT_INSTANCE;
    public static final int NEXT_TRACKS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PREV_TRACKS_FIELD_NUMBER = 4;
    public static final int QUEUE_REVISION_FIELD_NUMBER = 1;
    public static final int TRACK_FIELD_NUMBER = 2;
    private int bitField0_;
    private ae50 nextTracks_ = AbstractC0269h.emptyProtobufList();
    private ae50 prevTracks_ = AbstractC0269h.emptyProtobufList();
    private long queueRevision_;
    private EsProvidedTrack$ProvidedTrack track_;

    static {
        EsQueue$Queue esQueue$Queue = new EsQueue$Queue();
        DEFAULT_INSTANCE = esQueue$Queue;
        AbstractC0269h.registerDefaultInstance(EsQueue$Queue.class, esQueue$Queue);
    }

    private EsQueue$Queue() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: v */
    public static EsQueue$Queue m17853v(byte[] bArr) {
        return (EsQueue$Queue) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0003\u0002ဉ\u0000\u0003\u001b\u0004\u001b", new Object[]{"bitField0_", "queueRevision_", "track_", "nextTracks_", EsProvidedTrack$ProvidedTrack.class, "prevTracks_", EsProvidedTrack$ProvidedTrack.class});
        }
        if (iOrdinal == 3) {
            return new EsQueue$Queue();
        }
        if (iOrdinal == 4) {
            return new vlw(28);
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
        synchronized (EsQueue$Queue.class) {
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

    /* JADX INFO: renamed from: o */
    public final int m17854o() {
        return this.nextTracks_.size();
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m17855p() {
        return this.nextTracks_;
    }

    /* JADX INFO: renamed from: q */
    public final int m17856q() {
        return this.prevTracks_.size();
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m17857r() {
        return this.prevTracks_;
    }

    /* JADX INFO: renamed from: s */
    public final long m17858s() {
        return this.queueRevision_;
    }

    /* JADX INFO: renamed from: t */
    public final EsProvidedTrack$ProvidedTrack m17859t() {
        EsProvidedTrack$ProvidedTrack esProvidedTrack$ProvidedTrack = this.track_;
        return esProvidedTrack$ProvidedTrack == null ? EsProvidedTrack$ProvidedTrack.m17848r() : esProvidedTrack$ProvidedTrack;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m17860u() {
        return (this.bitField0_ & 1) != 0;
    }
}
