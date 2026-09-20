package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qln0 {

    /* JADX INFO: renamed from: a */
    public final am71 f189889a;

    /* JADX INFO: renamed from: b */
    public sr4 f189890b;

    public qln0(am71 am71Var) {
        this.f189889a = am71Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m73248a(int i) {
        String str;
        String strConcat;
        sr4 sr4Var = this.f189890b;
        if (sr4Var != null) {
            sr4Var.m79016f("connecting_to_eip");
        }
        if (5 == i || 4 == i || 3 == i) {
            if (i == 1) {
                str = "start";
            } else if (i == 2) {
                str = "success";
            } else if (i == 3) {
                str = "error_upstream";
            } else if (i == 4) {
                str = "complete_upstream";
            } else {
                if (i != 5) {
                    throw null;
                }
                str = "cancel_downstream";
            }
            strConcat = "eip_".concat(str);
        } else {
            strConcat = "success";
        }
        sr4 sr4Var2 = this.f189890b;
        if (sr4Var2 != null) {
            sr4Var2.m79013a("reason", strConcat);
        }
        sr4 sr4Var3 = this.f189890b;
        if (sr4Var3 != null) {
            sr4Var3.m79016f("eip_connection");
        }
        sr4 sr4Var4 = this.f189890b;
        if (sr4Var4 != null) {
            ((rr4) this.f189889a).m76276b(sr4Var4.m79015d());
        }
        this.f189890b = null;
    }
}
