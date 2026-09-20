package com.spotify.adsinternal.adscommon.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.km0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdError extends AbstractC0269h implements sre0 {
    public static final int AD_BREAK_ID_FIELD_NUMBER = 16;
    public static final int AD_CONTENT_ORIGIN_FIELD_NUMBER = 10;
    public static final int AD_ID_FIELD_NUMBER = 7;
    public static final int APP_STARTUP_ID_FIELD_NUMBER = 15;
    private static final AdError DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    public static final int ERROR_TYPE_FIELD_NUMBER = 6;
    public static final int HTTP_ERROR_CODE_FIELD_NUMBER = 3;
    public static final int LINEITEM_ID_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 12;
    public static final int REQUEST_TYPE_FIELD_NUMBER = 1;
    public static final int REQUEST_URL_FIELD_NUMBER = 4;
    public static final int SLOT_FIELD_NUMBER = 11;
    public static final int SLOT_IDS_FIELD_NUMBER = 13;
    public static final int SURFACE_FIELD_NUMBER = 9;
    public static final int TRACKING_EVENT_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 14;
    private int bitField0_;
    private long httpErrorCode_;
    private String requestType_ = "";
    private String errorMessage_ = "";
    private String requestUrl_ = "";
    private String trackingEvent_ = "";
    private String errorType_ = "";
    private String adId_ = "";
    private String lineitemId_ = "";
    private String surface_ = "";
    private String adContentOrigin_ = "";
    private String slot_ = "";
    private String requestId_ = "";
    private ae50 slotIds_ = AbstractC0269h.emptyProtobufList();
    private String type_ = "";
    private String appStartupId_ = "";
    private String adBreakId_ = "";

    static {
        AdError adError = new AdError();
        DEFAULT_INSTANCE = adError;
        AbstractC0269h.registerDefaultInstance(AdError.class, adError);
    }

    private AdError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2834n(AdError adError, String str) {
        adError.getClass();
        str.getClass();
        adError.bitField0_ |= 64;
        adError.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2835o(AdError adError, String str) {
        adError.getClass();
        str.getClass();
        adError.bitField0_ |= 2;
        adError.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2836p(AdError adError, String str) {
        adError.getClass();
        str.getClass();
        adError.bitField0_ |= 32;
        adError.errorType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2837q(AdError adError, String str) {
        adError.getClass();
        str.getClass();
        adError.bitField0_ |= 128;
        adError.lineitemId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m2838r(AdError adError, String str) {
        adError.getClass();
        adError.bitField0_ |= 2048;
        adError.requestId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m2839s(AdError adError, String str) {
        adError.getClass();
        adError.bitField0_ |= 8;
        adError.requestUrl_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m2840t(AdError adError, String str) {
        adError.getClass();
        str.getClass();
        adError.bitField0_ |= 1024;
        adError.slot_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m2841u(AdError adError, String str) {
        adError.getClass();
        adError.bitField0_ |= 256;
        adError.surface_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m2842v(AdError adError, String str) {
        adError.getClass();
        adError.bitField0_ |= 4096;
        adError.type_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static km0 m2843w() {
        return (km0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bဈ\n\fဈ\u000b\r\u001a\u000eဈ\f\u000fဈ\r\u0010ဈ\u000e", new Object[]{"bitField0_", "requestType_", "errorMessage_", "httpErrorCode_", "requestUrl_", "trackingEvent_", "errorType_", "adId_", "lineitemId_", "surface_", "adContentOrigin_", "slot_", "requestId_", "slotIds_", "type_", "appStartupId_", "adBreakId_"});
        }
        if (iOrdinal == 3) {
            return new AdError();
        }
        if (iOrdinal == 4) {
            return new km0(DEFAULT_INSTANCE);
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
        synchronized (AdError.class) {
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
