package com.spotify.artistconcertspageview.p022v2;

import com.google.protobuf.AbstractC0269h;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SectionTitle extends AbstractC0269h implements sre0 {
    public static final int CTA_FIELD_NUMBER = 2;
    public static final int CTA_URI_FIELD_NUMBER = 3;
    private static final SectionTitle DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private String text_ = "";
    private String cta_ = "";
    private String ctaUri_ = "";

    static {
        SectionTitle sectionTitle = new SectionTitle();
        DEFAULT_INSTANCE = sectionTitle;
        AbstractC0269h.registerDefaultInstance(SectionTitle.class, sectionTitle);
    }

    private SectionTitle() {
    }

    /* JADX INFO: renamed from: p */
    public static SectionTitle m3305p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ለ\u0000\u0003ለ\u0001", new Object[]{"bitField0_", "text_", "cta_", "ctaUri_"});
        }
        if (iOrdinal == 3) {
            return new SectionTitle();
        }
        if (iOrdinal == 4) {
            return new h8z0(DEFAULT_INSTANCE, 5);
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

    /* JADX INFO: renamed from: n */
    public final String m3306n() {
        return this.cta_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m3307o() {
        return this.ctaUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m3308q() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
