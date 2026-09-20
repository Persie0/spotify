package p204p;

import android.util.LruCache;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes6.dex */
public final class jfz0 extends LruCache {
    @Override // android.util.LruCache
    public final Object create(Object obj) {
        return new kfz0(new TreeMap(), 0);
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        return ((kfz0) obj2).f122248b;
    }
}
