package p204p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class n700 extends mic1 {

    /* JADX INFO: renamed from: h */
    public static final m700 f150994h = new m700();

    /* JADX INFO: renamed from: e */
    public final boolean f150998e;

    /* JADX INFO: renamed from: b */
    public final HashMap f150995b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final HashMap f150996c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f150997d = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f150999f = false;

    /* JADX INFO: renamed from: g */
    public boolean f151000g = false;

    public n700(boolean z) {
        this.f150998e = z;
    }

    @Override // p204p.mic1
    /* JADX INFO: renamed from: d */
    public final void mo15620d() {
        if (c700.m31595O(3)) {
            toString();
        }
        this.f150999f = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m63789e(i500 i500Var) {
        if (this.f151000g) {
            c700.m31595O(2);
            return;
        }
        String str = i500Var.f98699e;
        HashMap map = this.f150995b;
        if (map.containsKey(str)) {
            return;
        }
        map.put(i500Var.f98699e, i500Var);
        if (c700.m31595O(2)) {
            i500Var.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n700.class == obj.getClass()) {
            n700 n700Var = (n700) obj;
            if (this.f150995b.equals(n700Var.f150995b) && this.f150996c.equals(n700Var.f150996c) && this.f150997d.equals(n700Var.f150997d)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m63790f(String str, boolean z) {
        HashMap map = this.f150996c;
        n700 n700Var = (n700) map.get(str);
        if (n700Var != null) {
            if (z) {
                ArrayList<String> arrayList = new ArrayList();
                arrayList.addAll(n700Var.f150996c.keySet());
                for (String str2 : arrayList) {
                    c700.m31595O(3);
                    n700Var.m63790f(str2, true);
                }
            }
            n700Var.mo15620d();
            map.remove(str);
        }
        HashMap map2 = this.f150997d;
        hjc1 hjc1Var = (hjc1) map2.get(str);
        if (hjc1Var != null) {
            hjc1Var.m47681a();
            map2.remove(str);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m63791g(i500 i500Var) {
        if (this.f151000g) {
            c700.m31595O(2);
        } else {
            if (this.f150995b.remove(i500Var.f98699e) == null || !c700.m31595O(2)) {
                return;
            }
            i500Var.toString();
        }
    }

    public final int hashCode() {
        return this.f150997d.hashCode() + ((this.f150996c.hashCode() + (this.f150995b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f150995b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f150996c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f150997d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
