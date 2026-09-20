package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class zbf0 {

    /* JADX INFO: renamed from: a */
    public final String f281315a;

    /* JADX INFO: renamed from: b */
    public final acf0 f281316b;

    /* JADX INFO: renamed from: c */
    public final vcf0 f281317c;

    public zbf0(String str, acf0 acf0Var, vcf0 vcf0Var) {
        this.f281315a = str;
        this.f281316b = acf0Var;
        this.f281317c = vcf0Var;
    }

    /* JADX INFO: renamed from: a */
    public final acf0 m95840a() {
        return this.f281316b;
    }

    /* JADX INFO: renamed from: b */
    public final String m95841b() {
        return this.f281315a;
    }

    /* JADX INFO: renamed from: c */
    public final vcf0 m95842c() {
        return this.f281317c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbf0)) {
            return false;
        }
        zbf0 zbf0Var = (zbf0) obj;
        return wj50.m88271j(this.f281315a, zbf0Var.f281315a) && this.f281316b == zbf0Var.f281316b && wj50.m88271j(this.f281317c, zbf0Var.f281317c);
    }

    public final int hashCode() {
        return this.f281317c.hashCode() + ((this.f281316b.hashCode() + (this.f281315a.hashCode() * 31)) * 31);
    }
}
