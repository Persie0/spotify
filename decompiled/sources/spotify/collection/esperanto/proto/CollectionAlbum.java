package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.AlbumCollectionState;
import com.spotify.cosmos.util.proto.AlbumMetadata;
import com.spotify.cosmos.util.proto.AlbumSyncState;
import p204p.ae50;
import p204p.g0f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionAlbum extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 1;
    public static final int ALBUM_COLLECTION_STATE_FIELD_NUMBER = 3;
    public static final int ALBUM_METADATA_FIELD_NUMBER = 2;
    public static final int ALBUM_SYNC_STATE_FIELD_NUMBER = 4;
    public static final int ALBUM_TYPE_FIELD_NUMBER = 6;
    public static final int DECORATED_FIELD_NUMBER = 5;
    private static final CollectionAlbum DEFAULT_INSTANCE;
    public static final int LINK_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_FIELD_NUMBER = 7;
    private int addTime_;
    private AlbumCollectionState albumCollectionState_;
    private AlbumMetadata albumMetadata_;
    private AlbumSyncState albumSyncState_;
    private int bitField0_;
    private boolean decorated_;
    private String albumType_ = "";
    private ae50 track_ = AbstractC0269h.emptyProtobufList();
    private String link_ = "";

    static {
        CollectionAlbum collectionAlbum = new CollectionAlbum();
        DEFAULT_INSTANCE = collectionAlbum;
        AbstractC0269h.registerDefaultInstance(CollectionAlbum.class, collectionAlbum);
    }

    private CollectionAlbum() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static CollectionAlbum m97440r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\u000b\b\u0000\u0001\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0007\u0006Ȉ\u0007\u001b\u000bȈ", new Object[]{"bitField0_", "addTime_", "albumMetadata_", "albumCollectionState_", "albumSyncState_", "decorated_", "albumType_", "track_", CollectionTrack.class, "link_"});
        }
        if (iOrdinal == 3) {
            return new CollectionAlbum();
        }
        if (iOrdinal == 4) {
            return new g0f();
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
        synchronized (CollectionAlbum.class) {
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
    public final AlbumMetadata m97441o() {
        AlbumMetadata albumMetadata = this.albumMetadata_;
        return albumMetadata == null ? AlbumMetadata.getDefaultInstance() : albumMetadata;
    }

    /* JADX INFO: renamed from: p */
    public final AlbumSyncState m97442p() {
        AlbumSyncState albumSyncState = this.albumSyncState_;
        return albumSyncState == null ? AlbumSyncState.getDefaultInstance() : albumSyncState;
    }

    /* JADX INFO: renamed from: q */
    public final String m97443q() {
        return this.albumType_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
