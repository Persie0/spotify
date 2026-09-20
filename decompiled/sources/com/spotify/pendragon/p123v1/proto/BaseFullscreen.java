package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.EnumC2613yh;
import p204p.az8;
import p204p.dfj;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class BaseFullscreen extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 2;
    public static final int ACCESSORY_CONTENT_SIZE_FIELD_NUMBER = 9;
    public static final int BACKGROUND_FIELD_NUMBER = 1;
    public static final int BODY_FIELD_NUMBER = 4;
    public static final int CONTENT_ALIGNMENT_FIELD_NUMBER = 8;
    private static final BaseFullscreen DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 7;
    public static final int HEADLINE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 5;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
    private int accessoryContentSize_;
    private AccessoryContent accessoryContent_;
    private Background background_;
    private int bitField0_;
    private Text body_;
    private int contentAlignment_;
    private Disclaimer disclaimer_;
    private Text headline_;
    private Button primaryButton_;
    private Button secondaryButton_;

    static {
        BaseFullscreen baseFullscreen = new BaseFullscreen();
        DEFAULT_INSTANCE = baseFullscreen;
        AbstractC0269h.registerDefaultInstance(BaseFullscreen.class, baseFullscreen);
    }

    private BaseFullscreen() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static BaseFullscreen m17035s() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m17036A() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b\f\t\f", new Object[]{"bitField0_", "background_", "accessoryContent_", "headline_", "body_", "primaryButton_", "secondaryButton_", "disclaimer_", "contentAlignment_", "accessoryContentSize_"});
        }
        if (iOrdinal == 3) {
            return new BaseFullscreen();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 0);
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
        synchronized (BaseFullscreen.class) {
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
    public final AccessoryContent m17037n() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.m16980p() : accessoryContent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final EnumC2613yh m17038o() {
        EnumC2613yh enumC2613yhM93614a = EnumC2613yh.m93614a(this.accessoryContentSize_);
        return enumC2613yhM93614a == null ? EnumC2613yh.UNRECOGNIZED : enumC2613yhM93614a;
    }

    /* JADX INFO: renamed from: p */
    public final Background m17039p() {
        Background background = this.background_;
        return background == null ? Background.m16987o() : background;
    }

    /* JADX INFO: renamed from: q */
    public final Text m17040q() {
        Text text = this.body_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: r */
    public final dfj m17041r() {
        dfj dfjVarM35897a = dfj.m35897a(this.contentAlignment_);
        return dfjVarM35897a == null ? dfj.UNRECOGNIZED : dfjVarM35897a;
    }

    /* JADX INFO: renamed from: t */
    public final Disclaimer m17042t() {
        Disclaimer disclaimer = this.disclaimer_;
        return disclaimer == null ? Disclaimer.m17154n() : disclaimer;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Text m17043u() {
        Text text = this.headline_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: v */
    public final Button m17044v() {
        Button button = this.primaryButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: w */
    public final Button m17045w() {
        Button button = this.secondaryButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m17046x() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m17047y() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m17048z() {
        return (this.bitField0_ & 16) != 0;
    }
}
