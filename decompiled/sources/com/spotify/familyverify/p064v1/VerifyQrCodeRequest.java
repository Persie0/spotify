package com.spotify.familyverify.p064v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.udb1;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class VerifyQrCodeRequest extends AbstractC0269h implements sre0 {
    private static final VerifyQrCodeRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VERIFICATION_CODE_FIELD_NUMBER = 1;
    private String verificationCode_ = "";

    static {
        VerifyQrCodeRequest verifyQrCodeRequest = new VerifyQrCodeRequest();
        DEFAULT_INSTANCE = verifyQrCodeRequest;
        AbstractC0269h.registerDefaultInstance(VerifyQrCodeRequest.class, verifyQrCodeRequest);
    }

    private VerifyQrCodeRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m10662n(VerifyQrCodeRequest verifyQrCodeRequest, String str) {
        verifyQrCodeRequest.getClass();
        str.getClass();
        verifyQrCodeRequest.verificationCode_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static udb1 m10664p() {
        return (udb1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"verificationCode_"});
        }
        if (iOrdinal == 3) {
            return new VerifyQrCodeRequest();
        }
        if (iOrdinal == 4) {
            return new udb1();
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
        synchronized (VerifyQrCodeRequest.class) {
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
