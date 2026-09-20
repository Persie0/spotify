package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class i5a0 implements k5a0 {

    /* JADX INFO: renamed from: a */
    public final iad1 f98853a;

    /* JADX INFO: renamed from: b */
    public final String f98854b;

    public i5a0(String str, iad1 iad1Var) {
        this.f98853a = iad1Var;
        this.f98854b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5a0)) {
            return false;
        }
        i5a0 i5a0Var = (i5a0) obj;
        return wj50.m88271j(this.f98853a, i5a0Var.f98853a) && wj50.m88271j(this.f98854b, i5a0Var.f98854b);
    }

    public final int hashCode() {
        return this.f98854b.hashCode() + (this.f98853a.hashCode() * 31);
    }
}
