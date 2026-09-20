package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class wqa0 implements onp {

    /* JADX INFO: renamed from: a */
    public final Set f253959a;

    public wqa0(Set set) {
        this.f253959a = set;
    }

    @Override // p204p.onp
    public final void onPause(hc80 hc80Var) {
        Set set = this.f253959a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof mvb0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zv41 zv41Var = ((mvb0) it.next()).f147553a.f137269a;
            Boolean bool = Boolean.FALSE;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool);
        }
    }

    @Override // p204p.onp
    public final void onResume(hc80 hc80Var) {
        Set set = this.f253959a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof mvb0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zv41 zv41Var = ((mvb0) it.next()).f147553a.f137269a;
            Boolean bool = Boolean.TRUE;
            zv41Var.getClass();
            zv41Var.m97091m(null, bool);
        }
    }

    @Override // p204p.onp
    public final void onStart(hc80 hc80Var) {
        Set set = this.f253959a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof kra0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((kra0) it.next()).mo43761b();
        }
    }

    @Override // p204p.onp
    public final void onStop(hc80 hc80Var) {
        Set set = this.f253959a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (obj instanceof kra0) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((kra0) it.next()).mo43760a();
        }
    }
}
