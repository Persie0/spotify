package com.spotify.yourlibrary.yourlibraryx.all.logging.events.proto;

import com.google.protobuf.AbstractC0269h;
import java.util.ArrayList;
import p204p.AbstractC1733c9;
import p204p.AbstractC2118m8;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.sre1;
import p204p.z110;

/* JADX INFO: loaded from: classes11.dex */
public final class YourLibrarySelectedFilters extends AbstractC0269h implements sre0 {
    private static final YourLibrarySelectedFilters DEFAULT_INSTANCE;
    public static final int FILTER_ORDERED_FIELD_NUMBER = 1;
    private static volatile r2n0 PARSER;
    private ae50 filterOrdered_ = AbstractC0269h.emptyProtobufList();

    static {
        YourLibrarySelectedFilters yourLibrarySelectedFilters = new YourLibrarySelectedFilters();
        DEFAULT_INSTANCE = yourLibrarySelectedFilters;
        AbstractC0269h.registerDefaultInstance(YourLibrarySelectedFilters.class, yourLibrarySelectedFilters);
    }

    private YourLibrarySelectedFilters() {
    }

    /* JADX INFO: renamed from: n */
    public static void m23257n(YourLibrarySelectedFilters yourLibrarySelectedFilters, ArrayList arrayList) {
        ae50 ae50Var = yourLibrarySelectedFilters.filterOrdered_;
        if (!((AbstractC1733c9) ae50Var).f35342a) {
            yourLibrarySelectedFilters.filterOrdered_ = AbstractC0269h.mutableCopy(ae50Var);
        }
        AbstractC2118m8.addAll(arrayList, yourLibrarySelectedFilters.filterOrdered_);
    }

    /* JADX INFO: renamed from: o */
    public static sre1 m23258o() {
        return (sre1) DEFAULT_INSTANCE.createBuilder();
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"filterOrdered_"});
        }
        if (iOrdinal == 3) {
            return new YourLibrarySelectedFilters();
        }
        if (iOrdinal == 4) {
            return new sre1(DEFAULT_INSTANCE);
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
        synchronized (YourLibrarySelectedFilters.class) {
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
