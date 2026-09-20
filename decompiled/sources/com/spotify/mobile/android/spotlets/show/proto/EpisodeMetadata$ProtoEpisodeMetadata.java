package com.spotify.mobile.android.spotlets.show.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.d5w;
import p204p.e5w;
import p204p.nq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ugv;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class EpisodeMetadata$ProtoEpisodeMetadata extends AbstractC0269h implements sre0 {
    public static final int AVAILABLE_FIELD_NUMBER = 11;
    public static final int BACKGROUNDABLE_FIELD_NUMBER = 14;
    public static final int COVERS_FIELD_NUMBER = 5;
    private static final EpisodeMetadata$ProtoEpisodeMetadata DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 7;
    public static final int EPISODE_TYPE_FIELD_NUMBER = 18;
    public static final int EXTENSION_FIELD_NUMBER = 22;
    public static final int FREEZE_FRAMES_FIELD_NUMBER = 9;
    public static final int IS_19_PLUS_ONLY_FIELD_NUMBER = 23;
    public static final int IS_BOOK_CHAPTER_FIELD_NUMBER = 24;
    public static final int IS_CURATED_FIELD_NUMBER = 26;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 16;
    public static final int IS_MUSIC_AND_TALK_FIELD_NUMBER = 19;
    public static final int IS_PODCAST_SHORT_FIELD_NUMBER = 25;
    public static final int LANGUAGE_FIELD_NUMBER = 10;
    public static final int LENGTH_FIELD_NUMBER = 4;
    public static final int LINK_FIELD_NUMBER = 2;
    public static final int MANIFEST_ID_FIELD_NUMBER = 6;
    public static final int MEDIA_TYPE_ENUM_FIELD_NUMBER = 12;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIEW_ID_FIELD_NUMBER = 17;
    public static final int PREVIEW_MANIFEST_ID_FIELD_NUMBER = 15;
    public static final int PUBLISH_DATE_FIELD_NUMBER = 8;
    public static final int SHOW_FIELD_NUMBER = 1;
    private boolean available_;
    private boolean backgroundable_;
    private int bitField0_;
    private ImageGroup$ProtoImageGroup covers_;
    private int episodeType_;
    private ImageGroup$ProtoImageGroup freezeFrames_;
    private boolean is19PlusOnly_;
    private boolean isBookChapter_;
    private boolean isCurated_;
    private boolean isExplicit_;
    private boolean isMusicAndTalk_;
    private boolean isPodcastShort_;
    private int length_;
    private int mediaTypeEnum_;
    private long publishDate_;
    private EpisodeMetadata$ProtoEpisodeShowMetadata show_;
    private String link_ = "";
    private String name_ = "";
    private String manifestId_ = "";
    private String description_ = "";
    private String language_ = "";
    private String previewManifestId_ = "";
    private String previewId_ = "";
    private ae50 extension_ = AbstractC0269h.emptyProtobufList();

    static {
        EpisodeMetadata$ProtoEpisodeMetadata episodeMetadata$ProtoEpisodeMetadata = new EpisodeMetadata$ProtoEpisodeMetadata();
        DEFAULT_INSTANCE = episodeMetadata$ProtoEpisodeMetadata;
        AbstractC0269h.registerDefaultInstance(EpisodeMetadata$ProtoEpisodeMetadata.class, episodeMetadata$ProtoEpisodeMetadata);
    }

    private EpisodeMetadata$ProtoEpisodeMetadata() {
    }

    /* JADX INFO: renamed from: o */
    public static EpisodeMetadata$ProtoEpisodeMetadata m15459o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u001a\u0017\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဋ\u0003\u0005ဉ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\tဉ\b\nဈ\t\u000bဇ\n\f᠌\u000b\u000eဇ\f\u000fဈ\r\u0010ဇ\u000e\u0011ဈ\u000f\u0012᠌\u0010\u0013ဇ\u0011\u0016\u001b\u0017ဇ\u0012\u0018ဇ\u0013\u0019ဇ\u0014\u001aဇ\u0015", new Object[]{"bitField0_", "show_", "link_", "name_", "length_", "covers_", "manifestId_", "description_", "publishDate_", "freezeFrames_", "language_", "available_", "mediaTypeEnum_", nq6.f157149f, "backgroundable_", "previewManifestId_", "isExplicit_", "previewId_", "episodeType_", nq6.f157148e, "isMusicAndTalk_", "extension_", Extension.class, "is19PlusOnly_", "isBookChapter_", "isPodcastShort_", "isCurated_"});
        }
        if (iOrdinal == 3) {
            return new EpisodeMetadata$ProtoEpisodeMetadata();
        }
        if (iOrdinal == 4) {
            return new ugv(DEFAULT_INSTANCE, 18);
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
        synchronized (EpisodeMetadata$ProtoEpisodeMetadata.class) {
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

    public final boolean getAvailable() {
        return this.available_;
    }

    public final boolean getBackgroundable() {
        return this.backgroundable_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    public final String getDescription() {
        return this.description_;
    }

    public final List getExtensionList() {
        return this.extension_;
    }

    public final boolean getIs19PlusOnly() {
        return this.is19PlusOnly_;
    }

    public final boolean getIsBookChapter() {
        return this.isBookChapter_;
    }

    public final boolean getIsCurated() {
        return this.isCurated_;
    }

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final boolean getIsMusicAndTalk() {
        return this.isMusicAndTalk_;
    }

    public final int getLength() {
        return this.length_;
    }

    public final String getLink() {
        return this.link_;
    }

    public final String getManifestId() {
        return this.manifestId_;
    }

    public final String getName() {
        return this.name_;
    }

    public final String getPreviewId() {
        return this.previewId_;
    }

    public final String getPreviewManifestId() {
        return this.previewManifestId_;
    }

    public final long getPublishDate() {
        return this.publishDate_;
    }

    public final boolean hasCovers() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean hasFreezeFrames() {
        return (this.bitField0_ & 256) != 0;
    }

    public final boolean hasMediaTypeEnum() {
        return (this.bitField0_ & 2048) != 0;
    }

    public final boolean hasShow() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: n */
    public final ImageGroup$ProtoImageGroup m15460n() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.covers_;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.m15473n() : imageGroup$ProtoImageGroup;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final d5w m15461p() {
        d5w d5wVarM35033a = d5w.m35033a(this.episodeType_);
        return d5wVarM35033a == null ? d5w.UNKNOWN : d5wVarM35033a;
    }

    /* JADX INFO: renamed from: q */
    public final ImageGroup$ProtoImageGroup m15462q() {
        ImageGroup$ProtoImageGroup imageGroup$ProtoImageGroup = this.freezeFrames_;
        return imageGroup$ProtoImageGroup == null ? ImageGroup$ProtoImageGroup.m15473n() : imageGroup$ProtoImageGroup;
    }

    /* JADX INFO: renamed from: r */
    public final e5w m15463r() {
        e5w e5wVarM37834a = e5w.m37834a(this.mediaTypeEnum_);
        return e5wVarM37834a == null ? e5w.VODCAST : e5wVarM37834a;
    }

    /* JADX INFO: renamed from: s */
    public final EpisodeMetadata$ProtoEpisodeShowMetadata m15464s() {
        EpisodeMetadata$ProtoEpisodeShowMetadata episodeMetadata$ProtoEpisodeShowMetadata = this.show_;
        return episodeMetadata$ProtoEpisodeShowMetadata == null ? EpisodeMetadata$ProtoEpisodeShowMetadata.m15465o() : episodeMetadata$ProtoEpisodeShowMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
