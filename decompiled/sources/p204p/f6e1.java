package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class f6e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final String f66388a;

    /* JADX INFO: renamed from: b */
    public final String f66389b;

    /* JADX INFO: renamed from: c */
    public final int f66390c;

    /* JADX INFO: renamed from: d */
    public final Integer f66391d;

    public f6e1(int i, String str, Integer num, String str2) {
        this.f66388a = str;
        this.f66389b = str2;
        this.f66390c = i;
        this.f66391d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6e1)) {
            return false;
        }
        f6e1 f6e1Var = (f6e1) obj;
        return this.f66388a.equals(f6e1Var.f66388a) && this.f66389b.equals(f6e1Var.f66389b) && this.f66390c == f6e1Var.f66390c && wj50.m88271j(this.f66391d, f6e1Var.f66391d);
    }

    public final int hashCode() {
        int iM40938f = f710.m40938f(this.f66390c, s571.m77243b(this.f66388a.hashCode() * 31, 31, this.f66389b), 31);
        Integer num = this.f66391d;
        return iM40938f + (num == null ? 0 : num.hashCode());
    }
}
