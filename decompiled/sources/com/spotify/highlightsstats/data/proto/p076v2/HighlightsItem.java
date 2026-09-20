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
public final class HighlightsItem extends AbstractC0269h implements sre0 {
    public static final int BACKGROUND_PATTERN_FIELD_NUMBER = 2;
    public static final int COLOR_PALETTE_FIELD_NUMBER = 1;
    private static final HighlightsItem DEFAULT_INSTANCE;
    public static final int HERO_FIELD_NUMBER = 3;
    public static final int ID_FIELD_NUMBER = 7;
    private static volatile r2n0 PARSER = null;
    public static final int RANKED_LIST2_FIELD_NUMBER = 8;
    public static final int SHOULD_GLOW_FIELD_NUMBER = 9;
    public static final int STACKED1_FIELD_NUMBER = 4;
    public static final int STACKED2_FIELD_NUMBER = 5;
    public static final int STACKED3_FIELD_NUMBER = 6;
    private int bitField0_;
    private Palette colorPalette_;
    private Object content_;
    private boolean shouldGlow_;
    private int contentCase_ = 0;
    private String backgroundPattern_ = "";
    private String id_ = "";

    static {
        HighlightsItem highlightsItem = new HighlightsItem();
        DEFAULT_INSTANCE = highlightsItem;
        AbstractC0269h.registerDefaultInstance(HighlightsItem.class, highlightsItem);
    }

    private HighlightsItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007Ȉ\b<\u0000\t\u0007", new Object[]{"content_", "contentCase_", "bitField0_", "colorPalette_", "backgroundPattern_", Hero.class, Stacked1.class, Stacked2.class, Stacked3.class, "id_", RankedList2.class, "shouldGlow_"});
        }
        if (iOrdinal == 3) {
            return new HighlightsItem();
        }
        if (iOrdinal == 4) {
            return new og20(DEFAULT_INSTANCE, 27);
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
        synchronized (HighlightsItem.class) {
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

    /* JADX INFO: renamed from: n */
    public final String m11536n() {
        return this.backgroundPattern_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final Palette m11537o() {
        Palette palette = this.colorPalette_;
        return palette == null ? Palette.m11564q() : palette;
    }

    /* JADX INFO: renamed from: p */
    public final int m11538p() {
        int i = this.contentCase_;
        if (i == 0) {
            return 6;
        }
        if (i == 8) {
            return 5;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 0 : 4;
        }
        return 3;
    }

    /* JADX INFO: renamed from: q */
    public final Hero m11539q() {
        return this.contentCase_ == 3 ? (Hero) this.content_ : Hero.m11523q();
    }

    /* JADX INFO: renamed from: r */
    public final RankedList2 m11540r() {
        return this.contentCase_ == 8 ? (RankedList2) this.content_ : RankedList2.m11589n();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11541s() {
        return this.shouldGlow_;
    }

    /* JADX INFO: renamed from: t */
    public final Stacked1 m11542t() {
        return this.contentCase_ == 4 ? (Stacked1) this.content_ : Stacked1.m11655o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final Stacked2 m11543u() {
        return this.contentCase_ == 5 ? (Stacked2) this.content_ : Stacked2.m11658o();
    }

    /* JADX INFO: renamed from: v */
    public final Stacked3 m11544v() {
        return this.contentCase_ == 6 ? (Stacked3) this.content_ : Stacked3.m11663n();
    }
}
