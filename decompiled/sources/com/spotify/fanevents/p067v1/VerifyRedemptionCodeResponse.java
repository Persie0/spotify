package com.spotify.fanevents.p067v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h2b1;
import p204p.ore0;
import p204p.pre0;
import p204p.qkv0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VerifyRedemptionCodeResponse extends AbstractC0269h implements sre0 {
    private static final VerifyRedemptionCodeResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RESULT_FIELD_NUMBER = 1;
    private int result_;

    static {
        VerifyRedemptionCodeResponse verifyRedemptionCodeResponse = new VerifyRedemptionCodeResponse();
        DEFAULT_INSTANCE = verifyRedemptionCodeResponse;
        AbstractC0269h.registerDefaultInstance(VerifyRedemptionCodeResponse.class, verifyRedemptionCodeResponse);
    }

    private VerifyRedemptionCodeResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"result_"});
        }
        if (iOrdinal == 3) {
            return new VerifyRedemptionCodeResponse();
        }
        if (iOrdinal == 4) {
            return new h2b1(DEFAULT_INSTANCE, 23);
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
        synchronized (VerifyRedemptionCodeResponse.class) {
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
    public final qkv0 m10960n() {
        qkv0 qkv0Var;
        int i = this.result_;
        if (i == 0) {
            qkv0Var = qkv0.REDEMPTION_STATE_UNSPECIFIED;
        } else if (i == 1) {
            qkv0Var = qkv0.REDEMPTION_STATE_PENDING;
        } else if (i == 2) {
            qkv0Var = qkv0.REDEMPTION_STATE_SUCCESS;
        } else if (i != 3) {
            qkv0Var = i != 4 ? null : qkv0.REDEMPTION_STATE_REDEEMED;
        } else {
            qkv0Var = qkv0.REDEMPTION_STATE_INVALID_CODE;
        }
        return qkv0Var == null ? qkv0.UNRECOGNIZED : qkv0Var;
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
