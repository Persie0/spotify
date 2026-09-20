package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r140;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class IdentityProviderIdentifier extends AbstractC0269h implements sre0 {
    public static final int APPLE_PROVIDER_FIELD_NUMBER = 102;
    private static final IdentityProviderIdentifier DEFAULT_INSTANCE;
    public static final int EMAIL_OTP_PROVIDER_FIELD_NUMBER = 105;
    public static final int GOOGLE_PROVIDER_FIELD_NUMBER = 101;
    public static final int NAVER_PROVIDER_FIELD_NUMBER = 104;
    private static volatile r2n0 PARSER = null;
    public static final int PHONE_NUMBER_PROVIDER_FIELD_NUMBER = 103;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private Object provider_;
    private int providerCase_ = 0;
    private String token_ = "";

    static {
        IdentityProviderIdentifier identityProviderIdentifier = new IdentityProviderIdentifier();
        DEFAULT_INSTANCE = identityProviderIdentifier;
        AbstractC0269h.registerDefaultInstance(IdentityProviderIdentifier.class, identityProviderIdentifier);
    }

    private IdentityProviderIdentifier() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21389n(IdentityProviderIdentifier identityProviderIdentifier, EmailOtpProvider emailOtpProvider) {
        identityProviderIdentifier.getClass();
        emailOtpProvider.getClass();
        identityProviderIdentifier.provider_ = emailOtpProvider;
        identityProviderIdentifier.providerCase_ = 105;
    }

    /* JADX INFO: renamed from: o */
    public static void m21390o(IdentityProviderIdentifier identityProviderIdentifier, GoogleProvider googleProvider) {
        identityProviderIdentifier.getClass();
        googleProvider.getClass();
        identityProviderIdentifier.provider_ = googleProvider;
        identityProviderIdentifier.providerCase_ = 101;
    }

    /* JADX INFO: renamed from: p */
    public static void m21391p(IdentityProviderIdentifier identityProviderIdentifier, NaverProvider naverProvider) {
        identityProviderIdentifier.getClass();
        naverProvider.getClass();
        identityProviderIdentifier.provider_ = naverProvider;
        identityProviderIdentifier.providerCase_ = 104;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21392q(IdentityProviderIdentifier identityProviderIdentifier, PhoneNumberProvider phoneNumberProvider) {
        identityProviderIdentifier.getClass();
        phoneNumberProvider.getClass();
        identityProviderIdentifier.provider_ = phoneNumberProvider;
        identityProviderIdentifier.providerCase_ = 103;
    }

    /* JADX INFO: renamed from: r */
    public static void m21393r(IdentityProviderIdentifier identityProviderIdentifier, String str) {
        identityProviderIdentifier.getClass();
        str.getClass();
        identityProviderIdentifier.token_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static r140 m21394s() {
        return (r140) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001i\u0006\u0000\u0000\u0000\u0001Ȉe<\u0000f<\u0000g<\u0000h<\u0000i<\u0000", new Object[]{"provider_", "providerCase_", "token_", GoogleProvider.class, AppleProvider.class, PhoneNumberProvider.class, NaverProvider.class, EmailOtpProvider.class});
        }
        if (iOrdinal == 3) {
            return new IdentityProviderIdentifier();
        }
        if (iOrdinal == 4) {
            return new r140(DEFAULT_INSTANCE);
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
        synchronized (IdentityProviderIdentifier.class) {
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
