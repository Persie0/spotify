package p204p;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.AbstractC0110a;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.recaptcha.internal.zzagj;
import com.google.android.recaptcha.internal.zzagk;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class gx8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f85217a;

    /* JADX INFO: renamed from: b */
    public int f85218b;

    /* JADX INFO: renamed from: c */
    public int f85219c;

    /* JADX INFO: renamed from: d */
    public int f85220d;

    /* JADX INFO: renamed from: e */
    public Object f85221e;

    public gx8(v9f1 v9f1Var) {
        this.f85217a = 5;
        this.f85220d = 0;
        this.f85221e = v9f1Var;
        v9f1Var.f238940c = this;
    }

    /* JADX INFO: renamed from: F */
    public static final void m46015F(int i) throws zzagk {
        if ((i & 3) != 0) {
            throw new zzagk("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m46016G(int i) throws zzagk {
        if ((i & 7) != 0) {
            throw new zzagk("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: A */
    public void m46017A(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof dbf1) {
            dbf1 dbf1Var = (dbf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzagj();
                }
                int iMo80290d = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    dbf1Var.m35558d(v9f1Var.mo80309z());
                } while (v9f1Var.mo80290d() < iMo80290d);
                m46021E(iMo80290d);
                return;
            }
            do {
                dbf1Var.m35558d(v9f1Var.mo80309z());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzagj();
                }
                int iMo80290d2 = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    zaf1Var.add(Long.valueOf(v9f1Var.mo80309z()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                m46021E(iMo80290d2);
                return;
            }
            do {
                zaf1Var.add(Long.valueOf(v9f1Var.mo80309z()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: B */
    public void m46018B(int i) throws zzagj {
        if ((this.f85218b & 7) != i) {
            throw new zzagj();
        }
    }

    /* JADX INFO: renamed from: C */
    public void m46019C(Object obj, vbf1 vbf1Var, haf1 haf1Var) throws zzagk {
        v9f1 v9f1Var = (v9f1) this.f85221e;
        int iMo80304u = v9f1Var.mo80304u();
        if (v9f1Var.f238938a + v9f1Var.f238939b >= 100) {
            throw new zzagk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo80287a = v9f1Var.mo80287a(iMo80304u);
        v9f1Var.f238938a++;
        vbf1Var.mo61389h(obj, this, haf1Var);
        v9f1Var.mo80292i();
        v9f1Var.f238938a--;
        v9f1Var.mo80288b(iMo80287a);
    }

    /* JADX INFO: renamed from: D */
    public void m46020D(Object obj, vbf1 vbf1Var, haf1 haf1Var) throws zzagk {
        v9f1 v9f1Var = (v9f1) this.f85221e;
        int i = v9f1Var.f238938a;
        int i2 = v9f1Var.f238939b;
        if (i + i2 >= 100) {
            throw new zzagk("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i3 = this.f85219c;
        this.f85219c = ((this.f85218b >>> 3) << 3) | 4;
        v9f1Var.f238939b = i2 + 1;
        try {
            vbf1Var.mo61389h(obj, this, haf1Var);
            if (this.f85218b != this.f85219c) {
                throw new zzagk("Failed to parse the message.");
            }
            v9f1Var.f238939b--;
            this.f85219c = i3;
        } catch (Throwable th) {
            v9f1Var.f238939b--;
            this.f85219c = i3;
            throw th;
        }
    }

    /* JADX INFO: renamed from: E */
    public void m46021E(int i) throws zzagk {
        if (((v9f1) this.f85221e).mo80290d() != i) {
            throw new zzagk("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    /* JADX INFO: renamed from: H */
    public int m46022H() {
        int iMo80291h = this.f85220d;
        if (iMo80291h != 0) {
            this.f85218b = iMo80291h;
            this.f85220d = 0;
        } else {
            iMo80291h = ((v9f1) this.f85221e).mo80291h();
            this.f85218b = iMo80291h;
        }
        return (iMo80291h == 0 || iMo80291h == this.f85219c) ? Alert.DURATION_SHOW_INDEFINITELY : iMo80291h >>> 3;
    }

    /* JADX INFO: renamed from: I */
    public void m46023I(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        int i = this.f85218b & 7;
        if (i == 1) {
            do {
                zaf1Var.add(Double.valueOf(v9f1Var.mo80293j()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            this.f85220d = iMo80291h;
            return;
        }
        if (i != 2) {
            throw new zzagj();
        }
        int iMo80304u = v9f1Var.mo80304u();
        m46016G(iMo80304u);
        int iMo80290d = v9f1Var.mo80290d() + iMo80304u;
        do {
            zaf1Var.add(Double.valueOf(v9f1Var.mo80293j()));
        } while (v9f1Var.mo80290d() < iMo80290d);
    }

    /* JADX INFO: renamed from: J */
    public void m46024J(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        int i = this.f85218b & 7;
        if (i == 2) {
            int iMo80304u = v9f1Var.mo80304u();
            m46015F(iMo80304u);
            int iMo80290d = v9f1Var.mo80290d() + iMo80304u;
            do {
                zaf1Var.add(Float.valueOf(v9f1Var.mo80294k()));
            } while (v9f1Var.mo80290d() < iMo80290d);
            return;
        }
        if (i != 5) {
            throw new zzagj();
        }
        do {
            zaf1Var.add(Float.valueOf(v9f1Var.mo80294k()));
            if (v9f1Var.mo80289c()) {
                return;
            } else {
                iMo80291h = v9f1Var.mo80291h();
            }
        } while (iMo80291h == this.f85218b);
        this.f85220d = iMo80291h;
    }

    /* JADX INFO: renamed from: K */
    public void m46025K(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof dbf1) {
            dbf1 dbf1Var = (dbf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzagj();
                }
                int iMo80290d = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    dbf1Var.m35558d(v9f1Var.mo80295l());
                } while (v9f1Var.mo80290d() < iMo80290d);
                m46021E(iMo80290d);
                return;
            }
            do {
                dbf1Var.m35558d(v9f1Var.mo80295l());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzagj();
                }
                int iMo80290d2 = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    zaf1Var.add(Long.valueOf(v9f1Var.mo80295l()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                m46021E(iMo80290d2);
                return;
            }
            do {
                zaf1Var.add(Long.valueOf(v9f1Var.mo80295l()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: L */
    public void m46026L(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof dbf1) {
            dbf1 dbf1Var = (dbf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzagj();
                }
                int iMo80290d = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    dbf1Var.m35558d(v9f1Var.mo80296m());
                } while (v9f1Var.mo80290d() < iMo80290d);
                m46021E(iMo80290d);
                return;
            }
            do {
                dbf1Var.m35558d(v9f1Var.mo80296m());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzagj();
                }
                int iMo80290d2 = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    zaf1Var.add(Long.valueOf(v9f1Var.mo80296m()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                m46021E(iMo80290d2);
                return;
            }
            do {
                zaf1Var.add(Long.valueOf(v9f1Var.mo80296m()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: a */
    public void m46027a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        int i3 = this.f85220d;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.f85221e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f85221e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f85221e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f85221e;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f85220d++;
    }

    /* JADX INFO: renamed from: b */
    public zkz0 m46028b(int i) {
        return new zkz0(ehg1.m38971k((db71) this.f85221e, i), 1L, i);
    }

    /* JADX INFO: renamed from: c */
    public x6r m46029c() {
        c95.m31843i(this.f85219c <= this.f85220d);
        return new x6r(this);
    }

    /* JADX INFO: renamed from: d */
    public void m46030d() {
        int[] iArr = (int[]) this.f85221e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f85220d = 0;
    }

    /* JADX INFO: renamed from: e */
    public void m46031e(RecyclerView recyclerView, boolean z) {
        this.f85220d = 0;
        int[] iArr = (int[]) this.f85221e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        AbstractC0110a abstractC0110a = recyclerView.f1206O0;
        if (recyclerView.f1204N0 == null || abstractC0110a == null || !abstractC0110a.f1302t) {
            return;
        }
        if (z) {
            if (!recyclerView.f1237e.m37311x()) {
                abstractC0110a.mo957v(recyclerView.f1204N0.mo1617e(), this);
            }
        } else if (!recyclerView.m1000Y()) {
            abstractC0110a.mo955u(this.f85218b, this.f85219c, recyclerView.f1194F1, this);
        }
        int i = this.f85220d;
        if (i > abstractC0110a.f1290X) {
            abstractC0110a.f1290X = i;
            abstractC0110a.f1291Y = z;
            recyclerView.f1233c.m85792o();
        }
    }

    /* JADX INFO: renamed from: f */
    public hx8 m46032f() {
        return ((hx8[]) this.f85221e)[this.f85218b];
    }

    /* JADX INFO: renamed from: g */
    public int m46033g(int i) {
        return ((frl0) this.f85221e).f72503f[this.f85219c + i];
    }

    /* JADX INFO: renamed from: h */
    public Object m46034h(int i) {
        return ((frl0) this.f85221e).f72505h[this.f85220d + i];
    }

    /* JADX INFO: renamed from: i */
    public rql0 m46035i() {
        return ((frl0) this.f85221e).f72501d[this.f85218b];
    }

    /* JADX INFO: renamed from: j */
    public byte[][] m46036j(int i, int i2) {
        int i3 = this.f85219c;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3 * i2, this.f85220d * i);
        int i4 = i3 * i2;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = (i4 - i5) - 1;
            byte[] bArr2 = ((hx8[]) this.f85221e)[i5 / i2].f96160a;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i7 = 0; i7 < length; i7++) {
                bArr3[i7] = bArr2[i7 / i];
            }
            bArr[i6] = bArr3;
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k */
    public boolean m46037k(int i) {
        if (((int[]) this.f85221e) != null) {
            int i2 = this.f85220d * 2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                if (((int[]) this.f85221e)[i3] == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public boolean m46038l() {
        int i = this.f85218b;
        frl0 frl0Var = (frl0) this.f85221e;
        if (i >= frl0Var.f72502e) {
            return false;
        }
        rql0 rql0VarM46035i = m46035i();
        this.f85219c += rql0VarM46035i.f201843a;
        this.f85220d += rql0VarM46035i.f201844b;
        int i2 = this.f85218b + 1;
        this.f85218b = i2;
        return i2 < frl0Var.f72502e;
    }

    /* JADX INFO: renamed from: m */
    public void m46039m(int i, int i2) {
        this.f85218b = i;
        this.f85219c = i2;
    }

    /* JADX INFO: renamed from: n */
    public void m46040n(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof maf1) {
            maf1 maf1Var = (maf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzagj();
                }
                int iMo80290d = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    maf1Var.zzh(v9f1Var.mo80297n());
                } while (v9f1Var.mo80290d() < iMo80290d);
                m46021E(iMo80290d);
                return;
            }
            do {
                maf1Var.zzh(v9f1Var.mo80297n());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzagj();
                }
                int iMo80290d2 = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    zaf1Var.add(Integer.valueOf(v9f1Var.mo80297n()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                m46021E(iMo80290d2);
                return;
            }
            do {
                zaf1Var.add(Integer.valueOf(v9f1Var.mo80297n()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: o */
    public void m46041o(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof dbf1) {
            dbf1 dbf1Var = (dbf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzagj();
                }
                int iMo80304u = v9f1Var.mo80304u();
                m46016G(iMo80304u);
                int iMo80290d = v9f1Var.mo80290d() + iMo80304u;
                do {
                    dbf1Var.m35558d(v9f1Var.mo80298o());
                } while (v9f1Var.mo80290d() < iMo80290d);
                return;
            }
            do {
                dbf1Var.m35558d(v9f1Var.mo80298o());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzagj();
                }
                int iMo80304u2 = v9f1Var.mo80304u();
                m46016G(iMo80304u2);
                int iMo80290d2 = v9f1Var.mo80290d() + iMo80304u2;
                do {
                    zaf1Var.add(Long.valueOf(v9f1Var.mo80298o()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                return;
            }
            do {
                zaf1Var.add(Long.valueOf(v9f1Var.mo80298o()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: p */
    public void m46042p(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof maf1) {
            maf1 maf1Var = (maf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i == 2) {
                int iMo80304u = v9f1Var.mo80304u();
                m46015F(iMo80304u);
                int iMo80290d = v9f1Var.mo80290d() + iMo80304u;
                do {
                    maf1Var.zzh(v9f1Var.mo80299p());
                } while (v9f1Var.mo80290d() < iMo80290d);
                return;
            }
            if (i != 5) {
                throw new zzagj();
            }
            do {
                maf1Var.zzh(v9f1Var.mo80299p());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 == 2) {
                int iMo80304u2 = v9f1Var.mo80304u();
                m46015F(iMo80304u2);
                int iMo80290d2 = v9f1Var.mo80290d() + iMo80304u2;
                do {
                    zaf1Var.add(Integer.valueOf(v9f1Var.mo80299p()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                return;
            }
            if (i2 != 5) {
                throw new zzagj();
            }
            do {
                zaf1Var.add(Integer.valueOf(v9f1Var.mo80299p()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: q */
    public void m46043q(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        int i = this.f85218b & 7;
        if (i == 0) {
            do {
                zaf1Var.add(Boolean.valueOf(v9f1Var.mo80300q()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            this.f85220d = iMo80291h;
            return;
        }
        if (i != 2) {
            throw new zzagj();
        }
        int iMo80290d = v9f1Var.mo80290d() + v9f1Var.mo80304u();
        do {
            zaf1Var.add(Boolean.valueOf(v9f1Var.mo80300q()));
        } while (v9f1Var.mo80290d() < iMo80290d);
        m46021E(iMo80290d);
    }

    /* JADX INFO: renamed from: r */
    public void m46044r(zaf1 zaf1Var, boolean z) throws zzagj {
        String strMo80301r;
        int iMo80291h;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if ((this.f85218b & 7) != 2) {
            throw new zzagj();
        }
        do {
            if (z) {
                m46018B(2);
                strMo80301r = v9f1Var.mo80302s();
            } else {
                m46018B(2);
                strMo80301r = v9f1Var.mo80301r();
            }
            zaf1Var.add(strMo80301r);
            if (v9f1Var.mo80289c()) {
                return;
            } else {
                iMo80291h = v9f1Var.mo80291h();
            }
        } while (iMo80291h == this.f85218b);
        this.f85220d = iMo80291h;
    }

    /* JADX INFO: renamed from: s */
    public void m46045s(zaf1 zaf1Var, vbf1 vbf1Var, haf1 haf1Var) throws zzagk {
        int iMo80291h;
        int i = this.f85218b;
        if ((i & 7) != 2) {
            throw new zzagj();
        }
        do {
            laf1 laf1VarZza = vbf1Var.zza();
            m46019C(laf1VarZza, vbf1Var, haf1Var);
            vbf1Var.mo61382a(laf1VarZza);
            zaf1Var.add(laf1VarZza);
            v9f1 v9f1Var = (v9f1) this.f85221e;
            if (v9f1Var.mo80289c() || this.f85220d != 0) {
                return;
            } else {
                iMo80291h = v9f1Var.mo80291h();
            }
        } while (iMo80291h == i);
        this.f85220d = iMo80291h;
    }

    /* JADX INFO: renamed from: t */
    public void m46046t(zaf1 zaf1Var, vbf1 vbf1Var, haf1 haf1Var) throws zzagk {
        int iMo80291h;
        int i = this.f85218b;
        if ((i & 7) != 3) {
            throw new zzagj();
        }
        do {
            laf1 laf1VarZza = vbf1Var.zza();
            m46020D(laf1VarZza, vbf1Var, haf1Var);
            vbf1Var.mo61382a(laf1VarZza);
            zaf1Var.add(laf1VarZza);
            v9f1 v9f1Var = (v9f1) this.f85221e;
            if (v9f1Var.mo80289c() || this.f85220d != 0) {
                return;
            } else {
                iMo80291h = v9f1Var.mo80291h();
            }
        } while (iMo80291h == i);
        this.f85220d = iMo80291h;
    }

    public String toString() {
        switch (this.f85217a) {
            case 4:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.f85218b;
                sb.append(i);
                sb.append('-');
                db71 db71Var = (db71) this.f85221e;
                sb.append(o7t0.m66400n(ehg1.m38971k(db71Var, i)));
                sb.append(',');
                int i2 = this.f85219c;
                sb.append(i2);
                sb.append('-');
                sb.append(o7t0.m66400n(ehg1.m38971k(db71Var, i2)));
                sb.append("), prevOffset=");
                return edb.m38567p(sb, this.f85220d, ')');
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m46047u(zaf1 zaf1Var) throws zzagj {
        int iMo80291h;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if ((this.f85218b & 7) != 2) {
            throw new zzagj();
        }
        do {
            m46018B(2);
            zaf1Var.add(v9f1Var.mo80303t());
            if (v9f1Var.mo80289c()) {
                return;
            } else {
                iMo80291h = v9f1Var.mo80291h();
            }
        } while (iMo80291h == this.f85218b);
        this.f85220d = iMo80291h;
    }

    /* JADX INFO: renamed from: v */
    public void m46048v(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof maf1) {
            maf1 maf1Var = (maf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzagj();
                }
                int iMo80290d = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    maf1Var.zzh(v9f1Var.mo80304u());
                } while (v9f1Var.mo80290d() < iMo80290d);
                m46021E(iMo80290d);
                return;
            }
            do {
                maf1Var.zzh(v9f1Var.mo80304u());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzagj();
                }
                int iMo80290d2 = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    zaf1Var.add(Integer.valueOf(v9f1Var.mo80304u()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                m46021E(iMo80290d2);
                return;
            }
            do {
                zaf1Var.add(Integer.valueOf(v9f1Var.mo80304u()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: w */
    public void m46049w(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof maf1) {
            maf1 maf1Var = (maf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzagj();
                }
                int iMo80290d = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    maf1Var.zzh(v9f1Var.mo80305v());
                } while (v9f1Var.mo80290d() < iMo80290d);
                m46021E(iMo80290d);
                return;
            }
            do {
                maf1Var.zzh(v9f1Var.mo80305v());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzagj();
                }
                int iMo80290d2 = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    zaf1Var.add(Integer.valueOf(v9f1Var.mo80305v()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                m46021E(iMo80290d2);
                return;
            }
            do {
                zaf1Var.add(Integer.valueOf(v9f1Var.mo80305v()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: x */
    public void m46050x(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof maf1) {
            maf1 maf1Var = (maf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i == 2) {
                int iMo80304u = v9f1Var.mo80304u();
                m46015F(iMo80304u);
                int iMo80290d = v9f1Var.mo80290d() + iMo80304u;
                do {
                    maf1Var.zzh(v9f1Var.mo80306w());
                } while (v9f1Var.mo80290d() < iMo80290d);
                return;
            }
            if (i != 5) {
                throw new zzagj();
            }
            do {
                maf1Var.zzh(v9f1Var.mo80306w());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 == 2) {
                int iMo80304u2 = v9f1Var.mo80304u();
                m46015F(iMo80304u2);
                int iMo80290d2 = v9f1Var.mo80290d() + iMo80304u2;
                do {
                    zaf1Var.add(Integer.valueOf(v9f1Var.mo80306w()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                return;
            }
            if (i2 != 5) {
                throw new zzagj();
            }
            do {
                zaf1Var.add(Integer.valueOf(v9f1Var.mo80306w()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: y */
    public void m46051y(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof dbf1) {
            dbf1 dbf1Var = (dbf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i != 1) {
                if (i != 2) {
                    throw new zzagj();
                }
                int iMo80304u = v9f1Var.mo80304u();
                m46016G(iMo80304u);
                int iMo80290d = v9f1Var.mo80290d() + iMo80304u;
                do {
                    dbf1Var.m35558d(v9f1Var.mo80307x());
                } while (v9f1Var.mo80290d() < iMo80290d);
                return;
            }
            do {
                dbf1Var.m35558d(v9f1Var.mo80307x());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new zzagj();
                }
                int iMo80304u2 = v9f1Var.mo80304u();
                m46016G(iMo80304u2);
                int iMo80290d2 = v9f1Var.mo80290d() + iMo80304u2;
                do {
                    zaf1Var.add(Long.valueOf(v9f1Var.mo80307x()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                return;
            }
            do {
                zaf1Var.add(Long.valueOf(v9f1Var.mo80307x()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    /* JADX INFO: renamed from: z */
    public void m46052z(zaf1 zaf1Var) throws zzagk {
        int iMo80291h;
        int iMo80291h2;
        v9f1 v9f1Var = (v9f1) this.f85221e;
        if (zaf1Var instanceof maf1) {
            maf1 maf1Var = (maf1) zaf1Var;
            int i = this.f85218b & 7;
            if (i != 0) {
                if (i != 2) {
                    throw new zzagj();
                }
                int iMo80290d = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    maf1Var.zzh(v9f1Var.mo80308y());
                } while (v9f1Var.mo80290d() < iMo80290d);
                m46021E(iMo80290d);
                return;
            }
            do {
                maf1Var.zzh(v9f1Var.mo80308y());
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h2 = v9f1Var.mo80291h();
                }
            } while (iMo80291h2 == this.f85218b);
        } else {
            int i2 = this.f85218b & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new zzagj();
                }
                int iMo80290d2 = v9f1Var.mo80290d() + v9f1Var.mo80304u();
                do {
                    zaf1Var.add(Integer.valueOf(v9f1Var.mo80308y()));
                } while (v9f1Var.mo80290d() < iMo80290d2);
                m46021E(iMo80290d2);
                return;
            }
            do {
                zaf1Var.add(Integer.valueOf(v9f1Var.mo80308y()));
                if (v9f1Var.mo80289c()) {
                    return;
                } else {
                    iMo80291h = v9f1Var.mo80291h();
                }
            } while (iMo80291h == this.f85218b);
            iMo80291h2 = iMo80291h;
        }
        this.f85220d = iMo80291h2;
    }

    public gx8(int i, int i2) {
        this.f85217a = 0;
        this.f85221e = new hx8[i];
        for (int i3 = 0; i3 < i; i3++) {
            ((hx8[]) this.f85221e)[i3] = new hx8(((i2 + 4) * 17) + 1);
        }
        this.f85220d = i2 * 17;
        this.f85219c = i;
        this.f85218b = -1;
    }

    public gx8() {
        this.f85217a = 2;
    }

    public gx8(int i) {
        this.f85217a = 1;
        this.f85218b = i;
    }

    public gx8(frl0 frl0Var) {
        this.f85217a = 3;
        this.f85221e = frl0Var;
    }

    public gx8(int i, int i2, int i3, db71 db71Var) {
        this.f85217a = 4;
        this.f85218b = i;
        this.f85219c = i2;
        this.f85220d = i3;
        this.f85221e = db71Var;
    }
}
