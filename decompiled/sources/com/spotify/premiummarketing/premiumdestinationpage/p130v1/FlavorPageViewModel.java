package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ngz;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class FlavorPageViewModel extends AbstractC0269h implements sre0 {
    public static final int BENEFIT_FIELD_NUMBER = 2;
    public static final int CTA_TEXT_FIELD_NUMBER = 7;
    private static final FlavorPageViewModel DEFAULT_INSTANCE;
    public static final int INVITE_EXPLANATION_FIELD_NUMBER = 4;
    public static final int LEGAL_TEXT_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PLANS_FIELD_NUMBER = 6;
    public static final int PLAN_NAME_FIELD_NUMBER = 1;
    public static final int TAG_LINE_FIELD_NUMBER = 3;
    private int bitField0_;
    private String planName_ = "";
    private String benefit_ = "";
    private String tagLine_ = "";
    private String inviteExplanation_ = "";
    private String legalText_ = "";
    private ae50 plans_ = AbstractC0269h.emptyProtobufList();
    private String ctaText_ = "";

    static {
        FlavorPageViewModel flavorPageViewModel = new FlavorPageViewModel();
        DEFAULT_INSTANCE = flavorPageViewModel;
        AbstractC0269h.registerDefaultInstance(FlavorPageViewModel.class, flavorPageViewModel);
    }

    private FlavorPageViewModel() {
    }

    /* JADX INFO: renamed from: A */
    public static ngz m19544A() {
        return (ngz) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m19545n(FlavorPageViewModel flavorPageViewModel, PlanDetailViewModel planDetailViewModel) {
        flavorPageViewModel.getClass();
        planDetailViewModel.getClass();
        ae50 ae50Var = flavorPageViewModel.plans_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            flavorPageViewModel.plans_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        flavorPageViewModel.plans_.add(planDetailViewModel);
    }

    /* JADX INFO: renamed from: o */
    public static void m19546o(FlavorPageViewModel flavorPageViewModel, String str) {
        flavorPageViewModel.getClass();
        flavorPageViewModel.benefit_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19547p(FlavorPageViewModel flavorPageViewModel, String str) {
        flavorPageViewModel.getClass();
        flavorPageViewModel.bitField0_ |= 1;
        flavorPageViewModel.inviteExplanation_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19548q(FlavorPageViewModel flavorPageViewModel, String str) {
        flavorPageViewModel.getClass();
        flavorPageViewModel.bitField0_ |= 2;
        flavorPageViewModel.legalText_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m19549r(FlavorPageViewModel flavorPageViewModel, String str) {
        flavorPageViewModel.getClass();
        flavorPageViewModel.planName_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m19550s(FlavorPageViewModel flavorPageViewModel, String str) {
        flavorPageViewModel.getClass();
        flavorPageViewModel.tagLine_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static FlavorPageViewModel m19551v() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ለ\u0001\u0006\u001b\u0007ለ\u0002", new Object[]{"bitField0_", "planName_", "benefit_", "tagLine_", "inviteExplanation_", "legalText_", "plans_", PlanDetailViewModel.class, "ctaText_"});
        }
        if (iOrdinal == 3) {
            return new FlavorPageViewModel();
        }
        if (iOrdinal == 4) {
            return new ngz(DEFAULT_INSTANCE);
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
        synchronized (FlavorPageViewModel.class) {
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

    public final String getPlanName() {
        return this.planName_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: t */
    public final String m19552t() {
        return this.benefit_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m19553u() {
        return this.ctaText_;
    }

    /* JADX INFO: renamed from: w */
    public final String m19554w() {
        return this.inviteExplanation_;
    }

    /* JADX INFO: renamed from: x */
    public final String m19555x() {
        return this.legalText_;
    }

    /* JADX INFO: renamed from: y */
    public final ae50 m19556y() {
        return this.plans_;
    }

    /* JADX INFO: renamed from: z */
    public final String m19557z() {
        return this.tagLine_;
    }
}
