package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class izq0 implements kzq0 {

    /* JADX INFO: renamed from: a */
    public final tk6 f107279a;

    /* JADX INFO: renamed from: b */
    public final String f107280b;

    public izq0(tk6 tk6Var, String str) {
        this.f107279a = tk6Var;
        this.f107280b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izq0)) {
            return false;
        }
        izq0 izq0Var = (izq0) obj;
        return wj50.m88271j(this.f107279a, izq0Var.f107279a) && wj50.m88271j(this.f107280b, izq0Var.f107280b);
    }

    @Override // p204p.kzq0
    public final String getUri() {
        return this.f107280b;
    }

    public final int hashCode() {
        return this.f107280b.hashCode() + (this.f107279a.f221090a.hashCode() * 31);
    }
}
