package com.spotify.storage.esperanto.proto;

import com.google.protobuf.AbstractC0269h;
import p204p.ae50;
import p204p.ore0;
import p204p.pre0;
import p204p.r110;
import p204p.r2n0;
import p204p.sre0;
import p204p.vnw;
import p204p.z110;

/* JADX INFO: loaded from: classes10.dex */
public final class EsStorage$Stats extends AbstractC0269h implements sre0 {
    public static final int CACHE_ID_FIELD_NUMBER = 1;
    public static final int CREATION_DATE_SEC_FIELD_NUMBER = 2;
    public static final int CURRENT_LOCKED_SIZE_FIELD_NUMBER = 5;
    public static final int CURRENT_NUMFILES_FIELD_NUMBER = 8;
    public static final int CURRENT_SIZE_FIELD_NUMBER = 4;
    private static final EsStorage$Stats DEFAULT_INSTANCE;
    public static final int FREE_SPACE_FIELD_NUMBER = 6;
    public static final int MAX_CACHE_SIZE_FIELD_NUMBER = 3;
    private static volatile r2n0 PARSER = null;
    public static final int REALM_STATS_FIELD_NUMBER = 9;
    public static final int TOTAL_SPACE_FIELD_NUMBER = 7;
    private long creationDateSec_;
    private long currentLockedSize_;
    private long currentNumfiles_;
    private long currentSize_;
    private long freeSpace_;
    private long maxCacheSize_;
    private long totalSpace_;
    private String cacheId_ = "";
    private ae50 realmStats_ = AbstractC0269h.emptyProtobufList();

    static {
        EsStorage$Stats esStorage$Stats = new EsStorage$Stats();
        DEFAULT_INSTANCE = esStorage$Stats;
        AbstractC0269h.registerDefaultInstance(EsStorage$Stats.class, esStorage$Stats);
    }

    private EsStorage$Stats() {
    }

    public static r2n0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: renamed from: r */
    public static EsStorage$Stats m21604r(byte[] bArr) {
        return (EsStorage$Stats) AbstractC0269h.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    @Override // com.google.protobuf.AbstractC0269h
    public final Object dynamicMethod(z110 z110Var, Object obj, Object obj2) {
        r2n0 r110Var;
        int iOrdinal = z110Var.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return AbstractC0269h.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002\u0007\u0002\b\u0002\t\u001b", new Object[]{"cacheId_", "creationDateSec_", "maxCacheSize_", "currentSize_", "currentLockedSize_", "freeSpace_", "totalSpace_", "currentNumfiles_", "realmStats_", EsStorage$RealmStats.class});
        }
        if (iOrdinal == 3) {
            return new EsStorage$Stats();
        }
        if (iOrdinal == 4) {
            return new vnw(DEFAULT_INSTANCE, 13);
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
        synchronized (EsStorage$Stats.class) {
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

    /* JADX INFO: renamed from: n */
    public final long m21605n() {
        return this.currentLockedSize_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 newBuilderForType() {
        return newBuilderForType();
    }

    /* JADX INFO: renamed from: o */
    public final long m21606o() {
        return this.currentSize_;
    }

    /* JADX INFO: renamed from: p */
    public final long m21607p() {
        return this.freeSpace_;
    }

    /* JADX INFO: renamed from: q */
    public final long m21608q() {
        return this.totalSpace_;
    }

    @Override // com.google.protobuf.AbstractC0269h, p204p.pre0
    public final /* bridge */ /* synthetic */ ore0 toBuilder() {
        return toBuilder();
    }
}
