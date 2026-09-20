package com.spotify.home.browse.clientnative.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes7.dex */
public final class BrowseAdProto$BrowseAd extends AbstractC0269h implements sre0 {
    public static final int ADVERTISER_FIELD_NUMBER = 1;
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 3;
    public static final int CLICKTHROUGH_URL_FIELD_NUMBER = 4;
    private static final BrowseAdProto$BrowseAd DEFAULT_INSTANCE;
    public static final int IMAGES_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int TAGLINE_FIELD_NUMBER = 2;
    public static final int VIDEOS_FIELD_NUMBER = 5;
    private int bitField0_;
    private String advertiser_ = "";
    private String tagline_ = "";
    private String callToAction_ = "";
    private String clickthroughUrl_ = "";
    private ae50 videos_ = AbstractC0269h.emptyProtobufList();
    private ae50 images_ = AbstractC0269h.emptyProtobufList();

    static {
        BrowseAdProto$BrowseAd browseAdProto$BrowseAd = new BrowseAdProto$BrowseAd();
        DEFAULT_INSTANCE = browseAdProto$BrowseAd;
        AbstractC0269h.registerDefaultInstance(BrowseAdProto$BrowseAd.class, browseAdProto$BrowseAd);
    }

    private BrowseAdProto$BrowseAd() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static BrowseAdProto$BrowseAd m11737q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004Ȉ\u0005\u001b\u0006\u001b", new Object[]{"bitField0_", "advertiser_", "tagline_", "callToAction_", "clickthroughUrl_", "videos_", BrowseAdProto$VideoAsset.class, "images_", BrowseAdProto$ImageAsset.class});
        }
        if (iOrdinal == 3) {
            return new BrowseAdProto$BrowseAd();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 20);
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
        synchronized (BrowseAdProto$BrowseAd.class) {
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
    public final String m11738n() {
        return this.advertiser_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11739o() {
        return this.callToAction_;
    }

    /* JADX INFO: renamed from: p */
    public final String m11740p() {
        return this.clickthroughUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final ae50 m11741r() {
        return this.images_;
    }

    /* JADX INFO: renamed from: s */
    public final String m11742s() {
        return this.tagline_;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m11743t() {
        return this.videos_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
