package p204p;

import android.content.Context;
import com.comscore.streaming.ContentType;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.music.R;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC0000a;
import p000.C1636o;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mag1 {

    /* JADX INFO: renamed from: a */
    public static final l06 f141590a = new l06("StdlibClassFinder", 7);

    /* JADX INFO: renamed from: b */
    public static sd40 f141591b;

    /* JADX INFO: renamed from: c */
    public static sd40 f141592c;

    /* JADX INFO: renamed from: a */
    public static void m61291a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!m61309s(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m61309s(b3) && !m61309s(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw InvalidProtocolBufferException.m1951c();
    }

    /* JADX INFO: renamed from: b */
    public static void m61292b(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* JADX INFO: renamed from: c */
    public static void m61293c(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m61309s(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m61309s(b3)))) {
            throw InvalidProtocolBufferException.m1951c();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* JADX INFO: renamed from: d */
    public static void m61294d(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m61309s(b2)) {
            throw InvalidProtocolBufferException.m1951c();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* JADX INFO: renamed from: e */
    public static boolean m61295e(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: f */
    public static boolean m61296f(byte b) {
        return b < -16;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m61297g(byte b) {
        return b < -32;
    }

    /* JADX INFO: renamed from: h */
    public static final void m61298h(eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        xq00Var.m91775k0(-1672174588);
        int i2 = (xq00Var.m91770i(eh00Var) ? 4 : 2) | i | (xq00Var.m91770i(eh00Var2) ? 32 : 16) | (xq00Var.m91770i(eh00Var3) ? 256 : 128);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new n2b(20, eh00Var3);
                xq00Var.m91793t0(objM91750T);
            }
            xq00Var2 = xq00Var;
            kku.m56742b((eh00) objM91750T, null, null, x6g.f258670a, x6g.f258671b, rkk.m75772x(1355895942, new C2463um(16, eh00Var), xq00Var), rkk.m75772x(1934662087, new C2463um(17, eh00Var2), xq00Var), xq00Var2, 1797120, 6);
        } else {
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new ooe(i, 0, eh00Var, eh00Var2, eh00Var3);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m61299i(int i, xq00 xq00Var, fxh0 fxh0Var, boolean z) {
        int i2;
        String strM12k;
        xq00Var.m91775k0(-2092175813);
        if ((i & 48) == 0) {
            i2 = i | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        } else {
            i2 = i;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            String strM54977L = k0e1.m54977L(R.string.compose_musicvideorowlabel_video_text, xq00Var);
            if (z) {
                strM12k = AbstractC0000a.m12k(xq00Var, -536254711, R.string.compose_musicvideorowlabel_video_label_delimiter, xq00Var, false);
            } else {
                xq00Var.m91771i0(556062051);
                xq00Var.m91788r(false);
                strM12k = "";
            }
            String strM77250i = s571.m77250i(strM54977L, strM12k);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            mwu mwuVar = mwu.f147884c;
            float f = leu.m58816b(xq00Var).f117235g.f159603a;
            cxh0 cxh0Var = cxh0.f43038a;
            y85.m93057b(mwuVar, qgj.f188480a, mi21.m61834r(f, cxh0Var), 0L, 0L, false, xq00Var, mwu.f147885d | 48, 56);
            riw0.m75615i(xq00Var, mi21.m61834r(4, cxh0Var));
            ahf1.m25932d(strM77250i, epv0.m39673I("videoLabelTag", cxh0Var), leu.m58818d(xq00Var).f64974j, leu.m58815a(xq00Var).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2032);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wl8(z, fxh0Var, i, 7, (byte) 0);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m61300j(eh00 eh00Var, eh00 eh00Var2, eh00 eh00Var3, eh00 eh00Var4, eh00 eh00Var5, eh00 eh00Var6, eh00 eh00Var7, jul0 jul0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        fxh0 fxh0Var2;
        xq00Var.m91775k0(332072266);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (xq00Var.m91770i(eh00Var2) ? 32 : 16) | (xq00Var.m91770i(eh00Var3) ? 256 : 128) | (xq00Var.m91770i(eh00Var4) ? 2048 : 1024) | (xq00Var.m91770i(eh00Var5) ? 16384 : 8192) | (xq00Var.m91770i(eh00Var6) ? 131072 : 65536) | (xq00Var.m91770i(eh00Var7) ? 1048576 : 524288);
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? xq00Var.m91766g(jul0Var) : xq00Var.m91770i(jul0Var) ? 8388608 : 4194304;
        }
        int i4 = i3 | 100663296;
        if (xq00Var.m91752Y(i4 & 1, (38347923 & i4) != 38347922)) {
            y0v.m92603a(2, rkk.m75772x(-1244971306, new C1636o(jul0Var, eh00Var, eh00Var2, eh00Var3, eh00Var4, eh00Var5, eh00Var6, eh00Var7), xq00Var), xq00Var, 390, 2);
            fxh0Var2 = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new C2474ux(eh00Var, eh00Var2, eh00Var3, eh00Var4, eh00Var5, eh00Var6, eh00Var7, jul0Var, fxh0Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m61301k(int i, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(-52419159);
        int i2 = i | (xq00Var.m91770i(eh00Var) ? 4 : 2) | 48;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM96865y = zsf1.m96865y(leu.m58816b(xq00Var).f117230b.f224763f, hdi.m47247x(mi21.m61822f(1.0f, cxh0Var), false, null, null, null, eh00Var, 15));
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var, 0);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96865y);
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
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            y85.m93057b(bpu.f29605c, qgj.f188480a, mi21.m61834r(leu.m58816b(xq00Var).f117235g.f159604b, cxh0Var), 0L, 0L, false, xq00Var, bpu.f29606d | 48, 56);
            ahf1.m25932d(k0e1.m54977L(R.string.puffin_reset_button_title, xq00Var), zsf1.m96832C(cxh0Var, leu.m58816b(xq00Var).f117230b.f224761d, 0.0f, 0.0f, 0.0f, 14), leu.m58818d(xq00Var).f64974j, 0L, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2040);
            xq00Var.m91788r(true);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zoc0(eh00Var, fxh0Var2, i, 4);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m61302l(qf40 qf40Var, hzy0 hzy0Var, noa0 noa0Var, cp80 cp80Var, fxh0 fxh0Var, w2z0 w2z0Var, boolean z, gh00 gh00Var, xq00 xq00Var, int i) {
        boolean z2;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(1312204461);
        int i2 = i | (xq00Var.m91766g(qf40Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(hzy0Var) ? 32 : 16;
        }
        int i3 = i2 | (xq00Var.m91770i(noa0Var) ? 256 : 128) | (xq00Var.m91770i(cp80Var) ? 2048 : 1024) | (xq00Var.m91770i(null) ? 16384 : 8192) | (xq00Var.m91766g(null) ? 131072 : 65536) | (xq00Var.m91770i(null) ? 1048576 : 524288);
        if ((i & 12582912) == 0) {
            i3 |= xq00Var.m91770i(fxh0Var) ? 8388608 : 4194304;
        }
        int i4 = i3 | (xq00Var.m91766g(w2z0Var) ? 67108864 : 33554432) | (xq00Var.m91768h(z) ? 536870912 : 268435456);
        if (xq00Var.m91752Y(i4 & 1, ((i4 & 306783379) == 306783378 && ((xq00Var.m91770i(gh00Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            kqi0 kqi0VarM77651H = sam.m77651H(noa0Var, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == obj) {
                objM91750T = new y3o0(kqi0VarM77651H, 17);
                xq00Var.m91793t0(objM91750T);
            }
            gh00 gh00Var2 = (gh00) objM91750T;
            yw70 yw70VarM30763a = bx70.m30763a(0, 3, xq00Var);
            w290 w290VarM58368q = l6l.m58368q(yw70VarM30763a, cp80Var, null, xq00Var, 4);
            kqi0 kqi0VarM77671j = sam.m77671j(w290VarM58368q.f247291b, xq00Var, 0);
            int i5 = i4 & 14;
            boolean z3 = (i5 == 4) | ((i4 & 234881024) == 67108864);
            Object objM91750T2 = xq00Var.m91750T();
            if (z3 || objM91750T2 == obj) {
                objM91750T2 = Integer.valueOf(((sp80) kqi0VarM77671j.getValue()).f212768a);
                xq00Var.m91793t0(objM91750T2);
            }
            int iIntValue = ((Number) objM91750T2).intValue();
            boolean z4 = i5 == 4;
            Object objM91750T3 = xq00Var.m91750T();
            Object obj2 = objM91750T3;
            if (z4 || objM91750T3 == obj) {
                ArrayList arrayList = new ArrayList(i6f.m49804T(qf40Var, 10));
                Iterator<E> it = qf40Var.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e4z0) it.next()).getId());
                }
                xq00Var.m91793t0(arrayList);
                obj2 = arrayList;
            }
            List list = (List) obj2;
            boolean zM91766g = xq00Var.m91766g(((sp80) kqi0VarM77671j.getValue()).f212769b);
            Object objM91750T4 = xq00Var.m91750T();
            Object obj3 = objM91750T4;
            if (zM91766g || objM91750T4 == obj) {
                List list2 = ((sp80) kqi0VarM77671j.getValue()).f212769b;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((sec1) it2.next()).f208275b.toString());
                }
                xq00Var.m91793t0(arrayList2);
                obj3 = arrayList2;
            }
            List list3 = (List) obj3;
            xq00Var.m91771i0(-907554059);
            xq00Var.m91788r(false);
            Object objM91750T5 = xq00Var.m91750T();
            if (objM91750T5 == obj) {
                objM91750T5 = new dgx0(15, gh00Var2);
                xq00Var.m91793t0(objM91750T5);
            }
            zag1.m95785e(yw70VarM30763a, hzy0Var, (eh00) objM91750T5, xq00Var, (i4 & ContentType.LONG_FORM_ON_DEMAND) | 384);
            kyf1.m57697b(yw70VarM30763a, gh00Var2, xq00Var, 48);
            fxh0 fxh0VarM31822N = c95.m31822N(fxh0Var, ujg1.m83277r(xq00Var), null);
            xq00Var.m91771i0(-906766349);
            xq00Var.m91788r(false);
            fxh0 fxh0VarMo34315F = fxh0VarM31822N.mo34315F(cxh0.f43038a);
            boolean zM91770i = xq00Var.m91770i(yw70VarM30763a) | ((i4 & 1879048192) == 536870912) | xq00Var.m91770i(kqi0VarM77671j) | xq00Var.m91762e(iIntValue) | xq00Var.m91766g(list) | xq00Var.m91766g(list3);
            Object objM91750T6 = xq00Var.m91750T();
            if (zM91770i || objM91750T6 == obj) {
                objM91750T6 = new hxy0(yw70VarM30763a, z, iIntValue, list, list3, kqi0VarM77671j);
                xq00Var.m91793t0(objM91750T6);
            }
            fxh0 fxh0VarM48273f = hqg1.m48273f(fxh0VarMo34315F, new ucw0(w2z0Var, (eh00) objM91750T6, gh00Var, 3));
            tvd1 tvd1Var = (tvd1) xq00Var.m91774k(rwb0.f203317b);
            if (tvd1Var == null) {
                xq00Var.m91771i0(-241884180);
                WeakHashMap weakHashMap = cxd1.f42984x;
                tvd1Var = bxd1.m30815d(xq00Var).f42991g;
                z2 = false;
            } else {
                z2 = false;
                xq00Var.m91771i0(-241885792);
            }
            xq00Var.m91788r(z2);
            lx40 lx40VarM75451u = rfg1.m75451u(new ni80(tvd1Var, 32), xq00Var);
            boolean zM91770i2 = xq00Var.m91770i(w290VarM58368q);
            Object objM91750T7 = xq00Var.m91750T();
            if (zM91770i2 || objM91750T7 == obj) {
                objM91750T7 = new e6a(w290VarM58368q, 6);
                xq00Var.m91793t0(objM91750T7);
            }
            n3h1.m63613b(fxh0VarM48273f, yw70VarM30763a, lx40VarM75451u, null, null, null, false, null, (gh00) objM91750T7, xq00Var, 0, 504);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new cp5(qf40Var, hzy0Var, noa0Var, cp80Var, fxh0Var, w2z0Var, z, gh00Var, i);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m61303m(int i, String str, wwu wwuVar, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        xq00 xq00Var2 = xq00Var;
        xq00Var2.m91775k0(-238821743);
        ug5 ug5Var = xq00Var2.f264811a;
        int i2 = i | (xq00Var2.m91766g(str) ? 4 : 2) | (xq00Var2.m91770i(eh00Var) ? 32 : 16) | (xq00Var2.m91770i(wwuVar) ? 256 : 128) | (xq00Var.m91770i(fxh0Var) ? 2048 : 1024);
        if (xq00Var2.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            irx0 irx0VarM36744a = drx0.m36744a(bj5.f27610a, d7f0.f46142M0, xq00Var2, 0);
            int iHashCode = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0Var);
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
            zsf1.m96835F(irx0VarM36744a, yhhVar, xq00Var2);
            yhh yhhVar2 = roh.f201261f;
            zsf1.m96835F(wpn0VarM91778m, yhhVar2, xq00Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            yhh yhhVar3 = roh.f201265j;
            zsf1.m96835F(numValueOf, yhhVar3, xq00Var2);
            vlh vlhVar = roh.f201266k;
            zsf1.m96833D(vlhVar, xq00Var2);
            yhh yhhVar4 = roh.f201259d;
            zsf1.m96835F(fxh0VarM48286s, yhhVar4, xq00Var2);
            float f = leu.m58816b(xq00Var2).f117235g.f159606d;
            cxh0 cxh0Var = cxh0.f43038a;
            y85.m93057b(wwuVar, qgj.f188480a, mi21.m61834r(f, cxh0Var), leu.m58815a(xq00Var2).f112824b.f138759c, 0L, false, xq00Var2, 56 | ((i2 >> 6) & 14), 48);
            riw0.m75615i(xq00Var2, mi21.m61838v(leu.m58816b(xq00Var2).f117230b.f224763f, cxh0Var));
            if (1.0f <= 0.0d) {
                kt40.m57301a("invalid weight; must be greater than zero");
            }
            cr70 cr70Var = new cr70(1.0f, true);
            Object objM91750T = xq00Var2.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = iel0.f101462i;
                xq00Var2.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM96644b = zoz0.m96644b(cr70Var, true, (gh00) objM91750T);
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var2, 0);
            int iHashCode2 = Long.hashCode(xq00Var2.f264809T);
            wpn0 wpn0VarM91778m2 = xq00Var2.m91778m();
            fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var2, fxh0VarM96644b);
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
            ahf1.m25932d(k0e1.m54977L(R.string.filter_model_title, xq00Var2), null, leu.m58818d(xq00Var2).f64974j, leu.m58815a(xq00Var2).f112824b.f138758b, null, null, 0, false, null, 0, null, xq00Var, 0, 0, 2034);
            ahf1.m25932d(str, null, leu.m58818d(xq00Var).f64971g, leu.m58815a(xq00Var).f112824b.f138757a, null, null, 0, false, null, 0, null, xq00Var, i2 & 14, 0, 2034);
            xq00Var2 = xq00Var;
            xq00Var2.m91788r(true);
            riw0.m75615i(xq00Var2, mi21.m61838v(leu.m58816b(xq00Var2).f117230b.f224763f, cxh0Var));
            dyu.m37374f(new peu(u40.f226523c, eh00Var), null, null, vvx.m86517r(xq00Var2), null, null, null, pxg.f182302a, xq00Var2, 12582912, 118);
            xq00Var2.m91788r(true);
        } else {
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new iha0(str, eh00Var, wwuVar, fxh0Var, i, 29);
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m61304n(wk51 wk51Var, eh00 eh00Var, eh00 eh00Var2, String str, String str2, String str3, fyf fyfVar, fxh0 fxh0Var, fyf fyfVar2, xq00 xq00Var, int i) {
        fxh0 fxh0Var2;
        boolean z;
        boolean z2 = wk51Var.f252139a;
        jag1 jag1Var = wk51Var.f252140b;
        xq00Var.m91775k0(-1237766647);
        int i2 = 12582912 | i | (xq00Var.m91766g(wk51Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128) | (xq00Var.m91766g(str) ? 2048 : 1024) | (xq00Var.m91766g(str2) ? 16384 : 8192) | (xq00Var.m91766g(str3) ? 131072 : 65536);
        if (xq00Var.m91752Y(i2 & 1, (38347923 & i2) != 38347922)) {
            cxh0 cxh0Var = cxh0.f43038a;
            if (z2 || (jag1Var instanceof qk51)) {
                xq00Var.m91771i0(-2011416623);
                zi5 zi5Var = bj5.f27610a;
                aaf aafVarM87496a = w9f.m87496a(bj5.m29370g(leu.m58816b(xq00Var).f117230b.f224763f), d7f0.f46144O0, xq00Var, 0);
                int iHashCode = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m = xq00Var.m91778m();
                fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
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
                zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
                zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
                zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
                zsf1.m96833D(roh.f201266k, xq00Var);
                zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                if (z2) {
                    xq00Var.m91771i0(1684740016);
                    int i3 = i2 >> 6;
                    fag1.m41155d((i3 & 7168) | ((i2 >> 3) & 14) | (i3 & ContentType.LONG_FORM_ON_DEMAND) | (i3 & 896), str, str2, str3, eh00Var, xq00Var);
                    xq00Var.m91788r(false);
                } else {
                    xq00Var.m91771i0(1684916840);
                    xq00Var.m91788r(false);
                }
                if (jag1Var instanceof qk51) {
                    xq00Var.m91771i0(1685017683);
                    iag1.m50062c((qk51) jag1Var, eh00Var2, fyfVar, null, fyfVar2, xq00Var, ((i2 >> 3) & ContentType.LONG_FORM_ON_DEMAND) | 24960);
                    z = false;
                    xq00Var.m91788r(false);
                } else {
                    z = false;
                    xq00Var.m91771i0(1685283880);
                    xq00Var.m91788r(false);
                }
                xq00Var.m91788r(true);
                xq00Var.m91788r(z);
            } else {
                xq00Var.m91771i0(-2010701639);
                xq00Var.m91788r(false);
            }
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new wsc(wk51Var, eh00Var, eh00Var2, str, str2, str3, fyfVar, fxh0Var2, fyfVar2, i);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m61305o(jul0 jul0Var, eh00 eh00Var, eh00 eh00Var2, fxh0 fxh0Var, xq00 xq00Var, int i) {
        boolean z;
        boolean z2;
        iul0 iul0Var = jul0Var.f116121j;
        zag1 zag1Var = iul0Var.f105995b;
        zag1 zag1Var2 = iul0Var.f105994a;
        xq00Var.m91775k0(124987444);
        int i2 = i | (xq00Var.m91770i(jul0Var) ? 4 : 2) | (xq00Var.m91770i(eh00Var) ? 32 : 16) | (xq00Var.m91770i(eh00Var2) ? 256 : 128) | (xq00Var.m91770i(fxh0Var) ? 2048 : 1024);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, 0);
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
            zsf1.m96835F(aafVarM87496a, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            boolean z3 = zag1Var2 instanceof hul0;
            boolean z4 = zag1Var instanceof hul0;
            if (z3) {
                xq00Var.m91771i0(1690631164);
                hul0 hul0Var = (hul0) zag1Var2;
                z = z3;
                z2 = false;
                wag1.m87600c(k0e1.m54977L(hul0Var.f95419c, xq00Var), k0e1.m54977L(hul0Var.f95420d, xq00Var), cgg1.m32713k(hul0Var.f95424h, xq00Var), eh00Var, null, hul0Var.f95422f, hul0Var.f95421e, hul0Var.f95423g, xq00Var, (i2 << 6) & 7168);
                xq00Var.m91788r(false);
            } else {
                z = z3;
                z2 = false;
                xq00Var.m91771i0(1691088600);
                xq00Var.m91788r(false);
            }
            if (z && z4) {
                xq00Var.m91771i0(1691159559);
                AbstractC0000a.m22u(cxh0.f43038a, leu.m58816b(xq00Var).f117230b.f224763f, xq00Var, z2);
            } else {
                xq00Var.m91771i0(1691237400);
                xq00Var.m91788r(z2);
            }
            if (z4 != 0) {
                xq00Var.m91771i0(1691295773);
                hul0 hul0Var2 = (hul0) zag1Var;
                wag1.m87600c(k0e1.m54977L(hul0Var2.f95419c, xq00Var), k0e1.m54977L(hul0Var2.f95420d, xq00Var), cgg1.m32713k(hul0Var2.f95424h, xq00Var), eh00Var2, null, hul0Var2.f95422f, hul0Var2.f95421e, hul0Var2.f95423g, xq00Var, (i2 << 3) & 7168);
                xq00Var.m91788r(z2);
            } else {
                xq00Var.m91771i0(1691813752);
                xq00Var.m91788r(z2);
            }
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new jsl0((Object) jul0Var, (Object) eh00Var, (Object) eh00Var2, (Object) fxh0Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m61306p(uio uioVar) {
        if (uioVar != null) {
            try {
                uioVar.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static skp m61307q(Context context, String str) {
        jsa jsaVar = y74.f269955b;
        File file = new File(context.getDir("remote-config", 0), str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new skp(new y74(file), 9);
    }

    /* JADX INFO: renamed from: r */
    public static t0v m61308r(xq00 xq00Var) {
        long j = leu.m58815a(xq00Var).f112824b.f138757a;
        long j2 = leu.m58815a(xq00Var).f112824b.f138758b;
        long j3 = leu.m58815a(xq00Var).f112824b.f138758b;
        long j4 = leu.m58815a(xq00Var).f112824b.f138757a;
        long j5 = n6f.f150870j;
        return new t0v(new n0v(j, j2, j3, j4, j5, j5, leu.m58815a(xq00Var).f112824b.f138759c, leu.m58815a(xq00Var).f112825c.f221218a, leu.m58815a(xq00Var).f112823a.f229875b.f123094b, leu.m58815a(xq00Var).f112824b.f138760d));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m61309s(byte b) {
        return b > -65;
    }

    /* JADX INFO: renamed from: t */
    public static fxh0 m61310t(fxh0 fxh0Var, float f, ete eteVar, int i) {
        if ((i & 2) != 0) {
            eteVar = new ete(0.0f, 1.0f);
        }
        return zoz0.m96644b(fxh0Var, true, new t6s0(f, eteVar, 0));
    }
}
