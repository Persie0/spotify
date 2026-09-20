package com.spotify.premiummarketing.premiumdestinationpage.p130v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rlq0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class PremiumFeatureCard extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_SET_FIELD_NUMBER = 7;
    public static final int BACKGROUND_IMAGE_URL_FIELD_NUMBER = 8;
    private static final PremiumFeatureCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 5;
    public static final int DESCRIPTION_TITLE_FIELD_NUMBER = 4;
    public static final int ENCORE_ICON_NAME_FIELD_NUMBER = 6;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LOGGING_INFO_FIELD_NUMBER = 9;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    private int bitField0_;
    private LoggingInfo loggingInfo_;
    private String id_ = "";
    private String name_ = "";
    private String title_ = "";
    private String descriptionTitle_ = "";
    private String description_ = "";
    private String encoreIconName_ = "";
    private String backgroundColorSet_ = "";
    private String backgroundImageUrl_ = "";

    static {
        PremiumFeatureCard premiumFeatureCard = new PremiumFeatureCard();
        DEFAULT_INSTANCE = premiumFeatureCard;
        AbstractC0269h.registerDefaultInstance(PremiumFeatureCard.class, premiumFeatureCard);
    }

    private PremiumFeatureCard() {
    }

    /* JADX INFO: renamed from: C */
    public static rlq0 m19654C() {
        return (rlq0) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: renamed from: n */
    public static void m19655n(PremiumFeatureCard premiumFeatureCard, String str) {
        premiumFeatureCard.getClass();
        premiumFeatureCard.backgroundColorSet_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m19656o(PremiumFeatureCard premiumFeatureCard, String str) {
        premiumFeatureCard.getClass();
        premiumFeatureCard.backgroundImageUrl_ = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m19657p(PremiumFeatureCard premiumFeatureCard, String str) {
        premiumFeatureCard.getClass();
        premiumFeatureCard.description_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m19658q(PremiumFeatureCard premiumFeatureCard, String str) {
        premiumFeatureCard.getClass();
        premiumFeatureCard.descriptionTitle_ = str;
    }

    /* JADX INFO: renamed from: r */
    public static void m19659r(PremiumFeatureCard premiumFeatureCard, String str) {
        premiumFeatureCard.getClass();
        premiumFeatureCard.encoreIconName_ = str;
    }

    /* JADX INFO: renamed from: s */
    public static void m19660s(PremiumFeatureCard premiumFeatureCard, String str) {
        premiumFeatureCard.getClass();
        premiumFeatureCard.id_ = str;
    }

    /* JADX INFO: renamed from: t */
    public static void m19661t(PremiumFeatureCard premiumFeatureCard, LoggingInfo loggingInfo) {
        premiumFeatureCard.getClass();
        premiumFeatureCard.loggingInfo_ = loggingInfo;
        premiumFeatureCard.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: u */
    public static void m19662u(PremiumFeatureCard premiumFeatureCard, String str) {
        premiumFeatureCard.getClass();
        premiumFeatureCard.name_ = str;
    }

    /* JADX INFO: renamed from: v */
    public static void m19663v(PremiumFeatureCard premiumFeatureCard, String str) {
        premiumFeatureCard.getClass();
        premiumFeatureCard.title_ = str;
    }

    /* JADX INFO: renamed from: y */
    public static PremiumFeatureCard m19664y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final String m19665A() {
        return this.encoreIconName_;
    }

    /* JADX INFO: renamed from: B */
    public final LoggingInfo m19666B() {
        LoggingInfo loggingInfo = this.loggingInfo_;
        return loggingInfo == null ? LoggingInfo.m19578r() : loggingInfo;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tဉ\u0000", new Object[]{"bitField0_", "id_", "name_", "title_", "descriptionTitle_", "description_", "encoreIconName_", "backgroundColorSet_", "backgroundImageUrl_", "loggingInfo_"});
        }
        if (iOrdinal == 3) {
            return new PremiumFeatureCard();
        }
        if (iOrdinal == 4) {
            return new rlq0(DEFAULT_INSTANCE);
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
        synchronized (PremiumFeatureCard.class) {
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

    public final String getName() {
        return this.name_;
    }

    public final String getTitle() {
        return this.title_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: w */
    public final String m19667w() {
        return this.backgroundColorSet_;
    }

    /* JADX INFO: renamed from: x */
    public final String m19668x() {
        return this.backgroundImageUrl_;
    }

    /* JADX INFO: renamed from: z */
    public final String m19669z() {
        return this.descriptionTitle_;
    }
}
