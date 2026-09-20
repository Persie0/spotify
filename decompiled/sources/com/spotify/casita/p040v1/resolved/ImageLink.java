package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r240;
import p204p.r2n0;
import p204p.sre0;
import p204p.w640;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class ImageLink extends AbstractC0269h implements sre0 {
    public static final int AD_METADATA_FIELD_NUMBER = 4;
    private static final ImageLink DEFAULT_INSTANCE;
    public static final int DENSITY_FIELD_NUMBER = 3;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_SOURCE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCE_FIELD_NUMBER = 5;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private int density_;
    private Heading heading_;
    private ItemSource itemSource_;
    private int source_;

    static {
        ImageLink imageLink = new ImageLink();
        DEFAULT_INSTANCE = imageLink;
        AbstractC0269h.registerDefaultInstance(ImageLink.class, imageLink);
    }

    private ImageLink() {
    }

    /* JADX INFO: renamed from: p */
    public static ImageLink m5673p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f\u0004ဉ\u0002\u0005\f", new Object[]{"bitField0_", "heading_", "itemSource_", "density_", "adMetadata_", "source_"});
        }
        if (iOrdinal == 3) {
            return new ImageLink();
        }
        if (iOrdinal == 4) {
            return new r240(25);
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
        synchronized (ImageLink.class) {
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
    public final EmbeddedAdMetadata m5674o() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.m5626u() : embeddedAdMetadata;
    }

    /* JADX INFO: renamed from: q */
    public final Heading m5675q() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m5646o() : heading;
    }

    /* JADX INFO: renamed from: r */
    public final ItemSource m5676r() {
        ItemSource itemSource = this.itemSource_;
        return itemSource == null ? ItemSource.m5692o() : itemSource;
    }

    /* JADX INFO: renamed from: s */
    public final w640 m5677s() {
        w640 w640Var;
        int i = this.source_;
        if (i != 0) {
            w640Var = i != 1 ? null : w640.PROMO;
        } else {
            w640Var = w640.DEFAULT;
        }
        return w640Var == null ? w640.UNRECOGNIZED : w640Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
