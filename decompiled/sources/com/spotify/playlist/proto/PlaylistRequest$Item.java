package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.cosmos.util.proto.EpisodeCollectionState;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.EpisodeSyncState;
import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ImageGroup;
import com.spotify.cosmos.util.proto.TrackMetadata;
import com.spotify.cosmos.util.proto.TrackPlayState;
import com.spotify.list_collection.save_source.proto.SaveSource;
import java.util.List;
import p204p.ae50;
import p204p.oop0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PlaylistRequest$Item extends AbstractC0269h implements sre0 {
    public static final int ADDED_BY_FIELD_NUMBER = 3;
    public static final int ADD_TIME_FIELD_NUMBER = 2;
    public static final int AVAILABLE_SIGNALS_FIELD_NUMBER = 15;
    public static final int COLLECTION_STATE_FIELD_NUMBER = 20;
    public static final int CURATION_STATE_FIELD_NUMBER = 22;
    private static final PlaylistRequest$Item DEFAULT_INSTANCE;
    public static final int DISPLAY_COVERS_FIELD_NUMBER = 14;
    public static final int EPISODE_COLLECTION_STATE_FIELD_NUMBER = 12;
    public static final int EPISODE_METADATA_FIELD_NUMBER = 10;
    public static final int EPISODE_OFFLINE_STATE_FIELD_NUMBER = 11;
    public static final int EPISODE_PLAY_STATE_FIELD_NUMBER = 13;
    public static final int EXTENSION_FIELD_NUMBER = 17;
    public static final int FORMAT_LIST_ATTRIBUTES_FIELD_NUMBER = 9;
    public static final int HEADER_FIELD_FIELD_NUMBER = 1;
    public static final int IS_RECOMMENDATION_FIELD_NUMBER = 16;
    public static final int METADATA_FIELD_NUMBER = 21;
    public static final int OFFLINE_STATE_FIELD_NUMBER = 19;
    private static volatile r2n0 PARSER = null;
    public static final int ROW_ID_FIELD_NUMBER = 7;
    public static final int SAVE_SOURCE_FIELD_NUMBER = 24;
    public static final int SHOULD_BE_OBFUSCATED_FIELD_NUMBER = 23;
    public static final int TRACK_COLLECTION_STATE_FIELD_NUMBER = 5;
    public static final int TRACK_METADATA_FIELD_NUMBER = 4;
    public static final int TRACK_OFFLINE_STATE_FIELD_NUMBER = 6;
    public static final int TRACK_PLAY_STATE_FIELD_NUMBER = 8;
    public static final int URI_FIELD_NUMBER = 18;
    private int addTime_;
    private User addedBy_;
    private int bitField0_;
    private PlaylistRequest$ItemCollectionState collectionState_;
    private PlaylistRequest$ItemCurationState curationState_;
    private ImageGroup displayCovers_;
    private EpisodeCollectionState episodeCollectionState_;
    private EpisodeMetadata episodeMetadata_;
    private EpisodeSyncState episodeOfflineState_;
    private EpisodePlayState episodePlayState_;
    private boolean isRecommendation_;
    private PlaylistRequest$ItemMetadata metadata_;
    private PlaylistRequest$ItemOfflineState offlineState_;
    private SaveSource saveSource_;
    private boolean shouldBeObfuscated_;
    private TrackCollectionState trackCollectionState_;
    private TrackMetadata trackMetadata_;
    private TrackOfflineState trackOfflineState_;
    private TrackPlayState trackPlayState_;
    private String headerField_ = "";
    private String rowId_ = "";
    private ae50 formatListAttributes_ = AbstractC0269h.emptyProtobufList();
    private ae50 availableSignals_ = AbstractC0269h.emptyProtobufList();
    private ae50 extension_ = AbstractC0269h.emptyProtobufList();
    private String uri_ = "";

    static {
        PlaylistRequest$Item playlistRequest$Item = new PlaylistRequest$Item();
        DEFAULT_INSTANCE = playlistRequest$Item;
        AbstractC0269h.registerDefaultInstance(PlaylistRequest$Item.class, playlistRequest$Item);
    }

    private PlaylistRequest$Item() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m18580A() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m18581B() {
        return (this.bitField0_ & 65536) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m18582C() {
        return (this.bitField0_ & 256) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m18583D() {
        return (this.bitField0_ & 2048) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m18584E() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m18585F() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဈ\u0006\bဉ\u0007\t\u001b\nဉ\b\u000bဉ\t\fဉ\n\rဉ\u000b\u000eဉ\f\u000f\u001b\u0010ဇ\r\u0011\u001b\u0012ဈ\u000e\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဇ\u0013\u0018ဉ\u0014", new Object[]{"bitField0_", "headerField_", "addTime_", "addedBy_", "trackMetadata_", "trackCollectionState_", "trackOfflineState_", "rowId_", "trackPlayState_", "formatListAttributes_", FormatListAttribute.class, "episodeMetadata_", "episodeOfflineState_", "episodeCollectionState_", "episodePlayState_", "displayCovers_", "availableSignals_", PlaylistRequest$AvailableSignal.class, "isRecommendation_", "extension_", Extension.class, "uri_", "offlineState_", "collectionState_", "metadata_", "curationState_", "shouldBeObfuscated_", "saveSource_"});
        }
        if (iOrdinal == 3) {
            return new PlaylistRequest$Item();
        }
        if (iOrdinal == 4) {
            return new oop0();
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
        synchronized (PlaylistRequest$Item.class) {
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

    public final List getAvailableSignalsList() {
        return this.availableSignals_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final List getExtensionList() {
        return this.extension_;
    }

    public final int getFormatListAttributesCount() {
        return this.formatListAttributes_.size();
    }

    public final List getFormatListAttributesList() {
        return this.formatListAttributes_;
    }

    public final boolean getIsRecommendation() {
        return this.isRecommendation_;
    }

    public final SaveSource getSaveSource() {
        SaveSource saveSource = this.saveSource_;
        return saveSource == null ? SaveSource.m12900o() : saveSource;
    }

    public final String getUri() {
        return this.uri_;
    }

    public final boolean hasAddedBy() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean hasSaveSource() {
        return (this.bitField0_ & 1048576) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m18586o() {
        return this.addTime_;
    }

    /* JADX INFO: renamed from: p */
    public final User m18587p() {
        User user = this.addedBy_;
        return user == null ? User.m18670o() : user;
    }

    /* JADX INFO: renamed from: q */
    public final PlaylistRequest$ItemCollectionState m18588q() {
        PlaylistRequest$ItemCollectionState playlistRequest$ItemCollectionState = this.collectionState_;
        return playlistRequest$ItemCollectionState == null ? PlaylistRequest$ItemCollectionState.m18599o() : playlistRequest$ItemCollectionState;
    }

    /* JADX INFO: renamed from: r */
    public final PlaylistRequest$ItemCurationState m18589r() {
        PlaylistRequest$ItemCurationState playlistRequest$ItemCurationState = this.curationState_;
        return playlistRequest$ItemCurationState == null ? PlaylistRequest$ItemCurationState.m18601o() : playlistRequest$ItemCurationState;
    }

    /* JADX INFO: renamed from: s */
    public final EpisodeMetadata m18590s() {
        EpisodeMetadata episodeMetadata = this.episodeMetadata_;
        return episodeMetadata == null ? EpisodeMetadata.getDefaultInstance() : episodeMetadata;
    }

    /* JADX INFO: renamed from: t */
    public final EpisodePlayState m18591t() {
        EpisodePlayState episodePlayState = this.episodePlayState_;
        return episodePlayState == null ? EpisodePlayState.getDefaultInstance() : episodePlayState;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final PlaylistRequest$ItemMetadata m18592u() {
        PlaylistRequest$ItemMetadata playlistRequest$ItemMetadata = this.metadata_;
        return playlistRequest$ItemMetadata == null ? PlaylistRequest$ItemMetadata.m18603o() : playlistRequest$ItemMetadata;
    }

    /* JADX INFO: renamed from: v */
    public final PlaylistRequest$ItemOfflineState m18593v() {
        PlaylistRequest$ItemOfflineState playlistRequest$ItemOfflineState = this.offlineState_;
        return playlistRequest$ItemOfflineState == null ? PlaylistRequest$ItemOfflineState.m18605o() : playlistRequest$ItemOfflineState;
    }

    /* JADX INFO: renamed from: w */
    public final String m18594w() {
        return this.rowId_;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m18595x() {
        return this.shouldBeObfuscated_;
    }

    /* JADX INFO: renamed from: y */
    public final TrackMetadata m18596y() {
        TrackMetadata trackMetadata = this.trackMetadata_;
        return trackMetadata == null ? TrackMetadata.getDefaultInstance() : trackMetadata;
    }

    /* JADX INFO: renamed from: z */
    public final TrackPlayState m18597z() {
        TrackPlayState trackPlayState = this.trackPlayState_;
        return trackPlayState == null ? TrackPlayState.getDefaultInstance() : trackPlayState;
    }
}
