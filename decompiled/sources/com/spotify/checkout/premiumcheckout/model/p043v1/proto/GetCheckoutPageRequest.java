package com.spotify.checkout.premiumcheckout.model.p043v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.e710;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetCheckoutPageRequest extends AbstractC0269h implements sre0 {
    public static final int CHECKOUTPAGEURL_FIELD_NUMBER = 1;
    public static final int COOKIE_STRING_FIELD_NUMBER = 4;
    private static final GetCheckoutPageRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REFERRER_FIELD_NUMBER = 2;
    public static final int SESSIONID_FIELD_NUMBER = 3;
    private String checkoutPageUrl_ = "";
    private String referrer_ = "";
    private String sessionId_ = "";
    private String cookieString_ = "";

    static {
        GetCheckoutPageRequest getCheckoutPageRequest = new GetCheckoutPageRequest();
        DEFAULT_INSTANCE = getCheckoutPageRequest;
        AbstractC0269h.registerDefaultInstance(GetCheckoutPageRequest.class, getCheckoutPageRequest);
    }

    private GetCheckoutPageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5928n(GetCheckoutPageRequest getCheckoutPageRequest, String str) {
        getCheckoutPageRequest.getClass();
        str.getClass();
        getCheckoutPageRequest.checkoutPageUrl_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m5929o(GetCheckoutPageRequest getCheckoutPageRequest, String str) {
        getCheckoutPageRequest.getClass();
        str.getClass();
        getCheckoutPageRequest.cookieString_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m5930p(GetCheckoutPageRequest getCheckoutPageRequest, String str) {
        getCheckoutPageRequest.getClass();
        getCheckoutPageRequest.referrer_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m5931q(GetCheckoutPageRequest getCheckoutPageRequest, String str) {
        getCheckoutPageRequest.getClass();
        getCheckoutPageRequest.sessionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static e710 m5932r() {
        return (e710) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"checkoutPageUrl_", "referrer_", "sessionId_", "cookieString_"});
        }
        if (iOrdinal == 3) {
            return new GetCheckoutPageRequest();
        }
        if (iOrdinal == 4) {
            return new e710(DEFAULT_INSTANCE);
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
        synchronized (GetCheckoutPageRequest.class) {
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
