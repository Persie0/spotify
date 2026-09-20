package com.spotify.messages;

import com.google.protobuf.AbstractC0269h;
import p204p.e4n0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes8.dex */
public final class PartnerAccountLinkingResult extends AbstractC0269h implements sre0 {
    private static final PartnerAccountLinkingResult DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 5;
    public static final int ERROR_TYPE_FIELD_NUMBER = 4;
    public static final int LINKING_ID_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int PARTNER_FIELD_NUMBER = 1;
    public static final int PRELOAD_PARTNER_FIELD_NUMBER = 3;
    public static final int SUCCESS_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean success_;
    private String partner_ = "";
    private String preloadPartner_ = "";
    private String errorType_ = "";
    private String errorMessage_ = "";
    private String linkingId_ = "";

    static {
        PartnerAccountLinkingResult partnerAccountLinkingResult = new PartnerAccountLinkingResult();
        DEFAULT_INSTANCE = partnerAccountLinkingResult;
        AbstractC0269h.registerDefaultInstance(PartnerAccountLinkingResult.class, partnerAccountLinkingResult);
    }

    private PartnerAccountLinkingResult() {
    }

    /* JADX INFO: renamed from: n */
    public static void m14323n(PartnerAccountLinkingResult partnerAccountLinkingResult, String str) {
        partnerAccountLinkingResult.getClass();
        str.getClass();
        partnerAccountLinkingResult.bitField0_ |= 16;
        partnerAccountLinkingResult.errorMessage_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m14324o(PartnerAccountLinkingResult partnerAccountLinkingResult, String str) {
        partnerAccountLinkingResult.getClass();
        str.getClass();
        partnerAccountLinkingResult.bitField0_ |= 8;
        partnerAccountLinkingResult.errorType_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m14325p(PartnerAccountLinkingResult partnerAccountLinkingResult, String str) {
        partnerAccountLinkingResult.getClass();
        str.getClass();
        partnerAccountLinkingResult.bitField0_ |= 32;
        partnerAccountLinkingResult.linkingId_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m14326q(PartnerAccountLinkingResult partnerAccountLinkingResult, String str) {
        partnerAccountLinkingResult.getClass();
        partnerAccountLinkingResult.bitField0_ |= 1;
        partnerAccountLinkingResult.partner_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m14327r(PartnerAccountLinkingResult partnerAccountLinkingResult, String str) {
        partnerAccountLinkingResult.getClass();
        str.getClass();
        partnerAccountLinkingResult.bitField0_ |= 4;
        partnerAccountLinkingResult.preloadPartner_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m14328s(PartnerAccountLinkingResult partnerAccountLinkingResult, boolean z) {
        partnerAccountLinkingResult.bitField0_ |= 2;
        partnerAccountLinkingResult.success_ = z;
    }

    /* JADX INFO: renamed from: t */
    public static e4n0 m14329t() {
        return (e4n0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "partner_", "success_", "preloadPartner_", "errorType_", "errorMessage_", "linkingId_"});
        }
        if (iOrdinal == 3) {
            return new PartnerAccountLinkingResult();
        }
        if (iOrdinal == 4) {
            return new e4n0(DEFAULT_INSTANCE);
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
        synchronized (PartnerAccountLinkingResult.class) {
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
