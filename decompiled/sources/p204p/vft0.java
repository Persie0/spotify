package p204p;

import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class vft0 implements Action {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f241027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wft0 f241028b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f241029c;

    public /* synthetic */ vft0(wft0 wft0Var, String str, int i) {
        this.f241027a = i;
        this.f241028b = wft0Var;
        this.f241029c = str;
    }

    @Override // io.reactivex.rxjava3.functions.Action
    public final void run() {
        switch (this.f241027a) {
            case 0:
                lv31 lv31VarEdit = this.f241028b.f250895e.edit();
                uft0.f229873a.getClass();
                lv31VarEdit.m60051d(tft0.f220047b, this.f241029c);
                lv31VarEdit.m60054g();
                break;
            default:
                lv31 lv31VarEdit2 = this.f241028b.f250895e.edit();
                uft0.f229873a.getClass();
                lv31VarEdit2.m60051d(tft0.f220047b, this.f241029c);
                lv31VarEdit2.m60054g();
                break;
        }
    }
}
