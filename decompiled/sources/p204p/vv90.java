package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vv90 implements ow90 {

    /* JADX INFO: renamed from: a */
    public final String f245173a;

    /* JADX INFO: renamed from: b */
    public final boolean f245174b;

    /* JADX INFO: renamed from: c */
    public final d850 f245175c;

    public vv90(String str, d850 d850Var, boolean z) {
        this.f245173a = str;
        this.f245174b = z;
        this.f245175c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv90)) {
            return false;
        }
        vv90 vv90Var = (vv90) obj;
        return wj50.m88271j(this.f245173a, vv90Var.f245173a) && this.f245174b == vv90Var.f245174b && wj50.m88271j(this.f245175c, vv90Var.f245175c);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f245173a.hashCode() * 31, 31, this.f245174b);
        d850 d850Var = this.f245175c;
        return iM77245d + (d850Var == null ? 0 : d850Var.hashCode());
    }
}
