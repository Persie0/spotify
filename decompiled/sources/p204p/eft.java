package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class eft implements tmt {

    /* JADX INFO: renamed from: a */
    public final de71 f59121a;

    /* JADX INFO: renamed from: b */
    public final int f59122b;

    public eft(de71 de71Var, int i) {
        this.f59121a = de71Var;
        this.f59122b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eft)) {
            return false;
        }
        eft eftVar = (eft) obj;
        return this.f59121a == eftVar.f59121a && this.f59122b == eftVar.f59122b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59122b) + (this.f59121a.hashCode() * 31);
    }
}
