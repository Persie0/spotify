package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.p0b;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CPBillingChoiceConfirmed extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final CPBillingChoiceConfirmed DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SELECTED_BILLING_PROVIDER_FIELD_NUMBER = 2;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private String selectedBillingProvider_ = "";

    static {
        CPBillingChoiceConfirmed cPBillingChoiceConfirmed = new CPBillingChoiceConfirmed();
        DEFAULT_INSTANCE = cPBillingChoiceConfirmed;
        AbstractC0269h.registerDefaultInstance(CPBillingChoiceConfirmed.class, cPBillingChoiceConfirmed);
    }

    private CPBillingChoiceConfirmed() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11175n(CPBillingChoiceConfirmed cPBillingChoiceConfirmed, String str) {
        cPBillingChoiceConfirmed.getClass();
        str.getClass();
        cPBillingChoiceConfirmed.bitField0_ |= 1;
        cPBillingChoiceConfirmed.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m11176o(CPBillingChoiceConfirmed cPBillingChoiceConfirmed, String str) {
        cPBillingChoiceConfirmed.getClass();
        str.getClass();
        cPBillingChoiceConfirmed.bitField0_ |= 2;
        cPBillingChoiceConfirmed.selectedBillingProvider_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static p0b m11177p() {
        return (p0b) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "checkoutSessionId_", "selectedBillingProvider_"});
        }
        if (iOrdinal == 3) {
            return new CPBillingChoiceConfirmed();
        }
        if (iOrdinal == 4) {
            return new p0b(DEFAULT_INSTANCE);
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
        synchronized (CPBillingChoiceConfirmed.class) {
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
