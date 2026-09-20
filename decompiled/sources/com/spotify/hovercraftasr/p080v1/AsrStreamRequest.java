package com.spotify.hovercraftasr.p080v1;

import com.google.protobuf.AbstractC0269h;
import p204p.cva;
import p204p.gva;
import p204p.ja6;
import p204p.ka6;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class AsrStreamRequest extends AbstractC0269h implements sre0 {
    public static final int AUDIO_FIELD_NUMBER = 4;
    public static final int AUDIO_FORMAT_FIELD_NUMBER = 1;
    private static final AsrStreamRequest DEFAULT_INSTANCE;
    public static final int END_OF_SPEECH_FIELD_NUMBER = 5;
    public static final int END_SPEECH_DETECTION_FIELD_NUMBER = 3;
    public static final int INTERACTION_MANAGER_PARAMS_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PARTIAL_TRANSCRIPTION_FIELD_NUMBER = 2;
    public static final int REASON_FIELD_NUMBER = 6;
    private int audioFormat_;
    private gva audio_ = gva.f84678b;
    private int bitField0_;
    private boolean endOfSpeech_;
    private EndSpeechDetectionOptions endSpeechDetection_;
    private InteractionManagerParams interactionManagerParams_;
    private PartialTranscriptOptions partialTranscription_;
    private int reason_;

    public static final class EndSpeechDetectionOptions extends AbstractC0269h implements sre0 {
        private static final EndSpeechDetectionOptions DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int SILENCE_DETECT_SECS_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean enable_;
        private float silenceDetectSecs_;

        static {
            EndSpeechDetectionOptions endSpeechDetectionOptions = new EndSpeechDetectionOptions();
            DEFAULT_INSTANCE = endSpeechDetectionOptions;
            AbstractC0269h.registerDefaultInstance(EndSpeechDetectionOptions.class, endSpeechDetectionOptions);
        }

        private EndSpeechDetectionOptions() {
        }

        /* JADX INFO: renamed from: n */
        public static void m11867n(EndSpeechDetectionOptions endSpeechDetectionOptions) {
            endSpeechDetectionOptions.enable_ = true;
        }

        /* JADX INFO: renamed from: o */
        public static C0793b m11868o() {
            return (C0793b) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ခ\u0000", new Object[]{"bitField0_", "enable_", "silenceDetectSecs_"});
            }
            if (iOrdinal == 3) {
                return new EndSpeechDetectionOptions();
            }
            if (iOrdinal == 4) {
                return new C0793b(DEFAULT_INSTANCE);
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
            synchronized (EndSpeechDetectionOptions.class) {
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

    public static final class InteractionManagerParams extends AbstractC0269h implements sre0 {
        public static final int CURRENT_SEGMENT_ID_FIELD_NUMBER = 3;
        public static final int CURRENT_TRACK_URI_FIELD_NUMBER = 5;
        private static final InteractionManagerParams DEFAULT_INSTANCE;
        public static final int DEVICE_ID_FIELD_NUMBER = 2;
        private static volatile r2n0 PARSER = null;
        public static final int RETRIES_LEFT_FIELD_NUMBER = 4;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private String sessionId_ = "";
        private String deviceId_ = "";
        private String currentSegmentId_ = "";
        private String retriesLeft_ = "";
        private String currentTrackUri_ = "";

        static {
            InteractionManagerParams interactionManagerParams = new InteractionManagerParams();
            DEFAULT_INSTANCE = interactionManagerParams;
            AbstractC0269h.registerDefaultInstance(InteractionManagerParams.class, interactionManagerParams);
        }

        private InteractionManagerParams() {
        }

        /* JADX INFO: renamed from: n */
        public static void m11869n(InteractionManagerParams interactionManagerParams, String str) {
            interactionManagerParams.getClass();
            str.getClass();
            interactionManagerParams.currentSegmentId_ = str;
        }

        /* JADX INFO: renamed from: o */
        public static void m11870o(InteractionManagerParams interactionManagerParams, String str) {
            interactionManagerParams.getClass();
            str.getClass();
            interactionManagerParams.currentTrackUri_ = str;
        }

        /* JADX INFO: renamed from: p */
        public static void m11871p(InteractionManagerParams interactionManagerParams, String str) {
            interactionManagerParams.getClass();
            str.getClass();
            interactionManagerParams.deviceId_ = str;
        }

        public static r2n0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: renamed from: q */
        public static void m11872q(InteractionManagerParams interactionManagerParams, String str) {
            interactionManagerParams.getClass();
            interactionManagerParams.sessionId_ = str;
        }

        /* JADX INFO: renamed from: r */
        public static C0794c m11873r() {
            return (C0794c) DEFAULT_INSTANCE.createBuilder();
        }

        @Override // com.google.protobuf.AbstractC0269h
        public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
            r2n0 r110Var;
            int iOrdinal = z110Var.ordinal();
            if (iOrdinal == 0) {
                return (byte) 1;
            }
            if (iOrdinal == 2) {
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"sessionId_", "deviceId_", "currentSegmentId_", "retriesLeft_", "currentTrackUri_"});
            }
            if (iOrdinal == 3) {
                return new InteractionManagerParams();
            }
            if (iOrdinal == 4) {
                return new C0794c(DEFAULT_INSTANCE);
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
            synchronized (InteractionManagerParams.class) {
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

    public static final class PartialTranscriptOptions extends AbstractC0269h implements sre0 {
        private static final PartialTranscriptOptions DEFAULT_INSTANCE;
        public static final int ENABLE_FIELD_NUMBER = 1;
        private static volatile r2n0 PARSER = null;
        public static final int SILENCE_DETECT_SECS_FIELD_NUMBER = 2;
        private int bitField0_;
        private boolean enable_;
        private float silenceDetectSecs_;

        static {
            PartialTranscriptOptions partialTranscriptOptions = new PartialTranscriptOptions();
            DEFAULT_INSTANCE = partialTranscriptOptions;
            AbstractC0269h.registerDefaultInstance(PartialTranscriptOptions.class, partialTranscriptOptions);
        }

        private PartialTranscriptOptions() {
        }

        /* JADX INFO: renamed from: n */
        public static void m11874n(PartialTranscriptOptions partialTranscriptOptions) {
            partialTranscriptOptions.enable_ = true;
        }

        /* JADX INFO: renamed from: o */
        public static C0795d m11875o() {
            return (C0795d) DEFAULT_INSTANCE.createBuilder();
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
                return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002ခ\u0000", new Object[]{"bitField0_", "enable_", "silenceDetectSecs_"});
            }
            if (iOrdinal == 3) {
                return new PartialTranscriptOptions();
            }
            if (iOrdinal == 4) {
                return new C0795d(DEFAULT_INSTANCE);
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
            synchronized (PartialTranscriptOptions.class) {
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

    static {
        AsrStreamRequest asrStreamRequest = new AsrStreamRequest();
        DEFAULT_INSTANCE = asrStreamRequest;
        AbstractC0269h.registerDefaultInstance(AsrStreamRequest.class, asrStreamRequest);
    }

    private AsrStreamRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11859n(AsrStreamRequest asrStreamRequest, cva cvaVar) {
        asrStreamRequest.getClass();
        asrStreamRequest.audio_ = cvaVar;
    }

    /* JADX INFO: renamed from: o */
    public static void m11860o(AsrStreamRequest asrStreamRequest) {
        asrStreamRequest.getClass();
        asrStreamRequest.audioFormat_ = ja6.WAV.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static void m11861p(AsrStreamRequest asrStreamRequest) {
        asrStreamRequest.endOfSpeech_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m11862q(AsrStreamRequest asrStreamRequest, EndSpeechDetectionOptions endSpeechDetectionOptions) {
        asrStreamRequest.getClass();
        endSpeechDetectionOptions.getClass();
        asrStreamRequest.endSpeechDetection_ = endSpeechDetectionOptions;
        asrStreamRequest.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: r */
    public static void m11863r(AsrStreamRequest asrStreamRequest, InteractionManagerParams interactionManagerParams) {
        asrStreamRequest.getClass();
        interactionManagerParams.getClass();
        asrStreamRequest.interactionManagerParams_ = interactionManagerParams;
        asrStreamRequest.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: s */
    public static void m11864s(AsrStreamRequest asrStreamRequest, PartialTranscriptOptions partialTranscriptOptions) {
        asrStreamRequest.getClass();
        partialTranscriptOptions.getClass();
        asrStreamRequest.partialTranscription_ = partialTranscriptOptions;
        asrStreamRequest.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: t */
    public static void m11865t(AsrStreamRequest asrStreamRequest, ka6 ka6Var) {
        asrStreamRequest.getClass();
        asrStreamRequest.reason_ = ka6Var.getNumber();
    }

    /* JADX INFO: renamed from: u */
    public static C0792a m11866u() {
        return (C0792a) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004\n\u0005\u0007\u0006\f\u0007ဉ\u0002", new Object[]{"bitField0_", "audioFormat_", "partialTranscription_", "endSpeechDetection_", "audio_", "endOfSpeech_", "reason_", "interactionManagerParams_"});
        }
        if (iOrdinal == 3) {
            return new AsrStreamRequest();
        }
        if (iOrdinal == 4) {
            return new C0792a(DEFAULT_INSTANCE);
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
        synchronized (AsrStreamRequest.class) {
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
