package p204p;

import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class xy0 implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dz0 f267168a;

    public xy0(dz0 dz0Var) {
        this.f267168a = dz0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        li7 li7Var = this.f267168a.f54468b;
        String str = ((f5y0) obj).f66222a;
        fv31 fv31Var = nc11.f152395c;
        lv31 lv31VarEdit = ((nc11) li7Var).f152396a.edit();
        if (str != null) {
            lv31VarEdit.m60051d(fv31Var, str);
        } else {
            lv31VarEdit.m60053f(fv31Var);
        }
        lv31VarEdit.m60054g();
    }
}
