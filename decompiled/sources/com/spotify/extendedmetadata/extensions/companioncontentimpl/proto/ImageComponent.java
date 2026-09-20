package com.spotify.extendedmetadata.extensions.companioncontentimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r240;
import p204p.r2n0;
import p204p.sre0;
import p204p.x440;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ImageComponent extends AbstractC0269h implements sre0 {
    public static final int ALT_TEXT_FIELD_NUMBER = 2;
    public static final int CAPTION_FIELD_NUMBER = 3;
    public static final int COLOR_EXTRACTION_FIELD_NUMBER = 5;
    private static final ImageComponent DEFAULT_INSTANCE;
    public static final int EXTERNAL_URL_FIELD_NUMBER = 6;
    public static final int IMAGE_URL_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VIEW_MODE_FIELD_NUMBER = 4;
    private int bitField0_;
    private ColorExtraction colorExtraction_;
    private int viewMode_;
    private String imageUrl_ = "";
    private String altText_ = "";
    private String caption_ = "";
    private String externalUrl_ = "";

    static {
        ImageComponent imageComponent = new ImageComponent();
        DEFAULT_INSTANCE = imageComponent;
        AbstractC0269h.registerDefaultInstance(ImageComponent.class, imageComponent);
    }

    private ImageComponent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ImageComponent m9956q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004\f\u0005ဉ\u0001\u0006ለ\u0002", new Object[]{"bitField0_", "imageUrl_", "altText_", "caption_", "viewMode_", "colorExtraction_", "externalUrl_"});
        }
        if (iOrdinal == 3) {
            return new ImageComponent();
        }
        if (iOrdinal == 4) {
            return new r240(DEFAULT_INSTANCE, 17);
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
        synchronized (ImageComponent.class) {
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
    public final String m9957n() {
        return this.altText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m9958o() {
        return this.caption_;
    }

    /* JADX INFO: renamed from: p */
    public final ColorExtraction m9959p() {
        ColorExtraction colorExtraction = this.colorExtraction_;
        return colorExtraction == null ? ColorExtraction.m9928q() : colorExtraction;
    }

    /* JADX INFO: renamed from: r */
    public final String m9960r() {
        return this.externalUrl_;
    }

    /* JADX INFO: renamed from: s */
    public final x440 m9961s() {
        x440 x440Var;
        int i = this.viewMode_;
        if (i == 0) {
            x440Var = x440.UNSPECIFIED;
        } else if (i != 1) {
            x440Var = i != 2 ? null : x440.FULL_SCREEN;
        } else {
            x440Var = x440.ARTWORK;
        }
        return x440Var == null ? x440.UNRECOGNIZED : x440Var;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9962t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m9963u() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m9964v() {
        return (this.bitField0_ & 4) != 0;
    }
}
