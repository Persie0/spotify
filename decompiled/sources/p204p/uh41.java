package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class uh41 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f230359a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f230360b;

    /* JADX INFO: renamed from: c */
    public final o4x f230361c;

    /* JADX INFO: renamed from: d */
    public final int f230362d;

    public uh41(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar, int i) {
        this.f230359a = otd0Var;
        this.f230360b = ibp0Var;
        this.f230361c = o4xVar;
        this.f230362d = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m83120a() {
        return this.f230362d;
    }

    /* JADX INFO: renamed from: b */
    public final o4x m83121b() {
        return this.f230361c;
    }

    /* JADX INFO: renamed from: c */
    public final otd0 m83122c() {
        return this.f230359a;
    }

    /* JADX INFO: renamed from: d */
    public final ibp0 m83123d() {
        return this.f230360b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uh41)) {
            return false;
        }
        uh41 uh41Var = (uh41) obj;
        return wj50.m88271j(this.f230359a, uh41Var.f230359a) && wj50.m88271j(this.f230360b, uh41Var.f230360b) && wj50.m88271j(this.f230361c, uh41Var.f230361c) && this.f230362d == uh41Var.f230362d;
    }

    public final int hashCode() {
        return edb.m38547C(this.f230362d) + ((this.f230361c.hashCode() + ((this.f230360b.hashCode() + (this.f230359a.hashCode() * 31)) * 31)) * 31);
    }
}
