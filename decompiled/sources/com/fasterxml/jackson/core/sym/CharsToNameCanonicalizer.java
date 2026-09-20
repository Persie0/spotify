package com.fasterxml.jackson.core.sym;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class CharsToNameCanonicalizer {
    protected final int _seed;
    protected final CharsToNameCanonicalizer _parent = null;
    protected boolean _canonicalize = true;
    protected final int _flags = -1;
    protected boolean _hashShared = false;
    protected int _longestCollisionList = 0;
    protected final AtomicReference<TableInfo> _tableInfo = new AtomicReference<>(TableInfo.createInitial(64));

    public static final class Bucket {
    }

    public static final class TableInfo {
        final Bucket[] buckets;
        final int longestCollisionList;
        final int size;
        final String[] symbols;

        public TableInfo(int i, int i2, String[] strArr, Bucket[] bucketArr) {
            this.size = i;
            this.longestCollisionList = i2;
            this.symbols = strArr;
            this.buckets = bucketArr;
        }

        public static TableInfo createInitial(int i) {
            return new TableInfo(0, 0, new String[i], new Bucket[i >> 1]);
        }
    }

    private CharsToNameCanonicalizer(int i) {
        this._seed = i;
    }

    public static CharsToNameCanonicalizer createRoot() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) jCurrentTimeMillis) + ((int) (jCurrentTimeMillis >>> 32))) | 1);
    }

    public static CharsToNameCanonicalizer createRoot(int i) {
        return new CharsToNameCanonicalizer(i);
    }
}
