package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ct31;
import p204p.gva;
import p204p.lya1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class StartAuthenticationResponse extends AbstractC0269h implements sre0 {
    public static final int CHALLENGE_FIELD_NUMBER = 2;
    private static final StartAuthenticationResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RP_ID_FIELD_NUMBER = 3;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int TIMEOUT_MS_FIELD_NUMBER = 5;
    public static final int USER_VERIFICATION_FIELD_NUMBER = 4;
    private long timeoutMs_;
    private int userVerification_;
    private String sessionId_ = "";
    private gva challenge_ = gva.f84678b;
    private String rpId_ = "";

    static {
        StartAuthenticationResponse startAuthenticationResponse = new StartAuthenticationResponse();
        DEFAULT_INSTANCE = startAuthenticationResponse;
        AbstractC0269h.registerDefaultInstance(StartAuthenticationResponse.class, startAuthenticationResponse);
    }

    private StartAuthenticationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003Ȉ\u0004\f\u0005\u0003", new Object[]{"sessionId_", "challenge_", "rpId_", "userVerification_", "timeoutMs_"});
        }
        if (iOrdinal == 3) {
            return new StartAuthenticationResponse();
        }
        if (iOrdinal == 4) {
            return new ct31(DEFAULT_INSTANCE, 26);
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
        synchronized (StartAuthenticationResponse.class) {
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
    public final gva m16676n() {
        return this.challenge_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16677o() {
        return this.rpId_;
    }

    /* JADX INFO: renamed from: p */
    public final long m16678p() {
        return this.timeoutMs_;
    }

    /* JADX INFO: renamed from: q */
    public final lya1 m16679q() {
        lya1 lya1VarM60236a = lya1.m60236a(this.userVerification_);
        return lya1VarM60236a == null ? lya1.UNRECOGNIZED : lya1VarM60236a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
