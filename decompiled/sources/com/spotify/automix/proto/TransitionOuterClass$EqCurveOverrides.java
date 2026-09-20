package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$EqCurveOverrides extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$EqCurveOverrides DEFAULT_INSTANCE;
    public static final int HIGH_FIELD_NUMBER = 3;
    public static final int LOW_FIELD_NUMBER = 1;
    public static final int MID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private TransitionOuterClass$AutomationCurves high_;
    private TransitionOuterClass$AutomationCurves low_;
    private TransitionOuterClass$AutomationCurves mid_;

    static {
        TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides = new TransitionOuterClass$EqCurveOverrides();
        DEFAULT_INSTANCE = transitionOuterClass$EqCurveOverrides;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$EqCurveOverrides.class, transitionOuterClass$EqCurveOverrides);
    }

    private TransitionOuterClass$EqCurveOverrides() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3766n(TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$EqCurveOverrides.getClass();
        transitionOuterClass$EqCurveOverrides.high_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$EqCurveOverrides.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m3767o(TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$EqCurveOverrides.getClass();
        transitionOuterClass$EqCurveOverrides.low_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$EqCurveOverrides.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m3768p(TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$EqCurveOverrides.getClass();
        transitionOuterClass$EqCurveOverrides.mid_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$EqCurveOverrides.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static TransitionOuterClass$EqCurveOverrides m3769q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static c991 m3770x() {
        return (c991) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "low_", "mid_", "high_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$EqCurveOverrides();
        }
        if (iOrdinal == 4) {
            return new c991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$EqCurveOverrides.class) {
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

    /* JADX INFO: renamed from: r */
    public final TransitionOuterClass$AutomationCurves m3771r() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.high_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: s */
    public final TransitionOuterClass$AutomationCurves m3772s() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.low_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: t */
    public final TransitionOuterClass$AutomationCurves m3773t() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.mid_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m3774u() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3775v() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3776w() {
        return (this.bitField0_ & 2) != 0;
    }
}
