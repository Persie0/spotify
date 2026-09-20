package com.spotify.integrity.integrityimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.wdb1;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class VerifyRequest extends AbstractC0269h implements sre0 {
    public static final int CORRELATION_ID_FIELD_NUMBER = 2;
    private static final VerifyRequest DEFAULT_INSTANCE;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TOKEN_FIELD_NUMBER = 1;
    private String token_ = "";
    private String correlationId_ = "";
    private String packageName_ = "";

    static {
        VerifyRequest verifyRequest = new VerifyRequest();
        DEFAULT_INSTANCE = verifyRequest;
        AbstractC0269h.registerDefaultInstance(VerifyRequest.class, verifyRequest);
    }

    private VerifyRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m12022n(VerifyRequest verifyRequest, String str) {
        verifyRequest.getClass();
        str.getClass();
        verifyRequest.correlationId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m12023o(VerifyRequest verifyRequest, String str) {
        verifyRequest.getClass();
        verifyRequest.packageName_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m12024p(VerifyRequest verifyRequest, String str) {
        verifyRequest.getClass();
        str.getClass();
        verifyRequest.token_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static wdb1 m12025q() {
        return (wdb1) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"token_", "correlationId_", "packageName_"});
        }
        if (iOrdinal == 3) {
            return new VerifyRequest();
        }
        if (iOrdinal == 4) {
            return new wdb1(DEFAULT_INSTANCE);
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
        synchronized (VerifyRequest.class) {
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
