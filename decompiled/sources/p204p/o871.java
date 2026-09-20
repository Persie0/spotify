package p204p;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o871 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f162729a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yqq f162730b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kqi0 f162731c;

    public /* synthetic */ o871(yqq yqqVar, kqi0 kqi0Var, int i) {
        this.f162729a = i;
        this.f162730b = yqqVar;
        this.f162731c = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f162729a) {
            case 0:
                t45 t45Var = new t45(9, (eh00) obj);
                o871 o871Var = new o871(this.f162730b, this.f162731c, 1);
                if (rub0.m76431a()) {
                    return rub0.m76431a() ? new oub0(t45Var, o871Var, Build.VERSION.SDK_INT == 28 ? do70.f50963b : hdo0.f90170b) : cxh0.f43038a;
                }
                throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
            default:
                bcs bcsVar = (bcs) obj;
                float fM28782b = bcs.m28782b(bcsVar.f25936a);
                yqq yqqVar = this.f162730b;
                this.f162731c.setValue(new g450((((long) yqqVar.mo35990l0(fM28782b)) << 32) | (((long) yqqVar.mo35990l0(bcs.m28781a(bcsVar.f25936a))) & 4294967295L)));
                return w2a1.f247311a;
        }
    }
}
