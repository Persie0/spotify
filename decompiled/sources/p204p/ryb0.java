package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes8.dex */
public final class ryb0 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f203869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ pyb0 f203870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ryb0(pyb0 pyb0Var, int i) {
        super(1);
        this.f203869a = i;
        this.f203870b = pyb0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        hwd1 dwd1Var;
        switch (this.f203869a) {
            case 0:
                myb0 myb0Var = this.f203870b.f183383a.f117356a;
                myb0Var.f148389g.m39516c(myb0.f148382h[2], myb0Var, Integer.valueOf((int) (((jo70) obj).mo30018b() & 4294967295L)));
                return w2a1.f247311a;
            case 1:
                myb0 myb0Var2 = this.f203870b.f183383a.f117356a;
                myb0Var2.f148388f.m39516c(myb0.f148382h[1], myb0Var2, Integer.valueOf((int) (((jo70) obj).mo30018b() & 4294967295L)));
                return w2a1.f247311a;
            default:
                swd1 swd1Var = (swd1) obj;
                myb0 myb0Var3 = this.f203870b.f183383a.f117356a;
                dx40 dx40VarMo51806g = swd1Var.f214650a.mo51806g(519);
                int i = dx40VarMo51806g.f53851d;
                lyb0 lyb0Var = myb0Var3.f148389g;
                qr60 qr60Var = myb0.f148382h[2];
                dx40 dx40VarM37189b = dx40.m37189b(0, dx40VarMo51806g.f53849b, 0, Math.max(i, ((Number) lyb0Var.f61172a).intValue()));
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    dwd1Var = new gwd1(swd1Var);
                } else if (i2 >= 31) {
                    dwd1Var = new fwd1(swd1Var);
                } else if (i2 >= 30) {
                    dwd1Var = new ewd1(swd1Var);
                } else {
                    dwd1Var = i2 >= 29 ? new dwd1(swd1Var) : new bwd1(swd1Var);
                }
                dwd1Var.mo40142c(519, dx40VarM37189b);
                swd1 swd1VarMo30680b = dwd1Var.mo30680b();
                return swd1VarMo30680b == null ? swd1Var : swd1VarMo30680b;
        }
    }
}
