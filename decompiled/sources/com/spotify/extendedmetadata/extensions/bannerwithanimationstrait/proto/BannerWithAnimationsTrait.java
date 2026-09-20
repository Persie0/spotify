package com.spotify.extendedmetadata.extensions.bannerwithanimationstrait.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class BannerWithAnimationsTrait extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 8;
    public static final int BOTTOM_ANIMATION_FIELD_NUMBER = 14;
    public static final int BOTTOM_ANIMATION_URL_FIELD_NUMBER = 6;
    public static final int CTA_BACKGROUND_COLOR_FIELD_NUMBER = 9;
    public static final int CTA_FOREGROUND_COLOR_FIELD_NUMBER = 10;
    public static final int CTA_TEXT_FIELD_NUMBER = 11;
    private static final BannerWithAnimationsTrait DEFAULT_INSTANCE;
    public static final int NAVIGATE_URI_FIELD_NUMBER = 4;
    public static final int OVERLAY_ANIMATION_FIELD_NUMBER = 15;
    public static final int OVERLAY_ANIMATION_URL_FIELD_NUMBER = 12;
    private static volatile r2n0 PARSER = null;
    public static final int STROKE_ANIMATION_FIELD_NUMBER = 16;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TEXT_COLOR_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int TOP_ANIMATION_FIELD_NUMBER = 13;
    public static final int TOP_ANIMATION_URL_FIELD_NUMBER = 5;
    private int bitField0_;
    private RiveAnimation bottomAnimation_;
    private RiveAnimation overlayAnimation_;
    private RiveAnimation strokeAnimation_;
    private RiveAnimation topAnimation_;
    private String title_ = "";
    private String subtitle_ = "";
    private String navigateUri_ = "";
    private String topAnimationUrl_ = "";
    private String bottomAnimationUrl_ = "";
    private String textColor_ = "";
    private String backgroundColor_ = "";
    private String ctaBackgroundColor_ = "";
    private String ctaForegroundColor_ = "";
    private String ctaText_ = "";
    private String overlayAnimationUrl_ = "";

    static {
        BannerWithAnimationsTrait bannerWithAnimationsTrait = new BannerWithAnimationsTrait();
        DEFAULT_INSTANCE = bannerWithAnimationsTrait;
        AbstractC0269h.registerDefaultInstance(BannerWithAnimationsTrait.class, bannerWithAnimationsTrait);
    }

    private BannerWithAnimationsTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: z */
    public static BannerWithAnimationsTrait m9868z(byte[] bArr) {
        return (BannerWithAnimationsTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rဉ\u0000\u000eဉ\u0001\u000fဉ\u0002\u0010ဉ\u0003", new Object[]{"bitField0_", "title_", "subtitle_", "navigateUri_", "topAnimationUrl_", "bottomAnimationUrl_", "textColor_", "backgroundColor_", "ctaBackgroundColor_", "ctaForegroundColor_", "ctaText_", "overlayAnimationUrl_", "topAnimation_", "bottomAnimation_", "overlayAnimation_", "strokeAnimation_"});
        }
        if (iOrdinal == 3) {
            return new BannerWithAnimationsTrait();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 27);
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
        synchronized (BannerWithAnimationsTrait.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m9869n() {
        return this.backgroundColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final RiveAnimation m9870o() {
        RiveAnimation riveAnimation = this.bottomAnimation_;
        return riveAnimation == null ? RiveAnimation.m9881n() : riveAnimation;
    }

    /* JADX INFO: renamed from: p */
    public final String m9871p() {
        return this.ctaBackgroundColor_;
    }

    /* JADX INFO: renamed from: q */
    public final String m9872q() {
        return this.ctaForegroundColor_;
    }

    /* JADX INFO: renamed from: r */
    public final String m9873r() {
        return this.ctaText_;
    }

    /* JADX INFO: renamed from: s */
    public final String m9874s() {
        return this.navigateUri_;
    }

    /* JADX INFO: renamed from: t */
    public final RiveAnimation m9875t() {
        RiveAnimation riveAnimation = this.overlayAnimation_;
        return riveAnimation == null ? RiveAnimation.m9881n() : riveAnimation;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final RiveAnimation m9876u() {
        RiveAnimation riveAnimation = this.strokeAnimation_;
        return riveAnimation == null ? RiveAnimation.m9881n() : riveAnimation;
    }

    /* JADX INFO: renamed from: v */
    public final String m9877v() {
        return this.textColor_;
    }

    /* JADX INFO: renamed from: w */
    public final RiveAnimation m9878w() {
        RiveAnimation riveAnimation = this.topAnimation_;
        return riveAnimation == null ? RiveAnimation.m9881n() : riveAnimation;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m9879x() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m9880y() {
        return (this.bitField0_ & 8) != 0;
    }
}
