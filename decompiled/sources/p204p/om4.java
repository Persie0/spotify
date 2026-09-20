package p204p;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class om4 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f166965a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ maq0 f166966b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om4(maq0 maq0Var, int i) {
        super(1);
        this.f166965a = i;
        this.f166966b = maq0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f166965a) {
            case 0:
                jo70 jo70VarMo29993C = ((jo70) obj).mo29993C();
                wj50.m88279p(jo70VarMo29993C);
                this.f166966b.m61325C(jo70VarMo29993C);
                break;
            case 1:
                g450 g450Var = new g450(((g450) obj).f76347a);
                maq0 maq0Var = this.f166966b;
                maq0Var.m98379setPopupContentSizefhxjrPA(g450Var);
                maq0Var.m61326D();
                break;
            default:
                eh00 eh00Var = (eh00) obj;
                maq0 maq0Var2 = this.f166966b;
                Handler handler = maq0Var2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    eh00Var.invoke();
                } else {
                    Handler handler2 = maq0Var2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new dz3(6, eh00Var));
                    }
                }
                break;
        }
        return w2a1.f247311a;
    }
}
