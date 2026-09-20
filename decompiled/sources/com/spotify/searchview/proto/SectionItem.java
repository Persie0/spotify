package com.spotify.searchview.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.h8z0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class SectionItem extends AbstractC0269h implements sre0 {
    public static final int CHAT_STARTER_ITEM_FIELD_NUMBER = 6;
    private static final SectionItem DEFAULT_INSTANCE;
    public static final int DISCOVERY_FEED_ITEM_FIELD_NUMBER = 3;
    public static final int GENERIC_ITEM_FIELD_NUMBER = 2;
    public static final int INSTANT_MIX_ITEM_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int RELATED_SEARCH_ITEM_FIELD_NUMBER = 5;
    public static final int VIDEO_CAROUSEL_ITEM_FIELD_NUMBER = 1;
    private int itemCase_ = 0;
    private Object item_;

    static {
        SectionItem sectionItem = new SectionItem();
        DEFAULT_INSTANCE = sectionItem;
        AbstractC0269h.registerDefaultInstance(SectionItem.class, sectionItem);
    }

    private SectionItem() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"item_", "itemCase_", VideoCarouselItem.class, GenericItem.class, DiscoveryFeedItem.class, InstantMixItem.class, RelatedSearchItem.class, ConversationStarterItem.class});
        }
        if (iOrdinal == 3) {
            return new SectionItem();
        }
        if (iOrdinal == 4) {
            return new h8z0(DEFAULT_INSTANCE, 2);
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
        synchronized (SectionItem.class) {
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
    public final ConversationStarterItem m20906n() {
        return this.itemCase_ == 6 ? (ConversationStarterItem) this.item_ : ConversationStarterItem.m20800o();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final DiscoveryFeedItem m20907o() {
        return this.itemCase_ == 3 ? (DiscoveryFeedItem) this.item_ : DiscoveryFeedItem.m20805n();
    }

    /* JADX INFO: renamed from: p */
    public final GenericItem m20908p() {
        return this.itemCase_ == 2 ? (GenericItem) this.item_ : GenericItem.m20850n();
    }

    /* JADX INFO: renamed from: q */
    public final InstantMixItem m20909q() {
        return this.itemCase_ == 4 ? (InstantMixItem) this.item_ : InstantMixItem.m20855n();
    }

    /* JADX INFO: renamed from: r */
    public final int m20910r() {
        switch (this.itemCase_) {
            case 0:
                return 7;
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
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final RelatedSearchItem m20911s() {
        return this.itemCase_ == 5 ? (RelatedSearchItem) this.item_ : RelatedSearchItem.m20899n();
    }

    /* JADX INFO: renamed from: t */
    public final VideoCarouselItem m20912t() {
        return this.itemCase_ == 1 ? (VideoCarouselItem) this.item_ : VideoCarouselItem.m20936n();
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
