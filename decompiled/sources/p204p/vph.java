package p204p;

import androidx.compose.runtime.ComposeRuntimeError;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class vph {

    /* JADX INFO: renamed from: a */
    public static final mol0 f243691a = new mol0(ContextTrack.Metadata.KEY_PROVIDER);

    /* JADX INFO: renamed from: b */
    public static final mol0 f243692b = new mol0(ContextTrack.Metadata.KEY_PROVIDER);

    /* JADX INFO: renamed from: c */
    public static final mol0 f243693c = new mol0("compositionLocalMap");

    /* JADX INFO: renamed from: d */
    public static final mol0 f243694d = new mol0("providers");

    /* JADX INFO: renamed from: e */
    public static final mol0 f243695e = new mol0("reference");

    /* JADX INFO: renamed from: a */
    public static final void m86124a(String str) {
        throw new ComposeRuntimeError(s571.m77251j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX INFO: renamed from: b */
    public static final Void m86125b(String str) {
        throw new ComposeRuntimeError(s571.m77251j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01c5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [p.lau] */
    /* JADX INFO: renamed from: c */
    public static final p2i0 m86126c(msh mshVar, q2i0 q2i0Var, wu21 wu21Var, ug5 ug5Var) {
        ou21 ou21Var;
        ?? arrayList;
        rq00 rq00Var;
        long[] jArr;
        rq00 rq00Var2;
        ou21 ou21Var2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        boolean zM36648g;
        Object obj;
        int i3;
        ou21 ou21Var3;
        int i4;
        long j2;
        Object obj2;
        q2i0 q2i0Var2 = q2i0Var;
        ou21 ou21Var4 = new ou21();
        if (wu21Var.f255074e != null) {
            ou21Var4.m68077b();
        }
        if (wu21Var.f255075f != null) {
            ou21Var4.f170145X = new toi0();
        }
        int i5 = wu21Var.f255089t;
        if (ug5Var != null && wu21Var.m88968F(i5) > 0) {
            int iM88969G = wu21Var.f255091v;
            while (iM88969G > 0 && !wu21Var.m89010y(iM88969G)) {
                iM88969G = wu21Var.m88969G(wu21Var.f255071b, iM88969G);
            }
            if (iM88969G >= 0 && wu21Var.m89010y(iM88969G)) {
                Object objM88967E = wu21Var.m88967E(iM88969G);
                int i6 = iM88969G + 1;
                int iM89006u = wu21Var.m89006u(iM88969G) + iM88969G;
                int iM88968F = 0;
                while (i6 < iM89006u) {
                    int iM89006u2 = wu21Var.m89006u(i6) + i6;
                    if (iM89006u2 > i5) {
                        break;
                    }
                    iM88968F += wu21Var.m89010y(i6) ? 1 : wu21Var.m88968F(i6);
                    i6 = iM89006u2;
                }
                int iM88968F2 = wu21Var.m89010y(i5) ? 1 : wu21Var.m88968F(i5);
                ug5Var.mo67763o(objM88967E);
                ug5Var.mo53944f(iM88968F, iM88968F2);
                ug5Var.mo67764u();
            }
        }
        rq00 rq00Var3 = q2i0Var2.f184647e;
        if (rq00Var3.m76206a()) {
            if (mshVar.f146778L0.f40900e > 0) {
                arrayList = new ArrayList();
                cqi0 cqi0Var = mshVar.f146778L0;
                long[] jArr3 = cqi0Var.f40896a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j3 = jArr3[i7];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j3 & 255) < 128) {
                                    int i11 = (i7 << 3) + i10;
                                    int i12 = i8;
                                    Object obj3 = cqi0Var.f40897b[i11];
                                    rq00Var2 = rq00Var3;
                                    Object obj4 = cqi0Var.f40898c[i11];
                                    if (obj4 instanceof dqi0) {
                                        dqi0 dqi0Var = (dqi0) obj4;
                                        Object[] objArr = dqi0Var.f52019b;
                                        long[] jArr4 = dqi0Var.f52018a;
                                        jArr2 = jArr3;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            j = j3;
                                            int i13 = 0;
                                            while (true) {
                                                long j4 = jArr4[i13];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                    int i15 = 0;
                                                    while (i15 < i14) {
                                                        if ((j4 & 255) < 128) {
                                                            i3 = i15;
                                                            int i16 = (i13 << 3) + i3;
                                                            j2 = j4;
                                                            Object obj5 = objArr[i16];
                                                            pgv0 pgv0Var = (pgv0) obj3;
                                                            obj2 = obj3;
                                                            rq00 rq00Var4 = pgv0Var.f177418c;
                                                            if (rq00Var4 != null) {
                                                                rq00 rq00VarM73117n = qkg1.m73117n(rq00Var2);
                                                                ou21Var3 = ou21Var4;
                                                                rq00 rq00VarM73117n2 = qkg1.m73117n(rq00Var4);
                                                                int iM88989c = wu21Var.m88989c(rq00VarM73117n);
                                                                i4 = length;
                                                                int i17 = wu21Var.f255071b[(iM88989c * 5) + 3] + iM88989c;
                                                                int i18 = rq00VarM73117n2.f201675a;
                                                                if (iM88989c <= i18 && i18 < i17) {
                                                                    arrayList.add(pft0.m69840u(pgv0Var, obj5));
                                                                    dqi0Var.m36654m(i16);
                                                                }
                                                            } else {
                                                                ou21Var3 = ou21Var4;
                                                                i4 = length;
                                                            }
                                                        } else {
                                                            i3 = i15;
                                                            ou21Var3 = ou21Var4;
                                                            i4 = length;
                                                            j2 = j4;
                                                            obj2 = obj3;
                                                        }
                                                        j4 = j2 >> i12;
                                                        i15 = i3 + 1;
                                                        obj3 = obj2;
                                                        length = i4;
                                                        ou21Var4 = ou21Var3;
                                                    }
                                                    ou21Var2 = ou21Var4;
                                                    i = length;
                                                    obj = obj3;
                                                    if (i14 != i12) {
                                                        break;
                                                    }
                                                } else {
                                                    ou21Var2 = ou21Var4;
                                                    i = length;
                                                    obj = obj3;
                                                }
                                                if (i13 == length2) {
                                                    break;
                                                }
                                                i13++;
                                                obj3 = obj;
                                                length = i;
                                                ou21Var4 = ou21Var2;
                                                i12 = 8;
                                            }
                                        } else {
                                            ou21Var2 = ou21Var4;
                                            i = length;
                                            j = j3;
                                        }
                                        zM36648g = dqi0Var.m36648g();
                                    } else {
                                        ou21Var2 = ou21Var4;
                                        jArr2 = jArr3;
                                        i = length;
                                        j = j3;
                                        pgv0 pgv0Var2 = (pgv0) obj3;
                                        rq00 rq00Var5 = pgv0Var2.f177418c;
                                        if (rq00Var5 != null) {
                                            rq00 rq00VarM73117n3 = qkg1.m73117n(rq00Var2);
                                            rq00 rq00VarM73117n4 = qkg1.m73117n(rq00Var5);
                                            int iM88989c2 = wu21Var.m88989c(rq00VarM73117n3);
                                            int i19 = wu21Var.f255071b[(iM88989c2 * 5) + 3] + iM88989c2;
                                            int i20 = rq00VarM73117n4.f201675a;
                                            if (iM88989c2 > i20 || i20 >= i19) {
                                                zM36648g = false;
                                            } else {
                                                arrayList.add(pft0.m69840u(pgv0Var2, obj4));
                                                zM36648g = true;
                                            }
                                        } else {
                                            zM36648g = false;
                                        }
                                    }
                                    if (zM36648g) {
                                        cqi0Var.m33628l(i11);
                                    }
                                    i2 = 8;
                                } else {
                                    rq00Var2 = rq00Var3;
                                    ou21Var2 = ou21Var4;
                                    jArr2 = jArr3;
                                    i = length;
                                    j = j3;
                                    i2 = i8;
                                }
                                j3 = j >> i2;
                                i10++;
                                i8 = i2;
                                rq00Var3 = rq00Var2;
                                jArr3 = jArr2;
                                length = i;
                                ou21Var4 = ou21Var2;
                            }
                            rq00Var = rq00Var3;
                            ou21Var = ou21Var4;
                            jArr = jArr3;
                            int i21 = length;
                            if (i9 != i8) {
                                break;
                            }
                            length = i21;
                        } else {
                            rq00Var = rq00Var3;
                            ou21Var = ou21Var4;
                            jArr = jArr3;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        rq00Var3 = rq00Var;
                        jArr3 = jArr;
                        ou21Var4 = ou21Var;
                    }
                } else {
                    ou21Var = ou21Var4;
                }
            } else {
                ou21Var = ou21Var4;
                arrayList = lau.f131415a;
            }
            q2i0Var2 = q2i0Var;
            q2i0Var2.f184648f = g6f.m43700N0(arrayList, q2i0Var2.f184648f);
        } else {
            ou21Var = ou21Var4;
        }
        wu21 wu21VarM68080i = ou21Var.m68080i();
        try {
            wu21VarM68080i.m88990d();
            wu21VarM68080i.m88981S(q2i0Var2.f184643a, t6x0.f217647t, false, 126665345);
            wu21.m88962z(wu21VarM68080i);
            wu21VarM68080i.m88983U(q2i0Var2.f184644b);
            List listM88966D = wu21Var.m88966D(qkg1.m73117n(q2i0Var2.f184647e), wu21VarM68080i);
            wu21VarM68080i.m88976N();
            wu21VarM68080i.m88995j();
            wu21VarM68080i.m88996k();
            wu21VarM68080i.m88991e(true);
            ou21 ou21Var5 = ou21Var;
            p2i0 p2i0Var = new p2i0(ou21Var5);
            if (!wxg1.m89274E(ou21Var5, listM88966D)) {
                return p2i0Var;
            }
            uph uphVar = new uph(mshVar, q2i0Var2);
            wu21 wu21VarM68080i2 = ou21Var5.m68080i();
            try {
                wxg1.m89271B(wu21VarM68080i2, listM88966D, uphVar);
                return p2i0Var;
            } finally {
                wu21VarM68080i2.m88991e(false);
            }
        } catch (Throwable th) {
            wu21VarM68080i.m88991e(false);
            throw th;
        }
    }
}
