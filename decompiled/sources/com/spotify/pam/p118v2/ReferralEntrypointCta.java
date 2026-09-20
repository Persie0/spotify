package com.spotify.pam.p118v2;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vev0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ReferralEntrypointCta extends AbstractC0269h implements sre0 {
    public static final int CTA_LABEL_FIELD_NUMBER = 1;
    private static final ReferralEntrypointCta DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REDIRECT_URI_FIELD_NUMBER = 2;
    private String ctaLabel_ = "";
    private String redirectUri_ = "";

    static {
        ReferralEntrypointCta referralEntrypointCta = new ReferralEntrypointCta();
        DEFAULT_INSTANCE = referralEntrypointCta;
        AbstractC0269h.registerDefaultInstance(ReferralEntrypointCta.class, referralEntrypointCta);
    }

    private ReferralEntrypointCta() {
    }

    /* JADX INFO: renamed from: o */
    public static ReferralEntrypointCta m16586o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"ctaLabel_", "redirectUri_"});
        }
        if (iOrdinal == 3) {
            return new ReferralEntrypointCta();
        }
        if (iOrdinal == 4) {
            return new vev0(DEFAULT_INSTANCE, 10);
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
        synchronized (ReferralEntrypointCta.class) {
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
    public final String m16587n() {
        return this.ctaLabel_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m16588p() {
        return this.redirectUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
