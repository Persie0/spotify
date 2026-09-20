package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class dsd1 implements yrd1 {

    /* JADX INFO: renamed from: a */
    public final String f52548a;

    /* JADX INFO: renamed from: b */
    public final u6r f52549b;

    /* JADX INFO: renamed from: c */
    public final String f52550c;

    public dsd1(String str, u6r u6rVar, String str2) {
        this.f52548a = str;
        this.f52549b = u6rVar;
        this.f52550c = str2;
    }

    @Override // p204p.yrd1
    /* JADX INFO: renamed from: b */
    public final String mo27089b() {
        return this.f52550c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsd1)) {
            return false;
        }
        dsd1 dsd1Var = (dsd1) obj;
        return wj50.m88271j(this.f52548a, dsd1Var.f52548a) && wj50.m88271j(this.f52549b, dsd1Var.f52549b) && wj50.m88271j(this.f52550c, dsd1Var.f52550c);
    }

    public final int hashCode() {
        return this.f52550c.hashCode() + ((this.f52549b.hashCode() + (this.f52548a.hashCode() * 31)) * 31);
    }

    @Override // p204p.yrd1
    /* JADX INFO: renamed from: m */
    public final u6r mo27092m() {
        return this.f52549b;
    }
}
