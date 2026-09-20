package com.spotify.songdna.artistfacts.p153v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qw5;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class ArtistFacts extends AbstractC0269h implements sre0 {
    public static final int COLLABORATOR_COUNT_FIELD_NUMBER = 1;
    private static final ArtistFacts DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_COUNT_FIELD_NUMBER = 2;
    private long collaboratorCount_;
    private long trackCount_;

    static {
        ArtistFacts artistFacts = new ArtistFacts();
        DEFAULT_INSTANCE = artistFacts;
        AbstractC0269h.registerDefaultInstance(ArtistFacts.class, artistFacts);
    }

    private ArtistFacts() {
    }

    /* JADX INFO: renamed from: p */
    public static ArtistFacts m21470p(byte[] bArr) {
        return (ArtistFacts) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0002", new Object[]{"collaboratorCount_", "trackCount_"});
        }
        if (iOrdinal == 3) {
            return new ArtistFacts();
        }
        if (iOrdinal == 4) {
            return new qw5(DEFAULT_INSTANCE, 0);
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
        synchronized (ArtistFacts.class) {
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

    /* JADX INFO: renamed from: n */
    public final long m21471n() {
        return this.collaboratorCount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m21472o() {
        return this.trackCount_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
