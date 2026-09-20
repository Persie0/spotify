package p204p;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class wf40 implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Object[] f250735a;

    /* JADX INFO: renamed from: b */
    public final Object[] f250736b;

    public wf40(xf40 xf40Var) {
        Object[] objArr = new Object[xf40Var.size()];
        Object[] objArr2 = new Object[xf40Var.size()];
        o3a1 it = xf40Var.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.f250735a = objArr;
        this.f250736b = objArr2;
    }

    /* JADX INFO: renamed from: a */
    public vf40 mo87969a(int i) {
        return new vf40(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f250735a;
        boolean z = objArr instanceof hg40;
        Object[] objArr2 = this.f250736b;
        if (!z) {
            vf40 vf40VarMo87969a = mo87969a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                vf40VarMo87969a.mo85345e(objArr[i], objArr2[i]);
            }
            return vf40VarMo87969a.mo85344d();
        }
        hg40 hg40Var = (hg40) objArr;
        vf40 vf40VarMo87969a2 = mo87969a(hg40Var.size());
        o3a1 it = hg40Var.iterator();
        o3a1 it2 = ((ef40) objArr2).iterator();
        while (it.hasNext()) {
            vf40VarMo87969a2.mo85345e(it.next(), it2.next());
        }
        return vf40VarMo87969a2.mo85344d();
    }
}
