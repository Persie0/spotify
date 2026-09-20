package com.spotify.watchfeed.api.p182v1;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.i8w0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class RequestPagination extends AbstractC0269h implements sre0 {
    public static final int CONSUMED_GROUPS_FIELD_NUMBER = 4;
    private static final RequestPagination DEFAULT_INSTANCE;
    public static final int LIMIT_FIELD_NUMBER = 2;
    public static final int OFFSET_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER = null;
    public static final int PREVIOUS_ITEMS_FIELD_NUMBER = 3;
    private int limit_;
    private int offset_;
    private ae50 previousItems_ = AbstractC0269h.emptyProtobufList();
    private ae50 consumedGroups_ = AbstractC0269h.emptyProtobufList();

    static {
        RequestPagination requestPagination = new RequestPagination();
        DEFAULT_INSTANCE = requestPagination;
        AbstractC0269h.registerDefaultInstance(RequestPagination.class, requestPagination);
    }

    private RequestPagination() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u000b\u0002\u000b\u0003\u001b\u0004\u001b", new Object[]{"offset_", "limit_", "previousItems_", ConsumedFeedItem.class, "consumedGroups_", ConsumedGroup.class});
        }
        if (iOrdinal == 3) {
            return new RequestPagination();
        }
        if (iOrdinal == 4) {
            return new i8w0(DEFAULT_INSTANCE, 12);
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
        synchronized (RequestPagination.class) {
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
