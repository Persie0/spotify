package com.spotify.extendedmetadata.extensions.showaccessimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z5u;

/* JADX INFO: loaded from: classes2.dex */
public final class EngagementExplanation extends AbstractC0269h implements sre0 {
    public static final int ACTION_TYPE_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 3;
    public static final int BODY_SECONDARY_FIELD_NUMBER = 7;
    public static final int CTA_FIELD_NUMBER = 4;
    private static final EngagementExplanation DEFAULT_INSTANCE;
    public static final int DISMISS_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    public static final int IS_PRICE_DISPLAYED_FIELD_NUMBER = 9;
    private static volatile r2n0 PARSER = null;
    public static final int PRICE_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isPriceDisplayed_;
    private AudiobookPriceOuterClass$AudiobookPrice price_;
    private String header_ = "";
    private String title_ = "";
    private String body_ = "";
    private String cta_ = "";
    private String dismiss_ = "";
    private String actionType_ = "";
    private String bodySecondary_ = "";

    static {
        EngagementExplanation engagementExplanation = new EngagementExplanation();
        DEFAULT_INSTANCE = engagementExplanation;
        AbstractC0269h.registerDefaultInstance(EngagementExplanation.class, engagementExplanation);
    }

    private EngagementExplanation() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static EngagementExplanation m10411s() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bဉ\u0000\t\u0007", new Object[]{"bitField0_", "header_", "title_", "body_", "cta_", "dismiss_", "actionType_", "bodySecondary_", "price_", "isPriceDisplayed_"});
        }
        if (iOrdinal == 3) {
            return new EngagementExplanation();
        }
        if (iOrdinal == 4) {
            return new z5u(12);
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
        synchronized (EngagementExplanation.class) {
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
    public final String m10412o() {
        return this.actionType_;
    }

    /* JADX INFO: renamed from: p */
    public final String m10413p() {
        return this.body_;
    }

    /* JADX INFO: renamed from: q */
    public final String m10414q() {
        return this.bodySecondary_;
    }

    /* JADX INFO: renamed from: r */
    public final String m10415r() {
        return this.cta_;
    }

    /* JADX INFO: renamed from: t */
    public final String m10416t() {
        return this.dismiss_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m10417u() {
        return this.header_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m10418v() {
        return this.isPriceDisplayed_;
    }

    /* JADX INFO: renamed from: w */
    public final AudiobookPriceOuterClass$AudiobookPrice m10419w() {
        AudiobookPriceOuterClass$AudiobookPrice audiobookPriceOuterClass$AudiobookPrice = this.price_;
        return audiobookPriceOuterClass$AudiobookPrice == null ? AudiobookPriceOuterClass$AudiobookPrice.m10379o() : audiobookPriceOuterClass$AudiobookPrice;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m10420x() {
        return (this.bitField0_ & 1) != 0;
    }
}
