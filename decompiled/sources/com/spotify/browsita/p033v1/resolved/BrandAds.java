package com.spotify.browsita.p033v1.resolved;

import com.google.protobuf.AbstractC0269h;
import com.spotify.home.browse.clientnative.proto.BrowseAdProto$BrowseAd;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes5.dex */
public final class BrandAds extends AbstractC0269h implements sre0 {
    public static final int AD_FIELD_NUMBER = 1;
    public static final int AD_METADATA_FIELD_NUMBER = 2;
    private static final BrandAds DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private BrowseAdProto$BrowseAd ad_;
    private int bitField0_;

    static {
        BrandAds brandAds = new BrandAds();
        DEFAULT_INSTANCE = brandAds;
        AbstractC0269h.registerDefaultInstance(BrandAds.class, brandAds);
    }

    private BrandAds() {
    }

    /* JADX INFO: renamed from: p */
    public static BrandAds m4063p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "ad_", "adMetadata_"});
        }
        if (iOrdinal == 3) {
            return new BrandAds();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 18);
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
        synchronized (BrandAds.class) {
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
    public final BrowseAdProto$BrowseAd m4064n() {
        BrowseAdProto$BrowseAd browseAdProto$BrowseAd = this.ad_;
        return browseAdProto$BrowseAd == null ? BrowseAdProto$BrowseAd.m11737q() : browseAdProto$BrowseAd;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EmbeddedAdMetadata m4065o() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.m4071o() : embeddedAdMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
