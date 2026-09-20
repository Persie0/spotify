package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.q610;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class GetAudiobookConsiderationResponse extends AbstractC0269h implements sre0 {
    public static final int ASTRO_BENEFITS_FIELD_NUMBER = 2;
    private static final GetAudiobookConsiderationResponse DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 4;
    public static final int EXPLANATION_CARD_FIELD_NUMBER = 3;
    public static final int HEADER_CARD_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private BenefitListCard astroBenefits_;
    private int bitField0_;
    private String disclaimer_ = "";
    private ExplanationCard explanationCard_;
    private HeaderCard headerCard_;

    static {
        GetAudiobookConsiderationResponse getAudiobookConsiderationResponse = new GetAudiobookConsiderationResponse();
        DEFAULT_INSTANCE = getAudiobookConsiderationResponse;
        AbstractC0269h.registerDefaultInstance(GetAudiobookConsiderationResponse.class, getAudiobookConsiderationResponse);
    }

    private GetAudiobookConsiderationResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ", new Object[]{"bitField0_", "headerCard_", "astroBenefits_", "explanationCard_", "disclaimer_"});
        }
        if (iOrdinal == 3) {
            return new GetAudiobookConsiderationResponse();
        }
        if (iOrdinal == 4) {
            return new q610(DEFAULT_INSTANCE, 1);
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
        synchronized (GetAudiobookConsiderationResponse.class) {
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
    public final BenefitListCard m16458n() {
        BenefitListCard benefitListCard = this.astroBenefits_;
        return benefitListCard == null ? BenefitListCard.m16415q() : benefitListCard;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m16459o() {
        return this.disclaimer_;
    }

    /* JADX INFO: renamed from: p */
    public final ExplanationCard m16460p() {
        ExplanationCard explanationCard = this.explanationCard_;
        return explanationCard == null ? ExplanationCard.m16442n() : explanationCard;
    }

    /* JADX INFO: renamed from: q */
    public final HeaderCard m16461q() {
        HeaderCard headerCard = this.headerCard_;
        return headerCard == null ? HeaderCard.m16523o() : headerCard;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
