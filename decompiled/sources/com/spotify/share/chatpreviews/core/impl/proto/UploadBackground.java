package com.spotify.share.chatpreviews.core.impl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class UploadBackground extends AbstractC0269h implements sre0 {
    public static final int ASPECT_RATIO_FIELD_NUMBER = 4;
    public static final int COLOR_FIELD_NUMBER = 1;
    private static final UploadBackground DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private Object format_;
    private int formatCase_ = 0;
    private String aspectRatio_ = "";

    static {
        UploadBackground uploadBackground = new UploadBackground();
        DEFAULT_INSTANCE = uploadBackground;
        AbstractC0269h.registerDefaultInstance(UploadBackground.class, uploadBackground);
    }

    private UploadBackground() {
    }

    /* JADX INFO: renamed from: n */
    public static void m20982n(UploadBackground uploadBackground, String str) {
        uploadBackground.getClass();
        str.getClass();
        uploadBackground.aspectRatio_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m20983o(UploadBackground uploadBackground, Color color) {
        uploadBackground.getClass();
        uploadBackground.format_ = color;
        uploadBackground.formatCase_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m20984p(UploadBackground uploadBackground, UploadImage uploadImage) {
        uploadBackground.getClass();
        uploadImage.getClass();
        uploadBackground.format_ = uploadImage;
        uploadBackground.formatCase_ = 3;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m20985q(UploadBackground uploadBackground, Video video) {
        uploadBackground.getClass();
        video.getClass();
        uploadBackground.format_ = video;
        uploadBackground.formatCase_ = 2;
    }

    /* JADX INFO: renamed from: r */
    public static hea1 m20986r() {
        return (hea1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"format_", "formatCase_", Color.class, Video.class, UploadImage.class, "aspectRatio_"});
        }
        if (iOrdinal == 3) {
            return new UploadBackground();
        }
        if (iOrdinal == 4) {
            return new hea1(DEFAULT_INSTANCE);
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
        synchronized (UploadBackground.class) {
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
