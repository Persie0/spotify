package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import com.spotify.showcase.p148v1.CreativeAdMetadataProto$CreativeAdMetadata;
import com.spotify.showcase.p149v2.CreativeAdMetadata;
import p204p.ore0;
import p204p.pre0;
import p204p.qr11;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Showcase extends AbstractC0269h implements sre0 {
    public static final int AD_METADATA_FIELD_NUMBER = 3;
    public static final int CREATIVE_AD_METADATA_FIELD_NUMBER = 4;
    public static final int CREATIVE_AD_METADATA_V2_FIELD_NUMBER = 5;
    private static final Showcase DEFAULT_INSTANCE;
    public static final int HEADING_FIELD_NUMBER = 1;
    public static final int ITEM_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private CreativeAdMetadata creativeAdMetadataV2_;
    private CreativeAdMetadataProto$CreativeAdMetadata creativeAdMetadata_;
    private Heading heading_;
    private Item item_;

    static {
        Showcase showcase = new Showcase();
        DEFAULT_INSTANCE = showcase;
        AbstractC0269h.registerDefaultInstance(Showcase.class, showcase);
    }

    private Showcase() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static Showcase m5835q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "heading_", "item_", "adMetadata_", "creativeAdMetadata_", "creativeAdMetadataV2_"});
        }
        if (iOrdinal == 3) {
            return new Showcase();
        }
        if (iOrdinal == 4) {
            return new qr11(11);
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
        synchronized (Showcase.class) {
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
    public final EmbeddedAdMetadata m5836o() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.m5626u() : embeddedAdMetadata;
    }

    /* JADX INFO: renamed from: p */
    public final CreativeAdMetadata m5837p() {
        CreativeAdMetadata creativeAdMetadata = this.creativeAdMetadataV2_;
        return creativeAdMetadata == null ? CreativeAdMetadata.m21293p() : creativeAdMetadata;
    }

    /* JADX INFO: renamed from: r */
    public final Heading m5838r() {
        Heading heading = this.heading_;
        return heading == null ? Heading.m5646o() : heading;
    }

    /* JADX INFO: renamed from: s */
    public final Item m5839s() {
        Item item = this.item_;
        return item == null ? Item.m5688o() : item;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5840t() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
