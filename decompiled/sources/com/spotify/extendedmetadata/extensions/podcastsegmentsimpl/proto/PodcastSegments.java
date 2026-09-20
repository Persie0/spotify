package com.spotify.extendedmetadata.extensions.podcastsegmentsimpl.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x2q0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PodcastSegments extends AbstractC0269h implements sre0 {
    public static final int ARTISTS_FIELD_NUMBER = 6;
    private static final PodcastSegments DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private ae50 artists_ = AbstractC0269h.emptyProtobufList();

    static {
        PodcastSegments podcastSegments = new PodcastSegments();
        DEFAULT_INSTANCE = podcastSegments;
        AbstractC0269h.registerDefaultInstance(PodcastSegments.class, podcastSegments);
    }

    private PodcastSegments() {
    }

    /* JADX INFO: renamed from: n */
    public static PodcastSegments m10290n(byte[] bArr) {
        return (PodcastSegments) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0001\u0000\u0006Ț", new Object[]{"artists_"});
        }
        if (iOrdinal == 3) {
            return new PodcastSegments();
        }
        if (iOrdinal == 4) {
            return new x2q0(DEFAULT_INSTANCE, 1);
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
        synchronized (PodcastSegments.class) {
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

    public final List getArtistsList() {
        return this.artists_;
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
