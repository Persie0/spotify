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
public final class ColorSet extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_BASE_FIELD_NUMBER = 1;
    public static final int BACKGROUND_TINTED_BASE_FIELD_NUMBER = 2;
    private static final ColorSet DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_BASE_FIELD_NUMBER = 3;
    public static final int TEXT_BRIGHT_ACCENT_FIELD_NUMBER = 5;
    public static final int TEXT_SUBDUED_FIELD_NUMBER = 4;
    private RgbaColor backgroundBase_;
    private RgbaColor backgroundTintedBase_;
    private int bitField0_;
    private RgbaColor textBase_;
    private RgbaColor textBrightAccent_;
    private RgbaColor textSubdued_;

    static {
        ColorSet colorSet = new ColorSet();
        DEFAULT_INSTANCE = colorSet;
        AbstractC0269h.registerDefaultInstance(ColorSet.class, colorSet);
    }

    private ColorSet() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ColorSet m7792q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "backgroundBase_", "backgroundTintedBase_", "textBase_", "textSubdued_", "textBrightAccent_"});
        }
        if (iOrdinal == 3) {
            return new ColorSet();
        }
        if (iOrdinal == 4) {
            return new z3f(20);
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
        synchronized (ColorSet.class) {
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
    public final RgbaColor m7793o() {
        RgbaColor rgbaColor = this.backgroundBase_;
        return rgbaColor == null ? RgbaColor.m7933q() : rgbaColor;
    }

    /* JADX INFO: renamed from: p */
    public final RgbaColor m7794p() {
        RgbaColor rgbaColor = this.backgroundTintedBase_;
        return rgbaColor == null ? RgbaColor.m7933q() : rgbaColor;
    }

    /* JADX INFO: renamed from: r */
    public final RgbaColor m7795r() {
        RgbaColor rgbaColor = this.textBase_;
        return rgbaColor == null ? RgbaColor.m7933q() : rgbaColor;
    }

    /* JADX INFO: renamed from: s */
    public final RgbaColor m7796s() {
        RgbaColor rgbaColor = this.textBrightAccent_;
        return rgbaColor == null ? RgbaColor.m7933q() : rgbaColor;
    }

    /* JADX INFO: renamed from: t */
    public final RgbaColor m7797t() {
        RgbaColor rgbaColor = this.textSubdued_;
        return rgbaColor == null ? RgbaColor.m7933q() : rgbaColor;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7798u() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7799v() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m7800w() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m7801x() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7802y() {
        return (this.bitField0_ & 8) != 0;
    }
}
