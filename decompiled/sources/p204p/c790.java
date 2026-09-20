package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class c790 {

    /* JADX INFO: renamed from: a */
    public final String f34823a;

    /* JADX INFO: renamed from: b */
    public final int f34824b;

    /* JADX INFO: renamed from: c */
    public final int f34825c;

    /* JADX INFO: renamed from: d */
    public final nt80 f34826d;

    public c790(int i, int i2, String str, nt80 nt80Var) {
        this.f34823a = str;
        this.f34824b = i;
        this.f34825c = i2;
        this.f34826d = nt80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c790)) {
            return false;
        }
        c790 c790Var = (c790) obj;
        return this.f34823a.equals(c790Var.f34823a) && this.f34824b == c790Var.f34824b && this.f34825c == c790Var.f34825c && this.f34826d.equals(c790Var.f34826d);
    }

    public final int hashCode() {
        return this.f34826d.hashCode() + mt60.m62800g(this.f34825c, mt60.m62800g(this.f34824b, this.f34823a.hashCode() * 31, 31), 31);
    }
}
