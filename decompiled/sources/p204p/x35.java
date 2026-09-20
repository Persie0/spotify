package p204p;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x35 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f257693a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f257694b;

    public /* synthetic */ x35(Object obj, int i) {
        this.f257693a = i;
        this.f257694b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f257693a) {
            case 0:
                eh00 eh00Var = (eh00) this.f257694b;
                if (eh00Var != null) {
                    eh00Var.invoke();
                }
                break;
            case 1:
                ((l65) this.f257694b).m58292B();
                break;
            case 2:
                ((jah) this.f257694b).invoke();
                break;
            default:
                ((Runnable) this.f257694b).run();
                break;
        }
    }
}
