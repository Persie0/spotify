package p204p;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class mxi0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final mxi0 f148051a = new mxi0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return idx0.f101271a;
    }
}
