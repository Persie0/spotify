package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class CarouselItem extends AbstractC0269h implements sre0 {
    public static final int CLICKTHROUGH_URL_FIELD_NUMBER = 3;
    private static final CarouselItem DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 4;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 6;
    public static final int SALE_PRICE_FIELD_NUMBER = 7;
    public static final int TAGLINE_FIELD_NUMBER = 2;
    public static final int VIDEO_FIELD_NUMBER = 5;
    private Object media_;
    private Object pricing_;
    private int mediaCase_ = 0;
    private int pricingCase_ = 0;
    private String itemId_ = "";
    private String tagline_ = "";
    private String clickthroughUrl_ = "";

    static {
        CarouselItem carouselItem = new CarouselItem();
        DEFAULT_INSTANCE = carouselItem;
        AbstractC0269h.registerDefaultInstance(CarouselItem.class, carouselItem);
    }

    private CarouselItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0002\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004<\u0000\u0005<\u0000\u0006<\u0001\u0007<\u0001", new Object[]{"media_", "mediaCase_", "pricing_", "pricingCase_", "itemId_", "tagline_", "clickthroughUrl_", AdMedia.class, AdMedia.class, ItemPrice.class, ItemSalePrice.class});
        }
        if (iOrdinal == 3) {
            return new CarouselItem();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 21);
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
        synchronized (CarouselItem.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m2613n() {
        return this.clickthroughUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final AdMedia m2614o() {
        return this.mediaCase_ == 4 ? (AdMedia) this.media_ : AdMedia.m2579o();
    }

    /* JADX INFO: renamed from: p */
    public final String m2615p() {
        return this.itemId_;
    }

    /* JADX INFO: renamed from: q */
    public final ItemPrice m2616q() {
        return this.pricingCase_ == 6 ? (ItemPrice) this.pricing_ : ItemPrice.m2662n();
    }

    /* JADX INFO: renamed from: r */
    public final ItemSalePrice m2617r() {
        return this.pricingCase_ == 7 ? (ItemSalePrice) this.pricing_ : ItemSalePrice.m2664n();
    }

    /* JADX INFO: renamed from: s */
    public final String m2618s() {
        return this.tagline_;
    }

    /* JADX INFO: renamed from: t */
    public final AdMedia m2619t() {
        return this.mediaCase_ == 5 ? (AdMedia) this.media_ : AdMedia.m2579o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m2620u() {
        return this.mediaCase_ == 4;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m2621v() {
        return this.pricingCase_ == 6;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2622w() {
        return this.pricingCase_ == 7;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2623x() {
        return this.mediaCase_ == 5;
    }
}
