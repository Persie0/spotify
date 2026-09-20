package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r9z;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class FinishAuthenticationRequest extends AbstractC0269h implements sre0 {
    public static final int AUTHENTICATOR_DATA_FIELD_NUMBER = 5;
    public static final int CLIENT_DATA_JSON_FIELD_NUMBER = 4;
    public static final int CREDENTIAL_ID_FIELD_NUMBER = 3;
    private static final FinishAuthenticationRequest DEFAULT_INSTANCE;
    public static final int IDENTITY_ASSERTION_OPTIONS_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 2;
    public static final int SIGNALS_FIELD_NUMBER = 1;
    public static final int SIGNATURE_FIELD_NUMBER = 6;
    public static final int USER_HANDLE_FIELD_NUMBER = 7;
    private gva authenticatorData_;
    private int bitField0_;
    private gva clientDataJson_;
    private gva credentialId_;
    private IdentityAssertionOptions identityAssertionOptions_;
    private String sessionId_ = "";
    private Signals signals_;
    private gva signature_;
    private gva userHandle_;

    static {
        FinishAuthenticationRequest finishAuthenticationRequest = new FinishAuthenticationRequest();
        DEFAULT_INSTANCE = finishAuthenticationRequest;
        AbstractC0269h.registerDefaultInstance(FinishAuthenticationRequest.class, finishAuthenticationRequest);
    }

    private FinishAuthenticationRequest() {
        cva cvaVar = gva.f84678b;
        this.credentialId_ = cvaVar;
        this.clientDataJson_ = cvaVar;
        this.authenticatorData_ = cvaVar;
        this.signature_ = cvaVar;
        this.userHandle_ = cvaVar;
    }

    /* JADX INFO: renamed from: n */
    public static void m16640n(FinishAuthenticationRequest finishAuthenticationRequest, cva cvaVar) {
        finishAuthenticationRequest.getClass();
        finishAuthenticationRequest.authenticatorData_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m16641o(FinishAuthenticationRequest finishAuthenticationRequest, cva cvaVar) {
        finishAuthenticationRequest.getClass();
        finishAuthenticationRequest.clientDataJson_ = cvaVar;
    }

    /* JADX INFO: renamed from: p */
    public static void m16642p(FinishAuthenticationRequest finishAuthenticationRequest, cva cvaVar) {
        finishAuthenticationRequest.getClass();
        finishAuthenticationRequest.credentialId_ = cvaVar;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16643q(FinishAuthenticationRequest finishAuthenticationRequest, IdentityAssertionOptions identityAssertionOptions) {
        finishAuthenticationRequest.getClass();
        identityAssertionOptions.getClass();
        finishAuthenticationRequest.identityAssertionOptions_ = identityAssertionOptions;
        finishAuthenticationRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static void m16644r(FinishAuthenticationRequest finishAuthenticationRequest, String str) {
        finishAuthenticationRequest.getClass();
        str.getClass();
        finishAuthenticationRequest.sessionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m16645s(FinishAuthenticationRequest finishAuthenticationRequest, Signals signals) {
        finishAuthenticationRequest.getClass();
        signals.getClass();
        finishAuthenticationRequest.signals_ = signals;
        finishAuthenticationRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: t */
    public static void m16646t(FinishAuthenticationRequest finishAuthenticationRequest, cva cvaVar) {
        finishAuthenticationRequest.getClass();
        finishAuthenticationRequest.signature_ = cvaVar;
    }

    /* JADX INFO: renamed from: u */
    public static void m16647u(FinishAuthenticationRequest finishAuthenticationRequest, cva cvaVar) {
        finishAuthenticationRequest.getClass();
        finishAuthenticationRequest.userHandle_ = cvaVar;
    }

    /* JADX INFO: renamed from: w */
    public static r9z m16649w() {
        return (r9z) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\n\u0004\n\u0005\n\u0006\n\u0007\n\bဉ\u0001", new Object[]{"bitField0_", "signals_", "sessionId_", "credentialId_", "clientDataJson_", "authenticatorData_", "signature_", "userHandle_", "identityAssertionOptions_"});
        }
        if (iOrdinal == 3) {
            return new FinishAuthenticationRequest();
        }
        if (iOrdinal == 4) {
            return new r9z();
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
        synchronized (FinishAuthenticationRequest.class) {
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
