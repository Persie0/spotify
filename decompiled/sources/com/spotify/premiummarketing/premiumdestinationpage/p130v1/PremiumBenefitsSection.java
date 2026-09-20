package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.kjq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumBenefitsSection extends AbstractC0269h implements sre0 {
    private static final PremiumBenefitsSection DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    public static final int LOGGING_INFO_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private String title_ = "";
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        PremiumBenefitsSection premiumBenefitsSection = new PremiumBenefitsSection();
        DEFAULT_INSTANCE = premiumBenefitsSection;
        AbstractC0269h.registerDefaultInstance(PremiumBenefitsSection.class, premiumBenefitsSection);
    }

    private PremiumBenefitsSection() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19622n(PremiumBenefitsSection premiumBenefitsSection, BenefitItem benefitItem) {
        premiumBenefitsSection.getClass();
        benefitItem.getClass();
        ae50 ae50Var = premiumBenefitsSection.items_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            premiumBenefitsSection.items_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        premiumBenefitsSection.items_.add(benefitItem);
    }

    /* JADX INFO: renamed from: o */
    public static void m19623o(PremiumBenefitsSection premiumBenefitsSection, LoggingInfo loggingInfo) {
        premiumBenefitsSection.getClass();
        premiumBenefitsSection.loggingInfo_ = loggingInfo;
        premiumBenefitsSection.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: p */
    public static void m19624p(PremiumBenefitsSection premiumBenefitsSection, String str) {
        premiumBenefitsSection.getClass();
        premiumBenefitsSection.bitField0_ |= 1;
        premiumBenefitsSection.title_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PremiumBenefitsSection m19625q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: s */
    public static kjq0 m19626s() {
        return (kjq0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ለ\u0000\u0002\u001b\u0003ဉ\u0001", new Object[]{"bitField0_", "title_", "items_", BenefitItem.class, "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new PremiumBenefitsSection();
        }
        if (iOrdinal == 4) {
            return new kjq0(DEFAULT_INSTANCE);
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
        synchronized (PremiumBenefitsSection.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: r */
    public final LoggingInfo m19627r() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.m19578r() : loggingInfo;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
