package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.EpisodeCollectionState;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.EpisodeSyncState;
import p204p.h3f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionEpisode extends AbstractC0269h implements sre0 {
    private static final CollectionEpisode DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 1;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 3;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SHOW_FIELD_NUMBER = 5;
    private int bitField0_;
    private EpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata episodeMetadata_;
    private EpisodeSyncState episodeOfflineState_;
    private EpisodePlayState episodePlayState_;
    private String link_ = "";
    private CollectionShow show_;

    static {
        CollectionEpisode collectionEpisode = new CollectionEpisode();
        DEFAULT_INSTANCE = collectionEpisode;
        AbstractC0269h.registerDefaultInstance(CollectionEpisode.class, collectionEpisode);
    }

    private CollectionEpisode() {
    }

    /* JADX INFO: renamed from: o */
    public static CollectionEpisode m97486o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ȉ", new Object[]{"bitField0_", "episodeMetadata_", "episodeCollectionState_", "episodeOfflineState_", "episodePlayState_", "show_", "link_"});
        }
        if (iOrdinal == 3) {
            return new CollectionEpisode();
        }
        if (iOrdinal == 4) {
            return new h3f();
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
        synchronized (CollectionEpisode.class) {
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

    /* JADX INFO: renamed from: p */
    public final EpisodeCollectionState m97487p() {
        EpisodeCollectionState episodeCollectionState = this.episodeCollectionState_;
        return episodeCollectionState == null ? EpisodeCollectionState.getDefaultInstance() : episodeCollectionState;
    }

    /* JADX INFO: renamed from: q */
    public final EpisodeMetadata m97488q() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.getDefaultInstance() : episodeMetadata;
    }

    /* JADX INFO: renamed from: r */
    public final EpisodeSyncState m97489r() {
        EpisodeSyncState episodeSyncState = this.episodeOfflineState_;
        return episodeSyncState == null ? EpisodeSyncState.getDefaultInstance() : episodeSyncState;
    }

    /* JADX INFO: renamed from: s */
    public final EpisodePlayState m97490s() {
        EpisodePlayState episodePlayState = this.episodePlayState_;
        return episodePlayState == null ? EpisodePlayState.getDefaultInstance() : episodePlayState;
    }

    /* JADX INFO: renamed from: t */
    public final CollectionShow m97491t() {
        CollectionShow collectionShow = this.show_;
        return collectionShow == null ? CollectionShow.m97520o() : collectionShow;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
