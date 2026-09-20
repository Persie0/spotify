package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ch20 {

    /* JADX INFO: renamed from: a */
    public final bh20 f37870a;

    /* JADX INFO: renamed from: b */
    public final boolean f37871b;

    /* JADX INFO: renamed from: c */
    public final int f37872c;

    public ch20(bh20 bh20Var, boolean z, int i) {
        this.f37870a = bh20Var;
        this.f37871b = z;
        this.f37872c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch20)) {
            return false;
        }
        ch20 ch20Var = (ch20) obj;
        return wj50.m88271j(this.f37870a, ch20Var.f37870a) && this.f37871b == ch20Var.f37871b && this.f37872c == ch20Var.f37872c;
    }

    public final int hashCode() {
        return edb.m38547C(this.f37872c) + s571.m77245d(this.f37870a.hashCode() * 31, 31, this.f37871b);
    }
}
