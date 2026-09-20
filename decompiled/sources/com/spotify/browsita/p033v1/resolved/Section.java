package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class Section extends AbstractC0269h implements sre0 {
    public static final int AUDIO_PROMO_FIELD_NUMBER = 8;
    public static final int AUDIO_SPOTLIGHT_FIELD_NUMBER = 12;
    public static final int BRAND_ADS_FIELD_NUMBER = 6;
    public static final int CONTENT_CATEGORY_FIELD_NUMBER = 2;
    private static final Section DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_LINK_PROMO_FIELD_NUMBER = 9;
    public static final int PREVIEW_PROMOTION_CAROUSEL_FIELD_NUMBER = 10;
    public static final int PROMOTION_V1_FIELD_NUMBER = 3;
    public static final int PROMOTION_V3_FIELD_NUMBER = 5;
    public static final int SECTION_INFO_FIELD_NUMBER = 1;
    public static final int SHOWCASE_FIELD_NUMBER = 7;
    public static final int VIDEO_PROMO_FIELD_NUMBER = 11;
    public static final int WATCH_FEED_FIELD_NUMBER = 4;
    private int bitField0_;
    private SectionInfo sectionInfo_;
    private int sectionTypeCase_ = 0;
    private Object sectionType_;

    static {
        Section section = new Section();
        DEFAULT_INSTANCE = section;
        AbstractC0269h.registerDefaultInstance(Section.class, section);
    }

    private Section() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0001\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000", new Object[]{"sectionType_", "sectionTypeCase_", "bitField0_", "sectionInfo_", ContentCategory.class, PromotionV1.class, WatchFeed.class, PromotionV3.class, BrandAds.class, Showcase.class, AudioPromo.class, PlayLinkPromo.class, PreviewPromotionCarousel.class, VideoPromo.class, AudioSpotlight.class});
        }
        if (iOrdinal == 3) {
            return new Section();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 8);
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
        synchronized (Section.class) {
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
    public final AudioPromo m4114n() {
        return this.sectionTypeCase_ == 8 ? (AudioPromo) this.sectionType_ : AudioPromo.m4053o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final AudioSpotlight m4115o() {
        return this.sectionTypeCase_ == 12 ? (AudioSpotlight) this.sectionType_ : AudioSpotlight.m4058o();
    }

    /* JADX INFO: renamed from: p */
    public final BrandAds m4116p() {
        return this.sectionTypeCase_ == 6 ? (BrandAds) this.sectionType_ : BrandAds.m4063p();
    }

    /* JADX INFO: renamed from: q */
    public final ContentCategory m4117q() {
        return this.sectionTypeCase_ == 2 ? (ContentCategory) this.sectionType_ : ContentCategory.m4068n();
    }

    /* JADX INFO: renamed from: r */
    public final PlayLinkPromo m4118r() {
        return this.sectionTypeCase_ == 9 ? (PlayLinkPromo) this.sectionType_ : PlayLinkPromo.m4088o();
    }

    /* JADX INFO: renamed from: s */
    public final PreviewPromotionCarousel m4119s() {
        return this.sectionTypeCase_ == 10 ? (PreviewPromotionCarousel) this.sectionType_ : PreviewPromotionCarousel.m4094o();
    }

    /* JADX INFO: renamed from: t */
    public final PromotionV1 m4120t() {
        return this.sectionTypeCase_ == 3 ? (PromotionV1) this.sectionType_ : PromotionV1.m4100o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final PromotionV3 m4121u() {
        return this.sectionTypeCase_ == 5 ? (PromotionV3) this.sectionType_ : PromotionV3.m4105o();
    }

    /* JADX INFO: renamed from: v */
    public final SectionInfo m4122v() {
        SectionInfo sectionInfo = this.sectionInfo_;
        return sectionInfo == null ? SectionInfo.m4127n() : sectionInfo;
    }

    /* JADX INFO: renamed from: w */
    public final int m4123w() {
        int i = this.sectionTypeCase_;
        if (i == 0) {
            return 12;
        }
        switch (i) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 9;
            case 11:
                return 10;
            case 12:
                return 11;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: x */
    public final Showcase m4124x() {
        return this.sectionTypeCase_ == 7 ? (Showcase) this.sectionType_ : Showcase.m4129p();
    }

    /* JADX INFO: renamed from: y */
    public final VideoPromo m4125y() {
        return this.sectionTypeCase_ == 11 ? (VideoPromo) this.sectionType_ : VideoPromo.m4142o();
    }

    /* JADX INFO: renamed from: z */
    public final WatchFeed m4126z() {
        return this.sectionTypeCase_ == 4 ? (WatchFeed) this.sectionType_ : WatchFeed.m4147n();
    }
}
