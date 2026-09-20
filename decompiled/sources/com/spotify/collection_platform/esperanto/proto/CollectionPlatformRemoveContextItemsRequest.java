package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.r5f;
import p204p.s4f;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CollectionPlatformRemoveContextItemsRequest extends AbstractC0269h implements sre0 {
    private static final CollectionPlatformRemoveContextItemsRequest DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int SET_FIELD_NUMBER = 1;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private int set_;

    static {
        CollectionPlatformRemoveContextItemsRequest collectionPlatformRemoveContextItemsRequest = new CollectionPlatformRemoveContextItemsRequest();
        DEFAULT_INSTANCE = collectionPlatformRemoveContextItemsRequest;
        AbstractC0269h.registerDefaultInstance(CollectionPlatformRemoveContextItemsRequest.class, collectionPlatformRemoveContextItemsRequest);
    }

    private CollectionPlatformRemoveContextItemsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6890n(CollectionPlatformRemoveContextItemsRequest collectionPlatformRemoveContextItemsRequest, CollectionPlatformContextItem collectionPlatformContextItem) {
        collectionPlatformRemoveContextItemsRequest.getClass();
        ae50 ae50Var = collectionPlatformRemoveContextItemsRequest.items_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionPlatformRemoveContextItemsRequest.items_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        collectionPlatformRemoveContextItemsRequest.items_.add(collectionPlatformContextItem);
    }

    /* JADX INFO: renamed from: o */
    public static void m6891o(CollectionPlatformRemoveContextItemsRequest collectionPlatformRemoveContextItemsRequest) {
        collectionPlatformRemoveContextItemsRequest.getClass();
        collectionPlatformRemoveContextItemsRequest.set_ = r5f.HOME_HIDES.getNumber();
    }

    /* JADX INFO: renamed from: p */
    public static s4f m6892p() {
        return (s4f) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"set_", "items_", CollectionPlatformContextItem.class});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformRemoveContextItemsRequest();
        }
        if (iOrdinal == 4) {
            return new s4f(DEFAULT_INSTANCE);
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
        synchronized (CollectionPlatformRemoveContextItemsRequest.class) {
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
