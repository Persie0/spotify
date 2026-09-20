package com.spotify.listplatform.filteringimpl;

import com.google.protobuf.AbstractC0269h;
import java.util.Collections;
import java.util.Map;
import p204p.ihc0;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sj80;
import p204p.sre0;
import p204p.xv80;
import p204p.z110;

/* JADX INFO: loaded from: classes7.dex */
public final class ListFilteringProto$UserFilters extends AbstractC0269h implements sre0 {
    private static final ListFilteringProto$UserFilters DEFAULT_INSTANCE;
    public static final int FILTERS_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ihc0 filters_ = ihc0.f102235b;

    static {
        ListFilteringProto$UserFilters listFilteringProto$UserFilters = new ListFilteringProto$UserFilters();
        DEFAULT_INSTANCE = listFilteringProto$UserFilters;
        AbstractC0269h.registerDefaultInstance(ListFilteringProto$UserFilters.class, listFilteringProto$UserFilters);
    }

    private ListFilteringProto$UserFilters() {
    }

    /* JADX INFO: renamed from: n */
    public static ListFilteringProto$UserFilters m13009n() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"filters_", xv80.f266312a});
        }
        if (iOrdinal == 3) {
            return new ListFilteringProto$UserFilters();
        }
        if (iOrdinal == 4) {
            return new sj80(DEFAULT_INSTANCE, 13);
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
        synchronized (ListFilteringProto$UserFilters.class) {
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

    /* JADX INFO: renamed from: o */
    public final Map m13010o() {
        return Collections.unmodifiableMap(this.filters_);
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
