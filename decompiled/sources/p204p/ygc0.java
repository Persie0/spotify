package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class ygc0 implements Map.Entry, pq60 {

    /* JADX INFO: renamed from: a */
    public final Object f272556a;

    /* JADX INFO: renamed from: b */
    public final Object f272557b;

    public ygc0(Object obj, Object obj2) {
        this.f272556a = obj;
        this.f272557b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygc0)) {
            return false;
        }
        ygc0 ygc0Var = (ygc0) obj;
        return wj50.m88271j(this.f272556a, ygc0Var.f272556a) && wj50.m88271j(this.f272557b, ygc0Var.f272557b);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f272556a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f272557b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f272556a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f272557b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "MapEntry(key=" + this.f272556a + ", value=" + this.f272557b + ')';
    }
}
