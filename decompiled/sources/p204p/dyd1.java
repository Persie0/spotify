package p204p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public final class dyd1 extends AbstractC2154n7 {

    /* JADX INFO: renamed from: a */
    public final int f54302a;

    /* JADX INFO: renamed from: b */
    public final b450 f54303b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f54304c;

    /* JADX INFO: renamed from: d */
    public final qe70 f54305d;

    /* JADX INFO: renamed from: e */
    public final HashMap f54306e = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public dyd1(int i, b450 b450Var, ArrayList arrayList, gh00 gh00Var) {
        this.f54302a = i;
        this.f54303b = b450Var;
        this.f54304c = arrayList;
        this.f54305d = (qe70) gh00Var;
    }

    @Override // p204p.AbstractC2282q6
    /* JADX INFO: renamed from: a */
    public final int mo33075a() {
        return this.f54302a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [p.gh00, p.qe70] */
    @Override // java.util.List
    public final Object get(int i) {
        b450 b450Var = this.f54303b;
        if (b450Var.m28070a(i)) {
            return this.f54304c.get(i - b450Var.f278778a);
        }
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f54306e;
        Object obj = map.get(numValueOf);
        if (obj != null) {
            return obj;
        }
        Object objInvoke = this.f54305d.invoke(Integer.valueOf(i));
        map.put(numValueOf, objInvoke);
        return objInvoke;
    }
}
