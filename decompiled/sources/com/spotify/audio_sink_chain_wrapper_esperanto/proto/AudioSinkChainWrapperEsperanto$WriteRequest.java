package com.spotify.audio_sink_chain_wrapper_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p67;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSinkChainWrapperEsperanto$WriteRequest extends AbstractC0269h implements sre0 {
    private static final AudioSinkChainWrapperEsperanto$WriteRequest DEFAULT_INSTANCE;
    public static final int FINAL_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PCM_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean final_;
    private long id_;
    private AudioSinkChainWrapperEsperanto$PcmAudioBuffer pcm_;

    static {
        AudioSinkChainWrapperEsperanto$WriteRequest audioSinkChainWrapperEsperanto$WriteRequest = new AudioSinkChainWrapperEsperanto$WriteRequest();
        DEFAULT_INSTANCE = audioSinkChainWrapperEsperanto$WriteRequest;
        AbstractC0269h.registerDefaultInstance(AudioSinkChainWrapperEsperanto$WriteRequest.class, audioSinkChainWrapperEsperanto$WriteRequest);
    }

    private AudioSinkChainWrapperEsperanto$WriteRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3398n(AudioSinkChainWrapperEsperanto$WriteRequest audioSinkChainWrapperEsperanto$WriteRequest, boolean z) {
        audioSinkChainWrapperEsperanto$WriteRequest.final_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m3399o(AudioSinkChainWrapperEsperanto$WriteRequest audioSinkChainWrapperEsperanto$WriteRequest, long j) {
        audioSinkChainWrapperEsperanto$WriteRequest.id_ = j;
    }

    /* JADX INFO: renamed from: p */
    public static void m3400p(AudioSinkChainWrapperEsperanto$WriteRequest audioSinkChainWrapperEsperanto$WriteRequest, AudioSinkChainWrapperEsperanto$PcmAudioBuffer audioSinkChainWrapperEsperanto$PcmAudioBuffer) {
        audioSinkChainWrapperEsperanto$WriteRequest.getClass();
        audioSinkChainWrapperEsperanto$PcmAudioBuffer.getClass();
        audioSinkChainWrapperEsperanto$WriteRequest.pcm_ = audioSinkChainWrapperEsperanto$PcmAudioBuffer;
        audioSinkChainWrapperEsperanto$WriteRequest.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static p67 m3401q() {
        return (p67) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002ဉ\u0000\u0003\u0007", new Object[]{"bitField0_", "id_", "pcm_", "final_"});
        }
        if (iOrdinal == 3) {
            return new AudioSinkChainWrapperEsperanto$WriteRequest();
        }
        if (iOrdinal == 4) {
            return new p67(DEFAULT_INSTANCE);
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
        synchronized (AudioSinkChainWrapperEsperanto$WriteRequest.class) {
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
