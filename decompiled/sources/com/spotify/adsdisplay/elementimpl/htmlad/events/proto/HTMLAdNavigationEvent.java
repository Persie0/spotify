package com.spotify.adsdisplay.elementimpl.htmlad.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.d6n0;
import p204p.eb20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class HTMLAdNavigationEvent extends AbstractC0269h implements sre0 {
    public static final int AD_ID_FIELD_NUMBER = 2;
    public static final int BLOCK_REASON_FIELD_NUMBER = 8;
    public static final int CREATIVE_ID_FIELD_NUMBER = 5;
    private static final HTMLAdNavigationEvent DEFAULT_INSTANCE;
    public static final int EVENT_TYPE_FIELD_NUMBER = 1;
    public static final int LINEITEM_ID_FIELD_NUMBER = 4;
    public static final int NAVIGATION_SOURCE_FIELD_NUMBER = 10;
    public static final int NAVIGATION_TYPE_FIELD_NUMBER = 9;
    public static final int OUTCOME_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 3;
    public static final int TAP_X_FIELD_NUMBER = 11;
    public static final int TAP_Y_FIELD_NUMBER = 12;
    public static final int URL_FIELD_NUMBER = 6;
    private int bitField0_;
    private double tapX_;
    private double tapY_;
    private String eventType_ = "";
    private String adId_ = "";
    private String requestId_ = "";
    private String lineitemId_ = "";
    private String creativeId_ = "";
    private String url_ = "";
    private String outcome_ = "";
    private String blockReason_ = "";
    private String navigationType_ = "";
    private String navigationSource_ = "";

    static {
        HTMLAdNavigationEvent hTMLAdNavigationEvent = new HTMLAdNavigationEvent();
        DEFAULT_INSTANCE = hTMLAdNavigationEvent;
        AbstractC0269h.registerDefaultInstance(HTMLAdNavigationEvent.class, hTMLAdNavigationEvent);
    }

    private HTMLAdNavigationEvent() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2782n(HTMLAdNavigationEvent hTMLAdNavigationEvent, String str) {
        hTMLAdNavigationEvent.getClass();
        str.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 2;
        hTMLAdNavigationEvent.adId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2783o(HTMLAdNavigationEvent hTMLAdNavigationEvent, String str) {
        hTMLAdNavigationEvent.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 128;
        hTMLAdNavigationEvent.blockReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2784p(HTMLAdNavigationEvent hTMLAdNavigationEvent, String str) {
        hTMLAdNavigationEvent.getClass();
        str.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 16;
        hTMLAdNavigationEvent.creativeId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m2785q(HTMLAdNavigationEvent hTMLAdNavigationEvent) {
        hTMLAdNavigationEvent.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 1;
        hTMLAdNavigationEvent.eventType_ = d6n0.f45729b;
    }

    /* JADX INFO: renamed from: r */
    public static void m2786r(HTMLAdNavigationEvent hTMLAdNavigationEvent, String str) {
        hTMLAdNavigationEvent.getClass();
        str.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 8;
        hTMLAdNavigationEvent.lineitemId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m2787s(HTMLAdNavigationEvent hTMLAdNavigationEvent, String str) {
        hTMLAdNavigationEvent.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 512;
        hTMLAdNavigationEvent.navigationSource_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m2788t(HTMLAdNavigationEvent hTMLAdNavigationEvent, String str) {
        hTMLAdNavigationEvent.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 256;
        hTMLAdNavigationEvent.navigationType_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m2789u(HTMLAdNavigationEvent hTMLAdNavigationEvent, String str) {
        hTMLAdNavigationEvent.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 64;
        hTMLAdNavigationEvent.outcome_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m2790v(HTMLAdNavigationEvent hTMLAdNavigationEvent, String str) {
        hTMLAdNavigationEvent.getClass();
        str.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 4;
        hTMLAdNavigationEvent.requestId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m2791w(HTMLAdNavigationEvent hTMLAdNavigationEvent, double d) {
        hTMLAdNavigationEvent.bitField0_ |= 1024;
        hTMLAdNavigationEvent.tapX_ = d;
    }

    /* JADX INFO: renamed from: x */
    public static void m2792x(HTMLAdNavigationEvent hTMLAdNavigationEvent, double d) {
        hTMLAdNavigationEvent.bitField0_ |= 2048;
        hTMLAdNavigationEvent.tapY_ = d;
    }

    /* JADX INFO: renamed from: y */
    public static void m2793y(HTMLAdNavigationEvent hTMLAdNavigationEvent, String str) {
        hTMLAdNavigationEvent.getClass();
        hTMLAdNavigationEvent.bitField0_ |= 32;
        hTMLAdNavigationEvent.url_ = str;
    }

    /* JADX INFO: renamed from: z */
    public static eb20 m2794z() {
        return (eb20) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဈ\b\nဈ\t\u000bက\n\fက\u000b", new Object[]{"bitField0_", "eventType_", "adId_", "requestId_", "lineitemId_", "creativeId_", "url_", "outcome_", "blockReason_", "navigationType_", "navigationSource_", "tapX_", "tapY_"});
        }
        if (iOrdinal == 3) {
            return new HTMLAdNavigationEvent();
        }
        if (iOrdinal == 4) {
            return new eb20(DEFAULT_INSTANCE);
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
        synchronized (HTMLAdNavigationEvent.class) {
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
