package com.spotify.libraryimportservice.tmm;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.mw8;
import p204p.ore0;
import p204p.pre0;
import p204p.qb10;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class GetTransferResultsBannerResponse extends AbstractC0269h implements sre0 {
    public static final int BANNER_TYPE_FIELD_NUMBER = 1;
    public static final int BODY_FIELD_NUMBER = 3;
    private static final GetTransferResultsBannerResponse DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 4;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TRANSFER_ID_FIELD_NUMBER = 6;
    private int bannerType_;
    private int bitField0_;
    private CTA primaryButton_;
    private CTA secondaryButton_;
    private String title_ = "";
    private ae50 body_ = AbstractC0269h.emptyProtobufList();
    private String transferId_ = "";

    static {
        GetTransferResultsBannerResponse getTransferResultsBannerResponse = new GetTransferResultsBannerResponse();
        DEFAULT_INSTANCE = getTransferResultsBannerResponse;
        AbstractC0269h.registerDefaultInstance(GetTransferResultsBannerResponse.class, getTransferResultsBannerResponse);
    }

    private GetTransferResultsBannerResponse() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u001b\u0004ဉ\u0000\u0005ဉ\u0001\u0006Ȉ", new Object[]{"bitField0_", "bannerType_", "title_", "body_", BannerBody.class, "primaryButton_", "secondaryButton_", "transferId_"});
        }
        if (iOrdinal == 3) {
            return new GetTransferResultsBannerResponse();
        }
        if (iOrdinal == 4) {
            return new qb10(DEFAULT_INSTANCE, 8);
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
        synchronized (GetTransferResultsBannerResponse.class) {
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

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final mw8 m12602n() {
        mw8 mw8Var;
        int i = this.bannerType_;
        if (i == 0) {
            mw8Var = mw8.BANNER_TYPE_UNSPECIFIED;
        } else if (i == 1) {
            mw8Var = mw8.ALL_SUCCESS;
        } else if (i != 2) {
            mw8Var = i != 3 ? null : mw8.ALL_FAIL;
        } else {
            mw8Var = mw8.PARTIAL_SUCCESS;
        }
        return mw8Var == null ? mw8.UNRECOGNIZED : mw8Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m12603o() {
        return this.body_;
    }

    /* JADX INFO: renamed from: p */
    public final CTA m12604p() {
        CTA cta = this.primaryButton_;
        return cta == null ? CTA.m12600o() : cta;
    }

    /* JADX INFO: renamed from: q */
    public final String m12605q() {
        return this.transferId_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m12606r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
