package com.spotify.authentication.tokenexchangeesperanto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.authentication.login5esperanto.EsAccessToken$AccessToken;
import com.spotify.authentication.login5esperanto.EsAccessTokenClient$ErrorResponse;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsTokenExchange$TokenExchangeResponse extends AbstractC0269h implements sre0 {
    private static final EsTokenExchange$TokenExchangeResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        EsTokenExchange$TokenExchangeResponse esTokenExchange$TokenExchangeResponse = new EsTokenExchange$TokenExchangeResponse();
        DEFAULT_INSTANCE = esTokenExchange$TokenExchangeResponse;
        AbstractC0269h.registerDefaultInstance(EsTokenExchange$TokenExchangeResponse.class, esTokenExchange$TokenExchangeResponse);
    }

    private EsTokenExchange$TokenExchangeResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsTokenExchange$TokenExchangeResponse m3651q(byte[] bArr) {
        return (EsTokenExchange$TokenExchangeResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"response_", "responseCase_", EsAccessToken$AccessToken.class, EsAccessTokenClient$ErrorResponse.class});
        }
        if (iOrdinal == 3) {
            return new EsTokenExchange$TokenExchangeResponse();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 15);
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
        synchronized (EsTokenExchange$TokenExchangeResponse.class) {
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
    public final EsAccessTokenClient$ErrorResponse m3652n() {
        return this.responseCase_ == 2 ? (EsAccessTokenClient$ErrorResponse) this.response_ : EsAccessTokenClient$ErrorResponse.m3482n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m3653o() {
        int i = this.responseCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public final EsAccessToken$AccessToken m3654p() {
        return this.responseCase_ == 1 ? (EsAccessToken$AccessToken) this.response_ : EsAccessToken$AccessToken.m3474o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
