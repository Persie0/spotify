package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p991;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class TransitionOuterClass$VolumeStyle extends AbstractC0269h implements sre0 {
    private static final TransitionOuterClass$VolumeStyle DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int id_;

    static {
        TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle = new TransitionOuterClass$VolumeStyle();
        DEFAULT_INSTANCE = transitionOuterClass$VolumeStyle;
        AbstractC0269h.registerDefaultInstance(TransitionOuterClass$VolumeStyle.class, transitionOuterClass$VolumeStyle);
    }

    private TransitionOuterClass$VolumeStyle() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3958n(TransitionOuterClass$VolumeStyle transitionOuterClass$VolumeStyle, int i) {
        transitionOuterClass$VolumeStyle.id_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static TransitionOuterClass$VolumeStyle m3959o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static p991 m3960q() {
        return (p991) DEFAULT_INSTANCE.createBuilder();
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
            return new TransitionOuterClass$VolumeStyle();
        }
        if (iOrdinal == 4) {
            return new p991(DEFAULT_INSTANCE);
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
        synchronized (TransitionOuterClass$VolumeStyle.class) {
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
    public final int m3961p() {
        return this.id_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
