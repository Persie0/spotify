package com.spotify.concertcampaignview.p047v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.xbl;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class CtaTypeRemindMe extends AbstractC0269h implements sre0 {
    public static final int ACTIVE_OVERRIDE_CTA_FIELD_NUMBER = 2;
    private static final CtaTypeRemindMe DEFAULT_INSTANCE;
    public static final int INACTIVE_OVERRIDE_CTA_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int SET_ACTIVE_SNACKBAR_FIELD_NUMBER = 3;
    public static final int SET_INACTIVE_SNACKBAR_FIELD_NUMBER = 4;
    private int bitField0_;
    private String inactiveOverrideCta_ = "";
    private String activeOverrideCta_ = "";
    private String setActiveSnackbar_ = "";
    private String setInactiveSnackbar_ = "";

    static {
        CtaTypeRemindMe ctaTypeRemindMe = new CtaTypeRemindMe();
        DEFAULT_INSTANCE = ctaTypeRemindMe;
        AbstractC0269h.registerDefaultInstance(CtaTypeRemindMe.class, ctaTypeRemindMe);
    }

    private CtaTypeRemindMe() {
    }

    /* JADX INFO: renamed from: o */
    public static CtaTypeRemindMe m7004o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003", new Object[]{"bitField0_", "inactiveOverrideCta_", "activeOverrideCta_", "setActiveSnackbar_", "setInactiveSnackbar_"});
        }
        if (iOrdinal == 3) {
            return new CtaTypeRemindMe();
        }
        if (iOrdinal == 4) {
            return new xbl(DEFAULT_INSTANCE, 28);
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
        synchronized (CtaTypeRemindMe.class) {
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
    public final String m7005n() {
        return this.activeOverrideCta_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m7006p() {
        return this.inactiveOverrideCta_;
    }

    /* JADX INFO: renamed from: q */
    public final String m7007q() {
        return this.setActiveSnackbar_;
    }

    /* JADX INFO: renamed from: r */
    public final String m7008r() {
        return this.setInactiveSnackbar_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7009s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7010t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m7011u() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m7012v() {
        return (this.bitField0_ & 8) != 0;
    }
}
