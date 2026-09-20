package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class c88 {

    /* JADX INFO: renamed from: a */
    public final v851 f35137a;

    /* JADX INFO: renamed from: b */
    public final int f35138b;

    /* JADX INFO: renamed from: c */
    public final boolean f35139c;

    /* JADX INFO: renamed from: d */
    public final String f35140d;

    public c88(v851 v851Var, int i, boolean z, String str) {
        this.f35137a = v851Var;
        this.f35138b = i;
        this.f35139c = z;
        this.f35140d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c88)) {
            return false;
        }
        c88 c88Var = (c88) obj;
        return wj50.m88271j(this.f35137a, c88Var.f35137a) && this.f35138b == c88Var.f35138b && this.f35139c == c88Var.f35139c && wj50.m88271j(this.f35140d, c88Var.f35140d);
    }

    public final int hashCode() {
        return this.f35140d.hashCode() + s571.m77245d(mt60.m62800g(this.f35138b, this.f35137a.hashCode() * 31, 31), 31, this.f35139c);
    }
}
