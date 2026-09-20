package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.j1b;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CPHostedCheckoutPaymentEjectedToWeb extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final CPHostedCheckoutPaymentEjectedToWeb DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_METHOD_ID_FIELD_NUMBER = 3;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 2;
    public static final int WEB_URL_FIELD_NUMBER = 4;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private String paymentSessionId_ = "";
    private String paymentMethodId_ = "";
    private String webUrl_ = "";

    static {
        CPHostedCheckoutPaymentEjectedToWeb cPHostedCheckoutPaymentEjectedToWeb = new CPHostedCheckoutPaymentEjectedToWeb();
        DEFAULT_INSTANCE = cPHostedCheckoutPaymentEjectedToWeb;
        AbstractC0269h.registerDefaultInstance(CPHostedCheckoutPaymentEjectedToWeb.class, cPHostedCheckoutPaymentEjectedToWeb);
    }

    private CPHostedCheckoutPaymentEjectedToWeb() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6761n(CPHostedCheckoutPaymentEjectedToWeb cPHostedCheckoutPaymentEjectedToWeb, String str) {
        cPHostedCheckoutPaymentEjectedToWeb.getClass();
        str.getClass();
        cPHostedCheckoutPaymentEjectedToWeb.bitField0_ |= 1;
        cPHostedCheckoutPaymentEjectedToWeb.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6762o(CPHostedCheckoutPaymentEjectedToWeb cPHostedCheckoutPaymentEjectedToWeb, String str) {
        cPHostedCheckoutPaymentEjectedToWeb.getClass();
        str.getClass();
        cPHostedCheckoutPaymentEjectedToWeb.bitField0_ |= 4;
        cPHostedCheckoutPaymentEjectedToWeb.paymentMethodId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6763p(CPHostedCheckoutPaymentEjectedToWeb cPHostedCheckoutPaymentEjectedToWeb, String str) {
        cPHostedCheckoutPaymentEjectedToWeb.getClass();
        str.getClass();
        cPHostedCheckoutPaymentEjectedToWeb.bitField0_ |= 2;
        cPHostedCheckoutPaymentEjectedToWeb.paymentSessionId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6764q(CPHostedCheckoutPaymentEjectedToWeb cPHostedCheckoutPaymentEjectedToWeb, String str) {
        cPHostedCheckoutPaymentEjectedToWeb.getClass();
        cPHostedCheckoutPaymentEjectedToWeb.bitField0_ |= 8;
        cPHostedCheckoutPaymentEjectedToWeb.webUrl_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static j1b m6765r() {
        return (j1b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "checkoutSessionId_", "paymentSessionId_", "paymentMethodId_", "webUrl_"});
        }
        if (iOrdinal == 3) {
            return new CPHostedCheckoutPaymentEjectedToWeb();
        }
        if (iOrdinal == 4) {
            return new j1b(DEFAULT_INSTANCE);
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
        synchronized (CPHostedCheckoutPaymentEjectedToWeb.class) {
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
