package com.spotify.highlightsstats.data.proto.p076v2;

import com.google.protobuf.AbstractC0269h;
import p204p.og20;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class HighlightPreviewCard extends AbstractC0269h implements sre0 {
    public static final int ARTWORK_FIELD_NUMBER = 3;
    public static final int BACKGROUND_PATTERN_FIELD_NUMBER = 4;
    public static final int COLOR_PALETTE_FIELD_NUMBER = 5;
    private static final HighlightPreviewCard DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int NAVIGATE_FIELD_NUMBER = 6;
    private static volatile r2n0 PARSER = null;
    public static final int SHOULD_GLOW_FIELD_NUMBER = 7;
    public static final int TITLE_FIELD_NUMBER = 2;
    private Artwork artwork_;
    private int bitField0_;
    private Palette colorPalette_;
    private boolean shouldGlow_;
    private Object tapAction_;
    private int tapActionCase_ = 0;
    private String id_ = "";
    private String title_ = "";
    private String backgroundPattern_ = "";

    static {
        HighlightPreviewCard highlightPreviewCard = new HighlightPreviewCard();
        DEFAULT_INSTANCE = highlightPreviewCard;
        AbstractC0269h.registerDefaultInstance(HighlightPreviewCard.class, highlightPreviewCard);
    }

    private HighlightPreviewCard() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ȉ\u0005ဉ\u0001\u0006<\u0000\u0007\u0007", new Object[]{"tapAction_", "tapActionCase_", "bitField0_", "id_", "title_", "artwork_", "backgroundPattern_", "colorPalette_", Actions$NavigateAction.class, "shouldGlow_"});
        }
        if (iOrdinal == 3) {
            return new HighlightPreviewCard();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 19);
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
        synchronized (HighlightPreviewCard.class) {
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
    public final Artwork m11530n() {
        Artwork artwork = this.artwork_;
        return artwork == null ? Artwork.m11504o() : artwork;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final String m11531o() {
        return this.backgroundPattern_;
    }

    /* JADX INFO: renamed from: p */
    public final Palette m11532p() {
        Palette palette = this.colorPalette_;
        return palette == null ? Palette.m11564q() : palette;
    }

    /* JADX INFO: renamed from: q */
    public final Actions$NavigateAction m11533q() {
        return this.tapActionCase_ == 6 ? (Actions$NavigateAction) this.tapAction_ : Actions$NavigateAction.m11497n();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11534r() {
        return this.shouldGlow_;
    }

    /* JADX INFO: renamed from: s */
    public final int m11535s() {
        int i = this.tapActionCase_;
        if (i != 0) {
            return i != 6 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
