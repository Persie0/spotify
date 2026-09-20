package com.spotify.gpb.trackingimpl.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r0b;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CPBillingChoiceLoaded extends AbstractC0269h implements sre0 {
    public static final int AVAILABLE_BILLING_PROVIDERS_FIELD_NUMBER = 2;
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final CPBillingChoiceLoaded DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int SELECTED_BILLING_PROVIDER_FIELD_NUMBER = 3;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private ae50 availableBillingProviders_ = AbstractC0269h.emptyProtobufList();
    private String selectedBillingProvider_ = "";

    static {
        CPBillingChoiceLoaded cPBillingChoiceLoaded = new CPBillingChoiceLoaded();
        DEFAULT_INSTANCE = cPBillingChoiceLoaded;
        AbstractC0269h.registerDefaultInstance(CPBillingChoiceLoaded.class, cPBillingChoiceLoaded);
    }

    private CPBillingChoiceLoaded() {
    }

    /* JADX INFO: renamed from: n */
    public static void m11181n(CPBillingChoiceLoaded cPBillingChoiceLoaded, List list) {
        ae50 ae50Var = cPBillingChoiceLoaded.availableBillingProviders_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            cPBillingChoiceLoaded.availableBillingProviders_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, cPBillingChoiceLoaded.availableBillingProviders_);
    }

    /* JADX INFO: renamed from: o */
    public static void m11182o(CPBillingChoiceLoaded cPBillingChoiceLoaded, String str) {
        cPBillingChoiceLoaded.getClass();
        str.getClass();
        cPBillingChoiceLoaded.bitField0_ |= 1;
        cPBillingChoiceLoaded.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m11183p(CPBillingChoiceLoaded cPBillingChoiceLoaded, String str) {
        cPBillingChoiceLoaded.getClass();
        cPBillingChoiceLoaded.bitField0_ |= 2;
        cPBillingChoiceLoaded.selectedBillingProvider_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static r0b m11184q() {
        return (r0b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"bitField0_", "checkoutSessionId_", "availableBillingProviders_", "selectedBillingProvider_"});
        }
        if (iOrdinal == 3) {
            return new CPBillingChoiceLoaded();
        }
        if (iOrdinal == 4) {
            return new r0b(DEFAULT_INSTANCE);
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
        synchronized (CPBillingChoiceLoaded.class) {
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
