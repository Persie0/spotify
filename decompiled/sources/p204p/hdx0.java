package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class hdx0 extends tvl0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final hdx0 f90253a = new hdx0();

    private Object readResolve() {
        return f90253a;
    }

    @Override // p204p.tvl0
    /* JADX INFO: renamed from: a */
    public final tvl0 mo47258a() {
        return nxi0.f159490a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
