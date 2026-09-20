package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.b991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$AutomationCurves extends AbstractC0269h implements sre0 {
    public static final int CURVES_FIELD_NUMBER = 1;
    private static final TransitionOuterClass$AutomationCurves DEFAULT_INSTANCE;
    public static final int MAXIMUM_FIELD_NUMBER = 4;
    public static final int MINIMUM_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private ae50 curves_ = AbstractC0269h.emptyProtobufList();
    private double maximum_;
    private double minimum_;

    static {
        TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves = new TransitionOuterClass$AutomationCurves();
        DEFAULT_INSTANCE = transitionOuterClass$AutomationCurves;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$AutomationCurves.class, transitionOuterClass$AutomationCurves);
    }

    private TransitionOuterClass$AutomationCurves() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3756n(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves, ArrayList arrayList) {
        ae50 ae50Var = transitionOuterClass$AutomationCurves.curves_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            transitionOuterClass$AutomationCurves.curves_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, transitionOuterClass$AutomationCurves.curves_);
    }

    /* JADX INFO: renamed from: o */
    public static void m3757o(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves, double d) {
        transitionOuterClass$AutomationCurves.maximum_ = d;
    }

    /* JADX INFO: renamed from: p */
    public static void m3758p(TransitionOuterClass$AutomationCurves transitionOuterClass$AutomationCurves, double d) {
        transitionOuterClass$AutomationCurves.minimum_ = d;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static TransitionOuterClass$AutomationCurves m3759r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static b991 m3760u() {
        return (b991) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0000\u0001\u001b\u0003\u0000\u0004\u0000", new Object[]{"curves_", TransitionOuterClass$AutomationCurve.class, "minimum_", "maximum_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$AutomationCurves();
        }
        if (iOrdinal == 4) {
            return new b991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$AutomationCurves.class) {
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

    /* JADX INFO: renamed from: q */
    public final ae50 m3761q() {
        return this.curves_;
    }

    /* JADX INFO: renamed from: s */
    public final double m3762s() {
        return this.maximum_;
    }

    /* JADX INFO: renamed from: t */
    public final double m3763t() {
        return this.minimum_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
