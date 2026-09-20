package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckoutOnWebOverlayExplanation extends AbstractC0269h implements sre0 {
    public static final int CTA_FIELD_NUMBER = 1;
    private static final CheckoutOnWebOverlayExplanation DEFAULT_INSTANCE;
    public static final int IS_PRICE_DISPLAYED_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 5;
    public static final int SNACKBAR_ERROR_FIELD_NUMBER = 3;
    public static final int SNACKBAR_FULFILMENT_COMPLETE_FIELD_NUMBER = 4;
    public static final int SNACKBAR_SUCCESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isPriceDisplayed_;
    private AudiobookPriceOuterClass$AudiobookPrice price_;
    private String cta_ = "";
    private String snackbarSuccess_ = "";
    private String snackbarError_ = "";
    private String snackbarFulfilmentComplete_ = "";

    static {
        CheckoutOnWebOverlayExplanation checkoutOnWebOverlayExplanation = new CheckoutOnWebOverlayExplanation();
        DEFAULT_INSTANCE = checkoutOnWebOverlayExplanation;
        AbstractC0269h.registerDefaultInstance(CheckoutOnWebOverlayExplanation.class, checkoutOnWebOverlayExplanation);
    }

    private CheckoutOnWebOverlayExplanation() {
    }

    /* JADX INFO: renamed from: p */
    public static CheckoutOnWebOverlayExplanation m10391p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005ဉ\u0000\u0006\u0007", new Object[]{"bitField0_", "cta_", "snackbarSuccess_", "snackbarError_", "snackbarFulfilmentComplete_", "price_", "isPriceDisplayed_"});
        }
        if (iOrdinal == 3) {
            return new CheckoutOnWebOverlayExplanation();
        }
        if (iOrdinal == 4) {
            return new ioc(16);
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
        synchronized (CheckoutOnWebOverlayExplanation.class) {
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

    /* JADX INFO: renamed from: o */
    public final String m10392o() {
        return this.cta_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m10393q() {
        return this.isPriceDisplayed_;
    }

    /* JADX INFO: renamed from: r */
    public final AudiobookPriceOuterClass$AudiobookPrice m10394r() {
        AudiobookPriceOuterClass$AudiobookPrice audiobookPriceOuterClass$AudiobookPrice = this.price_;
        return audiobookPriceOuterClass$AudiobookPrice == null ? AudiobookPriceOuterClass$AudiobookPrice.m10379o() : audiobookPriceOuterClass$AudiobookPrice;
    }

    /* JADX INFO: renamed from: s */
    public final String m10395s() {
        return this.snackbarError_;
    }

    /* JADX INFO: renamed from: t */
    public final String m10396t() {
        return this.snackbarFulfilmentComplete_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m10397u() {
        return this.snackbarSuccess_;
    }
}
