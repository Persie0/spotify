package com.spotify.audiorecognition.p030v1;

import com.google.protobuf.AbstractC0269h;
import p204p.a67;
import p204p.ore0;
import p204p.pre0;
import p204p.pw6;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSettings extends AbstractC0269h implements sre0 {
    public static final int AUDIO_ENCODING_FIELD_NUMBER = 4;
    public static final int CHANNELS_FIELD_NUMBER = 2;
    private static final AudioSettings DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SAMPLE_RATE_FIELD_NUMBER = 1;
    private int audioEncoding_;
    private int channels_;
    private int sampleRate_;

    static {
        AudioSettings audioSettings = new AudioSettings();
        DEFAULT_INSTANCE = audioSettings;
        AbstractC0269h.registerDefaultInstance(AudioSettings.class, audioSettings);
    }

    private AudioSettings() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3463n(AudioSettings audioSettings) {
        audioSettings.getClass();
        audioSettings.audioEncoding_ = pw6.AUDIO_ENCODING_S16LE.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m3464o(AudioSettings audioSettings) {
        audioSettings.channels_ = 1;
    }

    /* JADX INFO: renamed from: p */
    public static void m3465p(AudioSettings audioSettings, int i) {
        audioSettings.sampleRate_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static AudioSettings m3466r() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static a67 m3467t() {
        return (a67) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0004\f", new Object[]{"sampleRate_", "channels_", "audioEncoding_"});
        }
        if (iOrdinal == 3) {
            return new AudioSettings();
        }
        if (iOrdinal == 4) {
            return new a67(DEFAULT_INSTANCE);
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
        synchronized (AudioSettings.class) {
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

    /* JADX INFO: renamed from: q */
    public final int m3468q() {
        return this.channels_;
    }

    /* JADX INFO: renamed from: s */
    public final int m3469s() {
        return this.sampleRate_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
