package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.imq0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumLegalText extends AbstractC0269h implements sre0 {
    private static final PremiumLegalText DEFAULT_INSTANCE;
    public static final int LOGGING_INFO_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private String text_ = "";
    private String textColor_ = "";

    static {
        PremiumLegalText premiumLegalText = new PremiumLegalText();
        DEFAULT_INSTANCE = premiumLegalText;
        AbstractC0269h.registerDefaultInstance(PremiumLegalText.class, premiumLegalText);
    }

    private PremiumLegalText() {
    }

    /* JADX INFO: renamed from: n */
    public static void m19670n(PremiumLegalText premiumLegalText, LoggingInfo loggingInfo) {
        premiumLegalText.getClass();
        premiumLegalText.loggingInfo_ = loggingInfo;
        premiumLegalText.bitField0_ |= 4;
    }

    /* JADX INFO: renamed from: o */
    public static void m19671o(PremiumLegalText premiumLegalText, String str) {
        premiumLegalText.getClass();
        premiumLegalText.bitField0_ |= 1;
        premiumLegalText.text_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static PremiumLegalText m19672p() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: t */
    public static imq0 m19673t() {
        return (imq0) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0005ဉ\u0002", new Object[]{"bitField0_", "text_", "textColor_", "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new PremiumLegalText();
        }
        if (iOrdinal == 4) {
            return new imq0(DEFAULT_INSTANCE);
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
        synchronized (PremiumLegalText.class) {
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

    /* JADX INFO: renamed from: q */
    public final LoggingInfo m19674q() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.m19578r() : loggingInfo;
    }

    /* JADX INFO: renamed from: r */
    public final String m19675r() {
        return this.text_;
    }

    /* JADX INFO: renamed from: s */
    public final String m19676s() {
        return this.textColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
