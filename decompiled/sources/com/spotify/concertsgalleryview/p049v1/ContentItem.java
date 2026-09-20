package com.spotify.concertsgalleryview.p049v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.saj;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes6.dex */
public final class ContentItem extends AbstractC0269h implements sre0 {
    public static final int CONCERT_CARD_FIELD_NUMBER = 2;
    private static final ContentItem DEFAULT_INSTANCE;
    public static final int EMPTY_STATE_ROW_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int TITLE_ROW_FIELD_NUMBER = 1;
    public static final int VENUE_CARD_FIELD_NUMBER = 4;
    private int contentCase_ = 0;
    private Object content_;

    static {
        ContentItem contentItem = new ContentItem();
        DEFAULT_INSTANCE = contentItem;
        AbstractC0269h.registerDefaultInstance(ContentItem.class, contentItem);
    }

    private ContentItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"content_", "contentCase_", TitleRow.class, ConcertCard.class, EmptyStateRow.class, VenueCard.class});
        }
        if (iOrdinal == 3) {
            return new ContentItem();
        }
        if (iOrdinal == 4) {
            return new saj(DEFAULT_INSTANCE, 16);
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
        synchronized (ContentItem.class) {
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
    public final ConcertCard m7214n() {
        return this.contentCase_ == 2 ? (ConcertCard) this.content_ : ConcertCard.m7210n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final int m7215o() {
        int i = this.contentCase_;
        if (i == 0) {
            return 5;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        return 0;
                    }
                }
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public final EmptyStateRow m7216p() {
        return this.contentCase_ == 3 ? (EmptyStateRow) this.content_ : EmptyStateRow.m7219p();
    }

    /* JADX INFO: renamed from: q */
    public final TitleRow m7217q() {
        return this.contentCase_ == 1 ? (TitleRow) this.content_ : TitleRow.m7231n();
    }

    /* JADX INFO: renamed from: r */
    public final VenueCard m7218r() {
        return this.contentCase_ == 4 ? (VenueCard) this.content_ : VenueCard.m7232n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
