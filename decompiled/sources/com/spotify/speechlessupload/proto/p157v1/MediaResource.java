package com.spotify.speechlessupload.proto.p157v1;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Duration;
import p204p.bga1;
import p204p.fld0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class MediaResource extends AbstractC0269h implements sre0 {
    private static final MediaResource DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 4;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int UPLOAD_SOURCE_FIELD_NUMBER = 5;
    public static final int URL_FIELD_NUMBER = 1;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private int bitField0_;
    private Duration duration_;
    private int height_;
    private int uploadSource_;
    private String url_ = "";
    private int width_;

    static {
        MediaResource mediaResource = new MediaResource();
        DEFAULT_INSTANCE = mediaResource;
        AbstractC0269h.registerDefaultInstance(MediaResource.class, mediaResource);
    }

    private MediaResource() {
    }

    /* JADX INFO: renamed from: n */
    public static void m21513n(MediaResource mediaResource, Duration duration) {
        mediaResource.getClass();
        duration.getClass();
        mediaResource.duration_ = duration;
        mediaResource.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m21514o(MediaResource mediaResource, int i) {
        mediaResource.height_ = i;
    }

    /* JADX INFO: renamed from: p */
    public static void m21515p(MediaResource mediaResource, bga1 bga1Var) {
        mediaResource.getClass();
        mediaResource.uploadSource_ = bga1Var.getNumber();
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m21516q(MediaResource mediaResource, String str) {
        mediaResource.getClass();
        str.getClass();
        mediaResource.url_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m21517r(MediaResource mediaResource, int i) {
        mediaResource.width_ = i;
    }

    /* JADX INFO: renamed from: s */
    public static fld0 m21518s() {
        return (fld0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004ဉ\u0000\u0005\f", new Object[]{"bitField0_", "url_", "width_", "height_", "duration_", "uploadSource_"});
        }
        if (iOrdinal == 3) {
            return new MediaResource();
        }
        if (iOrdinal == 4) {
            return new fld0(DEFAULT_INSTANCE);
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
        synchronized (MediaResource.class) {
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
