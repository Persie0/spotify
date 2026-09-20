package p204p;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class awf extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f20495a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cwf f20496b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ awf(cwf cwfVar, int i) {
        super(0);
        this.f20495a = i;
        this.f20496b = cwfVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f20495a) {
            case 0:
                cwf cwfVar = this.f20496b;
                return new n9y0(cwfVar.getApplication(), cwfVar, cwfVar.getIntent() != null ? cwfVar.getIntent().getExtras() : null);
            case 1:
                this.f20496b.reportFullyDrawn();
                return w2a1.f247311a;
            default:
                cwf cwfVar2 = this.f20496b;
                b7l0 b7l0Var = new b7l0(new RunnableC2210od(cwfVar2, 25));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (wj50.m88271j(Looper.myLooper(), Looper.getMainLooper())) {
                        cwfVar2.f31643a.mo31986a(new uvf(0, b7l0Var, cwfVar2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new fr2(29, cwfVar2, b7l0Var));
                    }
                }
                return b7l0Var;
        }
    }
}
