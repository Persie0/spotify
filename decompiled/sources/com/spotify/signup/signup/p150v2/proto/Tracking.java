package com.spotify.signup.signup.p150v2.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.StringValue;
import p204p.gt81;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Tracking extends AbstractC0269h implements sre0 {
    public static final int CREATED_BY_PARTNER_FIELD_NUMBER = 5;
    public static final int CREATION_FLOW_FIELD_NUMBER = 2;
    public static final int CREATION_POINT_FIELD_NUMBER = 1;
    private static final Tracking DEFAULT_INSTANCE;
    public static final int MOBILE_PRODUCT_TEST_FIELD_NUMBER = 6;
    public static final int ORIGIN_SURFACE_FIELD_NUMBER = 8;
    public static final int ORIGIN_VERTICAL_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PARTNER_FIELD_NUMBER = 4;
    public static final int REFERRER_FIELD_NUMBER = 3;
    private int bitField0_;
    private StringValue createdByPartner_;
    private StringValue creationFlow_;
    private String creationPoint_ = "";
    private StringValue mobileProductTest_;
    private StringValue originSurface_;
    private StringValue originVertical_;
    private StringValue partner_;
    private StringValue referrer_;

    static {
        Tracking tracking = new Tracking();
        DEFAULT_INSTANCE = tracking;
        AbstractC0269h.registerDefaultInstance(Tracking.class, tracking);
    }

    private Tracking() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21400n(Tracking tracking, StringValue stringValue) {
        tracking.getClass();
        stringValue.getClass();
        tracking.createdByPartner_ = stringValue;
        tracking.bitField0_ |= 8;
    }

    /* JADX INFO: renamed from: o */
    public static void m21401o(Tracking tracking) {
        tracking.getClass();
        tracking.creationPoint_ = "client_mobile";
    }

    /* JADX INFO: renamed from: p */
    public static void m21402p(Tracking tracking, StringValue stringValue) {
        tracking.getClass();
        stringValue.getClass();
        tracking.mobileProductTest_ = stringValue;
        tracking.bitField0_ |= 16;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21403q(Tracking tracking, StringValue stringValue) {
        tracking.getClass();
        stringValue.getClass();
        tracking.referrer_ = stringValue;
        tracking.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static gt81 m21404r() {
        return (gt81) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007ဉ\u0005\bဉ\u0006", new Object[]{"bitField0_", "creationPoint_", "creationFlow_", "referrer_", "partner_", "createdByPartner_", "mobileProductTest_", "originVertical_", "originSurface_"});
        }
        if (iOrdinal == 3) {
            return new Tracking();
        }
        if (iOrdinal == 4) {
            return new gt81(DEFAULT_INSTANCE);
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
        synchronized (Tracking.class) {
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
