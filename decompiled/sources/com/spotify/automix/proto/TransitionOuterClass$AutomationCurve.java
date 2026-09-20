package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.a991;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$AutomationCurve extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$AutomationCurve DEFAULT_INSTANCE;
    public static final int END_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int POINTS_FIELD_NUMBER = 1;
    public static final int START_FIELD_NUMBER = 2;
    private double end_;
    private ae50 points_ = AbstractC0269h.emptyProtobufList();
    private double start_;

    static {
        TransitionOuterClass$AutomationCurve transitionOuterClass$AutomationCurve = new TransitionOuterClass$AutomationCurve();
        DEFAULT_INSTANCE = transitionOuterClass$AutomationCurve;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$AutomationCurve.class, transitionOuterClass$AutomationCurve);
    }

    private TransitionOuterClass$AutomationCurve() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3749n(TransitionOuterClass$AutomationCurve transitionOuterClass$AutomationCurve, ArrayList arrayList) {
        ae50 ae50Var = transitionOuterClass$AutomationCurve.points_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            transitionOuterClass$AutomationCurve.points_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, transitionOuterClass$AutomationCurve.points_);
    }

    /* JADX INFO: renamed from: o */
    public static void m3750o(TransitionOuterClass$AutomationCurve transitionOuterClass$AutomationCurve, double d) {
        transitionOuterClass$AutomationCurve.end_ = d;
    }

    /* JADX INFO: renamed from: p */
    public static void m3751p(TransitionOuterClass$AutomationCurve transitionOuterClass$AutomationCurve, double d) {
        transitionOuterClass$AutomationCurve.start_ = d;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static a991 m3752t() {
        return (a991) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0000\u0003\u0000", new Object[]{"points_", TransitionOuterClass$Point.class, "start_", "end_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$AutomationCurve();
        }
        if (iOrdinal == 4) {
            return new a991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$AutomationCurve.class) {
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
    public final double m3753q() {
        return this.end_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m3754r() {
        return this.points_;
    }

    /* JADX INFO: renamed from: s */
    public final double m3755s() {
        return this.start_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
