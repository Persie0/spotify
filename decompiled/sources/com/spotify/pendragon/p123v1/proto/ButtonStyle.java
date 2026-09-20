package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.hta;
import p204p.ore0;
import p204p.osa;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.yta;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonStyle extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 2;
    public static final int BUTTON_ICON_ALIGNMENT_FIELD_NUMBER = 7;
    public static final int BUTTON_TYPE_FIELD_NUMBER = 5;
    private static final ButtonStyle DEFAULT_INSTANCE;
    public static final int FONT_OVERRIDE_FIELD_NUMBER = 6;
    public static final int ICON_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 3;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private int buttonIconAlignment_;
    private int buttonType_;
    private int fontOverride_;
    private Icon icon_;
    private String text_ = "";
    private String backgroundColor_ = "";
    private String textColor_ = "";

    static {
        ButtonStyle buttonStyle = new ButtonStyle();
        DEFAULT_INSTANCE = buttonStyle;
        AbstractC0269h.registerDefaultInstance(ButtonStyle.class, buttonStyle);
    }

    private ButtonStyle() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static ButtonStyle m17127r() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"bitField0_", "text_", "backgroundColor_", "textColor_", "icon_", "buttonType_", "fontOverride_", "buttonIconAlignment_"});
        }
        if (iOrdinal == 3) {
            return new ButtonStyle();
        }
        if (iOrdinal == 4) {
            return new osa(1);
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
        synchronized (ButtonStyle.class) {
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
    public final String m17128o() {
        return this.backgroundColor_;
    }

    /* JADX INFO: renamed from: p */
    public final hta m17129p() {
        hta htaVar;
        int i = this.buttonIconAlignment_;
        if (i == 0) {
            htaVar = hta.BUTTON_ICON_ALIGNMENT_UNKNOWN;
        } else if (i != 1) {
            htaVar = i != 2 ? null : hta.BUTTON_ICON_ALIGNMENT_TRAILING;
        } else {
            htaVar = hta.BUTTON_ICON_ALIGNMENT_LEADING;
        }
        return htaVar == null ? hta.UNRECOGNIZED : htaVar;
    }

    /* JADX INFO: renamed from: q */
    public final yta m17130q() {
        yta ytaVar;
        int i = this.buttonType_;
        if (i == 0) {
            ytaVar = yta.UNKNOWN_BUTTON_TYPE;
        } else if (i == 1) {
            ytaVar = yta.PRIMARY;
        } else if (i != 2) {
            ytaVar = i != 3 ? null : yta.TEXT_LINK;
        } else {
            ytaVar = yta.TERTIARY;
        }
        return ytaVar == null ? yta.UNRECOGNIZED : ytaVar;
    }

    /* JADX INFO: renamed from: s */
    public final Icon m17131s() {
        Icon icon = this.icon_;
        return icon == null ? Icon.m17217p() : icon;
    }

    /* JADX INFO: renamed from: t */
    public final String m17132t() {
        return this.text_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final String m17133u() {
        return this.textColor_;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m17134v() {
        return (this.bitField0_ & 8) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m17135w() {
        return (this.bitField0_ & 1) != 0;
    }
}
