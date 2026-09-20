package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class BannerWithAnimations extends AbstractC0269h implements sre0 {
    public static final int AD_METADATA_FIELD_NUMBER = 2;
    private static final BannerWithAnimations DEFAULT_INSTANCE;
    public static final int ITEM_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private Item item_;

    static {
        BannerWithAnimations bannerWithAnimations = new BannerWithAnimations();
        DEFAULT_INSTANCE = bannerWithAnimations;
        AbstractC0269h.registerDefaultInstance(BannerWithAnimations.class, bannerWithAnimations);
    }

    private BannerWithAnimations() {
    }

    /* JADX INFO: renamed from: p */
    public static BannerWithAnimations m5589p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "item_", "adMetadata_"});
        }
        if (iOrdinal == 3) {
            return new BannerWithAnimations();
        }
        if (iOrdinal == 4) {
            return new na8(26);
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
        synchronized (BannerWithAnimations.class) {
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
    public final EmbeddedAdMetadata m5590o() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.m5626u() : embeddedAdMetadata;
    }

    /* JADX INFO: renamed from: q */
    public final Item m5591q() {
        Item item = this.item_;
        return item == null ? Item.m5688o() : item;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
