package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y3f;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CollectionGetArtistViewRequest extends AbstractC0269h implements sre0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 4;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 3;
    public static final int ARTIST_URI_FIELD_NUMBER = 1;
    private static final CollectionGetArtistViewRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRACK_POLICY_FIELD_NUMBER = 5;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 2;
    private CollectionAlbumDecorationPolicy albumPolicy_;
    private CollectionArtistDecorationPolicy artistPolicy_;
    private String artistUri_ = "";
    private int bitField0_;
    private CollectionTrackDecorationPolicy trackPolicy_;
    private int updateThrottling_;

    static {
        CollectionGetArtistViewRequest collectionGetArtistViewRequest = new CollectionGetArtistViewRequest();
        DEFAULT_INSTANCE = collectionGetArtistViewRequest;
        AbstractC0269h.registerDefaultInstance(CollectionGetArtistViewRequest.class, collectionGetArtistViewRequest);
    }

    private CollectionGetArtistViewRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97500n(CollectionGetArtistViewRequest collectionGetArtistViewRequest, CollectionAlbumDecorationPolicy collectionAlbumDecorationPolicy) {
        collectionGetArtistViewRequest.getClass();
        collectionAlbumDecorationPolicy.getClass();
        collectionGetArtistViewRequest.albumPolicy_ = collectionAlbumDecorationPolicy;
        collectionGetArtistViewRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m97501o(CollectionGetArtistViewRequest collectionGetArtistViewRequest, CollectionArtistDecorationPolicy collectionArtistDecorationPolicy) {
        collectionGetArtistViewRequest.getClass();
        collectionArtistDecorationPolicy.getClass();
        collectionGetArtistViewRequest.artistPolicy_ = collectionArtistDecorationPolicy;
        collectionGetArtistViewRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m97502p(CollectionGetArtistViewRequest collectionGetArtistViewRequest, String str) {
        collectionGetArtistViewRequest.getClass();
        str.getClass();
        collectionGetArtistViewRequest.artistUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static y3f m97503q() {
        return (y3f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "artistUri_", "updateThrottling_", "artistPolicy_", "albumPolicy_", "trackPolicy_"});
        }
        if (iOrdinal == 3) {
            return new CollectionGetArtistViewRequest();
        }
        if (iOrdinal == 4) {
            return new y3f(DEFAULT_INSTANCE);
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
        synchronized (CollectionGetArtistViewRequest.class) {
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
