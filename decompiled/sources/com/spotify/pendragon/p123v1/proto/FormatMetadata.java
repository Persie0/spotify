package com.spotify.pendragon.p123v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.byy;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.rbz;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class FormatMetadata extends AbstractC0269h implements sre0 {
    public static final int BANNER_FIELD_NUMBER = 1;
    public static final int BOTTOM_SHEET_FIELD_NUMBER = 2;
    private static final FormatMetadata DEFAULT_INSTANCE;
    public static final int FULLSCREEN_FIELD_NUMBER = 3;
    public static final int INLINE_CARD_FIELD_NUMBER = 4;
    public static final int MODAL_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SNACKBAR_FIELD_NUMBER = 6;
    public static final int TOOLTIP_FIELD_NUMBER = 7;
    public static final int WEB_VIEW_FIELD_NUMBER = 8;
    private int typeCase_ = 0;
    private Object type_;

    static {
        FormatMetadata formatMetadata = new FormatMetadata();
        DEFAULT_INSTANCE = formatMetadata;
        AbstractC0269h.registerDefaultInstance(FormatMetadata.class, formatMetadata);
    }

    private FormatMetadata() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static FormatMetadata m17177q() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"type_", "typeCase_", Banner.class, Bottomsheet.class, Fullscreen.class, InlineCard.class, Modal.class, Snackbar.class, Tooltip.class, Webview.class});
        }
        if (iOrdinal == 3) {
            return new FormatMetadata();
        }
        if (iOrdinal == 4) {
            return new byy(21);
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
        synchronized (FormatMetadata.class) {
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
    public final Banner m17178o() {
        return this.typeCase_ == 1 ? (Banner) this.type_ : Banner.m16997s();
    }

    /* JADX INFO: renamed from: p */
    public final Bottomsheet m17179p() {
        return this.typeCase_ == 2 ? (Bottomsheet) this.type_ : Bottomsheet.m17114s();
    }

    /* JADX INFO: renamed from: r */
    public final Fullscreen m17180r() {
        return this.typeCase_ == 3 ? (Fullscreen) this.type_ : Fullscreen.m17191q();
    }

    /* JADX INFO: renamed from: s */
    public final InlineCard m17181s() {
        return this.typeCase_ == 4 ? (InlineCard) this.type_ : InlineCard.m17230r();
    }

    /* JADX INFO: renamed from: t */
    public final Modal m17182t() {
        return this.typeCase_ == 5 ? (Modal) this.type_ : Modal.m17256r();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Snackbar m17183u() {
        return this.typeCase_ == 6 ? (Snackbar) this.type_ : Snackbar.m17285r();
    }

    /* JADX INFO: renamed from: v */
    public final Tooltip m17184v() {
        return this.typeCase_ == 7 ? (Tooltip) this.type_ : Tooltip.m17305s();
    }

    /* JADX INFO: renamed from: w */
    public final int m17185w() {
        return rbz.m75183a(this.typeCase_);
    }

    /* JADX INFO: renamed from: x */
    public final Webview m17186x() {
        return this.typeCase_ == 8 ? (Webview) this.type_ : Webview.m17315p();
    }
}
