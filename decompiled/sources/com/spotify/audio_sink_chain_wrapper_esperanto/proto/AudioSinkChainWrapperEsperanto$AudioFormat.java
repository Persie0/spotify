package com.spotify.audio_sink_chain_wrapper_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g67;
import p204p.h67;
import p204p.o67;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSinkChainWrapperEsperanto$AudioFormat extends AbstractC0269h implements sre0 {
    public static final int CHANNEL_CONFIG_FIELD_NUMBER = 3;
    private static final AudioSinkChainWrapperEsperanto$AudioFormat DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SAMPLE_FORMAT_FIELD_NUMBER = 2;
    public static final int SAMPLE_RATE_FIELD_NUMBER = 1;
    private int channelConfig_;
    private int sampleFormat_;
    private int sampleRate_;

    static {
        AudioSinkChainWrapperEsperanto$AudioFormat audioSinkChainWrapperEsperanto$AudioFormat = new AudioSinkChainWrapperEsperanto$AudioFormat();
        DEFAULT_INSTANCE = audioSinkChainWrapperEsperanto$AudioFormat;
        AbstractC0269h.registerDefaultInstance(AudioSinkChainWrapperEsperanto$AudioFormat.class, audioSinkChainWrapperEsperanto$AudioFormat);
    }

    private AudioSinkChainWrapperEsperanto$AudioFormat() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3370n(AudioSinkChainWrapperEsperanto$AudioFormat audioSinkChainWrapperEsperanto$AudioFormat, h67 h67Var) {
        audioSinkChainWrapperEsperanto$AudioFormat.getClass();
        audioSinkChainWrapperEsperanto$AudioFormat.channelConfig_ = h67Var.getNumber();
    }

    /* JADX INFO: renamed from: o */
    public static void m3371o(AudioSinkChainWrapperEsperanto$AudioFormat audioSinkChainWrapperEsperanto$AudioFormat) {
        audioSinkChainWrapperEsperanto$AudioFormat.getClass();
        audioSinkChainWrapperEsperanto$AudioFormat.sampleFormat_ = o67.SIXTEEN_BITS_PER_SAMPLE.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m3372p(AudioSinkChainWrapperEsperanto$AudioFormat audioSinkChainWrapperEsperanto$AudioFormat, int i) {
        audioSinkChainWrapperEsperanto$AudioFormat.sampleRate_ = i;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static g67 m3373q() {
        return (g67) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\f\u0003\f", new Object[]{"sampleRate_", "sampleFormat_", "channelConfig_"});
        }
        if (iOrdinal == 3) {
            return new AudioSinkChainWrapperEsperanto$AudioFormat();
        }
        if (iOrdinal == 4) {
            return new g67(DEFAULT_INSTANCE);
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
        synchronized (AudioSinkChainWrapperEsperanto$AudioFormat.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
