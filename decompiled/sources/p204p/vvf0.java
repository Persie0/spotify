package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vvf0 {

    /* JADX INFO: renamed from: a */
    public final fjf0 f245227a;

    public vvf0(fjf0 fjf0Var) {
        this.f245227a = fjf0Var;
    }

    /* JADX INFO: renamed from: a */
    public final uvf0 m86458a(String str, String str2) {
        fjf0 fjf0Var = this.f245227a;
        boolean z = fjf0Var.f70264m;
        qvf0 qvf0Var = qvf0.f193007a;
        tvf0 tvf0Var = tvf0.f224153a;
        svf0 svf0Var = svf0.f214427a;
        if (!z) {
            if (str2 == null) {
                str2 = "";
            }
            if (fjf0Var.f70240a) {
                if (wj50.m88271j(str2, "premium")) {
                    return qvf0Var;
                }
                if (wj50.m88271j(str2, "free") && fjf0Var.f70266n) {
                    return tvf0Var;
                }
            }
            return svf0Var;
        }
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2049179193) {
            if (iHashCode != 2123274) {
                if (iHashCode == 2634405 && str.equals("VIEW") && fjf0Var.f70266n) {
                    return tvf0Var;
                }
            } else if (str.equals("EDIT")) {
                return qvf0Var;
            }
        } else if (str.equals("LISTEN")) {
            return rvf0.f203075a;
        }
        return svf0Var;
    }
}
