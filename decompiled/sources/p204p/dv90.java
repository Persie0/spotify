package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class dv90 implements iv90 {

    /* JADX INFO: renamed from: a */
    public final String f53397a;

    /* JADX INFO: renamed from: b */
    public final my90 f53398b;

    public dv90(String str, my90 my90Var) {
        this.f53397a = str;
        this.f53398b = my90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv90)) {
            return false;
        }
        dv90 dv90Var = (dv90) obj;
        return wj50.m88271j(this.f53397a, dv90Var.f53397a) && wj50.m88271j(this.f53398b, dv90Var.f53398b);
    }

    public final int hashCode() {
        return this.f53398b.hashCode() + (this.f53397a.hashCode() * 31);
    }
}
