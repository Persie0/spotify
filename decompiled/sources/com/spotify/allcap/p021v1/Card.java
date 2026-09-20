package com.spotify.allcap.p021v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.gjb;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class Card extends AbstractC0269h implements sre0 {
    public static final int BUTTON_CTAS_FIELD_NUMBER = 7;
    public static final int CONSUMPTION_INDICATOR_FIELD_NUMBER = 3;
    private static final Card DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 2;
    public static final int FOOTER_FIELD_NUMBER = 6;
    public static final int NAVIGATION_CTAS_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int REMAINING_TIME_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private ConsumptionIndicator consumptionIndicator_;
    private String title_ = "";
    private String description_ = "";
    private String remainingTime_ = "";
    private ae50 navigationCtas_ = AbstractC0269h.emptyProtobufList();
    private String footer_ = "";
    private ae50 buttonCtas_ = AbstractC0269h.emptyProtobufList();

    static {
        Card card = new Card();
        DEFAULT_INSTANCE = card;
        AbstractC0269h.registerDefaultInstance(Card.class, card);
    }

    private Card() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ለ\u0003\u0005\u001b\u0006ለ\u0004\u0007\u001b", new Object[]{"bitField0_", "title_", "description_", "consumptionIndicator_", "remainingTime_", "navigationCtas_", Cta.class, "footer_", "buttonCtas_", Cta.class});
        }
        if (iOrdinal == 3) {
            return new Card();
        }
        if (iOrdinal == 4) {
            return new gjb(DEFAULT_INSTANCE, 9);
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
        synchronized (Card.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final ae50 m3225n() {
        return this.buttonCtas_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ConsumptionIndicator m3226o() {
        ConsumptionIndicator consumptionIndicator = this.consumptionIndicator_;
        return consumptionIndicator == null ? ConsumptionIndicator.m3231n() : consumptionIndicator;
    }

    /* JADX INFO: renamed from: p */
    public final String m3227p() {
        return this.footer_;
    }

    /* JADX INFO: renamed from: q */
    public final ae50 m3228q() {
        return this.navigationCtas_;
    }

    /* JADX INFO: renamed from: r */
    public final String m3229r() {
        return this.remainingTime_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m3230s() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
