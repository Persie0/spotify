package com.spotify.familyviewservice.accountswitching.p065v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.familyviewservice.p066v1.MemberProfile;
import p204p.hnn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class PlanMember extends AbstractC0269h implements sre0 {
    private static final PlanMember DEFAULT_INSTANCE;
    public static final int GEN_ALPHA_MANAGED_FIELD_NUMBER = 102;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    public static final int SELF_MANAGED_FIELD_NUMBER = 101;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object memberData_;
    private MemberProfile profile_;
    private int memberDataCase_ = 0;
    private String username_ = "";

    static {
        PlanMember planMember = new PlanMember();
        DEFAULT_INSTANCE = planMember;
        AbstractC0269h.registerDefaultInstance(PlanMember.class, planMember);
    }

    private PlanMember() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001f\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000e<\u0000f<\u0000", new Object[]{"memberData_", "memberDataCase_", "bitField0_", "username_", "profile_", SelfManagedPlanMember.class, GenAlphaManagedPlanMember.class});
        }
        if (iOrdinal == 3) {
            return new PlanMember();
        }
        if (iOrdinal == 4) {
            return new hnn0(DEFAULT_INSTANCE, 22);
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
        synchronized (PlanMember.class) {
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

    public final String getUsername() {
        return this.username_;
    }

    /* JADX INFO: renamed from: n */
    public final GenAlphaManagedPlanMember m10678n() {
        return this.memberDataCase_ == 102 ? (GenAlphaManagedPlanMember) this.memberData_ : GenAlphaManagedPlanMember.m10670n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m10679o() {
        int i = this.memberDataCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 101) {
            return i != 102 ? 0 : 2;
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public final MemberProfile m10680p() {
        MemberProfile memberProfile = this.profile_;
        return memberProfile == null ? MemberProfile.m10748n() : memberProfile;
    }

    /* JADX INFO: renamed from: q */
    public final SelfManagedPlanMember m10681q() {
        return this.memberDataCase_ == 101 ? (SelfManagedPlanMember) this.memberData_ : SelfManagedPlanMember.m10682n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
