package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.fi11;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowDecorateRequest$ProtoDecorateEpisodeItem extends AbstractC0269h implements sre0 {
    private static final ShowDecorateRequest$ProtoDecorateEpisodeItem DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 1;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 3;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EpisodeState$ProtoEpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata_;
    private EpisodeState$ProtoEpisodeOfflineState episodeOfflineState_;
    private EpisodeState$ProtoEpisodePlayState episodePlayState_;
    private String link_ = "";

    static {
        ShowDecorateRequest$ProtoDecorateEpisodeItem showDecorateRequest$ProtoDecorateEpisodeItem = new ShowDecorateRequest$ProtoDecorateEpisodeItem();
        DEFAULT_INSTANCE = showDecorateRequest$ProtoDecorateEpisodeItem;
        AbstractC0269h.registerDefaultInstance(ShowDecorateRequest$ProtoDecorateEpisodeItem.class, showDecorateRequest$ProtoDecorateEpisodeItem);
    }

    private ShowDecorateRequest$ProtoDecorateEpisodeItem() {
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
            return new ShowDecorateRequest$ProtoDecorateEpisodeItem();
        }
        if (iOrdinal == 4) {
            return new fi11(DEFAULT_INSTANCE, 7);
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
        synchronized (ShowDecorateRequest$ProtoDecorateEpisodeItem.class) {
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

    /* JADX INFO: renamed from: n */
    public final EpisodeState$ProtoEpisodeCollectionState m15474n() {
        EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = this.episodeCollectionState_;
        return episodeState$ProtoEpisodeCollectionState == null ? EpisodeState$ProtoEpisodeCollectionState.m15467n() : episodeState$ProtoEpisodeCollectionState;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EpisodeMetadata$ProtoEpisodeMetadata m15475o() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.episodeMetadata_;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.m15459o() : episodeMetadata$ProtoEpisodeMetadata;
    }

    /* JADX INFO: renamed from: p */
    public final EpisodeState$ProtoEpisodeOfflineState m15476p() {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = this.episodeOfflineState_;
        return episodeState$ProtoEpisodeOfflineState == null ? EpisodeState$ProtoEpisodeOfflineState.m15468n() : episodeState$ProtoEpisodeOfflineState;
    }

    /* JADX INFO: renamed from: q */
    public final EpisodeState$ProtoEpisodePlayState m15477q() {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = this.episodePlayState_;
        return episodeState$ProtoEpisodePlayState == null ? EpisodeState$ProtoEpisodePlayState.m15469n() : episodeState$ProtoEpisodePlayState;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m15478r() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m15479s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m15480t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15481u() {
        return (this.bitField0_ & 8) != 0;
    }
}
