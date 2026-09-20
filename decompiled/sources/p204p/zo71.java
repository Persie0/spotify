package p204p;

import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class zo71 implements t150 {

    /* JADX INFO: renamed from: a */
    public final am71 f284721a;

    /* JADX INFO: renamed from: b */
    public final oxe f284722b;

    public zo71(am71 am71Var, oxe oxeVar) {
        this.f284721a = am71Var;
        this.f284722b = oxeVar;
    }

    @Override // p204p.t150
    /* JADX INFO: renamed from: a */
    public final void mo36755a(String str) {
        xy3 xy3Var = (xy3) this.f284722b;
        xy3Var.getClass();
        xy3Var.m92400e("quasar_".concat(str.toLowerCase(Locale.US)));
    }

    @Override // p204p.t150
    /* JADX INFO: renamed from: b */
    public final void mo36756b(String str) {
        xy3 xy3Var = (xy3) this.f284722b;
        xy3Var.getClass();
        xy3Var.m92396a("quasar_".concat(str.toLowerCase(Locale.US)));
    }

    @Override // p204p.t150
    /* JADX INFO: renamed from: c */
    public final long mo36757c() {
        return ((rr4) this.f284721a).f201947a.m27521a();
    }

    @Override // p204p.t150
    /* JADX INFO: renamed from: d */
    public final void mo36758d(v6d0 v6d0Var) {
        String str = v6d0Var.f237814a;
        rr4 rr4Var = (rr4) this.f284721a;
        sr4 sr4VarM76275a = rr4Var.m76275a(str);
        sr4.m79008c(sr4VarM76275a, v6d0Var.f237814a, v6d0Var.f237815b, v6d0Var.f237816c, 8);
        for (u6d0 u6d0Var : v6d0Var.f237817d) {
            sr4.m79008c(sr4VarM76275a, u6d0Var.f227301a, u6d0Var.f227303c, u6d0Var.f227304d, 24);
        }
        for (Map.Entry entry : v6d0Var.f237818e.entrySet()) {
            sr4VarM76275a.m79014b((String) entry.getKey(), (String) entry.getValue());
        }
        rr4Var.m76276b(sr4VarM76275a.m79015d());
    }
}
