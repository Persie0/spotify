package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class nnp0 {

    /* JADX INFO: renamed from: a */
    public final int f156469a;

    /* JADX INFO: renamed from: b */
    public final kfe0 f156470b;

    /* JADX INFO: renamed from: c */
    public final String f156471c;

    /* JADX INFO: renamed from: d */
    public final boolean f156472d;

    /* JADX INFO: renamed from: e */
    public final lnn0 f156473e;

    /* JADX INFO: renamed from: f */
    public final boolean f156474f;

    public nnp0(int i, kfe0 kfe0Var, String str, boolean z, lnn0 lnn0Var, boolean z2) {
        this.f156469a = i;
        this.f156470b = kfe0Var;
        this.f156471c = str;
        this.f156472d = z;
        this.f156473e = lnn0Var;
        this.f156474f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nnp0)) {
            return false;
        }
        nnp0 nnp0Var = (nnp0) obj;
        return this.f156469a == nnp0Var.f156469a && wj50.m88271j(this.f156470b, nnp0Var.f156470b) && wj50.m88271j(this.f156471c, nnp0Var.f156471c) && this.f156472d == nnp0Var.f156472d && this.f156473e == nnp0Var.f156473e && this.f156474f == nnp0Var.f156474f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f156474f) + ((this.f156473e.hashCode() + s571.m77245d(s571.m77243b((this.f156470b.hashCode() + (Integer.hashCode(this.f156469a) * 31)) * 31, 31, this.f156471c), 31, this.f156472d)) * 31);
    }
}
