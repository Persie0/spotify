package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vus {

    /* JADX INFO: renamed from: a */
    public final gfi0 f245066a;

    /* JADX INFO: renamed from: b */
    public final j2r f245067b;

    /* JADX INFO: renamed from: c */
    public final pl4 f245068c;

    /* JADX INFO: renamed from: d */
    public final z6g0 f245069d;

    /* JADX INFO: renamed from: e */
    public final zus f245070e;

    /* JADX INFO: renamed from: f */
    public final st91 f245071f;

    /* JADX INFO: renamed from: g */
    public final pum f245072g;

    /* JADX INFO: renamed from: h */
    public final r46 f245073h;

    public vus(gfi0 gfi0Var, wrf0 wrf0Var, j2r j2rVar, pl4 pl4Var, z6g0 z6g0Var, avs avsVar, zus zusVar, st91 st91Var, pum pumVar, r46 r46Var) {
        this.f245066a = gfi0Var;
        this.f245067b = j2rVar;
        this.f245068c = pl4Var;
        this.f245069d = z6g0Var;
        this.f245070e = zusVar;
        this.f245071f = st91Var;
        this.f245072g = pumVar;
        this.f245073h = r46Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m86442a(xco xcoVar, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-286218512);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(xcoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(this) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            xq00Var2 = xq00Var;
            vig1.m85649d(null, ieg.f101407a, null, v3h1.m84580M(xq00Var), rkk.m75772x(-71262057, new d9j(15, this, xcoVar), xq00Var), xq00Var2, 24624, 5);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new qvj(this, xcoVar, i, 19);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m86443b(xco xcoVar, f4m0 f4m0Var, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(545446580);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(xcoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(f4m0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(this) ? 256 : 128;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            qiu.m72876b(1, rkk.m75772x(-1922874273, new frp(this, f4m0Var, xcoVar, 11), xq00Var), xq00Var, 54);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gek(this, xcoVar, f4m0Var, i, 27);
        }
    }
}
