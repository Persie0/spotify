package com.spotify.ads.brandads.p013v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.omr;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class EmbeddedAdProto$EmbeddedAd extends AbstractC0269h implements sre0 {
    public static final int ADVERTISER_FIELD_NUMBER = 1;
    public static final int AD_METADATA_FIELD_NUMBER = 6;
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 2;
    public static final int CLICKTHROUGH_URL_FIELD_NUMBER = 3;
    private static final EmbeddedAdProto$EmbeddedAd DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 5;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int TAGLINE_FIELD_NUMBER = 7;
    public static final int VIDEOS_FIELD_NUMBER = 4;
    private EmbeddedAdProto$EmbeddedAdMetadata adMetadata_;
    private int bitField0_;
    private String advertiser_ = "";
    private String callToAction_ = "";
    private String clickthroughUrl_ = "";
    private ae50 videos_ = AbstractC0269h.emptyProtobufList();
    private ae50 images_ = AbstractC0269h.emptyProtobufList();
    private String tagline_ = "";
    private String logoImageUrl_ = "";

    static {
        EmbeddedAdProto$EmbeddedAd embeddedAdProto$EmbeddedAd = new EmbeddedAdProto$EmbeddedAd();
        DEFAULT_INSTANCE = embeddedAdProto$EmbeddedAd;
        AbstractC0269h.registerDefaultInstance(EmbeddedAdProto$EmbeddedAd.class, embeddedAdProto$EmbeddedAd);
    }

    private EmbeddedAdProto$EmbeddedAd() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static EmbeddedAdProto$EmbeddedAd m2550q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001Ȉ\u0002ለ\u0000\u0003Ȉ\u0004\u001b\u0005\u001b\u0006ဉ\u0001\u0007Ȉ\bȈ", new Object[]{"bitField0_", "advertiser_", "callToAction_", "clickthroughUrl_", "videos_", EmbeddedAdProto$VideoAsset.class, "images_", EmbeddedAdProto$ImageAsset.class, "adMetadata_", "tagline_", "logoImageUrl_"});
        }
        if (iOrdinal == 3) {
            return new EmbeddedAdProto$EmbeddedAd();
        }
        if (iOrdinal == 4) {
            return new omr(DEFAULT_INSTANCE, 24);
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
        synchronized (EmbeddedAdProto$EmbeddedAd.class) {
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
    public final String m2551n() {
        return this.advertiser_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m2552o() {
        return this.callToAction_;
    }

    /* JADX INFO: renamed from: p */
    public final String m2553p() {
        return this.clickthroughUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m2554r() {
        return this.images_;
    }

    /* JADX INFO: renamed from: s */
    public final String m2555s() {
        return this.logoImageUrl_;
    }

    /* JADX INFO: renamed from: t */
    public final String m2556t() {
        return this.tagline_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ae50 m2557u() {
        return this.videos_;
    }
}
