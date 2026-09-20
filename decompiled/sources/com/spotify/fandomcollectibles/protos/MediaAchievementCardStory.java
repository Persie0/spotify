package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z9d0;

/* JADX INFO: loaded from: classes6.dex */
public final class MediaAchievementCardStory extends AbstractC0269h implements sre0 {
    public static final int ACHIEVEMENT_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 9;
    public static final int ACHIEVEMENT_CONTENT_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 10;
    public static final int ACHIEVEMENT_DATE_FIELD_NUMBER = 19;
    public static final int ACHIEVEMENT_DATE_TITLE_FIELD_NUMBER = 18;
    public static final int ACHIEVEMENT_HEADER_FIELD_NUMBER = 14;
    public static final int ACHIEVEMENT_MAIN_IMAGE_URL_FIELD_NUMBER = 11;
    public static final int ACHIEVEMENT_PRIMARY_TITLE_FIELD_NUMBER = 17;
    public static final int ACHIEVEMENT_SECONDARY_TITLE_FIELD_NUMBER = 16;
    public static final int ACHIEVEMENT_STORY_TITLE_FIELD_NUMBER = 13;
    public static final int ACHIEVEMENT_TERTIARY_TITLE_FIELD_NUMBER = 15;
    public static final int BASE_FIELD_NUMBER = 1;
    private static final MediaAchievementCardStory DEFAULT_INSTANCE;
    public static final int MEDIA_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int MEDIA_CANVAS_URL_FIELD_NUMBER = 7;
    public static final int MEDIA_MAIN_IMAGE_URL_FIELD_NUMBER = 6;
    public static final int MEDIA_MEDIA_TYPE_FIELD_NUMBER = 8;
    public static final int MEDIA_SUBTITLE_FIELD_NUMBER = 5;
    public static final int MEDIA_TITLE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_LABEL_FIELD_NUMBER = 20;
    public static final int SHARE_DATA_FIELD_NUMBER = 21;
    public static final int STORY_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 2;
    private Text achievementDateTitle_;
    private Text achievementDate_;
    private Text achievementHeader_;
    private Text achievementPrimaryTitle_;
    private Text achievementSecondaryTitle_;
    private Text achievementStoryTitle_;
    private Text achievementTertiaryTitle_;
    private BaseStory base_;
    private int bitField0_;
    private int mediaMediaType_;
    private Text mediaSubtitle_;
    private Text mediaTitle_;
    private ShareData shareData_;
    private String storyBackgroundImageUrl_ = "";
    private String mediaBackgroundImageUrl_ = "";
    private String mediaMainImageUrl_ = "";
    private String mediaCanvasUrl_ = "";
    private String achievementBackgroundImageUrl_ = "";
    private String achievementContentBackgroundImageUrl_ = "";
    private String achievementMainImageUrl_ = "";
    private String premiumLabel_ = "";

    static {
        MediaAchievementCardStory mediaAchievementCardStory = new MediaAchievementCardStory();
        DEFAULT_INSTANCE = mediaAchievementCardStory;
        AbstractC0269h.registerDefaultInstance(MediaAchievementCardStory.class, mediaAchievementCardStory);
    }

    private MediaAchievementCardStory() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: y */
    public static MediaAchievementCardStory m10908y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m10909A() {
        return this.mediaCanvasUrl_;
    }

    /* JADX INFO: renamed from: B */
    public final String m10910B() {
        return this.mediaMainImageUrl_;
    }

    /* JADX INFO: renamed from: C */
    public final z9d0 m10911C() {
        z9d0 z9d0Var;
        int i = this.mediaMediaType_;
        if (i == 0) {
            z9d0Var = z9d0.MEDIA_CARD_MEDIA_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            z9d0Var = i != 2 ? null : z9d0.CANVAS;
        } else {
            z9d0Var = z9d0.IMAGE;
        }
        return z9d0Var == null ? z9d0.UNRECOGNIZED : z9d0Var;
    }

    /* JADX INFO: renamed from: D */
    public final Text m10912D() {
        Text text = this.mediaSubtitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: E */
    public final Text m10913E() {
        Text text = this.mediaTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: F */
    public final String m10914F() {
        return this.premiumLabel_;
    }

    /* JADX INFO: renamed from: G */
    public final ShareData m10915G() {
        ShareData shareData = this.shareData_;
        return shareData == null ? ShareData.m10929n() : shareData;
    }

    /* JADX INFO: renamed from: H */
    public final String m10916H() {
        return this.storyBackgroundImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0014\u0000\u0001\u0001\u0015\u0014\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004ဉ\u0001\u0005ဉ\u0002\u0006Ȉ\u0007Ȉ\b\f\tȈ\nȈ\u000bȈ\rဉ\u0003\u000eဉ\u0004\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014Ȉ\u0015ဉ\n", new Object[]{"bitField0_", "base_", "storyBackgroundImageUrl_", "mediaBackgroundImageUrl_", "mediaTitle_", "mediaSubtitle_", "mediaMainImageUrl_", "mediaCanvasUrl_", "mediaMediaType_", "achievementBackgroundImageUrl_", "achievementContentBackgroundImageUrl_", "achievementMainImageUrl_", "achievementStoryTitle_", "achievementHeader_", "achievementTertiaryTitle_", "achievementSecondaryTitle_", "achievementPrimaryTitle_", "achievementDateTitle_", "achievementDate_", "premiumLabel_", "shareData_"});
        }
        if (iOrdinal == 3) {
            return new MediaAchievementCardStory();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 29);
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
        synchronized (MediaAchievementCardStory.class) {
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
    public final String m10917n() {
        return this.achievementBackgroundImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10918o() {
        return this.achievementContentBackgroundImageUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final Text m10919p() {
        Text text = this.achievementDate_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: q */
    public final Text m10920q() {
        Text text = this.achievementDateTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: r */
    public final Text m10921r() {
        Text text = this.achievementHeader_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: s */
    public final String m10922s() {
        return this.achievementMainImageUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final Text m10923t() {
        Text text = this.achievementPrimaryTitle_;
        return text == null ? Text.m10950n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Text m10924u() {
        Text text = this.achievementSecondaryTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: v */
    public final Text m10925v() {
        Text text = this.achievementStoryTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: w */
    public final Text m10926w() {
        Text text = this.achievementTertiaryTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: x */
    public final BaseStory m10927x() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m10795q() : baseStory;
    }

    /* JADX INFO: renamed from: z */
    public final String m10928z() {
        return this.mediaBackgroundImageUrl_;
    }
}
