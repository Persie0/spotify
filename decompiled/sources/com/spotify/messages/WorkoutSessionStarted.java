package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.o6e1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class WorkoutSessionStarted extends AbstractC0269h implements sre0 {
    public static final int ADJUST_SPEED_ENABLED_FIELD_NUMBER = 8;
    public static final int BEAT_MATCHING_ENABLED_FIELD_NUMBER = 7;
    public static final int COACHING_ENABLED_FIELD_NUMBER = 6;
    public static final int CONTEXT_URI_FIELD_NUMBER = 2;
    private static final WorkoutSessionStarted DEFAULT_INSTANCE;
    public static final int INTENSITY_FIELD_NUMBER = 5;
    public static final int IS_PLAYLIST_DOWNLOADED_FIELD_NUMBER = 10;
    public static final int NETWORK_STATE_FIELD_NUMBER = 11;
    private static volatile r2n0 PARSER = null;
    public static final int PLANNED_DURATION_MS_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    public static final int TARGET_BPM_FIELD_NUMBER = 9;
    public static final int WORKOUT_TYPE_FIELD_NUMBER = 3;
    private boolean adjustSpeedEnabled_;
    private boolean beatMatchingEnabled_;
    private int bitField0_;
    private boolean coachingEnabled_;
    private boolean isPlaylistDownloaded_;
    private long plannedDurationMs_;
    private long targetBpm_;
    private String sessionId_ = "";
    private String contextUri_ = "";
    private String workoutType_ = "";
    private String intensity_ = "";
    private String networkState_ = "";

    static {
        WorkoutSessionStarted workoutSessionStarted = new WorkoutSessionStarted();
        DEFAULT_INSTANCE = workoutSessionStarted;
        AbstractC0269h.registerDefaultInstance(WorkoutSessionStarted.class, workoutSessionStarted);
    }

    private WorkoutSessionStarted() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14878n(WorkoutSessionStarted workoutSessionStarted, boolean z) {
        workoutSessionStarted.bitField0_ |= 128;
        workoutSessionStarted.adjustSpeedEnabled_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m14879o(WorkoutSessionStarted workoutSessionStarted, boolean z) {
        workoutSessionStarted.bitField0_ |= 64;
        workoutSessionStarted.beatMatchingEnabled_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m14880p(WorkoutSessionStarted workoutSessionStarted, boolean z) {
        workoutSessionStarted.bitField0_ |= 32;
        workoutSessionStarted.coachingEnabled_ = z;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14881q(WorkoutSessionStarted workoutSessionStarted, String str) {
        workoutSessionStarted.getClass();
        str.getClass();
        workoutSessionStarted.bitField0_ |= 2;
        workoutSessionStarted.contextUri_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14882r(WorkoutSessionStarted workoutSessionStarted, String str) {
        workoutSessionStarted.getClass();
        workoutSessionStarted.bitField0_ |= 16;
        workoutSessionStarted.intensity_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14883s(WorkoutSessionStarted workoutSessionStarted, boolean z) {
        workoutSessionStarted.bitField0_ |= 512;
        workoutSessionStarted.isPlaylistDownloaded_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static void m14884t(WorkoutSessionStarted workoutSessionStarted, String str) {
        workoutSessionStarted.getClass();
        str.getClass();
        workoutSessionStarted.bitField0_ |= 1024;
        workoutSessionStarted.networkState_ = str;
    }

    /* JADX INFO: renamed from: u */
    public static void m14885u(WorkoutSessionStarted workoutSessionStarted, long j) {
        workoutSessionStarted.bitField0_ |= 8;
        workoutSessionStarted.plannedDurationMs_ = j;
    }

    /* JADX INFO: renamed from: v */
    public static void m14886v(WorkoutSessionStarted workoutSessionStarted, String str) {
        workoutSessionStarted.getClass();
        str.getClass();
        workoutSessionStarted.bitField0_ |= 1;
        workoutSessionStarted.sessionId_ = str;
    }

    /* JADX INFO: renamed from: w */
    public static void m14887w(WorkoutSessionStarted workoutSessionStarted, long j) {
        workoutSessionStarted.bitField0_ |= 256;
        workoutSessionStarted.targetBpm_ = j;
    }

    /* JADX INFO: renamed from: x */
    public static void m14888x(WorkoutSessionStarted workoutSessionStarted, String str) {
        workoutSessionStarted.getClass();
        str.getClass();
        workoutSessionStarted.bitField0_ |= 4;
        workoutSessionStarted.workoutType_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static o6e1 m14889y() {
        return (o6e1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဂ\b\nဇ\t\u000bဈ\n", new Object[]{"bitField0_", "sessionId_", "contextUri_", "workoutType_", "plannedDurationMs_", "intensity_", "coachingEnabled_", "beatMatchingEnabled_", "adjustSpeedEnabled_", "targetBpm_", "isPlaylistDownloaded_", "networkState_"});
        }
        if (iOrdinal == 3) {
            return new WorkoutSessionStarted();
        }
        if (iOrdinal == 4) {
            return new o6e1(DEFAULT_INSTANCE);
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
        synchronized (WorkoutSessionStarted.class) {
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
