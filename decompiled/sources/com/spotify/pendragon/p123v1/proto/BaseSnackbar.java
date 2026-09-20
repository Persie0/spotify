package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class BaseSnackbar extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 3;
    public static final int BODY_FIELD_NUMBER = 2;
    private static final BaseSnackbar DEFAULT_INSTANCE;
    public static final int DISMISS_BUTTON_FIELD_NUMBER = 5;
    public static final int HEADER_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 4;
    private AccessoryContent accessoryContent_;
    private int bitField0_;
    private Text body_;
    private Button dismissButton_;
    private Header header_;
    private Button primaryButton_;

    static {
        BaseSnackbar baseSnackbar = new BaseSnackbar();
        DEFAULT_INSTANCE = baseSnackbar;
        AbstractC0269h.registerDefaultInstance(BaseSnackbar.class, baseSnackbar);
    }

    private BaseSnackbar() {
    }

    /* JADX INFO: renamed from: p */
    public static BaseSnackbar m17081p() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "header_", "body_", "accessoryContent_", "primaryButton_", "dismissButton_"});
        }
        if (iOrdinal == 3) {
            return new BaseSnackbar();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 3);
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
        synchronized (BaseSnackbar.class) {
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
    public final AccessoryContent m17082n() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.m16980p() : accessoryContent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Text m17083o() {
        Text text = this.body_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: q */
    public final Button m17084q() {
        Button button = this.dismissButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: r */
    public final Header m17085r() {
        Header header = this.header_;
        return header == null ? Header.m17204n() : header;
    }

    /* JADX INFO: renamed from: s */
    public final Button m17086s() {
        Button button = this.primaryButton_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17087t() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
