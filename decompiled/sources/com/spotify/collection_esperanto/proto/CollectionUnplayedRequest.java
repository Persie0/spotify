package com.spotify.collection_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.d6f;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes5.dex */
public final class CollectionUnplayedRequest extends AbstractC0269h implements sre0 {
    private static final CollectionUnplayedRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URI_FIELD_NUMBER = 1;
    private ae50 uri_ = AbstractC0269h.emptyProtobufList();

    static {
        CollectionUnplayedRequest collectionUnplayedRequest = new CollectionUnplayedRequest();
        DEFAULT_INSTANCE = collectionUnplayedRequest;
        AbstractC0269h.registerDefaultInstance(CollectionUnplayedRequest.class, collectionUnplayedRequest);
    }

    private CollectionUnplayedRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m6837n(CollectionUnplayedRequest collectionUnplayedRequest, Iterable iterable) {
        ae50 ae50Var = collectionUnplayedRequest.uri_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            collectionUnplayedRequest.uri_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, collectionUnplayedRequest.uri_);
    }

    /* JADX INFO: renamed from: o */
    public static d6f m6838o() {
        return (d6f) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"uri_"});
        }
        if (iOrdinal == 3) {
            return new CollectionUnplayedRequest();
        }
        if (iOrdinal == 4) {
            return new d6f(DEFAULT_INSTANCE);
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
        synchronized (CollectionUnplayedRequest.class) {
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
