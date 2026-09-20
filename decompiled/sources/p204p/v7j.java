package p204p;

import androidx.car.app.model.Alert;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class v7j {

    /* JADX INFO: renamed from: A */
    public float f238200A;

    /* JADX INFO: renamed from: B */
    public int f238201B;

    /* JADX INFO: renamed from: C */
    public float f238202C;

    /* JADX INFO: renamed from: D */
    public int[] f238203D;

    /* JADX INFO: renamed from: E */
    public float f238204E;

    /* JADX INFO: renamed from: F */
    public boolean f238205F;

    /* JADX INFO: renamed from: G */
    public boolean f238206G;

    /* JADX INFO: renamed from: H */
    public int f238207H;

    /* JADX INFO: renamed from: I */
    public int f238208I;

    /* JADX INFO: renamed from: J */
    public final c6j f238209J;

    /* JADX INFO: renamed from: K */
    public final c6j f238210K;

    /* JADX INFO: renamed from: L */
    public final c6j f238211L;

    /* JADX INFO: renamed from: M */
    public final c6j f238212M;

    /* JADX INFO: renamed from: N */
    public final c6j f238213N;

    /* JADX INFO: renamed from: O */
    public final c6j f238214O;

    /* JADX INFO: renamed from: P */
    public final c6j f238215P;

    /* JADX INFO: renamed from: Q */
    public final c6j f238216Q;

    /* JADX INFO: renamed from: R */
    public final c6j[] f238217R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f238218S;

    /* JADX INFO: renamed from: T */
    public final boolean[] f238219T;

    /* JADX INFO: renamed from: U */
    public u7j[] f238220U;

    /* JADX INFO: renamed from: V */
    public v7j f238221V;

    /* JADX INFO: renamed from: W */
    public int f238222W;

    /* JADX INFO: renamed from: X */
    public int f238223X;

    /* JADX INFO: renamed from: Y */
    public float f238224Y;

    /* JADX INFO: renamed from: Z */
    public int f238225Z;

    /* JADX INFO: renamed from: a */
    public boolean f238226a;

    /* JADX INFO: renamed from: a0 */
    public int f238227a0;

    /* JADX INFO: renamed from: b */
    public ejc f238228b;

    /* JADX INFO: renamed from: b0 */
    public int f238229b0;

    /* JADX INFO: renamed from: c */
    public ejc f238230c;

    /* JADX INFO: renamed from: c0 */
    public int f238231c0;

    /* JADX INFO: renamed from: d */
    public l730 f238232d;

    /* JADX INFO: renamed from: d0 */
    public int f238233d0;

    /* JADX INFO: renamed from: e */
    public bhb1 f238234e;

    /* JADX INFO: renamed from: e0 */
    public int f238235e0;

    /* JADX INFO: renamed from: f */
    public final boolean[] f238236f;

    /* JADX INFO: renamed from: f0 */
    public float f238237f0;

    /* JADX INFO: renamed from: g */
    public boolean f238238g;

    /* JADX INFO: renamed from: g0 */
    public float f238239g0;

    /* JADX INFO: renamed from: h */
    public int f238240h;

    /* JADX INFO: renamed from: h0 */
    public Object f238241h0;

    /* JADX INFO: renamed from: i */
    public int f238242i;

    /* JADX INFO: renamed from: i0 */
    public int f238243i0;

    /* JADX INFO: renamed from: j */
    public final itd1 f238244j;

    /* JADX INFO: renamed from: j0 */
    public boolean f238245j0;

    /* JADX INFO: renamed from: k */
    public String f238246k;

    /* JADX INFO: renamed from: k0 */
    public String f238247k0;

    /* JADX INFO: renamed from: l */
    public boolean f238248l;

    /* JADX INFO: renamed from: l0 */
    public int f238249l0;

    /* JADX INFO: renamed from: m */
    public boolean f238250m;

    /* JADX INFO: renamed from: m0 */
    public int f238251m0;

    /* JADX INFO: renamed from: n */
    public boolean f238252n;

    /* JADX INFO: renamed from: n0 */
    public final float[] f238253n0;

    /* JADX INFO: renamed from: o */
    public boolean f238254o;

    /* JADX INFO: renamed from: o0 */
    public final v7j[] f238255o0;

    /* JADX INFO: renamed from: p */
    public int f238256p;

    /* JADX INFO: renamed from: p0 */
    public final v7j[] f238257p0;

    /* JADX INFO: renamed from: q */
    public int f238258q;

    /* JADX INFO: renamed from: q0 */
    public v7j f238259q0;

    /* JADX INFO: renamed from: r */
    public int f238260r;

    /* JADX INFO: renamed from: r0 */
    public v7j f238261r0;

    /* JADX INFO: renamed from: s */
    public int f238262s;

    /* JADX INFO: renamed from: s0 */
    public int f238263s0;

    /* JADX INFO: renamed from: t */
    public int f238264t;

    /* JADX INFO: renamed from: t0 */
    public int f238265t0;

    /* JADX INFO: renamed from: u */
    public final int[] f238266u;

    /* JADX INFO: renamed from: v */
    public int f238267v;

    /* JADX INFO: renamed from: w */
    public int f238268w;

    /* JADX INFO: renamed from: x */
    public float f238269x;

    /* JADX INFO: renamed from: y */
    public int f238270y;

    /* JADX INFO: renamed from: z */
    public int f238271z;

    public v7j() {
        this.f238226a = false;
        this.f238232d = null;
        this.f238234e = null;
        this.f238236f = new boolean[]{true, true};
        this.f238238g = true;
        this.f238240h = -1;
        this.f238242i = -1;
        this.f238244j = new itd1(this);
        this.f238248l = false;
        this.f238250m = false;
        this.f238252n = false;
        this.f238254o = false;
        this.f238256p = -1;
        this.f238258q = -1;
        this.f238260r = 0;
        this.f238262s = 0;
        this.f238264t = 0;
        this.f238266u = new int[2];
        this.f238267v = 0;
        this.f238268w = 0;
        this.f238269x = 1.0f;
        this.f238270y = 0;
        this.f238271z = 0;
        this.f238200A = 1.0f;
        this.f238201B = -1;
        this.f238202C = 1.0f;
        this.f238203D = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.f238204E = Float.NaN;
        this.f238205F = false;
        this.f238206G = false;
        this.f238207H = 0;
        this.f238208I = 0;
        c6j c6jVar = new c6j(this, 2);
        this.f238209J = c6jVar;
        c6j c6jVar2 = new c6j(this, 3);
        this.f238210K = c6jVar2;
        c6j c6jVar3 = new c6j(this, 4);
        this.f238211L = c6jVar3;
        c6j c6jVar4 = new c6j(this, 5);
        this.f238212M = c6jVar4;
        c6j c6jVar5 = new c6j(this, 6);
        this.f238213N = c6jVar5;
        this.f238214O = new c6j(this, 8);
        this.f238215P = new c6j(this, 9);
        c6j c6jVar6 = new c6j(this, 7);
        this.f238216Q = c6jVar6;
        this.f238217R = new c6j[]{c6jVar, c6jVar3, c6jVar2, c6jVar4, c6jVar5, c6jVar6};
        this.f238218S = new ArrayList();
        this.f238219T = new boolean[2];
        u7j u7jVar = u7j.f227710a;
        this.f238220U = new u7j[]{u7jVar, u7jVar};
        this.f238221V = null;
        this.f238222W = 0;
        this.f238223X = 0;
        this.f238224Y = 0.0f;
        this.f238225Z = -1;
        this.f238227a0 = 0;
        this.f238229b0 = 0;
        this.f238231c0 = 0;
        this.f238237f0 = 0.5f;
        this.f238239g0 = 0.5f;
        this.f238243i0 = 0;
        this.f238245j0 = false;
        this.f238247k0 = null;
        this.f238249l0 = 0;
        this.f238251m0 = 0;
        this.f238253n0 = new float[]{-1.0f, -1.0f};
        this.f238255o0 = new v7j[]{null, null};
        this.f238257p0 = new v7j[]{null, null};
        this.f238259q0 = null;
        this.f238261r0 = null;
        this.f238263s0 = -1;
        this.f238265t0 = -1;
        m84874a();
    }

    /* JADX INFO: renamed from: I */
    public static void m84853I(StringBuilder sb, String str, float f, float f2) {
        if (f == f2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f);
        sb.append(",\n");
    }

    /* JADX INFO: renamed from: J */
    public static void m84854J(StringBuilder sb, String str, int i, int i2) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    /* JADX INFO: renamed from: q */
    public static void m84855q(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f, u7j u7jVar) {
        sb.append(str);
        sb.append(" :  {\n");
        String string = u7jVar.toString();
        if (!"FIXED".equals(string)) {
            klh.m56844p(sb, "      behavior", " :   ", string, ",\n");
        }
        m84854J(sb, "      size", i, 0);
        m84854J(sb, "      min", i2, 0);
        m84854J(sb, "      max", i3, Alert.DURATION_SHOW_INDEFINITELY);
        m84854J(sb, "      matchMin", i4, 0);
        m84854J(sb, "      matchDef", i5, 0);
        m84853I(sb, "      matchPercent", f, 1.0f);
        sb.append("    },\n");
    }

    /* JADX INFO: renamed from: r */
    public static void m84856r(StringBuilder sb, String str, c6j c6jVar) {
        if (c6jVar.f34551f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c6jVar.f34551f);
        sb.append("'");
        if (c6jVar.f34553h != Integer.MIN_VALUE || c6jVar.f34552g != 0) {
            sb.append(",");
            sb.append(c6jVar.f34552g);
            if (c6jVar.f34553h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c6jVar.f34553h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    /* JADX INFO: renamed from: A */
    public final boolean m84857A() {
        c6j c6jVar = this.f238210K;
        c6j c6jVar2 = c6jVar.f34551f;
        if (c6jVar2 != null && c6jVar2.f34551f == c6jVar) {
            return true;
        }
        c6j c6jVar3 = this.f238212M;
        c6j c6jVar4 = c6jVar3.f34551f;
        return c6jVar4 != null && c6jVar4.f34551f == c6jVar3;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m84858B() {
        return this.f238238g && this.f238243i0 != 8;
    }

    /* JADX INFO: renamed from: C */
    public boolean mo51861C() {
        if (this.f238248l) {
            return true;
        }
        return this.f238209J.f34548c && this.f238211L.f34548c;
    }

    /* JADX INFO: renamed from: D */
    public boolean mo51862D() {
        if (this.f238250m) {
            return true;
        }
        return this.f238210K.f34548c && this.f238212M.f34548c;
    }

    /* JADX INFO: renamed from: E */
    public void mo84859E() {
        this.f238209J.m31576j();
        this.f238210K.m31576j();
        this.f238211L.m31576j();
        this.f238212M.m31576j();
        this.f238213N.m31576j();
        this.f238214O.m31576j();
        this.f238215P.m31576j();
        this.f238216Q.m31576j();
        this.f238221V = null;
        this.f238204E = Float.NaN;
        this.f238222W = 0;
        this.f238223X = 0;
        this.f238224Y = 0.0f;
        this.f238225Z = -1;
        this.f238227a0 = 0;
        this.f238229b0 = 0;
        this.f238231c0 = 0;
        this.f238233d0 = 0;
        this.f238235e0 = 0;
        this.f238237f0 = 0.5f;
        this.f238239g0 = 0.5f;
        u7j[] u7jVarArr = this.f238220U;
        u7j u7jVar = u7j.f227710a;
        u7jVarArr[0] = u7jVar;
        u7jVarArr[1] = u7jVar;
        this.f238241h0 = null;
        this.f238243i0 = 0;
        this.f238249l0 = 0;
        this.f238251m0 = 0;
        float[] fArr = this.f238253n0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f238256p = -1;
        this.f238258q = -1;
        int[] iArr = this.f238203D;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f238262s = 0;
        this.f238264t = 0;
        this.f238269x = 1.0f;
        this.f238200A = 1.0f;
        this.f238268w = Alert.DURATION_SHOW_INDEFINITELY;
        this.f238271z = Alert.DURATION_SHOW_INDEFINITELY;
        this.f238267v = 0;
        this.f238270y = 0;
        this.f238201B = -1;
        this.f238202C = 1.0f;
        boolean[] zArr = this.f238236f;
        zArr[0] = true;
        zArr[1] = true;
        this.f238206G = false;
        boolean[] zArr2 = this.f238219T;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f238238g = true;
        int[] iArr2 = this.f238266u;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f238240h = -1;
        this.f238242i = -1;
    }

    /* JADX INFO: renamed from: F */
    public final void m84860F() {
        v7j v7jVar = this.f238221V;
        if (v7jVar != null && (v7jVar instanceof w7j)) {
            ((w7j) v7jVar).getClass();
        }
        ArrayList arrayList = this.f238218S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((c6j) arrayList.get(i)).m31576j();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m84861G() {
        this.f238248l = false;
        this.f238250m = false;
        this.f238252n = false;
        this.f238254o = false;
        ArrayList arrayList = this.f238218S;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            c6j c6jVar = (c6j) arrayList.get(i);
            c6jVar.f34548c = false;
            c6jVar.f34547b = 0;
        }
    }

    /* JADX INFO: renamed from: H */
    public void mo84862H(i26 i26Var) {
        this.f238209J.m31577k();
        this.f238210K.m31577k();
        this.f238211L.m31577k();
        this.f238212M.m31577k();
        this.f238213N.m31577k();
        this.f238216Q.m31577k();
        this.f238214O.m31577k();
        this.f238215P.m31577k();
    }

    /* JADX INFO: renamed from: K */
    public final void m84863K(int i) {
        this.f238231c0 = i;
        this.f238205F = i > 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: L */
    public final void m84864L(String str) {
        float fAbs;
        int i = 0;
        if (str == null || str.length() == 0) {
            this.f238224Y = 0.0f;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i2 = 0;
        int i3 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i2 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i3 = i2;
            i2 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i2);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i;
                }
            } else {
                String strSubstring3 = str.substring(i2, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i;
                } else {
                    float f = Float.parseFloat(strSubstring3);
                    float f2 = Float.parseFloat(strSubstring4);
                    if (f <= 0.0f || f2 <= 0.0f) {
                        fAbs = i;
                    } else {
                        fAbs = i3 == 1 ? Math.abs(f2 / f) : Math.abs(f / f2);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i = (fAbs > i ? 1 : (fAbs == i ? 0 : -1));
        if (i > 0) {
            this.f238224Y = fAbs;
            this.f238225Z = i3;
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m84865M(int i, int i2) {
        if (this.f238248l) {
            return;
        }
        this.f238209J.m31578l(i);
        this.f238211L.m31578l(i2);
        this.f238227a0 = i;
        this.f238222W = i2 - i;
        this.f238248l = true;
    }

    /* JADX INFO: renamed from: N */
    public final void m84866N(int i, int i2) {
        if (this.f238250m) {
            return;
        }
        this.f238210K.m31578l(i);
        this.f238212M.m31578l(i2);
        this.f238229b0 = i;
        this.f238223X = i2 - i;
        if (this.f238205F) {
            this.f238213N.m31578l(i + this.f238231c0);
        }
        this.f238250m = true;
    }

    /* JADX INFO: renamed from: O */
    public final void m84867O(int i) {
        this.f238223X = i;
        int i2 = this.f238235e0;
        if (i < i2) {
            this.f238223X = i2;
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m84868P(u7j u7jVar) {
        this.f238220U[0] = u7jVar;
    }

    /* JADX INFO: renamed from: Q */
    public final void m84869Q(float f, int i, int i2, int i3) {
        this.f238262s = i;
        this.f238267v = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f238268w = i3;
        this.f238269x = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f238262s = 2;
    }

    /* JADX INFO: renamed from: R */
    public final void m84870R(u7j u7jVar) {
        this.f238220U[1] = u7jVar;
    }

    /* JADX INFO: renamed from: S */
    public final void m84871S(float f, int i, int i2, int i3) {
        this.f238264t = i;
        this.f238270y = i2;
        if (i3 == Integer.MAX_VALUE) {
            i3 = 0;
        }
        this.f238271z = i3;
        this.f238200A = f;
        if (f <= 0.0f || f >= 1.0f || i != 0) {
            return;
        }
        this.f238264t = 2;
    }

    /* JADX INFO: renamed from: T */
    public final void m84872T(int i) {
        this.f238222W = i;
        int i2 = this.f238233d0;
        if (i < i2) {
            this.f238222W = i2;
        }
    }

    /* JADX INFO: renamed from: U */
    public void mo84873U(boolean z, boolean z2) {
        int i;
        int i2;
        l730 l730Var = this.f238232d;
        boolean z3 = z & l730Var.f137067g;
        bhb1 bhb1Var = this.f238234e;
        boolean z4 = z2 & bhb1Var.f137067g;
        int i3 = l730Var.f137068h.f73271g;
        int i4 = bhb1Var.f137068h.f73271g;
        int i5 = l730Var.f137069i.f73271g;
        int i6 = bhb1Var.f137069i.f73271g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.f238227a0 = i3;
        }
        if (z4) {
            this.f238229b0 = i4;
        }
        if (this.f238243i0 == 8) {
            this.f238222W = 0;
            this.f238223X = 0;
            return;
        }
        u7j u7jVar = u7j.f227710a;
        if (z3) {
            if (this.f238220U[0] == u7jVar && i8 < (i2 = this.f238222W)) {
                i8 = i2;
            }
            this.f238222W = i8;
            int i10 = this.f238233d0;
            if (i8 < i10) {
                this.f238222W = i10;
            }
        }
        if (z4) {
            if (this.f238220U[1] == u7jVar && i9 < (i = this.f238223X)) {
                i9 = i;
            }
            this.f238223X = i9;
            int i11 = this.f238235e0;
            if (i9 < i11) {
                this.f238223X = i11;
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public void mo55863V(kl80 kl80Var, boolean z) {
        int i;
        int i2;
        bhb1 bhb1Var;
        l730 l730Var;
        kl80Var.getClass();
        int iM56800n = kl80.m56800n(this.f238209J);
        int iM56800n2 = kl80.m56800n(this.f238210K);
        int iM56800n3 = kl80.m56800n(this.f238211L);
        int iM56800n4 = kl80.m56800n(this.f238212M);
        if (z && (l730Var = this.f238232d) != null) {
            ftq ftqVar = l730Var.f137068h;
            if (ftqVar.f73274j) {
                ftq ftqVar2 = l730Var.f137069i;
                if (ftqVar2.f73274j) {
                    iM56800n = ftqVar.f73271g;
                    iM56800n3 = ftqVar2.f73271g;
                }
            }
        }
        if (z && (bhb1Var = this.f238234e) != null) {
            ftq ftqVar3 = bhb1Var.f137068h;
            if (ftqVar3.f73274j) {
                ftq ftqVar4 = bhb1Var.f137069i;
                if (ftqVar4.f73274j) {
                    iM56800n2 = ftqVar3.f73271g;
                    iM56800n4 = ftqVar4.f73271g;
                }
            }
        }
        int i3 = iM56800n4 - iM56800n2;
        if (iM56800n3 - iM56800n < 0 || i3 < 0 || iM56800n == Integer.MIN_VALUE || iM56800n == Integer.MAX_VALUE || iM56800n2 == Integer.MIN_VALUE || iM56800n2 == Integer.MAX_VALUE || iM56800n3 == Integer.MIN_VALUE || iM56800n3 == Integer.MAX_VALUE || iM56800n4 == Integer.MIN_VALUE || iM56800n4 == Integer.MAX_VALUE) {
            iM56800n = 0;
            iM56800n2 = 0;
            iM56800n3 = 0;
            iM56800n4 = 0;
        }
        int i4 = iM56800n3 - iM56800n;
        int i5 = iM56800n4 - iM56800n2;
        this.f238227a0 = iM56800n;
        this.f238229b0 = iM56800n2;
        if (this.f238243i0 == 8) {
            this.f238222W = 0;
            this.f238223X = 0;
            return;
        }
        u7j[] u7jVarArr = this.f238220U;
        u7j u7jVar = u7jVarArr[0];
        u7j u7jVar2 = u7j.f227710a;
        if (u7jVar == u7jVar2 && i4 < (i2 = this.f238222W)) {
            i4 = i2;
        }
        if (u7jVarArr[1] == u7jVar2 && i5 < (i = this.f238223X)) {
            i5 = i;
        }
        this.f238222W = i4;
        this.f238223X = i5;
        int i6 = this.f238235e0;
        if (i5 < i6) {
            this.f238223X = i6;
        }
        int i7 = this.f238233d0;
        if (i4 < i7) {
            this.f238222W = i7;
        }
        int i8 = this.f238268w;
        u7j u7jVar3 = u7j.f227712c;
        if (i8 > 0 && u7jVar == u7jVar3) {
            this.f238222W = Math.min(this.f238222W, i8);
        }
        int i9 = this.f238271z;
        if (i9 > 0 && this.f238220U[1] == u7jVar3) {
            this.f238223X = Math.min(this.f238223X, i9);
        }
        int i10 = this.f238222W;
        if (i4 != i10) {
            this.f238240h = i10;
        }
        int i11 = this.f238223X;
        if (i5 != i11) {
            this.f238242i = i11;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m84874a() {
        c6j c6jVar = this.f238209J;
        ArrayList arrayList = this.f238218S;
        arrayList.add(c6jVar);
        arrayList.add(this.f238210K);
        arrayList.add(this.f238211L);
        arrayList.add(this.f238212M);
        arrayList.add(this.f238214O);
        arrayList.add(this.f238215P);
        arrayList.add(this.f238216Q);
        arrayList.add(this.f238213N);
    }

    /* JADX INFO: renamed from: b */
    public final void m84875b(w7j w7jVar, kl80 kl80Var, HashSet hashSet, int i, boolean z) {
        if (z) {
            if (!hashSet.contains(this)) {
                return;
            }
            nsf1.m65519e(w7jVar, kl80Var, this);
            hashSet.remove(this);
            mo35148c(kl80Var, w7jVar.m87395c0(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f238209J.f34546a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c6j) it.next()).f34549d.m84875b(w7jVar, kl80Var, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.f238211L.f34546a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c6j) it2.next()).f34549d.m84875b(w7jVar, kl80Var, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f238210K.f34546a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c6j) it3.next()).f34549d.m84875b(w7jVar, kl80Var, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f238212M.f34546a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c6j) it4.next()).f34549d.m84875b(w7jVar, kl80Var, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.f238213N.f34546a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c6j) it5.next()).f34549d.m84875b(w7jVar, kl80Var, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0210  */
    /* JADX WARN: Code duplicated, block: B:128:0x0218  */
    /* JADX WARN: Code duplicated, block: B:131:0x0221  */
    /* JADX WARN: Code duplicated, block: B:133:0x0227  */
    /* JADX WARN: Code duplicated, block: B:134:0x0232  */
    /* JADX WARN: Code duplicated, block: B:137:0x023e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0247  */
    /* JADX WARN: Code duplicated, block: B:148:0x026d  */
    /* JADX WARN: Code duplicated, block: B:160:0x0293  */
    /* JADX WARN: Code duplicated, block: B:164:0x029e  */
    /* JADX WARN: Code duplicated, block: B:167:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:168:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:173:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:176:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:178:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:181:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:183:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:186:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:190:0x0302  */
    /* JADX WARN: Code duplicated, block: B:254:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:256:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:265:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:267:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:269:0x03de  */
    /* JADX WARN: Code duplicated, block: B:272:0x03eb  */
    /* JADX WARN: Code duplicated, block: B:276:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:280:0x040f  */
    /* JADX WARN: Code duplicated, block: B:282:0x0414 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:285:0x041a  */
    /* JADX WARN: Code duplicated, block: B:288:0x0420  */
    /* JADX WARN: Code duplicated, block: B:292:0x042a  */
    /* JADX WARN: Code duplicated, block: B:295:0x0434  */
    /* JADX WARN: Code duplicated, block: B:298:0x043a  */
    /* JADX WARN: Code duplicated, block: B:300:0x043d  */
    /* JADX WARN: Code duplicated, block: B:303:0x0456  */
    /* JADX WARN: Code duplicated, block: B:322:0x049d  */
    /* JADX WARN: Code duplicated, block: B:337:0x054a  */
    /* JADX WARN: Code duplicated, block: B:353:0x059b  */
    /* JADX WARN: Code duplicated, block: B:356:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:357:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:360:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:397:0x066f  */
    /* JADX WARN: Code duplicated, block: B:399:0x0675  */
    /* JADX WARN: Code duplicated, block: B:401:0x067c  */
    /* JADX WARN: Code duplicated, block: B:402:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:405:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x009e  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0109  */
    /* JADX WARN: Code duplicated, block: B:70:0x011b  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b  */
    /* JADX WARN: Code duplicated, block: B:78:0x0135  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0158  */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    /* JADX WARN: Code duplicated, block: B:92:0x017b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r20v10 */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r20v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r37v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r60v0, types: [p.v7j] */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean] */
    /* JADX INFO: renamed from: c */
    public void mo35148c(kl80 kl80Var, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ?? r19;
        int i6;
        boolean z2;
        HashSet hashSet;
        v7j v7jVar;
        w7j w7jVar;
        WeakReference weakReference;
        WeakReference weakReference2;
        v7j v7jVar2;
        w7j w7jVar2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        boolean[] zArr;
        c6j c6jVar;
        boolean[] zArr2;
        boolean z3;
        ?? r12;
        int i7;
        int i8;
        int i9;
        boolean z4;
        int i10;
        int i11;
        u7j u7jVar;
        u7j u7jVar2;
        boolean z5;
        u7j u7jVar3;
        boolean z6;
        int i12;
        float f;
        int i13;
        int i14;
        rk31 rk31Var;
        rk31 rk31Var2;
        int i15;
        int i16;
        boolean z7;
        int i17;
        boolean z8;
        boolean z9;
        c6j c6jVar2;
        boolean z10;
        rk31 rk31Var3;
        rk31 rk31Var4;
        int i18;
        ?? r20;
        u7j u7jVar4;
        boolean z11;
        ?? r3;
        boolean z12;
        ?? r110;
        rk31 rk31Var5;
        rk31 rk31Var6;
        rk31 rk31Var7;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        ?? r27;
        bhb1 bhb1Var;
        l730 l730Var;
        int i24;
        int i25;
        int i26;
        ?? M84893z;
        boolean zM84857A;
        l730 l730Var2;
        bhb1 bhb1Var2;
        boolean z13;
        kl80 kl80Var2 = kl80Var;
        c6j c6jVar3 = this.f238209J;
        rk31 rk31VarM56811k = kl80Var2.m56811k(c6jVar3);
        c6j c6jVar4 = this.f238211L;
        rk31 rk31VarM56811k2 = kl80Var2.m56811k(c6jVar4);
        c6j c6jVar5 = this.f238210K;
        rk31 rk31VarM56811k3 = kl80Var2.m56811k(c6jVar5);
        c6j c6jVar6 = this.f238212M;
        rk31 rk31VarM56811k4 = kl80Var2.m56811k(c6jVar6);
        c6j c6jVar7 = this.f238213N;
        rk31 rk31VarM56811k5 = kl80Var2.m56811k(c6jVar7);
        v7j v7jVar3 = this.f238221V;
        u7j u7jVar5 = u7j.f227711b;
        if (v7jVar3 != null) {
            u7j[] u7jVarArr = v7jVar3.f238220U;
            i2 = 0;
            i4 = u7jVarArr[0] == u7jVar5 ? 1 : 0;
            int i27 = u7jVarArr[1] == u7jVar5 ? 1 : 0;
            int i28 = this.f238260r;
            if (i28 != 1) {
                i = 1;
                if (i28 == 2) {
                    i4 = 0;
                } else if (i28 != 3) {
                }
                i3 = i27;
            } else {
                i = 1;
                i3 = 0;
            }
            i5 = this.f238243i0;
            r19 = i3;
            boolean[] zArr3 = this.f238219T;
            if (i5 != 8 && !this.f238245j0) {
                ArrayList arrayList = this.f238218S;
                int size = arrayList.size();
                i6 = i4;
                int i29 = i2;
                while (true) {
                    if (i29 >= size) {
                        if (zArr3[i2] || zArr3[i]) {
                            break;
                            break;
                        }
                        return;
                    }
                    int i30 = size;
                    HashSet hashSet2 = ((c6j) arrayList.get(i29)).f34546a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        break;
                    }
                    i29++;
                    size = i30;
                }
            } else {
                i6 = i4;
            }
            z2 = this.f238248l;
            if (z2 || this.f238250m) {
                if (z2) {
                    kl80Var2.m56804d(rk31VarM56811k, this.f238227a0);
                    kl80Var2.m56804d(rk31VarM56811k2, this.f238227a0 + this.f238222W);
                    if (i6 != 0 && (v7jVar2 = this.f238221V) != null) {
                        w7jVar2 = (w7j) v7jVar2;
                        weakReference3 = w7jVar2.f248703L0;
                        if (weakReference3 != null || weakReference3.get() == null || c6jVar3.m31570d() > ((c6j) w7jVar2.f248703L0.get()).m31570d()) {
                            w7jVar2.f248703L0 = new WeakReference(c6jVar3);
                        }
                        weakReference4 = w7jVar2.f248705N0;
                        if (weakReference4 != null || weakReference4.get() == null || c6jVar4.m31570d() > ((c6j) w7jVar2.f248705N0.get()).m31570d()) {
                            w7jVar2.f248705N0 = new WeakReference(c6jVar4);
                        }
                    }
                }
                if (this.f238250m) {
                    kl80Var2.m56804d(rk31VarM56811k3, this.f238229b0);
                    kl80Var2.m56804d(rk31VarM56811k4, this.f238229b0 + this.f238223X);
                    hashSet = c6jVar7.f34546a;
                    if (hashSet != null && hashSet.size() > 0) {
                        kl80Var2.m56804d(rk31VarM56811k5, this.f238229b0 + this.f238231c0);
                    }
                    if (r19 != 0 && (v7jVar = this.f238221V) != null) {
                        w7jVar = (w7j) v7jVar;
                        weakReference = w7jVar.f248702K0;
                        if (weakReference != null || weakReference.get() == null || c6jVar5.m31570d() > ((c6j) w7jVar.f248702K0.get()).m31570d()) {
                            w7jVar.f248702K0 = new WeakReference(c6jVar5);
                        }
                        weakReference2 = w7jVar.f248704M0;
                        if (weakReference2 != null || weakReference2.get() == null || c6jVar6.m31570d() > ((c6j) w7jVar.f248704M0.get()).m31570d()) {
                            w7jVar.f248704M0 = new WeakReference(c6jVar6);
                        }
                    }
                }
                if (this.f238248l && this.f238250m) {
                    ?? r13 = i2;
                    this.f238248l = r13;
                    this.f238250m = r13;
                    return;
                }
            }
            zArr = this.f238236f;
            if (z || (l730Var2 = this.f238232d) == null || (bhb1Var2 = this.f238234e) == null) {
                c6jVar = c6jVar7;
                zArr2 = zArr;
            } else {
                c6jVar = c6jVar7;
                ftq ftqVar = l730Var2.f137068h;
                zArr2 = zArr;
                if (ftqVar.f73274j && l730Var2.f137069i.f73274j && bhb1Var2.f137068h.f73274j && bhb1Var2.f137069i.f73274j) {
                    kl80Var2.m56804d(rk31VarM56811k, ftqVar.f73271g);
                    kl80Var2.m56804d(rk31VarM56811k2, this.f238232d.f137069i.f73271g);
                    kl80Var2.m56804d(rk31VarM56811k3, this.f238234e.f137068h.f73271g);
                    kl80Var2.m56804d(rk31VarM56811k4, this.f238234e.f137069i.f73271g);
                    kl80Var2.m56804d(rk31VarM56811k5, this.f238234e.f27132k.f73271g);
                    if (this.f238221V == null) {
                        z13 = false;
                    } else {
                        if (i6 != 0 && zArr2[0] && !m84893z()) {
                            kl80Var2.m56806f(kl80Var2.m56811k(this.f238221V.f238211L), rk31VarM56811k2, 0, 8);
                        }
                        if (r19 == 0 || !zArr2[i] || m84857A()) {
                            z13 = false;
                        } else {
                            z13 = false;
                            kl80Var2.m56806f(kl80Var2.m56811k(this.f238221V.f238212M), rk31VarM56811k4, 0, 8);
                        }
                    }
                    this.f238248l = z13;
                    this.f238250m = z13;
                    return;
                }
            }
            if (this.f238221V != null) {
                if (m84892y(0)) {
                    ((w7j) this.f238221V).m87391X(this, 0);
                    int i31 = i;
                    i26 = i31 == true ? 1 : 0;
                    M84893z = i31;
                } else {
                    i26 = i;
                    M84893z = m84893z();
                }
                if (m84892y(i26)) {
                    ((w7j) this.f238221V).m87391X(this, i26);
                    zM84857A = true;
                } else {
                    zM84857A = m84857A();
                }
                if (M84893z != 0 && i6 != 0 && this.f238243i0 != 8 && c6jVar3.f34551f == null && c6jVar4.f34551f == null) {
                    kl80Var2.m56806f(kl80Var2.m56811k(this.f238221V.f238211L), rk31VarM56811k2, 0, 1);
                }
                if (!zM84857A && r19 != 0 && this.f238243i0 != 8 && c6jVar5.f34551f == null && c6jVar6.f34551f == null && c6jVar == null) {
                    kl80Var2.m56806f(kl80Var2.m56811k(this.f238221V.f238212M), rk31VarM56811k4, 0, 1);
                }
                z3 = zM84857A;
                r12 = M84893z;
            } else {
                c6jVar3 = c6jVar3;
                z3 = false;
                r12 = 0;
            }
            i7 = this.f238222W;
            i8 = this.f238233d0;
            if (i7 >= i8) {
                i8 = i7;
            }
            i9 = this.f238223X;
            z4 = z3;
            i10 = this.f238235e0;
            if (i9 < i10) {
                i11 = i10;
            } else {
                i11 = i9;
            }
            u7j[] u7jVarArr2 = this.f238220U;
            u7jVar = u7jVarArr2[0];
            u7jVar2 = u7j.f227712c;
            if (u7jVar != u7jVar2) {
                z5 = true;
            } else {
                z5 = false;
            }
            u7jVar3 = u7jVarArr2[1];
            if (u7jVar3 != u7jVar2) {
                z6 = true;
            } else {
                z6 = false;
            }
            i12 = this.f238225Z;
            this.f238201B = i12;
            f = this.f238224Y;
            this.f238202C = f;
            i13 = this.f238262s;
            i14 = this.f238264t;
            if (f > 0.0f) {
                rk31Var = rk31VarM56811k4;
                if (this.f238243i0 != 8) {
                    if (u7jVar == u7jVar2 || i13 != 0) {
                        i15 = i13;
                    } else {
                        i15 = 3;
                    }
                    if (u7jVar3 == u7jVar2 || i14 != 0) {
                        i25 = i14;
                    } else {
                        i25 = 3;
                    }
                    if (u7jVar != u7jVar2 && u7jVar3 == u7jVar2) {
                        rk31Var2 = rk31VarM56811k5;
                        if (i15 == 3 && i25 == 3) {
                            if (i12 == -1) {
                                if (z5 && !z6) {
                                    this.f238201B = 0;
                                } else if (!z5 && z6) {
                                    this.f238201B = 1;
                                    if (i12 == -1) {
                                        this.f238202C = 1.0f / f;
                                    }
                                }
                            }
                            if (this.f238201B == 0 && (!c6jVar5.m31574h() || !c6jVar6.m31574h())) {
                                this.f238201B = 1;
                            } else if (this.f238201B == 1 && (!c6jVar3.m31574h() || !c6jVar4.m31574h())) {
                                this.f238201B = 0;
                            }
                            if (this.f238201B == -1 && (!c6jVar5.m31574h() || !c6jVar6.m31574h() || !c6jVar3.m31574h() || !c6jVar4.m31574h())) {
                                if (c6jVar5.m31574h() && c6jVar6.m31574h()) {
                                    this.f238201B = 0;
                                } else if (c6jVar3.m31574h() && c6jVar4.m31574h()) {
                                    this.f238202C = 1.0f / this.f238202C;
                                    this.f238201B = 1;
                                }
                            }
                            if (this.f238201B == -1) {
                                int i32 = this.f238267v;
                                if (i32 > 0 && this.f238270y == 0) {
                                    this.f238201B = 0;
                                } else if (i32 == 0 && this.f238270y > 0) {
                                    this.f238202C = 1.0f / this.f238202C;
                                    this.f238201B = 1;
                                }
                            }
                        }
                        i6 = i6;
                        z7 = true;
                        i16 = i25;
                        int[] iArr = this.f238266u;
                        iArr[0] = i15;
                        iArr[1] = i16;
                        if (z7) {
                            int i33 = this.f238201B;
                            i17 = -1;
                            boolean z14 = i33 != 0 || i33 == -1;
                            if (z7 || !((i24 = this.f238201B) == 1 || i24 == i17)) {
                                z8 = false;
                            } else {
                                z8 = true;
                            }
                            if (this.f238220U[0] == u7jVar5 || !(this instanceof w7j)) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (z9) {
                                i8 = 0;
                            }
                            c6jVar2 = this.f238216Q;
                            z10 = !c6jVar2.m31574h();
                            boolean z15 = zArr3[0];
                            boolean z16 = zArr3[1];
                            if (this.f238256p != 2 || this.f238248l) {
                                rk31Var3 = rk31VarM56811k;
                                rk31Var4 = rk31VarM56811k2;
                                i18 = i15;
                                r20 = r12;
                                u7jVar4 = u7jVar5;
                                z11 = z4;
                                r3 = i6;
                                z12 = z10;
                                r110 = r19;
                            } else {
                                if (z && (l730Var = this.f238232d) != null) {
                                    ftq ftqVar2 = l730Var.f137068h;
                                    if (ftqVar2.f73274j && l730Var.f137069i.f73274j) {
                                        if (z) {
                                            kl80Var2.m56804d(rk31VarM56811k, ftqVar2.f73271g);
                                            kl80Var2.m56804d(rk31VarM56811k2, this.f238232d.f137069i.f73271g);
                                            if (this.f238221V != null && i6 != 0 && zArr2[0] && !m84893z()) {
                                                kl80Var2.m56806f(kl80Var2.m56811k(this.f238221V.f238211L), rk31VarM56811k2, 0, 8);
                                            }
                                        }
                                        rk31Var3 = rk31VarM56811k;
                                        rk31Var4 = rk31VarM56811k2;
                                        i18 = i15;
                                        r20 = r12;
                                        u7jVar4 = u7jVar5;
                                        z11 = z4;
                                        r3 = i6;
                                        z12 = z10;
                                        r110 = r19;
                                    }
                                }
                                v7j v7jVar4 = this.f238221V;
                                rk31 rk31VarM56811k6 = v7jVar4 != null ? kl80Var2.m56811k(v7jVar4.f238211L) : null;
                                v7j v7jVar5 = this.f238221V;
                                rk31 rk31VarM56811k7 = v7jVar5 != null ? kl80Var2.m56811k(v7jVar5.f238209J) : null;
                                boolean z17 = zArr2[0];
                                u7j[] u7jVarArr3 = this.f238220U;
                                i18 = i15;
                                ?? r111 = r12;
                                ?? r4 = i6;
                                boolean z18 = z10;
                                rk31Var4 = rk31VarM56811k2;
                                u7jVar4 = u7jVar5;
                                rk31Var3 = rk31VarM56811k;
                                kl80Var2 = kl80Var;
                                m84876e(kl80Var2, true, r4, r19, z17, rk31VarM56811k7, rk31VarM56811k6, u7jVarArr3[0], z9, this.f238209J, this.f238211L, this.f238227a0, i8, this.f238233d0, this.f238203D[0], this.f238237f0, z14, u7jVarArr3[1] == u7jVar2, r111, z4, z15, i18, i16, this.f238267v, this.f238268w, this.f238269x, z18);
                                z11 = z4;
                                r20 = r111 == true ? 1 : 0;
                                r110 = r19 == true ? 1 : 0;
                                r3 = r4;
                                z12 = z18;
                            }
                            if (z || (bhb1Var = this.f238234e) == null) {
                                rk31Var5 = r33;
                                rk31Var6 = rk31Var;
                                rk31Var7 = rk31Var2;
                                i19 = 0;
                                i20 = 8;
                                i21 = 1;
                                i22 = 1;
                            } else {
                                ftq ftqVar3 = bhb1Var.f137068h;
                                if (ftqVar3.f73274j && bhb1Var.f137069i.f73274j) {
                                    int i34 = ftqVar3.f73271g;
                                    rk31Var5 = rk31VarM56811k3;
                                    kl80Var2.m56804d(rk31Var5, i34);
                                    rk31Var6 = rk31Var;
                                    kl80Var2.m56804d(rk31Var6, this.f238234e.f137069i.f73271g);
                                    rk31Var7 = rk31Var2;
                                    kl80Var2.m56804d(rk31Var7, this.f238234e.f27132k.f73271g);
                                    v7j v7jVar6 = this.f238221V;
                                    if (v7jVar6 == null || z11 || r110 == 0) {
                                        i19 = 0;
                                        i20 = 8;
                                        i21 = 1;
                                    } else {
                                        i21 = 1;
                                        if (zArr2[1]) {
                                            i19 = 0;
                                            i20 = 8;
                                            kl80Var2.m56806f(kl80Var2.m56811k(v7jVar6.f238212M), rk31Var6, 0, 8);
                                        } else {
                                            i19 = 0;
                                            i20 = 8;
                                        }
                                    }
                                    i22 = i19;
                                } else {
                                    rk31Var5 = r33;
                                    rk31Var6 = rk31Var;
                                    rk31Var7 = rk31Var2;
                                    i19 = 0;
                                    i20 = 8;
                                    i21 = 1;
                                    i22 = 1;
                                }
                            }
                            if (this.f238258q == 2) {
                                i23 = i19;
                            } else {
                                i23 = i22;
                            }
                            if (i23 == 0 && !this.f238250m) {
                                int i35 = (this.f238220U[i21] == u7jVar4 && (this instanceof w7j)) ? i21 : i19;
                                int i36 = i35 != 0 ? i19 : i11;
                                v7j v7jVar7 = this.f238221V;
                                rk31 rk31VarM56811k8 = v7jVar7 != null ? kl80Var2.m56811k(v7jVar7.f238212M) : null;
                                v7j v7jVar8 = this.f238221V;
                                rk31 rk31VarM56811k9 = v7jVar8 != null ? kl80Var2.m56811k(v7jVar8.f238210K) : null;
                                int i37 = this.f238231c0;
                                if (i37 > 0 || this.f238243i0 == i20) {
                                    r27 = z12;
                                    c6j c6jVar8 = c6jVar;
                                    if (c6jVar8.f34551f != null) {
                                        kl80Var2.m56805e(rk31Var7, rk31Var5, i37, i20);
                                        kl80Var2.m56805e(rk31Var7, kl80Var2.m56811k(c6jVar8.f34551f), c6jVar8.m31571e(), i20);
                                        if (r110 != 0) {
                                            kl80Var2.m56806f(rk31VarM56811k8, kl80Var2.m56811k(c6jVar6), i19, 5);
                                        }
                                        r27 = i19;
                                    } else if (this.f238243i0 == i20) {
                                        kl80Var2.m56805e(rk31Var7, rk31Var5, c6jVar8.m31571e(), i20);
                                        r27 = z12;
                                    } else {
                                        kl80Var2.m56805e(rk31Var7, rk31Var5, i37, i20);
                                        r27 = z12;
                                    }
                                }
                                r27 = z12;
                                boolean z19 = zArr2[i21];
                                u7j[] u7jVarArr4 = this.f238220U;
                                ?? r9 = i35;
                                int i38 = i19;
                                kl80Var2 = kl80Var;
                                m84876e(kl80Var2, false, r110, r3, z19, rk31VarM56811k9, rk31VarM56811k8, u7jVarArr4[i21], r9, this.f238210K, this.f238212M, this.f238229b0, i36, this.f238235e0, this.f238203D[i21], this.f238239g0, z8, u7jVarArr4[i38] == u7jVar2 ? 1 : i38, z11, r20, z16, i16, i18, this.f238270y, this.f238271z, this.f238200A, r27);
                            }
                            if (z7) {
                                if (this.f238201B == 1) {
                                    float f2 = this.f238202C;
                                    yj5 yj5VarM56812l = kl80Var2.m56812l();
                                    yj5VarM56812l.f273290d.m53522g(rk31Var6, -1.0f);
                                    yj5VarM56812l.f273290d.m53522g(rk31Var5, 1.0f);
                                    yj5VarM56812l.f273290d.m53522g(rk31Var4, f2);
                                    yj5VarM56812l.f273290d.m53522g(rk31Var3, -f2);
                                    kl80Var2.m56803c(yj5VarM56812l);
                                } else {
                                    rk31 rk31Var8 = rk31Var5;
                                    float f3 = this.f238202C;
                                    yj5 yj5VarM56812l2 = kl80Var2.m56812l();
                                    yj5VarM56812l2.f273290d.m53522g(rk31Var4, -1.0f);
                                    yj5VarM56812l2.f273290d.m53522g(rk31Var3, 1.0f);
                                    yj5VarM56812l2.f273290d.m53522g(rk31Var6, f3);
                                    yj5VarM56812l2.f273290d.m53522g(rk31Var8, -f3);
                                    kl80Var2.m56803c(yj5VarM56812l2);
                                }
                            }
                            if (c6jVar2.m31574h()) {
                                v7j v7jVar9 = c6jVar2.f34551f.f34549d;
                                float radians = (float) Math.toRadians(this.f238204E + 90.0f);
                                int iM31571e = c6jVar2.m31571e();
                                rk31 rk31VarM56811k10 = kl80Var2.m56811k(mo55866k(2));
                                rk31 rk31VarM56811k11 = kl80Var2.m56811k(mo55866k(3));
                                rk31 rk31VarM56811k12 = kl80Var2.m56811k(mo55866k(4));
                                rk31 rk31VarM56811k13 = kl80Var2.m56811k(mo55866k(5));
                                rk31 rk31VarM56811k14 = kl80Var2.m56811k(v7jVar9.mo55866k(2));
                                rk31 rk31VarM56811k15 = kl80Var2.m56811k(v7jVar9.mo55866k(3));
                                rk31 rk31VarM56811k16 = kl80Var2.m56811k(v7jVar9.mo55866k(4));
                                rk31 rk31VarM56811k17 = kl80Var2.m56811k(v7jVar9.mo55866k(5));
                                yj5 yj5VarM56812l3 = kl80Var2.m56812l();
                                double d = radians;
                                double dSin = Math.sin(d);
                                double d2 = iM31571e;
                                yj5VarM56812l3.f273290d.m53522g(rk31VarM56811k15, 0.5f);
                                yj5VarM56812l3.f273290d.m53522g(rk31VarM56811k17, 0.5f);
                                yj5VarM56812l3.f273290d.m53522g(rk31VarM56811k11, -0.5f);
                                yj5VarM56812l3.f273290d.m53522g(rk31VarM56811k13, -0.5f);
                                yj5VarM56812l3.f273288b = -((float) (dSin * d2));
                                kl80Var2.m56803c(yj5VarM56812l3);
                                yj5 yj5VarM56812l4 = kl80Var2.m56812l();
                                float fCos = (float) (Math.cos(d) * d2);
                                yj5VarM56812l4.f273290d.m53522g(rk31VarM56811k14, 0.5f);
                                yj5VarM56812l4.f273290d.m53522g(rk31VarM56811k16, 0.5f);
                                yj5VarM56812l4.f273290d.m53522g(rk31VarM56811k10, -0.5f);
                                yj5VarM56812l4.f273290d.m53522g(rk31VarM56811k12, -0.5f);
                                yj5VarM56812l4.f273288b = -fCos;
                                kl80Var2.m56803c(yj5VarM56812l4);
                            }
                            this.f238248l = false;
                            this.f238250m = false;
                        }
                        i17 = -1;
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (this.f238220U[0] == u7jVar5) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        c6jVar2 = this.f238216Q;
                        z10 = !c6jVar2.m31574h();
                        boolean z110 = zArr3[0];
                        boolean z111 = zArr3[1];
                        if (this.f238256p != 2) {
                            rk31Var3 = rk31VarM56811k;
                            rk31Var4 = rk31VarM56811k2;
                            i18 = i15;
                            r20 = r12;
                            u7jVar4 = u7jVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        } else {
                            rk31Var3 = rk31VarM56811k;
                            rk31Var4 = rk31VarM56811k2;
                            i18 = i15;
                            r20 = r12;
                            u7jVar4 = u7jVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        }
                        if (z) {
                            rk31Var5 = r33;
                            rk31Var6 = rk31Var;
                            rk31Var7 = rk31Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        } else {
                            rk31Var5 = r33;
                            rk31Var6 = rk31Var;
                            rk31Var7 = rk31Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        }
                        if (this.f238258q == 2) {
                            i23 = i19;
                        } else {
                            i23 = i22;
                        }
                        if (i23 == 0) {
                        }
                        if (z7) {
                            if (this.f238201B == 1) {
                                float f4 = this.f238202C;
                                yj5 yj5VarM56812l5 = kl80Var2.m56812l();
                                yj5VarM56812l5.f273290d.m53522g(rk31Var6, -1.0f);
                                yj5VarM56812l5.f273290d.m53522g(rk31Var5, 1.0f);
                                yj5VarM56812l5.f273290d.m53522g(rk31Var4, f4);
                                yj5VarM56812l5.f273290d.m53522g(rk31Var3, -f4);
                                kl80Var2.m56803c(yj5VarM56812l5);
                            } else {
                                rk31 rk31Var9 = rk31Var5;
                                float f5 = this.f238202C;
                                yj5 yj5VarM56812l6 = kl80Var2.m56812l();
                                yj5VarM56812l6.f273290d.m53522g(rk31Var4, -1.0f);
                                yj5VarM56812l6.f273290d.m53522g(rk31Var3, 1.0f);
                                yj5VarM56812l6.f273290d.m53522g(rk31Var6, f5);
                                yj5VarM56812l6.f273290d.m53522g(rk31Var9, -f5);
                                kl80Var2.m56803c(yj5VarM56812l6);
                            }
                        }
                        if (c6jVar2.m31574h()) {
                            v7j v7jVar10 = c6jVar2.f34551f.f34549d;
                            float radians2 = (float) Math.toRadians(this.f238204E + 90.0f);
                            int iM31571e2 = c6jVar2.m31571e();
                            rk31 rk31VarM56811k18 = kl80Var2.m56811k(mo55866k(2));
                            rk31 rk31VarM56811k19 = kl80Var2.m56811k(mo55866k(3));
                            rk31 rk31VarM56811k110 = kl80Var2.m56811k(mo55866k(4));
                            rk31 rk31VarM56811k111 = kl80Var2.m56811k(mo55866k(5));
                            rk31 rk31VarM56811k112 = kl80Var2.m56811k(v7jVar10.mo55866k(2));
                            rk31 rk31VarM56811k113 = kl80Var2.m56811k(v7jVar10.mo55866k(3));
                            rk31 rk31VarM56811k114 = kl80Var2.m56811k(v7jVar10.mo55866k(4));
                            rk31 rk31VarM56811k115 = kl80Var2.m56811k(v7jVar10.mo55866k(5));
                            yj5 yj5VarM56812l7 = kl80Var2.m56812l();
                            double d3 = radians2;
                            double dSin2 = Math.sin(d3);
                            double d4 = iM31571e2;
                            yj5VarM56812l7.f273290d.m53522g(rk31VarM56811k113, 0.5f);
                            yj5VarM56812l7.f273290d.m53522g(rk31VarM56811k115, 0.5f);
                            yj5VarM56812l7.f273290d.m53522g(rk31VarM56811k19, -0.5f);
                            yj5VarM56812l7.f273290d.m53522g(rk31VarM56811k111, -0.5f);
                            yj5VarM56812l7.f273288b = -((float) (dSin2 * d4));
                            kl80Var2.m56803c(yj5VarM56812l7);
                            yj5 yj5VarM56812l8 = kl80Var2.m56812l();
                            float fCos2 = (float) (Math.cos(d3) * d4);
                            yj5VarM56812l8.f273290d.m53522g(rk31VarM56811k112, 0.5f);
                            yj5VarM56812l8.f273290d.m53522g(rk31VarM56811k114, 0.5f);
                            yj5VarM56812l8.f273290d.m53522g(rk31VarM56811k18, -0.5f);
                            yj5VarM56812l8.f273290d.m53522g(rk31VarM56811k110, -0.5f);
                            yj5VarM56812l8.f273288b = -fCos2;
                            kl80Var2.m56803c(yj5VarM56812l8);
                        }
                        this.f238248l = false;
                        this.f238250m = false;
                    }
                    rk31Var2 = rk31VarM56811k5;
                    if (u7jVar == u7jVar2 || i15 != 3) {
                        if (u7jVar3 == u7jVar2) {
                            if (i25 == 3) {
                                this.f238201B = 1;
                                if (i12 == -1) {
                                    this.f238202C = 1.0f / f;
                                }
                                i11 = (int) (this.f238202C * i7);
                                if (u7jVar != u7jVar2) {
                                    i16 = 4;
                                }
                            }
                        }
                        i6 = i6;
                        z7 = true;
                    } else {
                        this.f238201B = 0;
                        i8 = (int) (i9 * f);
                        i6 = i6;
                        if (u7jVar3 != u7jVar2) {
                            i15 = 4;
                            z7 = false;
                        } else {
                            z7 = true;
                        }
                    }
                    i16 = i25;
                    int[] iArr2 = this.f238266u;
                    iArr2[0] = i15;
                    iArr2[1] = i16;
                    if (z7) {
                        int i39 = this.f238201B;
                        i17 = -1;
                        if (i39 != 0) {
                        }
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (this.f238220U[0] == u7jVar5) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        c6jVar2 = this.f238216Q;
                        z10 = !c6jVar2.m31574h();
                        boolean z112 = zArr3[0];
                        boolean z113 = zArr3[1];
                        if (this.f238256p != 2) {
                            rk31Var3 = rk31VarM56811k;
                            rk31Var4 = rk31VarM56811k2;
                            i18 = i15;
                            r20 = r12;
                            u7jVar4 = u7jVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        } else {
                            rk31Var3 = rk31VarM56811k;
                            rk31Var4 = rk31VarM56811k2;
                            i18 = i15;
                            r20 = r12;
                            u7jVar4 = u7jVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        }
                        if (z) {
                            rk31Var5 = r33;
                            rk31Var6 = rk31Var;
                            rk31Var7 = rk31Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        } else {
                            rk31Var5 = r33;
                            rk31Var6 = rk31Var;
                            rk31Var7 = rk31Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        }
                        if (this.f238258q == 2) {
                            i23 = i19;
                        } else {
                            i23 = i22;
                        }
                        if (i23 == 0) {
                        }
                        if (z7) {
                            if (this.f238201B == 1) {
                                float f6 = this.f238202C;
                                yj5 yj5VarM56812l9 = kl80Var2.m56812l();
                                yj5VarM56812l9.f273290d.m53522g(rk31Var6, -1.0f);
                                yj5VarM56812l9.f273290d.m53522g(rk31Var5, 1.0f);
                                yj5VarM56812l9.f273290d.m53522g(rk31Var4, f6);
                                yj5VarM56812l9.f273290d.m53522g(rk31Var3, -f6);
                                kl80Var2.m56803c(yj5VarM56812l9);
                            } else {
                                rk31 rk31Var10 = rk31Var5;
                                float f7 = this.f238202C;
                                yj5 yj5VarM56812l10 = kl80Var2.m56812l();
                                yj5VarM56812l10.f273290d.m53522g(rk31Var4, -1.0f);
                                yj5VarM56812l10.f273290d.m53522g(rk31Var3, 1.0f);
                                yj5VarM56812l10.f273290d.m53522g(rk31Var6, f7);
                                yj5VarM56812l10.f273290d.m53522g(rk31Var10, -f7);
                                kl80Var2.m56803c(yj5VarM56812l10);
                            }
                        }
                        if (c6jVar2.m31574h()) {
                            v7j v7jVar11 = c6jVar2.f34551f.f34549d;
                            float radians3 = (float) Math.toRadians(this.f238204E + 90.0f);
                            int iM31571e3 = c6jVar2.m31571e();
                            rk31 rk31VarM56811k116 = kl80Var2.m56811k(mo55866k(2));
                            rk31 rk31VarM56811k117 = kl80Var2.m56811k(mo55866k(3));
                            rk31 rk31VarM56811k118 = kl80Var2.m56811k(mo55866k(4));
                            rk31 rk31VarM56811k119 = kl80Var2.m56811k(mo55866k(5));
                            rk31 rk31VarM56811k1110 = kl80Var2.m56811k(v7jVar11.mo55866k(2));
                            rk31 rk31VarM56811k1111 = kl80Var2.m56811k(v7jVar11.mo55866k(3));
                            rk31 rk31VarM56811k1112 = kl80Var2.m56811k(v7jVar11.mo55866k(4));
                            rk31 rk31VarM56811k1113 = kl80Var2.m56811k(v7jVar11.mo55866k(5));
                            yj5 yj5VarM56812l11 = kl80Var2.m56812l();
                            double d5 = radians3;
                            double dSin3 = Math.sin(d5);
                            double d6 = iM31571e3;
                            yj5VarM56812l11.f273290d.m53522g(rk31VarM56811k1111, 0.5f);
                            yj5VarM56812l11.f273290d.m53522g(rk31VarM56811k1113, 0.5f);
                            yj5VarM56812l11.f273290d.m53522g(rk31VarM56811k117, -0.5f);
                            yj5VarM56812l11.f273290d.m53522g(rk31VarM56811k119, -0.5f);
                            yj5VarM56812l11.f273288b = -((float) (dSin3 * d6));
                            kl80Var2.m56803c(yj5VarM56812l11);
                            yj5 yj5VarM56812l12 = kl80Var2.m56812l();
                            float fCos3 = (float) (Math.cos(d5) * d6);
                            yj5VarM56812l12.f273290d.m53522g(rk31VarM56811k1110, 0.5f);
                            yj5VarM56812l12.f273290d.m53522g(rk31VarM56811k1112, 0.5f);
                            yj5VarM56812l12.f273290d.m53522g(rk31VarM56811k116, -0.5f);
                            yj5VarM56812l12.f273290d.m53522g(rk31VarM56811k118, -0.5f);
                            yj5VarM56812l12.f273288b = -fCos3;
                            kl80Var2.m56803c(yj5VarM56812l12);
                        }
                        this.f238248l = false;
                        this.f238250m = false;
                    }
                    i17 = -1;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (this.f238220U[0] == u7jVar5) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    c6jVar2 = this.f238216Q;
                    z10 = !c6jVar2.m31574h();
                    boolean z114 = zArr3[0];
                    boolean z115 = zArr3[1];
                    if (this.f238256p != 2) {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    } else {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    }
                    if (z) {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.f238258q == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        if (this.f238201B == 1) {
                            float f8 = this.f238202C;
                            yj5 yj5VarM56812l13 = kl80Var2.m56812l();
                            yj5VarM56812l13.f273290d.m53522g(rk31Var6, -1.0f);
                            yj5VarM56812l13.f273290d.m53522g(rk31Var5, 1.0f);
                            yj5VarM56812l13.f273290d.m53522g(rk31Var4, f8);
                            yj5VarM56812l13.f273290d.m53522g(rk31Var3, -f8);
                            kl80Var2.m56803c(yj5VarM56812l13);
                        } else {
                            rk31 rk31Var11 = rk31Var5;
                            float f9 = this.f238202C;
                            yj5 yj5VarM56812l14 = kl80Var2.m56812l();
                            yj5VarM56812l14.f273290d.m53522g(rk31Var4, -1.0f);
                            yj5VarM56812l14.f273290d.m53522g(rk31Var3, 1.0f);
                            yj5VarM56812l14.f273290d.m53522g(rk31Var6, f9);
                            yj5VarM56812l14.f273290d.m53522g(rk31Var11, -f9);
                            kl80Var2.m56803c(yj5VarM56812l14);
                        }
                    }
                    if (c6jVar2.m31574h()) {
                        v7j v7jVar12 = c6jVar2.f34551f.f34549d;
                        float radians4 = (float) Math.toRadians(this.f238204E + 90.0f);
                        int iM31571e4 = c6jVar2.m31571e();
                        rk31 rk31VarM56811k1114 = kl80Var2.m56811k(mo55866k(2));
                        rk31 rk31VarM56811k1115 = kl80Var2.m56811k(mo55866k(3));
                        rk31 rk31VarM56811k1116 = kl80Var2.m56811k(mo55866k(4));
                        rk31 rk31VarM56811k1117 = kl80Var2.m56811k(mo55866k(5));
                        rk31 rk31VarM56811k1118 = kl80Var2.m56811k(v7jVar12.mo55866k(2));
                        rk31 rk31VarM56811k1119 = kl80Var2.m56811k(v7jVar12.mo55866k(3));
                        rk31 rk31VarM56811k11110 = kl80Var2.m56811k(v7jVar12.mo55866k(4));
                        rk31 rk31VarM56811k11111 = kl80Var2.m56811k(v7jVar12.mo55866k(5));
                        yj5 yj5VarM56812l15 = kl80Var2.m56812l();
                        double d7 = radians4;
                        double dSin4 = Math.sin(d7);
                        double d8 = iM31571e4;
                        yj5VarM56812l15.f273290d.m53522g(rk31VarM56811k1119, 0.5f);
                        yj5VarM56812l15.f273290d.m53522g(rk31VarM56811k11111, 0.5f);
                        yj5VarM56812l15.f273290d.m53522g(rk31VarM56811k1115, -0.5f);
                        yj5VarM56812l15.f273290d.m53522g(rk31VarM56811k1117, -0.5f);
                        yj5VarM56812l15.f273288b = -((float) (dSin4 * d8));
                        kl80Var2.m56803c(yj5VarM56812l15);
                        yj5 yj5VarM56812l16 = kl80Var2.m56812l();
                        float fCos4 = (float) (Math.cos(d7) * d8);
                        yj5VarM56812l16.f273290d.m53522g(rk31VarM56811k1118, 0.5f);
                        yj5VarM56812l16.f273290d.m53522g(rk31VarM56811k11110, 0.5f);
                        yj5VarM56812l16.f273290d.m53522g(rk31VarM56811k1114, -0.5f);
                        yj5VarM56812l16.f273290d.m53522g(rk31VarM56811k1116, -0.5f);
                        yj5VarM56812l16.f273288b = -fCos4;
                        kl80Var2.m56803c(yj5VarM56812l16);
                    }
                    this.f238248l = false;
                    this.f238250m = false;
                }
                z7 = false;
                int[] iArr3 = this.f238266u;
                iArr3[0] = i15;
                iArr3[1] = i16;
                if (z7) {
                    int i310 = this.f238201B;
                    i17 = -1;
                    if (i310 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (this.f238220U[0] == u7jVar5) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    c6jVar2 = this.f238216Q;
                    z10 = !c6jVar2.m31574h();
                    boolean z116 = zArr3[0];
                    boolean z117 = zArr3[1];
                    if (this.f238256p != 2) {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    } else {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    }
                    if (z) {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.f238258q == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        if (this.f238201B == 1) {
                            float f10 = this.f238202C;
                            yj5 yj5VarM56812l17 = kl80Var2.m56812l();
                            yj5VarM56812l17.f273290d.m53522g(rk31Var6, -1.0f);
                            yj5VarM56812l17.f273290d.m53522g(rk31Var5, 1.0f);
                            yj5VarM56812l17.f273290d.m53522g(rk31Var4, f10);
                            yj5VarM56812l17.f273290d.m53522g(rk31Var3, -f10);
                            kl80Var2.m56803c(yj5VarM56812l17);
                        } else {
                            rk31 rk31Var12 = rk31Var5;
                            float f11 = this.f238202C;
                            yj5 yj5VarM56812l18 = kl80Var2.m56812l();
                            yj5VarM56812l18.f273290d.m53522g(rk31Var4, -1.0f);
                            yj5VarM56812l18.f273290d.m53522g(rk31Var3, 1.0f);
                            yj5VarM56812l18.f273290d.m53522g(rk31Var6, f11);
                            yj5VarM56812l18.f273290d.m53522g(rk31Var12, -f11);
                            kl80Var2.m56803c(yj5VarM56812l18);
                        }
                    }
                    if (c6jVar2.m31574h()) {
                        v7j v7jVar13 = c6jVar2.f34551f.f34549d;
                        float radians5 = (float) Math.toRadians(this.f238204E + 90.0f);
                        int iM31571e5 = c6jVar2.m31571e();
                        rk31 rk31VarM56811k11112 = kl80Var2.m56811k(mo55866k(2));
                        rk31 rk31VarM56811k11113 = kl80Var2.m56811k(mo55866k(3));
                        rk31 rk31VarM56811k11114 = kl80Var2.m56811k(mo55866k(4));
                        rk31 rk31VarM56811k11115 = kl80Var2.m56811k(mo55866k(5));
                        rk31 rk31VarM56811k11116 = kl80Var2.m56811k(v7jVar13.mo55866k(2));
                        rk31 rk31VarM56811k11117 = kl80Var2.m56811k(v7jVar13.mo55866k(3));
                        rk31 rk31VarM56811k11118 = kl80Var2.m56811k(v7jVar13.mo55866k(4));
                        rk31 rk31VarM56811k11119 = kl80Var2.m56811k(v7jVar13.mo55866k(5));
                        yj5 yj5VarM56812l19 = kl80Var2.m56812l();
                        double d9 = radians5;
                        double dSin5 = Math.sin(d9);
                        double d10 = iM31571e5;
                        yj5VarM56812l19.f273290d.m53522g(rk31VarM56811k11117, 0.5f);
                        yj5VarM56812l19.f273290d.m53522g(rk31VarM56811k11119, 0.5f);
                        yj5VarM56812l19.f273290d.m53522g(rk31VarM56811k11113, -0.5f);
                        yj5VarM56812l19.f273290d.m53522g(rk31VarM56811k11115, -0.5f);
                        yj5VarM56812l19.f273288b = -((float) (dSin5 * d10));
                        kl80Var2.m56803c(yj5VarM56812l19);
                        yj5 yj5VarM56812l110 = kl80Var2.m56812l();
                        float fCos5 = (float) (Math.cos(d9) * d10);
                        yj5VarM56812l110.f273290d.m53522g(rk31VarM56811k11116, 0.5f);
                        yj5VarM56812l110.f273290d.m53522g(rk31VarM56811k11118, 0.5f);
                        yj5VarM56812l110.f273290d.m53522g(rk31VarM56811k11112, -0.5f);
                        yj5VarM56812l110.f273290d.m53522g(rk31VarM56811k11114, -0.5f);
                        yj5VarM56812l110.f273288b = -fCos5;
                        kl80Var2.m56803c(yj5VarM56812l110);
                    }
                    this.f238248l = false;
                    this.f238250m = false;
                }
                i17 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (this.f238220U[0] == u7jVar5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                c6jVar2 = this.f238216Q;
                z10 = !c6jVar2.m31574h();
                boolean z118 = zArr3[0];
                boolean z119 = zArr3[1];
                if (this.f238256p != 2) {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                } else {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                }
                if (z) {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.f238258q == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    if (this.f238201B == 1) {
                        float f12 = this.f238202C;
                        yj5 yj5VarM56812l111 = kl80Var2.m56812l();
                        yj5VarM56812l111.f273290d.m53522g(rk31Var6, -1.0f);
                        yj5VarM56812l111.f273290d.m53522g(rk31Var5, 1.0f);
                        yj5VarM56812l111.f273290d.m53522g(rk31Var4, f12);
                        yj5VarM56812l111.f273290d.m53522g(rk31Var3, -f12);
                        kl80Var2.m56803c(yj5VarM56812l111);
                    } else {
                        rk31 rk31Var13 = rk31Var5;
                        float f13 = this.f238202C;
                        yj5 yj5VarM56812l112 = kl80Var2.m56812l();
                        yj5VarM56812l112.f273290d.m53522g(rk31Var4, -1.0f);
                        yj5VarM56812l112.f273290d.m53522g(rk31Var3, 1.0f);
                        yj5VarM56812l112.f273290d.m53522g(rk31Var6, f13);
                        yj5VarM56812l112.f273290d.m53522g(rk31Var13, -f13);
                        kl80Var2.m56803c(yj5VarM56812l112);
                    }
                }
                if (c6jVar2.m31574h()) {
                    v7j v7jVar14 = c6jVar2.f34551f.f34549d;
                    float radians6 = (float) Math.toRadians(this.f238204E + 90.0f);
                    int iM31571e6 = c6jVar2.m31571e();
                    rk31 rk31VarM56811k111110 = kl80Var2.m56811k(mo55866k(2));
                    rk31 rk31VarM56811k111111 = kl80Var2.m56811k(mo55866k(3));
                    rk31 rk31VarM56811k111112 = kl80Var2.m56811k(mo55866k(4));
                    rk31 rk31VarM56811k111113 = kl80Var2.m56811k(mo55866k(5));
                    rk31 rk31VarM56811k111114 = kl80Var2.m56811k(v7jVar14.mo55866k(2));
                    rk31 rk31VarM56811k111115 = kl80Var2.m56811k(v7jVar14.mo55866k(3));
                    rk31 rk31VarM56811k111116 = kl80Var2.m56811k(v7jVar14.mo55866k(4));
                    rk31 rk31VarM56811k111117 = kl80Var2.m56811k(v7jVar14.mo55866k(5));
                    yj5 yj5VarM56812l113 = kl80Var2.m56812l();
                    double d11 = radians6;
                    double dSin6 = Math.sin(d11);
                    double d12 = iM31571e6;
                    yj5VarM56812l113.f273290d.m53522g(rk31VarM56811k111115, 0.5f);
                    yj5VarM56812l113.f273290d.m53522g(rk31VarM56811k111117, 0.5f);
                    yj5VarM56812l113.f273290d.m53522g(rk31VarM56811k111111, -0.5f);
                    yj5VarM56812l113.f273290d.m53522g(rk31VarM56811k111113, -0.5f);
                    yj5VarM56812l113.f273288b = -((float) (dSin6 * d12));
                    kl80Var2.m56803c(yj5VarM56812l113);
                    yj5 yj5VarM56812l114 = kl80Var2.m56812l();
                    float fCos6 = (float) (Math.cos(d11) * d12);
                    yj5VarM56812l114.f273290d.m53522g(rk31VarM56811k111114, 0.5f);
                    yj5VarM56812l114.f273290d.m53522g(rk31VarM56811k111116, 0.5f);
                    yj5VarM56812l114.f273290d.m53522g(rk31VarM56811k111110, -0.5f);
                    yj5VarM56812l114.f273290d.m53522g(rk31VarM56811k111112, -0.5f);
                    yj5VarM56812l114.f273288b = -fCos6;
                    kl80Var2.m56803c(yj5VarM56812l114);
                }
                this.f238248l = false;
                this.f238250m = false;
            }
            rk31Var = rk31VarM56811k4;
            rk31Var2 = rk31VarM56811k5;
            i15 = i13;
            i16 = i14;
            z7 = false;
            int[] iArr4 = this.f238266u;
            iArr4[0] = i15;
            iArr4[1] = i16;
            if (z7) {
                int i311 = this.f238201B;
                i17 = -1;
                if (i311 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (this.f238220U[0] == u7jVar5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                c6jVar2 = this.f238216Q;
                z10 = !c6jVar2.m31574h();
                boolean z1110 = zArr3[0];
                boolean z1111 = zArr3[1];
                if (this.f238256p != 2) {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                } else {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                }
                if (z) {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.f238258q == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    if (this.f238201B == 1) {
                        float f14 = this.f238202C;
                        yj5 yj5VarM56812l115 = kl80Var2.m56812l();
                        yj5VarM56812l115.f273290d.m53522g(rk31Var6, -1.0f);
                        yj5VarM56812l115.f273290d.m53522g(rk31Var5, 1.0f);
                        yj5VarM56812l115.f273290d.m53522g(rk31Var4, f14);
                        yj5VarM56812l115.f273290d.m53522g(rk31Var3, -f14);
                        kl80Var2.m56803c(yj5VarM56812l115);
                    } else {
                        rk31 rk31Var14 = rk31Var5;
                        float f15 = this.f238202C;
                        yj5 yj5VarM56812l116 = kl80Var2.m56812l();
                        yj5VarM56812l116.f273290d.m53522g(rk31Var4, -1.0f);
                        yj5VarM56812l116.f273290d.m53522g(rk31Var3, 1.0f);
                        yj5VarM56812l116.f273290d.m53522g(rk31Var6, f15);
                        yj5VarM56812l116.f273290d.m53522g(rk31Var14, -f15);
                        kl80Var2.m56803c(yj5VarM56812l116);
                    }
                }
                if (c6jVar2.m31574h()) {
                    v7j v7jVar15 = c6jVar2.f34551f.f34549d;
                    float radians7 = (float) Math.toRadians(this.f238204E + 90.0f);
                    int iM31571e7 = c6jVar2.m31571e();
                    rk31 rk31VarM56811k111118 = kl80Var2.m56811k(mo55866k(2));
                    rk31 rk31VarM56811k111119 = kl80Var2.m56811k(mo55866k(3));
                    rk31 rk31VarM56811k1111110 = kl80Var2.m56811k(mo55866k(4));
                    rk31 rk31VarM56811k1111111 = kl80Var2.m56811k(mo55866k(5));
                    rk31 rk31VarM56811k1111112 = kl80Var2.m56811k(v7jVar15.mo55866k(2));
                    rk31 rk31VarM56811k1111113 = kl80Var2.m56811k(v7jVar15.mo55866k(3));
                    rk31 rk31VarM56811k1111114 = kl80Var2.m56811k(v7jVar15.mo55866k(4));
                    rk31 rk31VarM56811k1111115 = kl80Var2.m56811k(v7jVar15.mo55866k(5));
                    yj5 yj5VarM56812l117 = kl80Var2.m56812l();
                    double d13 = radians7;
                    double dSin7 = Math.sin(d13);
                    double d14 = iM31571e7;
                    yj5VarM56812l117.f273290d.m53522g(rk31VarM56811k1111113, 0.5f);
                    yj5VarM56812l117.f273290d.m53522g(rk31VarM56811k1111115, 0.5f);
                    yj5VarM56812l117.f273290d.m53522g(rk31VarM56811k111119, -0.5f);
                    yj5VarM56812l117.f273290d.m53522g(rk31VarM56811k1111111, -0.5f);
                    yj5VarM56812l117.f273288b = -((float) (dSin7 * d14));
                    kl80Var2.m56803c(yj5VarM56812l117);
                    yj5 yj5VarM56812l118 = kl80Var2.m56812l();
                    float fCos7 = (float) (Math.cos(d13) * d14);
                    yj5VarM56812l118.f273290d.m53522g(rk31VarM56811k1111112, 0.5f);
                    yj5VarM56812l118.f273290d.m53522g(rk31VarM56811k1111114, 0.5f);
                    yj5VarM56812l118.f273290d.m53522g(rk31VarM56811k111118, -0.5f);
                    yj5VarM56812l118.f273290d.m53522g(rk31VarM56811k1111110, -0.5f);
                    yj5VarM56812l118.f273288b = -fCos7;
                    kl80Var2.m56803c(yj5VarM56812l118);
                }
                this.f238248l = false;
                this.f238250m = false;
            }
            i17 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.f238220U[0] == u7jVar5) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            c6jVar2 = this.f238216Q;
            z10 = !c6jVar2.m31574h();
            boolean z1112 = zArr3[0];
            boolean z1113 = zArr3[1];
            if (this.f238256p != 2) {
                rk31Var3 = rk31VarM56811k;
                rk31Var4 = rk31VarM56811k2;
                i18 = i15;
                r20 = r12;
                u7jVar4 = u7jVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            } else {
                rk31Var3 = rk31VarM56811k;
                rk31Var4 = rk31VarM56811k2;
                i18 = i15;
                r20 = r12;
                u7jVar4 = u7jVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            }
            if (z) {
                rk31Var5 = r33;
                rk31Var6 = rk31Var;
                rk31Var7 = rk31Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            } else {
                rk31Var5 = r33;
                rk31Var6 = rk31Var;
                rk31Var7 = rk31Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            }
            if (this.f238258q == 2) {
                i23 = i19;
            } else {
                i23 = i22;
            }
            if (i23 == 0) {
            }
            if (z7) {
                if (this.f238201B == 1) {
                    float f16 = this.f238202C;
                    yj5 yj5VarM56812l119 = kl80Var2.m56812l();
                    yj5VarM56812l119.f273290d.m53522g(rk31Var6, -1.0f);
                    yj5VarM56812l119.f273290d.m53522g(rk31Var5, 1.0f);
                    yj5VarM56812l119.f273290d.m53522g(rk31Var4, f16);
                    yj5VarM56812l119.f273290d.m53522g(rk31Var3, -f16);
                    kl80Var2.m56803c(yj5VarM56812l119);
                } else {
                    rk31 rk31Var15 = rk31Var5;
                    float f17 = this.f238202C;
                    yj5 yj5VarM56812l1110 = kl80Var2.m56812l();
                    yj5VarM56812l1110.f273290d.m53522g(rk31Var4, -1.0f);
                    yj5VarM56812l1110.f273290d.m53522g(rk31Var3, 1.0f);
                    yj5VarM56812l1110.f273290d.m53522g(rk31Var6, f17);
                    yj5VarM56812l1110.f273290d.m53522g(rk31Var15, -f17);
                    kl80Var2.m56803c(yj5VarM56812l1110);
                }
            }
            if (c6jVar2.m31574h()) {
                v7j v7jVar16 = c6jVar2.f34551f.f34549d;
                float radians8 = (float) Math.toRadians(this.f238204E + 90.0f);
                int iM31571e8 = c6jVar2.m31571e();
                rk31 rk31VarM56811k1111116 = kl80Var2.m56811k(mo55866k(2));
                rk31 rk31VarM56811k1111117 = kl80Var2.m56811k(mo55866k(3));
                rk31 rk31VarM56811k1111118 = kl80Var2.m56811k(mo55866k(4));
                rk31 rk31VarM56811k1111119 = kl80Var2.m56811k(mo55866k(5));
                rk31 rk31VarM56811k11111110 = kl80Var2.m56811k(v7jVar16.mo55866k(2));
                rk31 rk31VarM56811k11111111 = kl80Var2.m56811k(v7jVar16.mo55866k(3));
                rk31 rk31VarM56811k11111112 = kl80Var2.m56811k(v7jVar16.mo55866k(4));
                rk31 rk31VarM56811k11111113 = kl80Var2.m56811k(v7jVar16.mo55866k(5));
                yj5 yj5VarM56812l1111 = kl80Var2.m56812l();
                double d15 = radians8;
                double dSin8 = Math.sin(d15);
                double d16 = iM31571e8;
                yj5VarM56812l1111.f273290d.m53522g(rk31VarM56811k11111111, 0.5f);
                yj5VarM56812l1111.f273290d.m53522g(rk31VarM56811k11111113, 0.5f);
                yj5VarM56812l1111.f273290d.m53522g(rk31VarM56811k1111117, -0.5f);
                yj5VarM56812l1111.f273290d.m53522g(rk31VarM56811k1111119, -0.5f);
                yj5VarM56812l1111.f273288b = -((float) (dSin8 * d16));
                kl80Var2.m56803c(yj5VarM56812l1111);
                yj5 yj5VarM56812l1112 = kl80Var2.m56812l();
                float fCos8 = (float) (Math.cos(d15) * d16);
                yj5VarM56812l1112.f273290d.m53522g(rk31VarM56811k11111110, 0.5f);
                yj5VarM56812l1112.f273290d.m53522g(rk31VarM56811k11111112, 0.5f);
                yj5VarM56812l1112.f273290d.m53522g(rk31VarM56811k1111116, -0.5f);
                yj5VarM56812l1112.f273290d.m53522g(rk31VarM56811k1111118, -0.5f);
                yj5VarM56812l1112.f273288b = -fCos8;
                kl80Var2.m56803c(yj5VarM56812l1112);
            }
            this.f238248l = false;
            this.f238250m = false;
        }
        i = 1;
        i2 = 0;
        i3 = i2;
        i4 = i3;
        i5 = this.f238243i0;
        r19 = i3;
        boolean[] zArr4 = this.f238219T;
        if (i5 != 8) {
            i6 = i4;
        } else {
            i6 = i4;
        }
        z2 = this.f238248l;
        if (z2) {
            if (z2) {
                kl80Var2.m56804d(rk31VarM56811k, this.f238227a0);
                kl80Var2.m56804d(rk31VarM56811k2, this.f238227a0 + this.f238222W);
                if (i6 != 0) {
                    w7jVar2 = (w7j) v7jVar2;
                    weakReference3 = w7jVar2.f248703L0;
                    if (weakReference3 != null) {
                        w7jVar2.f248703L0 = new WeakReference(c6jVar3);
                    } else {
                        w7jVar2.f248703L0 = new WeakReference(c6jVar3);
                    }
                    weakReference4 = w7jVar2.f248705N0;
                    if (weakReference4 != null) {
                        w7jVar2.f248705N0 = new WeakReference(c6jVar4);
                    } else {
                        w7jVar2.f248705N0 = new WeakReference(c6jVar4);
                    }
                }
            }
            if (this.f238250m) {
                kl80Var2.m56804d(rk31VarM56811k3, this.f238229b0);
                kl80Var2.m56804d(rk31VarM56811k4, this.f238229b0 + this.f238223X);
                hashSet = c6jVar7.f34546a;
                if (hashSet != null) {
                    kl80Var2.m56804d(rk31VarM56811k5, this.f238229b0 + this.f238231c0);
                }
                if (r19 != 0) {
                    w7jVar = (w7j) v7jVar;
                    weakReference = w7jVar.f248702K0;
                    if (weakReference != null) {
                        w7jVar.f248702K0 = new WeakReference(c6jVar5);
                    } else {
                        w7jVar.f248702K0 = new WeakReference(c6jVar5);
                    }
                    weakReference2 = w7jVar.f248704M0;
                    if (weakReference2 != null) {
                        w7jVar.f248704M0 = new WeakReference(c6jVar6);
                    } else {
                        w7jVar.f248704M0 = new WeakReference(c6jVar6);
                    }
                }
            }
            if (this.f238248l) {
                ?? r14 = i2;
                this.f238248l = r14;
                this.f238250m = r14;
                return;
            }
        } else {
            if (z2) {
                kl80Var2.m56804d(rk31VarM56811k, this.f238227a0);
                kl80Var2.m56804d(rk31VarM56811k2, this.f238227a0 + this.f238222W);
                if (i6 != 0) {
                    w7jVar2 = (w7j) v7jVar2;
                    weakReference3 = w7jVar2.f248703L0;
                    if (weakReference3 != null) {
                        w7jVar2.f248703L0 = new WeakReference(c6jVar3);
                    } else {
                        w7jVar2.f248703L0 = new WeakReference(c6jVar3);
                    }
                    weakReference4 = w7jVar2.f248705N0;
                    if (weakReference4 != null) {
                        w7jVar2.f248705N0 = new WeakReference(c6jVar4);
                    } else {
                        w7jVar2.f248705N0 = new WeakReference(c6jVar4);
                    }
                }
            }
            if (this.f238250m) {
                kl80Var2.m56804d(rk31VarM56811k3, this.f238229b0);
                kl80Var2.m56804d(rk31VarM56811k4, this.f238229b0 + this.f238223X);
                hashSet = c6jVar7.f34546a;
                if (hashSet != null) {
                    kl80Var2.m56804d(rk31VarM56811k5, this.f238229b0 + this.f238231c0);
                }
                if (r19 != 0) {
                    w7jVar = (w7j) v7jVar;
                    weakReference = w7jVar.f248702K0;
                    if (weakReference != null) {
                        w7jVar.f248702K0 = new WeakReference(c6jVar5);
                    } else {
                        w7jVar.f248702K0 = new WeakReference(c6jVar5);
                    }
                    weakReference2 = w7jVar.f248704M0;
                    if (weakReference2 != null) {
                        w7jVar.f248704M0 = new WeakReference(c6jVar6);
                    } else {
                        w7jVar.f248704M0 = new WeakReference(c6jVar6);
                    }
                }
            }
            if (this.f238248l) {
                ?? r15 = i2;
                this.f238248l = r15;
                this.f238250m = r15;
                return;
            }
        }
        zArr = this.f238236f;
        if (z) {
            c6jVar = c6jVar7;
            zArr2 = zArr;
        } else {
            c6jVar = c6jVar7;
            zArr2 = zArr;
        }
        if (this.f238221V != null) {
            if (m84892y(0)) {
                ((w7j) this.f238221V).m87391X(this, 0);
                int i312 = i;
                i26 = i312 == true ? 1 : 0;
                M84893z = i312;
            } else {
                i26 = i;
                M84893z = m84893z();
            }
            if (m84892y(i26)) {
                ((w7j) this.f238221V).m87391X(this, i26);
                zM84857A = true;
            } else {
                zM84857A = m84857A();
            }
            if (M84893z != 0) {
            }
            if (!zM84857A) {
                kl80Var2.m56806f(kl80Var2.m56811k(this.f238221V.f238212M), rk31VarM56811k4, 0, 1);
            }
            z3 = zM84857A;
            r12 = M84893z;
        } else {
            c6jVar3 = c6jVar3;
            z3 = false;
            r12 = 0;
        }
        i7 = this.f238222W;
        i8 = this.f238233d0;
        if (i7 >= i8) {
            i8 = i7;
        }
        i9 = this.f238223X;
        z4 = z3;
        i10 = this.f238235e0;
        if (i9 < i10) {
            i11 = i10;
        } else {
            i11 = i9;
        }
        u7j[] u7jVarArr5 = this.f238220U;
        u7jVar = u7jVarArr5[0];
        u7jVar2 = u7j.f227712c;
        if (u7jVar != u7jVar2) {
            z5 = true;
        } else {
            z5 = false;
        }
        u7jVar3 = u7jVarArr5[1];
        if (u7jVar3 != u7jVar2) {
            z6 = true;
        } else {
            z6 = false;
        }
        i12 = this.f238225Z;
        this.f238201B = i12;
        f = this.f238224Y;
        this.f238202C = f;
        i13 = this.f238262s;
        i14 = this.f238264t;
        if (f > 0.0f) {
            rk31Var = rk31VarM56811k4;
            if (this.f238243i0 != 8) {
                if (u7jVar == u7jVar2) {
                    i15 = i13;
                } else {
                    i15 = i13;
                }
                if (u7jVar3 == u7jVar2) {
                    i25 = i14;
                } else {
                    i25 = i14;
                }
                if (u7jVar != u7jVar2) {
                    rk31Var2 = rk31VarM56811k5;
                    if (u7jVar == u7jVar2) {
                    }
                    if (u7jVar3 == u7jVar2) {
                        if (i25 == 3) {
                            this.f238201B = 1;
                            if (i12 == -1) {
                                this.f238202C = 1.0f / f;
                            }
                            i11 = (int) (this.f238202C * i7);
                            if (u7jVar != u7jVar2) {
                                i16 = 4;
                            }
                        }
                    }
                    i6 = i6;
                    z7 = true;
                    i16 = i25;
                    int[] iArr5 = this.f238266u;
                    iArr5[0] = i15;
                    iArr5[1] = i16;
                    if (z7) {
                        int i313 = this.f238201B;
                        i17 = -1;
                        if (i313 != 0) {
                        }
                        if (z7) {
                            z8 = false;
                        } else {
                            z8 = false;
                        }
                        if (this.f238220U[0] == u7jVar5) {
                            z9 = false;
                        } else {
                            z9 = false;
                        }
                        if (z9) {
                            i8 = 0;
                        }
                        c6jVar2 = this.f238216Q;
                        z10 = !c6jVar2.m31574h();
                        boolean z1114 = zArr4[0];
                        boolean z1115 = zArr4[1];
                        if (this.f238256p != 2) {
                            rk31Var3 = rk31VarM56811k;
                            rk31Var4 = rk31VarM56811k2;
                            i18 = i15;
                            r20 = r12;
                            u7jVar4 = u7jVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        } else {
                            rk31Var3 = rk31VarM56811k;
                            rk31Var4 = rk31VarM56811k2;
                            i18 = i15;
                            r20 = r12;
                            u7jVar4 = u7jVar5;
                            z11 = z4;
                            r3 = i6;
                            z12 = z10;
                            r110 = r19;
                        }
                        if (z) {
                            rk31Var5 = r33;
                            rk31Var6 = rk31Var;
                            rk31Var7 = rk31Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        } else {
                            rk31Var5 = r33;
                            rk31Var6 = rk31Var;
                            rk31Var7 = rk31Var2;
                            i19 = 0;
                            i20 = 8;
                            i21 = 1;
                            i22 = 1;
                        }
                        if (this.f238258q == 2) {
                            i23 = i19;
                        } else {
                            i23 = i22;
                        }
                        if (i23 == 0) {
                        }
                        if (z7) {
                            if (this.f238201B == 1) {
                                float f18 = this.f238202C;
                                yj5 yj5VarM56812l1113 = kl80Var2.m56812l();
                                yj5VarM56812l1113.f273290d.m53522g(rk31Var6, -1.0f);
                                yj5VarM56812l1113.f273290d.m53522g(rk31Var5, 1.0f);
                                yj5VarM56812l1113.f273290d.m53522g(rk31Var4, f18);
                                yj5VarM56812l1113.f273290d.m53522g(rk31Var3, -f18);
                                kl80Var2.m56803c(yj5VarM56812l1113);
                            } else {
                                rk31 rk31Var16 = rk31Var5;
                                float f19 = this.f238202C;
                                yj5 yj5VarM56812l1114 = kl80Var2.m56812l();
                                yj5VarM56812l1114.f273290d.m53522g(rk31Var4, -1.0f);
                                yj5VarM56812l1114.f273290d.m53522g(rk31Var3, 1.0f);
                                yj5VarM56812l1114.f273290d.m53522g(rk31Var6, f19);
                                yj5VarM56812l1114.f273290d.m53522g(rk31Var16, -f19);
                                kl80Var2.m56803c(yj5VarM56812l1114);
                            }
                        }
                        if (c6jVar2.m31574h()) {
                            v7j v7jVar17 = c6jVar2.f34551f.f34549d;
                            float radians9 = (float) Math.toRadians(this.f238204E + 90.0f);
                            int iM31571e9 = c6jVar2.m31571e();
                            rk31 rk31VarM56811k11111114 = kl80Var2.m56811k(mo55866k(2));
                            rk31 rk31VarM56811k11111115 = kl80Var2.m56811k(mo55866k(3));
                            rk31 rk31VarM56811k11111116 = kl80Var2.m56811k(mo55866k(4));
                            rk31 rk31VarM56811k11111117 = kl80Var2.m56811k(mo55866k(5));
                            rk31 rk31VarM56811k11111118 = kl80Var2.m56811k(v7jVar17.mo55866k(2));
                            rk31 rk31VarM56811k11111119 = kl80Var2.m56811k(v7jVar17.mo55866k(3));
                            rk31 rk31VarM56811k111111110 = kl80Var2.m56811k(v7jVar17.mo55866k(4));
                            rk31 rk31VarM56811k111111111 = kl80Var2.m56811k(v7jVar17.mo55866k(5));
                            yj5 yj5VarM56812l1115 = kl80Var2.m56812l();
                            double d17 = radians9;
                            double dSin9 = Math.sin(d17);
                            double d18 = iM31571e9;
                            yj5VarM56812l1115.f273290d.m53522g(rk31VarM56811k11111119, 0.5f);
                            yj5VarM56812l1115.f273290d.m53522g(rk31VarM56811k111111111, 0.5f);
                            yj5VarM56812l1115.f273290d.m53522g(rk31VarM56811k11111115, -0.5f);
                            yj5VarM56812l1115.f273290d.m53522g(rk31VarM56811k11111117, -0.5f);
                            yj5VarM56812l1115.f273288b = -((float) (dSin9 * d18));
                            kl80Var2.m56803c(yj5VarM56812l1115);
                            yj5 yj5VarM56812l1116 = kl80Var2.m56812l();
                            float fCos9 = (float) (Math.cos(d17) * d18);
                            yj5VarM56812l1116.f273290d.m53522g(rk31VarM56811k11111118, 0.5f);
                            yj5VarM56812l1116.f273290d.m53522g(rk31VarM56811k111111110, 0.5f);
                            yj5VarM56812l1116.f273290d.m53522g(rk31VarM56811k11111114, -0.5f);
                            yj5VarM56812l1116.f273290d.m53522g(rk31VarM56811k11111116, -0.5f);
                            yj5VarM56812l1116.f273288b = -fCos9;
                            kl80Var2.m56803c(yj5VarM56812l1116);
                        }
                        this.f238248l = false;
                        this.f238250m = false;
                    }
                    i17 = -1;
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (this.f238220U[0] == u7jVar5) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    c6jVar2 = this.f238216Q;
                    z10 = !c6jVar2.m31574h();
                    boolean z1116 = zArr4[0];
                    boolean z1117 = zArr4[1];
                    if (this.f238256p != 2) {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    } else {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    }
                    if (z) {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.f238258q == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        if (this.f238201B == 1) {
                            float f110 = this.f238202C;
                            yj5 yj5VarM56812l1117 = kl80Var2.m56812l();
                            yj5VarM56812l1117.f273290d.m53522g(rk31Var6, -1.0f);
                            yj5VarM56812l1117.f273290d.m53522g(rk31Var5, 1.0f);
                            yj5VarM56812l1117.f273290d.m53522g(rk31Var4, f110);
                            yj5VarM56812l1117.f273290d.m53522g(rk31Var3, -f110);
                            kl80Var2.m56803c(yj5VarM56812l1117);
                        } else {
                            rk31 rk31Var17 = rk31Var5;
                            float f111 = this.f238202C;
                            yj5 yj5VarM56812l1118 = kl80Var2.m56812l();
                            yj5VarM56812l1118.f273290d.m53522g(rk31Var4, -1.0f);
                            yj5VarM56812l1118.f273290d.m53522g(rk31Var3, 1.0f);
                            yj5VarM56812l1118.f273290d.m53522g(rk31Var6, f111);
                            yj5VarM56812l1118.f273290d.m53522g(rk31Var17, -f111);
                            kl80Var2.m56803c(yj5VarM56812l1118);
                        }
                    }
                    if (c6jVar2.m31574h()) {
                        v7j v7jVar18 = c6jVar2.f34551f.f34549d;
                        float radians10 = (float) Math.toRadians(this.f238204E + 90.0f);
                        int iM31571e10 = c6jVar2.m31571e();
                        rk31 rk31VarM56811k111111112 = kl80Var2.m56811k(mo55866k(2));
                        rk31 rk31VarM56811k111111113 = kl80Var2.m56811k(mo55866k(3));
                        rk31 rk31VarM56811k111111114 = kl80Var2.m56811k(mo55866k(4));
                        rk31 rk31VarM56811k111111115 = kl80Var2.m56811k(mo55866k(5));
                        rk31 rk31VarM56811k111111116 = kl80Var2.m56811k(v7jVar18.mo55866k(2));
                        rk31 rk31VarM56811k111111117 = kl80Var2.m56811k(v7jVar18.mo55866k(3));
                        rk31 rk31VarM56811k111111118 = kl80Var2.m56811k(v7jVar18.mo55866k(4));
                        rk31 rk31VarM56811k111111119 = kl80Var2.m56811k(v7jVar18.mo55866k(5));
                        yj5 yj5VarM56812l1119 = kl80Var2.m56812l();
                        double d19 = radians10;
                        double dSin10 = Math.sin(d19);
                        double d110 = iM31571e10;
                        yj5VarM56812l1119.f273290d.m53522g(rk31VarM56811k111111117, 0.5f);
                        yj5VarM56812l1119.f273290d.m53522g(rk31VarM56811k111111119, 0.5f);
                        yj5VarM56812l1119.f273290d.m53522g(rk31VarM56811k111111113, -0.5f);
                        yj5VarM56812l1119.f273290d.m53522g(rk31VarM56811k111111115, -0.5f);
                        yj5VarM56812l1119.f273288b = -((float) (dSin10 * d110));
                        kl80Var2.m56803c(yj5VarM56812l1119);
                        yj5 yj5VarM56812l11110 = kl80Var2.m56812l();
                        float fCos10 = (float) (Math.cos(d19) * d110);
                        yj5VarM56812l11110.f273290d.m53522g(rk31VarM56811k111111116, 0.5f);
                        yj5VarM56812l11110.f273290d.m53522g(rk31VarM56811k111111118, 0.5f);
                        yj5VarM56812l11110.f273290d.m53522g(rk31VarM56811k111111112, -0.5f);
                        yj5VarM56812l11110.f273290d.m53522g(rk31VarM56811k111111114, -0.5f);
                        yj5VarM56812l11110.f273288b = -fCos10;
                        kl80Var2.m56803c(yj5VarM56812l11110);
                    }
                    this.f238248l = false;
                    this.f238250m = false;
                }
                rk31Var2 = rk31VarM56811k5;
                if (u7jVar == u7jVar2) {
                }
                if (u7jVar3 == u7jVar2) {
                    if (i25 == 3) {
                        this.f238201B = 1;
                        if (i12 == -1) {
                            this.f238202C = 1.0f / f;
                        }
                        i11 = (int) (this.f238202C * i7);
                        if (u7jVar != u7jVar2) {
                            i16 = 4;
                        }
                    }
                }
                i6 = i6;
                z7 = true;
                i16 = i25;
                int[] iArr6 = this.f238266u;
                iArr6[0] = i15;
                iArr6[1] = i16;
                if (z7) {
                    int i314 = this.f238201B;
                    i17 = -1;
                    if (i314 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (this.f238220U[0] == u7jVar5) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    c6jVar2 = this.f238216Q;
                    z10 = !c6jVar2.m31574h();
                    boolean z1118 = zArr4[0];
                    boolean z1119 = zArr4[1];
                    if (this.f238256p != 2) {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    } else {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    }
                    if (z) {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.f238258q == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        if (this.f238201B == 1) {
                            float f112 = this.f238202C;
                            yj5 yj5VarM56812l11111 = kl80Var2.m56812l();
                            yj5VarM56812l11111.f273290d.m53522g(rk31Var6, -1.0f);
                            yj5VarM56812l11111.f273290d.m53522g(rk31Var5, 1.0f);
                            yj5VarM56812l11111.f273290d.m53522g(rk31Var4, f112);
                            yj5VarM56812l11111.f273290d.m53522g(rk31Var3, -f112);
                            kl80Var2.m56803c(yj5VarM56812l11111);
                        } else {
                            rk31 rk31Var18 = rk31Var5;
                            float f113 = this.f238202C;
                            yj5 yj5VarM56812l11112 = kl80Var2.m56812l();
                            yj5VarM56812l11112.f273290d.m53522g(rk31Var4, -1.0f);
                            yj5VarM56812l11112.f273290d.m53522g(rk31Var3, 1.0f);
                            yj5VarM56812l11112.f273290d.m53522g(rk31Var6, f113);
                            yj5VarM56812l11112.f273290d.m53522g(rk31Var18, -f113);
                            kl80Var2.m56803c(yj5VarM56812l11112);
                        }
                    }
                    if (c6jVar2.m31574h()) {
                        v7j v7jVar19 = c6jVar2.f34551f.f34549d;
                        float radians11 = (float) Math.toRadians(this.f238204E + 90.0f);
                        int iM31571e11 = c6jVar2.m31571e();
                        rk31 rk31VarM56811k1111111110 = kl80Var2.m56811k(mo55866k(2));
                        rk31 rk31VarM56811k1111111111 = kl80Var2.m56811k(mo55866k(3));
                        rk31 rk31VarM56811k1111111112 = kl80Var2.m56811k(mo55866k(4));
                        rk31 rk31VarM56811k1111111113 = kl80Var2.m56811k(mo55866k(5));
                        rk31 rk31VarM56811k1111111114 = kl80Var2.m56811k(v7jVar19.mo55866k(2));
                        rk31 rk31VarM56811k1111111115 = kl80Var2.m56811k(v7jVar19.mo55866k(3));
                        rk31 rk31VarM56811k1111111116 = kl80Var2.m56811k(v7jVar19.mo55866k(4));
                        rk31 rk31VarM56811k1111111117 = kl80Var2.m56811k(v7jVar19.mo55866k(5));
                        yj5 yj5VarM56812l11113 = kl80Var2.m56812l();
                        double d111 = radians11;
                        double dSin11 = Math.sin(d111);
                        double d112 = iM31571e11;
                        yj5VarM56812l11113.f273290d.m53522g(rk31VarM56811k1111111115, 0.5f);
                        yj5VarM56812l11113.f273290d.m53522g(rk31VarM56811k1111111117, 0.5f);
                        yj5VarM56812l11113.f273290d.m53522g(rk31VarM56811k1111111111, -0.5f);
                        yj5VarM56812l11113.f273290d.m53522g(rk31VarM56811k1111111113, -0.5f);
                        yj5VarM56812l11113.f273288b = -((float) (dSin11 * d112));
                        kl80Var2.m56803c(yj5VarM56812l11113);
                        yj5 yj5VarM56812l11114 = kl80Var2.m56812l();
                        float fCos11 = (float) (Math.cos(d111) * d112);
                        yj5VarM56812l11114.f273290d.m53522g(rk31VarM56811k1111111114, 0.5f);
                        yj5VarM56812l11114.f273290d.m53522g(rk31VarM56811k1111111116, 0.5f);
                        yj5VarM56812l11114.f273290d.m53522g(rk31VarM56811k1111111110, -0.5f);
                        yj5VarM56812l11114.f273290d.m53522g(rk31VarM56811k1111111112, -0.5f);
                        yj5VarM56812l11114.f273288b = -fCos11;
                        kl80Var2.m56803c(yj5VarM56812l11114);
                    }
                    this.f238248l = false;
                    this.f238250m = false;
                }
                i17 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (this.f238220U[0] == u7jVar5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                c6jVar2 = this.f238216Q;
                z10 = !c6jVar2.m31574h();
                boolean z11110 = zArr4[0];
                boolean z11111 = zArr4[1];
                if (this.f238256p != 2) {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                } else {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                }
                if (z) {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.f238258q == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    if (this.f238201B == 1) {
                        float f114 = this.f238202C;
                        yj5 yj5VarM56812l11115 = kl80Var2.m56812l();
                        yj5VarM56812l11115.f273290d.m53522g(rk31Var6, -1.0f);
                        yj5VarM56812l11115.f273290d.m53522g(rk31Var5, 1.0f);
                        yj5VarM56812l11115.f273290d.m53522g(rk31Var4, f114);
                        yj5VarM56812l11115.f273290d.m53522g(rk31Var3, -f114);
                        kl80Var2.m56803c(yj5VarM56812l11115);
                    } else {
                        rk31 rk31Var19 = rk31Var5;
                        float f115 = this.f238202C;
                        yj5 yj5VarM56812l11116 = kl80Var2.m56812l();
                        yj5VarM56812l11116.f273290d.m53522g(rk31Var4, -1.0f);
                        yj5VarM56812l11116.f273290d.m53522g(rk31Var3, 1.0f);
                        yj5VarM56812l11116.f273290d.m53522g(rk31Var6, f115);
                        yj5VarM56812l11116.f273290d.m53522g(rk31Var19, -f115);
                        kl80Var2.m56803c(yj5VarM56812l11116);
                    }
                }
                if (c6jVar2.m31574h()) {
                    v7j v7jVar110 = c6jVar2.f34551f.f34549d;
                    float radians12 = (float) Math.toRadians(this.f238204E + 90.0f);
                    int iM31571e12 = c6jVar2.m31571e();
                    rk31 rk31VarM56811k1111111118 = kl80Var2.m56811k(mo55866k(2));
                    rk31 rk31VarM56811k1111111119 = kl80Var2.m56811k(mo55866k(3));
                    rk31 rk31VarM56811k11111111110 = kl80Var2.m56811k(mo55866k(4));
                    rk31 rk31VarM56811k11111111111 = kl80Var2.m56811k(mo55866k(5));
                    rk31 rk31VarM56811k11111111112 = kl80Var2.m56811k(v7jVar110.mo55866k(2));
                    rk31 rk31VarM56811k11111111113 = kl80Var2.m56811k(v7jVar110.mo55866k(3));
                    rk31 rk31VarM56811k11111111114 = kl80Var2.m56811k(v7jVar110.mo55866k(4));
                    rk31 rk31VarM56811k11111111115 = kl80Var2.m56811k(v7jVar110.mo55866k(5));
                    yj5 yj5VarM56812l11117 = kl80Var2.m56812l();
                    double d113 = radians12;
                    double dSin12 = Math.sin(d113);
                    double d114 = iM31571e12;
                    yj5VarM56812l11117.f273290d.m53522g(rk31VarM56811k11111111113, 0.5f);
                    yj5VarM56812l11117.f273290d.m53522g(rk31VarM56811k11111111115, 0.5f);
                    yj5VarM56812l11117.f273290d.m53522g(rk31VarM56811k1111111119, -0.5f);
                    yj5VarM56812l11117.f273290d.m53522g(rk31VarM56811k11111111111, -0.5f);
                    yj5VarM56812l11117.f273288b = -((float) (dSin12 * d114));
                    kl80Var2.m56803c(yj5VarM56812l11117);
                    yj5 yj5VarM56812l11118 = kl80Var2.m56812l();
                    float fCos12 = (float) (Math.cos(d113) * d114);
                    yj5VarM56812l11118.f273290d.m53522g(rk31VarM56811k11111111112, 0.5f);
                    yj5VarM56812l11118.f273290d.m53522g(rk31VarM56811k11111111114, 0.5f);
                    yj5VarM56812l11118.f273290d.m53522g(rk31VarM56811k1111111118, -0.5f);
                    yj5VarM56812l11118.f273290d.m53522g(rk31VarM56811k11111111110, -0.5f);
                    yj5VarM56812l11118.f273288b = -fCos12;
                    kl80Var2.m56803c(yj5VarM56812l11118);
                }
                this.f238248l = false;
                this.f238250m = false;
                i6 = i6;
                z7 = true;
                i16 = i25;
                int[] iArr7 = this.f238266u;
                iArr7[0] = i15;
                iArr7[1] = i16;
                if (z7) {
                    int i315 = this.f238201B;
                    i17 = -1;
                    if (i315 != 0) {
                    }
                    if (z7) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    if (this.f238220U[0] == u7jVar5) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (z9) {
                        i8 = 0;
                    }
                    c6jVar2 = this.f238216Q;
                    z10 = !c6jVar2.m31574h();
                    boolean z11112 = zArr4[0];
                    boolean z11113 = zArr4[1];
                    if (this.f238256p != 2) {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    } else {
                        rk31Var3 = rk31VarM56811k;
                        rk31Var4 = rk31VarM56811k2;
                        i18 = i15;
                        r20 = r12;
                        u7jVar4 = u7jVar5;
                        z11 = z4;
                        r3 = i6;
                        z12 = z10;
                        r110 = r19;
                    }
                    if (z) {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    } else {
                        rk31Var5 = r33;
                        rk31Var6 = rk31Var;
                        rk31Var7 = rk31Var2;
                        i19 = 0;
                        i20 = 8;
                        i21 = 1;
                        i22 = 1;
                    }
                    if (this.f238258q == 2) {
                        i23 = i19;
                    } else {
                        i23 = i22;
                    }
                    if (i23 == 0) {
                    }
                    if (z7) {
                        if (this.f238201B == 1) {
                            float f116 = this.f238202C;
                            yj5 yj5VarM56812l11119 = kl80Var2.m56812l();
                            yj5VarM56812l11119.f273290d.m53522g(rk31Var6, -1.0f);
                            yj5VarM56812l11119.f273290d.m53522g(rk31Var5, 1.0f);
                            yj5VarM56812l11119.f273290d.m53522g(rk31Var4, f116);
                            yj5VarM56812l11119.f273290d.m53522g(rk31Var3, -f116);
                            kl80Var2.m56803c(yj5VarM56812l11119);
                        } else {
                            rk31 rk31Var110 = rk31Var5;
                            float f117 = this.f238202C;
                            yj5 yj5VarM56812l111110 = kl80Var2.m56812l();
                            yj5VarM56812l111110.f273290d.m53522g(rk31Var4, -1.0f);
                            yj5VarM56812l111110.f273290d.m53522g(rk31Var3, 1.0f);
                            yj5VarM56812l111110.f273290d.m53522g(rk31Var6, f117);
                            yj5VarM56812l111110.f273290d.m53522g(rk31Var110, -f117);
                            kl80Var2.m56803c(yj5VarM56812l111110);
                        }
                    }
                    if (c6jVar2.m31574h()) {
                        v7j v7jVar111 = c6jVar2.f34551f.f34549d;
                        float radians13 = (float) Math.toRadians(this.f238204E + 90.0f);
                        int iM31571e13 = c6jVar2.m31571e();
                        rk31 rk31VarM56811k11111111116 = kl80Var2.m56811k(mo55866k(2));
                        rk31 rk31VarM56811k11111111117 = kl80Var2.m56811k(mo55866k(3));
                        rk31 rk31VarM56811k11111111118 = kl80Var2.m56811k(mo55866k(4));
                        rk31 rk31VarM56811k11111111119 = kl80Var2.m56811k(mo55866k(5));
                        rk31 rk31VarM56811k111111111110 = kl80Var2.m56811k(v7jVar111.mo55866k(2));
                        rk31 rk31VarM56811k111111111111 = kl80Var2.m56811k(v7jVar111.mo55866k(3));
                        rk31 rk31VarM56811k111111111112 = kl80Var2.m56811k(v7jVar111.mo55866k(4));
                        rk31 rk31VarM56811k111111111113 = kl80Var2.m56811k(v7jVar111.mo55866k(5));
                        yj5 yj5VarM56812l111111 = kl80Var2.m56812l();
                        double d115 = radians13;
                        double dSin13 = Math.sin(d115);
                        double d116 = iM31571e13;
                        yj5VarM56812l111111.f273290d.m53522g(rk31VarM56811k111111111111, 0.5f);
                        yj5VarM56812l111111.f273290d.m53522g(rk31VarM56811k111111111113, 0.5f);
                        yj5VarM56812l111111.f273290d.m53522g(rk31VarM56811k11111111117, -0.5f);
                        yj5VarM56812l111111.f273290d.m53522g(rk31VarM56811k11111111119, -0.5f);
                        yj5VarM56812l111111.f273288b = -((float) (dSin13 * d116));
                        kl80Var2.m56803c(yj5VarM56812l111111);
                        yj5 yj5VarM56812l111112 = kl80Var2.m56812l();
                        float fCos13 = (float) (Math.cos(d115) * d116);
                        yj5VarM56812l111112.f273290d.m53522g(rk31VarM56811k111111111110, 0.5f);
                        yj5VarM56812l111112.f273290d.m53522g(rk31VarM56811k111111111112, 0.5f);
                        yj5VarM56812l111112.f273290d.m53522g(rk31VarM56811k11111111116, -0.5f);
                        yj5VarM56812l111112.f273290d.m53522g(rk31VarM56811k11111111118, -0.5f);
                        yj5VarM56812l111112.f273288b = -fCos13;
                        kl80Var2.m56803c(yj5VarM56812l111112);
                    }
                    this.f238248l = false;
                    this.f238250m = false;
                }
                i17 = -1;
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (this.f238220U[0] == u7jVar5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                c6jVar2 = this.f238216Q;
                z10 = !c6jVar2.m31574h();
                boolean z11114 = zArr4[0];
                boolean z11115 = zArr4[1];
                if (this.f238256p != 2) {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                } else {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                }
                if (z) {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.f238258q == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    if (this.f238201B == 1) {
                        float f118 = this.f238202C;
                        yj5 yj5VarM56812l111113 = kl80Var2.m56812l();
                        yj5VarM56812l111113.f273290d.m53522g(rk31Var6, -1.0f);
                        yj5VarM56812l111113.f273290d.m53522g(rk31Var5, 1.0f);
                        yj5VarM56812l111113.f273290d.m53522g(rk31Var4, f118);
                        yj5VarM56812l111113.f273290d.m53522g(rk31Var3, -f118);
                        kl80Var2.m56803c(yj5VarM56812l111113);
                    } else {
                        rk31 rk31Var111 = rk31Var5;
                        float f119 = this.f238202C;
                        yj5 yj5VarM56812l111114 = kl80Var2.m56812l();
                        yj5VarM56812l111114.f273290d.m53522g(rk31Var4, -1.0f);
                        yj5VarM56812l111114.f273290d.m53522g(rk31Var3, 1.0f);
                        yj5VarM56812l111114.f273290d.m53522g(rk31Var6, f119);
                        yj5VarM56812l111114.f273290d.m53522g(rk31Var111, -f119);
                        kl80Var2.m56803c(yj5VarM56812l111114);
                    }
                }
                if (c6jVar2.m31574h()) {
                    v7j v7jVar112 = c6jVar2.f34551f.f34549d;
                    float radians14 = (float) Math.toRadians(this.f238204E + 90.0f);
                    int iM31571e14 = c6jVar2.m31571e();
                    rk31 rk31VarM56811k111111111114 = kl80Var2.m56811k(mo55866k(2));
                    rk31 rk31VarM56811k111111111115 = kl80Var2.m56811k(mo55866k(3));
                    rk31 rk31VarM56811k111111111116 = kl80Var2.m56811k(mo55866k(4));
                    rk31 rk31VarM56811k111111111117 = kl80Var2.m56811k(mo55866k(5));
                    rk31 rk31VarM56811k111111111118 = kl80Var2.m56811k(v7jVar112.mo55866k(2));
                    rk31 rk31VarM56811k111111111119 = kl80Var2.m56811k(v7jVar112.mo55866k(3));
                    rk31 rk31VarM56811k1111111111110 = kl80Var2.m56811k(v7jVar112.mo55866k(4));
                    rk31 rk31VarM56811k1111111111111 = kl80Var2.m56811k(v7jVar112.mo55866k(5));
                    yj5 yj5VarM56812l111115 = kl80Var2.m56812l();
                    double d117 = radians14;
                    double dSin14 = Math.sin(d117);
                    double d118 = iM31571e14;
                    yj5VarM56812l111115.f273290d.m53522g(rk31VarM56811k111111111119, 0.5f);
                    yj5VarM56812l111115.f273290d.m53522g(rk31VarM56811k1111111111111, 0.5f);
                    yj5VarM56812l111115.f273290d.m53522g(rk31VarM56811k111111111115, -0.5f);
                    yj5VarM56812l111115.f273290d.m53522g(rk31VarM56811k111111111117, -0.5f);
                    yj5VarM56812l111115.f273288b = -((float) (dSin14 * d118));
                    kl80Var2.m56803c(yj5VarM56812l111115);
                    yj5 yj5VarM56812l111116 = kl80Var2.m56812l();
                    float fCos14 = (float) (Math.cos(d117) * d118);
                    yj5VarM56812l111116.f273290d.m53522g(rk31VarM56811k111111111118, 0.5f);
                    yj5VarM56812l111116.f273290d.m53522g(rk31VarM56811k1111111111110, 0.5f);
                    yj5VarM56812l111116.f273290d.m53522g(rk31VarM56811k111111111114, -0.5f);
                    yj5VarM56812l111116.f273290d.m53522g(rk31VarM56811k111111111116, -0.5f);
                    yj5VarM56812l111116.f273288b = -fCos14;
                    kl80Var2.m56803c(yj5VarM56812l111116);
                }
                this.f238248l = false;
                this.f238250m = false;
            }
            z7 = false;
            int[] iArr8 = this.f238266u;
            iArr8[0] = i15;
            iArr8[1] = i16;
            if (z7) {
                int i316 = this.f238201B;
                i17 = -1;
                if (i316 != 0) {
                }
                if (z7) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                if (this.f238220U[0] == u7jVar5) {
                    z9 = false;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i8 = 0;
                }
                c6jVar2 = this.f238216Q;
                z10 = !c6jVar2.m31574h();
                boolean z11116 = zArr4[0];
                boolean z11117 = zArr4[1];
                if (this.f238256p != 2) {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                } else {
                    rk31Var3 = rk31VarM56811k;
                    rk31Var4 = rk31VarM56811k2;
                    i18 = i15;
                    r20 = r12;
                    u7jVar4 = u7jVar5;
                    z11 = z4;
                    r3 = i6;
                    z12 = z10;
                    r110 = r19;
                }
                if (z) {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                } else {
                    rk31Var5 = r33;
                    rk31Var6 = rk31Var;
                    rk31Var7 = rk31Var2;
                    i19 = 0;
                    i20 = 8;
                    i21 = 1;
                    i22 = 1;
                }
                if (this.f238258q == 2) {
                    i23 = i19;
                } else {
                    i23 = i22;
                }
                if (i23 == 0) {
                }
                if (z7) {
                    if (this.f238201B == 1) {
                        float f1110 = this.f238202C;
                        yj5 yj5VarM56812l111117 = kl80Var2.m56812l();
                        yj5VarM56812l111117.f273290d.m53522g(rk31Var6, -1.0f);
                        yj5VarM56812l111117.f273290d.m53522g(rk31Var5, 1.0f);
                        yj5VarM56812l111117.f273290d.m53522g(rk31Var4, f1110);
                        yj5VarM56812l111117.f273290d.m53522g(rk31Var3, -f1110);
                        kl80Var2.m56803c(yj5VarM56812l111117);
                    } else {
                        rk31 rk31Var112 = rk31Var5;
                        float f1111 = this.f238202C;
                        yj5 yj5VarM56812l111118 = kl80Var2.m56812l();
                        yj5VarM56812l111118.f273290d.m53522g(rk31Var4, -1.0f);
                        yj5VarM56812l111118.f273290d.m53522g(rk31Var3, 1.0f);
                        yj5VarM56812l111118.f273290d.m53522g(rk31Var6, f1111);
                        yj5VarM56812l111118.f273290d.m53522g(rk31Var112, -f1111);
                        kl80Var2.m56803c(yj5VarM56812l111118);
                    }
                }
                if (c6jVar2.m31574h()) {
                    v7j v7jVar113 = c6jVar2.f34551f.f34549d;
                    float radians15 = (float) Math.toRadians(this.f238204E + 90.0f);
                    int iM31571e15 = c6jVar2.m31571e();
                    rk31 rk31VarM56811k1111111111112 = kl80Var2.m56811k(mo55866k(2));
                    rk31 rk31VarM56811k1111111111113 = kl80Var2.m56811k(mo55866k(3));
                    rk31 rk31VarM56811k1111111111114 = kl80Var2.m56811k(mo55866k(4));
                    rk31 rk31VarM56811k1111111111115 = kl80Var2.m56811k(mo55866k(5));
                    rk31 rk31VarM56811k1111111111116 = kl80Var2.m56811k(v7jVar113.mo55866k(2));
                    rk31 rk31VarM56811k1111111111117 = kl80Var2.m56811k(v7jVar113.mo55866k(3));
                    rk31 rk31VarM56811k1111111111118 = kl80Var2.m56811k(v7jVar113.mo55866k(4));
                    rk31 rk31VarM56811k1111111111119 = kl80Var2.m56811k(v7jVar113.mo55866k(5));
                    yj5 yj5VarM56812l111119 = kl80Var2.m56812l();
                    double d119 = radians15;
                    double dSin15 = Math.sin(d119);
                    double d1110 = iM31571e15;
                    yj5VarM56812l111119.f273290d.m53522g(rk31VarM56811k1111111111117, 0.5f);
                    yj5VarM56812l111119.f273290d.m53522g(rk31VarM56811k1111111111119, 0.5f);
                    yj5VarM56812l111119.f273290d.m53522g(rk31VarM56811k1111111111113, -0.5f);
                    yj5VarM56812l111119.f273290d.m53522g(rk31VarM56811k1111111111115, -0.5f);
                    yj5VarM56812l111119.f273288b = -((float) (dSin15 * d1110));
                    kl80Var2.m56803c(yj5VarM56812l111119);
                    yj5 yj5VarM56812l1111110 = kl80Var2.m56812l();
                    float fCos15 = (float) (Math.cos(d119) * d1110);
                    yj5VarM56812l1111110.f273290d.m53522g(rk31VarM56811k1111111111116, 0.5f);
                    yj5VarM56812l1111110.f273290d.m53522g(rk31VarM56811k1111111111118, 0.5f);
                    yj5VarM56812l1111110.f273290d.m53522g(rk31VarM56811k1111111111112, -0.5f);
                    yj5VarM56812l1111110.f273290d.m53522g(rk31VarM56811k1111111111114, -0.5f);
                    yj5VarM56812l1111110.f273288b = -fCos15;
                    kl80Var2.m56803c(yj5VarM56812l1111110);
                }
                this.f238248l = false;
                this.f238250m = false;
            }
            i17 = -1;
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.f238220U[0] == u7jVar5) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            c6jVar2 = this.f238216Q;
            z10 = !c6jVar2.m31574h();
            boolean z11118 = zArr4[0];
            boolean z11119 = zArr4[1];
            if (this.f238256p != 2) {
                rk31Var3 = rk31VarM56811k;
                rk31Var4 = rk31VarM56811k2;
                i18 = i15;
                r20 = r12;
                u7jVar4 = u7jVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            } else {
                rk31Var3 = rk31VarM56811k;
                rk31Var4 = rk31VarM56811k2;
                i18 = i15;
                r20 = r12;
                u7jVar4 = u7jVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            }
            if (z) {
                rk31Var5 = r33;
                rk31Var6 = rk31Var;
                rk31Var7 = rk31Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            } else {
                rk31Var5 = r33;
                rk31Var6 = rk31Var;
                rk31Var7 = rk31Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            }
            if (this.f238258q == 2) {
                i23 = i19;
            } else {
                i23 = i22;
            }
            if (i23 == 0) {
            }
            if (z7) {
                if (this.f238201B == 1) {
                    float f1112 = this.f238202C;
                    yj5 yj5VarM56812l1111111 = kl80Var2.m56812l();
                    yj5VarM56812l1111111.f273290d.m53522g(rk31Var6, -1.0f);
                    yj5VarM56812l1111111.f273290d.m53522g(rk31Var5, 1.0f);
                    yj5VarM56812l1111111.f273290d.m53522g(rk31Var4, f1112);
                    yj5VarM56812l1111111.f273290d.m53522g(rk31Var3, -f1112);
                    kl80Var2.m56803c(yj5VarM56812l1111111);
                } else {
                    rk31 rk31Var113 = rk31Var5;
                    float f1113 = this.f238202C;
                    yj5 yj5VarM56812l1111112 = kl80Var2.m56812l();
                    yj5VarM56812l1111112.f273290d.m53522g(rk31Var4, -1.0f);
                    yj5VarM56812l1111112.f273290d.m53522g(rk31Var3, 1.0f);
                    yj5VarM56812l1111112.f273290d.m53522g(rk31Var6, f1113);
                    yj5VarM56812l1111112.f273290d.m53522g(rk31Var113, -f1113);
                    kl80Var2.m56803c(yj5VarM56812l1111112);
                }
            }
            if (c6jVar2.m31574h()) {
                v7j v7jVar114 = c6jVar2.f34551f.f34549d;
                float radians16 = (float) Math.toRadians(this.f238204E + 90.0f);
                int iM31571e16 = c6jVar2.m31571e();
                rk31 rk31VarM56811k11111111111110 = kl80Var2.m56811k(mo55866k(2));
                rk31 rk31VarM56811k11111111111111 = kl80Var2.m56811k(mo55866k(3));
                rk31 rk31VarM56811k11111111111112 = kl80Var2.m56811k(mo55866k(4));
                rk31 rk31VarM56811k11111111111113 = kl80Var2.m56811k(mo55866k(5));
                rk31 rk31VarM56811k11111111111114 = kl80Var2.m56811k(v7jVar114.mo55866k(2));
                rk31 rk31VarM56811k11111111111115 = kl80Var2.m56811k(v7jVar114.mo55866k(3));
                rk31 rk31VarM56811k11111111111116 = kl80Var2.m56811k(v7jVar114.mo55866k(4));
                rk31 rk31VarM56811k11111111111117 = kl80Var2.m56811k(v7jVar114.mo55866k(5));
                yj5 yj5VarM56812l1111113 = kl80Var2.m56812l();
                double d1111 = radians16;
                double dSin16 = Math.sin(d1111);
                double d1112 = iM31571e16;
                yj5VarM56812l1111113.f273290d.m53522g(rk31VarM56811k11111111111115, 0.5f);
                yj5VarM56812l1111113.f273290d.m53522g(rk31VarM56811k11111111111117, 0.5f);
                yj5VarM56812l1111113.f273290d.m53522g(rk31VarM56811k11111111111111, -0.5f);
                yj5VarM56812l1111113.f273290d.m53522g(rk31VarM56811k11111111111113, -0.5f);
                yj5VarM56812l1111113.f273288b = -((float) (dSin16 * d1112));
                kl80Var2.m56803c(yj5VarM56812l1111113);
                yj5 yj5VarM56812l1111114 = kl80Var2.m56812l();
                float fCos16 = (float) (Math.cos(d1111) * d1112);
                yj5VarM56812l1111114.f273290d.m53522g(rk31VarM56811k11111111111114, 0.5f);
                yj5VarM56812l1111114.f273290d.m53522g(rk31VarM56811k11111111111116, 0.5f);
                yj5VarM56812l1111114.f273290d.m53522g(rk31VarM56811k11111111111110, -0.5f);
                yj5VarM56812l1111114.f273290d.m53522g(rk31VarM56811k11111111111112, -0.5f);
                yj5VarM56812l1111114.f273288b = -fCos16;
                kl80Var2.m56803c(yj5VarM56812l1111114);
            }
            this.f238248l = false;
            this.f238250m = false;
        }
        rk31Var = rk31VarM56811k4;
        rk31Var2 = rk31VarM56811k5;
        i15 = i13;
        i16 = i14;
        z7 = false;
        int[] iArr9 = this.f238266u;
        iArr9[0] = i15;
        iArr9[1] = i16;
        if (z7) {
            int i317 = this.f238201B;
            i17 = -1;
            if (i317 != 0) {
            }
            if (z7) {
                z8 = false;
            } else {
                z8 = false;
            }
            if (this.f238220U[0] == u7jVar5) {
                z9 = false;
            } else {
                z9 = false;
            }
            if (z9) {
                i8 = 0;
            }
            c6jVar2 = this.f238216Q;
            z10 = !c6jVar2.m31574h();
            boolean z111110 = zArr4[0];
            boolean z111111 = zArr4[1];
            if (this.f238256p != 2) {
                rk31Var3 = rk31VarM56811k;
                rk31Var4 = rk31VarM56811k2;
                i18 = i15;
                r20 = r12;
                u7jVar4 = u7jVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            } else {
                rk31Var3 = rk31VarM56811k;
                rk31Var4 = rk31VarM56811k2;
                i18 = i15;
                r20 = r12;
                u7jVar4 = u7jVar5;
                z11 = z4;
                r3 = i6;
                z12 = z10;
                r110 = r19;
            }
            if (z) {
                rk31Var5 = r33;
                rk31Var6 = rk31Var;
                rk31Var7 = rk31Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            } else {
                rk31Var5 = r33;
                rk31Var6 = rk31Var;
                rk31Var7 = rk31Var2;
                i19 = 0;
                i20 = 8;
                i21 = 1;
                i22 = 1;
            }
            if (this.f238258q == 2) {
                i23 = i19;
            } else {
                i23 = i22;
            }
            if (i23 == 0) {
            }
            if (z7) {
                if (this.f238201B == 1) {
                    float f1114 = this.f238202C;
                    yj5 yj5VarM56812l1111115 = kl80Var2.m56812l();
                    yj5VarM56812l1111115.f273290d.m53522g(rk31Var6, -1.0f);
                    yj5VarM56812l1111115.f273290d.m53522g(rk31Var5, 1.0f);
                    yj5VarM56812l1111115.f273290d.m53522g(rk31Var4, f1114);
                    yj5VarM56812l1111115.f273290d.m53522g(rk31Var3, -f1114);
                    kl80Var2.m56803c(yj5VarM56812l1111115);
                } else {
                    rk31 rk31Var114 = rk31Var5;
                    float f1115 = this.f238202C;
                    yj5 yj5VarM56812l1111116 = kl80Var2.m56812l();
                    yj5VarM56812l1111116.f273290d.m53522g(rk31Var4, -1.0f);
                    yj5VarM56812l1111116.f273290d.m53522g(rk31Var3, 1.0f);
                    yj5VarM56812l1111116.f273290d.m53522g(rk31Var6, f1115);
                    yj5VarM56812l1111116.f273290d.m53522g(rk31Var114, -f1115);
                    kl80Var2.m56803c(yj5VarM56812l1111116);
                }
            }
            if (c6jVar2.m31574h()) {
                v7j v7jVar115 = c6jVar2.f34551f.f34549d;
                float radians17 = (float) Math.toRadians(this.f238204E + 90.0f);
                int iM31571e17 = c6jVar2.m31571e();
                rk31 rk31VarM56811k11111111111118 = kl80Var2.m56811k(mo55866k(2));
                rk31 rk31VarM56811k11111111111119 = kl80Var2.m56811k(mo55866k(3));
                rk31 rk31VarM56811k111111111111110 = kl80Var2.m56811k(mo55866k(4));
                rk31 rk31VarM56811k111111111111111 = kl80Var2.m56811k(mo55866k(5));
                rk31 rk31VarM56811k111111111111112 = kl80Var2.m56811k(v7jVar115.mo55866k(2));
                rk31 rk31VarM56811k111111111111113 = kl80Var2.m56811k(v7jVar115.mo55866k(3));
                rk31 rk31VarM56811k111111111111114 = kl80Var2.m56811k(v7jVar115.mo55866k(4));
                rk31 rk31VarM56811k111111111111115 = kl80Var2.m56811k(v7jVar115.mo55866k(5));
                yj5 yj5VarM56812l1111117 = kl80Var2.m56812l();
                double d1113 = radians17;
                double dSin17 = Math.sin(d1113);
                double d1114 = iM31571e17;
                yj5VarM56812l1111117.f273290d.m53522g(rk31VarM56811k111111111111113, 0.5f);
                yj5VarM56812l1111117.f273290d.m53522g(rk31VarM56811k111111111111115, 0.5f);
                yj5VarM56812l1111117.f273290d.m53522g(rk31VarM56811k11111111111119, -0.5f);
                yj5VarM56812l1111117.f273290d.m53522g(rk31VarM56811k111111111111111, -0.5f);
                yj5VarM56812l1111117.f273288b = -((float) (dSin17 * d1114));
                kl80Var2.m56803c(yj5VarM56812l1111117);
                yj5 yj5VarM56812l1111118 = kl80Var2.m56812l();
                float fCos17 = (float) (Math.cos(d1113) * d1114);
                yj5VarM56812l1111118.f273290d.m53522g(rk31VarM56811k111111111111112, 0.5f);
                yj5VarM56812l1111118.f273290d.m53522g(rk31VarM56811k111111111111114, 0.5f);
                yj5VarM56812l1111118.f273290d.m53522g(rk31VarM56811k11111111111118, -0.5f);
                yj5VarM56812l1111118.f273290d.m53522g(rk31VarM56811k111111111111110, -0.5f);
                yj5VarM56812l1111118.f273288b = -fCos17;
                kl80Var2.m56803c(yj5VarM56812l1111118);
            }
            this.f238248l = false;
            this.f238250m = false;
        }
        i17 = -1;
        if (z7) {
            z8 = false;
        } else {
            z8 = false;
        }
        if (this.f238220U[0] == u7jVar5) {
            z9 = false;
        } else {
            z9 = false;
        }
        if (z9) {
            i8 = 0;
        }
        c6jVar2 = this.f238216Q;
        z10 = !c6jVar2.m31574h();
        boolean z111112 = zArr4[0];
        boolean z111113 = zArr4[1];
        if (this.f238256p != 2) {
            rk31Var3 = rk31VarM56811k;
            rk31Var4 = rk31VarM56811k2;
            i18 = i15;
            r20 = r12;
            u7jVar4 = u7jVar5;
            z11 = z4;
            r3 = i6;
            z12 = z10;
            r110 = r19;
        } else {
            rk31Var3 = rk31VarM56811k;
            rk31Var4 = rk31VarM56811k2;
            i18 = i15;
            r20 = r12;
            u7jVar4 = u7jVar5;
            z11 = z4;
            r3 = i6;
            z12 = z10;
            r110 = r19;
        }
        if (z) {
            rk31Var5 = r33;
            rk31Var6 = rk31Var;
            rk31Var7 = rk31Var2;
            i19 = 0;
            i20 = 8;
            i21 = 1;
            i22 = 1;
        } else {
            rk31Var5 = r33;
            rk31Var6 = rk31Var;
            rk31Var7 = rk31Var2;
            i19 = 0;
            i20 = 8;
            i21 = 1;
            i22 = 1;
        }
        if (this.f238258q == 2) {
            i23 = i19;
        } else {
            i23 = i22;
        }
        if (i23 == 0) {
        }
        if (z7) {
            if (this.f238201B == 1) {
                float f1116 = this.f238202C;
                yj5 yj5VarM56812l1111119 = kl80Var2.m56812l();
                yj5VarM56812l1111119.f273290d.m53522g(rk31Var6, -1.0f);
                yj5VarM56812l1111119.f273290d.m53522g(rk31Var5, 1.0f);
                yj5VarM56812l1111119.f273290d.m53522g(rk31Var4, f1116);
                yj5VarM56812l1111119.f273290d.m53522g(rk31Var3, -f1116);
                kl80Var2.m56803c(yj5VarM56812l1111119);
            } else {
                rk31 rk31Var115 = rk31Var5;
                float f1117 = this.f238202C;
                yj5 yj5VarM56812l11111110 = kl80Var2.m56812l();
                yj5VarM56812l11111110.f273290d.m53522g(rk31Var4, -1.0f);
                yj5VarM56812l11111110.f273290d.m53522g(rk31Var3, 1.0f);
                yj5VarM56812l11111110.f273290d.m53522g(rk31Var6, f1117);
                yj5VarM56812l11111110.f273290d.m53522g(rk31Var115, -f1117);
                kl80Var2.m56803c(yj5VarM56812l11111110);
            }
        }
        if (c6jVar2.m31574h()) {
            v7j v7jVar116 = c6jVar2.f34551f.f34549d;
            float radians18 = (float) Math.toRadians(this.f238204E + 90.0f);
            int iM31571e18 = c6jVar2.m31571e();
            rk31 rk31VarM56811k111111111111116 = kl80Var2.m56811k(mo55866k(2));
            rk31 rk31VarM56811k111111111111117 = kl80Var2.m56811k(mo55866k(3));
            rk31 rk31VarM56811k111111111111118 = kl80Var2.m56811k(mo55866k(4));
            rk31 rk31VarM56811k111111111111119 = kl80Var2.m56811k(mo55866k(5));
            rk31 rk31VarM56811k1111111111111110 = kl80Var2.m56811k(v7jVar116.mo55866k(2));
            rk31 rk31VarM56811k1111111111111111 = kl80Var2.m56811k(v7jVar116.mo55866k(3));
            rk31 rk31VarM56811k1111111111111112 = kl80Var2.m56811k(v7jVar116.mo55866k(4));
            rk31 rk31VarM56811k1111111111111113 = kl80Var2.m56811k(v7jVar116.mo55866k(5));
            yj5 yj5VarM56812l11111111 = kl80Var2.m56812l();
            double d1115 = radians18;
            double dSin18 = Math.sin(d1115);
            double d1116 = iM31571e18;
            yj5VarM56812l11111111.f273290d.m53522g(rk31VarM56811k1111111111111111, 0.5f);
            yj5VarM56812l11111111.f273290d.m53522g(rk31VarM56811k1111111111111113, 0.5f);
            yj5VarM56812l11111111.f273290d.m53522g(rk31VarM56811k111111111111117, -0.5f);
            yj5VarM56812l11111111.f273290d.m53522g(rk31VarM56811k111111111111119, -0.5f);
            yj5VarM56812l11111111.f273288b = -((float) (dSin18 * d1116));
            kl80Var2.m56803c(yj5VarM56812l11111111);
            yj5 yj5VarM56812l11111112 = kl80Var2.m56812l();
            float fCos18 = (float) (Math.cos(d1115) * d1116);
            yj5VarM56812l11111112.f273290d.m53522g(rk31VarM56811k1111111111111110, 0.5f);
            yj5VarM56812l11111112.f273290d.m53522g(rk31VarM56811k1111111111111112, 0.5f);
            yj5VarM56812l11111112.f273290d.m53522g(rk31VarM56811k111111111111116, -0.5f);
            yj5VarM56812l11111112.f273290d.m53522g(rk31VarM56811k111111111111118, -0.5f);
            yj5VarM56812l11111112.f273288b = -fCos18;
            kl80Var2.m56803c(yj5VarM56812l11111112);
        }
        this.f238248l = false;
        this.f238250m = false;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo51865d() {
        return this.f238243i0 != 8;
    }

    /* JADX WARN: Code duplicated, block: B:220:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:222:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:229:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:231:0x0401  */
    /* JADX WARN: Code duplicated, block: B:240:0x041e  */
    /* JADX WARN: Code duplicated, block: B:257:0x0451  */
    /* JADX WARN: Code duplicated, block: B:259:0x0457  */
    /* JADX WARN: Code duplicated, block: B:270:0x046c  */
    /* JADX WARN: Code duplicated, block: B:275:0x0476  */
    /* JADX WARN: Code duplicated, block: B:277:0x047a  */
    /* JADX WARN: Code duplicated, block: B:278:0x047c  */
    /* JADX WARN: Code duplicated, block: B:281:0x0484  */
    /* JADX WARN: Code duplicated, block: B:287:0x0492 A[PHI: r3
      0x0492: PHI (r3v16 int) = (r3v15 int), (r3v20 int), (r3v20 int), (r3v20 int) binds: [B:280:0x0482, B:282:0x0488, B:283:0x048a, B:285:0x048e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:290:0x04a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:291:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:292:0x04ab  */
    /* JADX WARN: Code duplicated, block: B:294:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:303:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:337:0x0522  */
    /* JADX INFO: renamed from: e */
    public final void m84876e(kl80 kl80Var, boolean z, boolean z2, boolean z3, boolean z4, rk31 rk31Var, rk31 rk31Var2, u7j u7jVar, boolean z5, c6j c6jVar, c6j c6jVar2, int i, int i2, int i3, int i4, float f, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i5, int i6, int i7, int i8, float f2, boolean z11) {
        boolean z12;
        boolean z13;
        int iMin;
        boolean z14;
        int i9;
        int i10;
        boolean z15;
        rk31 rk31VarM56811k;
        rk31 rk31VarM56811k2;
        c6j c6jVar3;
        rk31 rk31Var3;
        int i11;
        int i12;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        v7j v7jVar;
        boolean z20;
        int iMin2;
        boolean z21;
        int i13;
        int iM31571e;
        int i14;
        int i15;
        HashSet hashSet;
        boolean z22;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z23;
        boolean z24;
        int i21;
        kl80Var = kl80Var;
        int i22 = i7;
        int i23 = i8;
        rk31 rk31VarM56811k3 = kl80Var.m56811k(c6jVar);
        rk31 rk31VarM56811k4 = kl80Var.m56811k(c6jVar2);
        rk31 rk31VarM56811k5 = kl80Var.m56811k(c6jVar.f34551f);
        rk31 rk31VarM56811k6 = kl80Var.m56811k(c6jVar2.f34551f);
        boolean zM31574h = c6jVar.m31574h();
        boolean zM31574h2 = c6jVar2.m31574h();
        boolean zM31574h3 = this.f238216Q.m31574h();
        int i24 = zM31574h2 ? (zM31574h ? 1 : 0) + 1 : zM31574h ? 1 : 0;
        if (zM31574h3) {
            i24++;
        }
        int i25 = i24;
        int i26 = z6 ? 3 : i5;
        int iOrdinal = u7jVar.ordinal();
        boolean z25 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i26 == 4) ? false : true;
        int i27 = this.f238240h;
        if (i27 == -1 || !z) {
            i27 = i2;
            z12 = z25;
        } else {
            this.f238240h = -1;
            z12 = false;
        }
        int i28 = this.f238242i;
        if (i28 == -1 || z) {
            z13 = z12;
        } else {
            this.f238242i = -1;
            i27 = i28;
            z13 = false;
        }
        boolean z26 = z13;
        if (this.f238243i0 == 8) {
            z14 = false;
            iMin = 0;
        } else {
            iMin = i27;
            z14 = z26;
        }
        if (z11) {
            if (!zM31574h && !zM31574h2 && !zM31574h3) {
                kl80Var.m56804d(rk31VarM56811k3, i);
            } else if (zM31574h && !zM31574h2) {
                i9 = 8;
                kl80Var.m56805e(rk31VarM56811k3, rk31VarM56811k5, c6jVar.m31571e(), 8);
            }
            i9 = 8;
        } else {
            i9 = 8;
        }
        if (z14 != 0) {
            if (i25 == 2 || z6 || !(i26 == 1 || i26 == 0)) {
                if (i22 == -2) {
                    i22 = iMin;
                }
                if (i23 == -2) {
                    i23 = iMin;
                }
                if (iMin > 0 && i26 != 1) {
                    iMin = 0;
                }
                if (i22 > 0) {
                    kl80Var.m56806f(rk31VarM56811k4, rk31VarM56811k3, i22, 8);
                    iMin = Math.max(iMin, i22);
                }
                if (i23 > 0) {
                    if (!z2 || i26 != 1) {
                        kl80Var.m56807g(rk31VarM56811k4, rk31VarM56811k3, i23, 8);
                    }
                    iMin = Math.min(iMin, i23);
                }
                if (i26 == 1) {
                    if (z2) {
                        kl80Var.m56805e(rk31VarM56811k4, rk31VarM56811k3, iMin, 8);
                    } else if (z8) {
                        kl80Var.m56805e(rk31VarM56811k4, rk31VarM56811k3, iMin, 5);
                        kl80Var.m56807g(rk31VarM56811k4, rk31VarM56811k3, iMin, 8);
                    } else {
                        kl80Var.m56805e(rk31VarM56811k4, rk31VarM56811k3, iMin, 5);
                        kl80Var.m56807g(rk31VarM56811k4, rk31VarM56811k3, iMin, 8);
                    }
                } else if (i26 == 2) {
                    int i29 = c6jVar.f34550e;
                    if (i29 == 3 || i29 == 5) {
                        rk31VarM56811k = kl80Var.m56811k(this.f238221V.mo55866k(3));
                        rk31VarM56811k2 = kl80Var.m56811k(this.f238221V.mo55866k(5));
                    } else {
                        rk31VarM56811k = kl80Var.m56811k(this.f238221V.mo55866k(2));
                        rk31VarM56811k2 = kl80Var.m56811k(this.f238221V.mo55866k(4));
                    }
                    yj5 yj5VarM56812l = kl80Var.m56812l();
                    int i30 = i22;
                    yj5VarM56812l.f273290d.m53522g(rk31VarM56811k4, -1.0f);
                    yj5VarM56812l.f273290d.m53522g(rk31VarM56811k3, 1.0f);
                    yj5VarM56812l.f273290d.m53522g(rk31VarM56811k2, f2);
                    yj5VarM56812l.f273290d.m53522g(rk31VarM56811k, -f2);
                    kl80Var.m56803c(yj5VarM56812l);
                    if (z2) {
                        z14 = false;
                    }
                    z15 = z4;
                    i10 = i30;
                } else {
                    i10 = i22;
                    z15 = true;
                }
            } else {
                int iMax = Math.max(i22, iMin);
                if (i23 > 0) {
                    iMax = Math.min(i23, iMax);
                }
                kl80Var.m56805e(rk31VarM56811k4, rk31VarM56811k3, iMax, 8);
                z15 = z4;
                i10 = i22;
                z14 = false;
            }
            if (z11 || z8) {
                boolean z27 = z15;
                if (i25 >= 2 && z2 && z27) {
                    kl80Var.m56806f(rk31VarM56811k3, rk31Var, 0, 8);
                    c6j c6jVar4 = this.f238213N;
                    boolean z28 = z || c6jVar4.f34551f == null;
                    if (!z && (c6jVar3 = c6jVar4.f34551f) != null) {
                        v7j v7jVar2 = c6jVar3.f34549d;
                        if (v7jVar2.f238224Y != 0.0f) {
                            u7j[] u7jVarArr = v7jVar2.f238220U;
                            u7j u7jVar2 = u7jVarArr[0];
                            u7j u7jVar3 = u7j.f227712c;
                            if (u7jVar2 == u7jVar3 && u7jVarArr[1] == u7jVar3) {
                                z28 = true;
                            } else {
                                z28 = false;
                            }
                        } else {
                            z28 = false;
                        }
                    }
                    if (z28) {
                        kl80Var.m56806f(rk31Var2, rk31VarM56811k4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (zM31574h || zM31574h2 || zM31574h3) {
                if (zM31574h && !zM31574h2) {
                    c6jVar2 = c6jVar2;
                    rk31VarM56811k4 = rk31VarM56811k4;
                    z15 = z15;
                    rk31Var3 = rk31VarM56811k6;
                    z20 = z2;
                    i21 = (z2 && (c6jVar.f34551f.f34549d instanceof ix8)) ? 8 : 5;
                } else if (zM31574h || !zM31574h2) {
                    rk31Var3 = rk31VarM56811k6;
                    if (zM31574h && zM31574h2) {
                        v7j v7jVar3 = c6jVar.f34551f.f34549d;
                        v7j v7jVar4 = c6jVar2.f34551f.f34549d;
                        z15 = z15;
                        v7j v7jVar5 = this.f238221V;
                        int i31 = 6;
                        if (z14) {
                            if (i26 == 0) {
                                if (i23 != 0 || i10 != 0) {
                                    i19 = 5;
                                    i20 = 5;
                                    z23 = true;
                                    z24 = false;
                                    z17 = true;
                                } else if (rk31VarM56811k5.f199972f && rk31Var3.f199972f) {
                                    kl80Var.m56805e(rk31VarM56811k3, rk31VarM56811k5, c6jVar.m31571e(), 8);
                                    kl80Var.m56805e(rk31VarM56811k4, rk31Var3, -c6jVar2.m31571e(), 8);
                                    return;
                                } else {
                                    i19 = 8;
                                    i20 = 8;
                                    z23 = false;
                                    z24 = true;
                                    z17 = false;
                                }
                                if ((v7jVar3 instanceof ix8) || (v7jVar4 instanceof ix8)) {
                                    kl80Var = kl80Var;
                                    i26 = i26;
                                    rk31VarM56811k3 = rk31VarM56811k3;
                                    rk31VarM56811k4 = rk31VarM56811k4;
                                    z18 = z24;
                                    rk31Var2 = rk31Var2;
                                    i11 = i19;
                                    rk31VarM56811k5 = rk31VarM56811k5;
                                    i31 = 6;
                                    z16 = z23;
                                    i12 = 4;
                                } else {
                                    kl80Var = kl80Var;
                                    rk31VarM56811k3 = rk31VarM56811k3;
                                    rk31VarM56811k4 = rk31VarM56811k4;
                                    z18 = z24;
                                    i11 = i19;
                                    rk31VarM56811k5 = rk31VarM56811k5;
                                    i31 = 6;
                                    z16 = z23;
                                    i12 = i20;
                                    i26 = i26;
                                    rk31Var2 = rk31Var2;
                                }
                            } else {
                                if (i26 == 2) {
                                    if ((v7jVar3 instanceof ix8) || (v7jVar4 instanceof ix8)) {
                                        i11 = 5;
                                    } else {
                                        kl80Var = kl80Var;
                                        i26 = i26;
                                        rk31VarM56811k3 = rk31VarM56811k3;
                                        rk31VarM56811k4 = rk31VarM56811k4;
                                        rk31VarM56811k5 = rk31VarM56811k5;
                                        i31 = 6;
                                        i11 = 5;
                                        i12 = 5;
                                    }
                                    z16 = true;
                                    z17 = true;
                                    z18 = false;
                                    rk31Var2 = rk31Var2;
                                } else if (i26 == 1) {
                                    i11 = 8;
                                } else if (i26 == 3) {
                                    i26 = i26;
                                    if (this.f238201B != -1) {
                                        if (z6) {
                                            if (i6 == 2 || i6 == 1) {
                                                i17 = 5;
                                                i18 = 4;
                                            } else {
                                                i17 = 8;
                                                i18 = 5;
                                            }
                                            i12 = i18;
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        } else {
                                            if (i23 > 0) {
                                                kl80Var = kl80Var;
                                                rk31Var2 = rk31Var2;
                                                rk31VarM56811k3 = rk31VarM56811k3;
                                                rk31VarM56811k4 = rk31VarM56811k4;
                                                rk31VarM56811k5 = rk31VarM56811k5;
                                                i31 = 6;
                                                i11 = 5;
                                            } else if (i23 != 0 || i10 != 0) {
                                                kl80Var = kl80Var;
                                                rk31Var2 = rk31Var2;
                                                rk31VarM56811k3 = rk31VarM56811k3;
                                                rk31VarM56811k4 = rk31VarM56811k4;
                                                rk31VarM56811k5 = rk31VarM56811k5;
                                                i31 = 6;
                                                i11 = 5;
                                                i12 = 4;
                                            } else if (z9) {
                                                i17 = (v7jVar3 == v7jVar5 || v7jVar4 == v7jVar5) ? 5 : 4;
                                                i12 = 4;
                                                z16 = true;
                                                z17 = true;
                                                z18 = true;
                                            } else {
                                                kl80Var = kl80Var;
                                                rk31Var2 = rk31Var2;
                                                rk31VarM56811k3 = rk31VarM56811k3;
                                                rk31VarM56811k4 = rk31VarM56811k4;
                                                rk31VarM56811k5 = rk31VarM56811k5;
                                                i31 = 6;
                                                i11 = 5;
                                                i12 = 8;
                                            }
                                            z16 = true;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        i11 = i17;
                                        kl80Var = kl80Var;
                                    } else if (z9) {
                                        kl80Var = kl80Var;
                                        rk31Var2 = rk31Var2;
                                        rk31VarM56811k3 = rk31VarM56811k3;
                                        rk31VarM56811k4 = rk31VarM56811k4;
                                        rk31VarM56811k5 = rk31VarM56811k5;
                                        i11 = 8;
                                        i31 = z2 ? 5 : 4;
                                    } else {
                                        kl80Var = kl80Var;
                                        rk31Var2 = rk31Var2;
                                        rk31VarM56811k3 = rk31VarM56811k3;
                                        rk31VarM56811k4 = rk31VarM56811k4;
                                        rk31VarM56811k5 = rk31VarM56811k5;
                                        i11 = 8;
                                        i31 = 8;
                                    }
                                    i12 = 5;
                                    z16 = true;
                                    z17 = true;
                                    z18 = true;
                                } else {
                                    i11 = 5;
                                    i12 = 4;
                                    z16 = false;
                                    z17 = false;
                                }
                                i12 = 4;
                                z16 = true;
                                z17 = true;
                                z18 = false;
                                rk31Var2 = rk31Var2;
                            }
                            if (z17 || rk31VarM56811k5 != rk31Var3 || v7jVar3 == v7jVar5) {
                                z19 = true;
                            } else {
                                z17 = false;
                                z19 = false;
                            }
                            if (z16) {
                                if (z14 && !z7 && !z9 && rk31VarM56811k5 == rk31Var && rk31Var3 == rk31Var2) {
                                    i31 = 8;
                                    z20 = false;
                                    i16 = 8;
                                    z22 = false;
                                } else {
                                    z20 = z2;
                                    z22 = z19;
                                    i16 = i11;
                                }
                                rk31 rk31Var4 = rk31VarM56811k5;
                                v7jVar = v7jVar4;
                                kl80Var.m56802b(rk31VarM56811k3, rk31Var4, c6jVar.m31571e(), f, rk31Var3, rk31VarM56811k4, c6jVar2.m31571e(), i31);
                                rk31VarM56811k5 = rk31Var4;
                                i11 = i16;
                                z19 = z22;
                            } else {
                                v7jVar = v7jVar4;
                                z20 = z2;
                            }
                            if (this.f238243i0 != 8 && ((hashSet = c6jVar2.f34546a) == null || hashSet.size() <= 0)) {
                                return;
                            }
                            if (z17) {
                                if (z20 && rk31VarM56811k5 != rk31Var3 && !z14 && ((v7jVar3 instanceof ix8) || (v7jVar instanceof ix8))) {
                                    i11 = 6;
                                }
                                kl80Var.m56806f(rk31VarM56811k3, rk31VarM56811k5, c6jVar.m31571e(), i11);
                                kl80Var.m56807g(rk31VarM56811k4, rk31Var3, -c6jVar2.m31571e(), i11);
                            }
                            if (z20 || !z10 || (v7jVar3 instanceof ix8) || (v7jVar instanceof ix8) || v7jVar == v7jVar5) {
                                iMin2 = i12;
                                z21 = z19;
                            } else {
                                iMin2 = 6;
                                i11 = 6;
                                z21 = true;
                            }
                            if (z21) {
                                if (z18 && (!z9 || z3)) {
                                    if (v7jVar3 != v7jVar5 && v7jVar != v7jVar5) {
                                        i31 = iMin2;
                                    }
                                    if ((v7jVar3 instanceof ka20) || (v7jVar instanceof ka20)) {
                                        i31 = 5;
                                    }
                                    if ((v7jVar3 instanceof ix8) || (v7jVar instanceof ix8)) {
                                        i31 = 5;
                                    }
                                    if (z9) {
                                        i15 = 5;
                                    } else {
                                        i15 = i31;
                                    }
                                    iMin2 = Math.max(i15, iMin2);
                                }
                                if (z20) {
                                    iMin2 = Math.min(i11, iMin2);
                                    if (z6 || z9 || !(v7jVar3 == v7jVar5 || v7jVar == v7jVar5)) {
                                        i14 = iMin2;
                                    } else {
                                        i14 = 4;
                                    }
                                } else {
                                    i14 = iMin2;
                                }
                                kl80Var.m56805e(rk31VarM56811k3, rk31VarM56811k5, c6jVar.m31571e(), i14);
                                kl80Var.m56805e(rk31VarM56811k4, rk31Var3, -c6jVar2.m31571e(), i14);
                            }
                            if (z20) {
                                if (rk31Var == rk31VarM56811k5) {
                                    iM31571e = c6jVar.m31571e();
                                } else {
                                    iM31571e = 0;
                                }
                                if (rk31VarM56811k5 != rk31Var) {
                                    kl80Var.m56806f(rk31VarM56811k3, rk31Var, iM31571e, 5);
                                }
                            }
                            if (z20 || !z14 || i3 != 0 || i10 != 0) {
                                i13 = 5;
                            } else if (z14 && i26 == 3) {
                                kl80Var.m56806f(rk31VarM56811k4, rk31VarM56811k3, 0, 8);
                                i13 = 5;
                            } else {
                                i13 = 5;
                                kl80Var.m56806f(rk31VarM56811k4, rk31VarM56811k3, 0, 5);
                            }
                        } else {
                            if (rk31VarM56811k5.f199972f && rk31Var3.f199972f) {
                                kl80Var.m56802b(rk31VarM56811k3, rk31VarM56811k5, c6jVar.m31571e(), f, rk31Var3, rk31VarM56811k4, c6jVar2.m31571e(), 8);
                                if (z2 && z15) {
                                    int iM31571e2 = c6jVar2.f34551f != null ? c6jVar2.m31571e() : 0;
                                    if (rk31Var3 != rk31Var2) {
                                        kl80Var.m56806f(rk31Var2, rk31VarM56811k4, iM31571e2, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            i11 = 5;
                            i12 = 4;
                            z16 = true;
                            z17 = true;
                        }
                        z18 = false;
                        if (z17) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        if (z16) {
                            if (z14) {
                                z20 = z2;
                                z22 = z19;
                                i16 = i11;
                            } else {
                                z20 = z2;
                                z22 = z19;
                                i16 = i11;
                            }
                            rk31 rk31Var5 = rk31VarM56811k5;
                            v7jVar = v7jVar4;
                            kl80Var.m56802b(rk31VarM56811k3, rk31Var5, c6jVar.m31571e(), f, rk31Var3, rk31VarM56811k4, c6jVar2.m31571e(), i31);
                            rk31VarM56811k5 = rk31Var5;
                            i11 = i16;
                            z19 = z22;
                        } else {
                            v7jVar = v7jVar4;
                            z20 = z2;
                        }
                        if (this.f238243i0 != 8) {
                        }
                        if (z17) {
                            if (z20) {
                                i11 = 6;
                            }
                            kl80Var.m56806f(rk31VarM56811k3, rk31VarM56811k5, c6jVar.m31571e(), i11);
                            kl80Var.m56807g(rk31VarM56811k4, rk31Var3, -c6jVar2.m31571e(), i11);
                        }
                        if (z20) {
                            iMin2 = i12;
                            z21 = z19;
                        } else {
                            iMin2 = i12;
                            z21 = z19;
                        }
                        if (z21) {
                            if (z18) {
                                if (v7jVar3 != v7jVar5) {
                                    i31 = iMin2;
                                }
                                if (v7jVar3 instanceof ka20) {
                                    i31 = 5;
                                } else {
                                    i31 = 5;
                                }
                                if (v7jVar3 instanceof ix8) {
                                    i31 = 5;
                                } else {
                                    i31 = 5;
                                }
                                if (z9) {
                                    i15 = 5;
                                } else {
                                    i15 = i31;
                                }
                                iMin2 = Math.max(i15, iMin2);
                            }
                            if (z20) {
                                iMin2 = Math.min(i11, iMin2);
                                if (z6) {
                                    i14 = iMin2;
                                } else {
                                    i14 = iMin2;
                                }
                            } else {
                                i14 = iMin2;
                            }
                            kl80Var.m56805e(rk31VarM56811k3, rk31VarM56811k5, c6jVar.m31571e(), i14);
                            kl80Var.m56805e(rk31VarM56811k4, rk31Var3, -c6jVar2.m31571e(), i14);
                        }
                        if (z20) {
                            if (rk31Var == rk31VarM56811k5) {
                                iM31571e = c6jVar.m31571e();
                            } else {
                                iM31571e = 0;
                            }
                            if (rk31VarM56811k5 != rk31Var) {
                                kl80Var.m56806f(rk31VarM56811k3, rk31Var, iM31571e, 5);
                            }
                        }
                        if (z20) {
                            i13 = 5;
                        } else {
                            i13 = 5;
                        }
                    }
                    i21 = i13;
                } else {
                    rk31Var3 = rk31VarM56811k6;
                    kl80Var.m56805e(rk31VarM56811k4, rk31Var3, -c6jVar2.m31571e(), 8);
                    if (z2) {
                        kl80Var.m56806f(rk31VarM56811k3, rk31Var, 0, 5);
                        c6jVar2 = c6jVar2;
                        i13 = 5;
                        rk31VarM56811k4 = rk31VarM56811k4;
                        z15 = z15;
                    }
                    z20 = z2;
                    i21 = i13;
                }
                if (z20 || !z15) {
                    return;
                }
                int iM31571e3 = c6jVar2.f34551f != null ? c6jVar2.m31571e() : 0;
                if (rk31Var3 != rk31Var2) {
                    kl80Var.m56806f(rk31Var2, rk31VarM56811k4, iM31571e3, i21);
                    return;
                }
                return;
            }
            rk31Var3 = rk31VarM56811k6;
            i13 = 5;
            z20 = z2;
            i21 = i13;
            if (z20) {
                return;
            } else {
                return;
            }
        }
        if (z5) {
            kl80Var.m56805e(rk31VarM56811k4, rk31VarM56811k3, 0, 3);
            if (i3 > 0) {
                kl80Var.m56806f(rk31VarM56811k4, rk31VarM56811k3, i3, i9);
            }
            if (i4 < Integer.MAX_VALUE) {
                kl80Var.m56807g(rk31VarM56811k4, rk31VarM56811k3, i4, i9);
            }
        } else {
            kl80Var.m56805e(rk31VarM56811k4, rk31VarM56811k3, iMin, i9);
        }
        z15 = z4;
        i10 = i22;
        if (z11) {
        }
        boolean z29 = z15;
        if (i25 >= 2) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m84877f(int i, v7j v7jVar, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    m84877f(2, v7jVar, i2, 0);
                    m84877f(4, v7jVar, i2, 0);
                    mo55866k(7).m31567a(v7jVar.mo55866k(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        m84877f(3, v7jVar, i2, 0);
                        m84877f(5, v7jVar, i2, 0);
                        mo55866k(7).m31567a(v7jVar.mo55866k(i2), 0);
                        return;
                    }
                    return;
                }
            }
            c6j c6jVarMo55866k = mo55866k(2);
            c6j c6jVarMo55866k2 = mo55866k(4);
            c6j c6jVarMo55866k3 = mo55866k(3);
            c6j c6jVarMo55866k4 = mo55866k(5);
            boolean z2 = true;
            if ((c6jVarMo55866k == null || !c6jVarMo55866k.m31574h()) && (c6jVarMo55866k2 == null || !c6jVarMo55866k2.m31574h())) {
                m84877f(2, v7jVar, 2, 0);
                m84877f(4, v7jVar, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((c6jVarMo55866k3 == null || !c6jVarMo55866k3.m31574h()) && (c6jVarMo55866k4 == null || !c6jVarMo55866k4.m31574h())) {
                m84877f(3, v7jVar, 3, 0);
                m84877f(5, v7jVar, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                mo55866k(7).m31567a(v7jVar.mo55866k(7), 0);
                return;
            } else if (z) {
                mo55866k(8).m31567a(v7jVar.mo55866k(8), 0);
                return;
            } else {
                if (z2) {
                    mo55866k(9).m31567a(v7jVar.mo55866k(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            c6j c6jVarMo55866k5 = mo55866k(2);
            c6j c6jVarMo55866k6 = v7jVar.mo55866k(i2);
            c6j c6jVarMo55866k7 = mo55866k(4);
            c6jVarMo55866k5.m31567a(c6jVarMo55866k6, 0);
            c6jVarMo55866k7.m31567a(c6jVarMo55866k6, 0);
            mo55866k(8).m31567a(c6jVarMo55866k6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            c6j c6jVarMo55866k8 = v7jVar.mo55866k(i2);
            mo55866k(3).m31567a(c6jVarMo55866k8, 0);
            mo55866k(5).m31567a(c6jVarMo55866k8, 0);
            mo55866k(9).m31567a(c6jVarMo55866k8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            mo55866k(2).m31567a(v7jVar.mo55866k(2), 0);
            mo55866k(4).m31567a(v7jVar.mo55866k(4), 0);
            mo55866k(8).m31567a(v7jVar.mo55866k(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            mo55866k(3).m31567a(v7jVar.mo55866k(3), 0);
            mo55866k(5).m31567a(v7jVar.mo55866k(5), 0);
            mo55866k(9).m31567a(v7jVar.mo55866k(i2), 0);
            return;
        }
        c6j c6jVarMo55866k9 = mo55866k(i);
        c6j c6jVarMo55866k10 = v7jVar.mo55866k(i2);
        if (c6jVarMo55866k9.m31575i(c6jVarMo55866k10)) {
            if (i == 6) {
                c6j c6jVarMo55866k11 = mo55866k(3);
                c6j c6jVarMo55866k12 = mo55866k(5);
                if (c6jVarMo55866k11 != null) {
                    c6jVarMo55866k11.m31576j();
                }
                if (c6jVarMo55866k12 != null) {
                    c6jVarMo55866k12.m31576j();
                }
            } else if (i == 3 || i == 5) {
                c6j c6jVarMo55866k13 = mo55866k(6);
                if (c6jVarMo55866k13 != null) {
                    c6jVarMo55866k13.m31576j();
                }
                c6j c6jVarMo55866k14 = mo55866k(7);
                if (c6jVarMo55866k14.f34551f != c6jVarMo55866k10) {
                    c6jVarMo55866k14.m31576j();
                }
                c6j c6jVarM31572f = mo55866k(i).m31572f();
                c6j c6jVarMo55866k15 = mo55866k(9);
                if (c6jVarMo55866k15.m31574h()) {
                    c6jVarM31572f.m31576j();
                    c6jVarMo55866k15.m31576j();
                }
            } else if (i == 2 || i == 4) {
                c6j c6jVarMo55866k16 = mo55866k(7);
                if (c6jVarMo55866k16.f34551f != c6jVarMo55866k10) {
                    c6jVarMo55866k16.m31576j();
                }
                c6j c6jVarM31572f2 = mo55866k(i).m31572f();
                c6j c6jVarMo55866k17 = mo55866k(8);
                if (c6jVarMo55866k17.m31574h()) {
                    c6jVarM31572f2.m31576j();
                    c6jVarMo55866k17.m31576j();
                }
            }
            c6jVarMo55866k9.m31567a(c6jVarMo55866k10, i3);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m84878g(c6j c6jVar, c6j c6jVar2, int i) {
        if (c6jVar.f34549d == this) {
            m84877f(c6jVar.f34550e, c6jVar2.f34549d, c6jVar2.f34550e, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public void mo44861h(v7j v7jVar, HashMap map) {
        this.f238256p = v7jVar.f238256p;
        this.f238258q = v7jVar.f238258q;
        this.f238262s = v7jVar.f238262s;
        this.f238264t = v7jVar.f238264t;
        int[] iArr = v7jVar.f238266u;
        int i = iArr[0];
        int[] iArr2 = this.f238266u;
        iArr2[0] = i;
        iArr2[1] = iArr[1];
        this.f238267v = v7jVar.f238267v;
        this.f238268w = v7jVar.f238268w;
        this.f238270y = v7jVar.f238270y;
        this.f238271z = v7jVar.f238271z;
        this.f238200A = v7jVar.f238200A;
        this.f238201B = v7jVar.f238201B;
        this.f238202C = v7jVar.f238202C;
        int[] iArr3 = v7jVar.f238203D;
        this.f238203D = Arrays.copyOf(iArr3, iArr3.length);
        this.f238204E = v7jVar.f238204E;
        this.f238205F = v7jVar.f238205F;
        this.f238209J.m31576j();
        this.f238210K.m31576j();
        this.f238211L.m31576j();
        this.f238212M.m31576j();
        this.f238213N.m31576j();
        this.f238214O.m31576j();
        this.f238215P.m31576j();
        this.f238216Q.m31576j();
        this.f238220U = (u7j[]) Arrays.copyOf(this.f238220U, 2);
        this.f238221V = this.f238221V == null ? null : (v7j) map.get(v7jVar.f238221V);
        this.f238222W = v7jVar.f238222W;
        this.f238223X = v7jVar.f238223X;
        this.f238224Y = v7jVar.f238224Y;
        this.f238225Z = v7jVar.f238225Z;
        this.f238227a0 = v7jVar.f238227a0;
        this.f238229b0 = v7jVar.f238229b0;
        this.f238231c0 = v7jVar.f238231c0;
        this.f238233d0 = v7jVar.f238233d0;
        this.f238235e0 = v7jVar.f238235e0;
        this.f238237f0 = v7jVar.f238237f0;
        this.f238239g0 = v7jVar.f238239g0;
        this.f238241h0 = v7jVar.f238241h0;
        this.f238243i0 = v7jVar.f238243i0;
        this.f238245j0 = v7jVar.f238245j0;
        this.f238247k0 = v7jVar.f238247k0;
        this.f238249l0 = v7jVar.f238249l0;
        this.f238251m0 = v7jVar.f238251m0;
        float[] fArr = v7jVar.f238253n0;
        float f = fArr[0];
        float[] fArr2 = this.f238253n0;
        fArr2[0] = f;
        fArr2[1] = fArr[1];
        v7j[] v7jVarArr = v7jVar.f238255o0;
        v7j v7jVar2 = v7jVarArr[0];
        v7j[] v7jVarArr2 = this.f238255o0;
        v7jVarArr2[0] = v7jVar2;
        v7jVarArr2[1] = v7jVarArr[1];
        v7j[] v7jVarArr3 = v7jVar.f238257p0;
        v7j v7jVar3 = v7jVarArr3[0];
        v7j[] v7jVarArr4 = this.f238257p0;
        v7jVarArr4[0] = v7jVar3;
        v7jVarArr4[1] = v7jVarArr3[1];
        v7j v7jVar4 = v7jVar.f238259q0;
        this.f238259q0 = v7jVar4 == null ? null : (v7j) map.get(v7jVar4);
        v7j v7jVar5 = v7jVar.f238261r0;
        this.f238261r0 = v7jVar5 != null ? (v7j) map.get(v7jVar5) : null;
    }

    /* JADX INFO: renamed from: i */
    public final void m84879i(kl80 kl80Var) {
        kl80Var.m56811k(this.f238209J);
        kl80Var.m56811k(this.f238210K);
        kl80Var.m56811k(this.f238211L);
        kl80Var.m56811k(this.f238212M);
        if (this.f238231c0 > 0) {
            kl80Var.m56811k(this.f238213N);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m84880j() {
        if (this.f238232d == null) {
            l730 l730Var = new l730(this);
            l730Var.f137068h.f73269e = 4;
            l730Var.f137069i.f73269e = 5;
            l730Var.f137066f = 0;
            this.f238232d = l730Var;
        }
        if (this.f238234e == null) {
            bhb1 bhb1Var = new bhb1(this);
            ftq ftqVar = new ftq(bhb1Var);
            bhb1Var.f27132k = ftqVar;
            bhb1Var.f27133l = null;
            bhb1Var.f137068h.f73269e = 6;
            bhb1Var.f137069i.f73269e = 7;
            ftqVar.f73269e = 8;
            bhb1Var.f137066f = 1;
            this.f238234e = bhb1Var;
        }
    }

    /* JADX INFO: renamed from: k */
    public c6j mo55866k(int i) {
        switch (edb.m38547C(i)) {
            case 0:
                return null;
            case 1:
                return this.f238209J;
            case 2:
                return this.f238210K;
            case 3:
                return this.f238211L;
            case 4:
                return this.f238212M;
            case 5:
                return this.f238213N;
            case 6:
                return this.f238216Q;
            case 7:
                return this.f238214O;
            case 8:
                return this.f238215P;
            default:
                throw new AssertionError(klh.m56853y(i));
        }
    }

    /* JADX INFO: renamed from: l */
    public final u7j m84881l(int i) {
        if (i == 0) {
            return this.f238220U[0];
        }
        if (i == 1) {
            return this.f238220U[1];
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final int m84882m() {
        if (this.f238243i0 == 8) {
            return 0;
        }
        return this.f238223X;
    }

    /* JADX INFO: renamed from: n */
    public final v7j m84883n(int i) {
        c6j c6jVar;
        c6j c6jVar2;
        if (i != 0) {
            if (i == 1 && (c6jVar2 = (c6jVar = this.f238212M).f34551f) != null && c6jVar2.f34551f == c6jVar) {
                return c6jVar2.f34549d;
            }
            return null;
        }
        c6j c6jVar3 = this.f238211L;
        c6j c6jVar4 = c6jVar3.f34551f;
        if (c6jVar4 == null || c6jVar4.f34551f != c6jVar3) {
            return null;
        }
        return c6jVar4.f34549d;
    }

    /* JADX INFO: renamed from: o */
    public final v7j m84884o(int i) {
        c6j c6jVar;
        c6j c6jVar2;
        if (i != 0) {
            if (i == 1 && (c6jVar2 = (c6jVar = this.f238210K).f34551f) != null && c6jVar2.f34551f == c6jVar) {
                return c6jVar2.f34549d;
            }
            return null;
        }
        c6j c6jVar3 = this.f238209J;
        c6j c6jVar4 = c6jVar3.f34551f;
        if (c6jVar4 == null || c6jVar4.f34551f != c6jVar3) {
            return null;
        }
        return c6jVar4.f34549d;
    }

    /* JADX INFO: renamed from: p */
    public void mo84885p(StringBuilder sb) {
        sb.append("  " + this.f238246k + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f238222W);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f238223X);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f238227a0);
        sb.append("\n");
        sb.append("    actualTop:" + this.f238229b0);
        sb.append("\n");
        m84856r(sb, "left", this.f238209J);
        m84856r(sb, "top", this.f238210K);
        m84856r(sb, "right", this.f238211L);
        m84856r(sb, "bottom", this.f238212M);
        m84856r(sb, "baseline", this.f238213N);
        m84856r(sb, "centerX", this.f238214O);
        m84856r(sb, "centerY", this.f238215P);
        int i = this.f238222W;
        int i2 = this.f238233d0;
        int i3 = this.f238203D[0];
        int i4 = this.f238267v;
        int i5 = this.f238262s;
        float f = this.f238269x;
        u7j u7jVar = this.f238220U[0];
        float[] fArr = this.f238253n0;
        float f2 = fArr[0];
        m84855q(sb, "    width", i, i2, i3, i4, i5, f, u7jVar);
        int i6 = this.f238223X;
        int i7 = this.f238235e0;
        int i8 = this.f238203D[1];
        int i9 = this.f238270y;
        int i10 = this.f238264t;
        float f3 = this.f238200A;
        u7j u7jVar2 = this.f238220U[1];
        float f4 = fArr[1];
        m84855q(sb, "    height", i6, i7, i8, i9, i10, f3, u7jVar2);
        float f5 = this.f238224Y;
        int i11 = this.f238225Z;
        if (f5 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f5);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        m84853I(sb, "    horizontalBias", this.f238237f0, 0.5f);
        m84853I(sb, "    verticalBias", this.f238239g0, 0.5f);
        m84854J(sb, "    horizontalChainStyle", this.f238249l0, 0);
        m84854J(sb, "    verticalChainStyle", this.f238251m0, 0);
        sb.append("  }");
    }

    /* JADX INFO: renamed from: s */
    public final int m84886s() {
        if (this.f238243i0 == 8) {
            return 0;
        }
        return this.f238222W;
    }

    /* JADX INFO: renamed from: t */
    public final int m84887t() {
        v7j v7jVar = this.f238221V;
        return (v7jVar == null || !(v7jVar instanceof w7j)) ? this.f238227a0 : ((w7j) v7jVar).f248693B0 + this.f238227a0;
    }

    public String toString() {
        String strM36616p = "";
        StringBuilder sbM36620t = dq60.m36620t("");
        if (this.f238247k0 != null) {
            strM36616p = dq60.m36616p(this.f238247k0, " ", new StringBuilder("id: "));
        }
        sbM36620t.append(strM36616p);
        sbM36620t.append("(");
        sbM36620t.append(this.f238227a0);
        sbM36620t.append(", ");
        sbM36620t.append(this.f238229b0);
        sbM36620t.append(") - (");
        sbM36620t.append(this.f238222W);
        sbM36620t.append(" x ");
        return klh.m56832d(this.f238223X, ")", sbM36620t);
    }

    /* JADX INFO: renamed from: u */
    public final int m84888u() {
        v7j v7jVar = this.f238221V;
        return (v7jVar == null || !(v7jVar instanceof w7j)) ? this.f238229b0 : ((w7j) v7jVar).f248694C0 + this.f238229b0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x003a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x003b A[RETURN] */
    /* JADX INFO: renamed from: v */
    public final boolean m84889v(int i) {
        if (i == 0) {
            if ((this.f238209J.f34551f != null ? 1 : 0) + (this.f238211L.f34551f != null ? 1 : 0) < 2) {
                return true;
            }
            return false;
        }
        if ((this.f238210K.f34551f != null ? 1 : 0) + (this.f238212M.f34551f != null ? 1 : 0) + (this.f238213N.f34551f != null ? 1 : 0) < 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m84890w(int i, int i2) {
        c6j c6jVar;
        c6j c6jVar2;
        c6j c6jVar3;
        c6j c6jVar4;
        if (i == 0) {
            c6j c6jVar5 = this.f238209J;
            c6j c6jVar6 = c6jVar5.f34551f;
            if (c6jVar6 == null || !c6jVar6.f34548c || (c6jVar4 = (c6jVar3 = this.f238211L).f34551f) == null || !c6jVar4.f34548c) {
                return false;
            }
            return (c6jVar4.m31570d() - c6jVar3.m31571e()) - (c6jVar5.m31571e() + c6jVar5.f34551f.m31570d()) >= i2;
        }
        c6j c6jVar7 = this.f238210K;
        c6j c6jVar8 = c6jVar7.f34551f;
        if (c6jVar8 == null || !c6jVar8.f34548c || (c6jVar2 = (c6jVar = this.f238212M).f34551f) == null || !c6jVar2.f34548c) {
            return false;
        }
        return (c6jVar2.m31570d() - c6jVar.m31571e()) - (c6jVar7.m31571e() + c6jVar7.f34551f.m31570d()) >= i2;
    }

    /* JADX INFO: renamed from: x */
    public final void m84891x(int i, int i2, int i3, int i4, v7j v7jVar) {
        mo55866k(i).m31568b(v7jVar.mo55866k(i2), i3, i4, true);
    }

    /* JADX INFO: renamed from: y */
    public final boolean m84892y(int i) {
        c6j c6jVar;
        c6j c6jVar2;
        int i2 = i * 2;
        c6j[] c6jVarArr = this.f238217R;
        c6j c6jVar3 = c6jVarArr[i2];
        c6j c6jVar4 = c6jVar3.f34551f;
        return (c6jVar4 == null || c6jVar4.f34551f == c6jVar3 || (c6jVar2 = (c6jVar = c6jVarArr[i2 + 1]).f34551f) == null || c6jVar2.f34551f != c6jVar) ? false : true;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m84893z() {
        c6j c6jVar = this.f238209J;
        c6j c6jVar2 = c6jVar.f34551f;
        if (c6jVar2 != null && c6jVar2.f34551f == c6jVar) {
            return true;
        }
        c6j c6jVar3 = this.f238211L;
        c6j c6jVar4 = c6jVar3.f34551f;
        return c6jVar4 != null && c6jVar4.f34551f == c6jVar3;
    }

    public v7j(int i, int i2) {
        this.f238226a = false;
        this.f238232d = null;
        this.f238234e = null;
        this.f238236f = new boolean[]{true, true};
        this.f238238g = true;
        this.f238240h = -1;
        this.f238242i = -1;
        this.f238244j = new itd1(this);
        this.f238248l = false;
        this.f238250m = false;
        this.f238252n = false;
        this.f238254o = false;
        this.f238256p = -1;
        this.f238258q = -1;
        this.f238260r = 0;
        this.f238262s = 0;
        this.f238264t = 0;
        this.f238266u = new int[2];
        this.f238267v = 0;
        this.f238268w = 0;
        this.f238269x = 1.0f;
        this.f238270y = 0;
        this.f238271z = 0;
        this.f238200A = 1.0f;
        this.f238201B = -1;
        this.f238202C = 1.0f;
        this.f238203D = new int[]{Alert.DURATION_SHOW_INDEFINITELY, Alert.DURATION_SHOW_INDEFINITELY};
        this.f238204E = Float.NaN;
        this.f238205F = false;
        this.f238206G = false;
        this.f238207H = 0;
        this.f238208I = 0;
        c6j c6jVar = new c6j(this, 2);
        this.f238209J = c6jVar;
        c6j c6jVar2 = new c6j(this, 3);
        this.f238210K = c6jVar2;
        c6j c6jVar3 = new c6j(this, 4);
        this.f238211L = c6jVar3;
        c6j c6jVar4 = new c6j(this, 5);
        this.f238212M = c6jVar4;
        c6j c6jVar5 = new c6j(this, 6);
        this.f238213N = c6jVar5;
        this.f238214O = new c6j(this, 8);
        this.f238215P = new c6j(this, 9);
        c6j c6jVar6 = new c6j(this, 7);
        this.f238216Q = c6jVar6;
        this.f238217R = new c6j[]{c6jVar, c6jVar3, c6jVar2, c6jVar4, c6jVar5, c6jVar6};
        this.f238218S = new ArrayList();
        this.f238219T = new boolean[2];
        u7j u7jVar = u7j.f227710a;
        this.f238220U = new u7j[]{u7jVar, u7jVar};
        this.f238221V = null;
        this.f238224Y = 0.0f;
        this.f238225Z = -1;
        this.f238231c0 = 0;
        this.f238237f0 = 0.5f;
        this.f238239g0 = 0.5f;
        this.f238243i0 = 0;
        this.f238245j0 = false;
        this.f238247k0 = null;
        this.f238249l0 = 0;
        this.f238251m0 = 0;
        this.f238253n0 = new float[]{-1.0f, -1.0f};
        this.f238255o0 = new v7j[]{null, null};
        this.f238257p0 = new v7j[]{null, null};
        this.f238259q0 = null;
        this.f238261r0 = null;
        this.f238263s0 = -1;
        this.f238265t0 = -1;
        this.f238227a0 = 0;
        this.f238229b0 = 0;
        this.f238222W = i;
        this.f238223X = i2;
        m84874a();
    }
}
