package com.spotify.remoteconfig.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.ynw;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsRemoteConfig$BoolResponse extends AbstractC0269h implements sre0 {
    private static final EsRemoteConfig$BoolResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean value_;

    static {
        EsRemoteConfig$BoolResponse esRemoteConfig$BoolResponse = new EsRemoteConfig$BoolResponse();
        DEFAULT_INSTANCE = esRemoteConfig$BoolResponse;
        AbstractC0269h.registerDefaultInstance(EsRemoteConfig$BoolResponse.class, esRemoteConfig$BoolResponse);
    }

    private EsRemoteConfig$BoolResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20394n(EsRemoteConfig$BoolResponse esRemoteConfig$BoolResponse, boolean z) {
        esRemoteConfig$BoolResponse.bitField0_ |= 1;
        esRemoteConfig$BoolResponse.value_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static ynw m20395o() {
        return (ynw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "value_"});
        }
        if (iOrdinal == 3) {
            return new EsRemoteConfig$BoolResponse();
        }
        if (iOrdinal == 4) {
            return new ynw(DEFAULT_INSTANCE);
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
        synchronized (EsRemoteConfig$BoolResponse.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
