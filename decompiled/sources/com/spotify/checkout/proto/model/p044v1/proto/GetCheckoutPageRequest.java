package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d710;
import p204p.k761;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetCheckoutPageRequest extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final GetCheckoutPageRequest DEFAULT_INSTANCE;
    public static final int GPB_COUNTRY_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SUPPORTS_GPB_FIELD_NUMBER = 2;
    public static final int TRACKING_DATA_FIELD_NUMBER = 15;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private String gpbCountry_ = "";
    private int supportsGpb_;
    private TrackingData trackingData_;

    static {
        GetCheckoutPageRequest getCheckoutPageRequest = new GetCheckoutPageRequest();
        DEFAULT_INSTANCE = getCheckoutPageRequest;
        AbstractC0269h.registerDefaultInstance(GetCheckoutPageRequest.class, getCheckoutPageRequest);
    }

    private GetCheckoutPageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6046n(GetCheckoutPageRequest getCheckoutPageRequest, String str) {
        getCheckoutPageRequest.getClass();
        str.getClass();
        getCheckoutPageRequest.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6047o(GetCheckoutPageRequest getCheckoutPageRequest, String str) {
        getCheckoutPageRequest.getClass();
        str.getClass();
        getCheckoutPageRequest.gpbCountry_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6048p(GetCheckoutPageRequest getCheckoutPageRequest, k761 k761Var) {
        getCheckoutPageRequest.getClass();
        getCheckoutPageRequest.supportsGpb_ = k761Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6049q(GetCheckoutPageRequest getCheckoutPageRequest, TrackingData trackingData) {
        getCheckoutPageRequest.getClass();
        trackingData.getClass();
        getCheckoutPageRequest.trackingData_ = trackingData;
        getCheckoutPageRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static d710 m6050s() {
        return (d710) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u000f\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003Ȉ\u000fဉ\u0000", new Object[]{"bitField0_", "checkoutSessionId_", "supportsGpb_", "gpbCountry_", "trackingData_"});
        }
        if (iOrdinal == 3) {
            return new GetCheckoutPageRequest();
        }
        if (iOrdinal == 4) {
            return new d710(DEFAULT_INSTANCE);
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

    /* JADX INFO: renamed from: r */
    public final String m6051r() {
        return this.checkoutSessionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
