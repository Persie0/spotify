package com.spotify.connectivity.hosts.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.ziw;

/* JADX INFO: loaded from: classes6.dex */
public final class EsConnectionError$ConnectionError extends AbstractC0269h implements sre0 {
    private static final EsConnectionError$ConnectionError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SERVICE_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int errorCode_;
    private EsServiceType$ServiceType serviceType_;

    static {
        EsConnectionError$ConnectionError esConnectionError$ConnectionError = new EsConnectionError$ConnectionError();
        DEFAULT_INSTANCE = esConnectionError$ConnectionError;
        AbstractC0269h.registerDefaultInstance(EsConnectionError$ConnectionError.class, esConnectionError$ConnectionError);
    }

    private EsConnectionError$ConnectionError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m7512n(EsConnectionError$ConnectionError esConnectionError$ConnectionError, EsServiceType$ServiceType esServiceType$ServiceType) {
        esConnectionError$ConnectionError.getClass();
        esServiceType$ServiceType.getClass();
        esConnectionError$ConnectionError.serviceType_ = esServiceType$ServiceType;
        esConnectionError$ConnectionError.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static ziw m7513o() {
        return (ziw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "serviceType_", "errorCode_"});
        }
        if (iOrdinal == 3) {
            return new EsConnectionError$ConnectionError();
        }
        if (iOrdinal == 4) {
            return new ziw(DEFAULT_INSTANCE);
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
        synchronized (EsConnectionError$ConnectionError.class) {
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
