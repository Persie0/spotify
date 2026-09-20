package com.spotify.audiobookpartnersales.p027v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class ProductOption extends AbstractC0269h implements sre0 {
    public static final int BOOKSHOP_FIELD_NUMBER = 6;
    public static final int COVER_IMAGE_URL_FIELD_NUMBER = 4;
    public static final int CURRENCY_FIELD_NUMBER = 9;
    private static final ProductOption DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 8;
    public static final int PRIORITY_FIELD_NUMBER = 7;
    public static final int PRODUCT_URL_FIELD_NUMBER = 3;
    public static final int SOURCE_NAME_FIELD_NUMBER = 5;
    private int bitField0_;
    private double price_;
    private int priority_;
    private Object vendorDetails_;
    private int vendorDetailsCase_ = 0;
    private String format_ = "";
    private String currency_ = "";
    private String productUrl_ = "";
    private String coverImageUrl_ = "";
    private String sourceName_ = "";

    static {
        ProductOption productOption = new ProductOption();
        DEFAULT_INSTANCE = productOption;
        AbstractC0269h.registerDefaultInstance(ProductOption.class, productOption);
    }

    private ProductOption() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0001\u0001\t\b\u0000\u0000\u0000\u0001ለ\u0000\u0003ለ\u0003\u0004ለ\u0004\u0005ለ\u0005\u0006<\u0000\u0007င\u0006\bက\u0001\tለ\u0002", new Object[]{"vendorDetails_", "vendorDetailsCase_", "bitField0_", "format_", "productUrl_", "coverImageUrl_", "sourceName_", BookshopDetails.class, "priority_", "price_", "currency_"});
        }
        if (iOrdinal == 3) {
            return new ProductOption();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 14);
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
        synchronized (ProductOption.class) {
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

    public final String getFormat() {
        return this.format_;
    }

    /* JADX INFO: renamed from: n */
    public final BookshopDetails m3426n() {
        return this.vendorDetailsCase_ == 6 ? (BookshopDetails) this.vendorDetails_ : BookshopDetails.m3424o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3427o() {
        return this.coverImageUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final String m3428p() {
        return this.currency_;
    }

    /* JADX INFO: renamed from: q */
    public final double m3429q() {
        return this.price_;
    }

    /* JADX INFO: renamed from: r */
    public final int m3430r() {
        return this.priority_;
    }

    /* JADX INFO: renamed from: s */
    public final String m3431s() {
        return this.productUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final String m3432t() {
        return this.sourceName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m3433u() {
        return this.vendorDetailsCase_ == 6;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m3434v() {
        return (this.bitField0_ & 64) != 0;
    }
}
