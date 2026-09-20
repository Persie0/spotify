package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class vg71 implements n2l {
    @Override // p204p.o2l
    /* JADX INFO: renamed from: a */
    public final srw0 mo53449a() {
        StringBuilder sb = new StringBuilder(2048);
        sb.append("Current thread:\n");
        sb.append(Thread.currentThread().getName());
        sb.append("\n\nAll threads (\n");
        Set<Thread> setKeySet = Thread.getAllStackTraces().keySet();
        sb.append(setKeySet.size());
        sb.append("):");
        Set<Thread> set = setKeySet;
        ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((Thread) it.next()).getName());
        }
        Iterator it2 = g6f.m43711Y0(arrayList, String.CASE_INSENSITIVE_ORDER).iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            sb.append('\n');
        }
        return new srw0("Threads", "Every live thread sorted by case sensitive name.", sb.toString());
    }
}
