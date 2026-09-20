package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.na8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class BaseBottomsheet extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 2;
    public static final int BODY_FIELD_NUMBER = 4;
    private static final BaseBottomsheet DEFAULT_INSTANCE;
    public static final int DISCLAIMER_FIELD_NUMBER = 7;
    public static final int HEADER_FIELD_NUMBER = 8;
    public static final int HEADLINE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 5;
    public static final int SECONDARY_BUTTON_FIELD_NUMBER = 6;
    private AccessoryContent accessoryContent_;
    private int bitField0_;
    private Text body_;
    private Disclaimer disclaimer_;
    private Header header_;
    private Text headline_;
    private Button primaryButton_;
    private Button secondaryButton_;

    static {
        BaseBottomsheet baseBottomsheet = new BaseBottomsheet();
        DEFAULT_INSTANCE = baseBottomsheet;
        AbstractC0269h.registerDefaultInstance(BaseBottomsheet.class, baseBottomsheet);
    }

    private BaseBottomsheet() {
    }

    /* JADX INFO: renamed from: p */
    public static BaseBottomsheet m17022p() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0002\b\u0007\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0000", new Object[]{"bitField0_", "accessoryContent_", "headline_", "body_", "primaryButton_", "secondaryButton_", "disclaimer_", "header_"});
        }
        if (iOrdinal == 3) {
            return new BaseBottomsheet();
        }
        if (iOrdinal == 4) {
            return new na8(DEFAULT_INSTANCE, 29);
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
        synchronized (BaseBottomsheet.class) {
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
    public final AccessoryContent m17023n() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.m16980p() : accessoryContent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Text m17024o() {
        Text text = this.body_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: q */
    public final Disclaimer m17025q() {
        Disclaimer disclaimer = this.disclaimer_;
        return disclaimer == null ? Disclaimer.m17154n() : disclaimer;
    }

    /* JADX INFO: renamed from: r */
    public final Header m17026r() {
        Header header = this.header_;
        return header == null ? Header.m17204n() : header;
    }

    /* JADX INFO: renamed from: s */
    public final Text m17027s() {
        Text text = this.headline_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: t */
    public final Button m17028t() {
        Button button = this.primaryButton_;
        return button == null ? Button.m17122p() : button;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Button m17029u() {
        Button button = this.secondaryButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m17030v() {
        return (this.bitField0_ & 2) != 0;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m17031w() {
        return (this.bitField0_ & 64) != 0;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m17032x() {
        return (this.bitField0_ & 1) != 0;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m17033y() {
        return (this.bitField0_ & 16) != 0;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m17034z() {
        return (this.bitField0_ & 32) != 0;
    }
}
