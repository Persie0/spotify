package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y3n0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PartnerAccountLinkingNudge extends AbstractC0269h implements sre0 {
    private static final PartnerAccountLinkingNudge DEFAULT_INSTANCE;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 2;
    public static final int LINKING_ID_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PARTNER_FIELD_NUMBER = 3;
    public static final int PRELOAD_PARTNER_FIELD_NUMBER = 4;
    public static final int SOURCE_FIELD_NUMBER = 5;
    private int bitField0_;
    private String linkingId_ = "";
    private String impressionId_ = "";
    private String partner_ = "";
    private String preloadPartner_ = "";
    private String source_ = "";

    static {
        PartnerAccountLinkingNudge partnerAccountLinkingNudge = new PartnerAccountLinkingNudge();
        DEFAULT_INSTANCE = partnerAccountLinkingNudge;
        AbstractC0269h.registerDefaultInstance(PartnerAccountLinkingNudge.class, partnerAccountLinkingNudge);
    }

    private PartnerAccountLinkingNudge() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14317n(PartnerAccountLinkingNudge partnerAccountLinkingNudge, String str) {
        partnerAccountLinkingNudge.getClass();
        str.getClass();
        partnerAccountLinkingNudge.bitField0_ |= 2;
        partnerAccountLinkingNudge.impressionId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14318o(PartnerAccountLinkingNudge partnerAccountLinkingNudge, String str) {
        partnerAccountLinkingNudge.getClass();
        str.getClass();
        partnerAccountLinkingNudge.bitField0_ |= 1;
        partnerAccountLinkingNudge.linkingId_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14319p(PartnerAccountLinkingNudge partnerAccountLinkingNudge, String str) {
        partnerAccountLinkingNudge.getClass();
        partnerAccountLinkingNudge.bitField0_ |= 4;
        partnerAccountLinkingNudge.partner_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14320q(PartnerAccountLinkingNudge partnerAccountLinkingNudge, String str) {
        partnerAccountLinkingNudge.getClass();
        str.getClass();
        partnerAccountLinkingNudge.bitField0_ |= 8;
        partnerAccountLinkingNudge.preloadPartner_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14321r(PartnerAccountLinkingNudge partnerAccountLinkingNudge, String str) {
        partnerAccountLinkingNudge.getClass();
        partnerAccountLinkingNudge.bitField0_ |= 16;
        partnerAccountLinkingNudge.source_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static y3n0 m14322s() {
        return (y3n0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "linkingId_", "impressionId_", "partner_", "preloadPartner_", "source_"});
        }
        if (iOrdinal == 3) {
            return new PartnerAccountLinkingNudge();
        }
        if (iOrdinal == 4) {
            return new y3n0(DEFAULT_INSTANCE);
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
        synchronized (PartnerAccountLinkingNudge.class) {
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
