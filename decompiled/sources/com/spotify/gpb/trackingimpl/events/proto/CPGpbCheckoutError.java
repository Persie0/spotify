package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.v0b;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CPGpbCheckoutError extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    public static final int CONTEXT_ID_FIELD_NUMBER = 2;
    private static final CPGpbCheckoutError DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String context_ = "";
    private String contextId_ = "";
    private String error_ = "";

    static {
        CPGpbCheckoutError cPGpbCheckoutError = new CPGpbCheckoutError();
        DEFAULT_INSTANCE = cPGpbCheckoutError;
        AbstractC0269h.registerDefaultInstance(CPGpbCheckoutError.class, cPGpbCheckoutError);
    }

    private CPGpbCheckoutError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11197n(CPGpbCheckoutError cPGpbCheckoutError, String str) {
        cPGpbCheckoutError.getClass();
        str.getClass();
        cPGpbCheckoutError.bitField0_ |= 1;
        cPGpbCheckoutError.context_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11198o(CPGpbCheckoutError cPGpbCheckoutError, String str) {
        cPGpbCheckoutError.getClass();
        str.getClass();
        cPGpbCheckoutError.bitField0_ |= 2;
        cPGpbCheckoutError.contextId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m11199p(CPGpbCheckoutError cPGpbCheckoutError, String str) {
        cPGpbCheckoutError.getClass();
        str.getClass();
        cPGpbCheckoutError.bitField0_ |= 4;
        cPGpbCheckoutError.error_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static v0b m11200q() {
        return (v0b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "context_", "contextId_", "error_"});
        }
        if (iOrdinal == 3) {
            return new CPGpbCheckoutError();
        }
        if (iOrdinal == 4) {
            return new v0b(DEFAULT_INSTANCE);
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
        synchronized (CPGpbCheckoutError.class) {
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
