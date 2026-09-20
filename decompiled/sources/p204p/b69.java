package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class b69 implements jmk0 {

    /* JADX INFO: renamed from: a */
    public final otd0 f23881a;

    /* JADX INFO: renamed from: b */
    public final ibp0 f23882b;

    /* JADX INFO: renamed from: c */
    public final o4x f23883c;

    /* JADX INFO: renamed from: d */
    public final c69 f23884d;

    public b69(otd0 otd0Var, ibp0 ibp0Var, o4x o4xVar, c69 c69Var) {
        this.f23881a = otd0Var;
        this.f23882b = ibp0Var;
        this.f23883c = o4xVar;
        this.f23884d = c69Var;
    }

    /* JADX INFO: renamed from: a */
    public final c69 m28283a() {
        return this.f23884d;
    }

    /* JADX INFO: renamed from: b */
    public final o4x m28284b() {
        return this.f23883c;
    }

    /* JADX INFO: renamed from: c */
    public final otd0 m28285c() {
        return this.f23881a;
    }

    /* JADX INFO: renamed from: d */
    public final ibp0 m28286d() {
        return this.f23882b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b69)) {
            return false;
        }
        b69 b69Var = (b69) obj;
        return wj50.m88271j(this.f23881a, b69Var.f23881a) && wj50.m88271j(this.f23882b, b69Var.f23882b) && wj50.m88271j(this.f23883c, b69Var.f23883c) && wj50.m88271j(this.f23884d, b69Var.f23884d);
    }

    public final int hashCode() {
        return this.f23884d.hashCode() + ((this.f23883c.hashCode() + ((this.f23882b.hashCode() + (this.f23881a.hashCode() * 31)) * 31)) * 31);
    }
}
