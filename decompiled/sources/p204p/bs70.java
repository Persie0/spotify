package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class bs70 implements Map.Entry {

    /* JADX INFO: renamed from: a */
    public Map.Entry f30259a;

    /* JADX INFO: renamed from: a */
    public final void m30355a() {
        ikc0.m50942n(this.f30259a.getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f30259a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof pre0)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        ikc0.m50942n(this.f30259a.getValue());
        throw null;
    }
}
