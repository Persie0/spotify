package com.spotify.kidsaccount.api.p084v3.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class CardParentalVerification extends AbstractC0269h implements sre0 {
    private static final CardParentalVerification DEFAULT_INSTANCE;
    public static final int HOLD_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private CardAuthorizationHold hold_;
    private String url_ = "";

    static {
        CardParentalVerification cardParentalVerification = new CardParentalVerification();
        DEFAULT_INSTANCE = cardParentalVerification;
        AbstractC0269h.registerDefaultInstance(CardParentalVerification.class, cardParentalVerification);
    }

    private CardParentalVerification() {
    }

    /* JADX INFO: renamed from: n */
    public static CardParentalVerification m12122n() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "url_", "hold_"});
        }
        if (iOrdinal == 3) {
            return new CardParentalVerification();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 16);
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
        synchronized (CardParentalVerification.class) {
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

    public final String getUrl() {
        return this.url_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CardAuthorizationHold m12123o() {
        CardAuthorizationHold cardAuthorizationHold = this.hold_;
        return cardAuthorizationHold == null ? CardAuthorizationHold.m12119p() : cardAuthorizationHold;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m12124p() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
