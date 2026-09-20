package com.spotify.sharecard.config.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.l501;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SetImage extends AbstractC0269h implements sre0 {
    private static final SetImage DEFAULT_INSTANCE;
    public static final int IMAGE_UPLOAD_FIELD_NUMBER = 1;
    public static final int IMAGE_URL_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int imageCase_ = 0;
    private Object image_;

    static {
        SetImage setImage = new SetImage();
        DEFAULT_INSTANCE = setImage;
        AbstractC0269h.registerDefaultInstance(SetImage.class, setImage);
    }

    private SetImage() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21179n(SetImage setImage, ImageBytes imageBytes) {
        setImage.getClass();
        imageBytes.getClass();
        setImage.image_ = imageBytes;
        setImage.imageCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m21180o(SetImage setImage, Image image) {
        setImage.getClass();
        image.getClass();
        setImage.image_ = image;
        setImage.imageCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static l501 m21181p() {
        return (l501) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"image_", "imageCase_", ImageBytes.class, Image.class});
        }
        if (iOrdinal == 3) {
            return new SetImage();
        }
        if (iOrdinal == 4) {
            return new l501(DEFAULT_INSTANCE);
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
        synchronized (SetImage.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
