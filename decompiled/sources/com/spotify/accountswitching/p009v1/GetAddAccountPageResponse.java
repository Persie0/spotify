package com.spotify.accountswitching.p009v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ie00;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class GetAddAccountPageResponse extends AbstractC0269h implements sre0 {
    public static final int ACCOUNTS_FIELD_NUMBER = 1;
    public static final int CAN_HAVE_MANAGED_ACCOUNTS_FIELD_NUMBER = 2;
    private static final GetAddAccountPageResponse DEFAULT_INSTANCE;
    public static final int MAX_MANAGED_ACCOUNT_SIGN_UP_AGE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int UI_HINTS_FIELD_NUMBER = 3;
    private ae50 accounts_ = AbstractC0269h.emptyProtobufList();
    private int bitField0_;
    private boolean canHaveManagedAccounts_;
    private int maxManagedAccountSignUpAge_;
    private UIHints uiHints_;

    static {
        GetAddAccountPageResponse getAddAccountPageResponse = new GetAddAccountPageResponse();
        DEFAULT_INSTANCE = getAddAccountPageResponse;
        AbstractC0269h.registerDefaultInstance(GetAddAccountPageResponse.class, getAddAccountPageResponse);
    }

    private GetAddAccountPageResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002\u0007\u0003ဉ\u0000\u0004ဋ\u0001", new Object[]{"bitField0_", "accounts_", Account.class, "canHaveManagedAccounts_", "uiHints_", "maxManagedAccountSignUpAge_"});
        }
        if (iOrdinal == 3) {
            return new GetAddAccountPageResponse();
        }
        if (iOrdinal == 4) {
            return new ie00(DEFAULT_INSTANCE, 22);
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
        synchronized (GetAddAccountPageResponse.class) {
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
    public final ae50 m2249n() {
        return this.accounts_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m2250o() {
        return this.canHaveManagedAccounts_;
    }

    /* JADX INFO: renamed from: p */
    public final int m2251p() {
        return this.maxManagedAccountSignUpAge_;
    }

    /* JADX INFO: renamed from: q */
    public final UIHints m2252q() {
        UIHints uIHints = this.uiHints_;
        return uIHints == null ? UIHints.m2260n() : uIHints;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m2253r() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
