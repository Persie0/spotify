package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.n3n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PartnerAccountLinkingDialogImpression extends AbstractC0269h implements sre0 {
    private static final PartnerAccountLinkingDialogImpression DEFAULT_INSTANCE;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 1;
    public static final int IMPRESSION_REASON_FIELD_NUMBER = 2;
    public static final int LINKING_ID_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TIMES_SHOWN_FIELD_NUMBER = 3;
    private int bitField0_;
    private String impressionId_ = "";
    private String impressionReason_ = "";
    private String linkingId_ = "";
    private int timesShown_;

    static {
        PartnerAccountLinkingDialogImpression partnerAccountLinkingDialogImpression = new PartnerAccountLinkingDialogImpression();
        DEFAULT_INSTANCE = partnerAccountLinkingDialogImpression;
        AbstractC0269h.registerDefaultInstance(PartnerAccountLinkingDialogImpression.class, partnerAccountLinkingDialogImpression);
    }

    private PartnerAccountLinkingDialogImpression() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14312n(PartnerAccountLinkingDialogImpression partnerAccountLinkingDialogImpression, String str) {
        partnerAccountLinkingDialogImpression.getClass();
        str.getClass();
        partnerAccountLinkingDialogImpression.bitField0_ |= 1;
        partnerAccountLinkingDialogImpression.impressionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14313o(PartnerAccountLinkingDialogImpression partnerAccountLinkingDialogImpression, String str) {
        partnerAccountLinkingDialogImpression.getClass();
        partnerAccountLinkingDialogImpression.bitField0_ |= 2;
        partnerAccountLinkingDialogImpression.impressionReason_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14314p(PartnerAccountLinkingDialogImpression partnerAccountLinkingDialogImpression, String str) {
        partnerAccountLinkingDialogImpression.getClass();
        str.getClass();
        partnerAccountLinkingDialogImpression.bitField0_ |= 8;
        partnerAccountLinkingDialogImpression.linkingId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14315q(PartnerAccountLinkingDialogImpression partnerAccountLinkingDialogImpression, int i) {
        partnerAccountLinkingDialogImpression.bitField0_ |= 4;
        partnerAccountLinkingDialogImpression.timesShown_ = i;
    }

    /* JADX INFO: renamed from: r */
    public static n3n0 m14316r() {
        return (n3n0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "impressionId_", "impressionReason_", "timesShown_", "linkingId_"});
        }
        if (iOrdinal == 3) {
            return new PartnerAccountLinkingDialogImpression();
        }
        if (iOrdinal == 4) {
            return new n3n0(DEFAULT_INSTANCE);
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
        synchronized (PartnerAccountLinkingDialogImpression.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
