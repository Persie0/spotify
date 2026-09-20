package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.x0m;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CuepointsOuterClass$Cuepoint extends AbstractC0269h implements sre0 {
    public static final int CONFIDENCE_FIELD_NUMBER = 4;
    private static final CuepointsOuterClass$Cuepoint DEFAULT_INSTANCE;
    public static final int ORIGIN_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int POSITION_MS_FIELD_NUMBER = 1;
    public static final int TEMPO_BPM_FIELD_NUMBER = 2;
    private double confidence_;
    private int origin_;
    private long positionMs_;
    private float tempoBpm_;

    static {
        CuepointsOuterClass$Cuepoint cuepointsOuterClass$Cuepoint = new CuepointsOuterClass$Cuepoint();
        DEFAULT_INSTANCE = cuepointsOuterClass$Cuepoint;
        AbstractC0269h.registerDefaultInstance(CuepointsOuterClass$Cuepoint.class, cuepointsOuterClass$Cuepoint);
    }

    private CuepointsOuterClass$Cuepoint() {
    }

    /* JADX INFO: renamed from: o */
    public static CuepointsOuterClass$Cuepoint m3724o() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0002\u0002\u0001\u0003\f\u0004\u0000", new Object[]{"positionMs_", "tempoBpm_", "origin_", "confidence_"});
        }
        if (iOrdinal == 3) {
            return new CuepointsOuterClass$Cuepoint();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 2);
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
        synchronized (CuepointsOuterClass$Cuepoint.class) {
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
    public final double m3725n() {
        return this.confidence_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final x0m m3726p() {
        x0m x0mVar;
        int i = this.origin_;
        if (i != 0) {
            x0mVar = i != 1 ? null : x0m.ML;
        } else {
            x0mVar = x0m.HUMAN;
        }
        return x0mVar == null ? x0m.UNRECOGNIZED : x0mVar;
    }

    /* JADX INFO: renamed from: q */
    public final long m3727q() {
        return this.positionMs_;
    }

    /* JADX INFO: renamed from: r */
    public final float m3728r() {
        return this.tempoBpm_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
