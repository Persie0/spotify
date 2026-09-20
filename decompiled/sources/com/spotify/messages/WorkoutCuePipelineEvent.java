package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.f3e1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class WorkoutCuePipelineEvent extends AbstractC0269h implements sre0 {
    public static final int AUDIO_BYTE_COUNT_FIELD_NUMBER = 10;
    public static final int CANCELLED_DURING_STAGE_FIELD_NUMBER = 15;
    public static final int CANCEL_REASON_FIELD_NUMBER = 14;
    public static final int CONTEXT_URI_FIELD_NUMBER = 7;
    public static final int CUE_TYPE_FIELD_NUMBER = 5;
    private static final WorkoutCuePipelineEvent DEFAULT_INSTANCE;
    public static final int ERROR_REASON_FIELD_NUMBER = 8;
    public static final int HTTP_STATUS_FIELD_NUMBER = 9;
    public static final int IS_PLAYLIST_DOWNLOADED_FIELD_NUMBER = 18;
    public static final int NETWORK_STATE_FIELD_NUMBER = 19;
    private static volatile r2n0 PARSER = null;
    public static final int PIPELINE_ELAPSED_MS_FIELD_NUMBER = 4;
    public static final int PIPELINE_ID_FIELD_NUMBER = 1;
    public static final int SESSION_ELAPSED_MS_FIELD_NUMBER = 11;
    public static final int SESSION_ID_FIELD_NUMBER = 16;
    public static final int STAGE_DURATION_MS_FIELD_NUMBER = 3;
    public static final int STAGE_FIELD_NUMBER = 2;
    public static final int TRACK_URI_FIELD_NUMBER = 17;
    public static final int TTS_PROVIDER_FIELD_NUMBER = 12;
    public static final int TTS_VOICE_FIELD_NUMBER = 13;
    public static final int WORKOUT_TYPE_FIELD_NUMBER = 6;
    private long audioByteCount_;
    private int bitField0_;
    private long httpStatus_;
    private boolean isPlaylistDownloaded_;
    private long pipelineElapsedMs_;
    private long sessionElapsedMs_;
    private long stageDurationMs_;
    private String pipelineId_ = "";
    private String stage_ = "";
    private String cueType_ = "";
    private String workoutType_ = "";
    private String contextUri_ = "";
    private String errorReason_ = "";
    private String ttsProvider_ = "";
    private String ttsVoice_ = "";
    private String cancelReason_ = "";
    private String cancelledDuringStage_ = "";
    private String sessionId_ = "";
    private String trackUri_ = "";
    private String networkState_ = "";

    static {
        WorkoutCuePipelineEvent workoutCuePipelineEvent = new WorkoutCuePipelineEvent();
        DEFAULT_INSTANCE = workoutCuePipelineEvent;
        AbstractC0269h.registerDefaultInstance(WorkoutCuePipelineEvent.class, workoutCuePipelineEvent);
    }

    private WorkoutCuePipelineEvent() {
    }

    /* JADX INFO: renamed from: A */
    public static void m14853A(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        workoutCuePipelineEvent.bitField0_ |= 2;
        workoutCuePipelineEvent.stage_ = str;
    }

    /* JADX INFO: renamed from: B */
    public static void m14854B(WorkoutCuePipelineEvent workoutCuePipelineEvent, long j) {
        workoutCuePipelineEvent.bitField0_ |= 4;
        workoutCuePipelineEvent.stageDurationMs_ = j;
    }

    /* JADX INFO: renamed from: C */
    public static void m14855C(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        workoutCuePipelineEvent.bitField0_ |= 65536;
        workoutCuePipelineEvent.trackUri_ = str;
    }

    /* JADX INFO: renamed from: D */
    public static void m14856D(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        workoutCuePipelineEvent.bitField0_ |= 2048;
        workoutCuePipelineEvent.ttsProvider_ = str;
    }

    /* JADX INFO: renamed from: E */
    public static void m14857E(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        workoutCuePipelineEvent.bitField0_ |= 4096;
        workoutCuePipelineEvent.ttsVoice_ = str;
    }

    /* JADX INFO: renamed from: F */
    public static void m14858F(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        workoutCuePipelineEvent.bitField0_ |= 32;
        workoutCuePipelineEvent.workoutType_ = str;
    }

    /* JADX INFO: renamed from: G */
    public static f3e1 m14859G() {
        return (f3e1) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m14860n(WorkoutCuePipelineEvent workoutCuePipelineEvent, long j) {
        workoutCuePipelineEvent.bitField0_ |= 512;
        workoutCuePipelineEvent.audioByteCount_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m14861o(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        str.getClass();
        workoutCuePipelineEvent.bitField0_ |= 8192;
        workoutCuePipelineEvent.cancelReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14862p(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        str.getClass();
        workoutCuePipelineEvent.bitField0_ |= 16384;
        workoutCuePipelineEvent.cancelledDuringStage_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14863q(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        str.getClass();
        workoutCuePipelineEvent.bitField0_ |= 64;
        workoutCuePipelineEvent.contextUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14864r(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        workoutCuePipelineEvent.bitField0_ |= 16;
        workoutCuePipelineEvent.cueType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14865s(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        workoutCuePipelineEvent.bitField0_ |= 128;
        workoutCuePipelineEvent.errorReason_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m14866t(WorkoutCuePipelineEvent workoutCuePipelineEvent, long j) {
        workoutCuePipelineEvent.bitField0_ |= 256;
        workoutCuePipelineEvent.httpStatus_ = j;
    }

    /* JADX INFO: renamed from: u */
    public static void m14867u(WorkoutCuePipelineEvent workoutCuePipelineEvent, boolean z) {
        workoutCuePipelineEvent.bitField0_ |= 131072;
        workoutCuePipelineEvent.isPlaylistDownloaded_ = z;
    }

    /* JADX INFO: renamed from: v */
    public static void m14868v(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        str.getClass();
        workoutCuePipelineEvent.bitField0_ |= 262144;
        workoutCuePipelineEvent.networkState_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14869w(WorkoutCuePipelineEvent workoutCuePipelineEvent, long j) {
        workoutCuePipelineEvent.bitField0_ |= 8;
        workoutCuePipelineEvent.pipelineElapsedMs_ = j;
    }

    /* JADX INFO: renamed from: x */
    public static void m14870x(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        workoutCuePipelineEvent.bitField0_ |= 1;
        workoutCuePipelineEvent.pipelineId_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static void m14871y(WorkoutCuePipelineEvent workoutCuePipelineEvent, long j) {
        workoutCuePipelineEvent.bitField0_ |= 1024;
        workoutCuePipelineEvent.sessionElapsedMs_ = j;
    }

    /* JADX INFO: renamed from: z */
    public static void m14872z(WorkoutCuePipelineEvent workoutCuePipelineEvent, String str) {
        workoutCuePipelineEvent.getClass();
        str.getClass();
        workoutCuePipelineEvent.bitField0_ |= 32768;
        workoutCuePipelineEvent.sessionId_ = str;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဈ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fဈ\u000e\u0010ဈ\u000f\u0011ဈ\u0010\u0012ဇ\u0011\u0013ဈ\u0012", new Object[]{"bitField0_", "pipelineId_", "stage_", "stageDurationMs_", "pipelineElapsedMs_", "cueType_", "workoutType_", "contextUri_", "errorReason_", "httpStatus_", "audioByteCount_", "sessionElapsedMs_", "ttsProvider_", "ttsVoice_", "cancelReason_", "cancelledDuringStage_", "sessionId_", "trackUri_", "isPlaylistDownloaded_", "networkState_"});
        }
        if (iOrdinal == 3) {
            return new WorkoutCuePipelineEvent();
        }
        if (iOrdinal == 4) {
            return new f3e1(DEFAULT_INSTANCE);
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
        synchronized (WorkoutCuePipelineEvent.class) {
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
