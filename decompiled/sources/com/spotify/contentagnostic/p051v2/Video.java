package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import p204p.chb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class Video extends AbstractC0269h implements sre0 {
    public static final int ASSET_FIELD_NUMBER = 1;
    private static final Video DEFAULT_INSTANCE;
    public static final int FALLBACK_AUDIO_FIELD_NUMBER = 3;
    public static final int FALLBACK_IMAGE_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TRANSCRIPT_FIELD_NUMBER = 4;
    private VideoAsset asset_;
    private int bitField0_;
    private Audio fallbackAudio_;
    private Image fallbackImage_;
    private Transcript transcript_;

    static {
        Video video = new Video();
        DEFAULT_INSTANCE = video;
        AbstractC0269h.registerDefaultInstance(Video.class, video);
    }

    private Video() {
    }

    /* JADX INFO: renamed from: p */
    public static Video m7955p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "asset_", "fallbackImage_", "fallbackAudio_", "transcript_"});
        }
        if (iOrdinal == 3) {
            return new Video();
        }
        if (iOrdinal == 4) {
            return new chb1(1);
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
        synchronized (Video.class) {
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
    public final VideoAsset m7956o() {
        VideoAsset videoAsset = this.asset_;
        return videoAsset == null ? VideoAsset.m7961o() : videoAsset;
    }

    /* JADX INFO: renamed from: q */
    public final Audio m7957q() {
        Audio audio = this.fallbackAudio_;
        return audio == null ? Audio.m7757p() : audio;
    }

    /* JADX INFO: renamed from: r */
    public final Image m7958r() {
        Image image = this.fallbackImage_;
        return image == null ? Image.m7874o() : image;
    }

    /* JADX INFO: renamed from: s */
    public final Transcript m7959s() {
        Transcript transcript = this.transcript_;
        return transcript == null ? Transcript.m7946o() : transcript;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
