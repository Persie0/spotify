package com.spotify.authentication.login5esperanto;

import com.google.protobuf.AbstractC0269h;
import p204p.diw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class EsAuthenticateRequest$AuthenticateRequest extends AbstractC0269h implements sre0 {
    public static final int CREDENTIALS_FIELD_NUMBER = 1;
    private static final EsAuthenticateRequest$AuthenticateRequest DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 5;
    public static final int INTERACTION_CALLBACK_URI_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int RECAPTCHA_INFO_FIELD_NUMBER = 4;
    public static final int UI_LOCALE_FIELD_NUMBER = 3;
    private int bitField0_;
    private EsAuthenticateCredentials$AuthenticateCredentials credentials_;
    private EsRecaptchaInfo$RecaptchaInfo recaptchaInfo_;
    private String interactionCallbackUri_ = "";
    private String uiLocale_ = "";
    private String flowId_ = "";

    static {
        EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest = new EsAuthenticateRequest$AuthenticateRequest();
        DEFAULT_INSTANCE = esAuthenticateRequest$AuthenticateRequest;
        AbstractC0269h.registerDefaultInstance(EsAuthenticateRequest$AuthenticateRequest.class, esAuthenticateRequest$AuthenticateRequest);
    }

    private EsAuthenticateRequest$AuthenticateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3555n(EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest, EsAuthenticateCredentials$AuthenticateCredentials esAuthenticateCredentials$AuthenticateCredentials) {
        esAuthenticateRequest$AuthenticateRequest.getClass();
        esAuthenticateCredentials$AuthenticateCredentials.getClass();
        esAuthenticateRequest$AuthenticateRequest.credentials_ = esAuthenticateCredentials$AuthenticateCredentials;
        esAuthenticateRequest$AuthenticateRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m3556o(EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest, String str) {
        esAuthenticateRequest$AuthenticateRequest.getClass();
        esAuthenticateRequest$AuthenticateRequest.bitField0_ |= 8;
        esAuthenticateRequest$AuthenticateRequest.flowId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m3557p(EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest) {
        esAuthenticateRequest$AuthenticateRequest.getClass();
        esAuthenticateRequest$AuthenticateRequest.interactionCallbackUri_ = "https://auth-callback.spotify.com/r/android/music/login";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3558q(EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest, EsRecaptchaInfo$RecaptchaInfo esRecaptchaInfo$RecaptchaInfo) {
        esAuthenticateRequest$AuthenticateRequest.getClass();
        esAuthenticateRequest$AuthenticateRequest.recaptchaInfo_ = esRecaptchaInfo$RecaptchaInfo;
        esAuthenticateRequest$AuthenticateRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m3559r(EsAuthenticateRequest$AuthenticateRequest esAuthenticateRequest$AuthenticateRequest, String str) {
        esAuthenticateRequest$AuthenticateRequest.getClass();
        esAuthenticateRequest$AuthenticateRequest.bitField0_ |= 2;
        esAuthenticateRequest$AuthenticateRequest.uiLocale_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static diw m3560s() {
        return (diw) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ለ\u0001\u0004ဉ\u0002\u0005ለ\u0003", new Object[]{"bitField0_", "credentials_", "interactionCallbackUri_", "uiLocale_", "recaptchaInfo_", "flowId_"});
        }
        if (iOrdinal == 3) {
            return new EsAuthenticateRequest$AuthenticateRequest();
        }
        if (iOrdinal == 4) {
            return new diw(DEFAULT_INSTANCE);
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
        synchronized (EsAuthenticateRequest$AuthenticateRequest.class) {
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
