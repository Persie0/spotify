package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.lpq;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class DeleteRequestHeadersRequest extends AbstractC0269h implements sre0 {
    private static final DeleteRequestHeadersRequest DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int REFRESH_INVENTORY_FIELD_NUMBER = 2;
    private String field_ = "";
    private boolean refreshInventory_;

    static {
        DeleteRequestHeadersRequest deleteRequestHeadersRequest = new DeleteRequestHeadersRequest();
        DEFAULT_INSTANCE = deleteRequestHeadersRequest;
        AbstractC0269h.registerDefaultInstance(DeleteRequestHeadersRequest.class, deleteRequestHeadersRequest);
    }

    private DeleteRequestHeadersRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static void m2641n(DeleteRequestHeadersRequest deleteRequestHeadersRequest) {
        deleteRequestHeadersRequest.getClass();
        deleteRequestHeadersRequest.field_ = "device_info";
    }

    /* JADX INFO: renamed from: o */
    public static void m2642o(DeleteRequestHeadersRequest deleteRequestHeadersRequest) {
        deleteRequestHeadersRequest.refreshInventory_ = true;
    }

    /* JADX INFO: renamed from: p */
    public static lpq m2643p() {
        return (lpq) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0007", new Object[]{"field_", "refreshInventory_"});
        }
        if (iOrdinal == 3) {
            return new DeleteRequestHeadersRequest();
        }
        if (iOrdinal == 4) {
            return new lpq(DEFAULT_INSTANCE);
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
        synchronized (DeleteRequestHeadersRequest.class) {
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
