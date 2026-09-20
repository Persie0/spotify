package com.spotify.pam.showvalue;

import com.google.protobuf.AbstractC0269h;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class BenefitsHeaderSection extends AbstractC0269h implements sre0 {
    private static final BenefitsHeaderSection DEFAULT_INSTANCE;
    public static final int NAVIGATION_ACTION_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PRETITLE_FIELD_NUMBER = 1;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private CarouselAction navigationAction_;
    private String pretitle_ = "";
    private String title_ = "";

    static {
        BenefitsHeaderSection benefitsHeaderSection = new BenefitsHeaderSection();
        DEFAULT_INSTANCE = benefitsHeaderSection;
        AbstractC0269h.registerDefaultInstance(BenefitsHeaderSection.class, benefitsHeaderSection);
    }

    private BenefitsHeaderSection() {
    }

    /* JADX INFO: renamed from: n */
    public static BenefitsHeaderSection m16270n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"bitField0_", "pretitle_", "title_", "navigationAction_"});
        }
        if (iOrdinal == 3) {
            return new BenefitsHeaderSection();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 29);
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
        synchronized (BenefitsHeaderSection.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CarouselAction m16271o() {
        CarouselAction carouselAction = this.navigationAction_;
        return carouselAction == null ? CarouselAction.m16274n() : carouselAction;
    }

    /* JADX INFO: renamed from: p */
    public final String m16272p() {
        return this.pretitle_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m16273q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
