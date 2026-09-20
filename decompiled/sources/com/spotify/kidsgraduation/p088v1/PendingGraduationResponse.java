package com.spotify.kidsgraduation.p088v1;

import com.google.protobuf.AbstractC0269h;
import p204p.c0n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class PendingGraduationResponse extends AbstractC0269h implements sre0 {
    private static final PendingGraduationResponse DEFAULT_INSTANCE;
    public static final int EXPECTED_ACCOUNT_TYPE_FIELD_NUMBER = 6;
    public static final int FORCED_GRADUATION_AGE_FIELD_NUMBER = 4;
    public static final int HAS_A_PENDING_REQUEST_FIELD_NUMBER = 1;
    public static final int MIN_GRADUATION_AGE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_MANAGER_ADDRESS_FIELD_NUMBER = 5;
    public static final int PROFILE_FIELD_NUMBER = 2;
    private int bitField0_;
    private ExpectedAccountType expectedAccountType_;
    private int forcedGraduationAge_;
    private boolean hasAPendingRequest_;
    private int minGraduationAge_;
    private String planManagerAddress_ = "";
    private Profile profile_;

    static {
        PendingGraduationResponse pendingGraduationResponse = new PendingGraduationResponse();
        DEFAULT_INSTANCE = pendingGraduationResponse;
        AbstractC0269h.registerDefaultInstance(PendingGraduationResponse.class, pendingGraduationResponse);
    }

    private PendingGraduationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0002ဉ\u0000\u0003\u000b\u0004\u000b\u0005ለ\u0001\u0006ဉ\u0002", new Object[]{"bitField0_", "hasAPendingRequest_", "profile_", "minGraduationAge_", "forcedGraduationAge_", "planManagerAddress_", "expectedAccountType_"});
        }
        if (iOrdinal == 3) {
            return new PendingGraduationResponse();
        }
        if (iOrdinal == 4) {
            return new c0n0(DEFAULT_INSTANCE, 25);
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
        synchronized (PendingGraduationResponse.class) {
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

    public final int getMinGraduationAge() {
        return this.minGraduationAge_;
    }

    /* JADX INFO: renamed from: n */
    public final ExpectedAccountType m12220n() {
        ExpectedAccountType expectedAccountType = this.expectedAccountType_;
        return expectedAccountType == null ? ExpectedAccountType.m12211n() : expectedAccountType;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m12221o() {
        return this.forcedGraduationAge_;
    }

    /* JADX INFO: renamed from: p */
    public final Profile m12222p() {
        Profile profile = this.profile_;
        return profile == null ? Profile.m12228n() : profile;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12223q() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
