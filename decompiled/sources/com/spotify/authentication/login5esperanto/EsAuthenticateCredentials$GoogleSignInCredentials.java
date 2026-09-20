package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uhw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$GoogleSignInCredentials extends AbstractC0269h implements sre0 {
    public static final int AUTHCODE_FIELD_NUMBER = 1;
    private static final EsAuthenticateCredentials$GoogleSignInCredentials DEFAULT_INSTANCE;
    public static final int IDTOKEN_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECTURI_FIELD_NUMBER = 2;
    private String authCode_ = "";
    private String redirectUri_ = "";
    private String idToken_ = "";

    static {
        EsAuthenticateCredentials$GoogleSignInCredentials esAuthenticateCredentials$GoogleSignInCredentials = new EsAuthenticateCredentials$GoogleSignInCredentials();
        DEFAULT_INSTANCE = esAuthenticateCredentials$GoogleSignInCredentials;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$GoogleSignInCredentials.class, esAuthenticateCredentials$GoogleSignInCredentials);
    }

    private EsAuthenticateCredentials$GoogleSignInCredentials() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3519n(EsAuthenticateCredentials$GoogleSignInCredentials esAuthenticateCredentials$GoogleSignInCredentials, String str) {
        esAuthenticateCredentials$GoogleSignInCredentials.getClass();
        str.getClass();
        esAuthenticateCredentials$GoogleSignInCredentials.authCode_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3520o(EsAuthenticateCredentials$GoogleSignInCredentials esAuthenticateCredentials$GoogleSignInCredentials, String str) {
        esAuthenticateCredentials$GoogleSignInCredentials.getClass();
        str.getClass();
        esAuthenticateCredentials$GoogleSignInCredentials.idToken_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3521p(EsAuthenticateCredentials$GoogleSignInCredentials esAuthenticateCredentials$GoogleSignInCredentials, String str) {
        esAuthenticateCredentials$GoogleSignInCredentials.getClass();
        esAuthenticateCredentials$GoogleSignInCredentials.redirectUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static uhw m3523r() {
        return (uhw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"authCode_", "redirectUri_", "idToken_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$GoogleSignInCredentials();
        }
        if (iOrdinal == 4) {
            return new uhw();
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
        synchronized (EsAuthenticateCredentials$GoogleSignInCredentials.class) {
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
