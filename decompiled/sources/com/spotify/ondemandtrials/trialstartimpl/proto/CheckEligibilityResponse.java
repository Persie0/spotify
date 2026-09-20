package com.spotify.ondemandtrials.trialstartimpl.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ioc;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class CheckEligibilityResponse extends AbstractC0269h implements sre0 {
    private static final CheckEligibilityResponse DEFAULT_INSTANCE;
    public static final int MANUAL_TRIAL_FLOW_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TRIAL_LENGTH_DAYS_FIELD_NUMBER = 2;
    public static final int VIABLE_FIELD_NUMBER = 1;
    public static final int WINDOW_END_TIME_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean manualTrialFlow_;
    private int trialLengthDays_;
    private boolean viable_;
    private Timestamp windowEndTime_;

    static {
        CheckEligibilityResponse checkEligibilityResponse = new CheckEligibilityResponse();
        DEFAULT_INSTANCE = checkEligibilityResponse;
        AbstractC0269h.registerDefaultInstance(CheckEligibilityResponse.class, checkEligibilityResponse);
    }

    private CheckEligibilityResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002င\u0000\u0003ဉ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "viable_", "trialLengthDays_", "windowEndTime_", "manualTrialFlow_"});
        }
        if (iOrdinal == 3) {
            return new CheckEligibilityResponse();
        }
        if (iOrdinal == 4) {
            return new ioc(DEFAULT_INSTANCE, 14);
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
        synchronized (CheckEligibilityResponse.class) {
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
    public final boolean m16236n() {
        return this.manualTrialFlow_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m16237o() {
        return this.trialLengthDays_;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m16238p() {
        return this.viable_;
    }

    /* JADX INFO: renamed from: q */
    public final Timestamp m16239q() {
        Timestamp timestamp = this.windowEndTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m16240r() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16241s() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16242t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
