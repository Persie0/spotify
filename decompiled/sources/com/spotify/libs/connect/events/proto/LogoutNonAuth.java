package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r1b0;
import p204p.r2n0;
import p204p.s1b0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class LogoutNonAuth extends AbstractC0269h implements sre0 {
    public static final int DATA_FIELD_NUMBER = 5;
    private static final LogoutNonAuth DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 6;
    public static final int LOGOUT_REASON_FIELD_NUMBER = 2;
    public static final int OFFLINE_USER_REMOVED_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PROTOCOL_VERSION_FIELD_NUMBER = 1;
    public static final int STORED_CREDENTIALS_REMOVED_FIELD_NUMBER = 3;
    private int bitField0_;
    private boolean offlineUserRemoved_;
    private boolean storedCredentialsRemoved_;
    private ihc0 data_ = ihc0.f102235b;
    private String protocolVersion_ = "";
    private String logoutReason_ = "";
    private String deviceId_ = "";

    static {
        LogoutNonAuth logoutNonAuth = new LogoutNonAuth();
        DEFAULT_INSTANCE = logoutNonAuth;
        AbstractC0269h.registerDefaultInstance(LogoutNonAuth.class, logoutNonAuth);
    }

    private LogoutNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12755n(LogoutNonAuth logoutNonAuth, String str) {
        logoutNonAuth.getClass();
        logoutNonAuth.bitField0_ |= 16;
        logoutNonAuth.deviceId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12756o(LogoutNonAuth logoutNonAuth, String str) {
        logoutNonAuth.getClass();
        str.getClass();
        logoutNonAuth.bitField0_ |= 2;
        logoutNonAuth.logoutReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12757p(LogoutNonAuth logoutNonAuth) {
        logoutNonAuth.bitField0_ |= 8;
        logoutNonAuth.offlineUserRemoved_ = true;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m12758q(LogoutNonAuth logoutNonAuth) {
        logoutNonAuth.getClass();
        logoutNonAuth.bitField0_ |= 1;
        logoutNonAuth.protocolVersion_ = "v2";
    }

    /* JADX INFO: renamed from: r */
    public static void m12759r(LogoutNonAuth logoutNonAuth) {
        logoutNonAuth.bitField0_ |= 4;
        logoutNonAuth.storedCredentialsRemoved_ = true;
    }

    /* JADX INFO: renamed from: s */
    public static r1b0 m12760s() {
        return (r1b0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u00052\u0006ဈ\u0004", new Object[]{"bitField0_", "protocolVersion_", "logoutReason_", "storedCredentialsRemoved_", "offlineUserRemoved_", "data_", s1b0.f204654a, "deviceId_"});
        }
        if (iOrdinal == 3) {
            return new LogoutNonAuth();
        }
        if (iOrdinal == 4) {
            return new r1b0(DEFAULT_INSTANCE);
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
        synchronized (LogoutNonAuth.class) {
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
