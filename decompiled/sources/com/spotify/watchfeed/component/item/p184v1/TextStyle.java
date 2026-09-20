package com.spotify.watchfeed.component.item.p184v1;

import com.google.protobuf.AbstractC0269h;
import p204p.f000;
import p204p.nb3;
import p204p.ore0;
import p204p.pre0;
import p204p.qn61;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class TextStyle extends AbstractC0269h implements sre0 {
    public static final int ALIGNMENT_FIELD_NUMBER = 4;
    private static final TextStyle DEFAULT_INSTANCE;
    public static final int FONT_STYLE_FIELD_NUMBER = 2;
    public static final int MAX_LINES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TEXT_COLOR_FIELD_NUMBER = 1;
    private int alignment_;
    private int fontStyle_;
    private int maxLines_;
    private String textColor_ = "";

    static {
        TextStyle textStyle = new TextStyle();
        DEFAULT_INSTANCE = textStyle;
        AbstractC0269h.registerDefaultInstance(TextStyle.class, textStyle);
    }

    private TextStyle() {
    }

    /* JADX INFO: renamed from: o */
    public static TextStyle m22734o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u0004\u0004\f", new Object[]{"textColor_", "fontStyle_", "maxLines_", "alignment_"});
        }
        if (iOrdinal == 3) {
            return new TextStyle();
        }
        if (iOrdinal == 4) {
            return new qn61(DEFAULT_INSTANCE, 19);
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
        synchronized (TextStyle.class) {
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
    public final nb3 m22735n() {
        nb3 nb3Var;
        int i = this.alignment_;
        if (i == 0) {
            nb3Var = nb3.START;
        } else if (i != 1) {
            nb3Var = i != 2 ? null : nb3.END;
        } else {
            nb3Var = nb3.CENTER;
        }
        return nb3Var == null ? nb3.UNRECOGNIZED : nb3Var;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final f000 m22736p() {
        f000 f000Var;
        switch (this.fontStyle_) {
            case 0:
                f000Var = f000.BODY_MEDIUM;
                break;
            case 1:
                f000Var = f000.BODY_MEDIUM_BOLD;
                break;
            case 2:
                f000Var = f000.TITLE_LARGE;
                break;
            case 3:
                f000Var = f000.HEADLINE_MEDIUM_BLACK_WIDE;
                break;
            case 4:
                f000Var = f000.HEADLINE_MEDIUM_MEDIUM_WIDE;
                break;
            case 5:
                f000Var = f000.TITLE_LARGE_BLACK_WIDE;
                break;
            case 6:
                f000Var = f000.TITLE_LARGE_MEDIUM_WIDE;
                break;
            case 7:
                f000Var = f000.TITLE_SMALL_MEDIUM_WIDE;
                break;
            case 8:
                f000Var = f000.TITLE_SMALL_BLACK_WIDE;
                break;
            default:
                f000Var = null;
                break;
        }
        return f000Var == null ? f000.UNRECOGNIZED : f000Var;
    }

    /* JADX INFO: renamed from: q */
    public final int m22737q() {
        return this.maxLines_;
    }

    /* JADX INFO: renamed from: r */
    public final String m22738r() {
        return this.textColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
