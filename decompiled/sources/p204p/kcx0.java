package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class kcx0 {

    /* JADX INFO: renamed from: a */
    public final String f121560a;

    /* JADX INFO: renamed from: b */
    public final boolean f121561b;

    /* JADX INFO: renamed from: c */
    public final String f121562c;

    public kcx0(String str, String str2, boolean z) {
        this.f121560a = str;
        this.f121561b = z;
        this.f121562c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcx0)) {
            return false;
        }
        kcx0 kcx0Var = (kcx0) obj;
        return wj50.m88271j(this.f121560a, kcx0Var.f121560a) && this.f121561b == kcx0Var.f121561b && this.f121562c.equals(kcx0Var.f121562c);
    }

    public final int hashCode() {
        return this.f121562c.hashCode() + s571.m77245d(this.f121560a.hashCode() * 31, 31, this.f121561b);
    }
}
