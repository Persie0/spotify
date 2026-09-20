package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rhw;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateCredentials$AuthenticateCredentials extends AbstractC0269h implements sre0 {
    public static final int APPLESIGNINCREDENTIALS_FIELD_NUMBER = 8;
    public static final int AUTHNPLATFORMCREDENTIAL_FIELD_NUMBER = 14;
    private static final EsAuthenticateCredentials$AuthenticateCredentials DEFAULT_INSTANCE;
    public static final int EMAILADDRESS_FIELD_NUMBER = 13;
    public static final int FACEBOOKACCESSTOKEN_FIELD_NUMBER = 9;
    public static final int GOOGLESIGNINCREDENTIALS_FIELD_NUMBER = 7;
    public static final int LEGACYV3PASSWORD_FIELD_NUMBER = 10;
    public static final int NATIVEPASSWORD_FIELD_NUMBER = 11;
    public static final int NAVERSIGNINCREDENTIALS_FIELD_NUMBER = 12;
    public static final int ONETIMETOKEN_FIELD_NUMBER = 2;
    public static final int PARENTCHILDCREDENTIALS_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PASSWORD_FIELD_NUMBER = 1;
    public static final int PHONENUMBER_FIELD_NUMBER = 3;
    public static final int SAMSUNGSIGNINCREDENTIALS_FIELD_NUMBER = 5;
    public static final int UNENCRYPTEDSTOREDCREDENTIALS_FIELD_NUMBER = 4;
    private int credentialsCase_ = 0;
    private Object credentials_;

    static {
        EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials = new EsAuthenticateCredentials$AuthenticateCredentials();
        DEFAULT_INSTANCE = esAuthenticateCredentials$AuthenticateCredentials;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateCredentials$AuthenticateCredentials.class, esAuthenticateCredentials$AuthenticateCredentials);
    }

    private EsAuthenticateCredentials$AuthenticateCredentials() {
    }

    /* JADX INFO: renamed from: A */
    public static rhw m3497A() {
        return (rhw) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m3498n(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$AuthnPlatformCredential esAuthenticateCredentials$AuthnPlatformCredential) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$AuthnPlatformCredential.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$AuthnPlatformCredential;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 14;
    }

    /* JADX INFO: renamed from: o */
    public static void m3499o(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$EmailAddress esAuthenticateCredentials$EmailAddress) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$EmailAddress.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$EmailAddress;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 13;
    }

    /* JADX INFO: renamed from: p */
    public static void m3500p(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$FacebookAccessToken esAuthenticateCredentials$FacebookAccessToken) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$FacebookAccessToken.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$FacebookAccessToken;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 9;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3501q(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$GoogleSignInCredentials esAuthenticateCredentials$GoogleSignInCredentials) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$GoogleSignInCredentials.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$GoogleSignInCredentials;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 7;
    }

    /* JADX INFO: renamed from: r */
    public static void m3502r(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$LegacyV3Password esAuthenticateCredentials$LegacyV3Password) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$LegacyV3Password.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$LegacyV3Password;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 10;
    }

    /* JADX INFO: renamed from: s */
    public static void m3503s(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$NativePassword esAuthenticateCredentials$NativePassword) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$NativePassword.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$NativePassword;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 11;
    }

    /* JADX INFO: renamed from: t */
    public static void m3504t(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$NaverSignInCredentials esAuthenticateCredentials$NaverSignInCredentials) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$NaverSignInCredentials.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$NaverSignInCredentials;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 12;
    }

    /* JADX INFO: renamed from: u */
    public static void m3505u(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$OneTimeToken esAuthenticateCredentials$OneTimeToken) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$OneTimeToken.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$OneTimeToken;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 2;
    }

    /* JADX INFO: renamed from: v */
    public static void m3506v(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$ParentChildCredentials esAuthenticateCredentials$ParentChildCredentials) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$ParentChildCredentials.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$ParentChildCredentials;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 6;
    }

    /* JADX INFO: renamed from: w */
    public static void m3507w(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$Password esAuthenticateCredentials$Password) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$Password.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$Password;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 1;
    }

    /* JADX INFO: renamed from: x */
    public static void m3508x(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$PhoneNumber esAuthenticateCredentials$PhoneNumber) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$PhoneNumber.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$PhoneNumber;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 3;
    }

    /* JADX INFO: renamed from: y */
    public static void m3509y(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsAuthenticateCredentials$SamsungSignInCredentials esAuthenticateCredentials$SamsungSignInCredentials) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateCredentials$SamsungSignInCredentials.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esAuthenticateCredentials$SamsungSignInCredentials;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 5;
    }

    /* JADX INFO: renamed from: z */
    public static void m3510z(EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials, EsUnencryptedStoredCredentials$UnencryptedStoredCredentials esUnencryptedStoredCredentials$UnencryptedStoredCredentials) {
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esUnencryptedStoredCredentials$UnencryptedStoredCredentials.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.credentials_ = esUnencryptedStoredCredentials$UnencryptedStoredCredentials;
        esAuthenticateCredentials$AuthenticateCredentials.credentialsCase_ = 4;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000e\u0001\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000", new Object[]{"credentials_", "credentialsCase_", EsAuthenticateCredentials$Password.class, EsAuthenticateCredentials$OneTimeToken.class, EsAuthenticateCredentials$PhoneNumber.class, EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.class, EsAuthenticateCredentials$SamsungSignInCredentials.class, EsAuthenticateCredentials$ParentChildCredentials.class, EsAuthenticateCredentials$GoogleSignInCredentials.class, EsAuthenticateCredentials$AppleSignInCredentials.class, EsAuthenticateCredentials$FacebookAccessToken.class, EsAuthenticateCredentials$LegacyV3Password.class, EsAuthenticateCredentials$NativePassword.class, EsAuthenticateCredentials$NaverSignInCredentials.class, EsAuthenticateCredentials$EmailAddress.class, EsAuthenticateCredentials$AuthnPlatformCredential.class});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateCredentials$AuthenticateCredentials();
        }
        if (iOrdinal == 4) {
            return new rhw(DEFAULT_INSTANCE);
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
        synchronized (EsAuthenticateCredentials$AuthenticateCredentials.class) {
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
