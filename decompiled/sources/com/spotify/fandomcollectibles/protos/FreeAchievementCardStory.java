package com.spotify.fandomcollectibles.protos;

import com.google.protobuf.AbstractC0269h;
import p204p.byy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class FreeAchievementCardStory extends AbstractC0269h implements sre0 {
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int BLUR_COLOR_FIELD_NUMBER = 14;
    public static final int CARD_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int CARD_DATE_TITLE_FIELD_NUMBER = 11;
    public static final int CARD_FRAME_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int CARD_HEADER_FIELD_NUMBER = 9;
    public static final int CARD_MAIN_IMAGE_URL_FIELD_NUMBER = 5;
    public static final int CARD_TITLE_FIELD_NUMBER = 10;
    public static final int DEFAULT_CARD_IMAGE_URL_FIELD_NUMBER = 16;
    private static final FreeAchievementCardStory DEFAULT_INSTANCE;
    public static final int LOCK_IMAGE_URL_FIELD_NUMBER = 15;
    private static volatile r2n0 PARSER = null;
    public static final int PREMIUM_LABEL_FIELD_NUMBER = 12;
    public static final int STORY_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 2;
    public static final int STORY_DESCRIPTION_FIELD_NUMBER = 8;
    public static final int STORY_SUBTITLE_FIELD_NUMBER = 7;
    public static final int STORY_TITLE_FIELD_NUMBER = 6;
    public static final int UPSELL_BUTTON_FIELD_NUMBER = 13;
    private BaseStory base_;
    private int bitField0_;
    private Text cardDateTitle_;
    private Text cardHeader_;
    private Text cardTitle_;
    private Text storyDescription_;
    private Text storySubtitle_;
    private Text storyTitle_;
    private LinkButton upsellButton_;
    private String storyBackgroundImageUrl_ = "";
    private String cardFrameBackgroundImageUrl_ = "";
    private String cardBackgroundImageUrl_ = "";
    private String cardMainImageUrl_ = "";
    private String premiumLabel_ = "";
    private String blurColor_ = "";
    private String lockImageUrl_ = "";
    private String defaultCardImageUrl_ = "";

    static {
        FreeAchievementCardStory freeAchievementCardStory = new FreeAchievementCardStory();
        DEFAULT_INSTANCE = freeAchievementCardStory;
        AbstractC0269h.registerDefaultInstance(FreeAchievementCardStory.class, freeAchievementCardStory);
    }

    private FreeAchievementCardStory() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static FreeAchievementCardStory m10837w() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final Text m10838A() {
        Text text = this.storyDescription_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: B */
    public final Text m10839B() {
        Text text = this.storySubtitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: C */
    public final Text m10840C() {
        Text text = this.storyTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: D */
    public final LinkButton m10841D() {
        LinkButton linkButton = this.upsellButton_;
        return linkButton == null ? LinkButton.m10884o() : linkButton;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fȈ\rဉ\u0007\u000eȈ\u000fȈ\u0010Ȉ", new Object[]{"bitField0_", "base_", "storyBackgroundImageUrl_", "cardFrameBackgroundImageUrl_", "cardBackgroundImageUrl_", "cardMainImageUrl_", "storyTitle_", "storySubtitle_", "storyDescription_", "cardHeader_", "cardTitle_", "cardDateTitle_", "premiumLabel_", "upsellButton_", "blurColor_", "lockImageUrl_", "defaultCardImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new FreeAchievementCardStory();
        }
        if (iOrdinal == 4) {
            return new byy(DEFAULT_INSTANCE, 24);
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
        synchronized (FreeAchievementCardStory.class) {
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
    public final BaseStory m10842n() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m10795q() : baseStory;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m10843o() {
        return this.blurColor_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10844p() {
        return this.cardBackgroundImageUrl_;
    }

    /* JADX INFO: renamed from: q */
    public final Text m10845q() {
        Text text = this.cardDateTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: r */
    public final String m10846r() {
        return this.cardFrameBackgroundImageUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final Text m10847s() {
        Text text = this.cardHeader_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: t */
    public final String m10848t() {
        return this.cardMainImageUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Text m10849u() {
        Text text = this.cardTitle_;
        return text == null ? Text.m10950n() : text;
    }

    /* JADX INFO: renamed from: v */
    public final String m10850v() {
        return this.defaultCardImageUrl_;
    }

    /* JADX INFO: renamed from: x */
    public final String m10851x() {
        return this.lockImageUrl_;
    }

    /* JADX INFO: renamed from: y */
    public final String m10852y() {
        return this.premiumLabel_;
    }

    /* JADX INFO: renamed from: z */
    public final String m10853z() {
        return this.storyBackgroundImageUrl_;
    }
}
