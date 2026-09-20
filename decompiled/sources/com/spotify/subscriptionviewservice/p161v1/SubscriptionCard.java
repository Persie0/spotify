package com.spotify.subscriptionviewservice.p161v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.cm51;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zt51;

/* JADX INFO: loaded from: classes10.dex */
public final class SubscriptionCard extends AbstractC0269h implements sre0 {
    public static final int AVATARS_FIELD_NUMBER = 5;
    public static final int BADGE_FIELD_NUMBER = 1;
    public static final int CTAS_FIELD_NUMBER = 6;
    private static final SubscriptionCard DEFAULT_INSTANCE;
    public static final int HEADING_ICON_FIELD_NUMBER = 9;
    public static final int LAYOUT_FIELD_NUMBER = 8;
    private static volatile r2n0 PARSER = null;
    public static final int SUBSCRIPTION_ATTRIBUTES_FIELD_NUMBER = 7;
    public static final int SUBSCRIPTION_NAME_FIELD_NUMBER = 4;
    public static final int TOPLINE_ICON_FIELD_NUMBER = 2;
    public static final int TOPLINE_TEXT_FIELD_NUMBER = 3;
    public static final int UBI_ID_FIELD_NUMBER = 100;
    private Badge badge_;
    private int bitField0_;
    private Icon headingIcon_;
    private int layout_;
    private ColorizedString subscriptionName_;
    private Icon toplineIcon_;
    private ColorizedString toplineText_;
    private ae50 avatars_ = AbstractC0269h.emptyProtobufList();
    private ae50 ctas_ = AbstractC0269h.emptyProtobufList();
    private ae50 subscriptionAttributes_ = AbstractC0269h.emptyProtobufList();
    private String ubiId_ = "";

    static {
        SubscriptionCard subscriptionCard = new SubscriptionCard();
        DEFAULT_INSTANCE = subscriptionCard;
        AbstractC0269h.registerDefaultInstance(SubscriptionCard.class, subscriptionCard);
    }

    private SubscriptionCard() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static SubscriptionCard m21768q() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001d\n\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006\u001b\u0007\u001b\b\f\tဉ\u0004dለ\u0005", new Object[]{"bitField0_", "badge_", "toplineIcon_", "toplineText_", "subscriptionName_", "avatars_", Avatar.class, "ctas_", Cta.class, "subscriptionAttributes_", SubscriptionAttribute.class, "layout_", "headingIcon_", "ubiId_"});
        }
        if (iOrdinal == 3) {
            return new SubscriptionCard();
        }
        if (iOrdinal == 4) {
            return new cm51(DEFAULT_INSTANCE, 11);
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
        synchronized (SubscriptionCard.class) {
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
    public final ae50 m21769n() {
        return this.avatars_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Badge m21770o() {
        Badge badge = this.badge_;
        return badge == null ? Badge.m21701o() : badge;
    }

    /* JADX INFO: renamed from: p */
    public final ae50 m21771p() {
        return this.ctas_;
    }

    /* JADX INFO: renamed from: r */
    public final Icon m21772r() {
        Icon icon = this.headingIcon_;
        return icon == null ? Icon.m21752o() : icon;
    }

    /* JADX INFO: renamed from: s */
    public final zt51 m21773s() {
        zt51 zt51Var;
        int i = this.layout_;
        if (i == 0) {
            zt51Var = zt51.SUBSCRIPTION_CARD_LAYOUT_UNSPECIFIED;
        } else if (i != 1) {
            zt51Var = i != 2 ? null : zt51.SUBSCRIPTION_CARD_LAYOUT_ICON_HEADING;
        } else {
            zt51Var = zt51.SUBSCRIPTION_CARD_LAYOUT_STANDARD;
        }
        return zt51Var == null ? zt51.UNRECOGNIZED : zt51Var;
    }

    /* JADX INFO: renamed from: t */
    public final ae50 m21774t() {
        return this.subscriptionAttributes_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final ColorizedString m21775u() {
        ColorizedString colorizedString = this.subscriptionName_;
        return colorizedString == null ? ColorizedString.m21718o() : colorizedString;
    }

    /* JADX INFO: renamed from: v */
    public final Icon m21776v() {
        Icon icon = this.toplineIcon_;
        return icon == null ? Icon.m21752o() : icon;
    }

    /* JADX INFO: renamed from: w */
    public final ColorizedString m21777w() {
        ColorizedString colorizedString = this.toplineText_;
        return colorizedString == null ? ColorizedString.m21718o() : colorizedString;
    }

    /* JADX INFO: renamed from: x */
    public final String m21778x() {
        return this.ubiId_;
    }
}
