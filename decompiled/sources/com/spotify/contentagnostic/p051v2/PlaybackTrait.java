package com.spotify.contentagnostic.p051v2;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.izb1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PlaybackTrait extends AbstractC0269h implements sre0 {
    public static final int AUDIO_FIELD_NUMBER = 1;
    private static final PlaybackTrait DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int VIDEO_FIELD_NUMBER = 2;
    private ae50 audio_ = AbstractC0269h.emptyProtobufList();
    private ae50 video_ = AbstractC0269h.emptyProtobufList();

    public static final class AudioMapEntry extends AbstractC0269h implements sre0 {
        private static final AudioMapEntry DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int key_;
        private AudioPlayback value_;

        static {
            AudioMapEntry audioMapEntry = new AudioMapEntry();
            DEFAULT_INSTANCE = audioMapEntry;
            AbstractC0269h.registerDefaultInstance(AudioMapEntry.class, audioMapEntry);
        }

        private AudioMapEntry() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "key_", "value_"});
            }
            if (iOrdinal == 3) {
                return new AudioMapEntry();
            }
            if (iOrdinal == 4) {
                return new C0560g(DEFAULT_INSTANCE);
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
            synchronized (AudioMapEntry.class) {
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
        public final AudioPlayback m7904n() {
            AudioPlayback audioPlayback = this.value_;
            return audioPlayback == null ? AudioPlayback.m7772n() : audioPlayback;
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

    public static final class VideoMapEntry extends AbstractC0269h implements sre0 {
        private static final VideoMapEntry DEFAULT_INSTANCE;
        public static final int KEY_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 2;
        private int bitField0_;
        private int key_;
        private VideoPlayback value_;

        static {
            VideoMapEntry videoMapEntry = new VideoMapEntry();
            DEFAULT_INSTANCE = videoMapEntry;
            AbstractC0269h.registerDefaultInstance(VideoMapEntry.class, videoMapEntry);
        }

        private VideoMapEntry() {
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000", new Object[]{"bitField0_", "key_", "value_"});
            }
            if (iOrdinal == 3) {
                return new VideoMapEntry();
            }
            if (iOrdinal == 4) {
                return new C0562i(DEFAULT_INSTANCE);
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
            synchronized (VideoMapEntry.class) {
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
        public final izb1 m7905n() {
            izb1 izb1Var;
            int i = this.key_;
            if (i != 0) {
                izb1Var = i != 1 ? null : izb1.VIDEO_MEDIA_FORMAT_ADAPTIVE;
            } else {
                izb1Var = izb1.VIDEO_MEDIA_FORMAT_UNSPECIFIED;
            }
            return izb1Var == null ? izb1.UNRECOGNIZED : izb1Var;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
            return newBuilderForType();
        }

        /* JADX INFO: renamed from: o */
        public final VideoPlayback m7906o() {
            VideoPlayback videoPlayback = this.value_;
            return videoPlayback == null ? VideoPlayback.m7967n() : videoPlayback;
        }

        @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
        public final /* bridge */ /* synthetic */ ore0 toBuilder() {
            return toBuilder();
        }
    }

    static {
        PlaybackTrait playbackTrait = new PlaybackTrait();
        DEFAULT_INSTANCE = playbackTrait;
        AbstractC0269h.registerDefaultInstance(PlaybackTrait.class, playbackTrait);
    }

    private PlaybackTrait() {
    }

    /* JADX INFO: renamed from: o */
    public static PlaybackTrait m7902o(byte[] bArr) {
        return (PlaybackTrait) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"audio_", AudioMapEntry.class, "video_", VideoMapEntry.class});
        }
        if (iOrdinal == 3) {
            return new PlaybackTrait();
        }
        if (iOrdinal == 4) {
            return new C0561h(DEFAULT_INSTANCE);
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
        synchronized (PlaybackTrait.class) {
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

    public final List getVideoList() {
        return this.video_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m7903n() {
        return this.audio_;
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
