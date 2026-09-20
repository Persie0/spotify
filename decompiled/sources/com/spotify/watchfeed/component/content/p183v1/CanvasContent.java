package com.spotify.watchfeed.component.content.p183v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.AudioFile;
import com.spotify.watchfeed.component.model.p187v1.proto.Image;
import com.spotify.watchfeed.component.model.p187v1.proto.PlaybackControlsConfig;
import com.spotify.watchfeed.component.model.p187v1.proto.VideoFile;
import p204p.gjb;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CanvasContent extends AbstractC0269h implements sre0 {
    public static final int AUDIO_FILE_FIELD_NUMBER = 3;
    public static final int DECISION_ID_FIELD_NUMBER = 6;
    private static final CanvasContent DEFAULT_INSTANCE;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_CONTROLS_CONFIG_FIELD_NUMBER = 8;
    public static final int SHOULD_LOOP_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 4;
    public static final int TRACK_URI_FIELD_NUMBER = 1;
    public static final int VIDEO_FILE_FIELD_NUMBER = 2;
    private AudioFile audioFile_;
    private int bitField0_;
    private boolean increaseVolumeGradually_;
    private PlaybackControlsConfig playbackControlsConfig_;
    private boolean shouldLoop_;
    private Image thumbnailImage_;
    private VideoFile videoFile_;
    private String trackUri_ = "";
    private String decisionId_ = "";

    static {
        CanvasContent canvasContent = new CanvasContent();
        DEFAULT_INSTANCE = canvasContent;
        AbstractC0269h.registerDefaultInstance(CanvasContent.class, canvasContent);
    }

    private CanvasContent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: w */
    public static CanvasContent m22506w(gva gvaVar) {
        return (CanvasContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005\u0007\u0006Ȉ\u0007\u0007\bဉ\u0003", new Object[]{"bitField0_", "trackUri_", "videoFile_", "audioFile_", "thumbnailImage_", "shouldLoop_", "decisionId_", "increaseVolumeGradually_", "playbackControlsConfig_"});
        }
        if (iOrdinal == 3) {
            return new CanvasContent();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 2);
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
        synchronized (CanvasContent.class) {
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

    /* JADX INFO: renamed from: n */
    public final AudioFile m22507n() {
        AudioFile audioFile = this.audioFile_;
        return audioFile == null ? AudioFile.m22881o() : audioFile;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22508o() {
        return this.decisionId_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22509p() {
        return this.increaseVolumeGradually_;
    }

    /* JADX INFO: renamed from: q */
    public final PlaybackControlsConfig m22510q() {
        PlaybackControlsConfig playbackControlsConfig = this.playbackControlsConfig_;
        return playbackControlsConfig == null ? PlaybackControlsConfig.m22906n() : playbackControlsConfig;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22511r() {
        return this.shouldLoop_;
    }

    /* JADX INFO: renamed from: s */
    public final Image m22512s() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.m22897n() : image;
    }

    /* JADX INFO: renamed from: t */
    public final String m22513t() {
        return this.trackUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final VideoFile m22514u() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.m22923n() : videoFile;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m22515v() {
        return (this.bitField0_ & 8) != 0;
    }
}
