package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.o991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$Transition extends AbstractC0269h implements sre0 {
    public static final int BEATMATCH_PREFERENCE_FIELD_NUMBER = 5;
    private static final TransitionOuterClass$Transition DEFAULT_INSTANCE;
    public static final int IS_OVERLAP_OVERRIDE_FIELD_NUMBER = 3;
    public static final int IS_PRESET_ID_OVERRIDE_FIELD_NUMBER = 4;
    public static final int OVERLAP_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRESET_FIELD_NUMBER = 2;
    private int beatmatchPreference_;
    private int bitField0_;
    private boolean isOverlapOverride_;
    private boolean isPresetIdOverride_;
    private TransitionOuterClass$Overlap overlap_;
    private TransitionOuterClass$Preset preset_;

    static {
        TransitionOuterClass$Transition transitionOuterClass$Transition = new TransitionOuterClass$Transition();
        DEFAULT_INSTANCE = transitionOuterClass$Transition;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$Transition.class, transitionOuterClass$Transition);
    }

    private TransitionOuterClass$Transition() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3948n(TransitionOuterClass$Transition transitionOuterClass$Transition, boolean z) {
        transitionOuterClass$Transition.isOverlapOverride_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m3949o(TransitionOuterClass$Transition transitionOuterClass$Transition, boolean z) {
        transitionOuterClass$Transition.isPresetIdOverride_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m3950p(TransitionOuterClass$Transition transitionOuterClass$Transition, TransitionOuterClass$Overlap transitionOuterClass$Overlap) {
        transitionOuterClass$Transition.getClass();
        transitionOuterClass$Transition.overlap_ = transitionOuterClass$Overlap;
        transitionOuterClass$Transition.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3951q(TransitionOuterClass$Transition transitionOuterClass$Transition, TransitionOuterClass$Preset transitionOuterClass$Preset) {
        transitionOuterClass$Transition.getClass();
        transitionOuterClass$Transition.preset_ = transitionOuterClass$Preset;
        transitionOuterClass$Transition.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: v */
    public static o991 m3952v() {
        return (o991) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: w */
    public static TransitionOuterClass$Transition m3953w(byte[] bArr) {
        return (TransitionOuterClass$Transition) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u0007\u0004\u0007\u0005\f", new Object[]{"bitField0_", "overlap_", "preset_", "isOverlapOverride_", "isPresetIdOverride_", "beatmatchPreference_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$Transition();
        }
        if (iOrdinal == 4) {
            return new o991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$Transition.class) {
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
    public final boolean m3954r() {
        return this.isOverlapOverride_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3955s() {
        return this.isPresetIdOverride_;
    }

    /* JADX INFO: renamed from: t */
    public final TransitionOuterClass$Overlap m3956t() {
        TransitionOuterClass$Overlap transitionOuterClass$Overlap = this.overlap_;
        return transitionOuterClass$Overlap == null ? TransitionOuterClass$Overlap.m3856I() : transitionOuterClass$Overlap;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final TransitionOuterClass$Preset m3957u() {
        TransitionOuterClass$Preset transitionOuterClass$Preset = this.preset_;
        return transitionOuterClass$Preset == null ? TransitionOuterClass$Preset.m3900C() : transitionOuterClass$Preset;
    }
}
