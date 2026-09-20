package spotify.collection.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.w2f;
import p204p.z110;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectionContainsRequest extends AbstractC0269h implements sre0 {
    public static final int CONTEXT_URI_FIELD_NUMBER = 3;
    private static final CollectionContainsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int UPDATE_THROTTLING_FIELD_NUMBER = 1;
    public static final int URI_FIELD_NUMBER = 2;
    private int updateThrottling_;
    private ae50 uri_ = AbstractC0269h.emptyProtobufList();
    private String contextUri_ = "";

    static {
        CollectionContainsRequest collectionContainsRequest = new CollectionContainsRequest();
        DEFAULT_INSTANCE = collectionContainsRequest;
        AbstractC0269h.registerDefaultInstance(CollectionContainsRequest.class, collectionContainsRequest);
    }

    private CollectionContainsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m97460n(CollectionContainsRequest collectionContainsRequest, Iterable iterable) {
        ae50 ae50Var = collectionContainsRequest.uri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionContainsRequest.uri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, collectionContainsRequest.uri_);
    }

    /* JADX INFO: renamed from: o */
    public static void m97461o(CollectionContainsRequest collectionContainsRequest, String str) {
        collectionContainsRequest.getClass();
        str.getClass();
        ae50 ae50Var = collectionContainsRequest.uri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionContainsRequest.uri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        collectionContainsRequest.uri_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m97462p(CollectionContainsRequest collectionContainsRequest, String str) {
        collectionContainsRequest.getClass();
        str.getClass();
        collectionContainsRequest.contextUri_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static w2f m97463q() {
        return (w2f) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u000b\u0002Ț\u0003Ȉ", new Object[]{"updateThrottling_", "uri_", "contextUri_"});
        }
        if (iOrdinal == 3) {
            return new CollectionContainsRequest();
        }
        if (iOrdinal == 4) {
            return new w2f(DEFAULT_INSTANCE);
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
        synchronized (CollectionContainsRequest.class) {
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
