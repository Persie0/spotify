package com.spotify.watchfeedextensions.component.item.p192v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeedentrypoints.common.p189v1.VideoFile;
import p204p.eyc1;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class WatchFeedVideoCardComponent extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_TEXT_FIELD_NUMBER = 10;
    public static final int DECISION_ID_FIELD_NUMBER = 12;
    private static final WatchFeedVideoCardComponent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 8;
    public static final int IS_19PLUS_FIELD_NUMBER = 7;
    public static final int IS_ANIMATED_FIELD_NUMBER = 6;
    public static final int IS_EXPLICIT_FIELD_NUMBER = 5;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 4;
    public static final int OVERLINE_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int PORTRAIT_HORIZONTAL_FOCUS_CENTER_PERCENTAGE_FIELD_NUMBER = 13;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int THUMBNAIL_IMAGE_URL_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int VIDEO_FILE_FIELD_NUMBER = 9;
    private int bitField0_;
    private boolean is19Plus_;
    private boolean isAnimated_;
    private boolean isExplicit_;
    private double portraitHorizontalFocusCenterPercentage_;
    private VideoFile videoFile_;
    private String title_ = "";
    private String subtitle_ = "";
    private String thumbnailImageUrl_ = "";
    private String navigateUri_ = "";
    private String entityUri_ = "";
    private String accessibilityText_ = "";
    private String overline_ = "";
    private String decisionId_ = "";

    static {
        WatchFeedVideoCardComponent watchFeedVideoCardComponent = new WatchFeedVideoCardComponent();
        DEFAULT_INSTANCE = watchFeedVideoCardComponent;
        AbstractC0269h.registerDefaultInstance(WatchFeedVideoCardComponent.class, watchFeedVideoCardComponent);
    }

    private WatchFeedVideoCardComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: x */
    public static WatchFeedVideoCardComponent m23029x(gva gvaVar) {
        return (WatchFeedVideoCardComponent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\u0007\u0006\u0007\u0007\u0007\bȈ\tဉ\u0000\nȈ\u000bȈ\fȈ\rက\u0001", new Object[]{"bitField0_", "title_", "subtitle_", "thumbnailImageUrl_", "navigateUri_", "isExplicit_", "isAnimated_", "is19Plus_", "entityUri_", "videoFile_", "accessibilityText_", "overline_", "decisionId_", "portraitHorizontalFocusCenterPercentage_"});
        }
        if (iOrdinal == 3) {
            return new WatchFeedVideoCardComponent();
        }
        if (iOrdinal == 4) {
            return new eyc1(DEFAULT_INSTANCE, 21);
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
        synchronized (WatchFeedVideoCardComponent.class) {
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

    public final boolean getIsExplicit() {
        return this.isExplicit_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m23030n() {
        return this.accessibilityText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m23031o() {
        return this.decisionId_;
    }

    /* JADX INFO: renamed from: p */
    public final String m23032p() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m23033q() {
        return this.is19Plus_;
    }

    /* JADX INFO: renamed from: r */
    public final String m23034r() {
        return this.navigateUri_;
    }

    /* JADX INFO: renamed from: s */
    public final String m23035s() {
        return this.overline_;
    }

    /* JADX INFO: renamed from: t */
    public final double m23036t() {
        return this.portraitHorizontalFocusCenterPercentage_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m23037u() {
        return this.thumbnailImageUrl_;
    }

    /* JADX INFO: renamed from: v */
    public final VideoFile m23038v() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.m22984n() : videoFile;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m23039w() {
        return (this.bitField0_ & 2) != 0;
    }
}
