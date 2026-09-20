package com.spotify.accountswitching.p009v1;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class Account extends AbstractC0269h implements sre0 {
    private static final Account DEFAULT_INSTANCE;
    public static final int MANAGED_ACCOUNT_FIELD_NUMBER = 103;
    public static final int MANAGED_PLAN_MEMBER_FIELD_NUMBER = 102;
    private static volatile r2n0 PARSER = null;
    public static final int PROFILE_FIELD_NUMBER = 2;
    public static final int SELF_MANAGED_ACCOUNT_FIELD_NUMBER = 104;
    public static final int SELF_MANAGED_PLAN_MEMBER_FIELD_NUMBER = 101;
    public static final int USERNAME_FIELD_NUMBER = 1;
    private Object accountType_;
    private int bitField0_;
    private AccountProfile profile_;
    private int accountTypeCase_ = 0;
    private String username_ = "";

    static {
        Account account = new Account();
        DEFAULT_INSTANCE = account;
        AbstractC0269h.registerDefaultInstance(Account.class, account);
    }

    private Account() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001h\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000e<\u0000f<\u0000g<\u0000h<\u0000", new Object[]{"accountType_", "accountTypeCase_", "bitField0_", "username_", "profile_", SelfManagedPlanMember.class, ManagedPlanMember.class, ManagedAccount.class, SelfManagedAccount.class});
        }
        if (iOrdinal == 3) {
            return new Account();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 5);
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
        synchronized (Account.class) {
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
    public final int m2239n() {
        int i = this.accountTypeCase_;
        if (i == 0) {
            return 5;
        }
        switch (i) {
            case 101:
                return 1;
            case 102:
                return 2;
            case 103:
                return 3;
            case 104:
                return 4;
            default:
                return 0;
        }
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ManagedAccount m2240o() {
        return this.accountTypeCase_ == 103 ? (ManagedAccount) this.accountType_ : ManagedAccount.m2254n();
    }

    /* JADX INFO: renamed from: p */
    public final ManagedPlanMember m2241p() {
        return this.accountTypeCase_ == 102 ? (ManagedPlanMember) this.accountType_ : ManagedPlanMember.m2255n();
    }

    /* JADX INFO: renamed from: q */
    public final AccountProfile m2242q() {
        AccountProfile accountProfile = this.profile_;
        return accountProfile == null ? AccountProfile.m2245n() : accountProfile;
    }

    /* JADX INFO: renamed from: r */
    public final SelfManagedAccount m2243r() {
        return this.accountTypeCase_ == 104 ? (SelfManagedAccount) this.accountType_ : SelfManagedAccount.m2256n();
    }

    /* JADX INFO: renamed from: s */
    public final SelfManagedPlanMember m2244s() {
        return this.accountTypeCase_ == 101 ? (SelfManagedPlanMember) this.accountType_ : SelfManagedPlanMember.m2258n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
