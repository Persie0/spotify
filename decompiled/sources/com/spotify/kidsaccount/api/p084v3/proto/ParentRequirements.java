package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y7l0;
import p204p.z110;
import p204p.zfr0;

/* JADX INFO: loaded from: classes7.dex */
public final class ParentRequirements extends AbstractC0269h implements sre0 {
    private static final ParentRequirements DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRIVACY_POLICY_CONSENT_TYPE_FIELD_NUMBER = 2;
    public static final int REQUIRE_PARENTAL_VERIFICATION_FIELD_NUMBER = 3;
    public static final int REQUIRE_PIN_SETUP_FIELD_NUMBER = 1;
    public static final int VERIFICATION_METHODS_FIELD_NUMBER = 4;
    private int privacyPolicyConsentType_;
    private boolean requireParentalVerification_;
    private boolean requirePinSetup_;
    private ae50 verificationMethods_ = AbstractC0269h.emptyProtobufList();

    static {
        ParentRequirements parentRequirements = new ParentRequirements();
        DEFAULT_INSTANCE = parentRequirements;
        AbstractC0269h.registerDefaultInstance(ParentRequirements.class, parentRequirements);
    }

    private ParentRequirements() {
    }

    /* JADX INFO: renamed from: n */
    public static ParentRequirements m12155n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u0007\u0002\f\u0003\u0007\u0004\u001b", new Object[]{"requirePinSetup_", "privacyPolicyConsentType_", "requireParentalVerification_", "verificationMethods_", ParentalVerificationMethod.class});
        }
        if (iOrdinal == 3) {
            return new ParentRequirements();
        }
        if (iOrdinal == 4) {
            return new y7l0(DEFAULT_INSTANCE, 27);
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
        synchronized (ParentRequirements.class) {
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

    /* JADX INFO: renamed from: o */
    public final zfr0 m12156o() {
        zfr0 zfr0Var;
        int i = this.privacyPolicyConsentType_;
        if (i == 0) {
            zfr0Var = zfr0.PRIVACY_POLICY_CONSENT_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            zfr0Var = zfr0.PRIVACY_POLICY_CONSENT_TYPE_NON;
        } else if (i == 2) {
            zfr0Var = zfr0.PRIVACY_POLICY_CONSENT_TYPE_COPPA;
        } else if (i != 3) {
            zfr0Var = i != 4 ? null : zfr0.PRIVACY_POLICY_CONSENT_TYPE_EXPLICIT;
        } else {
            zfr0Var = zfr0.PRIVACY_POLICY_CONSENT_TYPE_IMPLICIT;
        }
        return zfr0Var == null ? zfr0.UNRECOGNIZED : zfr0Var;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m12157p() {
        return this.requireParentalVerification_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12158q() {
        return this.requirePinSetup_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m12159r() {
        return this.verificationMethods_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
