package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.e1b;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CPHostedCheckoutCountryChanged extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int COUNTRY_FIELD_NUMBER = 2;
    public static final int CURRENT_COUNTRY_FIELD_NUMBER = 3;
    private static final CPHostedCheckoutCountryChanged DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private String country_ = "";
    private String currentCountry_ = "";

    static {
        CPHostedCheckoutCountryChanged cPHostedCheckoutCountryChanged = new CPHostedCheckoutCountryChanged();
        DEFAULT_INSTANCE = cPHostedCheckoutCountryChanged;
        AbstractC0269h.registerDefaultInstance(CPHostedCheckoutCountryChanged.class, cPHostedCheckoutCountryChanged);
    }

    private CPHostedCheckoutCountryChanged() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6746n(CPHostedCheckoutCountryChanged cPHostedCheckoutCountryChanged, String str) {
        cPHostedCheckoutCountryChanged.getClass();
        str.getClass();
        cPHostedCheckoutCountryChanged.bitField0_ |= 1;
        cPHostedCheckoutCountryChanged.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6747o(CPHostedCheckoutCountryChanged cPHostedCheckoutCountryChanged, String str) {
        cPHostedCheckoutCountryChanged.getClass();
        str.getClass();
        cPHostedCheckoutCountryChanged.bitField0_ |= 2;
        cPHostedCheckoutCountryChanged.country_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m6748p(CPHostedCheckoutCountryChanged cPHostedCheckoutCountryChanged, String str) {
        cPHostedCheckoutCountryChanged.getClass();
        str.getClass();
        cPHostedCheckoutCountryChanged.bitField0_ |= 4;
        cPHostedCheckoutCountryChanged.currentCountry_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static e1b m6749q() {
        return (e1b) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "checkoutSessionId_", "country_", "currentCountry_"});
        }
        if (iOrdinal == 3) {
            return new CPHostedCheckoutCountryChanged();
        }
        if (iOrdinal == 4) {
            return new e1b(DEFAULT_INSTANCE);
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
        synchronized (CPHostedCheckoutCountryChanged.class) {
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
