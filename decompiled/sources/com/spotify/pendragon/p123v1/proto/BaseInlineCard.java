package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseInlineCard extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 3;
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    public static final int BODY_FIELD_NUMBER = 5;
    public static final int CARD_CTA_BUTTON_FIELD_NUMBER = 9;
    private static final BaseInlineCard DEFAULT_INSTANCE;
    public static final int DISMISS_BUTTON_FIELD_NUMBER = 8;
    public static final int HEADER_FIELD_NUMBER = 10;
    public static final int HEADLINE_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 6;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 7;
    private AccessoryContent accessoryContent_;
    private Background background_;
    private int bitField0_;
    private Text body_;
    private Button cardCtaButton_;
    private Button dismissButton_;
    private Header header_;
    private Text headline_;
    private Button primaryButton_;
    private Button secondaryButton_;

    static {
        BaseInlineCard baseInlineCard = new BaseInlineCard();
        DEFAULT_INSTANCE = baseInlineCard;
        AbstractC0269h.registerDefaultInstance(BaseInlineCard.class, baseInlineCard);
    }

    private BaseInlineCard() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static BaseInlineCard m17050s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m17051A() {
        return (this.bitField0_ & 256) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m17052B() {
        return (this.bitField0_ & 128) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m17053C() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m17054D() {
        return (this.bitField0_ & 32) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m17055E() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဉ\u0000\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\u0001", new Object[]{"bitField0_", "background_", "accessoryContent_", "headline_", "body_", "primaryButton_", "secondaryButton_", "dismissButton_", "cardCtaButton_", "header_"});
        }
        if (iOrdinal == 3) {
            return new BaseInlineCard();
        }
        if (iOrdinal == 4) {
            return new az8(1);
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
        synchronized (BaseInlineCard.class) {
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

    /* JADX INFO: renamed from: o */
    public final AccessoryContent m17056o() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.m16980p() : accessoryContent;
    }

    /* JADX INFO: renamed from: p */
    public final Background m17057p() {
        Background background = this.background_;
        return background == null ? Background.m16987o() : background;
    }

    /* JADX INFO: renamed from: q */
    public final Text m17058q() {
        Text text = this.body_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: r */
    public final Button m17059r() {
        Button button = this.cardCtaButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: t */
    public final Button m17060t() {
        Button button = this.dismissButton_;
        return button == null ? Button.m17122p() : button;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Header m17061u() {
        Header header = this.header_;
        return header == null ? Header.m17204n() : header;
    }

    /* JADX INFO: renamed from: v */
    public final Text m17062v() {
        Text text = this.headline_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: w */
    public final Button m17063w() {
        Button button = this.primaryButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: x */
    public final Button m17064x() {
        Button button = this.secondaryButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m17065y() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m17066z() {
        return (this.bitField0_ & 16) != 0;
    }
}
