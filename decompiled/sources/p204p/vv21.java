package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class vv21 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f245129a;

    /* JADX INFO: renamed from: b */
    public Object f245130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pv21 f245131c;

    public vv21(pv21 pv21Var, Map.Entry entry) {
        this(pv21Var, (Comparable) entry.getKey(), entry.getValue());
    }

    /* JADX INFO: renamed from: a */
    public final Comparable m86452a() {
        return this.f245129a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f245129a.compareTo(((vv21) obj).f245129a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f245129a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f245130b;
                    Object value = entry.getValue();
                    if (obj2 == null) {
                        zEquals2 = value == null;
                    } else {
                        zEquals2 = obj2.equals(value);
                    }
                    if (zEquals2) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f245129a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f245130b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f245129a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f245130b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f245131c.m71106b();
        Object obj2 = this.f245130b;
        this.f245130b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f245129a + "=" + this.f245130b;
    }

    public vv21(pv21 pv21Var, Comparable comparable, Object obj) {
        this.f245131c = pv21Var;
        this.f245129a = comparable;
        this.f245130b = obj;
    }
}
