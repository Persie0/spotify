package com.spotify.ondemandtrials.trialstartimpl.proto;

import com.google.protobuf.AbstractC0269h;
import com.google.protobuf.Timestamp;
import p204p.ec10;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetTrialResponse extends AbstractC0269h implements sre0 {
    private static final GetTrialResponse DEFAULT_INSTANCE;
    public static final int EXPIRATION_TIME_FIELD_NUMBER = 2;
    public static final int IS_ACTIVITY_STARTED_FIELD_NUMBER = 5;
    public static final int IS_CONSECUTIVE_FIELD_NUMBER = 4;
    public static final int LENGTH_DAYS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int TURN_TRIAL_ON_STATUS_FIELD_NUMBER = 6;
    private int bitField0_;
    private Timestamp expirationTime_;
    private boolean isActivityStarted_;
    private boolean isConsecutive_;
    private int lengthDays_;
    private String status_ = "";
    private int turnTrialOnStatus_;

    static {
        GetTrialResponse getTrialResponse = new GetTrialResponse();
        DEFAULT_INSTANCE = getTrialResponse;
        AbstractC0269h.registerDefaultInstance(GetTrialResponse.class, getTrialResponse);
    }

    private GetTrialResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u0004\u0004\u0007\u0005\u0007\u0006\f", new Object[]{"bitField0_", "status_", "expirationTime_", "lengthDays_", "isConsecutive_", "isActivityStarted_", "turnTrialOnStatus_"});
        }
        if (iOrdinal == 3) {
            return new GetTrialResponse();
        }
        if (iOrdinal == 4) {
            return new qb10(DEFAULT_INSTANCE, 11);
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
        synchronized (GetTrialResponse.class) {
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
    public final Timestamp m16246n() {
        Timestamp timestamp = this.expirationTime_;
        return timestamp == null ? Timestamp.m1965q() : timestamp;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m16247o() {
        return this.lengthDays_;
    }

    /* JADX INFO: renamed from: p */
    public final ec10 m16248p() {
        ec10 ec10Var;
        switch (this.turnTrialOnStatus_) {
            case 0:
                ec10Var = ec10.ACTIVE;
                break;
            case 1:
                ec10Var = ec10.EXPANDED_TRIAL_ACTIVE;
                break;
            case 2:
                ec10Var = ec10.PREMIUM_TRIAL_ACTIVE;
                break;
            case 3:
                ec10Var = ec10.TRIAL_WITH_OFFLINE_ACTIVE;
                break;
            case 4:
                ec10Var = ec10.PREMIUM_NO_OFFLINE_ACTIVE;
                break;
            case 5:
                ec10Var = ec10.NO_TRIAL_HOLDOUT;
                break;
            case 6:
                ec10Var = ec10.TRIAL_DELAY;
                break;
            default:
                ec10Var = null;
                break;
        }
        return ec10Var == null ? ec10.UNRECOGNIZED : ec10Var;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16249q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
