package com.spotify.watchfeedextensions.api.p191v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.contentagnostic.p051v2.ColorSetContrastOptions;
import com.spotify.watchfeedextensions.component.model.p193v1.Image;
import com.spotify.watchfeedextensions.component.model.p193v1.VideoFile;
import p204p.eyc1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class WatchFeedSeedItemTrait extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 7;
    public static final int COLOR_SET_CONTRAST_OPTIONS_FIELD_NUMBER = 9;
    public static final int COVER_IMAGE_FIELD_NUMBER = 5;
    private static final WatchFeedSeedItemTrait DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 10;
    public static final int LOGO_IMAGE_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int PORTRAIT_HORIZONTAL_FOCUS_CENTER_PERCENTAGE_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEO_FILE_FIELD_NUMBER = 4;
    public static final int VIDEO_THUMBNAIL_IMAGE_FIELD_NUMBER = 3;
    private int bitField0_;
    private ColorSetContrastOptions colorSetContrastOptions_;
    private Image coverImage_;
    private Image logoImage_;
    private double portraitHorizontalFocusCenterPercentage_;
    private VideoFile videoFile_;
    private Image videoThumbnailImage_;
    private String uri_ = "";
    private String title_ = "";
    private String accessibilityText_ = "";
    private String firstItemUri_ = "";

    static {
        WatchFeedSeedItemTrait watchFeedSeedItemTrait = new WatchFeedSeedItemTrait();
        DEFAULT_INSTANCE = watchFeedSeedItemTrait;
        AbstractC0269h.registerDefaultInstance(WatchFeedSeedItemTrait.class, watchFeedSeedItemTrait);
    }

    private WatchFeedSeedItemTrait() {
    }

    /* JADX INFO: renamed from: B */
    public static WatchFeedSeedItemTrait m22989B(byte[] bArr) {
        return (WatchFeedSeedItemTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m22990A() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006က\u0003\u0007Ȉ\bဉ\u0004\tဉ\u0005\nȈ", new Object[]{"bitField0_", "uri_", "title_", "videoThumbnailImage_", "videoFile_", "coverImage_", "portraitHorizontalFocusCenterPercentage_", "accessibilityText_", "logoImage_", "colorSetContrastOptions_", "firstItemUri_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedSeedItemTrait();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 19);
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
        synchronized (WatchFeedSeedItemTrait.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22991n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ColorSetContrastOptions m22992o() {
        ColorSetContrastOptions colorSetContrastOptions = this.colorSetContrastOptions_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.m7804o() : colorSetContrastOptions;
    }

    /* JADX INFO: renamed from: p */
    public final Image m22993p() {
        Image image = this.coverImage_;
        return image == null ? Image.m23040n() : image;
    }

    /* JADX INFO: renamed from: q */
    public final String m22994q() {
        return this.firstItemUri_;
    }

    /* JADX INFO: renamed from: r */
    public final Image m22995r() {
        Image image = this.logoImage_;
        return image == null ? Image.m23040n() : image;
    }

    /* JADX INFO: renamed from: s */
    public final double m22996s() {
        return this.portraitHorizontalFocusCenterPercentage_;
    }

    /* JADX INFO: renamed from: t */
    public final VideoFile m22997t() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.m23042n() : videoFile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Image m22998u() {
        Image image = this.videoThumbnailImage_;
        return image == null ? Image.m23040n() : image;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m22999v() {
        return (this.bitField0_ & 32) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m23000w() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m23001x() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m23002y() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m23003z() {
        return (this.bitField0_ & 2) != 0;
    }
}
