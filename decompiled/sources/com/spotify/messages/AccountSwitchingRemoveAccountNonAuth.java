package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.C2472uv;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes18.dex */
public final class AccountSwitchingRemoveAccountNonAuth extends AbstractC0269h implements sre0 {
    private static final AccountSwitchingRemoveAccountNonAuth DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 2;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REMOVED_ACCOUNT_TYPE_FIELD_NUMBER = 1;
    public static final int STORED_ACCOUNTS_SIZE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int storedAccountsSize_;
    private String removedAccountType_ = "";
    private String deviceId_ = "";
    private String deviceType_ = "";

    static {
        AccountSwitchingRemoveAccountNonAuth accountSwitchingRemoveAccountNonAuth = new AccountSwitchingRemoveAccountNonAuth();
        DEFAULT_INSTANCE = accountSwitchingRemoveAccountNonAuth;
        AbstractC0269h.registerDefaultInstance(AccountSwitchingRemoveAccountNonAuth.class, accountSwitchingRemoveAccountNonAuth);
    }

    private AccountSwitchingRemoveAccountNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13504n(AccountSwitchingRemoveAccountNonAuth accountSwitchingRemoveAccountNonAuth, String str) {
        accountSwitchingRemoveAccountNonAuth.getClass();
        str.getClass();
        accountSwitchingRemoveAccountNonAuth.bitField0_ |= 2;
        accountSwitchingRemoveAccountNonAuth.deviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13505o(AccountSwitchingRemoveAccountNonAuth accountSwitchingRemoveAccountNonAuth, String str) {
        accountSwitchingRemoveAccountNonAuth.getClass();
        accountSwitchingRemoveAccountNonAuth.bitField0_ |= 4;
        accountSwitchingRemoveAccountNonAuth.deviceType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13506p(AccountSwitchingRemoveAccountNonAuth accountSwitchingRemoveAccountNonAuth, String str) {
        accountSwitchingRemoveAccountNonAuth.getClass();
        accountSwitchingRemoveAccountNonAuth.bitField0_ |= 1;
        accountSwitchingRemoveAccountNonAuth.removedAccountType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13507q(AccountSwitchingRemoveAccountNonAuth accountSwitchingRemoveAccountNonAuth, int i) {
        accountSwitchingRemoveAccountNonAuth.bitField0_ |= 8;
        accountSwitchingRemoveAccountNonAuth.storedAccountsSize_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static C2472uv m13508r() {
        return (C2472uv) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003", new Object[]{"bitField0_", "removedAccountType_", "deviceId_", "deviceType_", "storedAccountsSize_"});
        }
        if (iOrdinal == 3) {
            return new AccountSwitchingRemoveAccountNonAuth();
        }
        if (iOrdinal == 4) {
            return new C2472uv(DEFAULT_INSTANCE);
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
        synchronized (AccountSwitchingRemoveAccountNonAuth.class) {
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
