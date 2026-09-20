package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v9k;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class CreateAccountResponse extends AbstractC0269h implements sre0 {
    public static final int ATTEMPT_ID_FIELD_NUMBER = 4;
    public static final int CHALLENGE_FIELD_NUMBER = 3;
    private static final CreateAccountResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUCCESS_FIELD_NUMBER = 1;
    private Object result_;
    private int resultCase_ = 0;
    private String attemptId_ = "";

    static {
        CreateAccountResponse createAccountResponse = new CreateAccountResponse();
        DEFAULT_INSTANCE = createAccountResponse;
        AbstractC0269h.registerDefaultInstance(CreateAccountResponse.class, createAccountResponse);
    }

    private CreateAccountResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"result_", "resultCase_", CreateAccountSuccessResponse.class, CreateAccountErrorResponse.class, CreateAccountChallengeResponse.class, "attemptId_"});
        }
        if (iOrdinal == 3) {
            return new CreateAccountResponse();
        }
        if (iOrdinal == 4) {
            return new v9k(DEFAULT_INSTANCE, 19);
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
        synchronized (CreateAccountResponse.class) {
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
    public final CreateAccountChallengeResponse m21348n() {
        return this.resultCase_ == 3 ? (CreateAccountChallengeResponse) this.result_ : CreateAccountChallengeResponse.m21337n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CreateAccountErrorResponse m21349o() {
        return this.resultCase_ == 2 ? (CreateAccountErrorResponse) this.result_ : CreateAccountErrorResponse.m21338n();
    }

    /* JADX INFO: renamed from: p */
    public final int m21350p() {
        int i = this.resultCase_;
        if (i == 0) {
            return 4;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public final CreateAccountSuccessResponse m21351q() {
        return this.resultCase_ == 1 ? (CreateAccountSuccessResponse) this.result_ : CreateAccountSuccessResponse.m21352n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
