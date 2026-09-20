package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C2653zk;
import p204p.EnumC1671al;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class AccountDetails extends AbstractC0269h implements sre0 {
    public static final int BIRTHDATE_FIELD_NUMBER = 2;
    public static final int CONSENT_FLAGS_FIELD_NUMBER = 4;
    private static final AccountDetails DEFAULT_INSTANCE;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int EMAIL_AND_PASSWORD_IDENTIFIER_FIELD_NUMBER = 101;
    public static final int GENDER_FIELD_NUMBER = 3;
    public static final int GRADUATION_IDENTIFIER_FIELD_NUMBER = 102;
    public static final int IDENTITY_PROVIDER_IDENTIFIER_FIELD_NUMBER = 103;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private ConsentFlags consentFlags_;
    private int gender_;
    private Object identifier_;
    private int identifierCase_ = 0;
    private String displayName_ = "";
    private String birthdate_ = "";

    static {
        AccountDetails accountDetails = new AccountDetails();
        DEFAULT_INSTANCE = accountDetails;
        AbstractC0269h.registerDefaultInstance(AccountDetails.class, accountDetails);
    }

    private AccountDetails() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21303n(AccountDetails accountDetails, String str) {
        accountDetails.getClass();
        str.getClass();
        accountDetails.birthdate_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21304o(AccountDetails accountDetails, ConsentFlags consentFlags) {
        accountDetails.getClass();
        consentFlags.getClass();
        accountDetails.consentFlags_ = consentFlags;
        accountDetails.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m21305p(AccountDetails accountDetails, String str) {
        accountDetails.getClass();
        str.getClass();
        accountDetails.displayName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21306q(AccountDetails accountDetails, EmailAndPasswordIdentifier emailAndPasswordIdentifier) {
        accountDetails.getClass();
        emailAndPasswordIdentifier.getClass();
        accountDetails.identifier_ = emailAndPasswordIdentifier;
        accountDetails.identifierCase_ = 101;
    }

    /* JADX INFO: renamed from: r */
    public static void m21307r(AccountDetails accountDetails, EnumC1671al enumC1671al) {
        accountDetails.getClass();
        accountDetails.gender_ = enumC1671al.getNumber();
    }

    /* JADX INFO: renamed from: s */
    public static void m21308s(AccountDetails accountDetails, GraduationIdentifier graduationIdentifier) {
        accountDetails.getClass();
        graduationIdentifier.getClass();
        accountDetails.identifier_ = graduationIdentifier;
        accountDetails.identifierCase_ = 102;
    }

    /* JADX INFO: renamed from: t */
    public static void m21309t(AccountDetails accountDetails, IdentityProviderIdentifier identityProviderIdentifier) {
        accountDetails.getClass();
        identityProviderIdentifier.getClass();
        accountDetails.identifier_ = identityProviderIdentifier;
        accountDetails.identifierCase_ = 103;
    }

    /* JADX INFO: renamed from: w */
    public static C2653zk m21310w() {
        return (C2653zk) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001g\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f\u0004ဉ\u0000e<\u0000f<\u0000g<\u0000", new Object[]{"identifier_", "identifierCase_", "bitField0_", "displayName_", "birthdate_", "gender_", "consentFlags_", EmailAndPasswordIdentifier.class, GraduationIdentifier.class, IdentityProviderIdentifier.class});
        }
        if (iOrdinal == 3) {
            return new AccountDetails();
        }
        if (iOrdinal == 4) {
            return new C2653zk(DEFAULT_INSTANCE);
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
        synchronized (AccountDetails.class) {
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

    /* JADX INFO: renamed from: u */
    public final EmailAndPasswordIdentifier m21311u() {
        return this.identifierCase_ == 101 ? (EmailAndPasswordIdentifier) this.identifier_ : EmailAndPasswordIdentifier.m21356p();
    }

    /* JADX INFO: renamed from: v */
    public final boolean m21312v() {
        return this.identifierCase_ == 101;
    }
}
