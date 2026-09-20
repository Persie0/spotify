package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class PreviewPromotionCarouselItem extends AbstractC0269h implements sre0 {
    private static final PreviewPromotionCarouselItem DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_PROMO_FIELD_NUMBER = 1;
    private int contentCase_ = 0;
    private Object content_;

    static {
        PreviewPromotionCarouselItem previewPromotionCarouselItem = new PreviewPromotionCarouselItem();
        DEFAULT_INSTANCE = previewPromotionCarouselItem;
        AbstractC0269h.registerDefaultInstance(PreviewPromotionCarouselItem.class, previewPromotionCarouselItem);
    }

    private PreviewPromotionCarouselItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"content_", "contentCase_", VideoPromo.class});
        }
        if (iOrdinal == 3) {
            return new PreviewPromotionCarouselItem();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 8);
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
        synchronized (PreviewPromotionCarouselItem.class) {
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
    public final int m4098n() {
        int i = this.contentCase_;
        if (i != 0) {
            return i != 1 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final VideoPromo m4099o() {
        return this.contentCase_ == 1 ? (VideoPromo) this.content_ : VideoPromo.m4142o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
