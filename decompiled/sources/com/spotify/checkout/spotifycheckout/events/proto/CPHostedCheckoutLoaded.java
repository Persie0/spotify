package com.spotify.checkout.spotifycheckout.events.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.i1b;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CPHostedCheckoutLoaded extends AbstractC0269h implements sre0 {
    public static final int CHECKOUT_SESSION_ID_FIELD_NUMBER = 1;
    public static final int CLIENT_TIMEZONE_FIELD_NUMBER = 2;
    private static final CPHostedCheckoutLoaded DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int THEME_FIELD_NUMBER = 3;
    public static final int VIEWPORT_HEIGHT_FIELD_NUMBER = 5;
    public static final int VIEWPORT_WIDTH_FIELD_NUMBER = 4;
    private int bitField0_;
    private String checkoutSessionId_ = "";
    private String clientTimezone_ = "";
    private String theme_ = "";
    private int viewportHeight_;
    private int viewportWidth_;

    static {
        CPHostedCheckoutLoaded cPHostedCheckoutLoaded = new CPHostedCheckoutLoaded();
        DEFAULT_INSTANCE = cPHostedCheckoutLoaded;
        AbstractC0269h.registerDefaultInstance(CPHostedCheckoutLoaded.class, cPHostedCheckoutLoaded);
    }

    private CPHostedCheckoutLoaded() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6758n(CPHostedCheckoutLoaded cPHostedCheckoutLoaded, String str) {
        cPHostedCheckoutLoaded.getClass();
        str.getClass();
        cPHostedCheckoutLoaded.bitField0_ |= 1;
        cPHostedCheckoutLoaded.checkoutSessionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6759o(CPHostedCheckoutLoaded cPHostedCheckoutLoaded, String str) {
        cPHostedCheckoutLoaded.getClass();
        str.getClass();
        cPHostedCheckoutLoaded.bitField0_ |= 2;
        cPHostedCheckoutLoaded.clientTimezone_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static i1b m6760p() {
        return (i1b) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"bitField0_", "checkoutSessionId_", "clientTimezone_", "theme_", "viewportWidth_", "viewportHeight_"});
        }
        if (iOrdinal == 3) {
            return new CPHostedCheckoutLoaded();
        }
        if (iOrdinal == 4) {
            return new i1b(DEFAULT_INSTANCE);
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
        synchronized (CPHostedCheckoutLoaded.class) {
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
