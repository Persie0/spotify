package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.cosmos.util.proto.ArtistMetadata;
import com.spotify.cosmos.util.proto.ArtistSyncState;
import p204p.ae50;
import p204p.i0f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionArtist extends AbstractC0269h implements sre0 {
    public static final int ALBUM_FIELD_NUMBER = 5;
    public static final int ARTIST_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int ARTIST_METADATA_FIELD_NUMBER = 1;
    public static final int ARTIST_SYNC_STATE_FIELD_NUMBER = 3;
    public static final int DECORATED_FIELD_NUMBER = 4;
    private static final CollectionArtist DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER;
    private ArtistCollectionState artistCollectionState_;
    private ArtistMetadata artistMetadata_;
    private ArtistSyncState artistSyncState_;
    private int bitField0_;
    private boolean decorated_;
    private ae50 album_ = AbstractC0269h.emptyProtobufList();
    private String link_ = "";

    static {
        CollectionArtist collectionArtist = new CollectionArtist();
        DEFAULT_INSTANCE = collectionArtist;
        AbstractC0269h.registerDefaultInstance(CollectionArtist.class, collectionArtist);
    }

    private CollectionArtist() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static CollectionArtist m97450s() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0007\u0005\u001b\u0006Ȉ", new Object[]{"bitField0_", "artistMetadata_", "artistCollectionState_", "artistSyncState_", "decorated_", "album_", CollectionAlbum.class, "link_"});
        }
        if (iOrdinal == 3) {
            return new CollectionArtist();
        }
        if (iOrdinal == 4) {
            return new i0f();
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
        synchronized (CollectionArtist.class) {
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
    public final ae50 m97451o() {
        return this.album_;
    }

    /* JADX INFO: renamed from: p */
    public final ArtistCollectionState m97452p() {
        ArtistCollectionState artistCollectionState = this.artistCollectionState_;
        return artistCollectionState == null ? ArtistCollectionState.getDefaultInstance() : artistCollectionState;
    }

    /* JADX INFO: renamed from: q */
    public final ArtistMetadata m97453q() {
        ArtistMetadata artistMetadata = this.artistMetadata_;
        return artistMetadata == null ? ArtistMetadata.getDefaultInstance() : artistMetadata;
    }

    /* JADX INFO: renamed from: r */
    public final ArtistSyncState m97454r() {
        ArtistSyncState artistSyncState = this.artistSyncState_;
        return artistSyncState == null ? ArtistSyncState.getDefaultInstance() : artistSyncState;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
