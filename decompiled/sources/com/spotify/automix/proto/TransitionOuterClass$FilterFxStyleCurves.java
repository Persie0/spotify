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
public final class TransitionOuterClass$FilterFxStyleCurves extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$FilterFxStyleCurves DEFAULT_INSTANCE;
    public static final int FILTER_CUTOFF_IN_CURVES_FIELD_NUMBER = 4;
    public static final int FILTER_CUTOFF_OUT_CURVES_FIELD_NUMBER = 2;
    public static final int FILTER_RESONANCE_IN_CURVES_FIELD_NUMBER = 5;
    public static final int FILTER_RESONANCE_OUT_CURVES_FIELD_NUMBER = 3;
    public static final int NOISE_COLOR_IN_CURVES_FIELD_NUMBER = 7;
    public static final int NOISE_COLOR_OUT_CURVES_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private TransitionOuterClass$AutomationCurves filterCutoffInCurves_;
    private TransitionOuterClass$AutomationCurves filterCutoffOutCurves_;
    private TransitionOuterClass$AutomationCurves filterResonanceInCurves_;
    private TransitionOuterClass$AutomationCurves filterResonanceOutCurves_;
    private TransitionOuterClass$AutomationCurves noiseColorInCurves_;
    private TransitionOuterClass$AutomationCurves noiseColorOutCurves_;
    private TransitionOuterClass$FilterFxStyle style_;

    static {
        TransitionOuterClass$FilterFxStyleCurves transitionOuterClass$FilterFxStyleCurves = new TransitionOuterClass$FilterFxStyleCurves();
        DEFAULT_INSTANCE = transitionOuterClass$FilterFxStyleCurves;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$FilterFxStyleCurves.class, transitionOuterClass$FilterFxStyleCurves);
    }

    private TransitionOuterClass$FilterFxStyleCurves() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006", new Object[]{"bitField0_", "style_", "filterCutoffOutCurves_", "filterResonanceOutCurves_", "filterCutoffInCurves_", "filterResonanceInCurves_", "noiseColorOutCurves_", "noiseColorInCurves_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$FilterFxStyleCurves();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 3);
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
        synchronized (TransitionOuterClass$FilterFxStyleCurves.class) {
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
    public final TransitionOuterClass$AutomationCurves m3803n() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.filterCutoffInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TransitionOuterClass$AutomationCurves m3804o() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.filterCutoffOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: p */
    public final TransitionOuterClass$AutomationCurves m3805p() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.filterResonanceInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: q */
    public final TransitionOuterClass$AutomationCurves m3806q() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.filterResonanceOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: r */
    public final TransitionOuterClass$AutomationCurves m3807r() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.noiseColorInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: s */
    public final TransitionOuterClass$AutomationCurves m3808s() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.noiseColorOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: t */
    public final TransitionOuterClass$FilterFxStyle m3809t() {
        TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyle = this.style_;
        return transitionOuterClass$FilterFxStyle == null ? TransitionOuterClass$FilterFxStyle.m3800o() : transitionOuterClass$FilterFxStyle;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
