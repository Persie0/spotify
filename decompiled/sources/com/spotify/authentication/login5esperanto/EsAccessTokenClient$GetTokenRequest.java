package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.nhw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAccessTokenClient$GetTokenRequest extends AbstractC0269h implements sre0 {
    private static final EsAccessTokenClient$GetTokenRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RENEW_FIELD_NUMBER = 1;
    private boolean renew_;

    static {
        EsAccessTokenClient$GetTokenRequest esAccessTokenClient$GetTokenRequest = new EsAccessTokenClient$GetTokenRequest();
        DEFAULT_INSTANCE = esAccessTokenClient$GetTokenRequest;
        AbstractC0269h.registerDefaultInstance(EsAccessTokenClient$GetTokenRequest.class, esAccessTokenClient$GetTokenRequest);
    }

    private EsAccessTokenClient$GetTokenRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3493n(EsAccessTokenClient$GetTokenRequest esAccessTokenClient$GetTokenRequest) {
        esAccessTokenClient$GetTokenRequest.renew_ = false;
    }

    /* JADX INFO: renamed from: o */
    public static nhw m3494o() {
        return (nhw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"renew_"});
        }
        if (iOrdinal == 3) {
            return new EsAccessTokenClient$GetTokenRequest();
        }
        if (iOrdinal == 4) {
            return new nhw(DEFAULT_INSTANCE);
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
        synchronized (EsAccessTokenClient$GetTokenRequest.class) {
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
