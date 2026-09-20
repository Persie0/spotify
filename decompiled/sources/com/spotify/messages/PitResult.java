package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.s3o0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class PitResult extends AbstractC0269h implements sre0 {
    public static final int BE_CORRELATION_ID_FIELD_NUMBER = 4;
    private static final PitResult DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    public static final int PACKAGE_NAME_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private int status_;
    private String errorMessage_ = "";
    private String packageName_ = "";
    private String beCorrelationId_ = "";

    static {
        PitResult pitResult = new PitResult();
        DEFAULT_INSTANCE = pitResult;
        AbstractC0269h.registerDefaultInstance(PitResult.class, pitResult);
    }

    private PitResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14338n(PitResult pitResult, String str) {
        pitResult.getClass();
        str.getClass();
        pitResult.bitField0_ |= 8;
        pitResult.beCorrelationId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14339o(PitResult pitResult, String str) {
        pitResult.getClass();
        str.getClass();
        pitResult.bitField0_ |= 2;
        pitResult.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14340p(PitResult pitResult, String str) {
        pitResult.getClass();
        pitResult.bitField0_ |= 4;
        pitResult.packageName_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14341q(PitResult pitResult, int i) {
        pitResult.bitField0_ |= 1;
        pitResult.status_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static s3o0 m14342r() {
        return (s3o0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "status_", "errorMessage_", "packageName_", "beCorrelationId_"});
        }
        if (iOrdinal == 3) {
            return new PitResult();
        }
        if (iOrdinal == 4) {
            return new s3o0(DEFAULT_INSTANCE);
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
        synchronized (PitResult.class) {
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
