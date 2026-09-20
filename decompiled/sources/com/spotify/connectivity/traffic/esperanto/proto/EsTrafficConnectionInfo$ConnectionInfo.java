package com.spotify.connectivity.traffic.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cpw;
import p204p.dpw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsTrafficConnectionInfo$ConnectionInfo extends AbstractC0269h implements sre0 {
    public static final int BEARER_FIELD_NUMBER = 1;
    private static final EsTrafficConnectionInfo$ConnectionInfo DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bearer_;

    static {
        EsTrafficConnectionInfo$ConnectionInfo esTrafficConnectionInfo$ConnectionInfo = new EsTrafficConnectionInfo$ConnectionInfo();
        DEFAULT_INSTANCE = esTrafficConnectionInfo$ConnectionInfo;
        AbstractC0269h.registerDefaultInstance(EsTrafficConnectionInfo$ConnectionInfo.class, esTrafficConnectionInfo$ConnectionInfo);
    }

    private EsTrafficConnectionInfo$ConnectionInfo() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7597n(EsTrafficConnectionInfo$ConnectionInfo esTrafficConnectionInfo$ConnectionInfo, cpw cpwVar) {
        esTrafficConnectionInfo$ConnectionInfo.getClass();
        esTrafficConnectionInfo$ConnectionInfo.bearer_ = cpwVar.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static EsTrafficConnectionInfo$ConnectionInfo m7598p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static dpw m7599q() {
        return (dpw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"bearer_"});
        }
        if (iOrdinal == 3) {
            return new EsTrafficConnectionInfo$ConnectionInfo();
        }
        if (iOrdinal == 4) {
            return new dpw(DEFAULT_INSTANCE);
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
        synchronized (EsTrafficConnectionInfo$ConnectionInfo.class) {
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

    /* JADX INFO: renamed from: o */
    public final cpw m7600o() {
        cpw cpwVarM33568a = cpw.m33568a(this.bearer_);
        return cpwVarM33568a == null ? cpw.UNRECOGNIZED : cpwVarM33568a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
