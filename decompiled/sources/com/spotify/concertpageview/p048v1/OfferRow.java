package com.spotify.concertpageview.p048v1;

import com.google.protobuf.AbstractC0269h;
import p204p.bpj0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class OfferRow extends AbstractC0269h implements sre0 {
    public static final int ACTION_FIELD_NUMBER = 5;
    public static final int ADDITIONAL_INFO_FIELD_NUMBER = 4;
    private static final OfferRow DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDER_DISPLAY_NAME_FIELD_NUMBER = 1;
    public static final int PROVIDER_LOGO_URL_FIELD_NUMBER = 2;
    public static final int SALE_TYPE_FIELD_NUMBER = 3;
    private OfferAction action_;
    private PlaceHolderText additionalInfo_;
    private int bitField0_;
    private String providerDisplayName_ = "";
    private String providerLogoUrl_ = "";
    private String saleType_ = "";

    static {
        OfferRow offerRow = new OfferRow();
        DEFAULT_INSTANCE = offerRow;
        AbstractC0269h.registerDefaultInstance(OfferRow.class, offerRow);
    }

    private OfferRow() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004ဉ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "providerDisplayName_", "providerLogoUrl_", "saleType_", "additionalInfo_", "action_"});
        }
        if (iOrdinal == 3) {
            return new OfferRow();
        }
        if (iOrdinal == 4) {
            return new bpj0(DEFAULT_INSTANCE, 15);
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
        synchronized (OfferRow.class) {
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
    public final OfferAction m7068n() {
        OfferAction offerAction = this.action_;
        return offerAction == null ? OfferAction.m7065p() : offerAction;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final PlaceHolderText m7069o() {
        PlaceHolderText placeHolderText = this.additionalInfo_;
        return placeHolderText == null ? PlaceHolderText.m7087o() : placeHolderText;
    }

    /* JADX INFO: renamed from: p */
    public final String m7070p() {
        return this.providerDisplayName_;
    }

    /* JADX INFO: renamed from: q */
    public final String m7071q() {
        return this.providerLogoUrl_;
    }

    /* JADX INFO: renamed from: r */
    public final String m7072r() {
        return this.saleType_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m7073s() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m7074t() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
