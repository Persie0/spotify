package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.C1992iv;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes18.dex */
public final class AccountSwitchingAccountSwitched extends AbstractC0269h implements sre0 {
    private static final AccountSwitchingAccountSwitched DEFAULT_INSTANCE;
    public static final int DESTINATION_ACCOUNT_TYPE_FIELD_NUMBER = 2;
    public static final int DEVICE_ID_FIELD_NUMBER = 4;
    public static final int DEVICE_TYPE_FIELD_NUMBER = 5;
    public static final int INTERACTION_ID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int SOURCE_ACCOUNT_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private String sourceAccountType_ = "";
    private String destinationAccountType_ = "";
    private String interactionId_ = "";
    private String deviceId_ = "";
    private String deviceType_ = "";

    static {
        AccountSwitchingAccountSwitched accountSwitchingAccountSwitched = new AccountSwitchingAccountSwitched();
        DEFAULT_INSTANCE = accountSwitchingAccountSwitched;
        AbstractC0269h.registerDefaultInstance(AccountSwitchingAccountSwitched.class, accountSwitchingAccountSwitched);
    }

    private AccountSwitchingAccountSwitched() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13491n(AccountSwitchingAccountSwitched accountSwitchingAccountSwitched, String str) {
        accountSwitchingAccountSwitched.getClass();
        accountSwitchingAccountSwitched.bitField0_ |= 2;
        accountSwitchingAccountSwitched.destinationAccountType_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13492o(AccountSwitchingAccountSwitched accountSwitchingAccountSwitched, String str) {
        accountSwitchingAccountSwitched.getClass();
        str.getClass();
        accountSwitchingAccountSwitched.bitField0_ |= 8;
        accountSwitchingAccountSwitched.deviceId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m13493p(AccountSwitchingAccountSwitched accountSwitchingAccountSwitched, String str) {
        accountSwitchingAccountSwitched.getClass();
        accountSwitchingAccountSwitched.bitField0_ |= 16;
        accountSwitchingAccountSwitched.deviceType_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m13494q(AccountSwitchingAccountSwitched accountSwitchingAccountSwitched, String str) {
        accountSwitchingAccountSwitched.getClass();
        str.getClass();
        accountSwitchingAccountSwitched.bitField0_ |= 4;
        accountSwitchingAccountSwitched.interactionId_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m13495r(AccountSwitchingAccountSwitched accountSwitchingAccountSwitched, String str) {
        accountSwitchingAccountSwitched.getClass();
        accountSwitchingAccountSwitched.bitField0_ |= 1;
        accountSwitchingAccountSwitched.sourceAccountType_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static C1992iv m13496s() {
        return (C1992iv) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "sourceAccountType_", "destinationAccountType_", "interactionId_", "deviceId_", "deviceType_"});
        }
        if (iOrdinal == 3) {
            return new AccountSwitchingAccountSwitched();
        }
        if (iOrdinal == 4) {
            return new C1992iv(DEFAULT_INSTANCE);
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
        synchronized (AccountSwitchingAccountSwitched.class) {
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
