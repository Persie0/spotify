package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ciw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$SamsungSignInCredentials extends AbstractC0269h implements sre0 {
    public static final int AUTHCODE_FIELD_NUMBER = 1;
    private static final EsAuthenticateCredentials$SamsungSignInCredentials DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECTURI_FIELD_NUMBER = 2;
    public static final int TOKENENDPOINTURL_FIELD_NUMBER = 3;
    private String authCode_ = "";
    private String redirectUri_ = "";
    private String tokenEndpointUrl_ = "";

    static {
        EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials = new EsAuthenticateCredentials$SamsungSignInCredentials();
        DEFAULT_INSTANCE = esAuthenticateCredentials$SamsungSignInCredentials;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$SamsungSignInCredentials.class, esAuthenticateCredentials$SamsungSignInCredentials);
    }

    private EsAuthenticateCredentials$SamsungSignInCredentials() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3550n(EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials, String str) {
        esAuthenticateCredentials$SamsungSignInCredentials.getClass();
        str.getClass();
        esAuthenticateCredentials$SamsungSignInCredentials.authCode_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3551o(EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials) {
        esAuthenticateCredentials$SamsungSignInCredentials.getClass();
        esAuthenticateCredentials$SamsungSignInCredentials.redirectUri_ = "";
    }

    /* JADX INFO: renamed from: p */
    public static void m3552p(EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials, String str) {
        esAuthenticateCredentials$SamsungSignInCredentials.getClass();
        str.getClass();
        esAuthenticateCredentials$SamsungSignInCredentials.tokenEndpointUrl_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ciw m3554r() {
        return (ciw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"authCode_", "redirectUri_", "tokenEndpointUrl_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$SamsungSignInCredentials();
        }
        if (iOrdinal == 4) {
            return new ciw();
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
        synchronized (EsAuthenticateCredentials$SamsungSignInCredentials.class) {
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
