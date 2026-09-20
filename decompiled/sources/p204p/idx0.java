package p204p;

import java.util.Comparator;

/* JADX INFO: loaded from: classes11.dex */
public final class idx0 implements Comparator {

    /* JADX INFO: renamed from: a */
    public static final idx0 f101271a = new idx0();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj2).compareTo((Comparable) obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return mxi0.f148051a;
    }
}
