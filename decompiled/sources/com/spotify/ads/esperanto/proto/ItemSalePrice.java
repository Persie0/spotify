package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.dv50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class ItemSalePrice extends AbstractC0269h implements sre0 {
    private static final ItemSalePrice DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 1;
    public static final int SALE_PRICE_FIELD_NUMBER = 2;
    private String price_ = "";
    private String salePrice_ = "";

    static {
        ItemSalePrice itemSalePrice = new ItemSalePrice();
        DEFAULT_INSTANCE = itemSalePrice;
        AbstractC0269h.registerDefaultInstance(ItemSalePrice.class, itemSalePrice);
    }

    private ItemSalePrice() {
    }

    /* JADX INFO: renamed from: n */
    public static ItemSalePrice m2664n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"price_", "salePrice_"});
        }
        if (iOrdinal == 3) {
            return new ItemSalePrice();
        }
        if (iOrdinal == 4) {
            return new dv50(DEFAULT_INSTANCE, 0);
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
        synchronized (ItemSalePrice.class) {
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
    public final String m2665o() {
        return this.price_;
    }

    /* JADX INFO: renamed from: p */
    public final String m2666p() {
        return this.salePrice_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
