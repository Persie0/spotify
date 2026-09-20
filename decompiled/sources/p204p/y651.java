package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class y651 {

    /* JADX INFO: renamed from: a */
    public final long f269692a;

    /* JADX INFO: renamed from: b */
    public final String f269693b;

    /* JADX INFO: renamed from: c */
    public final Double f269694c;

    public y651(long j, String str, Double d) {
        this.f269692a = j;
        this.f269693b = str;
        this.f269694c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y651)) {
            return false;
        }
        y651 y651Var = (y651) obj;
        long j = y651Var.f269692a;
        int i = n6f.f150872l;
        return as91.m27074b(this.f269692a, j) && wj50.m88271j(this.f269693b, y651Var.f269693b) && wj50.m88271j(this.f269694c, y651Var.f269694c);
    }

    public final int hashCode() {
        int i = n6f.f150872l;
        int iM77243b = s571.m77243b(Long.hashCode(this.f269692a) * 31, 31, this.f269693b);
        Double d = this.f269694c;
        return iM77243b + (d == null ? 0 : d.hashCode());
    }
}
