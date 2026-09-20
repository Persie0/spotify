package p204p;

import android.net.Uri;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import java.util.Iterator;
import p000.C1636o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class s251 {

    /* JADX INFO: renamed from: a */
    public static final float f204900a = 16;

    /* JADX INFO: renamed from: b */
    public static final float f204901b = 64;

    /* JADX INFO: renamed from: a */
    public static final void m77034a(w5o0 w5o0Var, tiv0 tiv0Var, tiv0 tiv0Var2, float f, float f2, xh00 xh00Var, eh00 eh00Var, gh00 gh00Var, gh00 gh00Var2, xq00 xq00Var, int i) {
        int i2;
        eh00 eh00Var2;
        gh00 gh00Var3;
        float f3;
        xq00 xq00Var2;
        uum0 uum0Var;
        w5o0 w5o0Var2 = w5o0Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1120709224);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(w5o0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(tiv0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(tiv0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91760d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91760d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= xq00Var.m91770i(xh00Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            eh00Var2 = eh00Var;
            i2 |= xq00Var.m91770i(eh00Var2) ? 1048576 : 524288;
        } else {
            eh00Var2 = eh00Var;
        }
        if ((12582912 & i) == 0) {
            gh00Var3 = gh00Var;
            i2 |= xq00Var.m91770i(gh00Var3) ? 8388608 : 4194304;
        } else {
            gh00Var3 = gh00Var;
        }
        if ((i & 100663296) == 0) {
            i2 |= xq00Var.m91770i(gh00Var2) ? 67108864 : 33554432;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 38347923) != 38347922)) {
            int i3 = w5o0Var2.f248119a;
            boolean zM91762e = xq00Var.m91762e(i3);
            Object objM91750T = xq00Var.m91750T();
            if (zM91762e || objM91750T == ia7Var) {
                objM91750T = a831.m25015g(w5o0Var2.f248122d, xq00Var);
            }
            uum0 uum0Var2 = (uum0) objM91750T;
            boolean zM91762e2 = xq00Var.m91762e(i3);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91762e2 || objM91750T2 == ia7Var) {
                objM91750T2 = a831.m25015g(w5o0Var2.f248123e, xq00Var);
            }
            uum0 uum0Var3 = (uum0) objM91750T2;
            boolean zM91762e3 = xq00Var.m91762e(i3);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91762e3 || objM91750T3 == ia7Var) {
                objM91750T3 = a831.m25015g(w5o0Var2.f248124f, xq00Var);
            }
            uum0 uum0Var4 = (uum0) objM91750T3;
            boolean zM91762e4 = xq00Var.m91762e(i3);
            Object objM91750T4 = xq00Var.m91750T();
            if (zM91762e4 || objM91750T4 == ia7Var) {
                objM91750T4 = a831.m25015g(w5o0Var2.f248125g, xq00Var);
            }
            uum0 uum0Var5 = (uum0) objM91750T4;
            kqi0 kqi0VarM77651H = sam.m77651H(tiv0Var, xq00Var);
            kqi0 kqi0VarM77651H2 = sam.m77651H(tiv0Var2, xq00Var);
            wb9 wb9Var = d7f0.f46174i;
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
            Integer numValueOf = Integer.valueOf(i3);
            boolean zM91770i = ((458752 & i2) == 131072) | ((i2 & 3670016) == 1048576) | xq00Var.m91770i(kqi0VarM77651H) | xq00Var.m91770i(uum0Var2) | xq00Var.m91770i(uum0Var3) | xq00Var.m91770i(uum0Var5) | xq00Var.m91770i(uum0Var4) | ((234881024 & i2) == 67108864) | xq00Var.m91770i(kqi0VarM77651H2) | ((i2 & 7168) == 2048) | ((29360128 & i2) == 8388608) | ((i2 & 57344) == 16384);
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91770i || objM91750T5 == ia7Var) {
                eh00 eh00Var3 = eh00Var2;
                uum0Var = uum0Var4;
                n251 n251Var = new n251(eh00Var3, xh00Var, gh00Var2, f, kqi0VarM77651H, uum0Var2, uum0Var3, uum0Var5, uum0Var, kqi0VarM77651H2, gh00Var3, f2);
                f3 = f;
                xq00Var.m91793t0(n251Var);
                objM91750T5 = n251Var;
            } else {
                f3 = f;
                uum0Var = uum0Var4;
            }
            fxh0 fxh0VarM69516a = pb61.m69516a(fxh0VarM61820d, numValueOf, (PointerInputEventHandler) objM91750T5);
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM69516a);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            float fM84031v = uum0Var5.m84031v() * ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35988P0(f3);
            int i4 = (int) (3.0f * f3);
            w5o0Var2 = w5o0Var;
            Uri uri = Uri.parse(w5o0Var2.f248120b);
            String str = w5o0Var2.f248121c;
            fxh0 fxh0VarM61834r = mi21.m61834r(fM84031v, cxh0Var);
            boolean zM91770i2 = xq00Var.m91770i(uum0Var);
            Object objM91750T6 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T6 == ia7Var) {
                objM91750T6 = new dia(uum0Var, 18);
                xq00Var.m91793t0(objM91750T6);
            }
            xq00Var2 = xq00Var;
            m2h1.m60579e(uri, i4, l0y0.m57831m(fxh0VarM61834r, (gh00) objM91750T6), str, xq00Var2, 0);
            xq00Var2.m91788r(true);
        } else {
            f3 = f;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new o251(w5o0Var2, tiv0Var, tiv0Var2, f3, f2, xh00Var, eh00Var, gh00Var, gh00Var2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m77035b(w5o0 w5o0Var, float f, float f2, float f3, xq00 xq00Var, int i) {
        int i2;
        xq00Var.m91775k0(-441304504);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91766g(w5o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91760d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91760d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91760d(f3) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            float fMo35988P0 = ((yqq) xq00Var.m91774k(wsh.f254617h)).mo35988P0(f) * w5o0Var.f248125g;
            int i3 = (int) (3.0f * f);
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM61834r = mi21.m61834r(fMo35988P0, cxh0Var);
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM61834r);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            Uri uri = Uri.parse(w5o0Var.f248120b);
            String str = w5o0Var.f248121c;
            fxh0 fxh0VarM61820d = mi21.m61820d(1.0f, cxh0Var);
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256) | ((i2 & 7168) == 2048);
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new C1955hu(w5o0Var, f2, f3, 4);
                xq00Var.m91793t0(objM91750T);
            }
            m2h1.m60579e(uri, i3, l0y0.m57831m(fxh0VarM61820d, (gh00) objM91750T), str, xq00Var, 0);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e9m0(w5o0Var, f, f2, f3, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m77036c(qf40 qf40Var, float f, float f2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        float f3 = f;
        xq00Var.m91775k0(788276804);
        float f4 = f2;
        int i2 = i | (xq00Var.m91766g(qf40Var) ? 4 : 2) | (xq00Var.m91760d(f3) ? 32 : 16) | (xq00Var.m91760d(f4) ? 256 : 128) | (xq00Var.m91770i(fxh0Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f5 = 0.33783785f * f3;
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(c2087le);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            Iterator itM42470n = fr0.m42470n(xq00Var, fxh0VarM48286s, roh.f201259d, 637822237, qf40Var);
            while (itM42470n.hasNext()) {
                m77035b((w5o0) itM42470n.next(), f5, f3, f4, xq00Var, (i2 << 3) & 8064);
                f3 = f;
                f4 = f2;
            }
            xq00Var.m91788r(false);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new lia(qf40Var, f, f2, fxh0Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m77037d(qf40 qf40Var, tiv0 tiv0Var, tiv0 tiv0Var2, zh00 zh00Var, eh00 eh00Var, th00 th00Var, gh00 gh00Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        long jFloatToRawIntBits;
        float f;
        Object q251Var;
        char c;
        qf40 qf40Var2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(2136550790);
        eh00 eh00Var2 = eh00Var;
        int i2 = i | (xq00Var.m91766g(qf40Var) ? 4 : 2) | (xq00Var.m91770i(tiv0Var) ? 32 : 16) | (xq00Var.m91770i(tiv0Var2) ? 256 : 128) | (xq00Var.m91770i(zh00Var) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var2) ? 16384 : 8192) | (xq00Var.m91770i(th00Var) ? 131072 : 65536) | (xq00Var.m91770i(gh00Var) ? 1048576 : 524288) | (xq00Var.m91770i(fxh0Var) ? 8388608 : 4194304);
        if (xq00Var.m91752Y(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objM91750T = xq00Var.m91750T();
            tiv0 tiv0Var3 = tiv0.f220750e;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(tiv0Var3);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            yqq yqqVar = (yqq) xq00Var.m91774k(wsh.f254617h);
            float f2 = 0.33783785f * (tiv0Var.f220753c - tiv0Var.f220751a);
            float fMo35989Z0 = yqqVar.mo35989Z0(f204900a);
            float fMo35989Z1 = yqqVar.mo35989Z0(f204901b);
            tiv0 tiv0Var4 = (tiv0) kqi0Var.getValue();
            if (tiv0Var.equals(tiv0Var3) || wj50.m88271j(tiv0Var4, tiv0Var3)) {
                jFloatToRawIntBits = 0;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tiv0Var.m80934f() >> 32)) - Float.intBitsToFloat((int) (tiv0Var4.m80934f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tiv0Var.m80934f() & 4294967295L)) - Float.intBitsToFloat((int) (tiv0Var4.m80934f() & 4294967295L)))) & 4294967295L);
            }
            boolean zM91770i = xq00Var.m91770i(kqi0Var);
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91770i || objM91750T2 == obj) {
                objM91750T2 = new p511(kqi0Var, 12);
                xq00Var.m91793t0(objM91750T2);
            }
            fxh0 fxh0VarM85877w = vkf1.m85877w(fxh0Var, (gh00) objM91750T2);
            boolean zM91760d = ((i2 & 14) == 4) | xq00Var.m91760d(f2) | xq00Var.m91760d(fMo35989Z0) | xq00Var.m91760d(fMo35989Z1) | xq00Var.m91764f(jFloatToRawIntBits) | xq00Var.m91770i(tiv0Var);
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91760d || objM91750T3 == obj) {
                f = fMo35989Z1;
                c = 0;
                qf40Var2 = qf40Var;
                q251Var = new q251(qf40Var2, f2, fMo35989Z0, f, jFloatToRawIntBits, tiv0Var);
                xq00Var.m91793t0(q251Var);
            } else {
                f = fMo35989Z1;
                q251Var = objM91750T3;
                c = 0;
                qf40Var2 = qf40Var;
            }
            m6d0 m6d0Var = (m6d0) q251Var;
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM85877w);
            soh.f211194A.getClass();
            eh00 eh00Var3 = roh.f201257b;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var3);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0Var, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            Iterator itM42470n = fr0.m42470n(xq00Var, fxh0VarM48286s, roh.f201259d, 1926387629, qf40Var2);
            int i3 = 0;
            while (itM42470n.hasNext()) {
                Object next = itM42470n.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    h6f.m46722S();
                    throw null;
                }
                w5o0 w5o0Var = (w5o0) next;
                boolean zM91762e = ((r20 & 7168) == 2048) | xq00Var.m91762e(i3);
                Object objM91750T4 = xq00Var.m91750T();
                if (zM91762e || objM91750T4 == obj) {
                    objM91750T4 = new fx3(zh00Var, i3, 1);
                    xq00Var.m91793t0(objM91750T4);
                }
                xh00 xh00Var = (xh00) objM91750T4;
                boolean zM91762e2 = ((458752 & r20) == c) | xq00Var.m91762e(i3);
                Object objM91750T5 = xq00Var.m91750T();
                if (zM91762e2 || objM91750T5 == obj) {
                    objM91750T5 = new vvj(i3, 3, th00Var);
                    xq00Var.m91793t0(objM91750T5);
                }
                gh00 gh00Var2 = (gh00) objM91750T5;
                int i5 = i2 << 6;
                float f3 = f2;
                m77034a(w5o0Var, tiv0Var, tiv0Var2, f3, f, xh00Var, eh00Var2, gh00Var2, gh00Var, xq00Var, (r20 & 1008) | (i5 & 3670016) | (i5 & 234881024));
                eh00Var2 = eh00Var;
                f2 = f3;
                i3 = i4;
            }
            xq00Var.m91788r(false);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C1636o(qf40Var, tiv0Var, tiv0Var2, zh00Var, eh00Var, th00Var, gh00Var, fxh0Var, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m77038e(float f, float f2, float f3, tiv0 tiv0Var, tiv0 tiv0Var2, float f4) {
        tiv0 tiv0Var3 = tiv0.f220750e;
        if (tiv0Var2.equals(tiv0Var3) || tiv0Var.equals(tiv0Var3)) {
            return false;
        }
        float fM38555d = edb.m38555d(tiv0Var.f220753c, tiv0Var.f220751a, f, Float.intBitsToFloat((int) (tiv0Var.m80934f() >> 32)));
        float fM38555d2 = edb.m38555d(tiv0Var.f220754d, tiv0Var.f220752b, f2, Float.intBitsToFloat((int) (tiv0Var.m80934f() & 4294967295L)));
        float f5 = (f4 / 2.0f) * f3;
        float f6 = fM38555d - f5;
        float f7 = fM38555d2 - f5;
        float f8 = fM38555d + f5;
        float f9 = fM38555d2 + f5;
        return (tiv0Var2.f220751a < f8) & (f6 < tiv0Var2.f220753c) & (f7 < tiv0Var2.f220754d) & (tiv0Var2.f220752b < f9);
    }
}
