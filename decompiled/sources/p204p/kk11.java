package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class kk11 {

    /* JADX INFO: renamed from: a */
    public final double f123482a;

    /* JADX INFO: renamed from: b */
    public final String f123483b;

    /* JADX INFO: renamed from: c */
    public final String f123484c;

    public kk11(String str, String str2, double d) {
        this.f123482a = d;
        this.f123483b = str;
        this.f123484c = str2;
    }

    /* JADX INFO: renamed from: a */
    public final double m56630a() {
        return this.f123482a;
    }

    /* JADX INFO: renamed from: b */
    public final String m56631b() {
        return this.f123483b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk11)) {
            return false;
        }
        kk11 kk11Var = (kk11) obj;
        return Double.compare(this.f123482a, kk11Var.f123482a) == 0 && wj50.m88271j(this.f123483b, kk11Var.f123483b) && wj50.m88271j(this.f123484c, kk11Var.f123484c);
    }

    public final int hashCode() {
        return this.f123484c.hashCode() + s571.m77243b(Double.hashCode(this.f123482a) * 31, 31, this.f123483b);
    }
}
