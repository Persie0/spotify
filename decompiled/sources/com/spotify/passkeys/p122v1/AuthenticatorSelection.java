package com.spotify.passkeys.p122v1;

import com.google.protobuf.AbstractC0269h;
import p204p.eyw0;
import p204p.lya1;
import p204p.ore0;
import p204p.pre0;
import p204p.q67;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tm7;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class AuthenticatorSelection extends AbstractC0269h implements sre0 {
    public static final int AUTHENTICATOR_ATTACHMENT_FIELD_NUMBER = 1;
    private static final AuthenticatorSelection DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESIDENT_KEY_FIELD_NUMBER = 2;
    public static final int USER_VERIFICATION_FIELD_NUMBER = 3;
    private int authenticatorAttachment_;
    private int residentKey_;
    private int userVerification_;

    static {
        AuthenticatorSelection authenticatorSelection = new AuthenticatorSelection();
        DEFAULT_INSTANCE = authenticatorSelection;
        AbstractC0269h.registerDefaultInstance(AuthenticatorSelection.class, authenticatorSelection);
    }

    private AuthenticatorSelection() {
    }

    /* JADX INFO: renamed from: o */
    public static AuthenticatorSelection m16633o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"authenticatorAttachment_", "residentKey_", "userVerification_"});
        }
        if (iOrdinal == 3) {
            return new AuthenticatorSelection();
        }
        if (iOrdinal == 4) {
            return new q67(DEFAULT_INSTANCE, 18);
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
        synchronized (AuthenticatorSelection.class) {
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
    public final tm7 m16634n() {
        tm7 tm7Var;
        int i = this.authenticatorAttachment_;
        if (i == 0) {
            tm7Var = tm7.AUTHENTICATOR_ATTACHMENT_UNSPECIFIED;
        } else if (i != 1) {
            tm7Var = i != 2 ? null : tm7.AUTHENTICATOR_ATTACHMENT_CROSS_PLATFORM;
        } else {
            tm7Var = tm7.AUTHENTICATOR_ATTACHMENT_PLATFORM;
        }
        return tm7Var == null ? tm7.UNRECOGNIZED : tm7Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final eyw0 m16635p() {
        eyw0 eyw0Var;
        int i = this.residentKey_;
        if (i == 0) {
            eyw0Var = eyw0.RESIDENT_KEY_UNSPECIFIED;
        } else if (i == 1) {
            eyw0Var = eyw0.RESIDENT_KEY_REQUIRED;
        } else if (i != 2) {
            eyw0Var = i != 3 ? null : eyw0.RESIDENT_KEY_DISCOURAGED;
        } else {
            eyw0Var = eyw0.RESIDENT_KEY_PREFERRED;
        }
        return eyw0Var == null ? eyw0.UNRECOGNIZED : eyw0Var;
    }

    /* JADX INFO: renamed from: q */
    public final lya1 m16636q() {
        lya1 lya1VarM60236a = lya1.m60236a(this.userVerification_);
        return lya1VarM60236a == null ? lya1.UNRECOGNIZED : lya1VarM60236a;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
