package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class pgv0 {

    /* JADX INFO: renamed from: a */
    public qgv0 f177416a;

    /* JADX INFO: renamed from: b */
    public int f177417b;

    /* JADX INFO: renamed from: c */
    public rq00 f177418c;

    /* JADX INFO: renamed from: d */
    public th00 f177419d;

    /* JADX INFO: renamed from: e */
    public int f177420e;

    /* JADX INFO: renamed from: f */
    public fpi0 f177421f;

    /* JADX INFO: renamed from: g */
    public cqi0 f177422g;

    public pgv0(qgv0 qgv0Var) {
        this.f177416a = qgv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m69924a() {
        if (this.f177416a != null) {
            rq00 rq00Var = this.f177418c;
            if (rq00Var != null ? rq00Var.m76206a() : false) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m69925b() {
        qgv0 qgv0Var = this.f177416a;
        if (qgv0Var != null) {
            qgv0Var.mo62746c(this, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m69926c(Object obj) {
        int iMo62746c;
        qgv0 qgv0Var = this.f177416a;
        if (qgv0Var == null || (iMo62746c = qgv0Var.mo62746c(this, obj)) == 0) {
            return 1;
        }
        return iMo62746c;
    }

    /* JADX INFO: renamed from: d */
    public final void m69927d() {
        qgv0 qgv0Var = this.f177416a;
        if (qgv0Var != null) {
            qgv0Var.mo62744a();
        }
        this.f177416a = null;
        this.f177421f = null;
        this.f177422g = null;
        this.f177419d = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public final void m69928e() {
        fpi0 fpi0Var;
        qgv0 qgv0Var = this.f177416a;
        if (qgv0Var == null || (fpi0Var = this.f177421f) == null) {
            return;
        }
        m69929f(true);
        try {
            Object[] objArr = fpi0Var.f71878b;
            int[] iArr = fpi0Var.f71879c;
            long[] jArr = fpi0Var.f71877a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                int i5 = iArr[i4];
                                qgv0Var.mo62745b(obj);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        } finally {
            m69929f(false);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m69929f(boolean z) {
        int i = this.f177417b;
        this.f177417b = z ? i | 32 : i & (-33);
    }

    /* JADX INFO: renamed from: g */
    public final void m69930g() {
        this.f177417b |= 1;
    }

    /* JADX INFO: renamed from: h */
    public final void m69931h(th00 th00Var) {
        this.f177419d = th00Var;
    }
}
