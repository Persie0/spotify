package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.eqq;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTransitionChildConfigResponse extends AbstractC0269h implements sre0 {
    public static final int AGE_REQUIREMENTS_FIELD_NUMBER = 2;
    private static final GetTransitionChildConfigResponse DEFAULT_INSTANCE;
    public static final int DENIAL_REASON_FIELD_NUMBER = 5;
    public static final int EXPECTED_ACCOUNT_TYPE_FIELD_NUMBER = 4;
    public static final int HAS_ADDONS_TERMINATED_BY_TRANSITION_FIELD_NUMBER = 6;
    public static final int PARENTAL_CONTROLS_FIELD_NUMBER = 3;
    public static final int PARENT_REQUIREMENTS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private AgeRequirements ageRequirements_;
    private int bitField0_;
    private int denialReason_;
    private ExpectedAccountType expectedAccountType_;
    private boolean hasAddonsTerminatedByTransition_;
    private ParentRequirements parentRequirements_;
    private ParentalControls parentalControls_;

    static {
        GetTransitionChildConfigResponse getTransitionChildConfigResponse = new GetTransitionChildConfigResponse();
        DEFAULT_INSTANCE = getTransitionChildConfigResponse;
        AbstractC0269h.registerDefaultInstance(GetTransitionChildConfigResponse.class, getTransitionChildConfigResponse);
    }

    private GetTransitionChildConfigResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\f\u0006\u0007", new Object[]{"bitField0_", "parentRequirements_", "ageRequirements_", "parentalControls_", "expectedAccountType_", "denialReason_", "hasAddonsTerminatedByTransition_"});
        }
        if (iOrdinal == 3) {
            return new GetTransitionChildConfigResponse();
        }
        if (iOrdinal == 4) {
            return new qb10(DEFAULT_INSTANCE, 9);
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
        synchronized (GetTransitionChildConfigResponse.class) {
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
    public final AgeRequirements m12149n() {
        AgeRequirements ageRequirements = this.ageRequirements_;
        return ageRequirements == null ? AgeRequirements.m12114p() : ageRequirements;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final eqq m12150o() {
        eqq eqqVarM39736a = eqq.m39736a(this.denialReason_);
        return eqqVarM39736a == null ? eqq.UNRECOGNIZED : eqqVarM39736a;
    }

    /* JADX INFO: renamed from: p */
    public final ExpectedAccountType m12151p() {
        ExpectedAccountType expectedAccountType = this.expectedAccountType_;
        return expectedAccountType == null ? ExpectedAccountType.m12131n() : expectedAccountType;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12152q() {
        return this.hasAddonsTerminatedByTransition_;
    }

    /* JADX INFO: renamed from: r */
    public final ParentRequirements m12153r() {
        ParentRequirements parentRequirements = this.parentRequirements_;
        return parentRequirements == null ? ParentRequirements.m12155n() : parentRequirements;
    }

    /* JADX INFO: renamed from: s */
    public final ParentalControls m12154s() {
        ParentalControls parentalControls = this.parentalControls_;
        return parentalControls == null ? ParentalControls.m12160n() : parentalControls;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
