package com.spotify.audio_sink_chain_wrapper_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.m67;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSinkChainWrapperEsperanto$PcmAudioBuffer extends AbstractC0269h implements sre0 {
    private static final AudioSinkChainWrapperEsperanto$PcmAudioBuffer DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SAMPLES_FIELD_NUMBER = 1;
    private gva samples_ = gva.f84678b;

    static {
        AudioSinkChainWrapperEsperanto$PcmAudioBuffer audioSinkChainWrapperEsperanto$PcmAudioBuffer = new AudioSinkChainWrapperEsperanto$PcmAudioBuffer();
        DEFAULT_INSTANCE = audioSinkChainWrapperEsperanto$PcmAudioBuffer;
        AbstractC0269h.registerDefaultInstance(AudioSinkChainWrapperEsperanto$PcmAudioBuffer.class, audioSinkChainWrapperEsperanto$PcmAudioBuffer);
    }

    private AudioSinkChainWrapperEsperanto$PcmAudioBuffer() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3390n(AudioSinkChainWrapperEsperanto$PcmAudioBuffer audioSinkChainWrapperEsperanto$PcmAudioBuffer, cva cvaVar) {
        audioSinkChainWrapperEsperanto$PcmAudioBuffer.getClass();
        audioSinkChainWrapperEsperanto$PcmAudioBuffer.samples_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static AudioSinkChainWrapperEsperanto$PcmAudioBuffer m3391o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static m67 m3392q() {
        return (m67) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"samples_"});
        }
        if (iOrdinal == 3) {
            return new AudioSinkChainWrapperEsperanto$PcmAudioBuffer();
        }
        if (iOrdinal == 4) {
            return new m67(DEFAULT_INSTANCE);
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
        synchronized (AudioSinkChainWrapperEsperanto$PcmAudioBuffer.class) {
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
    public final gva m3393p() {
        return this.samples_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
