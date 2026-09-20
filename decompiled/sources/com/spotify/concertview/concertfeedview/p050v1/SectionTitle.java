package com.spotify.concertview.concertfeedview.p050v1;

import com.google.protobuf.AbstractC0269h;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class SectionTitle extends AbstractC0269h implements sre0 {
    public static final int CTA_FIELD_NUMBER = 4;
    public static final int DATE_FIELD_NUMBER = 2;
    private static final SectionTitle DEFAULT_INSTANCE;
    public static final int DISPLAY_BETA_TAG_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private SectionCta cta_;
    private boolean displayBetaTag_;
    private Object title_;
    private int titleCase_ = 0;
    private String subtitle_ = "";

    static {
        SectionTitle sectionTitle = new SectionTitle();
        DEFAULT_INSTANCE = sectionTitle;
        AbstractC0269h.registerDefaultInstance(SectionTitle.class, sectionTitle);
    }

    private SectionTitle() {
    }

    /* JADX INFO: renamed from: p */
    public static SectionTitle m7273p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȼ\u0000\u0002Ȼ\u0000\u0003ለ\u0000\u0004ဉ\u0001\u0005\u0007", new Object[]{"title_", "titleCase_", "bitField0_", "subtitle_", "cta_", "displayBetaTag_"});
        }
        if (iOrdinal == 3) {
            return new SectionTitle();
        }
        if (iOrdinal == 4) {
            return new h8z0(DEFAULT_INSTANCE, 4);
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
        synchronized (SectionTitle.class) {
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

    public final String getSubtitle() {
        return this.subtitle_;
    }

    /* JADX INFO: renamed from: n */
    public final SectionCta m7274n() {
        SectionCta sectionCta = this.cta_;
        return sectionCta == null ? SectionCta.m7267p() : sectionCta;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m7275o() {
        return this.titleCase_ == 2 ? (String) this.title_ : "";
    }

    /* JADX INFO: renamed from: q */
    public final boolean m7276q() {
        return this.displayBetaTag_;
    }

    /* JADX INFO: renamed from: r */
    public final String m7277r() {
        return this.titleCase_ == 1 ? (String) this.title_ : "";
    }

    /* JADX INFO: renamed from: s */
    public final int m7278s() {
        int i = this.titleCase_;
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
