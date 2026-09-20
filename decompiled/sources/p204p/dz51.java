package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dz51 {

    /* JADX INFO: renamed from: a */
    public final String f54537a;

    /* JADX INFO: renamed from: b */
    public final int f54538b;

    /* JADX INFO: renamed from: c */
    public final gh00 f54539c;

    public dz51(String str, int i, gh00 gh00Var) {
        this.f54537a = str;
        this.f54538b = i;
        this.f54539c = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz51)) {
            return false;
        }
        dz51 dz51Var = (dz51) obj;
        return wj50.m88271j(this.f54537a, dz51Var.f54537a) && this.f54538b == dz51Var.f54538b && wj50.m88271j(this.f54539c, dz51Var.f54539c);
    }

    public final int hashCode() {
        return this.f54539c.hashCode() + mt60.m62800g(this.f54538b, this.f54537a.hashCode() * 31, 31);
    }
}
