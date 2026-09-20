package p204p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class gl40 {

    /* JADX INFO: renamed from: a */
    public final zv41 f80991a;

    /* JADX INFO: renamed from: b */
    public final nuu0 f80992b;

    public gl40() {
        zv41 zv41VarM52819d = jag1.m52819d(lau.f131415a);
        this.f80991a = zv41VarM52819d;
        this.f80992b = bzf1.m31021m(zv41VarM52819d);
    }

    /* JADX INFO: renamed from: a */
    public final void m45086a(aa71 aa71Var) {
        zv41 zv41Var;
        Object value;
        ArrayList arrayList;
        do {
            zv41Var = this.f80991a;
            value = zv41Var.getValue();
            arrayList = new ArrayList();
            for (Object obj : (List) value) {
                aa71 aa71Var2 = (aa71) obj;
                if (aa71Var2.f13779a >= aa71Var.f13780b || aa71Var2.f13780b <= aa71Var.f13779a) {
                    arrayList.add(obj);
                }
            }
        } while (!zv41Var.m97089k(value, g6f.m43701O0(aa71Var, arrayList)));
    }

    /* JADX INFO: renamed from: b */
    public final void m45087b(aa71 aa71Var) {
        zv41 zv41Var;
        Object value;
        do {
            zv41Var = this.f80991a;
            value = zv41Var.getValue();
        } while (!zv41Var.m97089k(value, g6f.m43696J0((List) value, aa71Var)));
    }
}
