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
public final class TransitionOuterClass$LoopingStyleBlocks extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$LoopingStyleBlocks DEFAULT_INSTANCE;
    public static final int IN_FIELD_NUMBER = 3;
    public static final int OUT_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private TransitionOuterClass$BlockSequence in_;
    private TransitionOuterClass$BlockSequence out_;
    private TransitionOuterClass$LoopingStyle style_;

    static {
        TransitionOuterClass$LoopingStyleBlocks transitionOuterClass$LoopingStyleBlocks = new TransitionOuterClass$LoopingStyleBlocks();
        DEFAULT_INSTANCE = transitionOuterClass$LoopingStyleBlocks;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$LoopingStyleBlocks.class, transitionOuterClass$LoopingStyleBlocks);
    }

    private TransitionOuterClass$LoopingStyleBlocks() {
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
            return new TransitionOuterClass$LoopingStyleBlocks();
        }
        if (iOrdinal == 4) {
            return new s791(DEFAULT_INSTANCE, 6);
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
        synchronized (TransitionOuterClass$LoopingStyleBlocks.class) {
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
    public final TransitionOuterClass$BlockSequence m3845n() {
        TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence = this.in_;
        return transitionOuterClass$BlockSequence == null ? TransitionOuterClass$BlockSequence.m3764o() : transitionOuterClass$BlockSequence;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TransitionOuterClass$BlockSequence m3846o() {
        TransitionOuterClass$BlockSequence transitionOuterClass$BlockSequence = this.out_;
        return transitionOuterClass$BlockSequence == null ? TransitionOuterClass$BlockSequence.m3764o() : transitionOuterClass$BlockSequence;
    }

    /* JADX INFO: renamed from: p */
    public final TransitionOuterClass$LoopingStyle m3847p() {
        TransitionOuterClass$LoopingStyle transitionOuterClass$LoopingStyle = this.style_;
        return transitionOuterClass$LoopingStyle == null ? TransitionOuterClass$LoopingStyle.m3842o() : transitionOuterClass$LoopingStyle;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3848q() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3849r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
