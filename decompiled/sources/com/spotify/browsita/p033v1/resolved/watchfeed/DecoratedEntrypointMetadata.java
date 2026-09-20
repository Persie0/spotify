package com.spotify.browsita.p033v1.resolved.watchfeed;

import com.google.protobuf.AbstractC0269h;
import com.spotify.contentagnostic.p051v2.ColorSetContrastOptions;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class DecoratedEntrypointMetadata extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_FIELD_NUMBER = 9;
    public static final int COLOR_SET_CONTRAST_OPTIONS_FIELD_NUMBER = 14;
    public static final int COVER_IMAGE_FIELD_NUMBER = 10;
    public static final int DECISION_ID_FIELD_NUMBER = 11;
    private static final DecoratedEntrypointMetadata DEFAULT_INSTANCE;
    public static final int FIRST_ITEM_URI_FIELD_NUMBER = 2;
    public static final int LOGO_IMAGE_FIELD_NUMBER = 13;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 8;
    public static final int OVERLINE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PORTRAIT_HORIZONTAL_FOCUS_CENTER_PERCENTAGE_FIELD_NUMBER = 12;
    public static final int SUBTITLE_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEO_FILE_FIELD_NUMBER = 7;
    private int bitField0_;
    private ColorSetContrastOptions colorSetContrastOptions_;
    private Image coverImage_;
    private Image logoImage_;
    private double portraitHorizontalFocusCenterPercentage_;
    private Image thumbnailImage_;
    private VideoFile videoFile_;
    private String uri_ = "";
    private String firstItemUri_ = "";
    private String overline_ = "";
    private String title_ = "";
    private String subtitle_ = "";
    private String navigationUri_ = "";
    private String accessibility_ = "";
    private String decisionId_ = "";

    static {
        DecoratedEntrypointMetadata decoratedEntrypointMetadata = new DecoratedEntrypointMetadata();
        DEFAULT_INSTANCE = decoratedEntrypointMetadata;
        AbstractC0269h.registerDefaultInstance(DecoratedEntrypointMetadata.class, decoratedEntrypointMetadata);
    }

    private DecoratedEntrypointMetadata() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static DecoratedEntrypointMetadata m4157r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m4158A() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m4159B() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006ဉ\u0000\u0007ဉ\u0001\bȈ\tȈ\nဉ\u0002\u000bȈ\fက\u0003\rဉ\u0004\u000eဉ\u0005", new Object[]{"bitField0_", "uri_", "firstItemUri_", "overline_", "title_", "subtitle_", "thumbnailImage_", "videoFile_", "navigationUri_", "accessibility_", "coverImage_", "decisionId_", "portraitHorizontalFocusCenterPercentage_", "logoImage_", "colorSetContrastOptions_"});
        }
        if (iOrdinal == 3) {
            return new DecoratedEntrypointMetadata();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 26);
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
        synchronized (DecoratedEntrypointMetadata.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    public final String getUri() {
        return this.uri_;
    }

    /* JADX INFO: renamed from: n */
    public final String m4160n() {
        return this.accessibility_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ColorSetContrastOptions m4161o() {
        ColorSetContrastOptions colorSetContrastOptions = this.colorSetContrastOptions_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.m7804o() : colorSetContrastOptions;
    }

    /* JADX INFO: renamed from: p */
    public final Image m4162p() {
        Image image = this.coverImage_;
        return image == null ? Image.m4172n() : image;
    }

    /* JADX INFO: renamed from: q */
    public final String m4163q() {
        return this.decisionId_;
    }

    /* JADX INFO: renamed from: s */
    public final String m4164s() {
        return this.firstItemUri_;
    }

    /* JADX INFO: renamed from: t */
    public final Image m4165t() {
        Image image = this.logoImage_;
        return image == null ? Image.m4172n() : image;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m4166u() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: v */
    public final String m4167v() {
        return this.overline_;
    }

    /* JADX INFO: renamed from: w */
    public final double m4168w() {
        return this.portraitHorizontalFocusCenterPercentage_;
    }

    /* JADX INFO: renamed from: x */
    public final Image m4169x() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.m4172n() : image;
    }

    /* JADX INFO: renamed from: y */
    public final VideoFile m4170y() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.m4174n() : videoFile;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m4171z() {
        return (this.bitField0_ & 32) != 0;
    }
}
