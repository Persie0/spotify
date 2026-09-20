package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class BenefitsCard extends AbstractC0269h implements sre0 {
    public static final int BENEFITS_HUB_FIELD_NUMBER = 2;
    public static final int BENEFITS_LIST_FIELD_NUMBER = 1;
    public static final int CTA_FIELD_NUMBER = 3;
    private static final BenefitsCard DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private int bitField0_;
    private Object content_;
    private int contentCase_ = 0;
    private ae50 cta_ = AbstractC0269h.emptyProtobufList();
    private String ubiId_ = "";

    static {
        BenefitsCard benefitsCard = new BenefitsCard();
        DEFAULT_INSTANCE = benefitsCard;
        AbstractC0269h.registerDefaultInstance(BenefitsCard.class, benefitsCard);
    }

    private BenefitsCard() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static BenefitsCard m21707r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0001\u0001d\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003\u001bdለ\u0000", new Object[]{"content_", "contentCase_", "bitField0_", BenefitsList.class, BenefitsHub.class, "cta_", Cta.class, "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new BenefitsCard();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 27);
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
        synchronized (BenefitsCard.class) {
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
    public final BenefitsHub m21708n() {
        return this.contentCase_ == 2 ? (BenefitsHub) this.content_ : BenefitsHub.m21713n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final BenefitsList m21709o() {
        return this.contentCase_ == 1 ? (BenefitsList) this.content_ : BenefitsList.m21715n();
    }

    /* JADX INFO: renamed from: p */
    public final int m21710p() {
        int i = this.contentCase_;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m21711q() {
        return this.cta_;
    }

    /* JADX INFO: renamed from: s */
    public final String m21712s() {
        return this.ubiId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
