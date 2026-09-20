package com.spotify.authentication.tokenexchangeesperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.bpw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsTokenExchange$WebAuthTokenRequest extends AbstractC0269h implements sre0 {
    public static final int AUDIENCE_FIELD_NUMBER = 1;
    private static final EsTokenExchange$WebAuthTokenRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private String audience_ = "";

    static {
        EsTokenExchange$WebAuthTokenRequest esTokenExchange$WebAuthTokenRequest = new EsTokenExchange$WebAuthTokenRequest();
        DEFAULT_INSTANCE = esTokenExchange$WebAuthTokenRequest;
        AbstractC0269h.registerDefaultInstance(EsTokenExchange$WebAuthTokenRequest.class, esTokenExchange$WebAuthTokenRequest);
    }

    private EsTokenExchange$WebAuthTokenRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3655n(EsTokenExchange$WebAuthTokenRequest esTokenExchange$WebAuthTokenRequest, String str) {
        esTokenExchange$WebAuthTokenRequest.getClass();
        str.getClass();
        esTokenExchange$WebAuthTokenRequest.audience_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static bpw m3656o() {
        return (bpw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"audience_"});
        }
        if (iOrdinal == 3) {
            return new EsTokenExchange$WebAuthTokenRequest();
        }
        if (iOrdinal == 4) {
            return new bpw(DEFAULT_INSTANCE);
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
        synchronized (EsTokenExchange$WebAuthTokenRequest.class) {
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
