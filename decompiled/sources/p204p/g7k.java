package p204p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class g7k {

    /* JADX INFO: renamed from: a */
    public final f4k f77289a;

    /* JADX INFO: renamed from: b */
    public final List f77290b;

    /* JADX INFO: renamed from: c */
    public final boolean f77291c;

    /* JADX INFO: renamed from: d */
    public final boolean f77292d;

    public g7k(f4k f4kVar, List list, boolean z) {
        this.f77289a = f4kVar;
        this.f77290b = list;
        this.f77291c = z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            String str = ((f5k) obj).f66094a;
            Object objM75735i = linkedHashMap.get(str);
            if (objM75735i == null) {
                objM75735i = rkh0.m75735i(str, linkedHashMap);
            }
            ((List) objM75735i).add(obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            na6.m63957e("ContextMenuViewModel cannot contain items with duplicate itemResId. id=" + ((String) entry2.getKey()) + ", items=" + g6f.m43753y0((List) entry2.getValue(), ", ", null, null, v0k.f236033b1, 30));
        }
        this.f77292d = !linkedHashMap2.isEmpty();
    }

    /* JADX INFO: renamed from: a */
    public static g7k m43824a(g7k g7kVar, ArrayList arrayList) {
        f4k f4kVar = g7kVar.f77289a;
        boolean z = g7kVar.f77291c;
        g7kVar.getClass();
        return new g7k(f4kVar, arrayList, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7k)) {
            return false;
        }
        g7k g7kVar = (g7k) obj;
        return wj50.m88271j(this.f77289a, g7kVar.f77289a) && wj50.m88271j(this.f77290b, g7kVar.f77290b) && this.f77291c == g7kVar.f77291c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f77291c) + s571.m77244c(this.f77289a.hashCode() * 31, 31, this.f77290b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ g7k(f4k f4kVar, List list, int i) {
        this((i & 1) != 0 ? new f4k(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7) : f4kVar, (i & 2) != 0 ? lau.f131415a : list, (i & 4) == 0);
    }
}
