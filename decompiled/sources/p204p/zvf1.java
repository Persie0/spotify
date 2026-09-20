package p204p;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zvf1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f286703a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f286704b;

    public /* synthetic */ zvf1(Object obj, int i) {
        this.f286703a = i;
        this.f286704b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f286703a) {
            case 0:
                return ((Context) this.f286704b).getSharedPreferences("google_sdk_flags", 0);
            case 1:
                qog1 qog1Var = (qog1) this.f286704b;
                qog1Var.getClass();
                return ja80.f110403c.m52806a(qog1Var.f190950g);
            case 2:
                c1h1 c1h1Var = (c1h1) this.f286704b;
                c1h1Var.getClass();
                return ja80.f110403c.m52806a(c1h1Var.f33097a);
            case 3:
                x4h1 x4h1Var = (x4h1) this.f286704b;
                x4h1Var.getClass();
                return ja80.f110403c.m52806a(x4h1Var.f258129g);
            default:
                b9h1 b9h1Var = (b9h1) this.f286704b;
                b9h1Var.getClass();
                return ja80.f110403c.m52806a(b9h1Var.f24941a);
        }
    }
}
