package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class CanvasVideo extends AbstractC0269h implements sre0 {
    private static final CanvasVideo DEFAULT_INSTANCE;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 2;
    public static final int HEIGHT_FIELD_NUMBER = 4;
    public static final int MEDIA_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 5;
    public static final int VIDEO_MANIFEST_ID_FIELD_NUMBER = 6;
    public static final int WIDTH_FIELD_NUMBER = 3;
    private int durationSeconds_;
    private int height_;
    private Object mediaFile_;
    private int width_;
    private int mediaFileCase_ = 0;
    private String mediaType_ = "";

    static {
        CanvasVideo canvasVideo = new CanvasVideo();
        DEFAULT_INSTANCE = canvasVideo;
        AbstractC0269h.registerDefaultInstance(CanvasVideo.class, canvasVideo);
    }

    private CanvasVideo() {
    }

    /* JADX INFO: renamed from: n */
    public static CanvasVideo m2603n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u000b\u0003\u000b\u0004\u000b\u0005Ȼ\u0000\u0006Ȼ\u0000", new Object[]{"mediaFile_", "mediaFileCase_", "mediaType_", "durationSeconds_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new CanvasVideo();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 4);
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
        synchronized (CanvasVideo.class) {
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

    public final String getUrl() {
        return this.mediaFileCase_ == 5 ? (String) this.mediaFile_ : "";
    }

    public final boolean hasUrl() {
        return this.mediaFileCase_ == 5;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m2604o() {
        return this.height_;
    }

    /* JADX INFO: renamed from: p */
    public final String m2605p() {
        return this.mediaType_;
    }

    /* JADX INFO: renamed from: q */
    public final String m2606q() {
        return this.mediaFileCase_ == 6 ? (String) this.mediaFile_ : "";
    }

    /* JADX INFO: renamed from: r */
    public final int m2607r() {
        return this.width_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m2608s() {
        return this.mediaFileCase_ == 6;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
