package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.mb3;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class BaseBanner extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 4;
    public static final int ALIGNMENT_FIELD_NUMBER = 2;
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    public static final int BODY_FIELD_NUMBER = 6;
    public static final int CONTENT_BUTTON_FIELD_NUMBER = 12;
    private static final BaseBanner DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 11;
    public static final int DISMISS_BUTTON_FIELD_NUMBER = 9;
    public static final int HEADER_FIELD_NUMBER = 10;
    public static final int HEADLINE_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 7;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 8;
    private AccessoryContent accessoryContent_;
    private int alignment_;
    private Background background_;
    private int bitField0_;
    private Text body_;
    private Button contentButton_;
    private Disclaimer disclaimer_;
    private Button dismissButton_;
    private Header header_;
    private Text headline_;
    private Button primaryButton_;
    private Button secondaryButton_;

    static {
        BaseBanner baseBanner = new BaseBanner();
        DEFAULT_INSTANCE = baseBanner;
        AbstractC0269h.registerDefaultInstance(BaseBanner.class, baseBanner);
    }

    private BaseBanner() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static BaseBanner m17004s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m17005A() {
        return (this.bitField0_ & 512) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m17006B() {
        return (this.bitField0_ & 256) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m17007C() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m17008D() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m17009E() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\u0002\u000bဉ\t\fဉ\n", new Object[]{"bitField0_", "background_", "alignment_", "accessoryContent_", "headline_", "body_", "primaryButton_", "secondaryButton_", "dismissButton_", "header_", "disclaimer_", "contentButton_"});
        }
        if (iOrdinal == 3) {
            return new BaseBanner();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 28);
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
        synchronized (BaseBanner.class) {
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
    public final AccessoryContent m17010n() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.m16980p() : accessoryContent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final mb3 m17011o() {
        mb3 mb3Var;
        int i = this.alignment_;
        if (i == 0) {
            mb3Var = mb3.ALIGNMENT_UNKNOWN;
        } else if (i != 1) {
            mb3Var = i != 2 ? null : mb3.LEADING;
        } else {
            mb3Var = mb3.CENTER;
        }
        return mb3Var == null ? mb3.UNRECOGNIZED : mb3Var;
    }

    /* JADX INFO: renamed from: p */
    public final Background m17012p() {
        Background background = this.background_;
        return background == null ? Background.m16987o() : background;
    }

    /* JADX INFO: renamed from: q */
    public final Text m17013q() {
        Text text = this.body_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: r */
    public final Button m17014r() {
        Button button = this.contentButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: t */
    public final Disclaimer m17015t() {
        Disclaimer disclaimer = this.disclaimer_;
        return disclaimer == null ? Disclaimer.m17154n() : disclaimer;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Button m17016u() {
        Button button = this.dismissButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: v */
    public final Header m17017v() {
        Header header = this.header_;
        return header == null ? Header.m17204n() : header;
    }

    /* JADX INFO: renamed from: w */
    public final Text m17018w() {
        Text text = this.headline_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: x */
    public final Button m17019x() {
        Button button = this.primaryButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: y */
    public final Button m17020y() {
        Button button = this.secondaryButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m17021z() {
        return (this.bitField0_ & 1024) != 0;
    }
}
