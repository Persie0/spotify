package com.spotify.watchfeed.component.content.p183v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.watchfeed.component.model.p187v1.proto.AudioFile;
import com.spotify.watchfeed.component.model.p187v1.proto.Image;
import com.spotify.watchfeed.component.model.p187v1.proto.PlaybackControlsConfig;
import p204p.gva;
import p204p.ore0;
import p204p.p981;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class TrackPreviewContent extends AbstractC0269h implements sre0 {
    public static final int ANIMATION_URL_FIELD_NUMBER = 4;
    public static final int AUDIO_FILE_FIELD_NUMBER = 2;
    public static final int DECISION_ID_FIELD_NUMBER = 6;
    private static final TrackPreviewContent DEFAULT_INSTANCE;
    public static final int ENTITY_URI_FIELD_NUMBER = 1;
    public static final int ENTRYPOINT_URI_FIELD_NUMBER = 9;
    public static final int INCREASE_VOLUME_GRADUALLY_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PLAYBACK_CONTROLS_CONFIG_FIELD_NUMBER = 8;
    public static final int SHOULD_LOOP_FIELD_NUMBER = 5;
    public static final int THUMBNAIL_IMAGE_FIELD_NUMBER = 3;
    private AudioFile audioFile_;
    private int bitField0_;
    private boolean increaseVolumeGradually_;
    private PlaybackControlsConfig playbackControlsConfig_;
    private boolean shouldLoop_;
    private Image thumbnailImage_;
    private String entityUri_ = "";
    private String animationUrl_ = "";
    private String decisionId_ = "";
    private String entrypointUri_ = "";

    static {
        TrackPreviewContent trackPreviewContent = new TrackPreviewContent();
        DEFAULT_INSTANCE = trackPreviewContent;
        AbstractC0269h.registerDefaultInstance(TrackPreviewContent.class, trackPreviewContent);
    }

    private TrackPreviewContent() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: x */
    public static TrackPreviewContent m22538x(gva gvaVar) {
        return (TrackPreviewContent) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, gvaVar);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ȉ\u0005\u0007\u0006Ȉ\u0007\u0007\bဉ\u0002\tȈ", new Object[]{"bitField0_", "entityUri_", "audioFile_", "thumbnailImage_", "animationUrl_", "shouldLoop_", "decisionId_", "increaseVolumeGradually_", "playbackControlsConfig_", "entrypointUri_"});
        }
        if (iOrdinal == 3) {
            return new TrackPreviewContent();
        }
        if (iOrdinal == 4) {
            return new p981(DEFAULT_INSTANCE, 18);
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
        synchronized (TrackPreviewContent.class) {
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
    public final String m22539n() {
        return this.animationUrl_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final AudioFile m22540o() {
        AudioFile audioFile = this.audioFile_;
        return audioFile == null ? AudioFile.m22881o() : audioFile;
    }

    /* JADX INFO: renamed from: p */
    public final String m22541p() {
        return this.decisionId_;
    }

    /* JADX INFO: renamed from: q */
    public final String m22542q() {
        return this.entityUri_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22543r() {
        return this.entrypointUri_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m22544s() {
        return this.increaseVolumeGradually_;
    }

    /* JADX INFO: renamed from: t */
    public final PlaybackControlsConfig m22545t() {
        PlaybackControlsConfig playbackControlsConfig = this.playbackControlsConfig_;
        return playbackControlsConfig == null ? PlaybackControlsConfig.m22906n() : playbackControlsConfig;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m22546u() {
        return this.shouldLoop_;
    }

    /* JADX INFO: renamed from: v */
    public final Image m22547v() {
        Image image = this.thumbnailImage_;
        return image == null ? Image.m22897n() : image;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m22548w() {
        return (this.bitField0_ & 4) != 0;
    }
}
