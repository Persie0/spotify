package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.AlbumCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.AlbumSyncDecorationPolicy;
import p204p.h0f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionAlbumDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 7;
    public static final int ALBUM_TYPE_FIELD_NUMBER = 2;
    public static final int ARTISTS_POLICY_FIELD_NUMBER = 4;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 3;
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 5;
    public static final int DECORATED_FIELD_NUMBER = 1;
    private static final CollectionAlbumDecorationPolicy DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SYNC_POLICY_FIELD_NUMBER = 6;
    private AlbumDecorationPolicy albumPolicy_;
    private boolean albumType_;
    private CollectionArtistDecorationPolicy artistPolicy_;
    private CollectionArtistDecorationPolicy artistsPolicy_;
    private int bitField0_;
    private AlbumCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private AlbumSyncDecorationPolicy syncPolicy_;

    static {
        CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy = new CollectionAlbumDecorationPolicy();
        DEFAULT_INSTANCE = collectionAlbumDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(CollectionAlbumDecorationPolicy.class, collectionAlbumDecorationPolicy);
    }

    private CollectionAlbumDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97444n(CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy, AlbumDecorationPolicy albumDecorationPolicy) {
        collectionAlbumDecorationPolicy.getClass();
        albumDecorationPolicy.getClass();
        collectionAlbumDecorationPolicy.albumPolicy_ = albumDecorationPolicy;
        collectionAlbumDecorationPolicy.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: o */
    public static void m97445o(CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy) {
        collectionAlbumDecorationPolicy.albumType_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m97446p(CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy, AlbumSyncDecorationPolicy albumSyncDecorationPolicy) {
        collectionAlbumDecorationPolicy.getClass();
        albumSyncDecorationPolicy.getClass();
        collectionAlbumDecorationPolicy.syncPolicy_ = albumSyncDecorationPolicy;
        collectionAlbumDecorationPolicy.bitField0_ |= 8;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static h0f m97448r() {
        return (h0f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004", new Object[]{"bitField0_", "decorated_", "albumType_", "artistPolicy_", "artistsPolicy_", "collectionPolicy_", "syncPolicy_", "albumPolicy_"});
        }
        if (iOrdinal == 3) {
            return new CollectionAlbumDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new h0f();
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
        synchronized (CollectionAlbumDecorationPolicy.class) {
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
