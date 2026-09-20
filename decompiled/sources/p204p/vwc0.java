package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vwc0 implements rxc0 {

    /* JADX INFO: renamed from: a */
    public final qf40 f245455a;

    /* JADX INFO: renamed from: b */
    public final String f245456b;

    public vwc0(String str, qf40 qf40Var) {
        this.f245455a = qf40Var;
        this.f245456b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vwc0)) {
            return false;
        }
        vwc0 vwc0Var = (vwc0) obj;
        return wj50.m88271j(this.f245455a, vwc0Var.f245455a) && wj50.m88271j(this.f245456b, vwc0Var.f245456b);
    }

    public final int hashCode() {
        int iM77245d = s571.m77245d(this.f245455a.hashCode() * 31, 31, false);
        String str = this.f245456b;
        return iM77245d + (str != null ? str.hashCode() : 0);
    }
}
