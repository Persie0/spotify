package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ulf0 implements rmf0 {

    /* JADX INFO: renamed from: a */
    public final String f231553a;

    /* JADX INFO: renamed from: b */
    public final String f231554b;

    public ulf0(String str, String str2) {
        this.f231553a = str;
        this.f231554b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ulf0)) {
            return false;
        }
        ulf0 ulf0Var = (ulf0) obj;
        return wj50.m88271j(this.f231553a, ulf0Var.f231553a) && wj50.m88271j(this.f231554b, ulf0Var.f231554b);
    }

    public final int hashCode() {
        return this.f231554b.hashCode() + (this.f231553a.hashCode() * 31);
    }
}
