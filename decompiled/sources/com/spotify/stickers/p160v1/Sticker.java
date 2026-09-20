package com.spotify.stickers.p160v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.nr41;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class Sticker extends AbstractC0269h implements sre0 {
    private static final Sticker DEFAULT_INSTANCE;
    public static final int FILTER_TAG_IDS_FIELD_NUMBER = 4;
    public static final int GRAPHIC_STICKER_FIELD_NUMBER = 6;
    public static final int IMAGE_ALT_TEXT_FIELD_NUMBER = 3;
    public static final int IMAGE_URI_FIELD_NUMBER = 2;
    public static final int LYRICS_STICKER_FIELD_NUMBER = 5;
    private static volatile r2n0 PARSER = null;
    public static final int SEARCH_TAGS_FIELD_NUMBER = 7;
    public static final int STICKER_ID_FIELD_NUMBER = 1;
    private Object stickerType_;
    private int stickerTypeCase_ = 0;
    private String stickerId_ = "";
    private String imageUri_ = "";
    private String imageAltText_ = "";
    private ae50 filterTagIds_ = AbstractC0269h.emptyProtobufList();
    private ae50 searchTags_ = AbstractC0269h.emptyProtobufList();

    static {
        Sticker sticker = new Sticker();
        DEFAULT_INSTANCE = sticker;
        AbstractC0269h.registerDefaultInstance(Sticker.class, sticker);
    }

    private Sticker() {
    }

    /* JADX INFO: renamed from: n */
    public static Sticker m21593n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț\u0005<\u0000\u0006<\u0000\u0007Ț", new Object[]{"stickerType_", "stickerTypeCase_", "stickerId_", "imageUri_", "imageAltText_", "filterTagIds_", LyricsSticker.class, GraphicSticker.class, "searchTags_"});
        }
        if (iOrdinal == 3) {
            return new Sticker();
        }
        if (iOrdinal == 4) {
            return new nr41(DEFAULT_INSTANCE, 18);
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
        synchronized (Sticker.class) {
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

    public final String getStickerId() {
        return this.stickerId_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final ae50 m21594o() {
        return this.filterTagIds_;
    }

    /* JADX INFO: renamed from: p */
    public final String m21595p() {
        return this.imageAltText_;
    }

    /* JADX INFO: renamed from: q */
    public final String m21596q() {
        return this.imageUri_;
    }

    /* JADX INFO: renamed from: r */
    public final LyricsSticker m21597r() {
        return this.stickerTypeCase_ == 5 ? (LyricsSticker) this.stickerType_ : LyricsSticker.m21587n();
    }

    /* JADX INFO: renamed from: s */
    public final ae50 m21598s() {
        return this.searchTags_;
    }

    /* JADX INFO: renamed from: t */
    public final int m21599t() {
        int i = this.stickerTypeCase_;
        if (i == 0) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 2;
        }
        return 1;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
