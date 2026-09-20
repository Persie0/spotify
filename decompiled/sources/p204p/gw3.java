package p204p;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gw3 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f84901a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hw3 f84902b;

    public /* synthetic */ gw3(hw3 hw3Var, int i) {
        this.f84901a = i;
        this.f84902b = hw3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f84901a;
        hw3 hw3Var = this.f84902b;
        switch (i) {
            case 0:
                hw3.m48906a(hw3Var);
                break;
            case 1:
                hw3Var.f95846a.unregisterReceiver(hw3Var.f95849d);
                break;
            default:
                Uri uri = hw3.f95845g;
                hw3Var.m48907b();
                break;
        }
    }
}
