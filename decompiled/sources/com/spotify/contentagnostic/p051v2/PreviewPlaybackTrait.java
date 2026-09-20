package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.m5p0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.t3r0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewPlaybackTrait extends AbstractC0269h implements sre0 {
    public static final int AUDIO_FIELD_NUMBER = 3;
    private static final PreviewPlaybackTrait DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REPORTING_URI_FIELD_NUMBER = 4;
    public static final int URI_FIELD_NUMBER = 1;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private int bitField0_;
    private Object media_;
    private int mediaCase_ = 0;
    private String uri_ = "";
    private String reportingUri_ = "";

    static {
        PreviewPlaybackTrait previewPlaybackTrait = new PreviewPlaybackTrait();
        DEFAULT_INSTANCE = previewPlaybackTrait;
        AbstractC0269h.registerDefaultInstance(PreviewPlaybackTrait.class, previewPlaybackTrait);
    }

    private PreviewPlaybackTrait() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static PreviewPlaybackTrait m7911s(byte[] bArr) {
        return (PreviewPlaybackTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002<\u0000\u0003<\u0000\u0004Ȉ", new Object[]{"media_", "mediaCase_", "bitField0_", "uri_", VideoPreview.class, AudioPreview.class, "reportingUri_"});
        }
        if (iOrdinal == 3) {
            return new PreviewPlaybackTrait();
        }
        if (iOrdinal == 4) {
            return new t3r0(4);
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
        synchronized (PreviewPlaybackTrait.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    public final boolean hasUri() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final AudioPreview m7912o() {
        return this.mediaCase_ == 3 ? (AudioPreview) this.media_ : AudioPreview.m7780n();
    }

    /* JADX INFO: renamed from: p */
    public final int m7913p() {
        return m5p0.m60870b(this.mediaCase_);
    }

    /* JADX INFO: renamed from: q */
    public final String m7914q() {
        return this.reportingUri_;
    }

    /* JADX INFO: renamed from: r */
    public final VideoPreview m7915r() {
        return this.mediaCase_ == 2 ? (VideoPreview) this.media_ : VideoPreview.m7973n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
