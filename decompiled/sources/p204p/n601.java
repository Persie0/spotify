package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class n601 {

    /* JADX INFO: renamed from: a */
    public final double f150655a;

    /* JADX INFO: renamed from: b */
    public final String f150656b;

    /* JADX INFO: renamed from: c */
    public final String f150657c;

    /* JADX INFO: renamed from: d */
    public final gh00 f150658d;

    public n601(double d, String str, String str2, l7i l7iVar) {
        this.f150655a = d;
        this.f150656b = str;
        this.f150657c = str2;
        this.f150658d = l7iVar;
    }

    /* JADX INFO: renamed from: a */
    public final gh00 m63753a() {
        return this.f150658d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n601)) {
            return false;
        }
        n601 n601Var = (n601) obj;
        return Double.compare(this.f150655a, n601Var.f150655a) == 0 && wj50.m88271j(this.f150656b, n601Var.f150656b) && wj50.m88271j(this.f150657c, n601Var.f150657c) && wj50.m88271j(this.f150658d, n601Var.f150658d);
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(Double.hashCode(this.f150655a) * 31, 31, this.f150656b);
        String str = this.f150657c;
        int iHashCode = (iM77243b + (str == null ? 0 : str.hashCode())) * 31;
        gh00 gh00Var = this.f150658d;
        return iHashCode + (gh00Var != null ? gh00Var.hashCode() : 0);
    }
}
