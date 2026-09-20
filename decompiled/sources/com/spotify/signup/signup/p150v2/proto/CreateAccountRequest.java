package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t4l;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class CreateAccountRequest extends AbstractC0269h implements sre0 {
    public static final int ACCOUNT_DETAILS_FIELD_NUMBER = 2;
    public static final int CALLBACK_URI_FIELD_NUMBER = 1;
    public static final int CLIENT_INFO_FIELD_NUMBER = 3;
    private static final CreateAccountRequest DEFAULT_INSTANCE;
    public static final int FLOW_ID_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int RECAPTCHA_TOKEN_FIELD_NUMBER = 5;
    public static final int SUBMISSION_ID_FIELD_NUMBER = 7;
    public static final int TRACKING_FIELD_NUMBER = 4;
    private AccountDetails accountDetails_;
    private int bitField0_;
    private ClientInfo clientInfo_;
    private Tracking tracking_;
    private String callbackUri_ = "";
    private String recaptchaToken_ = "";
    private String submissionId_ = "";
    private String flowId_ = "";

    static {
        CreateAccountRequest createAccountRequest = new CreateAccountRequest();
        DEFAULT_INSTANCE = createAccountRequest;
        AbstractC0269h.registerDefaultInstance(CreateAccountRequest.class, createAccountRequest);
    }

    private CreateAccountRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21340n(CreateAccountRequest createAccountRequest, AccountDetails accountDetails) {
        createAccountRequest.getClass();
        accountDetails.getClass();
        createAccountRequest.accountDetails_ = accountDetails;
        createAccountRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m21341o(CreateAccountRequest createAccountRequest) {
        createAccountRequest.getClass();
        createAccountRequest.callbackUri_ = "https://auth-callback.spotify.com/r/android/music/signup";
    }

    /* JADX INFO: renamed from: p */
    public static void m21342p(CreateAccountRequest createAccountRequest, ClientInfo clientInfo) {
        createAccountRequest.getClass();
        clientInfo.getClass();
        createAccountRequest.clientInfo_ = clientInfo;
        createAccountRequest.bitField0_ |= 2;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21343q(CreateAccountRequest createAccountRequest, String str) {
        createAccountRequest.getClass();
        createAccountRequest.flowId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m21344r(CreateAccountRequest createAccountRequest, String str) {
        createAccountRequest.getClass();
        str.getClass();
        createAccountRequest.recaptchaToken_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m21345s(CreateAccountRequest createAccountRequest, Tracking tracking) {
        createAccountRequest.getClass();
        tracking.getClass();
        createAccountRequest.tracking_ = tracking;
        createAccountRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: u */
    public static t4l m21347u() {
        return (t4l) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0007Ȉ\bȈ", new Object[]{"bitField0_", "callbackUri_", "accountDetails_", "clientInfo_", "tracking_", "recaptchaToken_", "submissionId_", "flowId_"});
        }
        if (iOrdinal == 3) {
            return new CreateAccountRequest();
        }
        if (iOrdinal == 4) {
            return new t4l();
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
        synchronized (CreateAccountRequest.class) {
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
