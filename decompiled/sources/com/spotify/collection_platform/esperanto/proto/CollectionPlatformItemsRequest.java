package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r4f;
import p204p.r5f;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionPlatformItemsRequest extends AbstractC0269h implements sre0 {
    public static final int COLLECTION_ITEMS_FIELD_NUMBER = 3;
    private static final CollectionPlatformItemsRequest DEFAULT_INSTANCE;
    public static final int INCLUDE_ITEM_DATA_FIELD_NUMBER = 4;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SET_FIELD_NUMBER = 1;
    private boolean includeItemData_;
    private int set_;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private ae50 collectionItems_ = AbstractC0269h.emptyProtobufList();

    static {
        CollectionPlatformItemsRequest collectionPlatformItemsRequest = new CollectionPlatformItemsRequest();
        DEFAULT_INSTANCE = collectionPlatformItemsRequest;
        AbstractC0269h.registerDefaultInstance(CollectionPlatformItemsRequest.class, collectionPlatformItemsRequest);
    }

    private CollectionPlatformItemsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6884n(CollectionPlatformItemsRequest collectionPlatformItemsRequest, Iterable iterable) {
        ae50 ae50Var = collectionPlatformItemsRequest.items_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionPlatformItemsRequest.items_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, collectionPlatformItemsRequest.items_);
    }

    /* JADX INFO: renamed from: o */
    public static void m6885o(CollectionPlatformItemsRequest collectionPlatformItemsRequest, CollectionPlatformItem collectionPlatformItem) {
        collectionPlatformItemsRequest.getClass();
        collectionPlatformItem.getClass();
        ae50 ae50Var = collectionPlatformItemsRequest.collectionItems_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionPlatformItemsRequest.collectionItems_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        collectionPlatformItemsRequest.collectionItems_.add(collectionPlatformItem);
    }

    /* JADX INFO: renamed from: p */
    public static void m6886p(CollectionPlatformItemsRequest collectionPlatformItemsRequest, String str) {
        collectionPlatformItemsRequest.getClass();
        str.getClass();
        ae50 ae50Var = collectionPlatformItemsRequest.items_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionPlatformItemsRequest.items_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        collectionPlatformItemsRequest.items_.add(str);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static void m6887q(CollectionPlatformItemsRequest collectionPlatformItemsRequest) {
        collectionPlatformItemsRequest.includeItemData_ = true;
    }

    /* JADX INFO: renamed from: r */
    public static void m6888r(CollectionPlatformItemsRequest collectionPlatformItemsRequest, r5f r5fVar) {
        collectionPlatformItemsRequest.getClass();
        collectionPlatformItemsRequest.set_ = r5fVar.getNumber();
    }

    /* JADX INFO: renamed from: s */
    public static r4f m6889s() {
        return (r4f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\f\u0002Ț\u0003\u001b\u0004\u0007", new Object[]{"set_", "items_", "collectionItems_", CollectionPlatformItem.class, "includeItemData_"});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformItemsRequest();
        }
        if (iOrdinal == 4) {
            return new r4f(DEFAULT_INSTANCE);
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
        synchronized (CollectionPlatformItemsRequest.class) {
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

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
