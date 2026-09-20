package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lh80 {

    /* JADX INFO: renamed from: a */
    public final String f133413a;

    /* JADX INFO: renamed from: b */
    public final String f133414b;

    /* JADX INFO: renamed from: c */
    public final boolean f133415c;

    /* JADX INFO: renamed from: d */
    public final boolean f133416d;

    /* JADX INFO: renamed from: e */
    public final boolean f133417e;

    public lh80(String str, String str2, boolean z, boolean z2, boolean z3) {
        this.f133413a = str;
        this.f133414b = str2;
        this.f133415c = z;
        this.f133416d = z2;
        this.f133417e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh80)) {
            return false;
        }
        lh80 lh80Var = (lh80) obj;
        return wj50.m88271j(this.f133413a, lh80Var.f133413a) && wj50.m88271j(this.f133414b, lh80Var.f133414b) && this.f133415c == lh80Var.f133415c && this.f133416d == lh80Var.f133416d && this.f133417e == lh80Var.f133417e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f133417e) + s571.m77245d(s571.m77245d(s571.m77243b(this.f133413a.hashCode() * 31, 31, this.f133414b), 31, this.f133415c), 31, this.f133416d);
    }
}
