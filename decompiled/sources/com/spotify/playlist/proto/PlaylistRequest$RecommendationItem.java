package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.cosmos.util.proto.TrackPlayState;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rop0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistRequest$RecommendationItem extends AbstractC0269h implements sre0 {
    private static final PlaylistRequest$RecommendationItem DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SHOULD_BE_OBFUSCATED_FIELD_NUMBER = 5;
    public static final int TRACK_COLLECTION_STATE_FIELD_NUMBER = 2;
    public static final int TRACK_METADATA_FIELD_NUMBER = 1;
    public static final int TRACK_OFFLINE_STATE_FIELD_NUMBER = 3;
    public static final int TRACK_PLAY_STATE_FIELD_NUMBER = 4;
    private int bitField0_;
    private boolean shouldBeObfuscated_;
    private TrackCollectionState trackCollectionState_;
    private TrackMetadata trackMetadata_;
    private TrackOfflineState trackOfflineState_;
    private TrackPlayState trackPlayState_;

    static {
        PlaylistRequest$RecommendationItem playlistRequest$RecommendationItem = new PlaylistRequest$RecommendationItem();
        DEFAULT_INSTANCE = playlistRequest$RecommendationItem;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$RecommendationItem.class, playlistRequest$RecommendationItem);
    }

    private PlaylistRequest$RecommendationItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဇ\u0004", new Object[]{"bitField0_", "trackMetadata_", "trackCollectionState_", "trackOfflineState_", "trackPlayState_", "shouldBeObfuscated_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$RecommendationItem();
        }
        if (iOrdinal == 4) {
            return new rop0();
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
        synchronized (PlaylistRequest$RecommendationItem.class) {
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
    public final boolean m18621o() {
        return this.shouldBeObfuscated_;
    }

    /* JADX INFO: renamed from: p */
    public final TrackCollectionState m18622p() {
        TrackCollectionState trackCollectionState = this.trackCollectionState_;
        return trackCollectionState == null ? TrackCollectionState.m18666o() : trackCollectionState;
    }

    /* JADX INFO: renamed from: q */
    public final TrackMetadata m18623q() {
        TrackMetadata trackMetadata = this.trackMetadata_;
        return trackMetadata == null ? TrackMetadata.getDefaultInstance() : trackMetadata;
    }

    /* JADX INFO: renamed from: r */
    public final TrackOfflineState m18624r() {
        TrackOfflineState trackOfflineState = this.trackOfflineState_;
        return trackOfflineState == null ? TrackOfflineState.m18668o() : trackOfflineState;
    }

    /* JADX INFO: renamed from: s */
    public final TrackPlayState m18625s() {
        TrackPlayState trackPlayState = this.trackPlayState_;
        return trackPlayState == null ? TrackPlayState.getDefaultInstance() : trackPlayState;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
