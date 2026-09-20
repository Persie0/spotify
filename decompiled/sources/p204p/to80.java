package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class to80 {

    /* JADX INFO: renamed from: a */
    public final dw50 f222199a;

    /* JADX INFO: renamed from: b */
    public final so80 f222200b;

    /* JADX INFO: renamed from: c */
    public final b450 f222201c;

    /* JADX INFO: renamed from: d */
    public final int f222202d;

    /* JADX WARN: Multi-variable type inference failed */
    public to80(dw50 dw50Var, so80 so80Var) {
        this.f222199a = dw50Var;
        this.f222200b = so80Var;
        List list = so80Var.f211143f;
        this.f222201c = list.isEmpty() ? b450.f23226d : h6f.m46713J(list);
        this.f222202d = dw50Var instanceof i6a0 ? ((i6a0) dw50Var).getCount() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to80)) {
            return false;
        }
        to80 to80Var = (to80) obj;
        return wj50.m88271j(this.f222199a, to80Var.f222199a) && wj50.m88271j(this.f222200b, to80Var.f222200b);
    }

    public final int hashCode() {
        return this.f222200b.hashCode() + (this.f222199a.hashCode() * 31);
    }
}
