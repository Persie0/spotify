package com.spotify.recently_played_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.cosmos.util.proto.ArtistMetadata;
import com.spotify.cosmos.util.proto.ArtistSyncState;
import p204p.k2v0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class RecentlyPlayedArtist extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 5;
    public static final int ARTIST_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int ARTIST_METADATA_FIELD_NUMBER = 1;
    public static final int ARTIST_SYNC_STATE_FIELD_NUMBER = 3;
    private static final RecentlyPlayedArtist DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    public static final int TYPE_STR_FIELD_NUMBER = 6;
    private int addTime_;
    private ArtistCollectionState artistCollectionState_;
    private ArtistMetadata artistMetadata_;
    private ArtistSyncState artistSyncState_;
    private int bitField0_;
    private String typeStr_ = "";
    private int type_;

    static {
        RecentlyPlayedArtist recentlyPlayedArtist = new RecentlyPlayedArtist();
        DEFAULT_INSTANCE = recentlyPlayedArtist;
        AbstractC0269h.registerDefaultInstance(RecentlyPlayedArtist.class, recentlyPlayedArtist);
    }

    private RecentlyPlayedArtist() {
    }

    /* JADX INFO: renamed from: o */
    public static RecentlyPlayedArtist m20248o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u000b\u0005\u000b\u0006Ȉ", new Object[]{"bitField0_", "artistMetadata_", "artistCollectionState_", "artistSyncState_", "type_", "addTime_", "typeStr_"});
        }
        if (iOrdinal == 3) {
            return new RecentlyPlayedArtist();
        }
        if (iOrdinal == 4) {
            return new k2v0(DEFAULT_INSTANCE);
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
        synchronized (RecentlyPlayedArtist.class) {
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
    public final ArtistMetadata m20249n() {
        ArtistMetadata artistMetadata = this.artistMetadata_;
        return artistMetadata == null ? ArtistMetadata.getDefaultInstance() : artistMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m20250p() {
        return this.typeStr_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
