package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class if3 extends ig3 {

    /* JADX INFO: renamed from: a */
    public final String f101641a;

    /* JADX INFO: renamed from: b */
    public final u980 f101642b;

    public if3(String str, u980 u980Var) {
        this.f101641a = str;
        this.f101642b = u980Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if3)) {
            return false;
        }
        if3 if3Var = (if3) obj;
        return wj50.m88271j(this.f101641a, if3Var.f101641a) && wj50.m88271j(this.f101642b, if3Var.f101642b);
    }

    public final int hashCode() {
        return this.f101642b.hashCode() + (this.f101641a.hashCode() * 31);
    }
}
