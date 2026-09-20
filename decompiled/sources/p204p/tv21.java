package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class tv21 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f224032a;

    /* JADX INFO: renamed from: b */
    public Object f224033b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ nv21 f224034c;

    public tv21(nv21 nv21Var, Comparable comparable, Object obj) {
        this.f224034c = nv21Var;
        this.f224032a = comparable;
        this.f224033b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f224032a.compareTo(((tv21) obj).f224032a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f224032a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f224033b;
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
        return this.f224032a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f224033b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f224032a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f224033b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f224034c.m65714b();
        Object obj2 = this.f224033b;
        this.f224033b = obj;
        return obj2;
    }

    public final String toString() {
        return klh.m56834f(String.valueOf(this.f224032a), "=", String.valueOf(this.f224033b));
    }
}
