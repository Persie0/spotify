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
public final class TransitionOuterClass$VolumeStyleCurves extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$VolumeStyleCurves DEFAULT_INSTANCE;
    public static final int FADE_IN_CURVES_FIELD_NUMBER = 3;
    public static final int FADE_OUT_CURVES_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private TransitionOuterClass$AutomationCurves fadeInCurves_;
    private TransitionOuterClass$AutomationCurves fadeOutCurves_;
    private TransitionOuterClass$VolumeStyle style_;

    static {
        TransitionOuterClass$VolumeStyleCurves transitionOuterClass$VolumeStyleCurves = new TransitionOuterClass$VolumeStyleCurves();
        DEFAULT_INSTANCE = transitionOuterClass$VolumeStyleCurves;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$VolumeStyleCurves.class, transitionOuterClass$VolumeStyleCurves);
    }

    private TransitionOuterClass$VolumeStyleCurves() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "style_", "fadeOutCurves_", "fadeInCurves_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$VolumeStyleCurves();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 8);
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
        synchronized (TransitionOuterClass$VolumeStyleCurves.class) {
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
    public final TransitionOuterClass$AutomationCurves m3962n() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.fadeInCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TransitionOuterClass$AutomationCurves m3963o() {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = this.fadeOutCurves_;
        return transitionOuterClass$AutomationCurves == null ? TransitionOuterClass$AutomationCurves.m3759r() : transitionOuterClass$AutomationCurves;
    }

    /* JADX INFO: renamed from: p */
    public final TransitionOuterClass$VolumeStyle m3964p() {
        TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle = this.style_;
        return transitionOuterClass$VolumeStyle == null ? TransitionOuterClass$VolumeStyle.m3959o() : transitionOuterClass$VolumeStyle;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
