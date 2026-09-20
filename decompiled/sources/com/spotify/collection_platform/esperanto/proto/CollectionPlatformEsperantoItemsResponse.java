package com.spotify.collection_platform.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.List;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z3f;

/* JADX INFO: loaded from: classes5.dex */
public final class CollectionPlatformEsperantoItemsResponse extends AbstractC0269h implements sre0 {
    private static final CollectionPlatformEsperantoItemsResponse DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ae50 items_ = AbstractC0269h.emptyProtobufList();
    private Status status_;

    static {
        CollectionPlatformEsperantoItemsResponse collectionPlatformEsperantoItemsResponse = new CollectionPlatformEsperantoItemsResponse();
        DEFAULT_INSTANCE = collectionPlatformEsperantoItemsResponse;
        AbstractC0269h.registerDefaultInstance(CollectionPlatformEsperantoItemsResponse.class, collectionPlatformEsperantoItemsResponse);
    }

    private CollectionPlatformEsperantoItemsResponse() {
    }

    /* JADX INFO: renamed from: o */
    public static CollectionPlatformEsperantoItemsResponse m6874o(byte[] bArr) {
        return (CollectionPlatformEsperantoItemsResponse) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "status_", "items_", CollectionPlatformItem.class});
        }
        if (iOrdinal == 3) {
            return new CollectionPlatformEsperantoItemsResponse();
        }
        if (iOrdinal == 4) {
            return new z3f(DEFAULT_INSTANCE, 13);
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
        synchronized (CollectionPlatformEsperantoItemsResponse.class) {
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

    public final List getItemsList() {
        return this.items_;
    }

    /* JADX INFO: renamed from: n */
    public final Status m6875n() {
        Status status = this.status_;
        return status == null ? Status.m6894p() : status;
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
