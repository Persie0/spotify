package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.C1997j;
import p204p.ae50;
import p204p.bfn0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vqq0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Account extends AbstractC0269h implements sre0 {
    public static final int AVAILABLE_INVITES_FIELD_NUMBER = 6;
    public static final int BILLING_DESCRIPTION_FIELD_NUMBER = 1;
    private static final Account DEFAULT_INSTANCE;
    public static final int EXPIRATION_DATE_FIELD_NUMBER = 4;
    public static final int FLAGS_FIELD_NUMBER = 8;
    public static final int IS_ADDRESS_SET_FIELD_NUMBER = 2;
    public static final int IS_GRACE_PERIOD_FIELD_NUMBER = 3;
    public static final int MAX_CAPACITY_FIELD_NUMBER = 12;
    public static final int MEMBERSHIPVERIFICATION_FIELD_NUMBER = 13;
    public static final int MEMBERS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLAN_SUBTITLE_FIELD_NUMBER = 11;
    public static final int PREPAID_COUNT_FIELD_NUMBER = 9;
    public static final int PREPAID_UNIT_FIELD_NUMBER = 10;
    public static final int SCHEDULE_FIELD_NUMBER = 7;
    private long availableInvites_;
    private int bitField0_;
    private long expirationDate_;
    private AccountFlags flags_;
    private boolean isAddressSet_;
    private boolean isGracePeriod_;
    private int maxCapacity_;
    private MembershipVerification membershipVerification_;
    private int prepaidCount_;
    private int prepaidUnit_;
    private int schedule_;
    private String billingDescription_ = "";
    private ae50 members_ = AbstractC0269h.emptyProtobufList();
    private String planSubtitle_ = "";

    static {
        Account account = new Account();
        DEFAULT_INSTANCE = account;
        AbstractC0269h.registerDefaultInstance(Account.class, account);
    }

    private Account() {
    }

    /* JADX INFO: renamed from: p */
    public static Account m16360p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final bfn0 m16361A() {
        bfn0 bfn0Var;
        int i = this.schedule_;
        if (i == 0) {
            bfn0Var = bfn0.TRIAL;
        } else if (i != 1) {
            bfn0Var = i != 2 ? null : bfn0.RECURRING;
        } else {
            bfn0Var = bfn0.PREPAID;
        }
        return bfn0Var == null ? bfn0.UNRECOGNIZED : bfn0Var;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m16362B() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001Ȉ\u0002\u0007\u0003\u0007\u0004\u0003\u0005\u001b\u0006\u0002\u0007\f\bဉ\u0000\t\u0004\n\f\u000bለ\u0001\f\u0004\rဉ\u0002", new Object[]{"bitField0_", "billingDescription_", "isAddressSet_", "isGracePeriod_", "expirationDate_", "members_", Member.class, "availableInvites_", "schedule_", "flags_", "prepaidCount_", "prepaidUnit_", "planSubtitle_", "maxCapacity_", "membershipVerification_"});
        }
        if (iOrdinal == 3) {
            return new Account();
        }
        if (iOrdinal == 4) {
            return new C1997j(DEFAULT_INSTANCE, 4);
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

    /* JADX INFO: renamed from: n */
    public final long m16363n() {
        return this.availableInvites_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16364o() {
        return this.billingDescription_;
    }

    /* JADX INFO: renamed from: q */
    public final long m16365q() {
        return this.expirationDate_;
    }

    /* JADX INFO: renamed from: r */
    public final AccountFlags m16366r() {
        AccountFlags accountFlags = this.flags_;
        return accountFlags == null ? AccountFlags.m16375u() : accountFlags;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m16367s() {
        return this.isAddressSet_;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m16368t() {
        return this.isGracePeriod_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final int m16369u() {
        return this.maxCapacity_;
    }

    /* JADX INFO: renamed from: v */
    public final ae50 m16370v() {
        return this.members_;
    }

    /* JADX INFO: renamed from: w */
    public final MembershipVerification m16371w() {
        MembershipVerification membershipVerification = this.membershipVerification_;
        return membershipVerification == null ? MembershipVerification.m16535p() : membershipVerification;
    }

    /* JADX INFO: renamed from: x */
    public final String m16372x() {
        return this.planSubtitle_;
    }

    /* JADX INFO: renamed from: y */
    public final int m16373y() {
        return this.prepaidCount_;
    }

    /* JADX INFO: renamed from: z */
    public final vqq0 m16374z() {
        vqq0 vqq0Var;
        int i = this.prepaidUnit_;
        if (i == 0) {
            vqq0Var = vqq0.DAY;
        } else if (i == 1) {
            vqq0Var = vqq0.WEEK;
        } else if (i != 2) {
            vqq0Var = i != 3 ? null : vqq0.YEAR;
        } else {
            vqq0Var = vqq0.MONTH;
        }
        return vqq0Var == null ? vqq0.UNRECOGNIZED : vqq0Var;
    }
}
