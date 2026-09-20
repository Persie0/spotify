package com.spotify.adsinternal.p015v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.x6c;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class CarouselItem extends AbstractC0269h implements sre0 {
    private static final CarouselItem DEFAULT_INSTANCE;
    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int RENDER_POSITION_FIELD_NUMBER = 2;
    private String itemId_ = "";
    private int renderPosition_;

    static {
        CarouselItem carouselItem = new CarouselItem();
        DEFAULT_INSTANCE = carouselItem;
        AbstractC0269h.registerDefaultInstance(CarouselItem.class, carouselItem);
    }

    private CarouselItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2844n(CarouselItem carouselItem, String str) {
        carouselItem.getClass();
        str.getClass();
        carouselItem.itemId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m2845o(CarouselItem carouselItem, int i) {
        carouselItem.renderPosition_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static x6c m2846p() {
        return (x6c) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"itemId_", "renderPosition_"});
        }
        if (iOrdinal == 3) {
            return new CarouselItem();
        }
        if (iOrdinal == 4) {
            return new x6c(DEFAULT_INSTANCE);
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
