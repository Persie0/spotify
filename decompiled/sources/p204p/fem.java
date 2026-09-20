package p204p;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class fem {

    /* JADX INFO: renamed from: a */
    public static final int[] f68796a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f68797b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f68798c = new Object[0];

    /* JADX INFO: renamed from: d */
    public static sd40 f68799d;

    /* JADX INFO: renamed from: a */
    public static final void m41453a(gh00 gh00Var, oix0 oix0Var, long j, fxh0 fxh0Var, xq00 xq00Var, int i) {
        int i2;
        gh00 gh00Var2;
        boolean z;
        eh00 eh00Var;
        Object obj = t6x0.f217647t;
        xq00Var.m91775k0(192675549);
        if ((i & 6) == 0) {
            i2 = (xq00Var.m91770i(gh00Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(oix0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91764f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91766g(fxh0Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            fix0 fix0Var = (fix0) xq00Var.m91774k(gix0.f80271a);
            fxh0 fxh0VarM33990h = cv9.m33990h(0.5625f, mi21.m61838v(f811.f66832d, fxh0Var), false);
            w9a w9aVarM65766b = nwg1.m65766b(j, 1);
            float f = 16;
            fxh0 fxh0VarM75068p = r9g1.m75068p(mwg1.m63031k(fxh0VarM33990h, w9aVarM65766b.f249128a, w9aVarM65766b.f249129b, hmx0.m47993b(f)), hmx0.m47993b(f));
            m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM75068p);
            soh.f211194A.getClass();
            eh00 eh00Var2 = roh.f201257b;
            eh00 eh00Var3 = null;
            if (xq00Var.f264811a == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var2);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            if (fix0Var == null) {
                xq00Var.m91771i0(1856366813);
                z = false;
                xq00Var.m91788r(false);
                gh00Var2 = null;
            } else {
                xq00Var.m91771i0(1856366814);
                boolean zM91770i = xq00Var.m91770i(fix0Var);
                Object objM91750T = xq00Var.m91750T();
                if (zM91770i || objM91750T == obj) {
                    objM91750T = new wga(fix0Var, 16);
                    xq00Var.m91793t0(objM91750T);
                }
                gh00Var2 = (gh00) objM91750T;
                z = false;
                xq00Var.m91788r(false);
            }
            if (fix0Var == null) {
                xq00Var.m91771i0(1856441616);
                xq00Var.m91788r(z);
                eh00Var = null;
            } else {
                xq00Var.m91771i0(1856441617);
                boolean zM91770i2 = xq00Var.m91770i(fix0Var);
                Object objM91750T2 = xq00Var.m91750T();
                if (zM91770i2 || objM91750T2 == obj) {
                    objM91750T2 = new v2c(fix0Var, 0);
                    xq00Var.m91793t0(objM91750T2);
                }
                eh00Var = (eh00) objM91750T2;
                z = false;
                xq00Var.m91788r(false);
            }
            if (fix0Var == null) {
                xq00Var.m91771i0(1856502252);
            } else {
                xq00Var.m91771i0(1856502253);
                boolean zM91770i3 = xq00Var.m91770i(fix0Var);
                Object objM91750T3 = xq00Var.m91750T();
                if (zM91770i3 || objM91750T3 == obj) {
                    objM91750T3 = new v2c(fix0Var, 1);
                    xq00Var.m91793t0(objM91750T3);
                }
                eh00Var3 = (eh00) objM91750T3;
                z = false;
            }
            xq00Var.m91788r(z);
            o2z0.m66150g(gh00Var, qgj.f188480a, gh00Var2, eh00Var, eh00Var3, oix0Var, xq00Var, (i2 & 14) | 48 | ((i2 << 15) & 3670016), 4);
            xq00Var.m91788r(true);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new e37(gh00Var, oix0Var, j, fxh0Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final i94 m41454b(oz3 oz3Var) {
        return new i94(oz3Var);
    }

    /* JADX INFO: renamed from: c */
    public static final void m41455c(esp0 esp0Var, zrp0 zrp0Var, xq00 xq00Var, int i) {
        esp0 esp0Var2;
        zrp0 zrp0Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-726064831);
        int i2 = (xq00Var.m91770i(esp0Var) ? 4 : 2) | i | (xq00Var.m91770i(zrp0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            esp0Var2 = esp0Var;
            zrp0Var2 = zrp0Var;
            xq00Var2 = xq00Var;
            mif1.m61869b(esp0Var2, zrp0Var2, null, null, xq00Var2, i2 & 126, 12);
        } else {
            esp0Var2 = esp0Var;
            zrp0Var2 = zrp0Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new znn0(esp0Var2, zrp0Var2, i, 16);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m41456d(dtp0 dtp0Var, nsp0 nsp0Var, xq00 xq00Var, int i) {
        dtp0 dtp0Var2;
        nsp0 nsp0Var2;
        xq00 xq00Var2;
        xq00Var.m91775k0(-1034285173);
        int i2 = (xq00Var.m91770i(dtp0Var) ? 4 : 2) | i | (xq00Var.m91766g(nsp0Var) ? 32 : 16);
        if (xq00Var.m91752Y(i2 & 1, (i2 & 19) != 18)) {
            dtp0Var2 = dtp0Var;
            nsp0Var2 = nsp0Var;
            xq00Var2 = xq00Var;
            mif1.m61869b(dtp0Var2, nsp0Var2, null, null, xq00Var2, i2 & 126, 12);
        } else {
            dtp0Var2 = dtp0Var;
            nsp0Var2 = nsp0Var;
            xq00Var2 = xq00Var;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new znn0(dtp0Var2, nsp0Var2, i, 15);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final r0e1 m41457e(hvu0 hvu0Var) {
        return new r0e1(hvu0Var);
    }

    /* JADX INFO: renamed from: f */
    public static final void m41458f(int i, String str, String str2, eh00 eh00Var, xq00 xq00Var, fxh0 fxh0Var) {
        fxh0 fxh0Var2;
        xq00Var.m91775k0(1120215766);
        int i2 = i | (xq00Var.m91766g(str) ? 4 : 2) | (xq00Var.m91766g(str2) ? 32 : 16) | (xq00Var.m91770i(eh00Var) ? 256 : 128) | 3072;
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            sju sjuVar = sju.f209931e;
            fmx0 fmx0VarM47993b = hmx0.m47993b(leu.m58816b(xq00Var).f117234f.f148188d);
            float f = leu.m58816b(xq00Var).f117230b.f224763f;
            kyu kyuVar = new kyu(0, sjuVar, 0, new j4m0(f, f, f, f), null, null, fmx0VarM47993b, 0, null, 437);
            peu peuVar = new peu(u40.f226523c, eh00Var);
            cxh0 cxh0Var = cxh0.f43038a;
            p711.m69222a(mi21.m61822f(1.0f, epv0.m39673I("your-premium-referral-row", cxh0Var)), kyuVar, null, false, null, null, peuVar, null, mih.f144027a, null, null, rkk.m75772x(21639694, new re01(str2, 24), xq00Var), null, null, null, rkk.m75772x(-1465589230, new re01(str, 25), xq00Var), xq00Var, 100663360, 196656, 30396);
            fxh0Var2 = cxh0Var;
        } else {
            xq00Var.m91757b0();
            fxh0Var2 = fxh0Var;
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new gy5(i, 6, str, str2, eh00Var, fxh0Var2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final int m41459g(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* JADX INFO: renamed from: h */
    public static final int m41460h(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m41461i(zbr zbrVar) {
        return (zbrVar == null || zbrVar.f281389e || zbrVar.f281385a || !zbrVar.f281388d || zbrVar.f281391g) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static void m41462j(View view) {
        view.setFocusable(false);
        view.setOnClickListener(null);
        view.setClickable(false);
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m41463k(Object obj, Object obj2) {
        return wj50.m88271j(obj, obj2);
    }

    /* JADX INFO: renamed from: l */
    public static String m41464l(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb.append(((Character) obj).charValue());
            } else {
                sb.append((CharSequence) obj.toString());
            }
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: m */
    public static final HashSet m41465m(ArrayList arrayList) {
        HashSet hashSet = new HashSet(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            hashSet.add(arrayList.get(i));
        }
        return hashSet;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX INFO: renamed from: o */
    public static ff31 m41466o(c700 c700Var, Class cls) {
        i500 i500VarM31604F = c700Var.m31604F(ff31.f68891e2);
        if (i500VarM31604F == null) {
            i500VarM31604F = null;
        } else {
            Bundle bundle = i500VarM31604F.f98701f;
            if (!wj50.m88271j(bundle != null ? bundle.getSerializable("factory_key") : null, cls)) {
                i500VarM31604F = null;
            }
        }
        ff31 ff31Var = i500VarM31604F instanceof ff31 ? (ff31) i500VarM31604F : null;
        if (ff31Var != null) {
            return ff31Var;
        }
        ff31 ff31Var2 = new ff31();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("factory_key", cls);
        ff31Var2.m49706b1(bundle2);
        return ff31Var2;
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m41467p(yuf0 yuf0Var) {
        i0r0 i0r0Var;
        List list = yuf0Var.f276352X0;
        b791 b791Var = yuf0Var.f276341N0;
        b791 b791Var2 = yuf0Var.f276343P0;
        Integer num = b791Var2.f24196b.f204165L0;
        if (yuf0Var.f276357a) {
            return false;
        }
        if (num != null) {
            if (num.intValue() > (!list.isEmpty() ? ((Number) g6f.m43687A0(list)).intValue() : 0)) {
                return false;
            }
        }
        if (!wj50.m88271j(b791Var2.f24196b.f204175b, yuf0Var.f276344Q0) || !wj50.m88271j(b791Var2.f24196b.f204181h, yuf0Var.f276345R0) || !wj50.m88271j(b791Var, yuf0Var.f276346S0)) {
            return true;
        }
        v1r0 v1r0Var = b791Var2.f24195a.f97302a;
        v1r0 v1r0Var2 = v1r0.None;
        if (v1r0Var == v1r0Var2) {
            if (((b791Var == null || (i0r0Var = b791Var.f24195a) == null) ? null : i0r0Var.f97302a) == v1r0Var2) {
                return false;
            }
        }
        if (wj50.m88271j(b791Var2, b791Var)) {
            return false;
        }
        if (wj50.m88271j(yuf0Var.f276347T0, e2r0.f55505a)) {
            return b791Var != null;
        }
        return !wj50.m88271j(b791Var2, yuf0Var.f276369g);
    }

    /* JADX INFO: renamed from: q */
    public static final int m41468q(int i) {
        int i2 = i * 4;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        return i2 / 4;
    }

    /* JADX INFO: renamed from: r */
    public static final int m41469r(int i) {
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        return i2 / 8;
    }

    /* JADX INFO: renamed from: s */
    public static final t050 m41470s(z8k z8kVar, jkk0 jkk0Var) {
        return ((b9k) z8kVar).m28489g("SystemVolumeSpikeDetectorDaemon", new wjk0(jkk0Var, 14));
    }

    /* JADX INFO: renamed from: t */
    public static final dh31 m41471t(tut tutVar, gh00 gh00Var) {
        return new dh31(22, tutVar, gh00Var);
    }

    /* JADX INFO: renamed from: u */
    public static final h691 m41472u(uut uutVar, gh00 gh00Var) {
        return new h691(uutVar, gh00Var);
    }

    /* JADX INFO: renamed from: v */
    public static final i691 m41473v(avt avtVar, gh00 gh00Var) {
        return new i691(avtVar, gh00Var);
    }

    /* JADX INFO: renamed from: w */
    public static final fgu m41474w(xq00 xq00Var) {
        Object objM91750T = xq00Var.m91750T();
        if (objM91750T == t6x0.f217647t) {
            objM91750T = new fgu();
            xq00Var.m91793t0(objM91750T);
        }
        return (fgu) objM91750T;
    }

    /* JADX INFO: renamed from: n */
    public abstract void mo41475n(wh01 wh01Var, float f, float f2);
}
