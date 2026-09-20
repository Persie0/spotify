package com.spotify.widgets.colorextractionimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes11.dex */
public final class Color extends AbstractC0269h implements sre0 {
    public static final int B_FIELD_NUMBER = 3;
    private static final Color DEFAULT_INSTANCE;
    public static final int G_FIELD_NUMBER = 2;
    public static final int IS_FALLBACK_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int R_FIELD_NUMBER = 1;

    /* JADX INFO: renamed from: b_ */
    private int f6979b_;

    /* JADX INFO: renamed from: g_ */
    private int f6980g_;
    private boolean isFallback_;

    /* JADX INFO: renamed from: r_ */
    private int f6981r_;

    static {
        Color color = new Color();
        DEFAULT_INSTANCE = color;
        AbstractC0269h.registerDefaultInstance(Color.class, color);
    }

    private Color() {
    }

    /* JADX INFO: renamed from: o */
    public static Color m23066o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\u0007", new Object[]{"r_", "g_", "b_", "isFallback_"});
        }
        if (iOrdinal == 3) {
            return new Color();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 15);
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
        synchronized (Color.class) {
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
    public final int m23067n() {
        return this.f6979b_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m23068p() {
        return this.f6980g_;
    }

    /* JADX INFO: renamed from: q */
    public final int m23069q() {
        return this.f6981r_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
