package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class q5a0 implements s5a0 {

    /* JADX INFO: renamed from: a */
    public final nw80 f185487a;

    /* JADX INFO: renamed from: b */
    public final String f185488b;

    /* JADX INFO: renamed from: c */
    public final String f185489c;

    public q5a0(nw80 nw80Var) {
        this.f185487a = nw80Var;
        this.f185488b = nw80Var.f159049c;
        this.f185489c = nw80Var.f159047a;
    }

    @Override // p204p.s5a0
    /* JADX INFO: renamed from: a */
    public final String mo72192a() {
        return this.f185489c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q5a0) && wj50.m88271j(this.f185487a, ((q5a0) obj).f185487a);
    }

    @Override // p204p.s5a0
    public final String getUri() {
        return this.f185488b;
    }

    public final int hashCode() {
        return this.f185487a.hashCode();
    }
}
