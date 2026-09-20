package com.spotify.checkout.proto.model.p044v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.qzd;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutItemUnavailable extends AbstractC0269h implements sre0 {
    public static final int CTA_LABEL_FIELD_NUMBER = 3;
    private static final CheckoutItemUnavailable DEFAULT_INSTANCE;
    public static final int LINE_ITEM_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private LineItem lineItem_;
    private String title_ = "";
    private String ctaLabel_ = "";

    static {
        CheckoutItemUnavailable checkoutItemUnavailable = new CheckoutItemUnavailable();
        DEFAULT_INSTANCE = checkoutItemUnavailable;
        AbstractC0269h.registerDefaultInstance(CheckoutItemUnavailable.class, checkoutItemUnavailable);
    }

    private CheckoutItemUnavailable() {
    }

    /* JADX INFO: renamed from: n */
    public static void m5983n(CheckoutItemUnavailable checkoutItemUnavailable) {
        checkoutItemUnavailable.getClass();
        checkoutItemUnavailable.ctaLabel_ = "Go back";
    }

    /* JADX INFO: renamed from: o */
    public static void m5984o(CheckoutItemUnavailable checkoutItemUnavailable, LineItem lineItem) {
        checkoutItemUnavailable.getClass();
        lineItem.getClass();
        checkoutItemUnavailable.lineItem_ = lineItem;
        checkoutItemUnavailable.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m5985p(CheckoutItemUnavailable checkoutItemUnavailable) {
        checkoutItemUnavailable.getClass();
        checkoutItemUnavailable.title_ = "Item not available title";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static CheckoutItemUnavailable m5986r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static qzd m5987t() {
        return (qzd) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: u */
    public static CheckoutItemUnavailable m5988u(byte[] bArr) {
        return (CheckoutItemUnavailable) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"bitField0_", "title_", "lineItem_", "ctaLabel_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutItemUnavailable();
        }
        if (iOrdinal == 4) {
            return new qzd(DEFAULT_INSTANCE);
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
        synchronized (CheckoutItemUnavailable.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final String m5989q() {
        return this.ctaLabel_;
    }

    /* JADX INFO: renamed from: s */
    public final LineItem m5990s() {
        LineItem lineItem = this.lineItem_;
        return lineItem == null ? LineItem.m6226p() : lineItem;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
