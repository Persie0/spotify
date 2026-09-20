package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.policy.proto.EpisodeCollectionDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodePlayedStateDecorationPolicy;
import com.spotify.cosmos.util.policy.proto.EpisodeSyncDecorationPolicy;
import p204p.i3f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionEpisodeDecorationPolicy extends AbstractC0269h implements sre0 {
    public static final int COLLECTION_POLICY_FIELD_NUMBER = 2;
    public static final int DECORATED_FIELD_NUMBER = 6;
    private static final CollectionEpisodeDecorationPolicy DEFAULT_INSTANCE;
    public static final int EPISODE_POLICY_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYED_STATE_POLICY_FIELD_NUMBER = 4;
    public static final int SHOW_POLICY_FIELD_NUMBER = 5;
    public static final int SYNC_POLICY_FIELD_NUMBER = 3;
    private int bitField0_;
    private EpisodeCollectionDecorationPolicy collectionPolicy_;
    private boolean decorated_;
    private EpisodeDecorationPolicy episodePolicy_;
    private EpisodePlayedStateDecorationPolicy playedStatePolicy_;
    private CollectionShowDecorationPolicy showPolicy_;
    private EpisodeSyncDecorationPolicy syncPolicy_;

    static {
        CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy = new CollectionEpisodeDecorationPolicy();
        DEFAULT_INSTANCE = collectionEpisodeDecorationPolicy;
        AbstractC0269h.registerDefaultInstance(CollectionEpisodeDecorationPolicy.class, collectionEpisodeDecorationPolicy);
    }

    private CollectionEpisodeDecorationPolicy() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97492n(CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy, EpisodeCollectionDecorationPolicy episodeCollectionDecorationPolicy) {
        collectionEpisodeDecorationPolicy.getClass();
        episodeCollectionDecorationPolicy.getClass();
        collectionEpisodeDecorationPolicy.collectionPolicy_ = episodeCollectionDecorationPolicy;
        collectionEpisodeDecorationPolicy.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m97493o(CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy) {
        collectionEpisodeDecorationPolicy.decorated_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static void m97494p(CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy, EpisodeDecorationPolicy episodeDecorationPolicy) {
        collectionEpisodeDecorationPolicy.getClass();
        episodeDecorationPolicy.getClass();
        collectionEpisodeDecorationPolicy.episodePolicy_ = episodeDecorationPolicy;
        collectionEpisodeDecorationPolicy.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m97495q(CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy, EpisodePlayedStateDecorationPolicy episodePlayedStateDecorationPolicy) {
        collectionEpisodeDecorationPolicy.getClass();
        episodePlayedStateDecorationPolicy.getClass();
        collectionEpisodeDecorationPolicy.playedStatePolicy_ = episodePlayedStateDecorationPolicy;
        collectionEpisodeDecorationPolicy.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: r */
    public static void m97496r(CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy, CollectionShowDecorationPolicy collectionShowDecorationPolicy) {
        collectionEpisodeDecorationPolicy.getClass();
        collectionShowDecorationPolicy.getClass();
        collectionEpisodeDecorationPolicy.showPolicy_ = collectionShowDecorationPolicy;
        collectionEpisodeDecorationPolicy.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: s */
    public static void m97497s(CollectionEpisodeDecorationPolicy collectionEpisodeDecorationPolicy, EpisodeSyncDecorationPolicy episodeSyncDecorationPolicy) {
        collectionEpisodeDecorationPolicy.getClass();
        episodeSyncDecorationPolicy.getClass();
        collectionEpisodeDecorationPolicy.syncPolicy_ = episodeSyncDecorationPolicy;
        collectionEpisodeDecorationPolicy.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: u */
    public static i3f m97499u() {
        return (i3f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006\u0007", new Object[]{"bitField0_", "episodePolicy_", "collectionPolicy_", "syncPolicy_", "playedStatePolicy_", "showPolicy_", "decorated_"});
        }
        if (iOrdinal == 3) {
            return new CollectionEpisodeDecorationPolicy();
        }
        if (iOrdinal == 4) {
            return new i3f();
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
        synchronized (CollectionEpisodeDecorationPolicy.class) {
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
