package com.spotify.listplatform.sortingimpl;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.a590;
import p204p.b590;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.z110;
import p204p.z490;

/* JADX INFO: loaded from: classes7.dex */
public final class ListSortingProto$UserSortOrders extends AbstractC0269h implements sre0 {
    private static final ListSortingProto$UserSortOrders DEFAULT_INSTANCE;
    private static volatile r2n0 PARSER = null;
    public static final int PROVIDED_SORT_ORDERS_FIELD_NUMBER = 2;
    public static final int SORT_ORDERS_FIELD_NUMBER = 1;
    private ihc0 providedSortOrders_;
    private ihc0 sortOrders_;

    static {
        ListSortingProto$UserSortOrders listSortingProto$UserSortOrders = new ListSortingProto$UserSortOrders();
        DEFAULT_INSTANCE = listSortingProto$UserSortOrders;
        AbstractC0269h.registerDefaultInstance(ListSortingProto$UserSortOrders.class, listSortingProto$UserSortOrders);
    }

    private ListSortingProto$UserSortOrders() {
        ihc0 ihc0Var = ihc0.f102235b;
        this.sortOrders_ = ihc0Var;
        this.providedSortOrders_ = ihc0Var;
    }

    /* JADX INFO: renamed from: n */
    public static ihc0 m13022n(ListSortingProto$UserSortOrders listSortingProto$UserSortOrders) {
        ihc0 ihc0Var = listSortingProto$UserSortOrders.providedSortOrders_;
        if (!ihc0Var.f102236a) {
            listSortingProto$UserSortOrders.providedSortOrders_ = ihc0Var.m50613h();
        }
        return listSortingProto$UserSortOrders.providedSortOrders_;
    }

    /* JADX INFO: renamed from: o */
    public static ihc0 m13023o(ListSortingProto$UserSortOrders listSortingProto$UserSortOrders) {
        ihc0 ihc0Var = listSortingProto$UserSortOrders.sortOrders_;
        if (!ihc0Var.f102236a) {
            listSortingProto$UserSortOrders.sortOrders_ = ihc0Var.m50613h();
        }
        return listSortingProto$UserSortOrders.sortOrders_;
    }

    /* JADX INFO: renamed from: p */
    public static ListSortingProto$UserSortOrders m13024p() {
        return DEFAULT_INSTANCE;
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"sortOrders_", b590.f23530a, "providedSortOrders_", a590.f12464a});
        }
        if (iOrdinal == 3) {
            return new ListSortingProto$UserSortOrders();
        }
        if (iOrdinal == 4) {
            return new z490(DEFAULT_INSTANCE);
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
        synchronized (ListSortingProto$UserSortOrders.class) {
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

    /* JADX INFO: renamed from: q */
    public final Map m13025q() {
        return Collections.unmodifiableMap(this.providedSortOrders_);
    }

    /* JADX INFO: renamed from: r */
    public final Map m13026r() {
        return Collections.unmodifiableMap(this.sortOrders_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
