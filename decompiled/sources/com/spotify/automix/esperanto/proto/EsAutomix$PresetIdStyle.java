package com.spotify.automix.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.automix.proto.TransitionOuterClass$EqStyle;
import com.spotify.automix.proto.TransitionOuterClass$FilterFxStyle;
import com.spotify.automix.proto.TransitionOuterClass$FxStyle;
import com.spotify.automix.proto.TransitionOuterClass$JogwheelStyle;
import com.spotify.automix.proto.TransitionOuterClass$LoopingStyle;
import com.spotify.automix.proto.TransitionOuterClass$VolumeStyle;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAutomix$PresetIdStyle extends AbstractC0269h implements sre0 {
    private static final EsAutomix$PresetIdStyle DEFAULT_INSTANCE;
    public static final int EQ_STYLE_FIELD_NUMBER = 3;
    public static final int FILTER_FX_STYLE_FIELD_NUMBER = 4;
    public static final int FX_STYLE_FIELD_NUMBER = 5;
    public static final int JOGWHEEL_STYLE_FIELD_NUMBER = 6;
    public static final int LOOPING_STYLE_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PRESET_ID_FIELD_NUMBER = 1;
    public static final int VOLUME_STYLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private TransitionOuterClass$EqStyle eqStyle_;
    private TransitionOuterClass$FilterFxStyle filterFxStyle_;
    private TransitionOuterClass$FxStyle fxStyle_;
    private TransitionOuterClass$JogwheelStyle jogwheelStyle_;
    private TransitionOuterClass$LoopingStyle loopingStyle_;
    private int presetId_;
    private TransitionOuterClass$VolumeStyle volumeStyle_;

    static {
        EsAutomix$PresetIdStyle esAutomix$PresetIdStyle = new EsAutomix$PresetIdStyle();
        DEFAULT_INSTANCE = esAutomix$PresetIdStyle;
        AbstractC0269h.registerDefaultInstance(EsAutomix$PresetIdStyle.class, esAutomix$PresetIdStyle);
    }

    private EsAutomix$PresetIdStyle() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005", new Object[]{"bitField0_", "presetId_", "volumeStyle_", "eqStyle_", "filterFxStyle_", "fxStyle_", "jogwheelStyle_", "loopingStyle_"});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$PresetIdStyle();
        }
        if (iOrdinal == 4) {
            return new iiw(DEFAULT_INSTANCE, 13);
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
        synchronized (EsAutomix$PresetIdStyle.class) {
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
    public final TransitionOuterClass$EqStyle m3713n() {
        TransitionOuterClass$EqStyle transitionOuterClass$EqStyle = this.eqStyle_;
        return transitionOuterClass$EqStyle == null ? TransitionOuterClass$EqStyle.m3778o() : transitionOuterClass$EqStyle;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TransitionOuterClass$FilterFxStyle m3714o() {
        TransitionOuterClass$FilterFxStyle transitionOuterClass$FilterFxStyle = this.filterFxStyle_;
        return transitionOuterClass$FilterFxStyle == null ? TransitionOuterClass$FilterFxStyle.m3800o() : transitionOuterClass$FilterFxStyle;
    }

    /* JADX INFO: renamed from: p */
    public final TransitionOuterClass$FxStyle m3715p() {
        TransitionOuterClass$FxStyle transitionOuterClass$FxStyle = this.fxStyle_;
        return transitionOuterClass$FxStyle == null ? TransitionOuterClass$FxStyle.m3822o() : transitionOuterClass$FxStyle;
    }

    /* JADX INFO: renamed from: q */
    public final TransitionOuterClass$JogwheelStyle m3716q() {
        TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle = this.jogwheelStyle_;
        return transitionOuterClass$JogwheelStyle == null ? TransitionOuterClass$JogwheelStyle.m3833o() : transitionOuterClass$JogwheelStyle;
    }

    /* JADX INFO: renamed from: r */
    public final TransitionOuterClass$LoopingStyle m3717r() {
        TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle = this.loopingStyle_;
        return transitionOuterClass$LoopingStyle == null ? TransitionOuterClass$LoopingStyle.m3842o() : transitionOuterClass$LoopingStyle;
    }

    /* JADX INFO: renamed from: s */
    public final TransitionOuterClass$VolumeStyle m3718s() {
        TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle = this.volumeStyle_;
        return transitionOuterClass$VolumeStyle == null ? TransitionOuterClass$VolumeStyle.m3959o() : transitionOuterClass$VolumeStyle;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
