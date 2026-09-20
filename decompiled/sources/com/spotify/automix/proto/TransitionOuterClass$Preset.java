package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.m991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$Preset extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$Preset DEFAULT_INSTANCE;
    public static final int EQ_IN_CURVE_OVERRIDES_FIELD_NUMBER = 9;
    public static final int EQ_OUT_CURVE_OVERRIDES_FIELD_NUMBER = 8;
    public static final int EQ_STYLE_OVERRIDE_FIELD_NUMBER = 4;
    public static final int FILTER_FX_STYLE_OVERRIDE_FIELD_NUMBER = 5;
    public static final int FILTER_IN_CURVE_OVERRIDES_FIELD_NUMBER = 11;
    public static final int FILTER_OUT_CURVE_OVERRIDES_FIELD_NUMBER = 10;
    public static final int FX_IN_CURVE_OVERRIDES_FIELD_NUMBER = 14;
    public static final int FX_OUT_CURVE_OVERRIDES_FIELD_NUMBER = 13;
    public static final int FX_STYLE_OVERRIDE_FIELD_NUMBER = 12;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int JOGWHEEL_STYLE_OVERRIDE_FIELD_NUMBER = 15;
    public static final int LOOPING_STYLE_OVERRIDE_FIELD_NUMBER = 16;
    private static volatile r2n0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VOLUME_IN_CURVE_OVERRIDE_FIELD_NUMBER = 7;
    public static final int VOLUME_OUT_CURVE_OVERRIDE_FIELD_NUMBER = 6;
    public static final int VOLUME_STYLE_OVERRIDE_FIELD_NUMBER = 3;
    private int bitField0_;
    private TransitionOuterClass$EqCurveOverrides eqInCurveOverrides_;
    private TransitionOuterClass$EqCurveOverrides eqOutCurveOverrides_;
    private TransitionOuterClass$EqStyle eqStyleOverride_;
    private TransitionOuterClass$FilterFxStyle filterFxStyleOverride_;
    private TransitionOuterClass$FilterCurveOverrides filterInCurveOverrides_;
    private TransitionOuterClass$FilterCurveOverrides filterOutCurveOverrides_;
    private TransitionOuterClass$FxCurveOverrides fxInCurveOverrides_;
    private TransitionOuterClass$FxCurveOverrides fxOutCurveOverrides_;
    private TransitionOuterClass$FxStyle fxStyleOverride_;
    private int id_;
    private TransitionOuterClass$JogwheelStyle jogwheelStyleOverride_;
    private TransitionOuterClass$LoopingStyle loopingStyleOverride_;
    private int type_;
    private TransitionOuterClass$AutomationCurves volumeInCurveOverride_;
    private TransitionOuterClass$AutomationCurves volumeOutCurveOverride_;
    private TransitionOuterClass$VolumeStyle volumeStyleOverride_;

    static {
        TransitionOuterClass$Preset transitionOuterClass$Preset = new TransitionOuterClass$Preset();
        DEFAULT_INSTANCE = transitionOuterClass$Preset;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$Preset.class, transitionOuterClass$Preset);
    }

    private TransitionOuterClass$Preset() {
    }

    /* JADX INFO: renamed from: A */
    public static void m3898A(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$Preset.volumeOutCurveOverride_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$Preset.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: B */
    public static void m3899B(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$VolumeStyle.getClass();
        transitionOuterClass$Preset.volumeStyleOverride_ = transitionOuterClass$VolumeStyle;
        transitionOuterClass$Preset.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: C */
    public static TransitionOuterClass$Preset m3900C() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: g0 */
    public static m991 m3901g0() {
        return (m991) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m3902n(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$Preset.eqInCurveOverrides_ = transitionOuterClass$EqCurveOverrides;
        transitionOuterClass$Preset.bitField0_ |= 64;
    }

    /* JADX INFO: renamed from: o */
    public static void m3903o(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$Preset.eqOutCurveOverrides_ = transitionOuterClass$EqCurveOverrides;
        transitionOuterClass$Preset.bitField0_ |= 32;
    }

    /* JADX INFO: renamed from: p */
    public static void m3904p(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$EqStyle transitionOuterClass$EqStyle) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$EqStyle.getClass();
        transitionOuterClass$Preset.eqStyleOverride_ = transitionOuterClass$EqStyle;
        transitionOuterClass$Preset.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3905q(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyle) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$FilterFxStyle.getClass();
        transitionOuterClass$Preset.filterFxStyleOverride_ = transitionOuterClass$FilterFxStyle;
        transitionOuterClass$Preset.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m3906r(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$Preset.filterInCurveOverrides_ = transitionOuterClass$FilterCurveOverrides;
        transitionOuterClass$Preset.bitField0_ |= 256;
    }

    /* JADX INFO: renamed from: s */
    public static void m3907s(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$Preset.filterOutCurveOverrides_ = transitionOuterClass$FilterCurveOverrides;
        transitionOuterClass$Preset.bitField0_ |= 128;
    }

    /* JADX INFO: renamed from: t */
    public static void m3908t(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$Preset.fxInCurveOverrides_ = transitionOuterClass$FxCurveOverrides;
        transitionOuterClass$Preset.bitField0_ |= 2048;
    }

    /* JADX INFO: renamed from: u */
    public static void m3909u(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$Preset.fxOutCurveOverrides_ = transitionOuterClass$FxCurveOverrides;
        transitionOuterClass$Preset.bitField0_ |= 1024;
    }

    /* JADX INFO: renamed from: v */
    public static void m3910v(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$FxStyle transitionOuterClass$FxStyle) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$FxStyle.getClass();
        transitionOuterClass$Preset.fxStyleOverride_ = transitionOuterClass$FxStyle;
        transitionOuterClass$Preset.bitField0_ |= 512;
    }

    /* JADX INFO: renamed from: w */
    public static void m3911w(TransitionOuterClass$Preset transitionOuterClass$Preset, int i) {
        transitionOuterClass$Preset.id_ = i;
    }

    /* JADX INFO: renamed from: x */
    public static void m3912x(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$JogwheelStyle.getClass();
        transitionOuterClass$Preset.jogwheelStyleOverride_ = transitionOuterClass$JogwheelStyle;
        transitionOuterClass$Preset.bitField0_ |= 4096;
    }

    /* JADX INFO: renamed from: y */
    public static void m3913y(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$LoopingStyle.getClass();
        transitionOuterClass$Preset.loopingStyleOverride_ = transitionOuterClass$LoopingStyle;
        transitionOuterClass$Preset.bitField0_ |= 8192;
    }

    /* JADX INFO: renamed from: z */
    public static void m3914z(TransitionOuterClass$Preset transitionOuterClass$Preset, TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves) {
        transitionOuterClass$Preset.getClass();
        transitionOuterClass$Preset.volumeInCurveOverride_ = transitionOuterClass$AutomationCurves;
        transitionOuterClass$Preset.bitField0_ |= 16;
    }

    /* JADX INFO: renamed from: D */
    public final TransitionOuterClass$EqCurveOverrides m3915D() {
        TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides = this.eqInCurveOverrides_;
        return transitionOuterClass$EqCurveOverrides == null ? TransitionOuterClass$EqCurveOverrides.m3769q() : transitionOuterClass$EqCurveOverrides;
    }

    /* JADX INFO: renamed from: E */
    public final TransitionOuterClass$EqCurveOverrides m3916E() {
        TransitionOuterClass$EqCurveOverrides transitionOuterClass$EqCurveOverrides = this.eqOutCurveOverrides_;
        return transitionOuterClass$EqCurveOverrides == null ? TransitionOuterClass$EqCurveOverrides.m3769q() : transitionOuterClass$EqCurveOverrides;
    }

    /* JADX INFO: renamed from: F */
    public final TransitionOuterClass$EqStyle m3917F() {
        TransitionOuterClass$EqStyle transitionOuterClass$EqStyle = this.eqStyleOverride_;
        return transitionOuterClass$EqStyle == null ? TransitionOuterClass$EqStyle.m3778o() : transitionOuterClass$EqStyle;
    }

    /* JADX INFO: renamed from: G */
    public final TransitionOuterClass$FilterFxStyle m3918G() {
        TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyle = this.filterFxStyleOverride_;
        return transitionOuterClass$FilterFxStyle == null ? TransitionOuterClass$FilterFxStyle.m3800o() : transitionOuterClass$FilterFxStyle;
    }

    /* JADX INFO: renamed from: H */
    public final TransitionOuterClass$FilterCurveOverrides m3919H() {
        TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides = this.filterInCurveOverrides_;
        return transitionOuterClass$FilterCurveOverrides == null ? TransitionOuterClass$FilterCurveOverrides.m3791r() : transitionOuterClass$FilterCurveOverrides;
    }

    /* JADX INFO: renamed from: I */
    public final TransitionOuterClass$FilterCurveOverrides m3920I() {
        TransitionOuterClass$FilterCurveOverrides transitionOuterClass$FilterCurveOverrides = this.filterOutCurveOverrides_;
        return transitionOuterClass$FilterCurveOverrides == null ? TransitionOuterClass$FilterCurveOverrides.m3791r() : transitionOuterClass$FilterCurveOverrides;
    }

    /* JADX INFO: renamed from: J */
    public final TransitionOuterClass$FxCurveOverrides m3921J() {
        TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides = this.fxInCurveOverrides_;
        return transitionOuterClass$FxCurveOverrides == null ? TransitionOuterClass$FxCurveOverrides.m3813q() : transitionOuterClass$FxCurveOverrides;
    }

    /* JADX INFO: renamed from: K */
    public final TransitionOuterClass$FxCurveOverrides m3922K() {
        TransitionOuterClass$FxCurveOverrides transitionOuterClass$FxCurveOverrides = this.fxOutCurveOverrides_;
        return transitionOuterClass$FxCurveOverrides == null ? TransitionOuterClass$FxCurveOverrides.m3813q() : transitionOuterClass$FxCurveOverrides;
    }

    /* JADX INFO: renamed from: L */
    public final TransitionOuterClass$FxStyle m3923L() {
        TransitionOuterClass$FxStyle transitionOuterClass$FxStyle = this.fxStyleOverride_;
        return transitionOuterClass$FxStyle == null ? TransitionOuterClass$FxStyle.m3822o() : transitionOuterClass$FxStyle;
    }

    /* JADX INFO: renamed from: M */
    public final int m3924M() {
        return this.id_;
    }

    /* JADX INFO: renamed from: N */
    public final TransitionOuterClass$JogwheelStyle m3925N() {
        TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle = this.jogwheelStyleOverride_;
        return transitionOuterClass$JogwheelStyle == null ? TransitionOuterClass$JogwheelStyle.m3833o() : transitionOuterClass$JogwheelStyle;
    }

    /* JADX INFO: renamed from: O */
    public final TransitionOuterClass$LoopingStyle m3926O() {
        TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle = this.loopingStyleOverride_;
        return transitionOuterClass$LoopingStyle == null ? TransitionOuterClass$LoopingStyle.m3842o() : transitionOuterClass$LoopingStyle;
    }

    /* JADX INFO: renamed from: P */
    public final TransitionOuterClass$AutomationCurves m3927P() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.volumeInCurveOverride_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: Q */
    public final TransitionOuterClass$AutomationCurves m3928Q() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.volumeOutCurveOverride_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: R */
    public final TransitionOuterClass$VolumeStyle m3929R() {
        TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle = this.volumeStyleOverride_;
        return transitionOuterClass$VolumeStyle == null ? TransitionOuterClass$VolumeStyle.m3959o() : transitionOuterClass$VolumeStyle;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m3930S() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m3931T() {
        return (this.bitField0_ & 32) != 0;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m3932U() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m3933V() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: W */
    public final boolean m3934W() {
        return (this.bitField0_ & 256) != 0;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m3935X() {
        return (this.bitField0_ & 128) != 0;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m3936Y() {
        return (this.bitField0_ & 2048) != 0;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m3937Z() {
        return (this.bitField0_ & 1024) != 0;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m3938a0() {
        return (this.bitField0_ & 512) != 0;
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m3939b0() {
        return (this.bitField0_ & 4096) != 0;
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m3940c0() {
        return (this.bitField0_ & 8192) != 0;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m3941d0() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\bဉ\u0005\tဉ\u0006\nဉ\u0007\u000bဉ\b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r", new Object[]{"bitField0_", "id_", "type_", "volumeStyleOverride_", "eqStyleOverride_", "filterFxStyleOverride_", "volumeOutCurveOverride_", "volumeInCurveOverride_", "eqOutCurveOverrides_", "eqInCurveOverrides_", "filterOutCurveOverrides_", "filterInCurveOverrides_", "fxStyleOverride_", "fxOutCurveOverrides_", "fxInCurveOverrides_", "jogwheelStyleOverride_", "loopingStyleOverride_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$Preset();
        }
        if (iOrdinal == 4) {
            return new m991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$Preset.class) {
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

    /* JADX INFO: renamed from: e0 */
    public final boolean m3942e0() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m3943f0() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.sre0
    public final /* bridge */ /* synthetic */ pre0 getDefaultInstanceForType() {
        return getDefaultInstanceForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
