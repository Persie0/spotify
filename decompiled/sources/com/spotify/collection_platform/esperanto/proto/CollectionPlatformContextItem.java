package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import com.spotify.collection2.itemdata.proto.CollectionItemdata$ItemData;
import p204p.o4f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CollectionPlatformContextItem extends AbstractC0269h implements sre0 {
    public static final int ADD_TIME_FIELD_NUMBER = 2;
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final CollectionPlatformContextItem DEFAULT_INSTANCE;
    public static final int ITEM_DATA_FIELD_NUMBER = 4;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private long addTime_;
    private int bitField0_;
    private CollectionItemdata$ItemData itemData_;
    private String uri_ = "";
    private String contextUri_ = "";

    static {
        CollectionPlatformContextItem collectionPlatformContextItem = new CollectionPlatformContextItem();
        DEFAULT_INSTANCE = collectionPlatformContextItem;
        AbstractC0269h.registerDefaultInstance(CollectionPlatformContextItem.class, collectionPlatformContextItem);
    }

    private CollectionPlatformContextItem() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6865n(CollectionPlatformContextItem collectionPlatformContextItem, String str) {
        collectionPlatformContextItem.getClass();
        str.getClass();
        collectionPlatformContextItem.contextUri_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m6866o(CollectionPlatformContextItem collectionPlatformContextItem, String str) {
        collectionPlatformContextItem.getClass();
        str.getClass();
        collectionPlatformContextItem.uri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static o4f m6867q() {
        return (o4f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003Ȉ\u0004ဉ\u0000", new Object[]{"bitField0_", "uri_", "addTime_", "contextUri_", "itemData_"});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformContextItem();
        }
        if (iOrdinal == 4) {
            return new o4f(DEFAULT_INSTANCE);
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
        synchronized (CollectionPlatformContextItem.class) {
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

    /* JADX INFO: renamed from: p */
    public final String m6868p() {
        return this.contextUri_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
