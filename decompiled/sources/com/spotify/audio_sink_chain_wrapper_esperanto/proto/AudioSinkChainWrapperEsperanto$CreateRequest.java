package com.spotify.audio_sink_chain_wrapper_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i67;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioSinkChainWrapperEsperanto$CreateRequest extends AbstractC0269h implements sre0 {
    private static final AudioSinkChainWrapperEsperanto$CreateRequest DEFAULT_INSTANCE;
    public static final int FORMAT_FIELD_NUMBER = 1;
    public static final int IS_TALK_FIELD_NUMBER = 4;
    public static final int LOUDNESS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TRUE_PEAK_FIELD_NUMBER = 2;
    private int bitField0_;
    private AudioSinkChainWrapperEsperanto$AudioFormat format_;
    private boolean isTalk_;
    private float loudness_;
    private float truePeak_;

    static {
        AudioSinkChainWrapperEsperanto$CreateRequest audioSinkChainWrapperEsperanto$CreateRequest = new AudioSinkChainWrapperEsperanto$CreateRequest();
        DEFAULT_INSTANCE = audioSinkChainWrapperEsperanto$CreateRequest;
        AbstractC0269h.registerDefaultInstance(AudioSinkChainWrapperEsperanto$CreateRequest.class, audioSinkChainWrapperEsperanto$CreateRequest);
    }

    private AudioSinkChainWrapperEsperanto$CreateRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3374n(AudioSinkChainWrapperEsperanto$CreateRequest audioSinkChainWrapperEsperanto$CreateRequest, AudioSinkChainWrapperEsperanto$AudioFormat audioSinkChainWrapperEsperanto$AudioFormat) {
        audioSinkChainWrapperEsperanto$CreateRequest.getClass();
        audioSinkChainWrapperEsperanto$AudioFormat.getClass();
        audioSinkChainWrapperEsperanto$CreateRequest.format_ = audioSinkChainWrapperEsperanto$AudioFormat;
        audioSinkChainWrapperEsperanto$CreateRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m3375o(AudioSinkChainWrapperEsperanto$CreateRequest audioSinkChainWrapperEsperanto$CreateRequest, boolean z) {
        audioSinkChainWrapperEsperanto$CreateRequest.isTalk_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m3376p(AudioSinkChainWrapperEsperanto$CreateRequest audioSinkChainWrapperEsperanto$CreateRequest, float f) {
        audioSinkChainWrapperEsperanto$CreateRequest.bitField0_ |= 4;
        audioSinkChainWrapperEsperanto$CreateRequest.loudness_ = f;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m3377q(AudioSinkChainWrapperEsperanto$CreateRequest audioSinkChainWrapperEsperanto$CreateRequest, float f) {
        audioSinkChainWrapperEsperanto$CreateRequest.bitField0_ |= 2;
        audioSinkChainWrapperEsperanto$CreateRequest.truePeak_ = f;
    }

    /* JADX INFO: renamed from: r */
    public static i67 m3378r() {
        return (i67) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004\u0007", new Object[]{"bitField0_", "format_", "truePeak_", "loudness_", "isTalk_"});
        }
        if (iOrdinal == 3) {
            return new AudioSinkChainWrapperEsperanto$CreateRequest();
        }
        if (iOrdinal == 4) {
            return new i67(DEFAULT_INSTANCE);
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
        synchronized (AudioSinkChainWrapperEsperanto$CreateRequest.class) {
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
