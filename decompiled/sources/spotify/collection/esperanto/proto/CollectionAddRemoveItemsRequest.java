package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.f0f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class CollectionAddRemoveItemsRequest extends AbstractC0269h implements sre0 {
    private static final CollectionAddRemoveItemsRequest DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private ae50 uri_ = AbstractC0269h.emptyProtobufList();
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest = new CollectionAddRemoveItemsRequest();
        DEFAULT_INSTANCE = collectionAddRemoveItemsRequest;
        AbstractC0269h.registerDefaultInstance(CollectionAddRemoveItemsRequest.class, collectionAddRemoveItemsRequest);
    }

    private CollectionAddRemoveItemsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97433n(CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest, List list) {
        ae50 ae50Var = collectionAddRemoveItemsRequest.items_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionAddRemoveItemsRequest.items_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(list, collectionAddRemoveItemsRequest.items_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97434o(CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest, Iterable iterable) {
        ae50 ae50Var = collectionAddRemoveItemsRequest.uri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionAddRemoveItemsRequest.uri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, collectionAddRemoveItemsRequest.uri_);
    }

    /* JADX INFO: renamed from: p */
    public static void m97435p(CollectionAddRemoveItemsRequest collectionAddRemoveItemsRequest, String str) {
        collectionAddRemoveItemsRequest.getClass();
        str.getClass();
        ae50 ae50Var = collectionAddRemoveItemsRequest.uri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionAddRemoveItemsRequest.uri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        collectionAddRemoveItemsRequest.uri_.add(str);
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static f0f m97436q() {
        return (f0f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001Ț\u0002\u001b", new Object[]{"uri_", "items_", CollectionAddRemoveItem.class});
        }
        if (iOrdinal == 3) {
            return new CollectionAddRemoveItemsRequest();
        }
        if (iOrdinal == 4) {
            return new f0f(DEFAULT_INSTANCE);
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
        synchronized (CollectionAddRemoveItemsRequest.class) {
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
