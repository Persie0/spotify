package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class bpw0 {

    /* JADX INFO: renamed from: a */
    public final String f29617a;

    /* JADX INFO: renamed from: b */
    public final String f29618b;

    /* JADX INFO: renamed from: c */
    public final dhr0 f29619c;

    public bpw0(String str, String str2, dhr0 dhr0Var) {
        this.f29617a = str;
        this.f29618b = str2;
        this.f29619c = dhr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpw0)) {
            return false;
        }
        bpw0 bpw0Var = (bpw0) obj;
        return wj50.m88271j(this.f29617a, bpw0Var.f29617a) && wj50.m88271j(this.f29618b, bpw0Var.f29618b) && wj50.m88271j(this.f29619c, bpw0Var.f29619c);
    }

    public final int hashCode() {
        return this.f29619c.hashCode() + s571.m77243b(this.f29617a.hashCode() * 31, 31, this.f29618b);
    }
}
