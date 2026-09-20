package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xl81;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class VideoAsset extends AbstractC0269h implements sre0 {
    private static final VideoAsset DEFAULT_INSTANCE;
    public static final int FLAT_FILE_FIELD_NUMBER = 1;
    public static final int HLS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int videoTypeCase_ = 0;
    private Object videoType_;

    static {
        VideoAsset videoAsset = new VideoAsset();
        DEFAULT_INSTANCE = videoAsset;
        AbstractC0269h.registerDefaultInstance(VideoAsset.class, videoAsset);
    }

    private VideoAsset() {
    }

    /* JADX INFO: renamed from: o */
    public static VideoAsset m7961o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"videoType_", "videoTypeCase_", FlatFile.class, HLSVideo.class});
        }
        if (iOrdinal == 3) {
            return new VideoAsset();
        }
        if (iOrdinal == 4) {
            return new chb1(2);
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
        synchronized (VideoAsset.class) {
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

    /* JADX INFO: renamed from: p */
    public final FlatFile m7962p() {
        return this.videoTypeCase_ == 1 ? (FlatFile) this.videoType_ : FlatFile.m7855p();
    }

    /* JADX INFO: renamed from: q */
    public final HLSVideo m7963q() {
        return this.videoTypeCase_ == 2 ? (HLSVideo) this.videoType_ : HLSVideo.m7866o();
    }

    /* JADX INFO: renamed from: r */
    public final int m7964r() {
        return xl81.m91392a(this.videoTypeCase_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
