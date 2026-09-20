package p204p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class qrh implements q3m0 {

    /* JADX INFO: renamed from: a */
    public final List f191850a;

    /* JADX INFO: renamed from: b */
    public final String f191851b;

    public qrh(List list, String str) {
        this.f191850a = list;
        this.f191851b = str;
        list.size();
        g6f.m43736n1(list).size();
    }

    @Override // p204p.q3m0
    /* JADX INFO: renamed from: a */
    public final boolean mo69068a(y400 y400Var) {
        List list = this.f191850a;
        if (list != null && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!ofg1.m66840i((o3m0) it.next(), y400Var)) {
                return false;
            }
        }
        return true;
    }

    @Override // p204p.q3m0
    /* JADX INFO: renamed from: b */
    public final void mo69069b(y400 y400Var, ArrayList arrayList) {
        Iterator it = this.f191850a.iterator();
        while (it.hasNext()) {
            ofg1.m66837f((o3m0) it.next(), y400Var, arrayList);
        }
    }

    @Override // p204p.o3m0
    /* JADX INFO: renamed from: c */
    public final List mo66191c(y400 y400Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f191850a.iterator();
        while (it.hasNext()) {
            ofg1.m66837f((o3m0) it.next(), y400Var, arrayList);
        }
        return g6f.m43728j1(arrayList);
    }

    @Override // p204p.o3m0
    /* JADX INFO: renamed from: m */
    public final Collection mo66192m(y400 y400Var, gh00 gh00Var) {
        HashSet hashSet = new HashSet();
        Iterator it = this.f191850a.iterator();
        while (it.hasNext()) {
            hashSet.addAll(((o3m0) it.next()).mo66192m(y400Var, gh00Var));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f191851b;
    }
}
