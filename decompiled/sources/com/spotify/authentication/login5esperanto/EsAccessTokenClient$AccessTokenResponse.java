package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsAccessTokenClient$AccessTokenResponse extends AbstractC0269h implements sre0 {
    private static final EsAccessTokenClient$AccessTokenResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        EsAccessTokenClient$AccessTokenResponse esAccessTokenClient$AccessTokenResponse = new EsAccessTokenClient$AccessTokenResponse();
        DEFAULT_INSTANCE = esAccessTokenClient$AccessTokenResponse;
        AbstractC0269h.registerDefaultInstance(EsAccessTokenClient$AccessTokenResponse.class, esAccessTokenClient$AccessTokenResponse);
    }

    private EsAccessTokenClient$AccessTokenResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EsAccessTokenClient$AccessTokenResponse m3478q(byte[] bArr) {
        return (EsAccessTokenClient$AccessTokenResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return new EsAccessTokenClient$AccessTokenResponse();
        }
        if (iOrdinal == 4) {
            return new dbw(DEFAULT_INSTANCE, 17);
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
        synchronized (EsAccessTokenClient$AccessTokenResponse.class) {
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
    public final EsAccessTokenClient$ErrorResponse m3479n() {
        return this.responseCase_ == 2 ? (EsAccessTokenClient$ErrorResponse) this.response_ : EsAccessTokenClient$ErrorResponse.m3482n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EsAccessToken$AccessToken m3480o() {
        return this.responseCase_ == 1 ? (EsAccessToken$AccessToken) this.response_ : EsAccessToken$AccessToken.m3474o();
    }

    /* JADX INFO: renamed from: p */
    public final boolean m3481p() {
        return this.responseCase_ == 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
