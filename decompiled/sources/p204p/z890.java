package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class z890 {

    /* JADX INFO: renamed from: a */
    public final Integer f280420a;

    /* JADX INFO: renamed from: b */
    public final boolean f280421b;

    /* JADX INFO: renamed from: c */
    public final tdu f280422c;

    public z890(Integer num, boolean z, tdu tduVar) {
        this.f280420a = num;
        this.f280421b = z;
        this.f280422c = tduVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z890)) {
            return false;
        }
        z890 z890Var = (z890) obj;
        return wj50.m88271j(this.f280420a, z890Var.f280420a) && this.f280421b == z890Var.f280421b && wj50.m88271j(this.f280422c, z890Var.f280422c);
    }

    public final int hashCode() {
        Integer num = this.f280420a;
        return this.f280422c.hashCode() + s571.m77245d((num == null ? 0 : num.hashCode()) * 31, 31, this.f280421b);
    }
}
