package p204p;

import android.os.Looper;

/* JADX INFO: loaded from: classes5.dex */
public final class hf50 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f90599a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lf50 f90600b;

    public /* synthetic */ hf50(lf50 lf50Var, int i) {
        this.f90599a = i;
        this.f90600b = lf50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f90599a) {
            case 0:
                Looper looper = this.f90600b.f132828h;
                if (!wj50.m88271j(looper, Looper.getMainLooper())) {
                    looper.quitSafely();
                }
                break;
            default:
                lf50 lf50Var = this.f90600b;
                lf50Var.m58842C0();
                lf50Var.f132829i.post(new hf50(lf50Var, 0));
                break;
        }
    }
}
