package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class hz21 extends yz21 {

    /* JADX INFO: renamed from: a */
    public final int f96772a;

    /* JADX INFO: renamed from: b */
    public final String f96773b;

    /* JADX INFO: renamed from: c */
    public final lx21 f96774c;

    public hz21(int i, String str, lx21 lx21Var) {
        this.f96772a = i;
        this.f96773b = str;
        this.f96774c = lx21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz21)) {
            return false;
        }
        hz21 hz21Var = (hz21) obj;
        return this.f96772a == hz21Var.f96772a && wj50.m88271j(this.f96773b, hz21Var.f96773b) && wj50.m88271j(this.f96774c, hz21Var.f96774c);
    }

    public final int hashCode() {
        return this.f96774c.hashCode() + s571.m77243b(Integer.hashCode(this.f96772a) * 31, 31, this.f96773b);
    }
}
