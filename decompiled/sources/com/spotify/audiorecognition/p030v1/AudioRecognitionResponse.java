package com.spotify.audiorecognition.p030v1;

import com.google.protobuf.AbstractC0269h;
import p204p.hr6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class AudioRecognitionResponse extends AbstractC0269h implements sre0 {
    private static final AudioRecognitionResponse DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 4;
    public static final int MATCH_FIELD_NUMBER = 2;
    public static final int NO_MATCH_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PROCESSING_FIELD_NUMBER = 1;
    public static final int REQUEST_ID_FIELD_NUMBER = 5;
    private Object result_;
    private int resultCase_ = 0;
    private String requestId_ = "";

    static {
        AudioRecognitionResponse audioRecognitionResponse = new AudioRecognitionResponse();
        DEFAULT_INSTANCE = audioRecognitionResponse;
        AbstractC0269h.registerDefaultInstance(AudioRecognitionResponse.class, audioRecognitionResponse);
    }

    private AudioRecognitionResponse() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static AudioRecognitionResponse m3458r(byte[] bArr) {
        return (AudioRecognitionResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005Ȉ", new Object[]{"result_", "resultCase_", RecognitionProcessing.class, RecognitionMatch.class, RecognitionNoMatch.class, RecognitionError.class, "requestId_"});
        }
        if (iOrdinal == 3) {
            return new AudioRecognitionResponse();
        }
        if (iOrdinal == 4) {
            return new hr6(DEFAULT_INSTANCE, 25);
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
        synchronized (AudioRecognitionResponse.class) {
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
    public final RecognitionError m3459n() {
        return this.resultCase_ == 4 ? (RecognitionError) this.result_ : RecognitionError.m3470n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final RecognitionMatch m3460o() {
        return this.resultCase_ == 2 ? (RecognitionMatch) this.result_ : RecognitionMatch.m3471n();
    }

    /* JADX INFO: renamed from: p */
    public final String m3461p() {
        return this.requestId_;
    }

    /* JADX INFO: renamed from: q */
    public final int m3462q() {
        int i = this.resultCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
