package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class GradientBackgroundColor extends AbstractC0269h implements sre0 {
    private static final GradientBackgroundColor DEFAULT_INSTANCE;
    public static final int DEGREES_FIELD_NUMBER = 3;
    public static final int END_COLOR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int START_COLOR_FIELD_NUMBER = 1;
    private double degrees_;
    private String startColor_ = "";
    private String endColor_ = "";

    static {
        GradientBackgroundColor gradientBackgroundColor = new GradientBackgroundColor();
        DEFAULT_INSTANCE = gradientBackgroundColor;
        AbstractC0269h.registerDefaultInstance(GradientBackgroundColor.class, gradientBackgroundColor);
    }

    private GradientBackgroundColor() {
    }

    /* JADX INFO: renamed from: o */
    public static GradientBackgroundColor m17200o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0000", new Object[]{"startColor_", "endColor_", "degrees_"});
        }
        if (iOrdinal == 3) {
            return new GradientBackgroundColor();
        }
        if (iOrdinal == 4) {
            return new qb10(28);
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
        synchronized (GradientBackgroundColor.class) {
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
    public final double m17201p() {
        return this.degrees_;
    }

    /* JADX INFO: renamed from: q */
    public final String m17202q() {
        return this.endColor_;
    }

    /* JADX INFO: renamed from: r */
    public final String m17203r() {
        return this.startColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
