package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$FxCurveOverrides extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$FxCurveOverrides DEFAULT_INSTANCE;
    public static final int DELAY_DRY_WET_FIELD_NUMBER = 3;
    public static final int ECHO_DRY_WET_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REVERB_DRY_WET_FIELD_NUMBER = 2;
    private int bitField0_;
    private TransitionOuterClass$AutomationCurves delayDryWet_;
    private TransitionOuterClass$AutomationCurves echoDryWet_;
    private TransitionOuterClass$AutomationCurves reverbDryWet_;

    static {
        TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides = new TransitionOuterClass$FxCurveOverrides();
        DEFAULT_INSTANCE = transitionOuterClass$FxCurveOverrides;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$FxCurveOverrides.class, transitionOuterClass$FxCurveOverrides);
    }

    private TransitionOuterClass$FxCurveOverrides() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3810n(TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$FxCurveOverrides.getClass();
        transitionOuterClass$FxCurveOverrides.delayDryWet_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$FxCurveOverrides.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m3811o(TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$FxCurveOverrides.getClass();
        transitionOuterClass$FxCurveOverrides.echoDryWet_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$FxCurveOverrides.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m3812p(TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$FxCurveOverrides.getClass();
        transitionOuterClass$FxCurveOverrides.reverbDryWet_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$FxCurveOverrides.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static TransitionOuterClass$FxCurveOverrides m3813q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static g991 m3814x() {
        return (g991) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "echoDryWet_", "reverbDryWet_", "delayDryWet_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$FxCurveOverrides();
        }
        if (iOrdinal == 4) {
            return new g991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$FxCurveOverrides.class) {
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
    public final TransitionOuterClass$AutomationCurves m3815r() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.delayDryWet_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: s */
    public final TransitionOuterClass$AutomationCurves m3816s() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.echoDryWet_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: t */
    public final TransitionOuterClass$AutomationCurves m3817t() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.reverbDryWet_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m3818u() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3819v() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m3820w() {
        return (this.bitField0_ & 2) != 0;
    }
}
