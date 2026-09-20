package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.l991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$Point extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$Point DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int X_FIELD_NUMBER = 1;
    public static final int Y_FIELD_NUMBER = 2;

    /* JADX INFO: renamed from: x_ */
    private double f3007x_;

    /* JADX INFO: renamed from: y_ */
    private double f3008y_;

    static {
        TransitionOuterClass$Point transitionOuterClass$Point = new TransitionOuterClass$Point();
        DEFAULT_INSTANCE = transitionOuterClass$Point;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$Point.class, transitionOuterClass$Point);
    }

    private TransitionOuterClass$Point() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3893n(TransitionOuterClass$Point transitionOuterClass$Point, double d) {
        transitionOuterClass$Point.f3007x_ = d;
    }

    /* JADX INFO: renamed from: o */
    public static void m3894o(TransitionOuterClass$Point transitionOuterClass$Point, double d) {
        transitionOuterClass$Point.f3008y_ = d;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static l991 m3895r() {
        return (l991) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"x_", "y_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$Point();
        }
        if (iOrdinal == 4) {
            return new l991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$Point.class) {
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
    public final double m3896p() {
        return this.f3007x_;
    }

    /* JADX INFO: renamed from: q */
    public final double m3897q() {
        return this.f3008y_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
