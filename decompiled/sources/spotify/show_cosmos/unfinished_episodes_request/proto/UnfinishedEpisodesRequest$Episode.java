package spotify.show_cosmos.unfinished_episodes_request.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x1a1;
import p204p.z110;
import spotify.show_cosmos.proto.ShowEpisodeState$EpisodeCollectionState;
import spotify.show_cosmos.proto.ShowEpisodeState$EpisodeOfflineState;

/* JADX INFO: loaded from: classes11.dex */
public final class UnfinishedEpisodesRequest$Episode extends AbstractC0269h implements sre0 {
    private static final UnfinishedEpisodesRequest$Episode DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 1;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 3;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ShowEpisodeState$EpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata episodeMetadata_;
    private ShowEpisodeState$EpisodeOfflineState episodeOfflineState_;
    private EpisodePlayState episodePlayState_;
    private String link_ = "";

    static {
        UnfinishedEpisodesRequest$Episode unfinishedEpisodesRequest$Episode = new UnfinishedEpisodesRequest$Episode();
        DEFAULT_INSTANCE = unfinishedEpisodesRequest$Episode;
        AbstractC0269h.registerDefaultInstance(UnfinishedEpisodesRequest$Episode.class, unfinishedEpisodesRequest$Episode);
    }

    private UnfinishedEpisodesRequest$Episode() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "episodeMetadata_", "episodeCollectionState_", "episodeOfflineState_", "episodePlayState_", "link_"});
        }
        if (iOrdinal == 3) {
            return new UnfinishedEpisodesRequest$Episode();
        }
        if (iOrdinal == 4) {
            return new x1a1(DEFAULT_INSTANCE);
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
        synchronized (UnfinishedEpisodesRequest$Episode.class) {
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
    public final ShowEpisodeState$EpisodeCollectionState m97960n() {
        ShowEpisodeState$EpisodeCollectionState showEpisodeState$EpisodeCollectionState = this.episodeCollectionState_;
        return showEpisodeState$EpisodeCollectionState == null ? ShowEpisodeState$EpisodeCollectionState.m97920n() : showEpisodeState$EpisodeCollectionState;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EpisodeMetadata m97961o() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.getDefaultInstance() : episodeMetadata;
    }

    /* JADX INFO: renamed from: p */
    public final ShowEpisodeState$EpisodeOfflineState m97962p() {
        ShowEpisodeState$EpisodeOfflineState showEpisodeState$EpisodeOfflineState = this.episodeOfflineState_;
        return showEpisodeState$EpisodeOfflineState == null ? ShowEpisodeState$EpisodeOfflineState.m97921n() : showEpisodeState$EpisodeOfflineState;
    }

    /* JADX INFO: renamed from: q */
    public final EpisodePlayState m97963q() {
        EpisodePlayState episodePlayState = this.episodePlayState_;
        return episodePlayState == null ? EpisodePlayState.getDefaultInstance() : episodePlayState;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
