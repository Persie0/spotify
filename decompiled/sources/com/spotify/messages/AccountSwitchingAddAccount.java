package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.C2029jv;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes18.dex */
public final class AccountSwitchingAddAccount extends AbstractC0269h implements sre0 {
    public static final int ACCOUNT_AUTO_ADDED_FIELD_NUMBER = 6;
    public static final int ADDED_ACCOUNT_TYPE_FIELD_NUMBER = 1;
    private static final AccountSwitchingAddAccount DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 3;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 4;
    public static final int INTERACTION_ID_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STORED_ACCOUNTS_SIZE_FIELD_NUMBER = 5;
    private boolean accountAutoAdded_;
    private int bitField0_;
    private int storedAccountsSize_;
    private String addedAccountType_ = "";
    private String interactionId_ = "";
    private String deviceId_ = "";
    private String deviceType_ = "";

    static {
        AccountSwitchingAddAccount accountSwitchingAddAccount = new AccountSwitchingAddAccount();
        DEFAULT_INSTANCE = accountSwitchingAddAccount;
        AbstractC0269h.registerDefaultInstance(AccountSwitchingAddAccount.class, accountSwitchingAddAccount);
    }

    private AccountSwitchingAddAccount() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13497n(AccountSwitchingAddAccount accountSwitchingAddAccount, boolean z) {
        accountSwitchingAddAccount.bitField0_ |= 32;
        accountSwitchingAddAccount.accountAutoAdded_ = z;
    }

    /* JADX INFO: renamed from: o */
    public static void m13498o(AccountSwitchingAddAccount accountSwitchingAddAccount, String str) {
        accountSwitchingAddAccount.getClass();
        accountSwitchingAddAccount.bitField0_ |= 1;
        accountSwitchingAddAccount.addedAccountType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13499p(AccountSwitchingAddAccount accountSwitchingAddAccount, String str) {
        accountSwitchingAddAccount.getClass();
        str.getClass();
        accountSwitchingAddAccount.bitField0_ |= 4;
        accountSwitchingAddAccount.deviceId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13500q(AccountSwitchingAddAccount accountSwitchingAddAccount, String str) {
        accountSwitchingAddAccount.getClass();
        accountSwitchingAddAccount.bitField0_ |= 8;
        accountSwitchingAddAccount.deviceType_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13501r(AccountSwitchingAddAccount accountSwitchingAddAccount, String str) {
        accountSwitchingAddAccount.getClass();
        str.getClass();
        accountSwitchingAddAccount.bitField0_ |= 2;
        accountSwitchingAddAccount.interactionId_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m13502s(AccountSwitchingAddAccount accountSwitchingAddAccount, int i) {
        accountSwitchingAddAccount.bitField0_ |= 16;
        accountSwitchingAddAccount.storedAccountsSize_ = i;
    }

    /* JADX INFO: renamed from: t */
    public static C2029jv m13503t() {
        return (C2029jv) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဇ\u0005", new Object[]{"bitField0_", "addedAccountType_", "interactionId_", "deviceId_", "deviceType_", "storedAccountsSize_", "accountAutoAdded_"});
        }
        if (iOrdinal == 3) {
            return new AccountSwitchingAddAccount();
        }
        if (iOrdinal == 4) {
            return new C2029jv(DEFAULT_INSTANCE);
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
        synchronized (AccountSwitchingAddAccount.class) {
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
