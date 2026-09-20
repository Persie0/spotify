package com.spotify.payment.paymentimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.j1e;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CheckoutViewJS extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_COUNTRY_FIELD_NUMBER = 4;
    public static final int CHECKOUT_VIEW_ID_FIELD_NUMBER = 1;
    public static final int CLIENT_CONTEXT_FIELD_NUMBER = 3;
    public static final int CLIENT_ID_FIELD_NUMBER = 2;
    private static final CheckoutViewJS DEFAULT_INSTANCE;
    public static final int GRAYED_OUT_PROVIDERS_FIELD_NUMBER = 12;
    public static final int HAS_STORED_DETAILS_FIELD_NUMBER = 5;
    public static final int HIGHLIGHTED_PROVIDER_FIELD_NUMBER = 10;
    public static final int INITIAL_PROVIDER_FIELD_NUMBER = 9;
    public static final int NUMBER_OF_STORED_DETAILS_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PAYMENT_SESSION_ID_FIELD_NUMBER = 11;
    public static final int PROVIDERS_FIELD_NUMBER = 8;
    public static final int STORED_METHOD_FIELD_NUMBER = 6;
    private int bitField0_;
    private boolean hasStoredDetails_;
    private int numberOfStoredDetails_;
    private String checkoutViewId_ = "";
    private String clientId_ = "";
    private String clientContext_ = "";
    private String checkoutCountry_ = "";
    private String storedMethod_ = "";
    private ae50 providers_ = AbstractC0269h.emptyProtobufList();
    private String initialProvider_ = "";
    private String highlightedProvider_ = "";
    private String paymentSessionId_ = "";
    private ae50 grayedOutProviders_ = AbstractC0269h.emptyProtobufList();

    static {
        CheckoutViewJS checkoutViewJS = new CheckoutViewJS();
        DEFAULT_INSTANCE = checkoutViewJS;
        AbstractC0269h.registerDefaultInstance(CheckoutViewJS.class, checkoutViewJS);
    }

    private CheckoutViewJS() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16946n(CheckoutViewJS checkoutViewJS, ArrayList arrayList) {
        ae50 ae50Var = checkoutViewJS.grayedOutProviders_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            checkoutViewJS.grayedOutProviders_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, checkoutViewJS.grayedOutProviders_);
    }

    /* JADX INFO: renamed from: o */
    public static void m16947o(CheckoutViewJS checkoutViewJS, ArrayList arrayList) {
        ae50 ae50Var = checkoutViewJS.providers_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            checkoutViewJS.providers_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, checkoutViewJS.providers_);
    }

    /* JADX INFO: renamed from: p */
    public static void m16948p(CheckoutViewJS checkoutViewJS, String str) {
        checkoutViewJS.getClass();
        str.getClass();
        checkoutViewJS.bitField0_ |= 8;
        checkoutViewJS.checkoutCountry_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m16949q(CheckoutViewJS checkoutViewJS, String str) {
        checkoutViewJS.getClass();
        str.getClass();
        checkoutViewJS.bitField0_ |= 1;
        checkoutViewJS.checkoutViewId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m16950r(CheckoutViewJS checkoutViewJS, String str) {
        checkoutViewJS.getClass();
        str.getClass();
        checkoutViewJS.bitField0_ |= 4;
        checkoutViewJS.clientContext_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m16951s(CheckoutViewJS checkoutViewJS, String str) {
        checkoutViewJS.getClass();
        str.getClass();
        checkoutViewJS.bitField0_ |= 2;
        checkoutViewJS.clientId_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m16952t(CheckoutViewJS checkoutViewJS, boolean z) {
        checkoutViewJS.bitField0_ |= 16;
        checkoutViewJS.hasStoredDetails_ = z;
    }

    /* JADX INFO: renamed from: u */
    public static void m16953u(CheckoutViewJS checkoutViewJS, int i) {
        checkoutViewJS.bitField0_ |= 64;
        checkoutViewJS.numberOfStoredDetails_ = i;
    }

    /* JADX INFO: renamed from: v */
    public static void m16954v(CheckoutViewJS checkoutViewJS, String str) {
        checkoutViewJS.getClass();
        str.getClass();
        checkoutViewJS.bitField0_ |= 512;
        checkoutViewJS.paymentSessionId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m16955w(CheckoutViewJS checkoutViewJS, String str) {
        checkoutViewJS.getClass();
        str.getClass();
        checkoutViewJS.bitField0_ |= 32;
        checkoutViewJS.storedMethod_ = str;
    }

    /* JADX INFO: renamed from: x */
    public static j1e m16956x() {
        return (j1e) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007င\u0006\b\u001a\tဈ\u0007\nဈ\b\u000bဈ\t\f\u001a", new Object[]{"bitField0_", "checkoutViewId_", "clientId_", "clientContext_", "checkoutCountry_", "hasStoredDetails_", "storedMethod_", "numberOfStoredDetails_", "providers_", "initialProvider_", "highlightedProvider_", "paymentSessionId_", "grayedOutProviders_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutViewJS();
        }
        if (iOrdinal == 4) {
            return new j1e(DEFAULT_INSTANCE);
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
        synchronized (CheckoutViewJS.class) {
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
