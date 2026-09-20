package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q0b;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CPBillingChoiceError extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final CPBillingChoiceError DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private String error_ = "";

    static {
        CPBillingChoiceError cPBillingChoiceError = new CPBillingChoiceError();
        DEFAULT_INSTANCE = cPBillingChoiceError;
        AbstractC0269h.registerDefaultInstance(CPBillingChoiceError.class, cPBillingChoiceError);
    }

    private CPBillingChoiceError() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11178n(CPBillingChoiceError cPBillingChoiceError, String str) {
        cPBillingChoiceError.getClass();
        str.getClass();
        cPBillingChoiceError.bitField0_ |= 1;
        cPBillingChoiceError.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11179o(CPBillingChoiceError cPBillingChoiceError, String str) {
        cPBillingChoiceError.getClass();
        str.getClass();
        cPBillingChoiceError.bitField0_ |= 2;
        cPBillingChoiceError.error_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static q0b m11180p() {
        return (q0b) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "checkoutSessionId_", "error_"});
        }
        if (iOrdinal == 3) {
            return new CPBillingChoiceError();
        }
        if (iOrdinal == 4) {
            return new q0b(DEFAULT_INSTANCE);
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
        synchronized (CPBillingChoiceError.class) {
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
