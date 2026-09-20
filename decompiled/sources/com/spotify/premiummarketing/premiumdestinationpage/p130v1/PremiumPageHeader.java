package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.moq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumPageHeader extends AbstractC0269h implements sre0 {
    private static final PremiumPageHeader DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int IMAGE_URL_FIELD_NUMBER = 4;
    public static final int LOGGING_INFO_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SUBTITLE_FIELD_NUMBER = 2;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private String title_ = "";
    private String subtitle_ = "";
    private String description_ = "";
    private String imageUrl_ = "";

    static {
        PremiumPageHeader premiumPageHeader = new PremiumPageHeader();
        DEFAULT_INSTANCE = premiumPageHeader;
        AbstractC0269h.registerDefaultInstance(PremiumPageHeader.class, premiumPageHeader);
    }

    private PremiumPageHeader() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19719n(PremiumPageHeader premiumPageHeader, String str) {
        premiumPageHeader.getClass();
        str.getClass();
        premiumPageHeader.bitField0_ |= 4;
        premiumPageHeader.description_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19720o(PremiumPageHeader premiumPageHeader, String str) {
        premiumPageHeader.getClass();
        premiumPageHeader.bitField0_ |= 8;
        premiumPageHeader.imageUrl_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19721p(PremiumPageHeader premiumPageHeader, LoggingInfo loggingInfo) {
        premiumPageHeader.getClass();
        premiumPageHeader.loggingInfo_ = loggingInfo;
        premiumPageHeader.bitField0_ |= 16;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19722q(PremiumPageHeader premiumPageHeader, String str) {
        premiumPageHeader.getClass();
        premiumPageHeader.bitField0_ |= 2;
        premiumPageHeader.subtitle_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m19723r(PremiumPageHeader premiumPageHeader, String str) {
        premiumPageHeader.getClass();
        premiumPageHeader.bitField0_ |= 1;
        premiumPageHeader.title_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static PremiumPageHeader m19724s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static moq0 m19725u() {
        return (moq0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "title_", "subtitle_", "description_", "imageUrl_", "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new PremiumPageHeader();
        }
        if (iOrdinal == 4) {
            return new moq0(DEFAULT_INSTANCE);
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
        synchronized (PremiumPageHeader.class) {
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

    public final String getDescription() {
        return this.description_;
    }

    public final String getImageUrl() {
        return this.imageUrl_;
    }

    public final String getSubtitle() {
        return this.subtitle_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: t */
    public final LoggingInfo m19726t() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.m19578r() : loggingInfo;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
