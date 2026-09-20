package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.dtk0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class OfferCardBenefitItem extends AbstractC0269h implements sre0 {
    private static final OfferCardBenefitItem DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATE_FIELD_NUMBER = 4;
    public static final int TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";
    private String icon_ = "";
    private String textColor_ = "";
    private String state_ = "";

    static {
        OfferCardBenefitItem offerCardBenefitItem = new OfferCardBenefitItem();
        DEFAULT_INSTANCE = offerCardBenefitItem;
        AbstractC0269h.registerDefaultInstance(OfferCardBenefitItem.class, offerCardBenefitItem);
    }

    private OfferCardBenefitItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19582n(OfferCardBenefitItem offerCardBenefitItem, String str) {
        offerCardBenefitItem.getClass();
        offerCardBenefitItem.bitField0_ |= 2;
        offerCardBenefitItem.icon_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19583o(OfferCardBenefitItem offerCardBenefitItem, String str) {
        offerCardBenefitItem.getClass();
        offerCardBenefitItem.bitField0_ |= 8;
        offerCardBenefitItem.state_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19584p(OfferCardBenefitItem offerCardBenefitItem, String str) {
        offerCardBenefitItem.getClass();
        str.getClass();
        offerCardBenefitItem.bitField0_ |= 1;
        offerCardBenefitItem.text_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: u */
    public static dtk0 m19585u() {
        return (dtk0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "text_", "icon_", "textColor_", "state_"});
        }
        if (iOrdinal == 3) {
            return new OfferCardBenefitItem();
        }
        if (iOrdinal == 4) {
            return new dtk0(DEFAULT_INSTANCE);
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
        synchronized (OfferCardBenefitItem.class) {
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

    /* JADX INFO: renamed from: q */
    public final String m19586q() {
        return this.icon_;
    }

    /* JADX INFO: renamed from: r */
    public final String m19587r() {
        return this.state_;
    }

    /* JADX INFO: renamed from: s */
    public final String m19588s() {
        return this.text_;
    }

    /* JADX INFO: renamed from: t */
    public final String m19589t() {
        return this.textColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
