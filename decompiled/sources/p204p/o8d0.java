package p204p;

import com.spotify.base.java.logging.Logger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class o8d0 {

    /* JADX INFO: renamed from: a */
    public final r9d0 f162784a;

    /* JADX INFO: renamed from: b */
    public final Set f162785b;

    /* JADX INFO: renamed from: c */
    public final sxi f162786c;

    /* JADX INFO: renamed from: d */
    public final eod0 f162787d;

    /* JADX INFO: renamed from: e */
    public final dod0 f162788e;

    /* JADX INFO: renamed from: f */
    public final q78 f162789f;

    /* JADX INFO: renamed from: g */
    public final se41 f162790g;

    /* JADX INFO: renamed from: h */
    public final r46 f162791h;

    public o8d0(se41 se41Var, r9d0 r9d0Var, Set set, sxi sxiVar, eod0 eod0Var, dod0 dod0Var, q78 q78Var, r46 r46Var) {
        this.f162790g = se41Var;
        this.f162784a = r9d0Var;
        this.f162785b = set;
        this.f162786c = sxiVar;
        this.f162787d = eod0Var;
        this.f162788e = dod0Var;
        this.f162789f = q78Var;
        this.f162791h = r46Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m66426a(String str) {
        yjx0 yjx0Var;
        r9d0 r9d0Var = this.f162784a;
        WeakReference weakReference = r9d0Var.f197031k;
        uzx uzxVar = weakReference != null ? (uzx) weakReference.get() : null;
        if (r9d0Var.f197030j.containsKey(str) || (yjx0Var = (yjx0) r9d0Var.f197027g.get(str)) == null) {
            return;
        }
        Logger.m3969e("MBS: Recreating previous MBS session for %s", str);
        if (uzxVar == null) {
            r9d0Var.f197026f.put(str, yjx0Var);
            return;
        }
        iji ijiVarM53571a = r9d0Var.f197021a.m53571a(str);
        if (ijiVarM53571a != null) {
            r9d0Var.m75047c(uzxVar, str, ijiVarM53571a, yjx0Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m66427b() {
        List listM75049e = this.f162784a.m75049e();
        ArrayList arrayList = new ArrayList(listM75049e.size());
        Iterator it = listM75049e.iterator();
        while (it.hasNext()) {
            arrayList.add(((o9d0) it.next()).mo37698f());
        }
        q78 q78Var = this.f162789f;
        q78Var.getClass();
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((xnd0) it2.next()).mo31402l());
        }
        q78Var.f186044a.mo46962a(g6f.m43727j0(i6f.m49805U(arrayList2)));
    }
}
