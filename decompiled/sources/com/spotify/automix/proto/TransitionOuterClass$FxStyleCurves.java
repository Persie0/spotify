package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s791;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$FxStyleCurves extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$FxStyleCurves DEFAULT_INSTANCE;
    public static final int DELAY_DRY_WET_IN_CURVES_FIELD_NUMBER = 7;
    public static final int DELAY_DRY_WET_OUT_CURVES_FIELD_NUMBER = 6;
    public static final int ECHO_DRY_WET_IN_CURVES_FIELD_NUMBER = 3;
    public static final int ECHO_DRY_WET_OUT_CURVES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int REVERB_DRY_WET_IN_CURVES_FIELD_NUMBER = 5;
    public static final int REVERB_DRY_WET_OUT_CURVES_FIELD_NUMBER = 4;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private TransitionOuterClass$AutomationCurves delayDryWetInCurves_;
    private TransitionOuterClass$AutomationCurves delayDryWetOutCurves_;
    private TransitionOuterClass$AutomationCurves echoDryWetInCurves_;
    private TransitionOuterClass$AutomationCurves echoDryWetOutCurves_;
    private TransitionOuterClass$AutomationCurves reverbDryWetInCurves_;
    private TransitionOuterClass$AutomationCurves reverbDryWetOutCurves_;
    private TransitionOuterClass$FxStyle style_;

    static {
        TransitionOuterClass$FxStyleCurves transitionOuterClass$FxStyleCurves = new TransitionOuterClass$FxStyleCurves();
        DEFAULT_INSTANCE = transitionOuterClass$FxStyleCurves;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$FxStyleCurves.class, transitionOuterClass$FxStyleCurves);
    }

    private TransitionOuterClass$FxStyleCurves() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "style_", "echoDryWetOutCurves_", "echoDryWetInCurves_", "reverbDryWetOutCurves_", "reverbDryWetInCurves_", "delayDryWetOutCurves_", "delayDryWetInCurves_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$FxStyleCurves();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 4);
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
        synchronized (TransitionOuterClass$FxStyleCurves.class) {
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
    public final TransitionOuterClass$AutomationCurves m3825n() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.delayDryWetInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TransitionOuterClass$AutomationCurves m3826o() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.delayDryWetOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: p */
    public final TransitionOuterClass$AutomationCurves m3827p() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.echoDryWetInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: q */
    public final TransitionOuterClass$AutomationCurves m3828q() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.echoDryWetOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: r */
    public final TransitionOuterClass$AutomationCurves m3829r() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.reverbDryWetInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: s */
    public final TransitionOuterClass$AutomationCurves m3830s() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.reverbDryWetOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: t */
    public final TransitionOuterClass$FxStyle m3831t() {
        TransitionOuterClass$FxStyle transitionOuterClass$FxStyle = this.style_;
        return transitionOuterClass$FxStyle == null ? TransitionOuterClass$FxStyle.m3822o() : transitionOuterClass$FxStyle;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
