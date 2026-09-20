package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xhw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$NaverSignInCredentials extends AbstractC0269h implements sre0 {
    public static final int AUTHCODE_FIELD_NUMBER = 1;
    private static final EsAuthenticateCredentials$NaverSignInCredentials DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECTURI_FIELD_NUMBER = 2;
    private String authCode_ = "";
    private String redirectUri_ = "";

    static {
        EsAuthenticateCredentials$NaverSignInCredentials esAuthenticateCredentials$NaverSignInCredentials = new EsAuthenticateCredentials$NaverSignInCredentials();
        DEFAULT_INSTANCE = esAuthenticateCredentials$NaverSignInCredentials;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$NaverSignInCredentials.class, esAuthenticateCredentials$NaverSignInCredentials);
    }

    private EsAuthenticateCredentials$NaverSignInCredentials() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3531n(EsAuthenticateCredentials$NaverSignInCredentials esAuthenticateCredentials$NaverSignInCredentials, String str) {
        esAuthenticateCredentials$NaverSignInCredentials.getClass();
        str.getClass();
        esAuthenticateCredentials$NaverSignInCredentials.authCode_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3532o(EsAuthenticateCredentials$NaverSignInCredentials esAuthenticateCredentials$NaverSignInCredentials, String str) {
        esAuthenticateCredentials$NaverSignInCredentials.getClass();
        esAuthenticateCredentials$NaverSignInCredentials.redirectUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static xhw m3534q() {
        return (xhw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"authCode_", "redirectUri_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$NaverSignInCredentials();
        }
        if (iOrdinal == 4) {
            return new xhw();
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
        synchronized (EsAuthenticateCredentials$NaverSignInCredentials.class) {
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
