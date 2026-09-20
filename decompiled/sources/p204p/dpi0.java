package p204p;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class dpi0 extends tgc0 implements sq60 {

    /* JADX INFO: renamed from: d */
    public final nqn0 f51339d;

    /* JADX INFO: renamed from: e */
    public Object f51340e;

    public dpi0(nqn0 nqn0Var, Object obj, Object obj2) {
        super(0, obj, obj2);
        this.f51339d = nqn0Var;
        this.f51340e = obj2;
    }

    @Override // p204p.tgc0, java.util.Map.Entry
    public final Object getValue() {
        return this.f51340e;
    }

    @Override // p204p.tgc0, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f51340e;
        this.f51340e = obj;
        kqn0 kqn0Var = (kqn0) this.f51339d.f157300b;
        iqn0 iqn0Var = kqn0Var.f125352d;
        Object obj3 = this.f220169b;
        if (!iqn0Var.containsKey(obj3)) {
            return obj2;
        }
        boolean z = kqn0Var.f83500c;
        if (!z) {
            iqn0Var.put(obj3, obj);
        } else {
            if (!z) {
                throw new NoSuchElementException();
            }
            oj91 oj91Var = kqn0Var.f83498a[kqn0Var.f83499b];
            Object obj4 = oj91Var.f166018a[oj91Var.f166020c];
            iqn0Var.put(obj3, obj);
            kqn0Var.m57116c(obj4 != null ? obj4.hashCode() : 0, iqn0Var.f104807c, obj4, 0);
        }
        kqn0Var.f125355g = iqn0Var.f104809e;
        return obj2;
    }
}
