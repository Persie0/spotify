package com.spotify.offline_esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.LinkedHashSet;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.dmw;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes2.dex */
public final class EsOffline$GetItemsRequest extends AbstractC0269h implements sre0 {
    private static final EsOffline$GetItemsRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int URIS_FIELD_NUMBER = 1;
    private ae50 uris_ = AbstractC0269h.emptyProtobufList();

    static {
        EsOffline$GetItemsRequest esOffline$GetItemsRequest = new EsOffline$GetItemsRequest();
        DEFAULT_INSTANCE = esOffline$GetItemsRequest;
        AbstractC0269h.registerDefaultInstance(EsOffline$GetItemsRequest.class, esOffline$GetItemsRequest);
    }

    private EsOffline$GetItemsRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m16149n(EsOffline$GetItemsRequest esOffline$GetItemsRequest, LinkedHashSet linkedHashSet) {
        ae50 ae50Var = esOffline$GetItemsRequest.uris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esOffline$GetItemsRequest.uris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(linkedHashSet, esOffline$GetItemsRequest.uris_);
    }

    /* JADX INFO: renamed from: o */
    public static void m16150o(EsOffline$GetItemsRequest esOffline$GetItemsRequest, String str) {
        esOffline$GetItemsRequest.getClass();
        str.getClass();
        ae50 ae50Var = esOffline$GetItemsRequest.uris_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            esOffline$GetItemsRequest.uris_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        esOffline$GetItemsRequest.uris_.add(str);
    }

    /* JADX INFO: renamed from: p */
    public static dmw m16151p() {
        return (dmw) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"uris_"});
        }
        if (iOrdinal == 3) {
            return new EsOffline$GetItemsRequest();
        }
        if (iOrdinal == 4) {
            return new dmw(DEFAULT_INSTANCE);
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
        synchronized (EsOffline$GetItemsRequest.class) {
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
