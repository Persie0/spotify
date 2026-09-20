package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ParentalVerificationMethod extends AbstractC0269h implements sre0 {
    public static final int CARD_FIELD_NUMBER = 2;
    private static final ParentalVerificationMethod DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int YOTI_FIELD_NUMBER = 1;
    private int methodDataCase_ = 0;
    private Object methodData_;

    static {
        ParentalVerificationMethod parentalVerificationMethod = new ParentalVerificationMethod();
        DEFAULT_INSTANCE = parentalVerificationMethod;
        AbstractC0269h.registerDefaultInstance(ParentalVerificationMethod.class, parentalVerificationMethod);
    }

    private ParentalVerificationMethod() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"methodData_", "methodDataCase_", YotiParentalVerification.class, CardParentalVerification.class});
        }
        if (iOrdinal == 3) {
            return new ParentalVerificationMethod();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 2);
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
        synchronized (ParentalVerificationMethod.class) {
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
    public final CardParentalVerification m12161n() {
        return this.methodDataCase_ == 2 ? (CardParentalVerification) this.methodData_ : CardParentalVerification.m12122n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m12162o() {
        int i = this.methodDataCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public final YotiParentalVerification m12163p() {
        return this.methodDataCase_ == 1 ? (YotiParentalVerification) this.methodData_ : YotiParentalVerification.m12166n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
