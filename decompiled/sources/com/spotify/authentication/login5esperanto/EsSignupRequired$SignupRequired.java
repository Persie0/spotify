package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uow;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsSignupRequired$SignupRequired extends AbstractC0269h implements sre0 {
    public static final int BIRTHDATE_FIELD_NUMBER = 4;
    private static final EsSignupRequired$SignupRequired DEFAULT_INSTANCE;
    public static final int EMAILALREADYREGISTERED_FIELD_NUMBER = 8;
    public static final int EMAIL_FIELD_NUMBER = 2;
    public static final int GENDER_FIELD_NUMBER = 5;
    public static final int IDENTIFIERTOKEN_FIELD_NUMBER = 9;
    public static final int ISEMAILVERIFIED_FIELD_NUMBER = 3;
    public static final int ISPHONENUMBERVERIFIED_FIELD_NUMBER = 7;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PHONENUMBER_FIELD_NUMBER = 6;
    private boolean emailAlreadyRegistered_;
    private int gender_;
    private boolean isEmailVerified_;
    private boolean isPhoneNumberVerified_;
    private String name_ = "";
    private String email_ = "";
    private String birthdate_ = "";
    private String phoneNumber_ = "";
    private String identifierToken_ = "";

    static {
        EsSignupRequired$SignupRequired esSignupRequired$SignupRequired = new EsSignupRequired$SignupRequired();
        DEFAULT_INSTANCE = esSignupRequired$SignupRequired;
        AbstractC0269h.registerDefaultInstance(EsSignupRequired$SignupRequired.class, esSignupRequired$SignupRequired);
    }

    private EsSignupRequired$SignupRequired() {
    }

    /* JADX INFO: renamed from: p */
    public static EsSignupRequired$SignupRequired m3640p() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\f\u0006Ȉ\u0007\u0007\b\u0007\tȈ", new Object[]{"name_", "email_", "isEmailVerified_", "birthdate_", "gender_", "phoneNumber_", "isPhoneNumberVerified_", "emailAlreadyRegistered_", "identifierToken_"});
        }
        if (iOrdinal == 3) {
            return new EsSignupRequired$SignupRequired();
        }
        if (iOrdinal == 4) {
            return new vnw(9);
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
        synchronized (EsSignupRequired$SignupRequired.class) {
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

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3641o() {
        return this.birthdate_;
    }

    /* JADX INFO: renamed from: q */
    public final String m3642q() {
        return this.email_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m3643r() {
        return this.emailAlreadyRegistered_;
    }

    /* JADX INFO: renamed from: s */
    public final uow m3644s() {
        uow uowVar;
        int i = this.gender_;
        if (i == 0) {
            uowVar = uow.UNKNOWN;
        } else if (i == 1) {
            uowVar = uow.MALE;
        } else if (i != 2) {
            uowVar = i != 3 ? null : uow.NEUTRAL;
        } else {
            uowVar = uow.FEMALE;
        }
        return uowVar == null ? uow.UNRECOGNIZED : uowVar;
    }

    /* JADX INFO: renamed from: t */
    public final String m3645t() {
        return this.identifierToken_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m3646u() {
        return this.isEmailVerified_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3647v() {
        return this.isPhoneNumberVerified_;
    }

    /* JADX INFO: renamed from: w */
    public final String m3648w() {
        return this.phoneNumber_;
    }
}
