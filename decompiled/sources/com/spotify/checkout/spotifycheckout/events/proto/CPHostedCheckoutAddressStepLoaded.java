package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y0b;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CPHostedCheckoutAddressStepLoaded extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final CPHostedCheckoutAddressStepLoaded DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String checkoutSessionId_ = "";

    static {
        CPHostedCheckoutAddressStepLoaded cPHostedCheckoutAddressStepLoaded = new CPHostedCheckoutAddressStepLoaded();
        DEFAULT_INSTANCE = cPHostedCheckoutAddressStepLoaded;
        AbstractC0269h.registerDefaultInstance(CPHostedCheckoutAddressStepLoaded.class, cPHostedCheckoutAddressStepLoaded);
    }

    private CPHostedCheckoutAddressStepLoaded() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6736n(CPHostedCheckoutAddressStepLoaded cPHostedCheckoutAddressStepLoaded, String str) {
        cPHostedCheckoutAddressStepLoaded.getClass();
        str.getClass();
        cPHostedCheckoutAddressStepLoaded.bitField0_ |= 1;
        cPHostedCheckoutAddressStepLoaded.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static y0b m6737o() {
        return (y0b) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "checkoutSessionId_"});
        }
        if (iOrdinal == 3) {
            return new CPHostedCheckoutAddressStepLoaded();
        }
        if (iOrdinal == 4) {
            return new y0b(DEFAULT_INSTANCE);
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
        synchronized (CPHostedCheckoutAddressStepLoaded.class) {
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
