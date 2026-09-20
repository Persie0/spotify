package com.spotify.concertview.concertfeedview.p050v1;

import com.google.protobuf.AbstractC0269h;
import p204p.i2z0;
import p204p.ore0;
import p204p.pre0;
import p204p.q6z0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class SectionCta extends AbstractC0269h implements sre0 {
    public static final int CTA_FIELD_NUMBER = 1;
    public static final int CTA_TYPE_FIELD_NUMBER = 3;
    private static final SectionCta DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int TARGET_URI_FIELD_NUMBER = 2;
    private int ctaType_;
    private String cta_ = "";
    private String targetUri_ = "";

    static {
        SectionCta sectionCta = new SectionCta();
        DEFAULT_INSTANCE = sectionCta;
        AbstractC0269h.registerDefaultInstance(SectionCta.class, sectionCta);
    }

    private SectionCta() {
    }

    /* JADX INFO: renamed from: p */
    public static SectionCta m7267p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\f", new Object[]{"cta_", "targetUri_", "ctaType_"});
        }
        if (iOrdinal == 3) {
            return new SectionCta();
        }
        if (iOrdinal == 4) {
            return new i2z0(DEFAULT_INSTANCE, 21);
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
        synchronized (SectionCta.class) {
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
    public final String m7268n() {
        return this.cta_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final q6z0 m7269o() {
        q6z0 q6z0Var;
        int i = this.ctaType_;
        if (i == 0) {
            q6z0Var = q6z0.CTA_TYPE_UNSPECIFIED;
        } else if (i != 1) {
            q6z0Var = i != 2 ? null : q6z0.CTA_TYPE_EDITORIAL;
        } else {
            q6z0Var = q6z0.CTA_TYPE_URI;
        }
        return q6z0Var == null ? q6z0.UNRECOGNIZED : q6z0Var;
    }

    /* JADX INFO: renamed from: q */
    public final String m7270q() {
        return this.targetUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
