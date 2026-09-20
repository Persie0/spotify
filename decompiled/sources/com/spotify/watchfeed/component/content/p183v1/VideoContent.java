package com.spotify.watchfeed.component.content.p183v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.Image;
import com.spotify.watchfeed.component.model.p187v1.proto.PlaybackControlsConfig;
import com.spotify.watchfeed.component.model.p187v1.proto.TranscriptFile;
import com.spotify.watchfeed.component.model.p187v1.proto.VideoFile;
import p204p.chb1;
import p204p.gva;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class VideoContent extends AbstractC0269h implements sre0 {
    public static final int DECISION_ID_FIELD_NUMBER = 5;
    private static final VideoContent DEFAULT_INSTANCE;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 12;
    public static final int HIDE_GRADIENT_FIELD_NUMBER = 7;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_CONTROLS_CONFIG_FIELD_NUMBER = 10;
    public static final int SHOULD_LOOP_FIELD_NUMBER = 4;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 8;
    public static final int TRANSCRIPT_FILE_FIELD_NUMBER = 11;
    public static final int VIDEO_FILE_FIELD_NUMBER = 2;
    public static final int VIDEO_URI_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean hideGradient_;
    private boolean increaseVolumeGradually_;
    private PlaybackControlsConfig playbackControlsConfig_;
    private boolean shouldLoop_;
    private Image thumbnailImage_;
    private TranscriptFile transcriptFile_;
    private VideoFile videoFile_;
    private String videoUri_ = "";
    private String decisionId_ = "";
    private String title_ = "";
    private String entrypointUri_ = "";

    static {
        VideoContent videoContent = new VideoContent();
        DEFAULT_INSTANCE = videoContent;
        AbstractC0269h.registerDefaultInstance(VideoContent.class, videoContent);
    }

    private VideoContent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: z */
    public static VideoContent m22549z(gva gvaVar) {
        return (VideoContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0007\u0005Ȉ\u0006\u0007\u0007\u0007\bȈ\nဉ\u0002\u000bဉ\u0003\fȈ", new Object[]{"bitField0_", "videoUri_", "videoFile_", "thumbnailImage_", "shouldLoop_", "decisionId_", "increaseVolumeGradually_", "hideGradient_", "title_", "playbackControlsConfig_", "transcriptFile_", "entrypointUri_"});
        }
        if (iOrdinal == 3) {
            return new VideoContent();
        }
        if (iOrdinal == 4) {
            return new chb1(DEFAULT_INSTANCE, 12);
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
        synchronized (VideoContent.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final String m22550n() {
        return this.decisionId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m22551o() {
        return this.entrypointUri_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m22552p() {
        return this.hideGradient_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22553q() {
        return this.increaseVolumeGradually_;
    }

    /* JADX INFO: renamed from: r */
    public final PlaybackControlsConfig m22554r() {
        PlaybackControlsConfig playbackControlsConfig = this.playbackControlsConfig_;
        return playbackControlsConfig == null ? PlaybackControlsConfig.m22906n() : playbackControlsConfig;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22555s() {
        return this.shouldLoop_;
    }

    /* JADX INFO: renamed from: t */
    public final Image m22556t() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.m22897n() : image;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final TranscriptFile m22557u() {
        TranscriptFile transcriptFile = this.transcriptFile_;
        return transcriptFile == null ? TranscriptFile.m22920n() : transcriptFile;
    }

    /* JADX INFO: renamed from: v */
    public final VideoFile m22558v() {
        VideoFile videoFile = this.videoFile_;
        return videoFile == null ? VideoFile.m22923n() : videoFile;
    }

    /* JADX INFO: renamed from: w */
    public final String m22559w() {
        return this.videoUri_;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m22560x() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m22561y() {
        return (this.bitField0_ & 8) != 0;
    }
}
