package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.eqq;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetCreateChildConfigResponse extends AbstractC0269h implements sre0 {
    public static final int AGE_REQUIREMENTS_FIELD_NUMBER = 2;
    private static final GetCreateChildConfigResponse DEFAULT_INSTANCE;
    public static final int DENIAL_REASON_FIELD_NUMBER = 5;
    public static final int EXPECTED_ACCOUNT_TYPE_FIELD_NUMBER = 4;
    public static final int PARENTAL_CONTROLS_FIELD_NUMBER = 3;
    public static final int PARENT_REQUIREMENTS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private AgeRequirements ageRequirements_;
    private int bitField0_;
    private int denialReason_;
    private ExpectedAccountType expectedAccountType_;
    private ParentRequirements parentRequirements_;
    private ParentalControls parentalControls_;

    static {
        GetCreateChildConfigResponse getCreateChildConfigResponse = new GetCreateChildConfigResponse();
        DEFAULT_INSTANCE = getCreateChildConfigResponse;
        AbstractC0269h.registerDefaultInstance(GetCreateChildConfigResponse.class, getCreateChildConfigResponse);
    }

    private GetCreateChildConfigResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\f", new Object[]{"bitField0_", "parentRequirements_", "ageRequirements_", "parentalControls_", "expectedAccountType_", "denialReason_"});
        }
        if (iOrdinal == 3) {
            return new GetCreateChildConfigResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 28);
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
        synchronized (GetCreateChildConfigResponse.class) {
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
    public final AgeRequirements m12141n() {
        AgeRequirements ageRequirements = this.ageRequirements_;
        return ageRequirements == null ? AgeRequirements.m12114p() : ageRequirements;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final eqq m12142o() {
        eqq eqqVarM39736a = eqq.m39736a(this.denialReason_);
        return eqqVarM39736a == null ? eqq.UNRECOGNIZED : eqqVarM39736a;
    }

    /* JADX INFO: renamed from: p */
    public final ExpectedAccountType m12143p() {
        ExpectedAccountType expectedAccountType = this.expectedAccountType_;
        return expectedAccountType == null ? ExpectedAccountType.m12131n() : expectedAccountType;
    }

    /* JADX INFO: renamed from: q */
    public final ParentRequirements m12144q() {
        ParentRequirements parentRequirements = this.parentRequirements_;
        return parentRequirements == null ? ParentRequirements.m12155n() : parentRequirements;
    }

    /* JADX INFO: renamed from: r */
    public final ParentalControls m12145r() {
        ParentalControls parentalControls = this.parentalControls_;
        return parentalControls == null ? ParentalControls.m12160n() : parentalControls;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
