package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.gje;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class ClientAuthEventFailureNonAuth extends AbstractC0269h implements sre0 {
    public static final int AUTH_ID_FIELD_NUMBER = 3;
    private static final ClientAuthEventFailureNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER = 2;
    public static final int ERROR_REASON_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private long errorCode_;
    private String errorReason_ = "";
    private String authId_ = "";

    static {
        ClientAuthEventFailureNonAuth clientAuthEventFailureNonAuth = new ClientAuthEventFailureNonAuth();
        DEFAULT_INSTANCE = clientAuthEventFailureNonAuth;
        AbstractC0269h.registerDefaultInstance(ClientAuthEventFailureNonAuth.class, clientAuthEventFailureNonAuth);
    }

    private ClientAuthEventFailureNonAuth() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13722n(ClientAuthEventFailureNonAuth clientAuthEventFailureNonAuth, String str) {
        clientAuthEventFailureNonAuth.getClass();
        clientAuthEventFailureNonAuth.bitField0_ |= 4;
        clientAuthEventFailureNonAuth.authId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13723o(ClientAuthEventFailureNonAuth clientAuthEventFailureNonAuth) {
        clientAuthEventFailureNonAuth.bitField0_ |= 2;
        clientAuthEventFailureNonAuth.errorCode_ = 0L;
    }

    /* JADX INFO: renamed from: p */
    public static void m13724p(ClientAuthEventFailureNonAuth clientAuthEventFailureNonAuth, String str) {
        clientAuthEventFailureNonAuth.getClass();
        str.getClass();
        clientAuthEventFailureNonAuth.bitField0_ |= 1;
        clientAuthEventFailureNonAuth.errorReason_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static gje m13725q() {
        return (gje) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "errorReason_", "errorCode_", "authId_"});
        }
        if (iOrdinal == 3) {
            return new ClientAuthEventFailureNonAuth();
        }
        if (iOrdinal == 4) {
            return new gje(DEFAULT_INSTANCE);
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
        synchronized (ClientAuthEventFailureNonAuth.class) {
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
