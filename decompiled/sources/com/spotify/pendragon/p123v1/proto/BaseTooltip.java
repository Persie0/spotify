package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.az8;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r281;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class BaseTooltip extends AbstractC0269h implements sre0 {
    public static final int ACCESSORY_CONTENT_FIELD_NUMBER = 3;
    public static final int ALIGNMENT_FIELD_NUMBER = 1;
    public static final int BUTTON_FIELD_NUMBER = 5;
    private static final BaseTooltip DEFAULT_INSTANCE;
    public static final int HEADER_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 2;
    private AccessoryContent accessoryContent_;
    private int alignment_;
    private int bitField0_;
    private Button button_;
    private Header header_;
    private Text text_;

    static {
        BaseTooltip baseTooltip = new BaseTooltip();
        DEFAULT_INSTANCE = baseTooltip;
        AbstractC0269h.registerDefaultInstance(BaseTooltip.class, baseTooltip);
    }

    private BaseTooltip() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static BaseTooltip m17088q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"bitField0_", "alignment_", "text_", "accessoryContent_", "button_", "header_"});
        }
        if (iOrdinal == 3) {
            return new BaseTooltip();
        }
        if (iOrdinal == 4) {
            return new az8(DEFAULT_INSTANCE, 6);
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
        synchronized (BaseTooltip.class) {
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
    public final AccessoryContent m17089n() {
        AccessoryContent accessoryContent = this.accessoryContent_;
        return accessoryContent == null ? AccessoryContent.m16980p() : accessoryContent;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final r281 m17090o() {
        r281 r281Var;
        int i = this.alignment_;
        if (i == 0) {
            r281Var = r281.TOOLTIP_ALIGNMENT_UNKNOWN;
        } else if (i != 1) {
            r281Var = i != 2 ? null : r281.TOOLTIP_ALIGNMENT_STACKED;
        } else {
            r281Var = r281.TOOLTIP_ALIGNMENT_HORIZONTAL;
        }
        return r281Var == null ? r281.UNRECOGNIZED : r281Var;
    }

    /* JADX INFO: renamed from: p */
    public final Button m17091p() {
        Button button = this.button_;
        return button == null ? Button.m17122p() : button;
    }

    /* JADX INFO: renamed from: r */
    public final Header m17092r() {
        Header header = this.header_;
        return header == null ? Header.m17204n() : header;
    }

    /* JADX INFO: renamed from: s */
    public final Text m17093s() {
        Text text = this.text_;
        return text == null ? Text.m17299n() : text;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m17094t() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m17095u() {
        return (this.bitField0_ & 4) != 0;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m17096v() {
        return (this.bitField0_ & 8) != 0;
    }
}
