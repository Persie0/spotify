package com.spotify.watchfeed.component.model.p187v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.bh01;
import p204p.dbd0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class MediaItem extends AbstractC0269h implements sre0 {
    private static final MediaItem DEFAULT_INSTANCE;
    public static final int IMAGE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SHAPE_FIELD_NUMBER = 3;
    public static final int VIDEO_FILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private Image image_;
    private int shape_;
    private VideoFile videoFile_;

    static {
        MediaItem mediaItem = new MediaItem();
        DEFAULT_INSTANCE = mediaItem;
        AbstractC0269h.registerDefaultInstance(MediaItem.class, mediaItem);
    }

    private MediaItem() {
    }

    /* JADX INFO: renamed from: n */
    public static MediaItem m22902n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"bitField0_", "image_", "videoFile_", "shape_"});
        }
        if (iOrdinal == 3) {
            return new MediaItem();
        }
        if (iOrdinal == 4) {
            return new dbd0(DEFAULT_INSTANCE, 1);
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
        synchronized (MediaItem.class) {
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
    public final Image m22903o() {
        Image image = this.image_;
        return image == null ? Image.m22897n() : image;
    }

    /* JADX INFO: renamed from: p */
    public final bh01 m22904p() {
        bh01 bh01Var;
        int i = this.shape_;
        if (i == 0) {
            bh01Var = bh01.ROUND;
        } else if (i == 1) {
            bh01Var = bh01.SQUARE;
        } else if (i != 2) {
            bh01Var = i != 3 ? null : bh01.SIXTEEN_TO_NINE;
        } else {
            bh01Var = bh01.NINE_TO_SIXTEEN;
        }
        return bh01Var == null ? bh01.UNRECOGNIZED : bh01Var;
    }

    /* JADX INFO: renamed from: q */
    public final VideoFile m22905q() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.m22923n() : videoFile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
