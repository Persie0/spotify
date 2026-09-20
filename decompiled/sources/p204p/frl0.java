package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class frl0 extends iag1 {

    /* JADX INFO: renamed from: e */
    public int f72502e;

    /* JADX INFO: renamed from: g */
    public int f72504g;

    /* JADX INFO: renamed from: i */
    public int f72506i;

    /* JADX INFO: renamed from: d */
    public rql0[] f72501d = new rql0[16];

    /* JADX INFO: renamed from: f */
    public int[] f72503f = new int[16];

    /* JADX INFO: renamed from: h */
    public Object[] f72505h = new Object[16];

    /* JADX INFO: renamed from: m */
    public final void m42497m() {
        this.f72502e = 0;
        this.f72504g = 0;
        bk5.m29578A0(this.f72505h, null, 0, this.f72506i);
        this.f72506i = 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m42498n(ug5 ug5Var, wu21 wu21Var, u12 u12Var, sql0 sql0Var) {
        if (this.f72502e != 0) {
            gx8 gx8Var = new gx8(this);
            while (true) {
                rql0 rql0VarM46035i = gx8Var.m46035i();
                rq00 rq00VarMo76255b = rql0VarM46035i.mo76255b(gx8Var);
                ug5 ug5Var2 = ug5Var;
                wu21 wu21Var2 = wu21Var;
                u12 u12Var2 = u12Var;
                sql0 sql0Var2 = sql0Var;
                try {
                    rql0VarM46035i.mo26832a(gx8Var, ug5Var2, wu21Var2, u12Var2, sql0Var2);
                    if (!gx8Var.m46038l()) {
                        break;
                    }
                    ug5Var = ug5Var2;
                    wu21Var = wu21Var2;
                    u12Var = u12Var2;
                    sql0Var = sql0Var2;
                } catch (Throwable th) {
                    z9g1.m95658h(th, sql0Var2, wu21Var2, rq00VarMo76255b);
                    throw th;
                }
            }
        }
        m42497m();
    }

    /* JADX INFO: renamed from: o */
    public final boolean m42499o() {
        return this.f72502e == 0;
    }

    /* JADX INFO: renamed from: p */
    public final void m42500p(rql0 rql0Var) {
        int i = this.f72502e;
        rql0[] rql0VarArr = this.f72501d;
        if (i == rql0VarArr.length) {
            rql0[] rql0VarArr2 = new rql0[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(rql0VarArr, 0, rql0VarArr2, 0, i);
            this.f72501d = rql0VarArr2;
        }
        int i2 = this.f72504g;
        int i3 = rql0Var.f201843a;
        int i4 = rql0Var.f201844b;
        int i5 = i2 + i3;
        int[] iArr = this.f72503f;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            bk5.m29627o0(0, 0, length, iArr, iArr2);
            this.f72503f = iArr2;
        }
        int i7 = this.f72506i + i4;
        Object[] objArr = this.f72505h;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f72505h = objArr2;
        }
        rql0[] rql0VarArr3 = this.f72501d;
        int i9 = this.f72502e;
        this.f72502e = i9 + 1;
        rql0VarArr3[i9] = rql0Var;
        this.f72504g += rql0Var.f201843a;
        this.f72506i += i4;
    }
}
