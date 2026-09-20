package spotify.show_cosmos.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uq11;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class ShowRequest$Item extends AbstractC0269h implements sre0 {
    private static final ShowRequest$Item DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 3;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 2;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 4;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ShowEpisodeState$EpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata episodeMetadata_;
    private ShowEpisodeState$EpisodeOfflineState episodeOfflineState_;
    private EpisodePlayState episodePlayState_;
    private String headerField_ = "";

    static {
        ShowRequest$Item showRequest$Item = new ShowRequest$Item();
        DEFAULT_INSTANCE = showRequest$Item;
        AbstractC0269h.registerDefaultInstance(ShowRequest$Item.class, showRequest$Item);
    }

    private ShowRequest$Item() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowRequest$Item m97938n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "headerField_", "episodeMetadata_", "episodeCollectionState_", "episodeOfflineState_", "episodePlayState_"});
        }
        if (iOrdinal == 3) {
            return new ShowRequest$Item();
        }
        if (iOrdinal == 4) {
            return new uq11(DEFAULT_INSTANCE);
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
        synchronized (ShowRequest$Item.class) {
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
    public final ShowEpisodeState$EpisodeCollectionState m97939o() {
        ShowEpisodeState$EpisodeCollectionState showEpisodeState$EpisodeCollectionState = this.episodeCollectionState_;
        return showEpisodeState$EpisodeCollectionState == null ? ShowEpisodeState$EpisodeCollectionState.m97920n() : showEpisodeState$EpisodeCollectionState;
    }

    /* JADX INFO: renamed from: p */
    public final EpisodeMetadata m97940p() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.getDefaultInstance() : episodeMetadata;
    }

    /* JADX INFO: renamed from: q */
    public final ShowEpisodeState$EpisodeOfflineState m97941q() {
        ShowEpisodeState$EpisodeOfflineState showEpisodeState$EpisodeOfflineState = this.episodeOfflineState_;
        return showEpisodeState$EpisodeOfflineState == null ? ShowEpisodeState$EpisodeOfflineState.m97921n() : showEpisodeState$EpisodeOfflineState;
    }

    /* JADX INFO: renamed from: r */
    public final EpisodePlayState m97942r() {
        EpisodePlayState episodePlayState = this.episodePlayState_;
        return episodePlayState == null ? EpisodePlayState.getDefaultInstance() : episodePlayState;
    }

    /* JADX INFO: renamed from: s */
    public final String m97943s() {
        return this.headerField_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m97944t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
