package com.spotify.allboarding.model.p019v1.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.zc40;

/* JADX INFO: loaded from: classes3.dex */
public final class Item extends AbstractC0269h implements sre0 {
    public static final int BANNER_FIELD_NUMBER = 3;
    private static final Item DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PILLMORE_FIELD_NUMBER = 8;
    public static final int PILL_FIELD_NUMBER = 4;
    public static final int SQUARETRACK_FIELD_NUMBER = 9;
    public static final int SQUIRCLEARTISTMORE_FIELD_NUMBER = 2;
    public static final int SQUIRCLEARTIST_FIELD_NUMBER = 1;
    public static final int SQUIRCLESHOWMORE_FIELD_NUMBER = 6;
    public static final int SQUIRCLESHOW_FIELD_NUMBER = 5;
    public static final int TITLEBOX_FIELD_NUMBER = 7;
    private int itemCase_ = 0;
    private Object item_;

    static {
        Item item = new Item();
        DEFAULT_INSTANCE = item;
        AbstractC0269h.registerDefaultInstance(Item.class, item);
    }

    private Item() {
    }

    /* JADX INFO: renamed from: o */
    public static Item m3121o() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"item_", "itemCase_", SquircleArtist.class, SquircleArtistMore.class, Banner.class, Pill.class, SquircleShow.class, SquircleShowMore.class, TitleBox.class, PillMore.class, SquareTrack.class});
        }
        if (iOrdinal == 3) {
            return new Item();
        }
        if (iOrdinal == 4) {
            return new zc40(DEFAULT_INSTANCE, 27);
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
        synchronized (Item.class) {
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
    public final Banner m3122n() {
        return this.itemCase_ == 3 ? (Banner) this.item_ : Banner.m3117n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: p */
    public final int m3123p() {
        switch (this.itemCase_) {
            case 0:
                return 10;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: q */
    public final Pill m3124q() {
        return this.itemCase_ == 4 ? (Pill) this.item_ : Pill.m3132o();
    }

    /* JADX INFO: renamed from: r */
    public final SquircleArtist m3125r() {
        return this.itemCase_ == 1 ? (SquircleArtist) this.item_ : SquircleArtist.m3143n();
    }

    /* JADX INFO: renamed from: s */
    public final SquircleArtistMore m3126s() {
        return this.itemCase_ == 2 ? (SquircleArtistMore) this.item_ : SquircleArtistMore.m3152o();
    }

    /* JADX INFO: renamed from: t */
    public final SquircleShow m3127t() {
        return this.itemCase_ == 5 ? (SquircleShow) this.item_ : SquircleShow.m3159n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final SquircleShowMore m3128u() {
        return this.itemCase_ == 6 ? (SquircleShowMore) this.item_ : SquircleShowMore.m3168o();
    }
}
