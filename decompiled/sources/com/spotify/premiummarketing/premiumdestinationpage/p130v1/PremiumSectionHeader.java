package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.bqq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumSectionHeader extends AbstractC0269h implements sre0 {
    private static final PremiumSectionHeader DEFAULT_INSTANCE;
    public static final int LOGGING_INFO_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SUBHEADER_FIELD_NUMBER = 3;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private String title_ = "";
    private String subheader_ = "";

    static {
        PremiumSectionHeader premiumSectionHeader = new PremiumSectionHeader();
        DEFAULT_INSTANCE = premiumSectionHeader;
        AbstractC0269h.registerDefaultInstance(PremiumSectionHeader.class, premiumSectionHeader);
    }

    private PremiumSectionHeader() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19727n(PremiumSectionHeader premiumSectionHeader, LoggingInfo loggingInfo) {
        premiumSectionHeader.getClass();
        premiumSectionHeader.loggingInfo_ = loggingInfo;
        premiumSectionHeader.bitField0_ |= 2;
    }

    /* JADX INFO: renamed from: o */
    public static void m19728o(PremiumSectionHeader premiumSectionHeader, String str) {
        premiumSectionHeader.getClass();
        str.getClass();
        premiumSectionHeader.bitField0_ |= 4;
        premiumSectionHeader.subheader_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19729p(PremiumSectionHeader premiumSectionHeader, String str) {
        premiumSectionHeader.getClass();
        premiumSectionHeader.bitField0_ |= 1;
        premiumSectionHeader.title_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static PremiumSectionHeader m19730q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static bqq0 m19731t() {
        return (bqq0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဉ\u0001\u0003ለ\u0002", new Object[]{"bitField0_", "title_", "loggingInfo_", "subheader_"});
        }
        if (iOrdinal == 3) {
            return new PremiumSectionHeader();
        }
        if (iOrdinal == 4) {
            return new bqq0(DEFAULT_INSTANCE);
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
        synchronized (PremiumSectionHeader.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: r */
    public final LoggingInfo m19732r() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.m19578r() : loggingInfo;
    }

    /* JADX INFO: renamed from: s */
    public final String m19733s() {
        return this.subheader_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
