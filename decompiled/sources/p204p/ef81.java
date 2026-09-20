package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ef81 {

    /* JADX INFO: renamed from: a */
    public final fh0 f58981a;

    /* JADX INFO: renamed from: b */
    public final nyt f58982b;

    public ef81(fh0 fh0Var, nyt nytVar) {
        this.f58981a = fh0Var;
        this.f58982b = nytVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef81)) {
            return false;
        }
        ef81 ef81Var = (ef81) obj;
        return wj50.m88271j(this.f58981a, ef81Var.f58981a) && wj50.m88271j(this.f58982b, ef81Var.f58982b);
    }

    public final int hashCode() {
        fh0 fh0Var = this.f58981a;
        return this.f58982b.hashCode() + ((fh0Var == null ? 0 : fh0Var.hashCode()) * 31);
    }
}
