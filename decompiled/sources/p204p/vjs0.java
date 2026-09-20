package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vjs0 extends zjs0 {

    /* JADX INFO: renamed from: a */
    public final String f242052a;

    /* JADX INFO: renamed from: b */
    public final String f242053b;

    /* JADX INFO: renamed from: c */
    public final d850 f242054c;

    public vjs0(String str, String str2, d850 d850Var) {
        this.f242052a = str;
        this.f242053b = str2;
        this.f242054c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjs0)) {
            return false;
        }
        vjs0 vjs0Var = (vjs0) obj;
        return wj50.m88271j(this.f242052a, vjs0Var.f242052a) && wj50.m88271j(this.f242053b, vjs0Var.f242053b) && wj50.m88271j(this.f242054c, vjs0Var.f242054c);
    }

    public final int hashCode() {
        return this.f242054c.hashCode() + s571.m77243b(this.f242052a.hashCode() * 31, 31, this.f242053b);
    }
}
