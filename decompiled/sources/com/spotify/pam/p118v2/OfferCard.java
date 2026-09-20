package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class OfferCard extends AbstractC0269h implements sre0 {
    public static final int BUTTON_TEXT_FIELD_NUMBER = 6;
    public static final int BUTTON_URI_FIELD_NUMBER = 7;
    public static final int COLOR_FIELD_NUMBER = 2;
    private static final OfferCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int ITEM_DISCLAIMER_FIELD_NUMBER = 5;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 3;
    private String name_ = "";
    private String color_ = "";
    private String price_ = "";
    private String description_ = "";
    private String itemDisclaimer_ = "";
    private String buttonText_ = "";
    private String buttonUri_ = "";

    static {
        OfferCard offerCard = new OfferCard();
        DEFAULT_INSTANCE = offerCard;
        AbstractC0269h.registerDefaultInstance(OfferCard.class, offerCard);
    }

    private OfferCard() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static OfferCard m16540q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"name_", "color_", "price_", "description_", "itemDisclaimer_", "buttonText_", "buttonUri_"});
        }
        if (iOrdinal == 3) {
            return new OfferCard();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 14);
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
        synchronized (OfferCard.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getName() {
        return this.name_;
    }

    /* JADX INFO: renamed from: n */
    public final String m16541n() {
        return this.buttonText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16542o() {
        return this.buttonUri_;
    }

    /* JADX INFO: renamed from: p */
    public final String m16543p() {
        return this.color_;
    }

    /* JADX INFO: renamed from: r */
    public final String m16544r() {
        return this.itemDisclaimer_;
    }

    /* JADX INFO: renamed from: s */
    public final String m16545s() {
        return this.price_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
