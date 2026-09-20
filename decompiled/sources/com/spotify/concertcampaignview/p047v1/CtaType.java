package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.pzl;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xbl;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CtaType extends AbstractC0269h implements sre0 {
    public static final int BUY_TICKETS_FIELD_NUMBER = 600;
    public static final int CTA_CANT_ATTEND_FIELD_NUMBER = 400;
    public static final int CTA_JOIN_WAITLIST_FIELD_NUMBER = 200;
    public static final int CTA_NOT_INTERESTED_FIELD_NUMBER = 500;
    public static final int CTA_REMIND_ME_FIELD_NUMBER = 100;
    public static final int CTA_SHARE_FIELD_NUMBER = 800;
    public static final int CTA_WAITLISTED_FIELD_NUMBER = 300;
    private static final CtaType DEFAULT_INSTANCE;
    public static final int OVERRIDE_CTA_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SEE_ALL_SHOWS_FIELD_NUMBER = 700;
    public static final int STYLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private Object ctaType_;
    private int style_;
    private int ctaTypeCase_ = 0;
    private String overrideCta_ = "";

    static {
        CtaType ctaType = new CtaType();
        DEFAULT_INSTANCE = ctaType;
        AbstractC0269h.registerDefaultInstance(CtaType.class, ctaType);
    }

    private CtaType() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m6985A() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m6986B() {
        return this.ctaTypeCase_ == 700;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0001\u0001̠\n\u0000\u0000\u0000\u0001\f\u0002ለ\u0000d<\u0000È<\u0000Ĭ<\u0000Ɛ<\u0000Ǵ<\u0000ɘ<\u0000ʼ<\u0000̠<\u0000", new Object[]{"ctaType_", "ctaTypeCase_", "bitField0_", "style_", "overrideCta_", CtaTypeRemindMe.class, CtaTypeJoinWaitlist.class, CtaTypeWaitlisted.class, CtaTypeCantAttend.class, CtaTypeNotInterested.class, CtaTypeBuyTickets.class, CtaTypeSeeAllShows.class, CtaTypeShare.class});
        }
        if (iOrdinal == 3) {
            return new CtaType();
        }
        if (iOrdinal == 4) {
            return new xbl(DEFAULT_INSTANCE, 23);
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
        synchronized (CtaType.class) {
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
    public final CtaTypeBuyTickets m6987n() {
        return this.ctaTypeCase_ == 600 ? (CtaTypeBuyTickets) this.ctaType_ : CtaTypeBuyTickets.m7000n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final CtaTypeCantAttend m6988o() {
        return this.ctaTypeCase_ == 400 ? (CtaTypeCantAttend) this.ctaType_ : CtaTypeCantAttend.m7002n();
    }

    /* JADX INFO: renamed from: p */
    public final CtaTypeRemindMe m6989p() {
        return this.ctaTypeCase_ == 100 ? (CtaTypeRemindMe) this.ctaType_ : CtaTypeRemindMe.m7004o();
    }

    /* JADX INFO: renamed from: q */
    public final CtaTypeShare m6990q() {
        return this.ctaTypeCase_ == 800 ? (CtaTypeShare) this.ctaType_ : CtaTypeShare.m7013n();
    }

    /* JADX INFO: renamed from: r */
    public final String m6991r() {
        return this.overrideCta_;
    }

    /* JADX INFO: renamed from: s */
    public final pzl m6992s() {
        pzl pzlVar;
        int i = this.style_;
        if (i == 0) {
            pzlVar = pzl.CTA_STYLE_UNKNOWN;
        } else if (i != 1) {
            pzlVar = i != 2 ? null : pzl.CTA_STYLE_SECONDARY;
        } else {
            pzlVar = pzl.CTA_STYLE_PRIMARY;
        }
        return pzlVar == null ? pzl.UNRECOGNIZED : pzlVar;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6993t() {
        return this.ctaTypeCase_ == 600;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m6994u() {
        return this.ctaTypeCase_ == 400;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m6995v() {
        return this.ctaTypeCase_ == 200;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m6996w() {
        return this.ctaTypeCase_ == 500;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m6997x() {
        return this.ctaTypeCase_ == 100;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m6998y() {
        return this.ctaTypeCase_ == 800;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m6999z() {
        return this.ctaTypeCase_ == 300;
    }
}
