package p204p;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class o891 {

    /* JADX INFO: renamed from: a */
    public static final by7 f162742a = new by7();

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f162743b = new ThreadLocal();

    /* JADX INFO: renamed from: c */
    public static final ArrayList f162744c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static void m66421a(ViewGroup viewGroup, z691 z691Var) {
        ArrayList arrayList = f162744c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (z691Var == null) {
            z691Var = f162742a;
        }
        z691 z691VarClone = z691Var.clone();
        m66424d(viewGroup, z691VarClone);
        pvf1.m71166v(viewGroup);
        n891 n891Var = new n891();
        n891Var.f151483a = z691VarClone;
        n891Var.f151484b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(n891Var);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(n891Var);
    }

    /* JADX INFO: renamed from: b */
    public static void m66422b(ViewGroup viewGroup) {
        f162744c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) m66423c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((z691) arrayList2.get(size)).mo55897s(viewGroup);
        }
    }

    /* JADX INFO: renamed from: c */
    public static uj5 m66423c() {
        uj5 uj5Var;
        ThreadLocal threadLocal = f162743b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (uj5Var = (uj5) weakReference.get()) != null) {
            return uj5Var;
        }
        uj5 uj5Var2 = new uj5(0);
        threadLocal.set(new WeakReference(uj5Var2));
        return uj5Var2;
    }

    /* JADX INFO: renamed from: d */
    public static void m66424d(ViewGroup viewGroup, z691 z691Var) {
        ArrayList arrayList = (ArrayList) m66423c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((z691) it.next()).mo55872E(viewGroup);
            }
        }
        if (z691Var != null) {
            z691Var.m95488j(viewGroup, true);
        }
        pvf1.m71161q(viewGroup);
    }
}
