package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mb10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class GetSpotifyCheckoutPageRequest extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final GetSpotifyCheckoutPageRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TRACKING_DATA_FIELD_NUMBER = 15;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private TrackingData trackingData_;

    static {
        GetSpotifyCheckoutPageRequest getSpotifyCheckoutPageRequest = new GetSpotifyCheckoutPageRequest();
        DEFAULT_INSTANCE = getSpotifyCheckoutPageRequest;
        AbstractC0269h.registerDefaultInstance(GetSpotifyCheckoutPageRequest.class, getSpotifyCheckoutPageRequest);
    }

    private GetSpotifyCheckoutPageRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6203n(GetSpotifyCheckoutPageRequest getSpotifyCheckoutPageRequest, String str) {
        getSpotifyCheckoutPageRequest.getClass();
        str.getClass();
        getSpotifyCheckoutPageRequest.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6204o(GetSpotifyCheckoutPageRequest getSpotifyCheckoutPageRequest, TrackingData trackingData) {
        getSpotifyCheckoutPageRequest.getClass();
        trackingData.getClass();
        getSpotifyCheckoutPageRequest.trackingData_ = trackingData;
        getSpotifyCheckoutPageRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static GetSpotifyCheckoutPageRequest m6205p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static mb10 m6206q() {
        return (mb10) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u000f\u0002\u0000\u0000\u0000\u0001Ȉ\u000fဉ\u0000", new Object[]{"bitField0_", "checkoutSessionId_", "trackingData_"});
        }
        if (iOrdinal == 3) {
            return new GetSpotifyCheckoutPageRequest();
        }
        if (iOrdinal == 4) {
            return new mb10(DEFAULT_INSTANCE);
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
        synchronized (GetSpotifyCheckoutPageRequest.class) {
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
