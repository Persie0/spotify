package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class VideoPreview extends AbstractC0269h implements sre0 {
    private static final VideoPreview DEFAULT_INSTANCE;
    public static final int MEDIA_FIELD_NUMBER = 1;
    public static final int OFFSETS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private Video media_;
    private PreviewOffsets offsets_;

    static {
        VideoPreview videoPreview = new VideoPreview();
        DEFAULT_INSTANCE = videoPreview;
        AbstractC0269h.registerDefaultInstance(VideoPreview.class, videoPreview);
    }

    private VideoPreview() {
    }

    /* JADX INFO: renamed from: n */
    public static VideoPreview m7973n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "media_", "offsets_"});
        }
        if (iOrdinal == 3) {
            return new VideoPreview();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 23);
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
        synchronized (VideoPreview.class) {
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
    public final Video m7974o() {
        Video video = this.media_;
        return video == null ? Video.m7955p() : video;
    }

    /* JADX INFO: renamed from: p */
    public final PreviewOffsets m7975p() {
        PreviewOffsets previewOffsets = this.offsets_;
        return previewOffsets == null ? PreviewOffsets.m7907n() : previewOffsets;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
