package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vk91 implements hej, jz8 {

    /* JADX INFO: renamed from: a */
    public final boolean f242177a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f242178b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final int f242179c;

    /* JADX INFO: renamed from: d */
    public final whz f242180d;

    /* JADX INFO: renamed from: e */
    public final whz f242181e;

    /* JADX INFO: renamed from: f */
    public final whz f242182f;

    public vk91(oz8 oz8Var, ci01 ci01Var) {
        this.f242177a = ci01Var.m32829f();
        this.f242179c = ci01Var.m32828e();
        mz8 mz8VarMo48914j0 = ci01Var.m32827d().mo48914j0();
        this.f242180d = (whz) mz8VarMo48914j0;
        mz8 mz8VarMo48914j1 = ci01Var.m32825b().mo48914j0();
        this.f242181e = (whz) mz8VarMo48914j1;
        mz8 mz8VarMo48914j2 = ci01Var.m32826c().mo48914j0();
        this.f242182f = (whz) mz8VarMo48914j2;
        oz8Var.m68627e(mz8VarMo48914j0);
        oz8Var.m68627e(mz8VarMo48914j1);
        oz8Var.m68627e(mz8VarMo48914j2);
        mz8VarMo48914j0.m63235a(this);
        mz8VarMo48914j1.m63235a(this);
        mz8VarMo48914j2.m63235a(this);
    }

    @Override // p204p.jz8
    /* JADX INFO: renamed from: a */
    public final void mo27895a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f242178b;
            if (i >= arrayList.size()) {
                return;
            }
            ((jz8) arrayList.get(i)).mo27895a();
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m85816c(jz8 jz8Var) {
        this.f242178b.add(jz8Var);
    }

    @Override // p204p.hej
    /* JADX INFO: renamed from: b */
    public final void mo27896b(List list, List list2) {
    }
}
