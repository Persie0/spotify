package com.spotify.storage.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class EsStorage$RealmStats extends AbstractC0269h implements sre0 {
    private static final EsStorage$RealmStats DEFAULT_INSTANCE;
    public static final int NUM_COMPLETE_ENTRIES_FIELD_NUMBER = 4;
    public static final int NUM_ENTRIES_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REALM_FIELD_NUMBER = 1;
    public static final int SIZE_FIELD_NUMBER = 2;
    private long numCompleteEntries_;
    private long numEntries_;
    private int realm_;
    private long size_;

    static {
        EsStorage$RealmStats esStorage$RealmStats = new EsStorage$RealmStats();
        DEFAULT_INSTANCE = esStorage$RealmStats;
        AbstractC0269h.registerDefaultInstance(EsStorage$RealmStats.class, esStorage$RealmStats);
    }

    private EsStorage$RealmStats() {
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
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0002\u0004\u0002", new Object[]{"realm_", "size_", "numEntries_", "numCompleteEntries_"});
        }
        if (iOrdinal == 3) {
            return new EsStorage$RealmStats();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 12);
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
        synchronized (EsStorage$RealmStats.class) {
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
