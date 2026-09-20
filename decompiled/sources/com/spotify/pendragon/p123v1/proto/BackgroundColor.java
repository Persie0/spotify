package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ei6;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundColor extends AbstractC0269h implements sre0 {
    private static final BackgroundColor DEFAULT_INSTANCE;
    public static final int GRADIENT_BACKGROUND_COLOR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SOLID_BACKGROUND_COLOR_FIELD_NUMBER = 1;
    private int colorCase_ = 0;
    private Object color_;

    static {
        BackgroundColor backgroundColor = new BackgroundColor();
        DEFAULT_INSTANCE = backgroundColor;
        AbstractC0269h.registerDefaultInstance(BackgroundColor.class, backgroundColor);
    }

    private BackgroundColor() {
    }

    /* JADX INFO: renamed from: p */
    public static BackgroundColor m16992p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȼ\u0000\u0002<\u0000", new Object[]{"color_", "colorCase_", GradientBackgroundColor.class});
        }
        if (iOrdinal == 3) {
            return new BackgroundColor();
        }
        if (iOrdinal == 4) {
            return new na8(9);
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
        synchronized (BackgroundColor.class) {
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
    public final int m16993o() {
        return ei6.m39064a(this.colorCase_);
    }

    /* JADX INFO: renamed from: q */
    public final GradientBackgroundColor m16994q() {
        return this.colorCase_ == 2 ? (GradientBackgroundColor) this.color_ : GradientBackgroundColor.m17200o();
    }

    /* JADX INFO: renamed from: r */
    public final String m16995r() {
        return this.colorCase_ == 1 ? (String) this.color_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
