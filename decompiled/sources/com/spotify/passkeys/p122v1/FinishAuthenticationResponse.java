package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import p204p.byy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class FinishAuthenticationResponse extends AbstractC0269h implements sre0 {
    private static final FinishAuthenticationResponse DEFAULT_INSTANCE;
    public static final int IDENTITY_ASSERTION_FIELD_NUMBER = 2;
    public static final int ONE_TIME_TOKEN_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int loginCredentialCase_ = 0;
    private Object loginCredential_;

    static {
        FinishAuthenticationResponse finishAuthenticationResponse = new FinishAuthenticationResponse();
        DEFAULT_INSTANCE = finishAuthenticationResponse;
        AbstractC0269h.registerDefaultInstance(FinishAuthenticationResponse.class, finishAuthenticationResponse);
    }

    private FinishAuthenticationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"loginCredential_", "loginCredentialCase_", OneTimeToken.class, IdentityAssertion.class});
        }
        if (iOrdinal == 3) {
            return new FinishAuthenticationResponse();
        }
        if (iOrdinal == 4) {
            return new byy(DEFAULT_INSTANCE, 10);
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
        synchronized (FinishAuthenticationResponse.class) {
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

    /* JADX INFO: renamed from: n */
    public final IdentityAssertion m16650n() {
        return this.loginCredentialCase_ == 2 ? (IdentityAssertion) this.loginCredential_ : IdentityAssertion.m16660n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m16651o() {
        return this.loginCredentialCase_ == 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
