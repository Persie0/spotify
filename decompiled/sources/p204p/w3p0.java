package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class w3p0 {

    /* JADX INFO: renamed from: a */
    public final boolean f247627a;

    /* JADX INFO: renamed from: b */
    public final u3p0 f247628b;

    /* JADX INFO: renamed from: c */
    public final int f247629c;

    public w3p0(boolean z, u3p0 u3p0Var, int i) {
        this.f247627a = z;
        this.f247628b = u3p0Var;
        this.f247629c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3p0)) {
            return false;
        }
        w3p0 w3p0Var = (w3p0) obj;
        return this.f247627a == w3p0Var.f247627a && this.f247628b.equals(w3p0Var.f247628b) && this.f247629c == w3p0Var.f247629c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f247629c) + ((this.f247628b.hashCode() + (Boolean.hashCode(this.f247627a) * 31)) * 31);
    }
}
