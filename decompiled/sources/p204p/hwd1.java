package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class hwd1 {

    /* JADX INFO: renamed from: a */
    public final swd1 f95923a;

    /* JADX INFO: renamed from: b */
    public dx40[] f95924b;

    public hwd1() {
        this(new swd1((swd1) null));
    }

    /* JADX INFO: renamed from: a */
    public final void m48936a() {
        dx40[] dx40VarArr = this.f95924b;
        if (dx40VarArr != null) {
            dx40 dx40VarMo51806g = dx40VarArr[0];
            dx40 dx40VarMo51806g2 = dx40VarArr[1];
            swd1 swd1Var = this.f95923a;
            if (dx40VarMo51806g2 == null) {
                dx40VarMo51806g2 = swd1Var.f214650a.mo51806g(2);
            }
            if (dx40VarMo51806g == null) {
                dx40VarMo51806g = swd1Var.f214650a.mo51806g(1);
            }
            mo30682g(dx40.m37188a(dx40VarMo51806g, dx40VarMo51806g2));
            dx40 dx40Var = this.f95924b[epv0.m39704x(16)];
            if (dx40Var != null) {
                mo37154f(dx40Var);
            }
            dx40 dx40Var2 = this.f95924b[epv0.m39704x(32)];
            if (dx40Var2 != null) {
                mo37153d(dx40Var2);
            }
            dx40 dx40Var3 = this.f95924b[epv0.m39704x(64)];
            if (dx40Var3 != null) {
                mo37155h(dx40Var3);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract swd1 mo30680b();

    /* JADX INFO: renamed from: c */
    public void mo40142c(int i, dx40 dx40Var) {
        if (this.f95924b == null) {
            this.f95924b = new dx40[10];
        }
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f95924b[epv0.m39704x(i2)] = dx40Var;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo30681e(dx40 dx40Var);

    /* JADX INFO: renamed from: g */
    public abstract void mo30682g(dx40 dx40Var);

    public hwd1(swd1 swd1Var) {
        this.f95923a = swd1Var;
    }

    /* JADX INFO: renamed from: d */
    public void mo37153d(dx40 dx40Var) {
    }

    /* JADX INFO: renamed from: f */
    public void mo37154f(dx40 dx40Var) {
    }

    /* JADX INFO: renamed from: h */
    public void mo37155h(dx40 dx40Var) {
    }
}
