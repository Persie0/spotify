package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class PreviewPromotionCarousel extends AbstractC0269h implements sre0 {
    public static final int AD_METADATA_FIELD_NUMBER = 4;
    private static final PreviewPromotionCarousel DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEMS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROMOTION_URI_FIELD_NUMBER = 2;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private Heading heading_;
    private String promotionUri_ = "";
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        PreviewPromotionCarousel previewPromotionCarousel = new PreviewPromotionCarousel();
        DEFAULT_INSTANCE = previewPromotionCarousel;
        AbstractC0269h.registerDefaultInstance(PreviewPromotionCarousel.class, previewPromotionCarousel);
    }

    private PreviewPromotionCarousel() {
    }

    /* JADX INFO: renamed from: o */
    public static PreviewPromotionCarousel m4094o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002Ȉ\u0003\u001b\u0004ဉ\u0001", new Object[]{"bitField0_", "heading_", "promotionUri_", "items_", PreviewPromotionCarouselItem.class, "adMetadata_"});
        }
        if (iOrdinal == 3) {
            return new PreviewPromotionCarousel();
        }
        if (iOrdinal == 4) {
            return new t3r0(DEFAULT_INSTANCE, 6);
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
        synchronized (PreviewPromotionCarousel.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    /* JADX INFO: renamed from: n */
    public final EmbeddedAdMetadata m4095n() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.m4071o() : embeddedAdMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final Heading m4096p() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m4080n() : heading;
    }

    /* JADX INFO: renamed from: q */
    public final String m4097q() {
        return this.promotionUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
