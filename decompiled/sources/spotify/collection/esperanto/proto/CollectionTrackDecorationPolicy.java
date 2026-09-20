package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.ArtistCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.ArtistDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackPlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.TrackSyncDecorationPolicy;
import p204p.c6f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionTrackDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 5;
    public static final int ARTIST_COLLECTION_POLICY_FIELD_NUMBER = 8;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 6;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 1;
    public static final int DECORATED_FIELD_NUMBER = 7;
    private static final CollectionTrackDecorationPolicy DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SYNC_POLICY_FIELD_NUMBER = 2;
    public static final int TRACK_POLICY_FIELD_NUMBER = 3;
    private CollectionAlbumDecorationPolicy albumPolicy_;
    private ArtistCollectionDecorationPolicy artistCollectionPolicy_;
    private ArtistDecorationPolicy artistPolicy_;
    private int bitField0_;
    private TrackCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private TrackPlayedStateDecorationPolicy playedStatePolicy_;
    private TrackSyncDecorationPolicy syncPolicy_;
    private TrackDecorationPolicy trackPolicy_;

    static {
        CollectionTrackDecorationPolicy collectionTrackDecorationPolicy = new CollectionTrackDecorationPolicy();
        DEFAULT_INSTANCE = collectionTrackDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(CollectionTrackDecorationPolicy.class, collectionTrackDecorationPolicy);
    }

    private CollectionTrackDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97538n(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy, CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy) {
        collectionTrackDecorationPolicy.getClass();
        collectionTrackDecorationPolicy.albumPolicy_ = collectionAlbumDecorationPolicy;
        collectionTrackDecorationPolicy.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: o */
    public static void m97539o(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy, ArtistCollectionDecorationPolicy artistCollectionDecorationPolicy) {
        collectionTrackDecorationPolicy.getClass();
        artistCollectionDecorationPolicy.getClass();
        collectionTrackDecorationPolicy.artistCollectionPolicy_ = artistCollectionDecorationPolicy;
        collectionTrackDecorationPolicy.bitField0_ |= 64;
    }

    /* JADX INFO: renamed from: p */
    public static void m97540p(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy, ArtistDecorationPolicy artistDecorationPolicy) {
        collectionTrackDecorationPolicy.getClass();
        collectionTrackDecorationPolicy.artistPolicy_ = artistDecorationPolicy;
        collectionTrackDecorationPolicy.bitField0_ |= 32;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97541q(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy, TrackCollectionDecorationPolicy trackCollectionDecorationPolicy) {
        collectionTrackDecorationPolicy.getClass();
        trackCollectionDecorationPolicy.getClass();
        collectionTrackDecorationPolicy.collectionPolicy_ = trackCollectionDecorationPolicy;
        collectionTrackDecorationPolicy.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: r */
    public static void m97542r(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy, TrackPlayedStateDecorationPolicy trackPlayedStateDecorationPolicy) {
        collectionTrackDecorationPolicy.getClass();
        trackPlayedStateDecorationPolicy.getClass();
        collectionTrackDecorationPolicy.playedStatePolicy_ = trackPlayedStateDecorationPolicy;
        collectionTrackDecorationPolicy.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: s */
    public static void m97543s(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy, TrackSyncDecorationPolicy trackSyncDecorationPolicy) {
        collectionTrackDecorationPolicy.getClass();
        collectionTrackDecorationPolicy.syncPolicy_ = trackSyncDecorationPolicy;
        collectionTrackDecorationPolicy.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: t */
    public static void m97544t(CollectionTrackDecorationPolicy collectionTrackDecorationPolicy, TrackDecorationPolicy trackDecorationPolicy) {
        collectionTrackDecorationPolicy.getClass();
        trackDecorationPolicy.getClass();
        collectionTrackDecorationPolicy.trackPolicy_ = trackDecorationPolicy;
        collectionTrackDecorationPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: u */
    public static c6f m97545u() {
        return (c6f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007\u0007\bဉ\u0006", new Object[]{"bitField0_", "collectionPolicy_", "syncPolicy_", "trackPolicy_", "playedStatePolicy_", "albumPolicy_", "artistPolicy_", "decorated_", "artistCollectionPolicy_"});
        }
        if (iOrdinal == 3) {
            return new CollectionTrackDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new c6f(DEFAULT_INSTANCE);
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
        synchronized (CollectionTrackDecorationPolicy.class) {
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
