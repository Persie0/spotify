package com.spotify.libs.connect.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gta0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class Login5PermanentErrorNonAuth extends AbstractC0269h implements sre0 {
    private static final Login5PermanentErrorNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 1;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    public static final int FROM_CORE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private int errorCode_;
    private String errorMessage_ = "";
    private boolean fromCore_;

    static {
        Login5PermanentErrorNonAuth login5PermanentErrorNonAuth = new Login5PermanentErrorNonAuth();
        DEFAULT_INSTANCE = login5PermanentErrorNonAuth;
        AbstractC0269h.registerDefaultInstance(Login5PermanentErrorNonAuth.class, login5PermanentErrorNonAuth);
    }

    private Login5PermanentErrorNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12751n(Login5PermanentErrorNonAuth login5PermanentErrorNonAuth, int i) {
        login5PermanentErrorNonAuth.bitField0_ |= 1;
        login5PermanentErrorNonAuth.errorCode_ = i;
    }

    /* JADX INFO: renamed from: o */
    public static void m12752o(Login5PermanentErrorNonAuth login5PermanentErrorNonAuth, String str) {
        login5PermanentErrorNonAuth.getClass();
        str.getClass();
        login5PermanentErrorNonAuth.bitField0_ |= 2;
        login5PermanentErrorNonAuth.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static gta0 m12753p() {
        return (gta0) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "errorCode_", "errorMessage_", "fromCore_"});
        }
        if (iOrdinal == 3) {
            return new Login5PermanentErrorNonAuth();
        }
        if (iOrdinal == 4) {
            return new gta0(DEFAULT_INSTANCE);
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
        synchronized (Login5PermanentErrorNonAuth.class) {
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
