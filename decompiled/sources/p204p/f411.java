package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f411 {

    /* JADX INFO: renamed from: a */
    public final d411 f65637a;

    /* JADX INFO: renamed from: b */
    public final e411 f65638b;

    public f411(d411 d411Var, e411 e411Var) {
        this.f65637a = d411Var;
        this.f65638b = e411Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f411)) {
            return false;
        }
        f411 f411Var = (f411) obj;
        return wj50.m88271j(this.f65637a, f411Var.f65637a) && wj50.m88271j(this.f65638b, f411Var.f65638b);
    }

    public final int hashCode() {
        return this.f65638b.hashCode() + (this.f65637a.hashCode() * 31);
    }
}
