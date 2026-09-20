package p204p;

import android.content.Context;
import android.content.res.Resources;
import android.webkit.MimeTypeMap;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import com.spotify.mobius.Next;
import com.spotify.music.R;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class psh {

    /* JADX INFO: renamed from: a */
    public static sd40 f180858a;

    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00be  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00da  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x0104  */
    /* JADX WARN: Code duplicated, block: B:87:0x0112  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m70857a(float f, float f2, int i, int i2, long j, long j2, xq00 xq00Var, fxh0 fxh0Var) {
        int i3;
        float f3;
        boolean z;
        fxh0 fxh0Var2;
        long j3;
        float f4;
        pgv0 pgv0VarM91796v;
        long j4;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objM91750T;
        float f5;
        long j5;
        xq00Var.m91775k0(-1712277950);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91764f(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91760d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= xq00Var.m91760d(2.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= xq00Var.m91766g(fxh0Var) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                f3 = f2;
                i3 |= xq00Var.m91760d(f3) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                xq00Var.m91761d0();
                if ((i & 1) != 0 || xq00Var.m91735E()) {
                    if (i5 != 0) {
                        f3 = 16.0f;
                    }
                    j4 = leu.m58815a(xq00Var).f112823a.f229876c;
                    i4 = i3 & (-458753);
                } else {
                    xq00Var.m91757b0();
                    i4 = i3 & (-458753);
                    j4 = j2;
                }
                xq00Var.m91790s();
                if ((57344 & i4) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean zM91764f = z2 | xq00Var.m91764f(j4);
                if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z7 = zM91764f | z3;
                if ((i4 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z8 = z4 | z7;
                if ((i4 & 896) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z6 = z8 | z5;
                objM91750T = xq00Var.m91750T();
                if (!z6 || objM91750T == t6x0.f217647t) {
                    f5 = f3;
                    j5 = j4;
                    objM91750T = new omk(f5, j5, f, j);
                    xq00Var.m91793t0(objM91750T);
                } else {
                    f5 = f3;
                    j5 = j4;
                }
                fxh0Var2 = fxh0Var;
                xud.m92135b((i4 >> 9) & 14, (gh00) objM91750T, xq00Var, fxh0Var2);
                f4 = f5;
                j3 = j5;
            } else {
                fxh0Var2 = fxh0Var;
                xq00Var.m91757b0();
                j3 = j2;
                f4 = f3;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new pmk(f, f4, i, i2, j, j3, fxh0Var2);
            }
        }
        i3 |= 24576;
        f3 = f2;
        if ((196608 & i) == 0) {
            i3 |= 65536;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z)) {
            xq00Var.m91761d0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    f3 = 16.0f;
                }
                j4 = leu.m58815a(xq00Var).f112823a.f229876c;
                i4 = i3 & (-458753);
            } else {
                if (i5 != 0) {
                    f3 = 16.0f;
                }
                j4 = leu.m58815a(xq00Var).f112823a.f229876c;
                i4 = i3 & (-458753);
            }
            xq00Var.m91790s();
            if ((57344 & i4) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean zM91764f2 = z2 | xq00Var.m91764f(j4);
            if ((i4 & ContentType.LONG_FORM_ON_DEMAND) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z9 = zM91764f2 | z3;
            if ((i4 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z10 = z4 | z9;
            if ((i4 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            z6 = z10 | z5;
            objM91750T = xq00Var.m91750T();
            if (z6) {
                f5 = f3;
                j5 = j4;
                objM91750T = new omk(f5, j5, f, j);
                xq00Var.m91793t0(objM91750T);
            } else {
                f5 = f3;
                j5 = j4;
                objM91750T = new omk(f5, j5, f, j);
                xq00Var.m91793t0(objM91750T);
            }
            fxh0Var2 = fxh0Var;
            xud.m92135b((i4 >> 9) & 14, (gh00) objM91750T, xq00Var, fxh0Var2);
            f4 = f5;
            j3 = j5;
        } else {
            fxh0Var2 = fxh0Var;
            xq00Var.m91757b0();
            j3 = j2;
            f4 = f3;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new pmk(f, f4, i, i2, j, j3, fxh0Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m70858b(long j, float f, gh00 gh00Var, fxh0 fxh0Var, float f2, eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, xq00 xq00Var, int i) {
        int i2;
        eh00 eh00Var4;
        float f3;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(-694452687);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91764f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91760d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91760d(2.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 16384 : 8192;
        }
        int i3 = i2 | 196608;
        if ((1572864 & i) == 0) {
            i3 |= xq00Var.m91770i(eh00Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= xq00Var.m91770i(eh00Var2) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            eh00Var4 = eh00Var3;
            i3 |= xq00Var.m91770i(eh00Var4) ? 67108864 : 33554432;
        } else {
            eh00Var4 = eh00Var3;
        }
        if (xq00Var.m91752Y(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objM77651H = sam.m77651H(gh00Var, xq00Var);
            kqi0 kqi0VarM77651H = sam.m77651H(eh00Var, xq00Var);
            Object objM77651H2 = sam.m77651H(eh00Var2, xq00Var);
            Object objM77651H3 = sam.m77651H(eh00Var3, xq00Var);
            boolean zM91766g = xq00Var.m91766g(kqi0VarM77651H);
            Object objM91750T = xq00Var.m91750T();
            if (zM91766g || objM91750T == obj) {
                objM91750T = new sq9(kqi0VarM77651H, 2);
                xq00Var.m91793t0(objM91750T);
            }
            w2a1 w2a1Var = w2a1.f247311a;
            fxh0 fxh0VarM69516a = pb61.m69516a(fxh0Var, w2a1Var, (PointerInputEventHandler) objM91750T);
            boolean zM91766g2 = xq00Var.m91766g(objM77651H2) | xq00Var.m91766g(objM77651H3) | xq00Var.m91766g(objM77651H);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g2 || objM91750T2 == obj) {
                objM91750T2 = new qmk(objM77651H2, objM77651H3, objM77651H, 0);
                xq00Var.m91793t0(objM91750T2);
            }
            f3 = 16.0f;
            m70857a(f, 16.0f, (i3 & 1022) | ((i3 >> 3) & 57344), 32, j, 0L, xq00Var, pb61.m69516a(fxh0VarM69516a, w2a1Var, (PointerInputEventHandler) objM91750T2));
        } else {
            xq00Var.m91757b0();
            f3 = f2;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new rmk(j, f, gh00Var, fxh0Var, f3, eh00Var, eh00Var2, eh00Var4, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m70859c(int i, xq00 xq00Var) {
        xq00Var.m91775k0(1623541462);
        if (xq00Var.m91752Y(i & 1, i != 0)) {
            p711.m69222a(mi21.m61822f(1.0f, cxh0.f43038a), new kyu(1, null, 3, null, zsf1.m96848h(leu.m58816b(xq00Var).f117230b.f224759b, 0.0f, 2), null, null, 0, null, 490), null, false, null, null, null, null, null, ghg.f79921c, null, ghg.f79922d, null, null, null, ghg.f79923e, xq00Var, 805306438, 196656, 30204);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tys(i, 13, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m70860d(rce1 rce1Var, long j, xq00 xq00Var, int i) {
        String quantityString;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-943375709);
        int i2 = i | (xq00Var2.m91766g(rce1Var) ? 4 : 2) | (xq00Var2.m91764f(j) ? 32 : 16);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            if (rce1Var.f197860c) {
                quantityString = AbstractC0000a.m12k(xq00Var2, -2134635810, R.string.first_streamed_track_label, xq00Var2, false);
            } else {
                xq00Var2.m91771i0(-345951488);
                Resources resources = ((Context) xq00Var2.m91774k(AndroidCompositionLocals_androidKt.f502b)).getResources();
                int i3 = rce1Var.f197858a;
                quantityString = resources.getQuantityString(R.plurals.number_of_play_count, i3, Integer.valueOf(i3));
                wj50.m88279p(quantityString);
                xq00Var2.m91788r(false);
            }
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, cxh0.f43038a);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var2.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var2);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var2);
            zsf1.m96833D(roh.f201266k, xq00Var2);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var2);
            ahf1.m25932d(quantityString, null, leu.m58818d(xq00Var2).f64975k, j, null, null, 2, false, new ol80(1), 0, null, xq00Var2, (i2 << 6) & 7168, 0, 1714);
            xq00Var2 = xq00Var;
            ahf1.m25932d(" • ".concat(rce1Var.f197859b), null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 2, false, new ol80(1), 0, null, xq00Var2, 0, 0, 1714);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new btg(rce1Var, j, i, 10);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m70861e(String str, String str2, xq00 xq00Var, int i) {
        int i2;
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(372283037);
        ug5 ug5Var = xq00Var2.f264811a;
        if ((i & 6) == 0) {
            i2 = i | (xq00Var2.m91766g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var2.m91766g(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (xq00Var2.m91752Y(i3 & 1, (i3 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46168f, false);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var2, fxh0VarM61820d);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            yhh yhhVar = roh.f201262g;
            zsf1.m96835F(m6d0VarM36007d, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            ub9 ub9Var = d7f0.f46145P0;
            fxh0 fxh0VarM96830A = zsf1.m96830A(cxh0Var, leu.m58816b(xq00Var2).f117230b.f224763f, 0.0f, 2);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, ub9Var, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96830A);
            xq00Var2.m91779m0();
            if (xq00Var2.f264808S) {
                xq00Var2.m91776l(c2087le);
            } else {
                xq00Var2.m91799w0();
            }
            zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var2);
            zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var2);
            AbstractC0000a.m20s(iHashCode2, xq00Var2, yhhVar3, xq00Var2, vlhVar);
            zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var2);
            ahf1.m25932d(str, null, fr0.m42477u(cxh0Var, 200, xq00Var2, xq00Var2).f64970f, leu.m58815a(xq00Var2).f112824b.f138757a, new h171(3), null, 0, false, null, 0, null, xq00Var2, i3 & 14, 0, 2018);
            xq00Var2 = xq00Var;
            ahf1.m25932d(str2, null, leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, new h171(3), null, 0, false, null, 0, null, xq00Var2, (i3 >> 3) & 14, 0, 2018);
            xq00Var2.m91788r(true);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gjl((byte) 0, i, 2, str, str2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m70862f(eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-900558672);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            fyf fyfVarM75772x = rkk.m75772x(846109784, new ut21(1, eh00Var), xq00Var);
            int i4 = i3 >> 3;
            int i5 = (i4 & 14) | 1572864 | (i4 & ContentType.LONG_FORM_ON_DEMAND);
            fxh0Var2 = cxh0.f43038a;
            e95.m38197b(eh00Var2, fxh0Var2, null, null, null, null, fyfVarM75772x, xq00Var, i5, 60);
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zd2(eh00Var, eh00Var2, fxh0Var2, i, 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x009c  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m70863g(float f, float f2, float f3, xq00 xq00Var, int i, int i2) {
        int i3;
        float f4;
        boolean z;
        float f5;
        pgv0 pgv0VarM91796v;
        float f6;
        xq00Var.m91775k0(1671820022);
        if ((i & 6) == 0) {
            i3 = (xq00Var.m91760d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= xq00Var.m91760d(f2) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                f4 = f3;
                i3 |= xq00Var.m91760d(f4) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (xq00Var.m91752Y(i3 & 1, z)) {
                if (i4 != 0) {
                    f6 = 0;
                } else {
                    f6 = f4;
                }
                dha.m36004a(xtm0.m92060G(nec.m64246i(zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f6, 0.0f, 0.0f, 13), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
                f5 = f6;
            } else {
                xq00Var.m91757b0();
                f5 = f4;
            }
            pgv0VarM91796v = xq00Var.m91796v();
            if (pgv0VarM91796v != null) {
                pgv0VarM91796v.f177419d = new tsx(f, f2, f5, i, i2, 1);
            }
        }
        i3 |= 384;
        f4 = f3;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq00Var.m91752Y(i3 & 1, z)) {
            if (i4 != 0) {
                f6 = 0;
            } else {
                f6 = f4;
            }
            dha.m36004a(xtm0.m92060G(nec.m64246i(zsf1.m96832C(mi21.m61824h(f2, mi21.m61838v(f, cxh0.f43038a)), 0.0f, f6, 0.0f, 0.0f, 13), leu.m58815a(xq00Var).f112823a.f229875b.f123093a, hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148186b)), 0L, null, 15), xq00Var, 0);
            f5 = f6;
        } else {
            xq00Var.m91757b0();
            f5 = f4;
        }
        pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new tsx(f, f2, f5, i, i2, 1);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m70864h(s930 s930Var) {
        int i = s930Var.f206832a;
        String str = s930Var.f206833b;
        if (str == null) {
            str = "Unknown";
        }
        return tfe.m80649g(i, ":", str);
    }

    /* JADX INFO: renamed from: i */
    public static final dq3 m70865i(aq3 aq3Var, Boolean bool) {
        if (aq3Var instanceof yp3) {
            return new bq3();
        }
        if (!(aq3Var instanceof zp3)) {
            throw new NoWhenBranchMatchedException();
        }
        zp3 zp3Var = (zp3) aq3Var;
        return new cq3(zp3Var.f284917a, zp3Var.f284918b, zp3Var.f284920d, zp3Var.f284921e, bool != null ? bool.booleanValue() : false);
    }

    /* JADX INFO: renamed from: j */
    public static final fxh0 m70866j(fxh0 fxh0Var, rka rkaVar) {
        return fxh0Var.mo34315F(new pka(rkaVar));
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, p.eh00] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, p.eh00] */
    /* JADX INFO: renamed from: k */
    public static final uxt m70867k(c6z0 c6z0Var) {
        if (c6z0Var instanceof nwt) {
            nwt nwtVar = (nwt) c6z0Var;
            fiz show = nwtVar.getShow();
            fiz fizVarMo65805g = nwtVar.mo65805g();
            ry8 ry8Var = (ry8) nwtVar.mo24876d().f168956c.invoke();
            th00 th00Var = nwtVar.mo24876d().f168954a;
            if (th00Var == null) {
                th00Var = ghg.f79919a;
            }
            return new uxt(show, fizVarMo65805g, new vxt(ry8Var, th00Var, nwtVar.mo24876d().f168955b));
        }
        if (c6z0Var instanceof flc1) {
            flc1 flc1Var = (flc1) c6z0Var;
            return new uxt(flc1Var.getShow(), new ysk(Boolean.FALSE, 27), new vxt(new f86(flc1Var), ghg.f79924f, ghg.f79925g));
        }
        if (!(c6z0Var instanceof tdf0)) {
            throw new NoWhenBranchMatchedException();
        }
        tdf0 tdf0Var = (tdf0) c6z0Var;
        fiz show2 = tdf0Var.getShow();
        ysk yskVar = new ysk(Boolean.FALSE, 27);
        ry8 ry8Var2 = (ry8) tdf0Var.mo24876d().f168956c.invoke();
        th00 th00Var2 = tdf0Var.mo24876d().f168954a;
        if (th00Var2 == null) {
            th00Var2 = ghg.f79920b;
        }
        return new uxt(show2, yskVar, new vxt(ry8Var2, th00Var2, tdf0Var.mo24876d().f168955b));
    }

    /* JADX INFO: renamed from: l */
    public static final String m70868l(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
    }

    /* JADX INFO: renamed from: m */
    public static final ay7 m70869m(pgo pgoVar, String str) {
        return fag1.m41173v(pgoVar, pag1.m69487w(new rko(laz.f131472t, 1, lg80.f133121U0, new pko(lg80.f133123W0), lg80.f133122V0), lg80.f133125X0), str);
    }

    /* JADX INFO: renamed from: n */
    public static final boolean m70870n(y190 y190Var, q5a0 q5a0Var) {
        if ((y190Var instanceof v190) && wj50.m88271j(((v190) y190Var).f236300a, q5a0Var.f185489c)) {
            return true;
        }
        return (y190Var instanceof x190) && ((x190) y190Var).f257107a.equals(q5a0Var.f185488b);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m70871o(q64 q64Var) {
        return q64Var.m72204b();
    }

    /* JADX INFO: renamed from: p */
    public static boolean m70872p(q64 q64Var) {
        return q64Var.m72205c();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m70873q(q64 q64Var) {
        return q64Var.m72207e();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m70874r(q64 q64Var) {
        return q64Var.m72206d();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m70875s(q64 q64Var) {
        return q64Var.m72209g();
    }

    /* JADX INFO: renamed from: t */
    public static boolean m70876t(q64 q64Var) {
        return q64Var.m72210h();
    }

    /* JADX INFO: renamed from: u */
    public static boolean m70877u(q64 q64Var) {
        return q64Var.m72212j();
    }

    /* JADX INFO: renamed from: v */
    public static boolean m70878v(q64 q64Var) {
        return q64Var.m72213k();
    }

    /* JADX INFO: renamed from: w */
    public static boolean m70879w(q64 q64Var) {
        return q64Var.m72208f();
    }

    /* JADX INFO: renamed from: x */
    public static final ov81 m70880x(ov81 ov81Var, List list) {
        return new ov81(ov81Var.f170446a, ov81Var.f170447b, ov81Var.f170448c, ov81Var.f170449d, ov81Var.f170450e, ov81Var.f170451f, ov81Var.f170452g, ov81Var.f170453h, tl11.m81029a(ov81Var.f170454i, list, null, 1021));
    }

    /* JADX INFO: renamed from: y */
    public static final wtb m70881y(wfj wfjVar) {
        if (wfjVar instanceof rfj) {
            return rtb.f202557a;
        }
        if (wfjVar instanceof sfj) {
            return stb.f213879a;
        }
        if (wfjVar instanceof ufj) {
            xfj xfjVar = ((ufj) wfjVar).f229823a;
            return new utb(xfjVar != null ? new vjr0(xfjVar.f261027a, xfjVar.f261028b) : null);
        }
        if (wfjVar instanceof tfj) {
            return ttb.f223567a;
        }
        boolean z = wfjVar instanceof vfj;
        vtb vtbVar = vtb.f244595a;
        if (z || wfjVar == null) {
            return vtbVar;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: z */
    public static final Next m70882z(jcp0 jcp0Var, icp0 icp0Var) {
        if (wj50.m88271j(jcp0Var.f111164a, icp0Var.f100860a) && jcp0Var.f111165b == icp0Var.f100861b && jcp0Var.f111166c == icp0Var.f100862c && jcp0Var.f111170g == icp0Var.f100866g && jcp0Var.f111168e == icp0Var.f100864e && jcp0Var.f111169f == icp0Var.f100865f && jcp0Var.f111171h == icp0Var.f100867h) {
            return Next.m15608j();
        }
        String str = icp0Var.f100860a;
        boolean z = icp0Var.f100861b;
        boolean z2 = icp0Var.f100862c;
        boolean z3 = icp0Var.f100866g;
        boolean z4 = icp0Var.f100865f;
        return Next.m15607i(new jcp0(str, z, z2, jcp0Var.f111167d, icp0Var.f100864e, z4, z3, icp0Var.f100867h), Collections.singleton(hcp0.f89872b));
    }
}
