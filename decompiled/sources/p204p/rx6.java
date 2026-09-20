package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class rx6 {

    /* JADX INFO: renamed from: a */
    public final int f203509a;

    /* JADX INFO: renamed from: b */
    public final int f203510b;

    /* JADX INFO: renamed from: c */
    public final String f203511c;

    /* JADX INFO: renamed from: d */
    public final String f203512d;

    public rx6(int i, String str, int i2, String str2) {
        this.f203509a = i;
        this.f203510b = i2;
        this.f203511c = str;
        this.f203512d = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m76608a() {
        return this.f203512d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx6)) {
            return false;
        }
        rx6 rx6Var = (rx6) obj;
        return this.f203509a == rx6Var.f203509a && this.f203510b == rx6Var.f203510b && wj50.m88271j(this.f203511c, rx6Var.f203511c) && wj50.m88271j(this.f203512d, rx6Var.f203512d);
    }

    public final int hashCode() {
        int iM62800g = mt60.m62800g(this.f203510b, Integer.hashCode(this.f203509a) * 31, 31);
        String str = this.f203511c;
        int iHashCode = (iM62800g + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f203512d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
