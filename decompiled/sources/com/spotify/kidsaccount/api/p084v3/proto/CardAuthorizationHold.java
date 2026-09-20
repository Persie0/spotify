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
public final class CardAuthorizationHold extends AbstractC0269h implements sre0 {
    public static final int AMOUNT_MINOR_FIELD_NUMBER = 1;
    public static final int CURRENCY_CODE_FIELD_NUMBER = 2;
    private static final CardAuthorizationHold DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int amountMinor_;
    private String currencyCode_ = "";

    static {
        CardAuthorizationHold cardAuthorizationHold = new CardAuthorizationHold();
        DEFAULT_INSTANCE = cardAuthorizationHold;
        AbstractC0269h.registerDefaultInstance(CardAuthorizationHold.class, cardAuthorizationHold);
    }

    private CardAuthorizationHold() {
    }

    /* JADX INFO: renamed from: p */
    public static CardAuthorizationHold m12119p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002Ȉ", new Object[]{"amountMinor_", "currencyCode_"});
        }
        if (iOrdinal == 3) {
            return new CardAuthorizationHold();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 10);
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
        synchronized (CardAuthorizationHold.class) {
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

    /* JADX INFO: renamed from: n */
    public final int m12120n() {
        return this.amountMinor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m12121o() {
        return this.currencyCode_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
