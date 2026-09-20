package p204p;

import androidx.compose.p002ui.geometry.Offset;

/* JADX INFO: loaded from: classes.dex */
public final class nny0 {

    /* JADX INFO: renamed from: a */
    public omy0 f156519a;

    /* JADX INFO: renamed from: b */
    public c2m0 f156520b;

    /* JADX INFO: renamed from: c */
    public ihz f156521c;

    /* JADX INFO: renamed from: d */
    public vvl0 f156522d;

    /* JADX INFO: renamed from: e */
    public boolean f156523e;

    /* JADX INFO: renamed from: f */
    public yfj0 f156524f;

    /* JADX INFO: renamed from: g */
    public final nmy0 f156525g;

    /* JADX INFO: renamed from: h */
    public final kmy0 f156526h;

    /* JADX INFO: renamed from: i */
    public boolean f156527i;

    /* JADX INFO: renamed from: j */
    public int f156528j = 1;

    /* JADX INFO: renamed from: k */
    public nly0 f156529k = hmy0.f93099b;

    /* JADX INFO: renamed from: l */
    public final mny0 f156530l = new mny0(this);

    /* JADX INFO: renamed from: m */
    public final rv70 f156531m = new rv70(this, 23);

    public nny0(omy0 omy0Var, c2m0 c2m0Var, ihz ihzVar, vvl0 vvl0Var, boolean z, yfj0 yfj0Var, nmy0 nmy0Var, kmy0 kmy0Var) {
        this.f156519a = omy0Var;
        this.f156520b = c2m0Var;
        this.f156521c = ihzVar;
        this.f156522d = vvl0Var;
        this.f156523e = z;
        this.f156524f = yfj0Var;
        this.f156525g = nmy0Var;
        this.f156526h = kmy0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m65219a(long j, ibk ibkVar) throws Throwable {
        kny0 kny0Var;
        nny0 nny0Var;
        Throwable th;
        qlv0 qlv0Var;
        if (ibkVar instanceof kny0) {
            kny0Var = (kny0) ibkVar;
            int i = kny0Var.f124487d;
            if ((i & Integer.MIN_VALUE) != 0) {
                kny0Var.f124487d = i - Integer.MIN_VALUE;
            } else {
                kny0Var = new kny0(this, ibkVar);
            }
        } else {
            kny0Var = new kny0(this, ibkVar);
        }
        Object obj = kny0Var.f124485b;
        int i2 = kny0Var.f124487d;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qlv0Var = kny0Var.f124484a;
            try {
                bga.m29073P(obj);
                nny0Var = this;
                nny0Var.f156527i = false;
                return m5b1.m60851a(qlv0Var.f189932a);
            } catch (Throwable th2) {
                th = th2;
                nny0Var = this;
                nny0Var.f156527i = false;
                throw th;
            }
        }
        bga.m29073P(obj);
        qlv0 qlv0Var2 = new qlv0();
        qlv0Var2.f189932a = j;
        this.f156527i = true;
        try {
            xqi0 xqi0Var = xqi0.f265055a;
            nny0Var = this;
            try {
                lny0 lny0Var = new lny0(nny0Var, qlv0Var2, j, (fbk) null);
                kny0Var.f124484a = qlv0Var2;
                kny0Var.f124487d = 1;
                Object objM65224f = m65224f(xqi0Var, lny0Var, kny0Var);
                yuk yukVar = yuk.f276404a;
                if (objM65224f == yukVar) {
                    return yukVar;
                }
                qlv0Var = qlv0Var2;
                nny0Var.f156527i = false;
                return m5b1.m60851a(qlv0Var.f189932a);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                nny0Var.f156527i = false;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            nny0Var = this;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0018  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:6:0x000b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0012  */
    /* JADX INFO: renamed from: b */
    public final Object m65220b(long j, boolean z, mb61 mb61Var) {
        int i;
        long jM60852b;
        q510 q510Var;
        c2m0 c2m0Var;
        yuk yukVar;
        Object objInvoke;
        if (z) {
            ihz ihzVar = this.f156521c;
            u9y0 u9y0Var = hmy0.f93098a;
            if (!(ihzVar instanceof dip)) {
                if (this.f156522d == vvl0.f245249b) {
                    i = 1;
                } else {
                    i = 2;
                }
                jM60852b = m5b1.m60852b(0.0f, 0.0f, j, i);
                q510Var = new q510(this, null);
                c2m0Var = this.f156520b;
                yukVar = yuk.f276404a;
                if (c2m0Var == null && (this.f156519a.mo28417d() || this.f156519a.mo28416c())) {
                    Object objMo31336d = c2m0Var.mo31336d(jM60852b, q510Var, mb61Var);
                    if (objMo31336d == yukVar) {
                        return objMo31336d;
                    }
                } else {
                    objInvoke = q510Var.invoke(m5b1.m60851a(jM60852b), mb61Var);
                    if (objInvoke == yukVar) {
                        return objInvoke;
                    }
                }
            }
        } else {
            if (this.f156522d == vvl0.f245249b) {
                i = 1;
            } else {
                i = 2;
            }
            jM60852b = m5b1.m60852b(0.0f, 0.0f, j, i);
            q510Var = new q510(this, null);
            c2m0Var = this.f156520b;
            yukVar = yuk.f276404a;
            if (c2m0Var == null) {
                objInvoke = q510Var.invoke(m5b1.m60851a(jM60852b), mb61Var);
                if (objInvoke == yukVar) {
                    return objInvoke;
                }
            } else {
                objInvoke = q510Var.invoke(m5b1.m60851a(jM60852b), mb61Var);
                if (objInvoke == yukVar) {
                    return objInvoke;
                }
            }
        }
        return w2a1.f247311a;
    }

    /* JADX INFO: renamed from: c */
    public final long m65221c(nly0 nly0Var, long j, int i) {
        dgj0 dgj0Var = this.f156524f.f272271a;
        dgj0 dgj0Var2 = null;
        if (dgj0Var != null && dgj0Var.f63766L0) {
            dgj0Var2 = (dgj0) vj50.m85738t(dgj0Var);
        }
        long jMo25861P = dgj0Var2 != null ? dgj0Var2.mo25861P(i, j) : 0L;
        long jM256f = Offset.m256f(j, jMo25861P);
        long jM65223e = m65223e(m65226h(nly0Var.mo42170f(m65225g(m65223e(Offset.m251a(0.0f, this.f156522d == vvl0.f245249b ? 1 : 2, jM256f))))));
        nmy0 nmy0Var = this.f156525g;
        if (nmy0Var.f63766L0) {
            wjg1.m88336r(nmy0Var);
        }
        return Offset.m257g(Offset.m257g(jMo25861P, jM65223e), this.f156524f.m93564b(i, jM65223e, Offset.m256f(jM256f, jM65223e)));
    }

    /* JADX INFO: renamed from: d */
    public final float m65222d(float f) {
        return this.f156523e ? f * (-1) : f;
    }

    /* JADX INFO: renamed from: e */
    public final long m65223e(long j) {
        return this.f156523e ? Offset.m258h(j, -1.0f) : j;
    }

    /* JADX INFO: renamed from: f */
    public final Object m65224f(xqi0 xqi0Var, th00 th00Var, ibk ibkVar) {
        Object objMo28414a = this.f156519a.mo28414a(xqi0Var, new ilw0(this, th00Var, (fbk) null, 25), ibkVar);
        return objMo28414a == yuk.f276404a ? objMo28414a : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: g */
    public final float m65225g(long j) {
        return Float.intBitsToFloat((int) (this.f156522d == vvl0.f245249b ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: h */
    public final long m65226h(float f) {
        long jFloatToRawIntBits;
        long j;
        if (f == 0.0f) {
            return 0L;
        }
        if (this.f156522d == vvl0.f245249b) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(f);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(f);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (jFloatToRawIntBits & 4294967295L);
    }

    /* JADX INFO: renamed from: i */
    public final float m65227i(long j) {
        int i = (int) (4294967295L & j);
        int i2 = (int) (j >> 32);
        if (((float) Math.atan2(Math.abs(Float.intBitsToFloat(i)), Math.abs(Float.intBitsToFloat(i2)))) >= 0.7853981633974483d) {
            if (this.f156522d == vvl0.f245248a) {
                return Float.intBitsToFloat(i);
            }
            return 0.0f;
        }
        if (this.f156522d == vvl0.f245249b) {
            return Float.intBitsToFloat(i2);
        }
        return 0.0f;
    }
}
