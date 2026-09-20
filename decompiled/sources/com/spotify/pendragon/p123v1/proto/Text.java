package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.emu;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class Text extends AbstractC0269h implements sre0 {
    private static final Text DEFAULT_INSTANCE;
    public static final int FONT_OVERRIDE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 2;
    public static final int TEXT_FIELD_NUMBER = 1;
    private int bitField0_;
    private int fontOverride_;
    private String text_ = "";
    private String textColor_ = "";

    static {
        Text text = new Text();
        DEFAULT_INSTANCE = text;
        AbstractC0269h.registerDefaultInstance(Text.class, text);
    }

    private Text() {
    }

    /* JADX INFO: renamed from: n */
    public static Text m17299n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဌ\u0000", new Object[]{"bitField0_", "text_", "textColor_", "fontOverride_"});
        }
        if (iOrdinal == 3) {
            return new Text();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 10);
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
        synchronized (Text.class) {
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
    public final emu m17300o() {
        emu emuVar;
        switch (this.fontOverride_) {
            case 0:
                emuVar = emu.UNKNOWN_FONT;
                break;
            case 1:
                emuVar = emu.HEADLINE_LARGE;
                break;
            case 2:
                emuVar = emu.HEADLINE_MEDIUM;
                break;
            case 3:
                emuVar = emu.TITLE_LARGE;
                break;
            case 4:
                emuVar = emu.TITLE_MEDIUM;
                break;
            case 5:
                emuVar = emu.TITLE_SMALL;
                break;
            case 6:
                emuVar = emu.BODY_MEDIUM;
                break;
            case 7:
                emuVar = emu.BODY_MEDIUM_BOLD;
                break;
            case 8:
                emuVar = emu.BODY_SMALL;
                break;
            case 9:
                emuVar = emu.BODY_SMALL_BOLD;
                break;
            case 10:
                emuVar = emu.MARGINAL;
                break;
            case 11:
                emuVar = emu.MARGINAL_BOLD;
                break;
            default:
                emuVar = null;
                break;
        }
        return emuVar == null ? emu.UNRECOGNIZED : emuVar;
    }

    /* JADX INFO: renamed from: p */
    public final String m17301p() {
        return this.text_;
    }

    /* JADX INFO: renamed from: q */
    public final String m17302q() {
        return this.textColor_;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m17303r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
