package p204p;

import android.app.Activity;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: classes10.dex */
public final class bte implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30557a;

    /* JADX INFO: renamed from: b */
    public final Activity f30558b;

    /* JADX INFO: renamed from: c */
    public final z9j0 f30559c;

    /* JADX INFO: renamed from: d */
    public final k5m0 f30560d;

    public /* synthetic */ bte(Activity activity, z9j0 z9j0Var, k5m0 k5m0Var, int i) {
        this.f30557a = i;
        this.f30558b = activity;
        this.f30559c = z9j0Var;
        this.f30560d = k5m0Var;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.f30557a) {
            case 0:
                Activity activity = this.f30558b;
                k5m0 k5m0Var = this.f30560d;
                if (!k5m0Var.mo55547g(activity)) {
                    this.f30559c.mo47345e();
                } else {
                    k5m0Var.mo55546f();
                }
                break;
            default:
                vcv0 vcv0Var = (vcv0) obj;
                Activity activity2 = this.f30558b;
                z9j0 z9j0Var = this.f30559c;
                if (!z9j0Var.mo47349j(activity2)) {
                    k5m0.m55541i(this.f30560d, h2j0.f87013a, vcv0Var.f240259a.f46380a.f279709a, null, false, 12);
                } else {
                    z9j0Var.mo47342b(h2j0.f87013a, vcv0Var.f240259a, null);
                }
                break;
        }
    }
}
