package p204p;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class dyi0 extends mic1 {

    /* JADX INFO: renamed from: c */
    public static final o7a0 f54368c = new o7a0(1);

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f54369b = new LinkedHashMap();

    @Override // p204p.mic1
    /* JADX INFO: renamed from: d */
    public final void mo15620d() {
        LinkedHashMap linkedHashMap = this.f54369b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((hjc1) it.next()).m47681a();
        }
        linkedHashMap.clear();
    }

    /* JADX INFO: renamed from: e */
    public final hjc1 m37343e(String str) {
        LinkedHashMap linkedHashMap = this.f54369b;
        hjc1 hjc1Var = (hjc1) linkedHashMap.get(str);
        if (hjc1Var != null) {
            return hjc1Var;
        }
        hjc1 hjc1Var2 = new hjc1();
        linkedHashMap.put(str, hjc1Var2);
        return hjc1Var2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f54369b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
