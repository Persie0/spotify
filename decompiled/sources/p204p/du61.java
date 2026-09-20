package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class du61 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gu61 f52988b;

    public /* synthetic */ du61(gu61 gu61Var, int i) {
        this.f52987a = i;
        this.f52988b = gu61Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f52987a) {
            case 0:
                sr4 sr4Var = this.f52988b.f84392i;
                if (sr4Var != null) {
                    sr4Var.m79019k("check_user_logged_in", null, (4 & 4) != 0);
                }
                break;
            case 1:
                gu61 gu61Var = this.f52988b;
                sr4 sr4Var2 = gu61Var.f84392i;
                if (sr4Var2 != null) {
                    sr4Var2.m79016f("handle_tap_action");
                }
                sr4 sr4Var3 = gu61Var.f84392i;
                if (sr4Var3 != null) {
                    ((rr4) gu61Var.f84387d).m76276b(sr4Var3.m79015d());
                }
                gu61Var.f84392i = null;
                break;
            case 2:
                sr4 sr4Var4 = this.f52988b.f84392i;
                if (sr4Var4 != null) {
                    sr4Var4.m79019k("fetch_something_to_play", null, (4 & 4) != 0);
                    sr4Var4.m79013a("fetch_mode", "playSomethingWithQuickstartPivot");
                }
                break;
            case 3:
                sr4 sr4Var5 = this.f52988b.f84392i;
                if (sr4Var5 != null) {
                    sr4Var5.m79016f("fetch_something_to_play");
                }
                break;
            default:
                sr4 sr4Var6 = this.f52988b.f84393j;
                if (sr4Var6 != null) {
                    sr4Var6.m79019k("connect", null, (4 & 4) != 0);
                }
                break;
        }
    }
}
