package p204p;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.p002ui.geometry.Offset;
import androidx.compose.p002ui.geometry.Size;
import androidx.compose.p002ui.graphics.ColorFilter;
import androidx.compose.p002ui.graphics.drawscope.DrawScope;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class rx10 {

    /* JADX INFO: renamed from: y */
    public static final zn70 f203438y;

    /* JADX INFO: renamed from: a */
    public final tx10 f203439a;

    /* JADX INFO: renamed from: f */
    public Outline f203444f;

    /* JADX INFO: renamed from: j */
    public float f203448j;

    /* JADX INFO: renamed from: k */
    public ncg1 f203449k;

    /* JADX INFO: renamed from: l */
    public vbn0 f203450l;

    /* JADX INFO: renamed from: m */
    public uk4 f203451m;

    /* JADX INFO: renamed from: n */
    public boolean f203452n;

    /* JADX INFO: renamed from: o */
    public krb f203453o;

    /* JADX INFO: renamed from: p */
    public lk4 f203454p;

    /* JADX INFO: renamed from: q */
    public int f203455q;

    /* JADX INFO: renamed from: s */
    public boolean f203457s;

    /* JADX INFO: renamed from: t */
    public long f203458t;

    /* JADX INFO: renamed from: u */
    public long f203459u;

    /* JADX INFO: renamed from: v */
    public long f203460v;

    /* JADX INFO: renamed from: w */
    public boolean f203461w;

    /* JADX INFO: renamed from: x */
    public RectF f203462x;

    /* JADX INFO: renamed from: b */
    public yqq f203440b = epv0.f61724a;

    /* JADX INFO: renamed from: c */
    public ko70 f203441c = ko70.f124556a;

    /* JADX INFO: renamed from: d */
    public gh00 f203442d = m1k.f139005W0;

    /* JADX INFO: renamed from: e */
    public final gfx f203443e = new gfx(this, 3);

    /* JADX INFO: renamed from: g */
    public boolean f203445g = true;

    /* JADX INFO: renamed from: h */
    public long f203446h = 0;

    /* JADX INFO: renamed from: i */
    public long f203447i = 9205357640488583168L;

    /* JADX INFO: renamed from: r */
    public final bsa f203456r = new bsa();

    static {
        zn70 zn70Var;
        if (Build.FINGERPRINT.toLowerCase(Locale.ROOT).equals("robolectric")) {
            zn70Var = t6x0.f217632X0;
        } else {
            zn70Var = Build.VERSION.SDK_INT >= 28 ? do70.f50962a : haz.f89333h;
        }
        f203438y = zn70Var;
    }

    public rx10(tx10 tx10Var) {
        this.f203439a = tx10Var;
        tx10Var.mo81872u(false);
        this.f203458t = 0L;
        this.f203459u = 0L;
        this.f203460v = 9205357640488583168L;
    }

    /* JADX INFO: renamed from: a */
    public final void m76592a() {
        Outline outline;
        if (this.f203445g) {
            boolean z = this.f203461w;
            Outline outline2 = null;
            tx10 tx10Var = this.f203439a;
            if (z || tx10Var.mo81851O() > 0.0f) {
                vbn0 vbn0Var = this.f203450l;
                if (vbn0Var != null) {
                    RectF rectF = this.f203462x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.f203462x = rectF;
                    }
                    boolean z2 = vbn0Var instanceof uk4;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((uk4) vbn0Var).f231212a.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || ((uk4) vbn0Var).f231212a.isConvex()) {
                        outline = this.f203444f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f203444f = outline;
                        }
                        if (i >= 30) {
                            ci11.m32834C(outline, vbn0Var);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((uk4) vbn0Var).f231212a);
                        }
                        this.f203452n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f203444f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.f203452n = true;
                        outline = null;
                    }
                    this.f203450l = vbn0Var;
                    if (outline != null) {
                        outline.setAlpha(tx10Var.mo81853b());
                        outline2 = outline;
                    }
                    tx10Var.mo81841E(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.f203452n && this.f203461w) {
                        tx10Var.mo81872u(false);
                        tx10Var.mo81860i();
                    } else {
                        tx10Var.mo81872u(this.f203461w);
                    }
                } else {
                    tx10Var.mo81872u(this.f203461w);
                    Outline outline4 = this.f203444f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f203444f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM39677M = epv0.m39677M(this.f203459u);
                    long j = this.f203446h;
                    long j2 = this.f203447i;
                    long j3 = j2 == 9205357640488583168L ? jM39677M : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.f203448j);
                    outline5.setAlpha(tx10Var.mo81853b());
                    tx10Var.mo81841E(outline5, epv0.m39670F(j3));
                }
            } else {
                tx10Var.mo81872u(false);
                tx10Var.mo81841E(null, 0L);
            }
        }
        this.f203445g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public final void m76593b() {
        if (this.f203457s && this.f203455q == 0) {
            bsa bsaVar = this.f203456r;
            rx10 rx10VarM30370v = bsa.m30370v(bsaVar);
            if (rx10VarM30370v != null) {
                rx10VarM30370v.f203455q--;
                rx10VarM30370v.m76593b();
                bsaVar.f30267c = null;
            }
            dqi0 dqi0VarM30369u = bsa.m30369u(bsaVar);
            if (dqi0VarM30369u != null) {
                Object[] objArr = dqi0VarM30369u.f52019b;
                long[] jArr = dqi0VarM30369u.f52018a;
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
                                    rx10 rx10Var = (rx10) objArr[(i << 3) + i3];
                                    rx10Var.f203455q--;
                                    rx10Var.m76593b();
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
                dqi0VarM30369u.m36643b();
            }
            this.f203439a.mo81860i();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m76594c(wqb wqbVar, rx10 rx10Var) {
        if (this.f203457s) {
            return;
        }
        m76592a();
        tx10 tx10Var = this.f203439a;
        if (!tx10Var.mo81866o()) {
            try {
                tx10Var.mo81864m(this.f203440b, this.f203441c, this, this.f203443e);
            } catch (Throwable unused) {
            }
        }
        boolean z = tx10Var.mo81851O() > 0.0f;
        if (z) {
            wqbVar.mo25283l();
        }
        Canvas canvas = ly3.f137948a;
        ky3 ky3Var = (ky3) wqbVar;
        Canvas canvas2 = ky3Var.f127640a;
        boolean zIsHardwareAccelerated = canvas2.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j = this.f203458t;
            float f = (int) (j & 4294967295L);
            float f2 = (int) (j >> 32);
            long j2 = this.f203459u;
            float f3 = ((int) (j2 >> 32)) + f2;
            float f4 = f + ((int) (j2 & 4294967295L));
            float fMo81853b = tx10Var.mo81853b();
            ColorFilter colorFilterMo81863l = tx10Var.mo81863l();
            int iMo81837A = tx10Var.mo81837A();
            if (fMo81853b < 1.0f || !ftg1.m42662v(iMo81837A, 3) || colorFilterMo81863l != null || mqg1.m62552l(tx10Var.mo81862k(), 1)) {
                lk4 lk4VarM77438l = this.f203454p;
                if (lk4VarM77438l == null) {
                    lk4VarM77438l = s800.m77438l();
                    this.f203454p = lk4VarM77438l;
                }
                lk4VarM77438l.m59206a(fMo81853b);
                lk4VarM77438l.m59207b(iMo81837A);
                lk4VarM77438l.m59209d(colorFilterMo81863l);
                canvas2.saveLayer(f2, f, f3, f4, s800.m77400A(lk4VarM77438l));
                f2 = f2;
            } else {
                canvas2.save();
            }
            canvas2.translate(f2, f);
            canvas2.concat(tx10Var.mo81874w());
        }
        boolean z2 = !zIsHardwareAccelerated && this.f203461w;
        if (z2) {
            wqbVar.mo25287p();
            ncg1 ncg1VarM76596e = m76596e();
            if (ncg1VarM76596e instanceof lyl0) {
                wqb.m88736a(wqbVar, ((lyl0) ncg1VarM76596e).f138074d);
            } else if (ncg1VarM76596e instanceof myl0) {
                uk4 uk4VarM91259a = this.f203451m;
                if (uk4VarM91259a != null) {
                    uk4VarM91259a.m83309n();
                } else {
                    uk4VarM91259a = xk4.m91259a();
                    this.f203451m = uk4VarM91259a;
                }
                uk4VarM91259a.m83300e(((myl0) ncg1VarM76596e).f148481d, 1);
                wqbVar.mo25290s(uk4VarM91259a, 1);
            } else {
                if (!(ncg1VarM76596e instanceof kyl0)) {
                    throw new NoWhenBranchMatchedException();
                }
                wqbVar.mo25290s(((kyl0) ncg1VarM76596e).f127886d, 1);
            }
        }
        if (rx10Var != null && rx10Var.f203456r.m30400e0(this)) {
            this.f203455q++;
        }
        if (ky3Var.f127640a.isHardwareAccelerated()) {
            tx10Var.mo81875x(wqbVar);
        } else {
            krb krbVar = this.f203453o;
            if (krbVar == null) {
                krbVar = new krb();
                this.f203453o = krbVar;
            }
            c06 c06Var = krbVar.f125601b;
            yqq yqqVar = this.f203440b;
            ko70 ko70Var = this.f203441c;
            long jM39677M = epv0.m39677M(this.f203459u);
            yqq yqqVarM31108w = c06Var.m31108w();
            ko70 ko70VarM31110z = c06Var.m31110z();
            wqb wqbVarM31107v = c06Var.m31107v();
            long jM31085B = c06Var.m31085B();
            rx10 rx10VarM31109x = c06Var.m31109x();
            c06Var.m31090G(yqqVar);
            c06Var.m31093J(ko70Var);
            c06Var.m31089F(wqbVar);
            c06Var.m31095L(jM39677M);
            c06Var.m31092I(this);
            wqbVar.mo25287p();
            try {
                m76595d(krbVar);
                wqbVar.mo25279h();
                c06Var.m31090G(yqqVarM31108w);
                c06Var.m31093J(ko70VarM31110z);
                c06Var.m31089F(wqbVarM31107v);
                c06Var.m31095L(jM31085B);
                c06Var.m31092I(rx10VarM31109x);
            } catch (Throwable th) {
                wqbVar.mo25279h();
                c06Var.m31090G(yqqVarM31108w);
                c06Var.m31093J(ko70VarM31110z);
                c06Var.m31089F(wqbVarM31107v);
                c06Var.m31095L(jM31085B);
                c06Var.m31092I(rx10VarM31109x);
                throw th;
            }
        }
        if (z2) {
            wqbVar.mo25279h();
        }
        if (z) {
            wqbVar.mo25288q();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas2.restore();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009a A[LOOP:0: B:20:0x005d->B:30:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d A[EDGE_INSN: B:34:0x009d->B:31:0x009d BREAK  A[LOOP:0: B:20:0x005d->B:30:0x009a], SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public final void m76595d(DrawScope drawScope) {
        bsa bsaVar = this.f203456r;
        bsaVar.f30268d = bsa.m30370v(bsaVar);
        dqi0 dqi0VarM30369u = bsa.m30369u(bsaVar);
        if (dqi0VarM30369u != null && dqi0VarM30369u.m36649h()) {
            dqi0 dqi0VarM30372x = bsa.m30372x(bsaVar);
            if (dqi0VarM30372x == null) {
                dqi0 dqi0Var = sdy0.f208112a;
                dqi0VarM30372x = new dqi0();
                bsaVar.f30270f = dqi0VarM30372x;
            }
            dqi0VarM30372x.m36652k(dqi0VarM30369u);
            dqi0VarM30369u.m36643b();
        }
        bsaVar.f30266b = true;
        this.f203442d.invoke(drawScope);
        bsaVar.f30266b = false;
        rx10 rx10VarM30373y = bsa.m30373y(bsaVar);
        if (rx10VarM30373y != null) {
            rx10VarM30373y.f203455q--;
            rx10VarM30373y.m76593b();
        }
        dqi0 dqi0VarM30372x2 = bsa.m30372x(bsaVar);
        if (dqi0VarM30372x2 == null || !dqi0VarM30372x2.m36649h()) {
            return;
        }
        Object[] objArr = dqi0VarM30372x2.f52019b;
        long[] jArr = dqi0VarM30372x2.f52018a;
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
                            rx10 rx10Var = (rx10) objArr[(i << 3) + i3];
                            rx10Var.f203455q--;
                            rx10Var.m76593b();
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
        dqi0VarM30372x2.m36643b();
    }

    /* JADX INFO: renamed from: e */
    public final ncg1 m76596e() {
        ncg1 lyl0Var;
        ncg1 ncg1Var = this.f203449k;
        vbn0 vbn0Var = this.f203450l;
        if (ncg1Var != null) {
            return ncg1Var;
        }
        if (vbn0Var != null) {
            kyl0 kyl0Var = new kyl0(vbn0Var);
            this.f203449k = kyl0Var;
            return kyl0Var;
        }
        long jM39677M = epv0.m39677M(this.f203459u);
        long j = this.f203446h;
        long j2 = this.f203447i;
        if (j2 != 9205357640488583168L) {
            jM39677M = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM39677M >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM39677M & 4294967295L)) + fIntBitsToFloat2;
        float f = this.f203448j;
        if (f > 0.0f) {
            lyl0Var = new myl0(q3d0.m72098h(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            lyl0Var = new lyl0(new tiv0(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.f203449k = lyl0Var;
        return lyl0Var;
    }

    /* JADX INFO: renamed from: f */
    public final void m76597f(yqq yqqVar, ko70 ko70Var, long j, gh00 gh00Var) {
        boolean zM43520b = g450.m43520b(this.f203459u, j);
        tx10 tx10Var = this.f203439a;
        if (!zM43520b) {
            this.f203459u = j;
            long j2 = this.f203458t;
            tx10Var.mo81861j((int) (j2 >> 32), j, (int) (j2 & 4294967295L));
            if (this.f203447i == 9205357640488583168L) {
                this.f203445g = true;
                m76592a();
            }
        }
        this.f203440b = yqqVar;
        this.f203441c = ko70Var;
        this.f203442d = gh00Var;
        tx10Var.mo81864m(yqqVar, ko70Var, this, this.f203443e);
    }

    /* JADX INFO: renamed from: g */
    public final void m76598g(float f) {
        tx10 tx10Var = this.f203439a;
        if (tx10Var.mo81853b() == f) {
            return;
        }
        tx10Var.mo81845I(f);
    }

    /* JADX INFO: renamed from: h */
    public final void m76599h(float f, long j, long j2) {
        if (Offset.m253c(this.f203446h, j) && Size.m262c(this.f203447i, j2) && this.f203448j == f && this.f203450l == null) {
            return;
        }
        this.f203449k = null;
        this.f203450l = null;
        this.f203445g = true;
        this.f203452n = false;
        this.f203446h = j;
        this.f203447i = j2;
        this.f203448j = f;
        m76592a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m76600i(ibk ibkVar) {
        qx10 qx10Var;
        if (ibkVar instanceof qx10) {
            qx10Var = (qx10) ibkVar;
            int i = qx10Var.f193455c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qx10Var.f193455c = i - Integer.MIN_VALUE;
            } else {
                qx10Var = new qx10(this, ibkVar);
            }
        } else {
            qx10Var = new qx10(this, ibkVar);
        }
        Object objMo36519c = qx10Var.f193453a;
        int i2 = qx10Var.f193455c;
        if (i2 == 0) {
            bga.m29073P(objMo36519c);
            qx10Var.f193455c = 1;
            objMo36519c = f203438y.mo36519c(this, qx10Var);
            yuk yukVar = yuk.f276404a;
            if (objMo36519c == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objMo36519c);
        }
        return fz6.m43160p((Bitmap) objMo36519c);
    }
}
