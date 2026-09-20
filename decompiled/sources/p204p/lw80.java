package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class lw80 {

    /* JADX INFO: renamed from: a */
    public final int f137483a;

    /* JADX INFO: renamed from: b */
    public final String f137484b;

    /* JADX INFO: renamed from: c */
    public final String f137485c;

    public lw80(int i, String str, String str2) {
        this.f137483a = i;
        this.f137484b = str;
        this.f137485c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw80)) {
            return false;
        }
        lw80 lw80Var = (lw80) obj;
        return this.f137483a == lw80Var.f137483a && wj50.m88271j(this.f137484b, lw80Var.f137484b) && wj50.m88271j(this.f137485c, lw80Var.f137485c);
    }

    public final int hashCode() {
        return this.f137485c.hashCode() + s571.m77243b(Integer.hashCode(this.f137483a) * 31, 31, this.f137484b);
    }
}
