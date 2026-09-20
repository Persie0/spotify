package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ugc0 implements Map.Entry, pq60 {

    /* JADX INFO: renamed from: a */
    public final Object f230112a;

    /* JADX INFO: renamed from: b */
    public final Object f230113b;

    public ugc0(Object obj, Object obj2) {
        this.f230112a = obj;
        this.f230113b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f230112a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f230113b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
