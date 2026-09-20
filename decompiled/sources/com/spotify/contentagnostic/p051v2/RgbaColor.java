package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.h4x0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class RgbaColor extends AbstractC0269h implements sre0 {
    public static final int A_FIELD_NUMBER = 4;
    public static final int B_FIELD_NUMBER = 3;
    private static final RgbaColor DEFAULT_INSTANCE;
    public static final int G_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int R_FIELD_NUMBER = 1;

    /* JADX INFO: renamed from: a_ */
    private int f3450a_;

    /* JADX INFO: renamed from: b_ */
    private int f3451b_;

    /* JADX INFO: renamed from: g_ */
    private int f3452g_;

    /* JADX INFO: renamed from: r_ */
    private int f3453r_;

    static {
        RgbaColor rgbaColor = new RgbaColor();
        DEFAULT_INSTANCE = rgbaColor;
        AbstractC0269h.registerDefaultInstance(RgbaColor.class, rgbaColor);
    }

    private RgbaColor() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static RgbaColor m7933q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"r_", "g_", "b_", "a_"});
        }
        if (iOrdinal == 3) {
            return new RgbaColor();
        }
        if (iOrdinal == 4) {
            return new h4x0();
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
        synchronized (RgbaColor.class) {
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
    public final int m7934o() {
        return this.f3450a_;
    }

    /* JADX INFO: renamed from: p */
    public final int m7935p() {
        return this.f3451b_;
    }

    /* JADX INFO: renamed from: r */
    public final int m7936r() {
        return this.f3452g_;
    }

    /* JADX INFO: renamed from: s */
    public final int m7937s() {
        return this.f3453r_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
