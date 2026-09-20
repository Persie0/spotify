package com.spotify.collection2.itemdata.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.list_collection.save_source.proto.SaveSource;
import p204p.f4f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionItemdata$ItemData extends AbstractC0269h implements sre0 {
    public static final int ARTISTBAN_ITEM_DATA_FIELD_NUMBER = 1003;
    public static final int BAN_INTENT_ITEM_DATA_FIELD_NUMBER = 1004;
    public static final int BAN_ITEM_DATA_FIELD_NUMBER = 1002;
    private static final CollectionItemdata$ItemData DEFAULT_INSTANCE;
    public static final int HIDDEN_FROM_HOME_ITEM_DATA_FIELD_NUMBER = 1008;
    public static final int ISBN_SCAN_ITEM_DATA_FIELD_NUMBER = 1009;
    public static final int PAGE_MATCH_ITEM_DATA_FIELD_NUMBER = 1007;
    private static volatile r2n0 PARSER = null;
    public static final int PLAY_CONTEXT_BANS_ITEM_DATA_FIELD_NUMBER = 1001;
    public static final int RATING_ITEM_DATA_FIELD_NUMBER = 1006;
    public static final int SAVE_SOURCE_FIELD_NUMBER = 1;
    public static final int SNOOZEDRECS_ITEM_DATA_FIELD_NUMBER = 1005;
    public static final int YL_FILTER_ITEM_DATA_FIELD_NUMBER = 1011;
    private int bitField0_;
    private int dataCase_ = 0;
    private Object data_;
    private SaveSource saveSource_;

    static {
        CollectionItemdata$ItemData collectionItemdata$ItemData = new CollectionItemdata$ItemData();
        DEFAULT_INSTANCE = collectionItemdata$ItemData;
        AbstractC0269h.registerDefaultInstance(CollectionItemdata$ItemData.class, collectionItemdata$ItemData);
    }

    private CollectionItemdata$ItemData() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6818n(CollectionItemdata$ItemData collectionItemdata$ItemData, CollectionItemdata$PageMatchItemData collectionItemdata$PageMatchItemData) {
        collectionItemdata$ItemData.getClass();
        collectionItemdata$PageMatchItemData.getClass();
        collectionItemdata$ItemData.data_ = collectionItemdata$PageMatchItemData;
        collectionItemdata$ItemData.dataCase_ = 1007;
    }

    /* JADX INFO: renamed from: o */
    public static void m6819o(CollectionItemdata$ItemData collectionItemdata$ItemData, SaveSource saveSource) {
        collectionItemdata$ItemData.getClass();
        saveSource.getClass();
        collectionItemdata$ItemData.saveSource_ = saveSource;
        collectionItemdata$ItemData.bitField0_ |= 1;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static CollectionItemdata$ItemData m6821q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: v */
    public static f4f m6822v() {
        return (f4f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0001\u0001ϳ\u000b\u0000\u0000\u0000\u0001ဉ\u0000ϩ<\u0000Ϫ<\u0000ϫ<\u0000Ϭ<\u0000ϭ<\u0000Ϯ<\u0000ϯ<\u0000ϰ<\u0000ϱ<\u0000ϳ<\u0000", new Object[]{"data_", "dataCase_", "bitField0_", "saveSource_", CollectionItemdata$PlayContextBansItemData.class, CollectionItemdata$BanItemData.class, CollectionItemdata$ArtistBanItemData.class, CollectionItemdata$BanIntentItemData.class, CollectionItemdata$SnoozedRecsItemData.class, CollectionItemdata$RatingItemData.class, CollectionItemdata$PageMatchItemData.class, CollectionItemdata$HiddenFromHomeItemData.class, CollectionItemdata$IsbnScanItemData.class, CollectionItemdata$YlFilterItemData.class});
        }
        if (iOrdinal == 3) {
            return new CollectionItemdata$ItemData();
        }
        if (iOrdinal == 4) {
            return new f4f();
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
        synchronized (CollectionItemdata$ItemData.class) {
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

    /* JADX INFO: renamed from: r */
    public final CollectionItemdata$IsbnScanItemData m6823r() {
        return this.dataCase_ == 1009 ? (CollectionItemdata$IsbnScanItemData) this.data_ : CollectionItemdata$IsbnScanItemData.m6815n();
    }

    /* JADX INFO: renamed from: s */
    public final CollectionItemdata$PageMatchItemData m6824s() {
        return this.dataCase_ == 1007 ? (CollectionItemdata$PageMatchItemData) this.data_ : CollectionItemdata$PageMatchItemData.m6828o();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m6825t() {
        return this.dataCase_ == 1009;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m6826u() {
        return this.dataCase_ == 1007;
    }
}
