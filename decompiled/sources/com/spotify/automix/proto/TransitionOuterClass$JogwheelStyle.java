package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i991;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$JogwheelStyle extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$JogwheelStyle DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int id_;

    static {
        TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle = new TransitionOuterClass$JogwheelStyle();
        DEFAULT_INSTANCE = transitionOuterClass$JogwheelStyle;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$JogwheelStyle.class, transitionOuterClass$JogwheelStyle);
    }

    private TransitionOuterClass$JogwheelStyle() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3832n(TransitionOuterClass$JogwheelStyle transitionOuterClass$JogwheelStyle, int i) {
        transitionOuterClass$JogwheelStyle.id_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static TransitionOuterClass$JogwheelStyle m3833o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static i991 m3834q() {
        return (i991) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"id_"});
        }
        if (iOrdinal == 3) {
            return new TransitionOuterClass$JogwheelStyle();
        }
        if (iOrdinal == 4) {
            return new i991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$JogwheelStyle.class) {
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

    /* JADX INFO: renamed from: p */
    public final int m3835p() {
        return this.id_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
