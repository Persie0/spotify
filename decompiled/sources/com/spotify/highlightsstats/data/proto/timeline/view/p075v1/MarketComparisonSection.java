package com.spotify.highlightsstats.data.proto.timeline.view.p075v1;

import com.google.protobuf.AbstractC0269h;
import com.spotify.paragraph.p120v1.proto.Paragraph;
import p204p.gsa0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class MarketComparisonSection extends AbstractC0269h implements sre0 {
    public static final int ACCESSIBILITY_DESCRIPTION_FIELD_NUMBER = 5;
    private static final MarketComparisonSection DEFAULT_INSTANCE;
    public static final int MARKET_LINE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PERCENTAGE_DIFFERENCE_FIELD_NUMBER = 4;
    public static final int TITLE_FIELD_NUMBER = 1;
    public static final int USER_LINE_FIELD_NUMBER = 2;
    private String accessibilityDescription_ = "";
    private int bitField0_;
    private MarketComparisonItem marketLine_;
    private int percentageDifference_;
    private Paragraph title_;
    private MarketComparisonItem userLine_;

    static {
        MarketComparisonSection marketComparisonSection = new MarketComparisonSection();
        DEFAULT_INSTANCE = marketComparisonSection;
        AbstractC0269h.registerDefaultInstance(MarketComparisonSection.class, marketComparisonSection);
    }

    private MarketComparisonSection() {
    }

    /* JADX INFO: renamed from: o */
    public static MarketComparisonSection m11385o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004\u0004\u0005Ȉ", new Object[]{"bitField0_", "title_", "userLine_", "marketLine_", "percentageDifference_", "accessibilityDescription_"});
        }
        if (iOrdinal == 3) {
            return new MarketComparisonSection();
        }
        if (iOrdinal == 4) {
            return new gsa0(DEFAULT_INSTANCE, 22);
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
        synchronized (MarketComparisonSection.class) {
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
    public final String m11386n() {
        return this.accessibilityDescription_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final MarketComparisonItem m11387p() {
        MarketComparisonItem marketComparisonItem = this.marketLine_;
        return marketComparisonItem == null ? MarketComparisonItem.m11380p() : marketComparisonItem;
    }

    /* JADX INFO: renamed from: q */
    public final int m11388q() {
        return this.percentageDifference_;
    }

    /* JADX INFO: renamed from: r */
    public final Paragraph m11389r() {
        Paragraph paragraph = this.title_;
        return paragraph == null ? Paragraph.m16609n() : paragraph;
    }

    /* JADX INFO: renamed from: s */
    public final MarketComparisonItem m11390s() {
        MarketComparisonItem marketComparisonItem = this.userLine_;
        return marketComparisonItem == null ? MarketComparisonItem.m11380p() : marketComparisonItem;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
