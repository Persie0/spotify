package com.spotify.corex.readalongtranscript.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r240;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageSection extends AbstractC0269h implements sre0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    public static final int ASPECT_RATIO_FIELD_NUMBER = 5;
    public static final int CAPTION_FIELD_NUMBER = 3;
    private static final ImageSection DEFAULT_INSTANCE;
    public static final int EXTERNAL_URL_FIELD_NUMBER = 6;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    public static final int LICENSE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER;
    private double aspectRatio_;
    private int bitField0_;
    private String imageUrl_ = "";
    private String altText_ = "";
    private String caption_ = "";
    private String license_ = "";
    private String externalUrl_ = "";

    static {
        ImageSection imageSection = new ImageSection();
        DEFAULT_INSTANCE = imageSection;
        AbstractC0269h.registerDefaultInstance(ImageSection.class, imageSection);
    }

    private ImageSection() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ImageSection m8076q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ለ\u0001\u0005က\u0002\u0006ለ\u0003", new Object[]{"bitField0_", "imageUrl_", "altText_", "caption_", "license_", "aspectRatio_", "externalUrl_"});
        }
        if (iOrdinal == 3) {
            return new ImageSection();
        }
        if (iOrdinal == 4) {
            return new r240(DEFAULT_INSTANCE, 29);
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
        synchronized (ImageSection.class) {
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
    public final String m8077n() {
        return this.altText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final double m8078o() {
        return this.aspectRatio_;
    }

    /* JADX INFO: renamed from: p */
    public final String m8079p() {
        return this.caption_;
    }

    /* JADX INFO: renamed from: r */
    public final String m8080r() {
        return this.externalUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final String m8081s() {
        return this.license_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m8082t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m8083u() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m8084v() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m8085w() {
        return (this.bitField0_ & 2) != 0;
    }
}
