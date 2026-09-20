package com.spotify.automix.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import p204p.ae50;
import p204p.iiw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAutomix$ComputedTransition extends AbstractC0269h implements sre0 {
    public static final int COMPUTED_SCORE_FIELD_NUMBER = 2;
    private static final EsAutomix$ComputedTransition DEFAULT_INSTANCE;
    public static final int OVERLAP_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RANKED_PRESETS_FIELD_NUMBER = 3;
    private int bitField0_;
    private float computedScore_;
    private TransitionOuterClass$Overlap overlap_;
    private ae50 rankedPresets_ = AbstractC0269h.emptyProtobufList();

    static {
        EsAutomix$ComputedTransition esAutomix$ComputedTransition = new EsAutomix$ComputedTransition();
        DEFAULT_INSTANCE = esAutomix$ComputedTransition;
        AbstractC0269h.registerDefaultInstance(EsAutomix$ComputedTransition.class, esAutomix$ComputedTransition);
    }

    private EsAutomix$ComputedTransition() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u0001\u0003\u001b", new Object[]{"bitField0_", "overlap_", "computedScore_", "rankedPresets_", EsAutomix$ComputedPreset.class});
        }
        if (iOrdinal == 3) {
            return new EsAutomix$ComputedTransition();
        }
        if (iOrdinal == 4) {
            return new iiw(DEFAULT_INSTANCE, 1);
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
        synchronized (EsAutomix$ComputedTransition.class) {
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
    public final float m3666n() {
        return this.computedScore_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final TransitionOuterClass$Overlap m3667o() {
        TransitionOuterClass$Overlap transitionOuterClass$Overlap = this.overlap_;
        return transitionOuterClass$Overlap == null ? TransitionOuterClass$Overlap.m3856I() : transitionOuterClass$Overlap;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m3668p() {
        return this.rankedPresets_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
