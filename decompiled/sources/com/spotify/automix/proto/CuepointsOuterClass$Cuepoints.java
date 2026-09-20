package com.spotify.automix.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wzl;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CuepointsOuterClass$Cuepoints extends AbstractC0269h implements sre0 {
    public static final int BEST_FADE_IN_CUEPOINT_FIELD_NUMBER = 1;
    public static final int BEST_FADE_OUT_CUEPOINT_FIELD_NUMBER = 2;
    private static final CuepointsOuterClass$Cuepoints DEFAULT_INSTANCE;
    public static final int FADE_IN_CUEPOINTS_FIELD_NUMBER = 3;
    public static final int FADE_OUT_CUEPOINTS_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private CuepointsOuterClass$Cuepoint bestFadeInCuepoint_;
    private CuepointsOuterClass$Cuepoint bestFadeOutCuepoint_;
    private int bitField0_;
    private ae50 fadeInCuepoints_ = AbstractC0269h.emptyProtobufList();
    private ae50 fadeOutCuepoints_ = AbstractC0269h.emptyProtobufList();

    static {
        CuepointsOuterClass$Cuepoints cuepointsOuterClass$Cuepoints = new CuepointsOuterClass$Cuepoints();
        DEFAULT_INSTANCE = cuepointsOuterClass$Cuepoints;
        AbstractC0269h.registerDefaultInstance(CuepointsOuterClass$Cuepoints.class, cuepointsOuterClass$Cuepoints);
    }

    private CuepointsOuterClass$Cuepoints() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static CuepointsOuterClass$Cuepoints m3729t(byte[] bArr) {
        return (CuepointsOuterClass$Cuepoints) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b", new Object[]{"bitField0_", "bestFadeInCuepoint_", "bestFadeOutCuepoint_", "fadeInCuepoints_", CuepointsOuterClass$Cuepoint.class, "fadeOutCuepoints_", CuepointsOuterClass$Cuepoint.class});
        }
        if (iOrdinal == 3) {
            return new CuepointsOuterClass$Cuepoints();
        }
        if (iOrdinal == 4) {
            return new wzl(DEFAULT_INSTANCE, 3);
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
        synchronized (CuepointsOuterClass$Cuepoints.class) {
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
    public final CuepointsOuterClass$Cuepoint m3730n() {
        CuepointsOuterClass$Cuepoint cuepointsOuterClass$Cuepoint = this.bestFadeInCuepoint_;
        return cuepointsOuterClass$Cuepoint == null ? CuepointsOuterClass$Cuepoint.m3724o() : cuepointsOuterClass$Cuepoint;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CuepointsOuterClass$Cuepoint m3731o() {
        CuepointsOuterClass$Cuepoint cuepointsOuterClass$Cuepoint = this.bestFadeOutCuepoint_;
        return cuepointsOuterClass$Cuepoint == null ? CuepointsOuterClass$Cuepoint.m3724o() : cuepointsOuterClass$Cuepoint;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m3732p() {
        return this.fadeInCuepoints_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m3733q() {
        return this.fadeOutCuepoints_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3734r() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3735s() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
