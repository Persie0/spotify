package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class x5e0 implements k330, sqz, vze, q8x0 {

    /* JADX INFO: renamed from: a */
    public final String f258391a;

    /* JADX INFO: renamed from: b */
    public final String f258392b;

    /* JADX INFO: renamed from: c */
    public final un20 f258393c;

    /* JADX INFO: renamed from: d */
    public final t3x0 f258394d;

    /* JADX INFO: renamed from: e */
    public final boolean f258395e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f258396f;

    public x5e0(String str, String str2, un20 un20Var, t3x0 t3x0Var, boolean z, ArrayList arrayList) {
        this.f258391a = str;
        this.f258392b = str2;
        this.f258393c = un20Var;
        this.f258394d = t3x0Var;
        this.f258395e = z;
        this.f258396f = arrayList;
    }

    @Override // p204p.vze
    /* JADX INFO: renamed from: a */
    public final Set mo24932a() {
        ArrayList arrayList = this.f258396f;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g6e0) it.next()).f77027b);
        }
        return g6f.m43736n1(arrayList2);
    }

    @Override // p204p.q8x0
    /* JADX INFO: renamed from: c */
    public final Set mo72177c() {
        ArrayList arrayList = this.f258396f;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((g6e0) it.next()).f77027b);
        }
        return g6f.m43736n1(arrayList2);
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: d */
    public final List mo24934d(b250 b250Var) {
        Object e5e0Var;
        String str = this.f258394d.f216855a;
        String str2 = this.f258392b;
        String str3 = this.f258391a;
        int i = 0;
        ArrayList arrayList = this.f258396f;
        un20 un20Var = this.f258393c;
        if (un20Var != null) {
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    h6f.m46722S();
                    throw null;
                }
                g6e0 g6e0Var = (g6e0) obj;
                arrayList2.add(new m5e0(edb.m38565n(str3, "-", i), edb.m38565n(str2, "-", i), g6e0Var.f77026a, g6e0Var.f77027b));
                i = i2;
            }
            e5e0Var = new f5e0(str3, b250Var, new n5e0(str3, str2, un20Var, arrayList2, this.f258395e, str));
        } else {
            ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList, 10));
            for (Object obj2 : arrayList) {
                int i3 = i + 1;
                if (i < 0) {
                    h6f.m46722S();
                    throw null;
                }
                g6e0 g6e0Var2 = (g6e0) obj2;
                arrayList3.add(new m5e0(edb.m38565n(str3, "-", i), edb.m38565n(str2, "-", i), g6e0Var2.f77026a, g6e0Var2.f77027b));
                i = i3;
            }
            e5e0Var = new e5e0(str3, b250Var, new n5e0(str3, str2, un20Var, arrayList3, this.f258395e, str));
        }
        return Collections.singletonList(e5e0Var);
    }

    @Override // p204p.sqz
    /* JADX INFO: renamed from: e */
    public final String mo24935e() {
        return this.f258391a;
    }

    @Override // p204p.k330
    /* JADX INFO: renamed from: f */
    public final t3x0 mo24936f() {
        return this.f258394d;
    }

    @Override // p204p.k330
    public final String getId() {
        return this.f258391a;
    }
}
