package com.spotify.artistfacts.p023v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vev0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ReleaseFacts extends AbstractC0269h implements sre0 {
    private static final ReleaseFacts DEFAULT_INSTANCE;
    public static final int EARLIEST_SPOTIFY_INGESTION_DATE_FIELD_NUMBER = 3;
    public static final int EARLIEST_SPOTIFY_RELEASE_DATE_FIELD_NUMBER = 1;
    public static final int NUM_RELEASES_ON_SPOTIFY_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private long numReleasesOnSpotify_;
    private String earliestSpotifyReleaseDate_ = "";
    private String earliestSpotifyIngestionDate_ = "";

    static {
        ReleaseFacts releaseFacts = new ReleaseFacts();
        DEFAULT_INSTANCE = releaseFacts;
        AbstractC0269h.registerDefaultInstance(ReleaseFacts.class, releaseFacts);
    }

    private ReleaseFacts() {
    }

    /* JADX INFO: renamed from: n */
    public static ReleaseFacts m3321n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ", new Object[]{"earliestSpotifyReleaseDate_", "numReleasesOnSpotify_", "earliestSpotifyIngestionDate_"});
        }
        if (iOrdinal == 3) {
            return new ReleaseFacts();
        }
        if (iOrdinal == 4) {
            return new vev0(DEFAULT_INSTANCE, 28);
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
        synchronized (ReleaseFacts.class) {
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
    public final String m3322o() {
        return this.earliestSpotifyReleaseDate_;
    }

    /* JADX INFO: renamed from: p */
    public final long m3323p() {
        return this.numReleasesOnSpotify_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
