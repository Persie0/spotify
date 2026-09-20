package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import p204p.ore0;
import p204p.pre0;
import p204p.q4f;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionPlatformItem extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 2;
    private static final CollectionPlatformItem DEFAULT_INSTANCE;
    public static final int ITEM_DATA_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private long addTime_;
    private int bitField0_;
    private CollectionItemdata$ItemData itemData_;
    private String uri_ = "";

    static {
        CollectionPlatformItem collectionPlatformItem = new CollectionPlatformItem();
        DEFAULT_INSTANCE = collectionPlatformItem;
        AbstractC0269h.registerDefaultInstance(CollectionPlatformItem.class, collectionPlatformItem);
    }

    private CollectionPlatformItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6878n(CollectionPlatformItem collectionPlatformItem, CollectionItemdata$ItemData collectionItemdata$ItemData) {
        collectionPlatformItem.getClass();
        collectionItemdata$ItemData.getClass();
        collectionPlatformItem.itemData_ = collectionItemdata$ItemData;
        collectionPlatformItem.bitField0_ |= 1;
    }

    /* JADX INFO: renamed from: o */
    public static void m6879o(CollectionPlatformItem collectionPlatformItem, String str) {
        collectionPlatformItem.getClass();
        str.getClass();
        collectionPlatformItem.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: s */
    public static q4f m6881s() {
        return (q4f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003ဉ\u0000", new Object[]{"bitField0_", "uri_", "addTime_", "itemData_"});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformItem();
        }
        if (iOrdinal == 4) {
            return new q4f();
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
        synchronized (CollectionPlatformItem.class) {
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

    public final String getUri() {
        return this.uri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: q */
    public final CollectionItemdata$ItemData m6882q() {
        CollectionItemdata$ItemData collectionItemdata$ItemData = this.itemData_;
        return collectionItemdata$ItemData == null ? CollectionItemdata$ItemData.m6821q() : collectionItemdata$ItemData;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m6883r() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
