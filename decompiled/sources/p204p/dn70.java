package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class dn70 extends wc9 {

    /* JADX INFO: renamed from: a */
    public final int f50697a;

    /* JADX INFO: renamed from: b */
    public final x6x0 f50698b;

    /* JADX INFO: renamed from: c */
    public final x6x0 f50699c;

    public dn70(int i, x6x0 x6x0Var, x6x0 x6x0Var2) {
        this.f50697a = i;
        this.f50698b = x6x0Var;
        this.f50699c = x6x0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn70)) {
            return false;
        }
        dn70 dn70Var = (dn70) obj;
        return this.f50697a == dn70Var.f50697a && wj50.m88271j(this.f50698b, dn70Var.f50698b) && wj50.m88271j(this.f50699c, dn70Var.f50699c);
    }

    public final int hashCode() {
        return this.f50699c.hashCode() + ((this.f50698b.hashCode() + (edb.m38547C(this.f50697a) * 31)) * 31);
    }
}
