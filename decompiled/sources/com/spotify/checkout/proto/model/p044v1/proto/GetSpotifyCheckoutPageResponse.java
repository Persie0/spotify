package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.nb10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetSpotifyCheckoutPageResponse extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_ITEM_UNAVAILABLE_FIELD_NUMBER = 2;
    public static final int CHECKOUT_STATUS_FIELD_NUMBER = 3;
    private static final GetSpotifyCheckoutPageResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECT_FIELD_NUMBER = 4;
    public static final int SPOTIFY_CHECKOUT_NATIVE_FIELD_NUMBER = 1;
    private int responseCase_ = 0;
    private Object response_;

    static {
        GetSpotifyCheckoutPageResponse getSpotifyCheckoutPageResponse = new GetSpotifyCheckoutPageResponse();
        DEFAULT_INSTANCE = getSpotifyCheckoutPageResponse;
        AbstractC0269h.registerDefaultInstance(GetSpotifyCheckoutPageResponse.class, getSpotifyCheckoutPageResponse);
    }

    private GetSpotifyCheckoutPageResponse() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6207n(GetSpotifyCheckoutPageResponse getSpotifyCheckoutPageResponse, CheckoutItemUnavailable checkoutItemUnavailable) {
        getSpotifyCheckoutPageResponse.getClass();
        checkoutItemUnavailable.getClass();
        getSpotifyCheckoutPageResponse.response_ = checkoutItemUnavailable;
        getSpotifyCheckoutPageResponse.responseCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m6208o(GetSpotifyCheckoutPageResponse getSpotifyCheckoutPageResponse, CheckoutStatus checkoutStatus) {
        getSpotifyCheckoutPageResponse.getClass();
        checkoutStatus.getClass();
        getSpotifyCheckoutPageResponse.response_ = checkoutStatus;
        getSpotifyCheckoutPageResponse.responseCase_ = 3;
    }

    /* JADX INFO: renamed from: p */
    public static void m6209p(GetSpotifyCheckoutPageResponse getSpotifyCheckoutPageResponse, Error error) {
        getSpotifyCheckoutPageResponse.getClass();
        error.getClass();
        getSpotifyCheckoutPageResponse.response_ = error;
        getSpotifyCheckoutPageResponse.responseCase_ = 5;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6210q(GetSpotifyCheckoutPageResponse getSpotifyCheckoutPageResponse, Redirect redirect) {
        getSpotifyCheckoutPageResponse.getClass();
        redirect.getClass();
        getSpotifyCheckoutPageResponse.response_ = redirect;
        getSpotifyCheckoutPageResponse.responseCase_ = 4;
    }

    /* JADX INFO: renamed from: r */
    public static void m6211r(GetSpotifyCheckoutPageResponse getSpotifyCheckoutPageResponse, SpotifyCheckoutNative spotifyCheckoutNative) {
        getSpotifyCheckoutPageResponse.getClass();
        spotifyCheckoutNative.getClass();
        getSpotifyCheckoutPageResponse.response_ = spotifyCheckoutNative;
        getSpotifyCheckoutPageResponse.responseCase_ = 1;
    }

    /* JADX INFO: renamed from: y */
    public static nb10 m6212y() {
        return (nb10) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000", new Object[]{"response_", "responseCase_", SpotifyCheckoutNative.class, CheckoutItemUnavailable.class, CheckoutStatus.class, Redirect.class, Error.class});
        }
        if (iOrdinal == 3) {
            return new GetSpotifyCheckoutPageResponse();
        }
        if (iOrdinal == 4) {
            return new nb10(DEFAULT_INSTANCE);
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
        synchronized (GetSpotifyCheckoutPageResponse.class) {
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

    /* JADX INFO: renamed from: s */
    public final CheckoutItemUnavailable m6213s() {
        return this.responseCase_ == 2 ? (CheckoutItemUnavailable) this.response_ : CheckoutItemUnavailable.m5986r();
    }

    /* JADX INFO: renamed from: t */
    public final CheckoutStatus m6214t() {
        return this.responseCase_ == 3 ? (CheckoutStatus) this.response_ : CheckoutStatus.m5994s();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Error m6215u() {
        return this.responseCase_ == 5 ? (Error) this.response_ : Error.m6010y();
    }

    /* JADX INFO: renamed from: v */
    public final Redirect m6216v() {
        return this.responseCase_ == 4 ? (Redirect) this.response_ : Redirect.m6323o();
    }

    /* JADX INFO: renamed from: w */
    public final int m6217w() {
        int i = this.responseCase_;
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: x */
    public final SpotifyCheckoutNative m6218x() {
        return this.responseCase_ == 1 ? (SpotifyCheckoutNative) this.response_ : SpotifyCheckoutNative.m6325A();
    }
}
