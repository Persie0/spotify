package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes5.dex */
public final class it7 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f105446a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hv31 f105447b;

    public /* synthetic */ it7(hv31 hv31Var, int i) {
        this.f105446a = i;
        this.f105447b = hv31Var;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f105446a) {
            case 0:
                lv31 lv31VarEdit = this.f105447b.edit();
                lv31VarEdit.m60048a(jt7.f115746f, true);
                lv31VarEdit.m60055h();
                break;
            case 1:
                lv31 lv31VarEdit2 = this.f105447b.edit();
                lv31VarEdit2.m60048a(lbz.f131781b, true);
                lv31VarEdit2.m60055h();
                break;
            default:
                lv31 lv31VarEdit3 = this.f105447b.edit();
                lv31VarEdit3.m60048a(lbz.f131780a, true);
                lv31VarEdit3.m60055h();
                break;
        }
    }
}
