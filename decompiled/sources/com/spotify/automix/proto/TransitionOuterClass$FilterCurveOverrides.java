package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.e991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$FilterCurveOverrides extends AbstractC0269h implements sre0 {
    public static final int CUTOFF_FIELD_NUMBER = 1;
    private static final TransitionOuterClass$FilterCurveOverrides DEFAULT_INSTANCE;
    public static final int NOISE_COLOR_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int RESONANCE_FIELD_NUMBER = 2;
    private int bitField0_;
    private TransitionOuterClass$AutomationCurves cutoff_;
    private TransitionOuterClass$AutomationCurves noiseColor_;
    private TransitionOuterClass$AutomationCurves resonance_;

    static {
        TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides = new TransitionOuterClass$FilterCurveOverrides();
        DEFAULT_INSTANCE = transitionOuterClass$FilterCurveOverrides;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$FilterCurveOverrides.class, transitionOuterClass$FilterCurveOverrides);
    }

    private TransitionOuterClass$FilterCurveOverrides() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3788n(TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$FilterCurveOverrides.getClass();
        transitionOuterClass$FilterCurveOverrides.cutoff_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$FilterCurveOverrides.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m3789o(TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$FilterCurveOverrides.getClass();
        transitionOuterClass$FilterCurveOverrides.noiseColor_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$FilterCurveOverrides.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: p */
    public static void m3790p(TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$FilterCurveOverrides.getClass();
        transitionOuterClass$FilterCurveOverrides.resonance_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$FilterCurveOverrides.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static TransitionOuterClass$FilterCurveOverrides m3791r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static e991 m3792x() {
        return (e991) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "cutoff_", "resonance_", "noiseColor_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$FilterCurveOverrides();
        }
        if (iOrdinal == 4) {
            return new e991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$FilterCurveOverrides.class) {
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

    /* JADX INFO: renamed from: q */
    public final TransitionOuterClass$AutomationCurves m3793q() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.cutoff_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: s */
    public final TransitionOuterClass$AutomationCurves m3794s() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.noiseColor_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: t */
    public final TransitionOuterClass$AutomationCurves m3795t() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.resonance_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m3796u() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3797v() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3798w() {
        return (this.bitField0_ & 2) != 0;
    }
}
