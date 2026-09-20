package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class OfferAction extends AbstractC0269h implements sre0 {
    public static final int DEFAULT_ACTION_FIELD_NUMBER = 1;
    private static final OfferAction DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER;
    private int actionCase_ = 0;
    private Object action_;

    static {
        OfferAction offerAction = new OfferAction();
        DEFAULT_INSTANCE = offerAction;
        AbstractC0269h.registerDefaultInstance(OfferAction.class, offerAction);
    }

    private OfferAction() {
    }

    /* JADX INFO: renamed from: p */
    public static OfferAction m7065p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"action_", "actionCase_", PurchaseAction.class});
        }
        if (iOrdinal == 3) {
            return new OfferAction();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 13);
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
        synchronized (OfferAction.class) {
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
    public final int m7066n() {
        int i = this.actionCase_;
        if (i != 0) {
            return i != 1 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PurchaseAction m7067o() {
        return this.actionCase_ == 1 ? (PurchaseAction) this.action_ : PurchaseAction.m7103p();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
