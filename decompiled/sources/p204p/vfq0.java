package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class vfq0 implements ufq0 {

    /* JADX INFO: renamed from: d */
    public static final Map f241014d = Collections.singletonMap("😢", "🥺");

    /* JADX INFO: renamed from: e */
    public static final Map f241015e = Collections.singletonMap("🥺", "😢");

    /* JADX INFO: renamed from: b */
    public final int f241016b;

    /* JADX INFO: renamed from: c */
    public final List f241017c;

    public vfq0(int i, List list) {
        this.f241016b = i;
        this.f241017c = list;
    }

    /* JADX INFO: renamed from: a */
    public final qf40 m85382a() {
        List list = this.f241017c;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m85384c((String) it.next()));
        }
        return opo.m67574x(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final String m85383b(String str) {
        String str2;
        return (this.f241016b >= 28 || (str2 = (String) f241014d.get(str)) == null) ? str : str2;
    }

    /* JADX INFO: renamed from: c */
    public final String m85384c(String str) {
        String str2;
        return (this.f241016b >= 28 || (str2 = (String) f241015e.get(str)) == null) ? str : str2;
    }
}
