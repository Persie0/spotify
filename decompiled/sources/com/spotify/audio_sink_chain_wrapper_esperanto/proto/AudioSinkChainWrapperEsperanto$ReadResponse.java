package com.spotify.audio_sink_chain_wrapper_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSinkChainWrapperEsperanto$ReadResponse extends AbstractC0269h implements sre0 {
    private static final AudioSinkChainWrapperEsperanto$ReadResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PCM_FIELD_NUMBER = 1;
    private int bitField0_;
    private AudioSinkChainWrapperEsperanto$PcmAudioBuffer pcm_;

    static {
        AudioSinkChainWrapperEsperanto$ReadResponse audioSinkChainWrapperEsperanto$ReadResponse = new AudioSinkChainWrapperEsperanto$ReadResponse();
        DEFAULT_INSTANCE = audioSinkChainWrapperEsperanto$ReadResponse;
        AbstractC0269h.registerDefaultInstance(AudioSinkChainWrapperEsperanto$ReadResponse.class, audioSinkChainWrapperEsperanto$ReadResponse);
    }

    private AudioSinkChainWrapperEsperanto$ReadResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static AudioSinkChainWrapperEsperanto$ReadResponse m3396o(byte[] bArr) {
        return (AudioSinkChainWrapperEsperanto$ReadResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "pcm_"});
        }
        if (iOrdinal == 3) {
            return new AudioSinkChainWrapperEsperanto$ReadResponse();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 29);
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
        synchronized (AudioSinkChainWrapperEsperanto$ReadResponse.class) {
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
    public final AudioSinkChainWrapperEsperanto$PcmAudioBuffer m3397n() {
        AudioSinkChainWrapperEsperanto$PcmAudioBuffer audioSinkChainWrapperEsperanto$PcmAudioBuffer = this.pcm_;
        return audioSinkChainWrapperEsperanto$PcmAudioBuffer == null ? AudioSinkChainWrapperEsperanto$PcmAudioBuffer.m3391o() : audioSinkChainWrapperEsperanto$PcmAudioBuffer;
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
