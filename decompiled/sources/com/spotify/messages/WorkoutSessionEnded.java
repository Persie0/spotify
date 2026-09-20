package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v5e1;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class WorkoutSessionEnded extends AbstractC0269h implements sre0 {
    private static final WorkoutSessionEnded DEFAULT_INSTANCE;
    public static final int ELAPSED_MS_FIELD_NUMBER = 3;
    public static final int END_REASON_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int PLANNED_DURATION_MS_FIELD_NUMBER = 4;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private long elapsedMs_;
    private long plannedDurationMs_;
    private String sessionId_ = "";
    private String endReason_ = "";

    static {
        WorkoutSessionEnded workoutSessionEnded = new WorkoutSessionEnded();
        DEFAULT_INSTANCE = workoutSessionEnded;
        AbstractC0269h.registerDefaultInstance(WorkoutSessionEnded.class, workoutSessionEnded);
    }

    private WorkoutSessionEnded() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14873n(WorkoutSessionEnded workoutSessionEnded, long j) {
        workoutSessionEnded.bitField0_ |= 4;
        workoutSessionEnded.elapsedMs_ = j;
    }

    /* JADX INFO: renamed from: o */
    public static void m14874o(WorkoutSessionEnded workoutSessionEnded, String str) {
        workoutSessionEnded.getClass();
        workoutSessionEnded.bitField0_ |= 2;
        workoutSessionEnded.endReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14875p(WorkoutSessionEnded workoutSessionEnded, long j) {
        workoutSessionEnded.bitField0_ |= 8;
        workoutSessionEnded.plannedDurationMs_ = j;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14876q(WorkoutSessionEnded workoutSessionEnded, String str) {
        workoutSessionEnded.getClass();
        str.getClass();
        workoutSessionEnded.bitField0_ |= 1;
        workoutSessionEnded.sessionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static v5e1 m14877r() {
        return (v5e1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "sessionId_", "endReason_", "elapsedMs_", "plannedDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new WorkoutSessionEnded();
        }
        if (iOrdinal == 4) {
            return new v5e1(DEFAULT_INSTANCE);
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
        synchronized (WorkoutSessionEnded.class) {
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
