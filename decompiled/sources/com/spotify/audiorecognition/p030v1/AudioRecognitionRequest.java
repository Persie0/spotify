package com.spotify.audiorecognition.p030v1;

import com.google.protobuf.AbstractC0269h;
import p204p.l37;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioRecognitionRequest extends AbstractC0269h implements sre0 {
    public static final int CHUNK_FIELD_NUMBER = 2;
    private static final AudioRecognitionRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SETTINGS_FIELD_NUMBER = 1;
    private int payloadCase_ = 0;
    private Object payload_;

    static {
        AudioRecognitionRequest audioRecognitionRequest = new AudioRecognitionRequest();
        DEFAULT_INSTANCE = audioRecognitionRequest;
        AbstractC0269h.registerDefaultInstance(AudioRecognitionRequest.class, audioRecognitionRequest);
    }

    private AudioRecognitionRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m3453n(AudioRecognitionRequest audioRecognitionRequest, AudioChunk audioChunk) {
        audioRecognitionRequest.getClass();
        audioChunk.getClass();
        audioRecognitionRequest.payload_ = audioChunk;
        audioRecognitionRequest.payloadCase_ = 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m3454o(AudioRecognitionRequest audioRecognitionRequest, AudioSettings audioSettings) {
        audioRecognitionRequest.getClass();
        audioRecognitionRequest.payload_ = audioSettings;
        audioRecognitionRequest.payloadCase_ = 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static l37 m3455r() {
        return (l37) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"payload_", "payloadCase_", AudioSettings.class, AudioChunk.class});
        }
        if (iOrdinal == 3) {
            return new AudioRecognitionRequest();
        }
        if (iOrdinal == 4) {
            return new l37(DEFAULT_INSTANCE);
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
        synchronized (AudioRecognitionRequest.class) {
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
    public final int m3456p() {
        int i = this.payloadCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public final AudioSettings m3457q() {
        return this.payloadCase_ == 1 ? (AudioSettings) this.payload_ : AudioSettings.m3466r();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
