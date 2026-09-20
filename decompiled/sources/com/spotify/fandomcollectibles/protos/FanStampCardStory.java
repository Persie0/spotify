package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class FanStampCardStory extends AbstractC0269h implements sre0 {
    public static final int ACHIEVED_DATE_FIELD_NUMBER = 9;
    public static final int BACK_CARD_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 16;
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int CATEGORY_TITLE_FIELD_NUMBER = 8;
    public static final int COLLECTIBLE_NAME_FIELD_NUMBER = 7;
    private static final FanStampCardStory DEFAULT_INSTANCE;
    public static final int ENTITY_IMAGE_URL_FIELD_NUMBER = 10;
    public static final int ENTITY_SUBTITLE_FIELD_NUMBER = 12;
    public static final int ENTITY_TITLE_FIELD_NUMBER = 11;
    public static final int FRONT_CARD_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_DATA_FIELD_NUMBER = 14;
    public static final int SPOTIFY_LOGO_COLOR_FIELD_NUMBER = 18;
    public static final int STORY_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int STORY_TITLE_FIELD_NUMBER = 13;
    private Text achievedDate_;
    private BaseStory base_;
    private int bitField0_;
    private Text categoryTitle_;
    private Text collectibleName_;
    private Text entitySubtitle_;
    private Text entityTitle_;
    private ShareData shareData_;
    private Text storyTitle_;
    private String storyBackgroundImageUrl_ = "";
    private String frontCardBackgroundImageUrl_ = "";
    private String entityImageUrl_ = "";
    private String backCardBackgroundImageUrl_ = "";
    private String spotifyLogoColor_ = "";

    static {
        FanStampCardStory fanStampCardStory = new FanStampCardStory();
        DEFAULT_INSTANCE = fanStampCardStory;
        AbstractC0269h.registerDefaultInstance(FanStampCardStory.class, fanStampCardStory);
    }

    private FanStampCardStory() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static FanStampCardStory m10823s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final Text m10824A() {
        Text text = this.storyTitle_;
        return text == null ? Text.m10950n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u0012\r\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0007ဉ\u0001\bဉ\u0002\tဉ\u0003\nȈ\u000bဉ\u0004\fဉ\u0005\rဉ\u0006\u000eဉ\u0007\u0010Ȉ\u0012Ȉ", new Object[]{"bitField0_", "base_", "storyBackgroundImageUrl_", "frontCardBackgroundImageUrl_", "collectibleName_", "categoryTitle_", "achievedDate_", "entityImageUrl_", "entityTitle_", "entitySubtitle_", "storyTitle_", "shareData_", "backCardBackgroundImageUrl_", "spotifyLogoColor_"});
        }
        if (iOrdinal == 3) {
            return new FanStampCardStory();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 13);
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
        synchronized (FanStampCardStory.class) {
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
    public final Text m10825n() {
        Text text = this.achievedDate_;
        return text == null ? Text.m10950n() : text;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10826o() {
        return this.backCardBackgroundImageUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final BaseStory m10827p() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m10795q() : baseStory;
    }

    /* JADX INFO: renamed from: q */
    public final Text m10828q() {
        Text text = this.categoryTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: r */
    public final Text m10829r() {
        Text text = this.collectibleName_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: t */
    public final String m10830t() {
        return this.entityImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Text m10831u() {
        Text text = this.entitySubtitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: v */
    public final Text m10832v() {
        Text text = this.entityTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: w */
    public final String m10833w() {
        return this.frontCardBackgroundImageUrl_;
    }

    /* JADX INFO: renamed from: x */
    public final ShareData m10834x() {
        ShareData shareData = this.shareData_;
        return shareData == null ? ShareData.m10929n() : shareData;
    }

    /* JADX INFO: renamed from: y */
    public final String m10835y() {
        return this.spotifyLogoColor_;
    }

    /* JADX INFO: renamed from: z */
    public final String m10836z() {
        return this.storyBackgroundImageUrl_;
    }
}
