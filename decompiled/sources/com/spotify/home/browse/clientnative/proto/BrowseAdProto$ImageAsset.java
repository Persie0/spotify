package com.spotify.home.browse.clientnative.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z79;

/* JADX INFO: loaded from: classes7.dex */
public final class BrowseAdProto$ImageAsset extends AbstractC0269h implements sre0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 1;
    private static final BrowseAdProto$ImageAsset DEFAULT_INSTANCE;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private int height_;
    private int width_;
    private String aspectRatio_ = "";
    private String imageUrl_ = "";
    private String logoImageUrl_ = "";

    static {
        BrowseAdProto$ImageAsset browseAdProto$ImageAsset = new BrowseAdProto$ImageAsset();
        DEFAULT_INSTANCE = browseAdProto$ImageAsset;
        AbstractC0269h.registerDefaultInstance(BrowseAdProto$ImageAsset.class, browseAdProto$ImageAsset);
    }

    private BrowseAdProto$ImageAsset() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002Ȉ\u0003ለ\u0001\u0004\u0004\u0005\u0004", new Object[]{"bitField0_", "aspectRatio_", "imageUrl_", "logoImageUrl_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new BrowseAdProto$ImageAsset();
        }
        if (iOrdinal == 4) {
            return new z79(DEFAULT_INSTANCE, 21);
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
        synchronized (BrowseAdProto$ImageAsset.class) {
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

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    /* JADX INFO: renamed from: n */
    public final int m11744n() {
        return this.height_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11745o() {
        return this.logoImageUrl_;
    }

    /* JADX INFO: renamed from: p */
    public final int m11746p() {
        return this.width_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
