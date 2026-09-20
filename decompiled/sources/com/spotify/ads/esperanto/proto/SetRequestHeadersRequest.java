package com.spotify.ads.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.g601;
import p204p.h601;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes4.dex */
public final class SetRequestHeadersRequest extends AbstractC0269h implements sre0 {
    private static final SetRequestHeadersRequest DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int REFRESH_INVENTORY_FIELD_NUMBER = 2;
    public static final int REQUEST_HEADERS_FIELD_NUMBER = 1;
    private boolean refreshInventory_;
    private ihc0 requestHeaders_ = ihc0.f102235b;

    static {
        SetRequestHeadersRequest setRequestHeadersRequest = new SetRequestHeadersRequest();
        DEFAULT_INSTANCE = setRequestHeadersRequest;
        AbstractC0269h.registerDefaultInstance(SetRequestHeadersRequest.class, setRequestHeadersRequest);
    }

    private SetRequestHeadersRequest() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m2695n(SetRequestHeadersRequest setRequestHeadersRequest) {
        ihc0 ihc0Var = setRequestHeadersRequest.requestHeaders_;
        if (!ihc0Var.f102236a) {
            setRequestHeadersRequest.requestHeaders_ = ihc0Var.m50613h();
        }
        return setRequestHeadersRequest.requestHeaders_;
    }

    /* JADX INFO: renamed from: o */
    public static void m2696o(SetRequestHeadersRequest setRequestHeadersRequest, boolean z) {
        setRequestHeadersRequest.refreshInventory_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static g601 m2697p() {
        return (g601) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002\u0007", new Object[]{"requestHeaders_", h601.f87945a, "refreshInventory_"});
        }
        if (iOrdinal == 3) {
            return new SetRequestHeadersRequest();
        }
        if (iOrdinal == 4) {
            return new g601(DEFAULT_INSTANCE);
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
        synchronized (SetRequestHeadersRequest.class) {
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
