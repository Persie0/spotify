package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class AdMedia extends AbstractC0269h implements sre0 {
    public static final int AUDIO_FILE_ID_FIELD_NUMBER = 7;
    public static final int BITRATE_FIELD_NUMBER = 2;
    private static final AdMedia DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER = 3;
    public static final int HEIGHT_FIELD_NUMBER = 5;
    public static final int IMAGE_FILE_ID_FIELD_NUMBER = 8;
    public static final int MIME_TYPE_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 6;
    public static final int VIDEO_MANIFEST_ID_FIELD_NUMBER = 10;
    public static final int WIDTH_FIELD_NUMBER = 4;
    private int bitrate_;
    private long duration_;
    private int height_;
    private Object mediaFile_;
    private int width_;
    private int mediaFileCase_ = 0;
    private String mimeType_ = "";

    static {
        AdMedia adMedia = new AdMedia();
        DEFAULT_INSTANCE = adMedia;
        AbstractC0269h.registerDefaultInstance(AdMedia.class, adMedia);
    }

    private AdMedia() {
    }

    /* JADX INFO: renamed from: o */
    public static AdMedia m2579o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0003\u0004\u0004\u0005\u0004\u0006Ȼ\u0000\u0007Ȼ\u0000\bȻ\u0000\tȻ\u0000\nȻ\u0000", new Object[]{"mediaFile_", "mediaFileCase_", "mimeType_", "bitrate_", "duration_", "width_", "height_"});
        }
        if (iOrdinal == 3) {
            return new AdMedia();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 28);
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
        synchronized (AdMedia.class) {
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
        return this.mediaFileCase_ == 6 ? (String) this.mediaFile_ : "";
    }

    public final boolean hasUrl() {
        return this.mediaFileCase_ == 6;
    }

    /* JADX INFO: renamed from: n */
    public final int m2580n() {
        return this.bitrate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final long m2581p() {
        return this.duration_;
    }

    /* JADX INFO: renamed from: q */
    public final int m2582q() {
        return this.height_;
    }

    /* JADX INFO: renamed from: r */
    public final String m2583r() {
        return this.mediaFileCase_ == 8 ? (String) this.mediaFile_ : "";
    }

    /* JADX INFO: renamed from: s */
    public final String m2584s() {
        return this.mimeType_;
    }

    /* JADX INFO: renamed from: t */
    public final String m2585t() {
        return this.mediaFileCase_ == 9 ? (String) this.mediaFile_ : "";
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m2586u() {
        return this.mediaFileCase_ == 10 ? (String) this.mediaFile_ : "";
    }

    /* JADX INFO: renamed from: v */
    public final int m2587v() {
        return this.width_;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2588w() {
        return this.mediaFileCase_ == 8;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m2589x() {
        return this.mediaFileCase_ == 10;
    }
}
