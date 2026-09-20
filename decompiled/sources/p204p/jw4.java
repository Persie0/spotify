package p204p;

import android.graphics.Path;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jw4 implements qw4, Function, x920 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f116572a;

    public /* synthetic */ jw4(ArrayList arrayList) {
        this.f116572a = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m54400a(aa10 aa10Var) {
        this.f116572a.add(aa10Var);
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        gqx gqxVar = (gqx) obj;
        ArrayList arrayList = this.f116572a;
        wj50.m88279p(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            esf esfVar = (esf) gqxVar.mo45449a(esf.class, (String) it.next()).f72301b;
            if (esfVar != null) {
                arrayList2.add(esfVar);
            }
        }
        return arrayList2;
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: b */
    public Object mo36147b(Object obj) {
        return (String) obj;
    }

    /* JADX INFO: renamed from: c */
    public void m54401c(vk91 vk91Var) {
        this.f116572a.add(vk91Var);
    }

    /* JADX INFO: renamed from: d */
    public void m54402d(Path path) {
        ArrayList arrayList = this.f116572a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            vk91 vk91Var = (vk91) arrayList.get(size);
            qlo qloVar = x0b1.f256851a;
            if (vk91Var != null && !vk91Var.f242177a) {
                x0b1.m89549a(path, vk91Var.f242180d.m88179k() / 100.0f, vk91Var.f242181e.m88179k() / 100.0f, vk91Var.f242182f.m88179k() / 360.0f);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public pph m54403e() {
        return new pph(g6f.m43728j1(this.f116572a), false);
    }

    @Override // p204p.x920
    /* JADX INFO: renamed from: g */
    public Iterator mo36148g() {
        return this.f116572a.iterator();
    }

    @Override // p204p.qw4
    /* JADX INFO: renamed from: j0 */
    public mz8 mo48914j0() {
        ArrayList arrayList = this.f116572a;
        return ((wz60) arrayList.get(0)).m89400c() ? new d6q0(arrayList) : new acn0(arrayList);
    }

    @Override // p204p.qw4
    /* JADX INFO: renamed from: u0 */
    public List mo38179u0() {
        return this.f116572a;
    }

    @Override // p204p.qw4
    /* JADX INFO: renamed from: x0 */
    public boolean mo38183x0() {
        ArrayList arrayList = this.f116572a;
        return arrayList.size() == 1 && ((wz60) arrayList.get(0)).m89400c();
    }

    public jw4(int i) {
        switch (i) {
            case 3:
                this.f116572a = new ArrayList();
                break;
            default:
                this.f116572a = new ArrayList();
                break;
        }
    }
}
