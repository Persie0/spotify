package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes.dex */
public final class ColorSetContrastOptions extends AbstractC0269h implements sre0 {
    private static final ColorSetContrastOptions DEFAULT_INSTANCE;
    public static final int ENCORE_BASE_SET_TEXT_COLOR_FIELD_NUMBER = 4;
    public static final int HIGHER_CONTRAST_FIELD_NUMBER = 3;
    public static final int HIGH_CONTRAST_FIELD_NUMBER = 2;
    public static final int MIN_CONTRAST_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private RgbaColor encoreBaseSetTextColor_;
    private ColorSet highContrast_;
    private ColorSet higherContrast_;
    private ColorSet minContrast_;

    static {
        ColorSetContrastOptions colorSetContrastOptions = new ColorSetContrastOptions();
        DEFAULT_INSTANCE = colorSetContrastOptions;
        AbstractC0269h.registerDefaultInstance(ColorSetContrastOptions.class, colorSetContrastOptions);
    }

    private ColorSetContrastOptions() {
    }

    /* JADX INFO: renamed from: o */
    public static ColorSetContrastOptions m7804o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "minContrast_", "highContrast_", "higherContrast_", "encoreBaseSetTextColor_"});
        }
        if (iOrdinal == 3) {
            return new ColorSetContrastOptions();
        }
        if (iOrdinal == 4) {
            return new z3f(21);
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
        synchronized (ColorSetContrastOptions.class) {
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

    /* JADX INFO: renamed from: p */
    public final RgbaColor m7805p() {
        RgbaColor rgbaColor = this.encoreBaseSetTextColor_;
        return rgbaColor == null ? RgbaColor.m7933q() : rgbaColor;
    }

    /* JADX INFO: renamed from: q */
    public final ColorSet m7806q() {
        ColorSet colorSet = this.highContrast_;
        return colorSet == null ? ColorSet.m7792q() : colorSet;
    }

    /* JADX INFO: renamed from: r */
    public final ColorSet m7807r() {
        ColorSet colorSet = this.higherContrast_;
        return colorSet == null ? ColorSet.m7792q() : colorSet;
    }

    /* JADX INFO: renamed from: s */
    public final ColorSet m7808s() {
        ColorSet colorSet = this.minContrast_;
        return colorSet == null ? ColorSet.m7792q() : colorSet;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7809t() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7810u() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7811v() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7812w() {
        return (this.bitField0_ & 1) != 0;
    }
}
