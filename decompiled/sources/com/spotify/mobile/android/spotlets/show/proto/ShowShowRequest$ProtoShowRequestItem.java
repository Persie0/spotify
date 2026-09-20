package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ShowShowRequest$ProtoShowRequestItem extends AbstractC0269h implements sre0 {
    private static final ShowShowRequest$ProtoShowRequestItem DEFAULT_INSTANCE;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 3;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 2;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 4;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private EpisodeState$ProtoEpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata_;
    private EpisodeState$ProtoEpisodeOfflineState episodeOfflineState_;
    private EpisodeState$ProtoEpisodePlayState episodePlayState_;
    private String header_ = "";

    static {
        ShowShowRequest$ProtoShowRequestItem showShowRequest$ProtoShowRequestItem = new ShowShowRequest$ProtoShowRequestItem();
        DEFAULT_INSTANCE = showShowRequest$ProtoShowRequestItem;
        AbstractC0269h.registerDefaultInstance(ShowShowRequest$ProtoShowRequestItem.class, showShowRequest$ProtoShowRequestItem);
    }

    private ShowShowRequest$ProtoShowRequestItem() {
    }

    /* JADX INFO: renamed from: n */
    public static ShowShowRequest$ProtoShowRequestItem m15519n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "header_", "episodeMetadata_", "episodeCollectionState_", "episodeOfflineState_", "episodePlayState_"});
        }
        if (iOrdinal == 3) {
            return new ShowShowRequest$ProtoShowRequestItem();
        }
        if (iOrdinal == 4) {
            return new qr11(DEFAULT_INSTANCE, 0);
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
        synchronized (ShowShowRequest$ProtoShowRequestItem.class) {
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
    public final EpisodeState$ProtoEpisodeCollectionState m15520o() {
        EpisodeState$ProtoEpisodeCollectionState episodeState$ProtoEpisodeCollectionState = this.episodeCollectionState_;
        return episodeState$ProtoEpisodeCollectionState == null ? EpisodeState$ProtoEpisodeCollectionState.m15467n() : episodeState$ProtoEpisodeCollectionState;
    }

    /* JADX INFO: renamed from: p */
    public final EpisodeMetadata$ProtoEpisodeMetadata m15521p() {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = this.episodeMetadata_;
        return episodeMetadata$ProtoEpisodeMetadata == null ? EpisodeMetadata$ProtoEpisodeMetadata.m15459o() : episodeMetadata$ProtoEpisodeMetadata;
    }

    /* JADX INFO: renamed from: q */
    public final EpisodeState$ProtoEpisodeOfflineState m15522q() {
        EpisodeState$ProtoEpisodeOfflineState episodeState$ProtoEpisodeOfflineState = this.episodeOfflineState_;
        return episodeState$ProtoEpisodeOfflineState == null ? EpisodeState$ProtoEpisodeOfflineState.m15468n() : episodeState$ProtoEpisodeOfflineState;
    }

    /* JADX INFO: renamed from: r */
    public final EpisodeState$ProtoEpisodePlayState m15523r() {
        EpisodeState$ProtoEpisodePlayState episodeState$ProtoEpisodePlayState = this.episodePlayState_;
        return episodeState$ProtoEpisodePlayState == null ? EpisodeState$ProtoEpisodePlayState.m15469n() : episodeState$ProtoEpisodePlayState;
    }

    /* JADX INFO: renamed from: s */
    public final String m15524s() {
        return this.header_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m15525t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m15526u() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m15527v() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m15528w() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m15529x() {
        return (this.bitField0_ & 1) != 0;
    }
}
