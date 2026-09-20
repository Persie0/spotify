package com.spotify.playbacknative;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.lzv;
import p204p.nzv;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m24211d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0003\u0010\u0011\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioFeatures;", "", "audioUsage", "Lcom/spotify/playbacknative/AudioFeatures$AudioUsage;", "audioType", "Lcom/spotify/playbacknative/AudioFeatures$AudioType;", "<init>", "(Lcom/spotify/playbacknative/AudioFeatures$AudioUsage;Lcom/spotify/playbacknative/AudioFeatures$AudioType;)V", "getAudioUsage", "()Lcom/spotify/playbacknative/AudioFeatures$AudioUsage;", "getAudioType", "()Lcom/spotify/playbacknative/AudioFeatures$AudioType;", "audioUsageDeprecated", "", "getAudioUsageDeprecated", "()I", "AudioUsage", "AudioType", "Companion", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class AudioFeatures {
    public static final int CORE_AUDIO_CONTENT_TYPE_MUSIC = 0;
    public static final int CORE_AUDIO_CONTENT_TYPE_SPEECH = 1;
    public static final int CORE_STREAM_TYPE_ALARM = 1;
    public static final int CORE_STREAM_TYPE_MUSIC = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AudioType audioType;
    private final AudioUsage audioUsage;

    @Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioFeatures$AudioType;", "", "attr", "", "<init>", "(Ljava/lang/String;II)V", "getAttr", "()I", "MUSIC", "SPEECH", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public enum AudioType {
        MUSIC(2),
        SPEECH(1);

        private static final /* synthetic */ lzv $ENTRIES = new nzv(values());
        private final int attr;

        AudioType(int i) {
            this.attr = i;
        }

        public static lzv getEntries() {
            return $ENTRIES;
        }

        public final int getAttr() {
            return this.attr;
        }
    }

    @Metadata(m24211d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioFeatures$AudioUsage;", "", "attr", "", "<init>", "(Ljava/lang/String;II)V", "getAttr", "()I", "MEDIA", "ALARM", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public enum AudioUsage {
        MEDIA(1),
        ALARM(4);

        private static final /* synthetic */ lzv $ENTRIES = new nzv(values());
        private final int attr;

        AudioUsage(int i) {
            this.attr = i;
        }

        public static lzv getEntries() {
            return $ENTRIES;
        }

        public final int getAttr() {
            return this.attr;
        }
    }

    @Metadata(m24211d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m24212d2 = {"Lcom/spotify/playbacknative/AudioFeatures$Companion;", "", "<init>", "()V", "CORE_STREAM_TYPE_MUSIC", "", "CORE_STREAM_TYPE_ALARM", "CORE_AUDIO_CONTENT_TYPE_MUSIC", "CORE_AUDIO_CONTENT_TYPE_SPEECH", "fromCoreAudioFeatures", "Lcom/spotify/playbacknative/AudioFeatures;", "coreAudioStreamType", "coreAudioContentType", "src_main_java_com_spotify_playbacknative_playbacknative-playbacknative"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AudioFeatures fromCoreAudioFeatures(int coreAudioStreamType, int coreAudioContentType) {
            AudioUsage audioUsage;
            AudioType audioType;
            if (coreAudioStreamType == 0) {
                audioUsage = AudioUsage.MEDIA;
            } else if (coreAudioStreamType != 1) {
                Logger.INSTANCE.m17652w("Unknown core AudioStreamType %d provided. Falling back to default action.", Integer.valueOf(coreAudioStreamType));
                audioUsage = AudioUsage.MEDIA;
            } else {
                audioUsage = AudioUsage.ALARM;
            }
            if (coreAudioContentType == 0) {
                audioType = AudioType.MUSIC;
            } else if (coreAudioContentType != 1) {
                Logger.INSTANCE.m17652w("Unknown core AudioContentType %d provided. Falling back to default action.", Integer.valueOf(coreAudioContentType));
                audioType = AudioType.MUSIC;
            } else {
                audioType = AudioType.SPEECH;
            }
            return new AudioFeatures(audioUsage, audioType);
        }

        private Companion() {
        }
    }

    @Metadata(m24213k = 3, m24214mv = {2, 3, 0}, m24216xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioUsage.values().length];
            try {
                iArr[AudioUsage.MEDIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioUsage.ALARM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AudioFeatures(AudioUsage audioUsage, AudioType audioType) {
        this.audioUsage = audioUsage;
        this.audioType = audioType;
    }

    public static final AudioFeatures fromCoreAudioFeatures(int i, int i2) {
        return INSTANCE.fromCoreAudioFeatures(i, i2);
    }

    public final AudioType getAudioType() {
        return this.audioType;
    }

    public final AudioUsage getAudioUsage() {
        return this.audioUsage;
    }

    public final int getAudioUsageDeprecated() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.audioUsage.ordinal()];
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }
}
