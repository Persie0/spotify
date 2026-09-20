package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ct31;
import p204p.gva;
import p204p.jq6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class StartRegistrationResponse extends AbstractC0269h implements sre0 {
    public static final int ATTESTATION_FIELD_NUMBER = 8;
    public static final int AUTHENTICATOR_SELECTION_FIELD_NUMBER = 7;
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    private static final StartRegistrationResponse DEFAULT_INSTANCE;
    public static final int EXCLUDE_CREDENTIALS_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PUB_KEY_CRED_PARAMS_FIELD_NUMBER = 5;
    public static final int RP_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int TIMEOUT_MS_FIELD_NUMBER = 9;
    public static final int USER_FIELD_NUMBER = 4;
    private int attestation_;
    private AuthenticatorSelection authenticatorSelection_;
    private int bitField0_;
    private RelyingParty rp_;
    private long timeoutMs_;
    private PasskeyUser user_;
    private String sessionId_ = "";
    private gva challenge_ = gva.f84678b;
    private ae50 pubKeyCredParams_ = AbstractC0269h.emptyProtobufList();
    private ae50 excludeCredentials_ = AbstractC0269h.emptyProtobufList();

    static {
        StartRegistrationResponse startRegistrationResponse = new StartRegistrationResponse();
        DEFAULT_INSTANCE = startRegistrationResponse;
        AbstractC0269h.registerDefaultInstance(StartRegistrationResponse.class, startRegistrationResponse);
    }

    private StartRegistrationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001Ȉ\u0002\n\u0003ဉ\u0000\u0004ဉ\u0001\u0005\u001b\u0006\u001b\u0007ဉ\u0002\b\f\t\u0003", new Object[]{"bitField0_", "sessionId_", "challenge_", "rp_", "user_", "pubKeyCredParams_", PubKeyCredParam.class, "excludeCredentials_", ExcludedCredential.class, "authenticatorSelection_", "attestation_", "timeoutMs_"});
        }
        if (iOrdinal == 3) {
            return new StartRegistrationResponse();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 29);
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
        synchronized (StartRegistrationResponse.class) {
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

    public final String getSessionId() {
        return this.sessionId_;
    }

    /* JADX INFO: renamed from: n */
    public final jq6 m16683n() {
        jq6 jq6Var;
        int i = this.attestation_;
        if (i == 0) {
            jq6Var = jq6.ATTESTATION_UNSPECIFIED;
        } else if (i == 1) {
            jq6Var = jq6.ATTESTATION_NONE;
        } else if (i == 2) {
            jq6Var = jq6.ATTESTATION_INDIRECT;
        } else if (i != 3) {
            jq6Var = i != 4 ? null : jq6.ATTESTATION_ENTERPRISE;
        } else {
            jq6Var = jq6.ATTESTATION_DIRECT;
        }
        return jq6Var == null ? jq6.UNRECOGNIZED : jq6Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final AuthenticatorSelection m16684o() {
        AuthenticatorSelection authenticatorSelection = this.authenticatorSelection_;
        return authenticatorSelection == null ? AuthenticatorSelection.m16633o() : authenticatorSelection;
    }

    /* JADX INFO: renamed from: p */
    public final gva m16685p() {
        return this.challenge_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m16686q() {
        return this.excludeCredentials_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m16687r() {
        return this.pubKeyCredParams_;
    }

    /* JADX INFO: renamed from: s */
    public final RelyingParty m16688s() {
        RelyingParty relyingParty = this.rp_;
        return relyingParty == null ? RelyingParty.m16670n() : relyingParty;
    }

    /* JADX INFO: renamed from: t */
    public final long m16689t() {
        return this.timeoutMs_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final PasskeyUser m16690u() {
        PasskeyUser passkeyUser = this.user_;
        return passkeyUser == null ? PasskeyUser.m16666n() : passkeyUser;
    }
}
