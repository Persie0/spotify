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
public final class TransitionOuterClass$JogwheelStyleBlocks extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$JogwheelStyleBlocks DEFAULT_INSTANCE;
    public static final int IN_FIELD_NUMBER = 3;
    public static final int OUT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private TransitionOuterClass$BlockSequence in_;
    private TransitionOuterClass$BlockSequence out_;
    private TransitionOuterClass$JogwheelStyle style_;

    static {
        TransitionOuterClass$JogwheelStyleBlocks transitionOuterClass$JogwheelStyleBlocks = new TransitionOuterClass$JogwheelStyleBlocks();
        DEFAULT_INSTANCE = transitionOuterClass$JogwheelStyleBlocks;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$JogwheelStyleBlocks.class, transitionOuterClass$JogwheelStyleBlocks);
    }

    private TransitionOuterClass$JogwheelStyleBlocks() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "style_", "out_", "in_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$JogwheelStyleBlocks();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 5);
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
        synchronized (TransitionOuterClass$JogwheelStyleBlocks.class) {
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
    public final TransitionOuterClass$BlockSequence m3836n() {
        TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence = this.in_;
        return transitionOuterClass$BlockSequence == null ? TransitionOuterClass$BlockSequence.m3764o() : transitionOuterClass$BlockSequence;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TransitionOuterClass$BlockSequence m3837o() {
        TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence = this.out_;
        return transitionOuterClass$BlockSequence == null ? TransitionOuterClass$BlockSequence.m3764o() : transitionOuterClass$BlockSequence;
    }

    /* JADX INFO: renamed from: p */
    public final TransitionOuterClass$JogwheelStyle m3838p() {
        TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle = this.style_;
        return transitionOuterClass$JogwheelStyle == null ? TransitionOuterClass$JogwheelStyle.m3833o() : transitionOuterClass$JogwheelStyle;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3839q() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3840r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
