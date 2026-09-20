package com.spotify.speechlessupload.proto.p157v1;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.hzb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class VideoMedia extends AbstractC0269h implements sre0 {
    private static final VideoMedia DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int THUMBNAIL_FIELD_NUMBER = 3;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 1;
    public static final int VIDEOS_FIELD_NUMBER = 4;
    public static final int VIDEO_URLS_FIELD_NUMBER = 2;
    private int bitField0_;
    private MediaResource thumbnail_;
    private String thumbnailUrl_ = "";
    private ae50 videoUrls_ = AbstractC0269h.emptyProtobufList();
    private ae50 videos_ = AbstractC0269h.emptyProtobufList();

    static {
        VideoMedia videoMedia = new VideoMedia();
        DEFAULT_INSTANCE = videoMedia;
        AbstractC0269h.registerDefaultInstance(VideoMedia.class, videoMedia);
    }

    private VideoMedia() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21522n(VideoMedia videoMedia, ArrayList arrayList) {
        ae50 ae50Var = videoMedia.videos_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            videoMedia.videos_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, videoMedia.videos_);
    }

    /* JADX INFO: renamed from: o */
    public static void m21523o(VideoMedia videoMedia, MediaResource mediaResource) {
        videoMedia.getClass();
        mediaResource.getClass();
        videoMedia.thumbnail_ = mediaResource;
        videoMedia.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: p */
    public static hzb1 m21524p() {
        return (hzb1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003ဉ\u0000\u0004\u001b", new Object[]{"bitField0_", "thumbnailUrl_", "videoUrls_", "thumbnail_", "videos_", MediaResource.class});
        }
        if (iOrdinal == 3) {
            return new VideoMedia();
        }
        if (iOrdinal == 4) {
            return new hzb1(DEFAULT_INSTANCE);
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
        synchronized (VideoMedia.class) {
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
