package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class sw00 {

    /* JADX INFO: renamed from: a */
    public final String f214545a;

    /* JADX INFO: renamed from: b */
    public final String f214546b;

    /* JADX INFO: renamed from: c */
    public final vcf0 f214547c;

    /* JADX INFO: renamed from: d */
    public final double f214548d;

    public /* synthetic */ sw00(String str, String str2, vcf0 vcf0Var) {
        this(str, str2, vcf0Var, 1.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw00)) {
            return false;
        }
        sw00 sw00Var = (sw00) obj;
        return wj50.m88271j(this.f214545a, sw00Var.f214545a) && wj50.m88271j(this.f214546b, sw00Var.f214546b) && wj50.m88271j(this.f214547c, sw00Var.f214547c) && Double.compare(this.f214548d, sw00Var.f214548d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f214548d) + ((this.f214547c.hashCode() + s571.m77243b(this.f214545a.hashCode() * 31, 31, this.f214546b)) * 31);
    }

    public sw00(String str, String str2, vcf0 vcf0Var, double d) {
        this.f214545a = str;
        this.f214546b = str2;
        this.f214547c = vcf0Var;
        this.f214548d = d;
    }
}
