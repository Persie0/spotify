package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.dbw;
import p204p.ore0;
import p204p.p1v;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateResult$AuthenticateResult extends AbstractC0269h implements sre0 {
    public static final int AUTHNPLATFORMREQUIRED_FIELD_NUMBER = 6;
    public static final int CODEREQUIRED_FIELD_NUMBER = 3;
    private static final EsAuthenticateResult$AuthenticateResult DEFAULT_INSTANCE;
    public static final int FAILURE_FIELD_NUMBER = 2;
    public static final int INTERACTIONREQUIRED_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SIGNUPREQUIRED_FIELD_NUMBER = 4;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private int resultCase_ = 0;
    private Object result_;

    static {
        EsAuthenticateResult$AuthenticateResult esAuthenticateResult$AuthenticateResult = new EsAuthenticateResult$AuthenticateResult();
        DEFAULT_INSTANCE = esAuthenticateResult$AuthenticateResult;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateResult$AuthenticateResult.class, esAuthenticateResult$AuthenticateResult);
    }

    private EsAuthenticateResult$AuthenticateResult() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: v */
    public static EsAuthenticateResult$AuthenticateResult m3570v(byte[] bArr) {
        return (EsAuthenticateResult$AuthenticateResult) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"result_", "resultCase_", EsAuthenticateResult$AuthenticateSuccess.class, EsAuthenticateResult$AuthenticateFailure.class, EsCodeRequired$CodeRequired.class, EsSignupRequired$SignupRequired.class, EsInteractionRequired$InteractionRequired.class, EsAuthnPlatformRequired$AuthnPlatformRequired.class});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateResult$AuthenticateResult();
        }
        if (iOrdinal == 4) {
            return new dbw(23);
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
        synchronized (EsAuthenticateResult$AuthenticateResult.class) {
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
    public final EsAuthnPlatformRequired$AuthnPlatformRequired m3571o() {
        return this.resultCase_ == 6 ? (EsAuthnPlatformRequired$AuthnPlatformRequired) this.result_ : EsAuthnPlatformRequired$AuthnPlatformRequired.m3583o();
    }

    /* JADX INFO: renamed from: p */
    public final EsCodeRequired$CodeRequired m3572p() {
        return this.resultCase_ == 3 ? (EsCodeRequired$CodeRequired) this.result_ : EsCodeRequired$CodeRequired.m3595q();
    }

    /* JADX INFO: renamed from: q */
    public final EsAuthenticateResult$AuthenticateFailure m3573q() {
        return this.resultCase_ == 2 ? (EsAuthenticateResult$AuthenticateFailure) this.result_ : EsAuthenticateResult$AuthenticateFailure.m3562o();
    }

    /* JADX INFO: renamed from: r */
    public final EsInteractionRequired$InteractionRequired m3574r() {
        return this.resultCase_ == 5 ? (EsInteractionRequired$InteractionRequired) this.result_ : EsInteractionRequired$InteractionRequired.m3623p();
    }

    /* JADX INFO: renamed from: s */
    public final int m3575s() {
        return p1v.m68845b(this.resultCase_);
    }

    /* JADX INFO: renamed from: t */
    public final EsSignupRequired$SignupRequired m3576t() {
        return this.resultCase_ == 4 ? (EsSignupRequired$SignupRequired) this.result_ : EsSignupRequired$SignupRequired.m3640p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final EsAuthenticateResult$AuthenticateSuccess m3577u() {
        return this.resultCase_ == 1 ? (EsAuthenticateResult$AuthenticateSuccess) this.result_ : EsAuthenticateResult$AuthenticateSuccess.m3579q();
    }
}
