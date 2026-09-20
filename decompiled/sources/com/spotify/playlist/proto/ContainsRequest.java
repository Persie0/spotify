package com.spotify.playlist.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.tcj;
import p204p.z110;

/* JADX INFO: loaded from: classes9.dex */
public final class ContainsRequest extends AbstractC0269h implements sre0 {
    private static final ContainsRequest DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();

    static {
        ContainsRequest containsRequest = new ContainsRequest();
        DEFAULT_INSTANCE = containsRequest;
        AbstractC0269h.registerDefaultInstance(ContainsRequest.class, containsRequest);
    }

    private ContainsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m18468n(ContainsRequest containsRequest, Iterable iterable) {
        ae50 ae50Var = containsRequest.items_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            containsRequest.items_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(iterable, containsRequest.items_);
    }

    /* JADX INFO: renamed from: o */
    public static tcj m18469o() {
        return (tcj) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"items_"});
        }
        if (iOrdinal == 3) {
            return new ContainsRequest();
        }
        if (iOrdinal == 4) {
            return new tcj(DEFAULT_INSTANCE);
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
        synchronized (ContainsRequest.class) {
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
