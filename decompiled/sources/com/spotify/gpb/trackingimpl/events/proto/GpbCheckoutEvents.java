package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qp10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GpbCheckoutEvents extends AbstractC0269h implements sre0 {
    public static final int ACCEPT_LANGUAGE_FIELD_NUMBER = 14;
    public static final int ACTION_FIELD_NUMBER = 1;
    public static final int BILLING_CHOICE_FIELD_NUMBER = 7;
    public static final int CURRENT_STEP_FIELD_NUMBER = 2;
    private static final GpbCheckoutEvents DEFAULT_INSTANCE;
    public static final int GPB_SESSION_ID_FIELD_NUMBER = 10;
    public static final int G_ORDER_ID_FIELD_NUMBER = 9;
    public static final int OFFER_COUNTRY_FIELD_NUMBER = 5;
    public static final int OFFER_TYPE_ID_FIELD_NUMBER = 12;
    public static final int OFFER_UUID_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_SDK_VIEW_ID_FIELD_NUMBER = 13;
    public static final int PREMIUM_CHECKOUT_PAGE_CORRELATION_ID_FIELD_NUMBER = 15;
    public static final int PURCHASE_STATUS_FIELD_NUMBER = 8;
    public static final int REGISTRATION_COUNTRY_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 3;
    public static final int VARIANT_FIELD_NUMBER = 11;
    private int bitField0_;
    private String action_ = "";
    private String currentStep_ = "";
    private String source_ = "";
    private String registrationCountry_ = "";
    private String offerCountry_ = "";
    private String offerUuid_ = "";
    private String billingChoice_ = "";
    private String purchaseStatus_ = "";
    private String gOrderId_ = "";
    private String gpbSessionId_ = "";
    private String variant_ = "";
    private String offerTypeId_ = "";
    private String paymentSdkViewId_ = "";
    private String acceptLanguage_ = "";
    private String premiumCheckoutPageCorrelationId_ = "";

    static {
        GpbCheckoutEvents gpbCheckoutEvents = new GpbCheckoutEvents();
        DEFAULT_INSTANCE = gpbCheckoutEvents;
        AbstractC0269h.registerDefaultInstance(GpbCheckoutEvents.class, gpbCheckoutEvents);
    }

    private GpbCheckoutEvents() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11209n(GpbCheckoutEvents gpbCheckoutEvents, String str) {
        gpbCheckoutEvents.getClass();
        gpbCheckoutEvents.bitField0_ |= 1;
        gpbCheckoutEvents.action_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11210o(GpbCheckoutEvents gpbCheckoutEvents) {
        gpbCheckoutEvents.getClass();
        gpbCheckoutEvents.bitField0_ |= 64;
        gpbCheckoutEvents.billingChoice_ = "SPOTIFY";
    }

    /* JADX INFO: renamed from: p */
    public static void m11211p(GpbCheckoutEvents gpbCheckoutEvents) {
        gpbCheckoutEvents.getClass();
        gpbCheckoutEvents.bitField0_ |= 2;
        gpbCheckoutEvents.currentStep_ = "native_billing_client";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11212q(GpbCheckoutEvents gpbCheckoutEvents, String str) {
        gpbCheckoutEvents.getClass();
        str.getClass();
        gpbCheckoutEvents.bitField0_ |= 256;
        gpbCheckoutEvents.gOrderId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m11213r(GpbCheckoutEvents gpbCheckoutEvents, String str) {
        gpbCheckoutEvents.getClass();
        gpbCheckoutEvents.bitField0_ |= 512;
        gpbCheckoutEvents.gpbSessionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m11214s(GpbCheckoutEvents gpbCheckoutEvents, String str) {
        gpbCheckoutEvents.getClass();
        gpbCheckoutEvents.bitField0_ |= 128;
        gpbCheckoutEvents.purchaseStatus_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m11215t(GpbCheckoutEvents gpbCheckoutEvents, String str) {
        gpbCheckoutEvents.getClass();
        gpbCheckoutEvents.bitField0_ |= 4;
        gpbCheckoutEvents.source_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static qp10 m11216u() {
        return (qp10) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e", new Object[]{"bitField0_", "action_", "currentStep_", "source_", "registrationCountry_", "offerCountry_", "offerUuid_", "billingChoice_", "purchaseStatus_", "gOrderId_", "gpbSessionId_", "variant_", "offerTypeId_", "paymentSdkViewId_", "acceptLanguage_", "premiumCheckoutPageCorrelationId_"});
        }
        if (iOrdinal == 3) {
            return new GpbCheckoutEvents();
        }
        if (iOrdinal == 4) {
            return new qp10(DEFAULT_INSTANCE);
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
        synchronized (GpbCheckoutEvents.class) {
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
