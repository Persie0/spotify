package com.spotify.upselloffer.endpointimpl.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.kea1;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class UpsellOffer extends AbstractC0269h implements sre0 {
    public static final int CTA_LINK_FIELD_NUMBER = 2;
    public static final int CTA_TEXT_FIELD_NUMBER = 1;
    private static final UpsellOffer DEFAULT_INSTANCE;
    public static final int OFFER_END_DATE_FIELD_NUMBER = 4;
    public static final int OFFER_UUID_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER;
    private int bitField0_;
    private String ctaText_ = "";
    private String ctaLink_ = "";
    private String offerUuid_ = "";
    private String offerEndDate_ = "";

    static {
        UpsellOffer upsellOffer = new UpsellOffer();
        DEFAULT_INSTANCE = upsellOffer;
        AbstractC0269h.registerDefaultInstance(UpsellOffer.class, upsellOffer);
    }

    private UpsellOffer() {
    }

    /* JADX INFO: renamed from: o */
    public static UpsellOffer m22037o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003Ȉ\u0004ለ\u0002", new Object[]{"bitField0_", "ctaText_", "ctaLink_", "offerUuid_", "offerEndDate_"});
        }
        if (iOrdinal == 3) {
            return new UpsellOffer();
        }
        if (iOrdinal == 4) {
            return new kea1(DEFAULT_INSTANCE, 4);
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
        synchronized (UpsellOffer.class) {
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
    public final String m22038n() {
        return this.ctaText_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final String m22039p() {
        return this.offerEndDate_;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m22040q() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
