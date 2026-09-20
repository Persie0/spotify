package p204p;

import com.spotify.mobius.EventSource;
import com.spotify.mobius.disposables.CompositeDisposable;
import com.spotify.mobius.disposables.Disposable;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class l72 implements EventSource {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f130548a;

    /* JADX INFO: renamed from: b */
    public final Object f130549b;

    public /* synthetic */ l72(Object obj, int i) {
        this.f130548a = i;
        this.f130549b = obj;
    }

    @Override // com.spotify.mobius.EventSource
    /* JADX INFO: renamed from: a */
    public final Disposable mo15572a(Consumer consumer) {
        int i = this.f130548a;
        int i2 = 2;
        int i3 = 4;
        int i4 = 3;
        int i5 = 0;
        int i6 = 1;
        Object obj = this.f130549b;
        switch (i) {
            case 0:
                ron0 ron0Var = (ron0) obj;
                return new k72(k0e1.m54988g(ron0Var.m76075c(), ron0Var.f201305a).subscribe(new C1784dn(consumer, i4)), i5);
            case 1:
                n6q n6qVar = ((qfa) obj).f188152a;
                return new k72(new CompositeDisposable(new Disposable[]{new k72(n6qVar.m63783b(new iz1(consumer, 5))), new k72(n6qVar.m63785d(new iz1(consumer, 6)))}), i6);
            case 2:
                return new c3j(((n6q) obj).m63783b(new iz1(consumer, 9)), i5);
            case 3:
                qfl qflVar = (qfl) obj;
                ck90 ck90Var = qflVar.f188250g;
                hc80 hc80Var = qflVar.f188248e;
                ck90Var.m33099f(hc80Var, new pfl(consumer, i5));
                qflVar.f188251h.m33099f(hc80Var, new pfl(consumer, i6));
                qflVar.f188252i.m33099f(hc80Var, new pfl(consumer, i2));
                hzd0 hzd0Var = qflVar.f188231M0;
                if (hzd0Var != null) {
                    hzd0Var.m33099f(hc80Var, new pfl(consumer, i4));
                }
                ck90 ck90Var2 = qflVar.f188249f;
                if (ck90Var2 != null) {
                    ck90Var2.m33099f(hc80Var, new pfl(consumer, i3));
                }
                return new k72(qflVar, i4);
            case 4:
                return new c3j(((i0t) obj).f97314a.m63783b(new iz1(consumer, 10)), i6);
            case 5:
                zrb zrbVar = new zrb(consumer, i3);
                ((hc80) obj).getLifecycle().mo31986a(zrbVar);
                return new hl10(i5, this, zrbVar);
            default:
                e23 e23Var = (e23) obj;
                jc5 jc5Var = new jc5(11, e23Var, consumer);
                ((hzd0) e23Var.f55317b).m33100g(jc5Var);
                return new hl10(i6, e23Var, jc5Var);
        }
    }
}
