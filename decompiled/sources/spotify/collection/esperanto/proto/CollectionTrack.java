package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.ArtistCollectionState;
import com.spotify.cosmos.util.proto.TrackCollectionState;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.cosmos.util.proto.TrackPlayState;
import com.spotify.cosmos.util.proto.TrackSyncState;
import p204p.ae50;
import p204p.b6f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionTrack extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 2;
    public static final int ALBUM_FIELD_NUMBER = 8;
    public static final int ARTIST_COLLECTION_STATE_FIELD_NUMBER = 11;
    public static final int COVER_FIELD_NUMBER = 9;
    public static final int DECORATED_FIELD_NUMBER = 7;
    private static final CollectionTrack DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER = 1;
    public static final int LINK_FIELD_NUMBER = 10;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_COLLECTION_STATE_FIELD_NUMBER = 4;
    public static final int TRACK_METADATA_FIELD_NUMBER = 3;
    public static final int TRACK_PLAY_STATE_FIELD_NUMBER = 5;
    public static final int TRACK_SYNC_STATE_FIELD_NUMBER = 6;
    private int addTime_;
    private CollectionAlbum album_;
    private int bitField0_;
    private boolean decorated_;
    private int index_;
    private TrackCollectionState trackCollectionState_;
    private TrackMetadata trackMetadata_;
    private TrackPlayState trackPlayState_;
    private TrackSyncState trackSyncState_;
    private String cover_ = "";
    private String link_ = "";
    private ae50 artistCollectionState_ = AbstractC0269h.emptyProtobufList();

    static {
        CollectionTrack collectionTrack = new CollectionTrack();
        DEFAULT_INSTANCE = collectionTrack;
        AbstractC0269h.registerDefaultInstance(CollectionTrack.class, collectionTrack);
    }

    private CollectionTrack() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static CollectionTrack m97531q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002\u000b\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007\u0007\bဉ\u0004\tȈ\nȈ\u000b\u001b", new Object[]{"bitField0_", "index_", "addTime_", "trackMetadata_", "trackCollectionState_", "trackPlayState_", "trackSyncState_", "decorated_", "album_", "cover_", "link_", "artistCollectionState_", ArtistCollectionState.class});
        }
        if (iOrdinal == 3) {
            return new CollectionTrack();
        }
        if (iOrdinal == 4) {
            return new b6f();
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
        synchronized (CollectionTrack.class) {
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

    public final String getLink() {
        return this.link_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CollectionAlbum m97532o() {
        CollectionAlbum collectionAlbum = this.album_;
        return collectionAlbum == null ? CollectionAlbum.m97440r() : collectionAlbum;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m97533p() {
        return this.artistCollectionState_;
    }

    /* JADX INFO: renamed from: r */
    public final TrackCollectionState m97534r() {
        TrackCollectionState trackCollectionState = this.trackCollectionState_;
        return trackCollectionState == null ? TrackCollectionState.getDefaultInstance() : trackCollectionState;
    }

    /* JADX INFO: renamed from: s */
    public final TrackMetadata m97535s() {
        TrackMetadata trackMetadata = this.trackMetadata_;
        return trackMetadata == null ? TrackMetadata.getDefaultInstance() : trackMetadata;
    }

    /* JADX INFO: renamed from: t */
    public final TrackPlayState m97536t() {
        TrackPlayState trackPlayState = this.trackPlayState_;
        return trackPlayState == null ? TrackPlayState.getDefaultInstance() : trackPlayState;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final TrackSyncState m97537u() {
        TrackSyncState trackSyncState = this.trackSyncState_;
        return trackSyncState == null ? TrackSyncState.getDefaultInstance() : trackSyncState;
    }
}
