package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.b3f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionDecorateRequest extends AbstractC0269h implements sre0 {
    public static final int ALBUM_POLICY_FIELD_NUMBER = 5;
    public static final int ARTIST_POLICY_FIELD_NUMBER = 4;
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    private static final CollectionDecorateRequest DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_POLICY_FIELD_NUMBER = 7;
    public static final int TRACK_POLICY_FIELD_NUMBER = 6;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 3;
    public static final int URI_FIELD_NUMBER = 1;
    private CollectionAlbumDecorationPolicy albumPolicy_;
    private CollectionArtistDecorationPolicy artistPolicy_;
    private int bitField0_;
    private CollectionEpisodeDecorationPolicy episodePolicy_;
    private CollectionShowDecorationPolicy showPolicy_;
    private CollectionTrackDecorationPolicy trackPolicy_;
    private int updateThrottling_;
    private ae50 uri_ = AbstractC0269h.emptyProtobufList();
    private String contextUri_ = "";

    static {
        CollectionDecorateRequest collectionDecorateRequest = new CollectionDecorateRequest();
        DEFAULT_INSTANCE = collectionDecorateRequest;
        AbstractC0269h.registerDefaultInstance(CollectionDecorateRequest.class, collectionDecorateRequest);
    }

    private CollectionDecorateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97469n(CollectionDecorateRequest collectionDecorateRequest, Iterable iterable) {
        ae50 ae50Var = collectionDecorateRequest.uri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionDecorateRequest.uri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, collectionDecorateRequest.uri_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97470o(CollectionDecorateRequest collectionDecorateRequest, String str) {
        collectionDecorateRequest.getClass();
        str.getClass();
        ae50 ae50Var = collectionDecorateRequest.uri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionDecorateRequest.uri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        collectionDecorateRequest.uri_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m97471p(CollectionDecorateRequest collectionDecorateRequest, CollectionArtistDecorationPolicy collectionArtistDecorationPolicy) {
        collectionDecorateRequest.getClass();
        collectionArtistDecorationPolicy.getClass();
        collectionDecorateRequest.artistPolicy_ = collectionArtistDecorationPolicy;
        collectionDecorateRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97472q(CollectionDecorateRequest collectionDecorateRequest, String str) {
        collectionDecorateRequest.getClass();
        str.getClass();
        collectionDecorateRequest.contextUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m97473r(CollectionDecorateRequest collectionDecorateRequest, CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy) {
        collectionDecorateRequest.getClass();
        collectionEpisodeDecorationPolicy.getClass();
        collectionDecorateRequest.episodePolicy_ = collectionEpisodeDecorationPolicy;
        collectionDecorateRequest.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: s */
    public static void m97474s(CollectionDecorateRequest collectionDecorateRequest, CollectionShowDecorationPolicy collectionShowDecorationPolicy) {
        collectionDecorateRequest.getClass();
        collectionShowDecorationPolicy.getClass();
        collectionDecorateRequest.showPolicy_ = collectionShowDecorationPolicy;
        collectionDecorateRequest.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: t */
    public static void m97475t(CollectionDecorateRequest collectionDecorateRequest, CollectionTrackDecorationPolicy collectionTrackDecorationPolicy) {
        collectionDecorateRequest.getClass();
        collectionTrackDecorationPolicy.getClass();
        collectionDecorateRequest.trackPolicy_ = collectionTrackDecorationPolicy;
        collectionDecorateRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: u */
    public static b3f m97476u() {
        return (b3f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ț\u0002Ȉ\u0003\u000b\u0004ဉ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007ဉ\u0003\bဉ\u0004", new Object[]{"bitField0_", "uri_", "contextUri_", "updateThrottling_", "artistPolicy_", "albumPolicy_", "trackPolicy_", "showPolicy_", "episodePolicy_"});
        }
        if (iOrdinal == 3) {
            return new CollectionDecorateRequest();
        }
        if (iOrdinal == 4) {
            return new b3f(DEFAULT_INSTANCE);
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
        synchronized (CollectionDecorateRequest.class) {
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
