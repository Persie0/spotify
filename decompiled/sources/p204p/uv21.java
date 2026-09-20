package p204p;

import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class uv21 implements Comparable, Map.Entry {

    /* JADX INFO: renamed from: a */
    public final Comparable f234320a;

    /* JADX INFO: renamed from: b */
    public Object f234321b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ov21 f234322c;

    public uv21(ov21 ov21Var, Comparable comparable, Object obj) {
        this.f234322c = ov21Var;
        this.f234320a = comparable;
        this.f234321b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f234320a.compareTo(((uv21) obj).f234320a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj != this) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Comparable comparable = this.f234320a;
                if (comparable == null) {
                    zEquals = key == null;
                } else {
                    zEquals = comparable.equals(key);
                }
                if (zEquals) {
                    Object obj2 = this.f234321b;
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
        return this.f234320a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f234321b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f234320a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f234321b;
        return (obj != null ? obj.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f234322c.m68111b();
        Object obj2 = this.f234321b;
        this.f234321b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f234320a);
        String strValueOf2 = String.valueOf(this.f234321b);
        return dq60.m36618r(new StringBuilder(strValueOf2.length() + strValueOf.length() + 1), strValueOf, "=", strValueOf2);
    }
}
