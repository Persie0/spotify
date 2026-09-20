package com.spotify.culturalmoments.stories.p056v1;

import com.google.protobuf.AbstractC0269h;
import p204p.mlx;
import p204p.ore0;
import p204p.pre0;
import p204p.qgy;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class FeaturedCardStory extends AbstractC0269h implements sre0 {
    public static final int BASE_FIELD_NUMBER = 1;
    public static final int CARD_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 9;
    public static final int CARD_MAIN_IMAGE_URL_FIELD_NUMBER = 6;
    private static final FeaturedCardStory DEFAULT_INSTANCE;
    public static final int LABEL_FIELD_NUMBER = 10;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SHARE_DATA_FIELD_NUMBER = 4;
    public static final int STORY_BACKGROUND_IMAGE_URL_FIELD_NUMBER = 8;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int VIDEO_MANIFEST_ID_FIELD_NUMBER = 7;
    private BaseStory base_;
    private int bitField0_;
    private int mediaType_;
    private ShareData shareData_;
    private Text subtitle_;
    private Text title_;
    private String cardMainImageUrl_ = "";
    private String videoManifestId_ = "";
    private String storyBackgroundImageUrl_ = "";
    private String cardBackgroundImageUrl_ = "";
    private String label_ = "";

    static {
        FeaturedCardStory featuredCardStory = new FeaturedCardStory();
        DEFAULT_INSTANCE = featuredCardStory;
        AbstractC0269h.registerDefaultInstance(FeaturedCardStory.class, featuredCardStory);
    }

    private FeaturedCardStory() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static FeaturedCardStory m9065q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\f\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ", new Object[]{"bitField0_", "base_", "title_", "subtitle_", "shareData_", "mediaType_", "cardMainImageUrl_", "videoManifestId_", "storyBackgroundImageUrl_", "cardBackgroundImageUrl_", "label_"});
        }
        if (iOrdinal == 3) {
            return new FeaturedCardStory();
        }
        if (iOrdinal == 4) {
            return new mlx(DEFAULT_INSTANCE, 15);
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
        synchronized (FeaturedCardStory.class) {
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
    public final BaseStory m9066n() {
        BaseStory baseStory = this.base_;
        return baseStory == null ? BaseStory.m9056p() : baseStory;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9067o() {
        return this.cardBackgroundImageUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m9068p() {
        return this.cardMainImageUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final String m9069r() {
        return this.label_;
    }

    /* JADX INFO: renamed from: s */
    public final qgy m9070s() {
        qgy qgyVar;
        int i = this.mediaType_;
        if (i == 0) {
            qgyVar = qgy.FEATURED_CARD_MEDIA_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            qgyVar = i != 2 ? null : qgy.FEATURED_CARD_VIDEO;
        } else {
            qgyVar = qgy.FEATURED_CARD_IMAGE;
        }
        return qgyVar == null ? qgy.UNRECOGNIZED : qgyVar;
    }

    /* JADX INFO: renamed from: t */
    public final ShareData m9071t() {
        ShareData shareData = this.shareData_;
        return shareData == null ? ShareData.m9092n() : shareData;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m9072u() {
        return this.storyBackgroundImageUrl_;
    }

    /* JADX INFO: renamed from: v */
    public final Text m9073v() {
        Text text = this.subtitle_;
        return text == null ? Text.m9100n() : text;
    }

    /* JADX INFO: renamed from: w */
    public final Text m9074w() {
        Text text = this.title_;
        return text == null ? Text.m9100n() : text;
    }

    /* JADX INFO: renamed from: x */
    public final String m9075x() {
        return this.videoManifestId_;
    }
}
