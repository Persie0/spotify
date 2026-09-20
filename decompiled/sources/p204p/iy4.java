package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class iy4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f106834a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ly4 f106835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f106836c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f106837d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ float f106838e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ float f106839f;

    public /* synthetic */ iy4(ly4 ly4Var, float f, float f2, float f3, float f4, int i) {
        this.f106834a = i;
        this.f106835b = ly4Var;
        this.f106836c = f;
        this.f106837d = f2;
        this.f106838e = f3;
        this.f106839f = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f106834a) {
            case 0:
                ly4 ly4Var = this.f106835b;
                gy4 gy4Var = ly4Var.f137950a;
                gy4Var.getClass();
                gy4Var.f85427C = n0e1.m63436m(this.f106836c, 0.0f, 1.0f);
                gy4Var.f85428D = n0e1.m63436m(this.f106837d, 0.0f, 1.0f);
                gy4Var.f85429E = n0e1.m63436m(this.f106838e, 0.0f, 1.0f);
                gy4Var.f85430F = n0e1.m63436m(this.f106839f, 0.0f, 1.0f);
                ly4.m60215a(ly4Var);
                break;
            default:
                ly4 ly4Var2 = this.f106835b;
                gy4 gy4Var2 = ly4Var2.f137950a;
                gy4Var2.getClass();
                gy4Var2.f85431G = n0e1.m63436m(this.f106836c, 0.0f, 1.0f);
                gy4Var2.f85432H = n0e1.m63436m(this.f106837d, 0.0f, 1.0f);
                gy4Var2.f85433I = n0e1.m63436m(this.f106838e, 0.0f, 1.0f);
                gy4Var2.f85425A = n0e1.m63436m(this.f106839f, 0.0f, 1.0f);
                ly4.m60215a(ly4Var2);
                break;
        }
    }
}
