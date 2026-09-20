package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i6f extends h6f {
    /* JADX INFO: renamed from: T */
    public static int m49804T(Iterable iterable, int i) {
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }

    /* JADX INFO: renamed from: U */
    public static ArrayList m49805U(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            j6f.m52564V((Iterable) it.next(), arrayList);
        }
        return arrayList;
    }
}
