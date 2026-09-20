package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import p204p.a530;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class IconSubscriptionCard extends AbstractC0269h implements sre0 {
    private static final IconSubscriptionCard DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int DISCLAIMER_FIELD_NUMBER = 8;
    public static final int HEADER_COLORS_FIELD_NUMBER = 10;
    public static final int ICON_URL_FIELD_NUMBER = 4;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int IS_ACTIVE_FIELD_NUMBER = 9;
    public static final int LINKS_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int PRICING_FIELD_NUMBER = 5;
    public static final int PRIMARY_CTA_FIELD_NUMBER = 6;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private int bitField0_;
    private Colors headerColors_;
    private boolean isActive_;
    private Pricing pricing_;
    private Cta primaryCta_;
    private String id_ = "";
    private String title_ = "";
    private String description_ = "";
    private String iconUrl_ = "";
    private ae50 links_ = AbstractC0269h.emptyProtobufList();
    private String disclaimer_ = "";
    private String ubiId_ = "";

    static {
        IconSubscriptionCard iconSubscriptionCard = new IconSubscriptionCard();
        DEFAULT_INSTANCE = iconSubscriptionCard;
        AbstractC0269h.registerDefaultInstance(IconSubscriptionCard.class, iconSubscriptionCard);
    }

    private IconSubscriptionCard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001d\u000b\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ለ\u0000\u0005ဉ\u0001\u0006ဉ\u0002\u0007\u001b\bለ\u0003\t\u0007\nဉ\u0004dለ\u0005", new Object[]{"bitField0_", "id_", "title_", "description_", "iconUrl_", "pricing_", "primaryCta_", "links_", Cta.class, "disclaimer_", "isActive_", "headerColors_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new IconSubscriptionCard();
        }
        if (iOrdinal == 4) {
            return new a530(DEFAULT_INSTANCE, 18);
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
        synchronized (IconSubscriptionCard.class) {
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
