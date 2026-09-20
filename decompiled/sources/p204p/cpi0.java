package p204p;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes11.dex */
public final class cpi0 extends tgc0 implements sq60 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f40562d = 1;

    /* JADX INFO: renamed from: e */
    public final Object f40563e;

    /* JADX INFO: renamed from: f */
    public Object f40564f;

    public cpi0(Map map, Object obj, tn80 tn80Var) {
        super(1, obj, tn80Var.f221904a);
        this.f40563e = map;
        this.f40564f = tn80Var;
    }

    @Override // p204p.tgc0, java.util.Map.Entry
    public final Object getValue() {
        switch (this.f40562d) {
            case 0:
                return this.f40564f;
            default:
                return ((tn80) this.f40564f).f221904a;
        }
    }

    @Override // p204p.tgc0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        switch (this.f40562d) {
            case 0:
                Object obj2 = this.f40564f;
                this.f40564f = obj;
                jqn0 jqn0Var = (jqn0) ((nqn0) this.f40563e).f157300b;
                hqn0 hqn0Var = jqn0Var.f114929d;
                Object obj3 = this.f220169b;
                if (hqn0Var.containsKey(obj3)) {
                    boolean z = jqn0Var.f72240c;
                    if (!z) {
                        hqn0Var.put(obj3, obj);
                    } else {
                        if (!z) {
                            throw new NoSuchElementException();
                        }
                        nj91 nj91Var = jqn0Var.f72238a[jqn0Var.f72239b];
                        Object obj4 = nj91Var.f154532a[nj91Var.f154534c];
                        hqn0Var.put(obj3, obj);
                        jqn0Var.m54110c(obj4 == null ? 0 : obj4.hashCode(), hqn0Var.f94224c, obj4, 0);
                    }
                    jqn0Var.f114932g = hqn0Var.f94226e;
                }
                return obj2;
            default:
                tn80 tn80Var = (tn80) this.f40564f;
                Object obj5 = tn80Var.f221904a;
                tn80 tn80VarM81168h = tn80Var.m81168h(obj);
                this.f40564f = tn80VarM81168h;
                ((Map) this.f40563e).put(this.f220169b, tn80VarM81168h);
                return obj5;
        }
    }

    public cpi0(nqn0 nqn0Var, Object obj, Object obj2) {
        super(1, obj, obj2);
        this.f40563e = nqn0Var;
        this.f40564f = obj2;
    }
}
