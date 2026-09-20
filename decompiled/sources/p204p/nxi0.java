package p204p;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class nxi0 extends tvl0 implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final nxi0 f159490a = new nxi0();

    private Object readResolve() {
        return f159490a;
    }

    @Override // p204p.tvl0
    /* JADX INFO: renamed from: a */
    public final tvl0 mo47258a() {
        return hdx0.f90253a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
