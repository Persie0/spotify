package p204p;

import android.content.Intent;
import com.comscore.streaming.ContentDeliveryAdvertisementCapability;
import com.comscore.streaming.ContentType;
import com.spotify.music.R;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j9g1 implements pfe1 {

    /* JADX INFO: renamed from: a */
    public static final qv21 f110170a = new qv21();

    /* JADX INFO: renamed from: b */
    public static final sv21 f110171b = new sv21();

    /* JADX INFO: renamed from: c */
    public static sd40 f110172c;

    /* JADX INFO: renamed from: d */
    public static sd40 f110173d;

    /* JADX INFO: renamed from: a */
    public static final void m52743a(tcd1 tcd1Var, idd1 idd1Var, ydd1 ydd1Var, aiq aiqVar, n040 n040Var, lwf lwfVar, wrb1 wrb1Var, boolean z, th00 th00Var, gh00 gh00Var, a1p0 a1p0Var, xq00 xq00Var, int i) {
        int i2;
        Object yai0Var;
        lwf lwfVar2 = lwfVar;
        wrb1 wrb1Var2 = wrb1Var;
        xq00Var.m91775k0(-1625043695);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(tcd1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(idd1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(ydd1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(aiqVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= xq00Var.m91770i(n040Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? xq00Var.m91766g(lwfVar2) : xq00Var.m91770i(lwfVar2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= xq00Var.m91766g(wrb1Var2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= xq00Var.m91768h(z) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= xq00Var.m91770i(th00Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 536870912 : 268435456;
        }
        int i3 = i2;
        boolean z2 = true;
        if (xq00Var.m91752Y(i3 & 1, ((i3 & 306783379) == 306783378 && ((xq00Var.m91770i(a1p0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            int i4 = i3 >> 12;
            kqi0 kqi0VarM77651H = sam.m77651H(n040Var, xq00Var);
            kqi0 kqi0VarM77651H2 = sam.m77651H(th00Var, xq00Var);
            kqi0 kqi0VarM77651H3 = sam.m77651H(gh00Var, xq00Var);
            Object objM91750T = xq00Var.m91750T();
            Object obj = t6x0.f217647t;
            fbk fbkVar = null;
            if (objM91750T == obj) {
                objM91750T = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T);
            }
            kqi0 kqi0Var = (kqi0) objM91750T;
            boolean zM91766g = xq00Var.m91766g((n040) kqi0VarM77651H.getValue());
            Object objM91750T2 = xq00Var.m91750T();
            if (zM91766g || objM91750T2 == obj) {
                objM91750T2 = UUID.randomUUID().toString();
                xq00Var.m91793t0(objM91750T2);
            }
            wj50.m88279p(objM91750T2);
            String str = (String) objM91750T2;
            int i5 = i3 & 3670016;
            boolean zM91766g2 = (i5 == 1048576) | xq00Var.m91766g(idd1Var) | xq00Var.m91766g((n040) kqi0VarM77651H.getValue());
            Object objM91750T3 = xq00Var.m91750T();
            if (zM91766g2 || objM91750T3 == obj) {
                n040 n040Var2 = (n040) kqi0VarM77651H.getValue();
                if (n040Var2 != null) {
                    n040Var2.setIdentifier(str);
                }
                aub1 aub1Var = wrb1Var2.f254309b;
                String str2 = aub1Var.f19910e;
                if (wl51.m88460J0(str2)) {
                    str2 = "e57a3dcbd5174b20a9bfa81db99ec7d2";
                }
                objM91750T3 = new k7i0(cv9.m34003y(aub1Var), new j7i0(new ti51(str2), wrb1Var2.f254308a, idd1Var.f101081m, idd1Var.f101084p, "", wrb1Var2.f254316i, wrb1Var2.f254317t, idd1Var.f101073e, idd1Var.f101080l), wrb1Var2.f254311d, !aub1Var.f19911f ? new i7i0(Long.valueOf(aub1Var.f19908c), Long.valueOf(aub1Var.f19909d)) : null, 0L, wrb1Var2.f254313f ? new h7i0(5000L) : null, str, false, 0, ContentDeliveryAdvertisementCapability.LINEAR_5DAY);
                xq00Var.m91793t0(objM91750T3);
            }
            k7i0 k7i0Var = (k7i0) objM91750T3;
            boolean z3 = i5 == 1048576;
            Object objM91750T4 = xq00Var.m91750T();
            if (z3 || objM91750T4 == obj) {
                objM91750T4 = sam.m77645B(null);
                xq00Var.m91793t0(objM91750T4);
            }
            kqi0 kqi0Var2 = (kqi0) objM91750T4;
            boolean zM91766g3 = xq00Var.m91766g((jg21) kqi0Var2.getValue());
            Object objM91750T5 = xq00Var.m91750T();
            if (zM91766g3 || objM91750T5 == obj) {
                jg21 jg21Var = (jg21) kqi0Var2.getValue();
                objM91750T5 = mac1.ASPECT_FILL_DISPLAY_AR;
                if (jg21Var != null && jg21Var.f112013b < jg21Var.f112012a) {
                    objM91750T5 = mac1.ASPECT_FIT;
                }
                xq00Var.m91793t0(objM91750T5);
            }
            mac1 mac1Var = (mac1) objM91750T5;
            n040 n040Var3 = (n040) kqi0VarM77651H.getValue();
            boolean zM91766g4 = xq00Var.m91766g(kqi0VarM77651H) | xq00Var.m91762e(mac1Var.ordinal());
            Object objM91750T6 = xq00Var.m91750T();
            if (zM91766g4 || objM91750T6 == obj) {
                objM91750T6 = new qff0(mac1Var, kqi0VarM77651H, fbkVar, 9);
                xq00Var.m91793t0(objM91750T6);
            }
            hz40.m49236h(mac1Var, n040Var3, (th00) objM91750T6, xq00Var);
            n040 n040Var4 = (n040) kqi0VarM77651H.getValue();
            lg21 lg21Var = (lg21) kqi0Var.getValue();
            boolean zM91766g5 = xq00Var.m91766g(kqi0VarM77651H);
            Object objM91750T7 = xq00Var.m91750T();
            if (zM91766g5 || objM91750T7 == obj) {
                objM91750T7 = new ak3(kqi0VarM77651H, kqi0Var, null, 7);
                xq00Var.m91793t0(objM91750T7);
            }
            hz40.m49236h(n040Var4, lg21Var, (th00) objM91750T7, xq00Var);
            lg21 lg21Var2 = (lg21) kqi0Var.getValue();
            boolean zM91766g6 = xq00Var.m91766g(kqi0Var2);
            Object objM91750T8 = xq00Var.m91750T();
            if (zM91766g6 || objM91750T8 == obj) {
                objM91750T8 = new mpf(kqi0Var, kqi0Var2, null, 2);
                xq00Var.m91793t0(objM91750T8);
            }
            hz40.m49237i(lg21Var2, (th00) objM91750T8, xq00Var);
            jg21 jg21Var2 = (jg21) kqi0Var2.getValue();
            boolean zM91766g7 = xq00Var.m91766g(kqi0Var2) | xq00Var.m91766g(kqi0VarM77651H2);
            Object objM91750T9 = xq00Var.m91750T();
            if (zM91766g7 || objM91750T9 == obj) {
                objM91750T9 = new ak3(kqi0Var2, kqi0VarM77651H2, null, 8);
                xq00Var.m91793t0(objM91750T9);
            }
            hz40.m49237i(jg21Var2, (th00) objM91750T9, xq00Var);
            Object obj2 = (pcz0) xq00Var.m91774k(hi71.f91732a);
            lg21 lg21Var3 = (lg21) kqi0Var.getValue();
            boolean zM91766g8 = xq00Var.m91766g(obj2);
            Object objM91750T10 = xq00Var.m91750T();
            if (zM91766g8 || objM91750T10 == obj) {
                objM91750T10 = new sxh0(2, obj2, kqi0Var);
                xq00Var.m91793t0(objM91750T10);
            }
            hz40.m49232d(lg21Var3, obj2, (gh00) objM91750T10, xq00Var);
            boolean zM91770i = ((i3 & 29360128) == 8388608) | xq00Var.m91770i(tcd1Var) | xq00Var.m91770i(k7i0Var) | xq00Var.m91766g(kqi0VarM77651H3) | (i5 == 1048576) | xq00Var.m91770i(idd1Var) | xq00Var.m91770i(a1p0Var) | xq00Var.m91770i(ydd1Var) | xq00Var.m91770i(aiqVar);
            if ((i3 & 458752) != 131072) {
                lwfVar2 = lwfVar;
                if ((i3 & 262144) == 0 || !xq00Var.m91770i(lwfVar2)) {
                    z2 = false;
                }
            } else {
                lwfVar2 = lwfVar;
            }
            boolean z4 = zM91770i | z2;
            Object objM91750T11 = xq00Var.m91750T();
            if (z4 || objM91750T11 == obj) {
                wrb1Var2 = wrb1Var;
                yai0Var = new yai0(kqi0Var, z, tcd1Var, k7i0Var, wrb1Var2, idd1Var, a1p0Var, kqi0VarM77651H3, ydd1Var, aiqVar, lwfVar2);
                xq00Var.m91793t0(yai0Var);
            } else {
                yai0Var = objM91750T11;
                wrb1Var2 = wrb1Var;
            }
            gbm.m44243e(wrb1Var2, lwfVar2, (gh00) yai0Var, xq00Var, ((i3 >> 18) & 14) | 64 | (i4 & ContentType.LONG_FORM_ON_DEMAND));
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new k8p(tcd1Var, idd1Var, ydd1Var, aiqVar, n040Var, lwfVar2, wrb1Var2, z, th00Var, gh00Var, a1p0Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m52744b(int i, String str, xq00 xq00Var) {
        xq00Var.m91775k0(-1925158249);
        int i2 = (xq00Var.m91766g(str) ? 4 : 2) | i;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            if71 if71Var = leu.m58818d(xq00Var).f64972h;
            ol80 ol80Var = new ol80(1);
            Object objM91750T = xq00Var.m91750T();
            if (objM91750T == t6x0.f217647t) {
                objM91750T = err0.f62185Z0;
                xq00Var.m91793t0(objM91750T);
            }
            ahf1.m25932d(str, zoz0.m96644b(cxh0.f43038a, false, (gh00) objM91750T), if71Var, 0L, null, null, 2, false, ol80Var, 0, null, xq00Var, (i2 & 14) | 1572864, 0, 1720);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new svm0(str, i, 26);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m52745c(qly0 qly0Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00Var.m91775k0(978370097);
        int i2 = (xq00Var.m91770i(qly0Var) ? 4 : 2) | i | (xq00Var.m91770i(fxh0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            long jM63765b = n6f.m63765b(leu.m58815a(xq00Var).f112824b.f138758b, 0.5f, 0.0f, 0.0f, 0.0f, 14);
            float f = 4;
            fxh0 fxh0VarM96830A = zsf1.m96830A(mi21.m61838v(f, fxh0Var), 0.0f, f, 1);
            boolean zM91770i = xq00Var.m91770i(qly0Var) | xq00Var.m91764f(jM63765b);
            Object objM91750T = xq00Var.m91750T();
            if (zM91770i || objM91750T == t6x0.f217647t) {
                objM91750T = new v22(qly0Var, jM63765b, 9);
                xq00Var.m91793t0(objM91750T);
            }
            xud.m92135b(0, (gh00) objM91750T, xq00Var, fxh0VarM96830A);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gex0(qly0Var, fxh0Var, i, 7);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m52746d(ubl0 ubl0Var, ac1 ac1Var, gh00 gh00Var, e940 e940Var, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        e940 e940Var2;
        ac1 ac1Var2;
        fxh0 fxh0Var2;
        String strM13l;
        pla1 pla1Var = ubl0Var.f228817a;
        xq00Var.m91775k0(-1991465427);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(ubl0Var) : xq00Var.m91770i(ubl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91762e(ac1Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            e940Var2 = e940Var;
            i2 |= xq00Var.m91770i(e940Var2) ? 2048 : 1024;
        } else {
            e940Var2 = e940Var;
        }
        int i3 = i2 | 24576;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 9363) != 9362)) {
            List listSingletonList = Collections.singletonList(pla1Var);
            String str = pla1Var.f178682b;
            Integer numM65708t = nug1.m65708t(ubl0Var.f228821e);
            if (numM65708t == null) {
                xq00Var.m91771i0(-1362885291);
                xq00Var.m91788r(false);
                strM13l = null;
            } else {
                strM13l = AbstractC0000a.m13l(xq00Var, -1362885290, numM65708t, xq00Var, false);
            }
            ac1Var2 = ac1Var;
            sva1 sva1Var = new sva1(rkk.m75772x(-951921416, new sf91(9, ac1Var2, gh00Var), xq00Var));
            bsu bsuVar = bsu.f30386c;
            String strM54977L = k0e1.m54977L(R.string.add_friends_more_options, xq00Var);
            boolean z = (i3 & 896) == 256;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new ifa1(24, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            vva1 vva1Var = new vva1(listSingletonList, str, strM13l, new ova1(h6f.m46715L(sva1Var, new tva1(strM54977L, bsuVar, (eh00) objM91750T))));
            int i4 = i3 >> 3;
            cxh0 cxh0Var = cxh0.f43038a;
            q9g1.m72384g(vva1Var, null, e940Var2, cxh0Var, xq00Var, (i4 & 896) | 48 | (i4 & 7168), 0);
            fxh0Var2 = cxh0Var;
        } else {
            ac1Var2 = ac1Var;
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new dl81(ubl0Var, ac1Var2, gh00Var, e940Var, fxh0Var2, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m52747e(ac1 ac1Var, eh00 eh00Var, xq00 xq00Var, int i) {
        int i2;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var.m91775k0(-1985324693);
        if ((i & 6) == 0) {
            i2 = i | (xq00Var.m91762e(ac1Var.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 32 : 16;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = ac1Var.ordinal();
            sdu sduVar = sdu.f208086a;
            u40 u40Var = u40.f226523c;
            if (iOrdinal == 0) {
                xq00Var.m91771i0(1187458006);
                boolean z = (i2 & ContentType.LONG_FORM_ON_DEMAND) == 32;
                Object objM91750T = xq00Var.m91750T();
                if (z || objM91750T == ia7Var) {
                    objM91750T = new wp81(20, eh00Var);
                    xq00Var.m91793t0(objM91750T);
                }
                dyu.m37371c(new peu(u40Var, (eh00) objM91750T), new tgu(8), null, sduVar, vvx.m86517r(xq00Var), null, null, null, null, null, jfh.f111903b, xq00Var, 24576, 48, 1996);
                xq00Var.m91788r(false);
            } else if (iOrdinal == 1) {
                xq00Var.m91771i0(1187019418);
                Object objM91750T2 = xq00Var.m91750T();
                if (objM91750T2 == ia7Var) {
                    objM91750T2 = c781.f34801U0;
                    xq00Var.m91793t0(objM91750T2);
                }
                dyu.m37371c(new peu(u40Var, (eh00) objM91750T2), new tgu(8), null, sduVar, vvx.m86517r(xq00Var), null, null, null, null, null, jfh.f111902a, xq00Var, 24576, 48, 1996);
                xq00Var.m91788r(false);
            } else {
                if (iOrdinal != 2) {
                    throw lq51.m59703i(-931546895, xq00Var, false);
                }
                xq00Var.m91771i0(1187845475);
                Object objM91750T3 = xq00Var.m91750T();
                if (objM91750T3 == ia7Var) {
                    objM91750T3 = c781.f34802V0;
                    xq00Var.m91793t0(objM91750T3);
                }
                dyu.m37371c(new peu(u40Var, (eh00) objM91750T3), new tgu(8), null, new qdu(k0e1.m54977L(R.string.add_friends_requested_button, xq00Var)), vvx.m86517r(xq00Var), null, null, null, null, null, jfh.f111904c, xq00Var, 0, 48, 1996);
                xq00Var.m91788r(false);
            }
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new yz11(ac1Var, eh00Var, i, 24);
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m52748f(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    /* JADX INFO: renamed from: g */
    public static final String m52749g(int i) {
        if (i != 1) {
            return i != 2 ? edb.m38563l("UNKNOWN(", i, ")") : "AUDIOFOCUS_GAIN_TRANSIENT";
        }
        return "AUDIOFOCUS_GAIN";
    }

    /* JADX INFO: renamed from: h */
    public static final String m52750h(int i) {
        if (i == 0) {
            return "AUDIOFOCUS_REQUEST_FAILED";
        }
        if (i != 1) {
            return i != 2 ? edb.m38563l("UNKNOWN(", i, ")") : "AUDIOFOCUS_REQUEST_DELAYED";
        }
        return "AUDIOFOCUS_REQUEST_GRANTED";
    }

    /* JADX INFO: renamed from: k */
    public static void m52751k(kke kkeVar, fke fkeVar) {
        kkeVar.f123577b = fkeVar;
    }

    /* JADX INFO: renamed from: l */
    public static void m52752l(kke kkeVar, qre0 qre0Var) {
        kkeVar.f123576a = qre0Var;
    }

    /* JADX INFO: renamed from: m */
    public static final void m52753m(toz tozVar) {
        kpz kpzVar = ((rpz) ((oz3) wjg1.m88320J(tozVar)).getFocusOwner()).f201665d;
        if (kpzVar.f125168d.m36642a(tozVar)) {
            kpzVar.m57064a();
        }
    }

    /* JADX INFO: renamed from: o */
    public static final mj70 m52754o() {
        return new mj70(cgo.m32732a(), 10);
    }

    /* JADX INFO: renamed from: p */
    public static final String m52755p(Intent intent) {
        Set set = dd41.f47702f;
        String strM35717o = r46.m74726U(intent.getDataString()).m35717o(2);
        if (strM35717o != null) {
            if (strM35717o.length() != 22) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            String strM35694A = r46.m74726U("spotify:album:".concat(strM35717o)).m35694A();
            if (strM35694A != null) {
                return strM35694A;
            }
        }
        throw new IllegalArgumentException("Album ID is not defined.");
    }

    /* JADX INFO: renamed from: q */
    public static final String m52756q(Intent intent) {
        String strM35694A;
        Set set = dd41.f47702f;
        String strM35717o = r46.m74726U(intent.getDataString()).m35717o(2);
        if (strM35717o == null || (strM35694A = r46.m74735p(strM35717o).m35694A()) == null) {
            throw new IllegalArgumentException("Artist ID is not defined.");
        }
        return strM35694A;
    }

    /* JADX INFO: renamed from: r */
    public static final String m52757r(Intent intent) {
        String strM35694A;
        Set set = dd41.f47702f;
        String strM35717o = r46.m74726U(intent.getDataString()).m35717o(2);
        if (strM35717o == null || (strM35694A = r46.m74728W(strM35717o).m35694A()) == null) {
            throw new IllegalArgumentException("Playlist ID is not defined.");
        }
        return strM35694A;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean[] mo33506i(String str);

    /* JADX INFO: renamed from: j */
    public int mo33507j() {
        return 10;
    }

    @Override // p204p.pfe1
    /* JADX INFO: renamed from: n */
    public fh9 mo33508n(String str, int i, int i2, int i3, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        int iMo33507j = mo33507j();
        EnumMap enumMap = (EnumMap) map;
        ydu yduVar = ydu.f271836f;
        if (enumMap.containsKey(yduVar)) {
            iMo33507j = Integer.parseInt(enumMap.get(yduVar).toString());
        }
        boolean[] zArrMo33506i = mo33506i(str);
        int length = zArrMo33506i.length;
        int i4 = iMo33507j + length;
        int iMax = Math.max(200, i4);
        int iMax2 = Math.max(1, 200);
        int i5 = iMax / i4;
        int i6 = (iMax - (length * i5)) / 2;
        fh9 fh9Var = new fh9(iMax, iMax2);
        int i7 = 0;
        while (i7 < length) {
            if (zArrMo33506i[i7]) {
                fh9Var.m41652d(i6, 0, i5, iMax2);
            }
            i7++;
            i6 += i5;
        }
        return fh9Var;
    }
}
