package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class VisualIdentityTrait extends AbstractC0269h implements sre0 {
    public static final int CURATED_COLOR_FIELD_NUMBER = 7;
    private static final VisualIdentityTrait DEFAULT_INSTANCE;
    public static final int NINE_BY_SIXTEEN_COVER_VIDEO_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int SIXTEEN_BY_NINE_COVER_IMAGE_FIELD_NUMBER = 2;
    public static final int SQUARE_COVER_IMAGE_FIELD_NUMBER = 1;
    public static final int SQUARE_FULL_BLEED_IMAGE_FIELD_NUMBER = 5;
    public static final int WIDE_FULL_BLEED_IMAGE_FIELD_NUMBER = 6;
    private int bitField0_;
    private ColorSetContrastOptions curatedColor_;
    private Video nineBySixteenCoverVideo_;
    private Image sixteenByNineCoverImage_;
    private Image squareCoverImage_;
    private Image squareFullBleedImage_;
    private Image wideFullBleedImage_;

    static {
        VisualIdentityTrait visualIdentityTrait = new VisualIdentityTrait();
        DEFAULT_INSTANCE = visualIdentityTrait;
        AbstractC0269h.registerDefaultInstance(VisualIdentityTrait.class, visualIdentityTrait);
    }

    private VisualIdentityTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: y */
    public static VisualIdentityTrait m7977y(byte[] bArr) {
        return (VisualIdentityTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004ဉ\u0004\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0005", new Object[]{"bitField0_", "squareCoverImage_", "sixteenByNineCoverImage_", "nineBySixteenCoverVideo_", "squareFullBleedImage_", "wideFullBleedImage_", "curatedColor_"});
        }
        if (iOrdinal == 3) {
            return new VisualIdentityTrait();
        }
        if (iOrdinal == 4) {
            return new chb1(28);
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
        synchronized (VisualIdentityTrait.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ColorSetContrastOptions m7978o() {
        ColorSetContrastOptions colorSetContrastOptions = this.curatedColor_;
        return colorSetContrastOptions == null ? ColorSetContrastOptions.m7804o() : colorSetContrastOptions;
    }

    /* JADX INFO: renamed from: p */
    public final Video m7979p() {
        Video video = this.nineBySixteenCoverVideo_;
        return video == null ? Video.m7955p() : video;
    }

    /* JADX INFO: renamed from: q */
    public final Image m7980q() {
        Image image = this.sixteenByNineCoverImage_;
        return image == null ? Image.m7874o() : image;
    }

    /* JADX INFO: renamed from: r */
    public final Image m7981r() {
        Image image = this.squareCoverImage_;
        return image == null ? Image.m7874o() : image;
    }

    /* JADX INFO: renamed from: s */
    public final Image m7982s() {
        Image image = this.squareFullBleedImage_;
        return image == null ? Image.m7874o() : image;
    }

    /* JADX INFO: renamed from: t */
    public final Image m7983t() {
        Image image = this.wideFullBleedImage_;
        return image == null ? Image.m7874o() : image;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7984u() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7985v() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7986w() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7987x() {
        return (this.bitField0_ & 8) != 0;
    }
}
