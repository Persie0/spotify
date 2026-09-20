package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes10.dex */
public final class eu61 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62888a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gu61 f62889b;

    public /* synthetic */ eu61(gu61 gu61Var, int i) {
        this.f62888a = i;
        this.f62889b = gu61Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f62888a) {
            case 0:
                sr4 sr4Var = this.f62889b.f84392i;
                if (sr4Var != null) {
                    sr4Var.m79016f("check_user_logged_in");
                }
                break;
            default:
                this.f62889b.f84390g = null;
                break;
        }
    }
}
