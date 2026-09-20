package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z0b;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CPHostedCheckoutBackButtonClicked extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    private static final CPHostedCheckoutBackButtonClicked DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String checkoutSessionId_ = "";

    static {
        CPHostedCheckoutBackButtonClicked cPHostedCheckoutBackButtonClicked = new CPHostedCheckoutBackButtonClicked();
        DEFAULT_INSTANCE = cPHostedCheckoutBackButtonClicked;
        AbstractC0269h.registerDefaultInstance(CPHostedCheckoutBackButtonClicked.class, cPHostedCheckoutBackButtonClicked);
    }

    private CPHostedCheckoutBackButtonClicked() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6738n(CPHostedCheckoutBackButtonClicked cPHostedCheckoutBackButtonClicked, String str) {
        cPHostedCheckoutBackButtonClicked.getClass();
        str.getClass();
        cPHostedCheckoutBackButtonClicked.bitField0_ |= 1;
        cPHostedCheckoutBackButtonClicked.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static z0b m6739o() {
        return (z0b) DEFAULT_INSTANCE.createBuilder();
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
            return new CPHostedCheckoutBackButtonClicked();
        }
        if (iOrdinal == 4) {
            return new z0b(DEFAULT_INSTANCE);
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
        synchronized (CPHostedCheckoutBackButtonClicked.class) {
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
