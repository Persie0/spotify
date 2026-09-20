package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class ata1 {

    /* JADX INFO: renamed from: a */
    public final double f19637a;

    /* JADX INFO: renamed from: b */
    public final double f19638b;

    /* JADX INFO: renamed from: c */
    public final String f19639c;

    /* JADX INFO: renamed from: d */
    public final String f19640d;

    /* JADX INFO: renamed from: e */
    public final String f19641e;

    public ata1(double d, double d2, String str, String str2, String str3) {
        this.f19637a = d;
        this.f19638b = d2;
        this.f19639c = str;
        this.f19640d = str2;
        this.f19641e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ata1)) {
            return false;
        }
        ata1 ata1Var = (ata1) obj;
        return Double.compare(this.f19637a, ata1Var.f19637a) == 0 && Double.compare(this.f19638b, ata1Var.f19638b) == 0 && wj50.m88271j(this.f19639c, ata1Var.f19639c) && wj50.m88271j(this.f19640d, ata1Var.f19640d) && wj50.m88271j(this.f19641e, ata1Var.f19641e);
    }

    public final int hashCode() {
        return this.f19641e.hashCode() + s571.m77243b(s571.m77243b(xl81.m91399h(this.f19638b, Double.hashCode(this.f19637a) * 31, 31), 31, this.f19639c), 31, this.f19640d);
    }
}
