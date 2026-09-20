package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.thw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$FacebookAccessToken extends AbstractC0269h implements sre0 {
    public static final int ACCESSTOKEN_FIELD_NUMBER = 2;
    private static final EsAuthenticateCredentials$FacebookAccessToken DEFAULT_INSTANCE;
    public static final int FBUID_FIELD_NUMBER = 1;
    public static final int IDTOKEN_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private String fbUID_ = "";
    private String accessToken_ = "";
    private String idToken_ = "";

    static {
        EsAuthenticateCredentials$FacebookAccessToken esAuthenticateCredentials$FacebookAccessToken = new EsAuthenticateCredentials$FacebookAccessToken();
        DEFAULT_INSTANCE = esAuthenticateCredentials$FacebookAccessToken;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$FacebookAccessToken.class, esAuthenticateCredentials$FacebookAccessToken);
    }

    private EsAuthenticateCredentials$FacebookAccessToken() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3515n(EsAuthenticateCredentials$FacebookAccessToken esAuthenticateCredentials$FacebookAccessToken, String str) {
        esAuthenticateCredentials$FacebookAccessToken.getClass();
        str.getClass();
        esAuthenticateCredentials$FacebookAccessToken.accessToken_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3516o(EsAuthenticateCredentials$FacebookAccessToken esAuthenticateCredentials$FacebookAccessToken, String str) {
        esAuthenticateCredentials$FacebookAccessToken.getClass();
        str.getClass();
        esAuthenticateCredentials$FacebookAccessToken.fbUID_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static thw m3518q() {
        return (thw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"fbUID_", "accessToken_", "idToken_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$FacebookAccessToken();
        }
        if (iOrdinal == 4) {
            return new thw();
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
        synchronized (EsAuthenticateCredentials$FacebookAccessToken.class) {
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
