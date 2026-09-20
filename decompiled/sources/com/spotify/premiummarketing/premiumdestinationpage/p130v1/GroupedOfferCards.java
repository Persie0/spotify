package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r920;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GroupedOfferCards extends AbstractC0269h implements sre0 {
    public static final int COLLAPSED_TEXT_FIELD_NUMBER = 1;
    private static final GroupedOfferCards DEFAULT_INSTANCE;
    public static final int EXPANDED_TEXT_FIELD_NUMBER = 2;
    public static final int LOGGING_INFO_FIELD_NUMBER = 4;
    public static final int OFFER_CARDS_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private String collapsedText_ = "";
    private String expandedText_ = "";
    private ae50 offerCards_ = AbstractC0269h.emptyProtobufList();

    static {
        GroupedOfferCards groupedOfferCards = new GroupedOfferCards();
        DEFAULT_INSTANCE = groupedOfferCards;
        AbstractC0269h.registerDefaultInstance(GroupedOfferCards.class, groupedOfferCards);
    }

    private GroupedOfferCards() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19558n(GroupedOfferCards groupedOfferCards, PremiumOfferCard premiumOfferCard) {
        groupedOfferCards.getClass();
        premiumOfferCard.getClass();
        ae50 ae50Var = groupedOfferCards.offerCards_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            groupedOfferCards.offerCards_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        groupedOfferCards.offerCards_.add(premiumOfferCard);
    }

    /* JADX INFO: renamed from: o */
    public static void m19559o(GroupedOfferCards groupedOfferCards) {
        groupedOfferCards.getClass();
        groupedOfferCards.bitField0_ |= 1;
        groupedOfferCards.collapsedText_ = "Show all plans";
    }

    /* JADX INFO: renamed from: p */
    public static void m19560p(GroupedOfferCards groupedOfferCards) {
        groupedOfferCards.getClass();
        groupedOfferCards.bitField0_ |= 2;
        groupedOfferCards.expandedText_ = "Hide all plans";
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19561q(GroupedOfferCards groupedOfferCards, LoggingInfo loggingInfo) {
        groupedOfferCards.getClass();
        groupedOfferCards.loggingInfo_ = loggingInfo;
        groupedOfferCards.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: s */
    public static GroupedOfferCards m19562s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static r920 m19563w() {
        return (r920) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003\u001b\u0004ဉ\u0002", new Object[]{"bitField0_", "collapsedText_", "expandedText_", "offerCards_", PremiumOfferCard.class, "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new GroupedOfferCards();
        }
        if (iOrdinal == 4) {
            return new r920(DEFAULT_INSTANCE);
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
        synchronized (GroupedOfferCards.class) {
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

    /* JADX INFO: renamed from: r */
    public final String m19564r() {
        return this.collapsedText_;
    }

    /* JADX INFO: renamed from: t */
    public final String m19565t() {
        return this.expandedText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final LoggingInfo m19566u() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.m19578r() : loggingInfo;
    }

    /* JADX INFO: renamed from: v */
    public final ae50 m19567v() {
        return this.offerCards_;
    }
}
