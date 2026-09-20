package com.spotify.speechlessupload.proto.p157v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vdd0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class MediaFile extends AbstractC0269h implements sre0 {
    private static final MediaFile DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private int mediaTypeCase_ = 0;
    private Object mediaType_;

    static {
        MediaFile mediaFile = new MediaFile();
        DEFAULT_INSTANCE = mediaFile;
        AbstractC0269h.registerDefaultInstance(MediaFile.class, mediaFile);
    }

    private MediaFile() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21510n(MediaFile mediaFile, ImageMedia imageMedia) {
        mediaFile.getClass();
        imageMedia.getClass();
        mediaFile.mediaType_ = imageMedia;
        mediaFile.mediaTypeCase_ = 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m21511o(MediaFile mediaFile, VideoMedia videoMedia) {
        mediaFile.getClass();
        videoMedia.getClass();
        mediaFile.mediaType_ = videoMedia;
        mediaFile.mediaTypeCase_ = 2;
    }

    /* JADX INFO: renamed from: p */
    public static vdd0 m21512p() {
        return (vdd0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"mediaType_", "mediaTypeCase_", ImageMedia.class, VideoMedia.class});
        }
        if (iOrdinal == 3) {
            return new MediaFile();
        }
        if (iOrdinal == 4) {
            return new vdd0(DEFAULT_INSTANCE);
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
        synchronized (MediaFile.class) {
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
