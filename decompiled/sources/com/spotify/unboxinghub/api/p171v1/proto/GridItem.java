package com.spotify.unboxinghub.api.p171v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.iw10;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class GridItem extends AbstractC0269h implements sre0 {
    public static final int ACTIVATED_FIELD_NUMBER = 8;
    public static final int BACKGROUND_COLOR_FIELD_NUMBER = 3;
    public static final int BACKGROUND_URI_FIELD_NUMBER = 2;
    public static final int BUTTON_ICON_FIELD_NUMBER = 4;
    private static final GridItem DEFAULT_INSTANCE;
    public static final int GRADIENT_COLOR_FIELD_NUMBER = 9;
    public static final int HIGHLIGHTED_LABEL_FIELD_NUMBER = 10;
    public static final int ID_FIELD_NUMBER = 7;
    public static final int NAVIGATION_URI_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int TINT_COLOR_FIELD_NUMBER = 5;
    public static final int TITLE_FIELD_NUMBER = 1;
    private boolean activated_;
    private int bitField0_;
    private int buttonIcon_;
    private HighlightedLabel highlightedLabel_;
    private String title_ = "";
    private String backgroundUri_ = "";
    private String backgroundColor_ = "";
    private String tintColor_ = "";
    private String navigationUri_ = "";
    private String id_ = "";
    private String gradientColor_ = "";

    static {
        GridItem gridItem = new GridItem();
        DEFAULT_INSTANCE = gridItem;
        AbstractC0269h.registerDefaultInstance(GridItem.class, gridItem);
    }

    private GridItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0007\tȈ\nဉ\u0000", new Object[]{"bitField0_", "title_", "backgroundUri_", "backgroundColor_", "buttonIcon_", "tintColor_", "navigationUri_", "id_", "activated_", "gradientColor_", "highlightedLabel_"});
        }
        if (iOrdinal == 3) {
            return new GridItem();
        }
        if (iOrdinal == 4) {
            return new iw10(DEFAULT_INSTANCE, 11);
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
        synchronized (GridItem.class) {
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

    public final String getId() {
        return this.id_;
    }

    public final String getTitle() {
        return this.title_;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m21972n() {
        return this.activated_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m21973o() {
        return this.backgroundColor_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21974p() {
        return this.backgroundUri_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21975q() {
        return this.gradientColor_;
    }

    /* JADX INFO: renamed from: r */
    public final HighlightedLabel m21976r() {
        HighlightedLabel highlightedLabel = this.highlightedLabel_;
        return highlightedLabel == null ? HighlightedLabel.m21983o() : highlightedLabel;
    }

    /* JADX INFO: renamed from: s */
    public final String m21977s() {
        return this.navigationUri_;
    }

    /* JADX INFO: renamed from: t */
    public final String m21978t() {
        return this.tintColor_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m21979u() {
        return (this.bitField0_ & 1) != 0;
    }
}
