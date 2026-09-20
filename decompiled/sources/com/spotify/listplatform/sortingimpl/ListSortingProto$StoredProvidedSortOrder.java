package com.spotify.listplatform.sortingimpl;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.y490;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ListSortingProto$StoredProvidedSortOrder extends AbstractC0269h implements sre0 {
    private static final ListSortingProto$StoredProvidedSortOrder DEFAULT_INSTANCE;
    public static final int INTERNAL_ID_FIELD_NUMBER = 1;
    public static final int IS_REVERSIBLE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile r2n0 PARSER;
    private boolean isReversible_;
    private String internalId_ = "";
    private String name_ = "";

    static {
        ListSortingProto$StoredProvidedSortOrder listSortingProto$StoredProvidedSortOrder = new ListSortingProto$StoredProvidedSortOrder();
        DEFAULT_INSTANCE = listSortingProto$StoredProvidedSortOrder;
        AbstractC0269h.registerDefaultInstance(ListSortingProto$StoredProvidedSortOrder.class, listSortingProto$StoredProvidedSortOrder);
    }

    private ListSortingProto$StoredProvidedSortOrder() {
    }

    /* JADX INFO: renamed from: n */
    public static void m13015n(ListSortingProto$StoredProvidedSortOrder listSortingProto$StoredProvidedSortOrder, String str) {
        listSortingProto$StoredProvidedSortOrder.getClass();
        str.getClass();
        listSortingProto$StoredProvidedSortOrder.internalId_ = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m13016o(ListSortingProto$StoredProvidedSortOrder listSortingProto$StoredProvidedSortOrder, boolean z) {
        listSortingProto$StoredProvidedSortOrder.isReversible_ = z;
    }

    /* JADX INFO: renamed from: p */
    public static void m13017p(ListSortingProto$StoredProvidedSortOrder listSortingProto$StoredProvidedSortOrder, String str) {
        listSortingProto$StoredProvidedSortOrder.getClass();
        str.getClass();
        listSortingProto$StoredProvidedSortOrder.name_ = str;
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: q */
    public static ListSortingProto$StoredProvidedSortOrder m13018q() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static y490 m13019t() {
        return (y490) DEFAULT_INSTANCE.createBuilder();
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007", new Object[]{"internalId_", "name_", "isReversible_"});
        }
        if (iOrdinal == 3) {
            return new ListSortingProto$StoredProvidedSortOrder();
        }
        if (iOrdinal == 4) {
            return new y490(DEFAULT_INSTANCE);
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
        synchronized (ListSortingProto$StoredProvidedSortOrder.class) {
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

    public final String getName() {
        return this.name_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: r */
    public final String m13020r() {
        return this.internalId_;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m13021s() {
        return this.isReversible_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
