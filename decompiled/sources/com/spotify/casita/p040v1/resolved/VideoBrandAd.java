package com.spotify.casita.p040v1.resolved;

import com.google.protobuf.AbstractC0269h;
import com.spotify.ads.brandads.p013v1.EmbeddedAdProto$EmbeddedAd;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class VideoBrandAd extends AbstractC0269h implements sre0 {
    public static final int AD_FIELD_NUMBER = 1;
    public static final int AD_METADATA_FIELD_NUMBER = 2;
    private static final VideoBrandAd DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private EmbeddedAdMetadata adMetadata_;
    private EmbeddedAdProto$EmbeddedAd ad_;
    private int bitField0_;

    static {
        VideoBrandAd videoBrandAd = new VideoBrandAd();
        DEFAULT_INSTANCE = videoBrandAd;
        AbstractC0269h.registerDefaultInstance(VideoBrandAd.class, videoBrandAd);
    }

    private VideoBrandAd() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static VideoBrandAd m5866q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "ad_", "adMetadata_"});
        }
        if (iOrdinal == 3) {
            return new VideoBrandAd();
        }
        if (iOrdinal == 4) {
            return new chb1(5);
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
        synchronized (VideoBrandAd.class) {
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
    public final EmbeddedAdProto$EmbeddedAd m5867o() {
        EmbeddedAdProto$EmbeddedAd embeddedAdProto$EmbeddedAd = this.ad_;
        return embeddedAdProto$EmbeddedAd == null ? EmbeddedAdProto$EmbeddedAd.m2550q() : embeddedAdProto$EmbeddedAd;
    }

    /* JADX INFO: renamed from: p */
    public final EmbeddedAdMetadata m5868p() {
        EmbeddedAdMetadata embeddedAdMetadata = this.adMetadata_;
        return embeddedAdMetadata == null ? EmbeddedAdMetadata.m5626u() : embeddedAdMetadata;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
