package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.uiw;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class EsCodeRequired$CodeRequiredProceedRequest extends AbstractC0269h implements sre0 {
    public static final int CODE_FIELD_NUMBER = 2;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final EsCodeRequired$CodeRequiredProceedRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int RECAPTCHA_INFO_FIELD_NUMBER = 3;
    private int bitField0_;
    private String code_ = "";
    private EsAuthenticateContext$AuthenticateContext context_;
    private EsRecaptchaInfo$RecaptchaInfo recaptchaInfo_;

    static {
        EsCodeRequired$CodeRequiredProceedRequest esCodeRequired$CodeRequiredProceedRequest = new EsCodeRequired$CodeRequiredProceedRequest();
        DEFAULT_INSTANCE = esCodeRequired$CodeRequiredProceedRequest;
        AbstractC0269h.registerDefaultInstance(EsCodeRequired$CodeRequiredProceedRequest.class, esCodeRequired$CodeRequiredProceedRequest);
    }

    private EsCodeRequired$CodeRequiredProceedRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3608n(EsCodeRequired$CodeRequiredProceedRequest esCodeRequired$CodeRequiredProceedRequest, String str) {
        esCodeRequired$CodeRequiredProceedRequest.getClass();
        str.getClass();
        esCodeRequired$CodeRequiredProceedRequest.code_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m3609o(EsCodeRequired$CodeRequiredProceedRequest esCodeRequired$CodeRequiredProceedRequest, EsAuthenticateContext$AuthenticateContext esAuthenticateContext$AuthenticateContext) {
        esCodeRequired$CodeRequiredProceedRequest.getClass();
        esAuthenticateContext$AuthenticateContext.getClass();
        esCodeRequired$CodeRequiredProceedRequest.context_ = esAuthenticateContext$AuthenticateContext;
        esCodeRequired$CodeRequiredProceedRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m3610p(EsCodeRequired$CodeRequiredProceedRequest esCodeRequired$CodeRequiredProceedRequest, EsRecaptchaInfo$RecaptchaInfo esRecaptchaInfo$RecaptchaInfo) {
        esCodeRequired$CodeRequiredProceedRequest.getClass();
        esCodeRequired$CodeRequiredProceedRequest.recaptchaInfo_ = esRecaptchaInfo$RecaptchaInfo;
        esCodeRequired$CodeRequiredProceedRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static uiw m3611q() {
        return (uiw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001", new Object[]{"bitField0_", "context_", "code_", "recaptchaInfo_"});
        }
        if (iOrdinal == 3) {
            return new EsCodeRequired$CodeRequiredProceedRequest();
        }
        if (iOrdinal == 4) {
            return new uiw(DEFAULT_INSTANCE);
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
        synchronized (EsCodeRequired$CodeRequiredProceedRequest.class) {
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
