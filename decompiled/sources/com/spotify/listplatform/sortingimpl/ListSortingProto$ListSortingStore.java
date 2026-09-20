package com.spotify.listplatform.sortingimpl;

import com.google.protobuf.AbstractC0269h;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.w490;
import p204p.x490;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ListSortingProto$ListSortingStore extends AbstractC0269h implements sre0 {
    private static final ListSortingProto$ListSortingStore DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int USER_SORT_ORDERS_FIELD_NUMBER = 1;
    private ihc0 userSortOrders_ = ihc0.f102235b;

    static {
        ListSortingProto$ListSortingStore listSortingProto$ListSortingStore = new ListSortingProto$ListSortingStore();
        DEFAULT_INSTANCE = listSortingProto$ListSortingStore;
        AbstractC0269h.registerDefaultInstance(ListSortingProto$ListSortingStore.class, listSortingProto$ListSortingStore);
    }

    private ListSortingProto$ListSortingStore() {
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m13011n(ListSortingProto$ListSortingStore listSortingProto$ListSortingStore) {
        ihc0 ihc0Var = listSortingProto$ListSortingStore.userSortOrders_;
        if (!ihc0Var.f102236a) {
            listSortingProto$ListSortingStore.userSortOrders_ = ihc0Var.m50613h();
        }
        return listSortingProto$ListSortingStore.userSortOrders_;
    }

    /* JADX INFO: renamed from: o */
    public static ListSortingProto$ListSortingStore m13012o() {
        return DEFAULT_INSTANCE;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ListSortingProto$ListSortingStore m13013q(FileInputStream fileInputStream) {
        return (ListSortingProto$ListSortingStore) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, fileInputStream);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"userSortOrders_", x490.f258021a});
        }
        if (iOrdinal == 3) {
            return new ListSortingProto$ListSortingStore();
        }
        if (iOrdinal == 4) {
            return new w490(DEFAULT_INSTANCE);
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
        synchronized (ListSortingProto$ListSortingStore.class) {
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

    /* JADX INFO: renamed from: p */
    public final Map m13014p() {
        return Collections.unmodifiableMap(this.userSortOrders_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
