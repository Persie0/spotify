package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.u0b;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CPGpbCheckoutCompleted extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    public static final int CONTEXT_ID_FIELD_NUMBER = 2;
    private static final CPGpbCheckoutCompleted DEFAULT_INSTANCE;
    public static final int GPB_ORDER_ID_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PRORATION_MODE_FIELD_NUMBER = 4;
    public static final int PURCHASE_STATUS_FIELD_NUMBER = 3;
    private int bitField0_;
    private String context_ = "";
    private String contextId_ = "";
    private String purchaseStatus_ = "";
    private String prorationMode_ = "";
    private String gpbOrderId_ = "";

    static {
        CPGpbCheckoutCompleted cPGpbCheckoutCompleted = new CPGpbCheckoutCompleted();
        DEFAULT_INSTANCE = cPGpbCheckoutCompleted;
        AbstractC0269h.registerDefaultInstance(CPGpbCheckoutCompleted.class, cPGpbCheckoutCompleted);
    }

    private CPGpbCheckoutCompleted() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11191n(CPGpbCheckoutCompleted cPGpbCheckoutCompleted, String str) {
        cPGpbCheckoutCompleted.getClass();
        str.getClass();
        cPGpbCheckoutCompleted.bitField0_ |= 1;
        cPGpbCheckoutCompleted.context_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11192o(CPGpbCheckoutCompleted cPGpbCheckoutCompleted, String str) {
        cPGpbCheckoutCompleted.getClass();
        str.getClass();
        cPGpbCheckoutCompleted.bitField0_ |= 2;
        cPGpbCheckoutCompleted.contextId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m11193p(CPGpbCheckoutCompleted cPGpbCheckoutCompleted, String str) {
        cPGpbCheckoutCompleted.getClass();
        str.getClass();
        cPGpbCheckoutCompleted.bitField0_ |= 16;
        cPGpbCheckoutCompleted.gpbOrderId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11194q(CPGpbCheckoutCompleted cPGpbCheckoutCompleted, String str) {
        cPGpbCheckoutCompleted.getClass();
        cPGpbCheckoutCompleted.bitField0_ |= 8;
        cPGpbCheckoutCompleted.prorationMode_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m11195r(CPGpbCheckoutCompleted cPGpbCheckoutCompleted, String str) {
        cPGpbCheckoutCompleted.getClass();
        str.getClass();
        cPGpbCheckoutCompleted.bitField0_ |= 4;
        cPGpbCheckoutCompleted.purchaseStatus_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static u0b m11196s() {
        return (u0b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "context_", "contextId_", "purchaseStatus_", "prorationMode_", "gpbOrderId_"});
        }
        if (iOrdinal == 3) {
            return new CPGpbCheckoutCompleted();
        }
        if (iOrdinal == 4) {
            return new u0b(DEFAULT_INSTANCE);
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
        synchronized (CPGpbCheckoutCompleted.class) {
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
