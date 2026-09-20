package p204p;

import android.net.Uri;
import com.spotify.music.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ddg1 {

    /* JADX INFO: renamed from: a */
    public static final o50 f47824a = new o50("android.widget.extra.CHECKED");

    /* JADX INFO: renamed from: b */
    public static sd40 f47825b;

    /* JADX INFO: renamed from: c */
    public static sd40 f47826c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX INFO: renamed from: a */
    public static final void m35730a(fyf fyfVar, xq00 xq00Var, int i) {
        wb9 wb9Var = d7f0.f46166e;
        xq00Var.m91775k0(-915253799);
        ug5 ug5Var = xq00Var.f264811a;
        boolean z = 0;
        if (!xq00Var.m91752Y(i & 1, (i & 3) != 2)) {
            xq00Var.m91757b0();
        } else {
            if (!((Boolean) xq00Var.m91774k(jgj.f112197a)).booleanValue()) {
                xq00Var.m91771i0(-1873434837);
                fyfVar.invoke(xq00Var, 6);
                xq00Var.m91788r(false);
                pgv0 pgv0VarM91796v = xq00Var.m91796v();
                if (pgv0VarM91796v != null) {
                    pgv0VarM91796v.f177419d = new vn2(fyfVar, i, 11);
                    return;
                }
                return;
            }
            xq00Var.m91771i0(-1873406007);
            xq00Var.m91788r(false);
            gij gijVar = (gij) xq00Var.m91774k(hba0.f89466a);
            kqi0 kqi0VarM69675a = pda0.m69675a(xq00Var);
            ro80 ro80VarM44508o = geg1.m44508o();
            if (gijVar instanceof eij) {
                ro80VarM44508o.add(new xoo(s571.m77246e(((eij) gijVar).f59894a, "INDEX:"), rfg1.m75434d(4283215696L)));
            }
            if (((b250) kqi0VarM69675a.getValue()).mo27941a(oet.f164535T0) != null) {
                throw new ClassCastException();
            }
            ro80VarM44508o.addAll(lau.f131415a);
            ro80 ro80VarM44506m = geg1.m44506m(ro80VarM44508o);
            if (ro80VarM44506m.isEmpty()) {
                xq00Var.m91771i0(-1873067797);
                fyfVar.invoke(xq00Var, 6);
                xq00Var.m91788r(false);
                pgv0 pgv0VarM91796v2 = xq00Var.m91796v();
                if (pgv0VarM91796v2 != null) {
                    pgv0VarM91796v2.f177419d = new vn2(fyfVar, i, 12);
                    return;
                }
                return;
            }
            xq00Var.m91771i0(-1873038967);
            xq00Var.m91788r(false);
            m6d0 m6d0VarM36007d = dha.m36007d(wb9Var, false);
            int iHashCode = Long.hashCode(xq00Var.f264809T);
            wpn0 wpn0VarM91778m = xq00Var.m91778m();
            cxh0 cxh0Var = cxh0.f43038a;
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, cxh0Var);
            soh.f211194A.getClass();
            eh00 eh00Var = roh.f201257b;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var.m91779m0();
            if (xq00Var.f264808S) {
                xq00Var.m91776l(eh00Var);
            } else {
                xq00Var.m91799w0();
            }
            zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var);
            zsf1.m96833D(roh.f201266k, xq00Var);
            zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
            fyfVar.invoke(xq00Var, 6);
            xq00Var.m91771i0(1643380512);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ListIterator listIterator = ro80VarM44506m.listIterator(0);
            while (true) {
                qo80 qo80Var = (qo80) listIterator;
                if (!qo80Var.hasNext()) {
                    break;
                }
                Object next = qo80Var.next();
                ((xoo) next).getClass();
                wb9 wb9Var2 = d7f0.f46170g;
                Object arrayList = linkedHashMap.get(wb9Var2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(wb9Var2, arrayList);
                }
                ((List) arrayList).add(next);
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                ob3 ob3Var = (ob3) entry.getKey();
                List list = (List) entry.getValue();
                fxh0 fxh0VarMo66945a = pha.f177517a.mo66945a(cxh0Var, ob3Var);
                m6d0 m6d0VarM36007d2 = dha.m36007d(wb9Var, z);
                int iHashCode2 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var, fxh0VarMo66945a);
                soh.f211194A.getClass();
                eh00 eh00Var2 = roh.f201257b;
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var2);
                } else {
                    xq00Var.m91799w0();
                }
                yhh yhhVar = roh.f201262g;
                zsf1.m96835F(m6d0VarM36007d2, yhhVar, xq00Var);
                yhh yhhVar2 = roh.f201261f;
                zsf1.m96835F(wpn0VarM91778m2, yhhVar2, xq00Var);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                yhh yhhVar3 = roh.f201265j;
                zsf1.m96835F(numValueOf, yhhVar3, xq00Var);
                vlh vlhVar = roh.f201266k;
                zsf1.m96833D(vlhVar, xq00Var);
                yhh yhhVar4 = roh.f201259d;
                zsf1.m96835F(fxh0VarM48286s2, yhhVar4, xq00Var);
                aaf aafVarM87496a = w9f.m87496a(bj5.f27612c, d7f0.f46144O0, xq00Var, z);
                int iHashCode3 = Long.hashCode(xq00Var.f264809T);
                wpn0 wpn0VarM91778m3 = xq00Var.m91778m();
                fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var, cxh0Var);
                xq00Var.m91779m0();
                if (xq00Var.f264808S) {
                    xq00Var.m91776l(eh00Var2);
                } else {
                    xq00Var.m91799w0();
                }
                zsf1.m96835F(aafVarM87496a, yhhVar, xq00Var);
                zsf1.m96835F(wpn0VarM91778m3, yhhVar2, xq00Var);
                AbstractC0000a.m20s(iHashCode3, xq00Var, yhhVar3, xq00Var, vlhVar);
                Iterator itM93451j = ydj.m93451j(xq00Var, fxh0VarM48286s3, yhhVar4, 1063136544, list);
                while (itM93451j.hasNext()) {
                    xoo xooVar = (xoo) itM93451j.next();
                    float f = 1;
                    ahf1.m25932d(xooVar.f264342a, zsf1.m96866z(nec.m64246i(zsf1.m96865y(f, cxh0Var), xooVar.f264343b, hmx0.m47993b(4)), 3, f), if71.m50418a(leu.m58818d(xq00Var).f64974j, 0L, epv0.m39702v(9), null, null, null, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, null, 0, 16777213), n6f.f150866f, null, null, 0, false, null, 0, null, xq00Var, 3072, 0, 2032);
                    cxh0Var = cxh0Var;
                    wb9Var = wb9Var;
                }
                a831.m25018j(xq00Var, false, true, true);
                z = 0;
            }
            xq00Var.m91788r(z);
            xq00Var.m91788r(true);
        }
        pgv0 pgv0VarM91796v3 = xq00Var.m91796v();
        if (pgv0VarM91796v3 != null) {
            pgv0VarM91796v3.f177419d = new vn2(fyfVar, i, 13);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m35731b(int i, gh00 gh00Var, xq00 xq00Var, fxh0 fxh0Var, snb1 snb1Var) {
        int i2;
        xq00Var.m91775k0(73409604);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? xq00Var.m91766g(snb1Var) : xq00Var.m91770i(snb1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (xq00Var.m91752Y(i3 & 1, (i3 & 147) != 146)) {
            qiu.m72876b(18, rkk.m75772x(2068417583, new aqf(snb1Var, gh00Var), xq00Var), xq00Var, 54);
            fxh0Var = cxh0.f43038a;
        } else {
            xq00Var.m91757b0();
        }
        fxh0 fxh0Var2 = fxh0Var;
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new aez(snb1Var, gh00Var, fxh0Var2, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Throwable] */
    /* JADX INFO: renamed from: c */
    public static final void m35732c(qf40 qf40Var, float f, float f2, float f3, fxh0 fxh0Var, xq00 xq00Var, int i) {
        xq00 xq00Var2;
        xq00 xq00Var3 = xq00Var;
        ia7 ia7Var = t6x0.f217647t;
        xq00Var3.m91775k0(821477253);
        ug5 ug5Var = xq00Var3.f264811a;
        int i2 = i | (xq00Var3.m91766g(qf40Var) ? 4 : 2) | (xq00Var3.m91766g(fxh0Var) ? 16384 : 8192);
        boolean z = true;
        boolean z2 = false;
        if (xq00Var3.m91752Y(i2 & 1, (i2 & 9363) != 9362)) {
            Object objM91750T = xq00Var3.m91750T();
            if (objM91750T == ia7Var) {
                objM91750T = iel0.f101449Y0;
                xq00Var3.m91793t0(objM91750T);
            }
            fxh0 fxh0VarM57831m = l0y0.m57831m(fxh0Var, (gh00) objM91750T);
            irx0 irx0VarM36744a = drx0.m36744a(bj5.m29370g(f2), d7f0.f46141L0, xq00Var3, 0);
            int iHashCode = Long.hashCode(xq00Var3.f264809T);
            wpn0 wpn0VarM91778m = xq00Var3.m91778m();
            fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var3, fxh0VarM57831m);
            soh.f211194A.getClass();
            C2087le c2087le = roh.f201257b;
            wb9 wb9Var = null;
            if (ug5Var == null) {
                pmg1.m70360s();
                throw null;
            }
            xq00Var3.m91779m0();
            if (xq00Var3.f264808S) {
                xq00Var3.m91776l(c2087le);
            } else {
                xq00Var3.m91799w0();
            }
            zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var3);
            zsf1.m96835F(wpn0VarM91778m, roh.f201261f, xq00Var3);
            zsf1.m96835F(Integer.valueOf(iHashCode), roh.f201265j, xq00Var3);
            zsf1.m96833D(roh.f201266k, xq00Var3);
            Iterator itM42470n = fr0.m42470n(xq00Var3, fxh0VarM48286s, roh.f201259d, -501597180, qf40Var);
            int i3 = 0;
            while (itM42470n.hasNext()) {
                Object next = itM42470n.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    ?? r23 = wb9Var;
                    h6f.m46722S();
                    throw r23;
                }
                zd20 zd20Var = (zd20) next;
                cxh0 cxh0Var = cxh0.f43038a;
                fxh0 fxh0VarM61814B = mi21.m61814B(cxh0Var, wb9Var, 3);
                Object objM91750T2 = xq00Var3.m91750T();
                if (objM91750T2 == ia7Var) {
                    objM91750T2 = new y2g0(f3, 4);
                    xq00Var3.m91793t0(objM91750T2);
                }
                fxh0 fxh0VarM37368M = dyu.m37368M(-i3, z520.m95415B(fxh0VarM61814B, (gh00) objM91750T2));
                m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46174i, z2);
                int iHashCode2 = Long.hashCode(xq00Var3.f264809T);
                wpn0 wpn0VarM91778m2 = xq00Var3.m91778m();
                fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var3, fxh0VarM37368M);
                soh.f211194A.getClass();
                C2087le c2087le2 = roh.f201257b;
                xq00Var3.m91779m0();
                if (xq00Var3.f264808S) {
                    xq00Var3.m91776l(c2087le2);
                } else {
                    xq00Var3.m91799w0();
                }
                zsf1.m96835F(m6d0VarM36007d, roh.f201262g, xq00Var3);
                zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var3);
                zsf1.m96835F(Integer.valueOf(iHashCode2), roh.f201265j, xq00Var3);
                zsf1.m96833D(roh.f201266k, xq00Var3);
                zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var3);
                xq00 xq00Var4 = xq00Var3;
                l0y0.m57821c(Uri.parse(zd20Var.f281613a), qgj.f188480a, r9g1.m75068p(mi21.m61834r(f, cxh0Var), hmx0.f93097a), null, null, null, null, null, null, null, false, false, xq00Var4, 27696, 0, 4064);
                xq00Var4.m91788r(true);
                z = true;
                z2 = false;
                xq00Var3 = xq00Var4;
                i3 = i4;
                wb9Var = wb9Var;
            }
            xq00Var2 = xq00Var3;
            xq00Var2.m91788r(z2);
            xq00Var2.m91788r(z);
        } else {
            xq00Var2 = xq00Var3;
            xq00Var2.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var2.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new uw90(qf40Var, f, f2, f3, fxh0Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m35733d(l971 l971Var, String str, eh00 eh00Var, gh00 gh00Var, xq00 xq00Var, int i) {
        l971 l971Var2;
        int i2;
        String strM12k;
        fyf fyfVarM75772x;
        xq00Var.m91775k0(-343970663);
        if ((i & 6) == 0) {
            l971Var2 = l971Var;
            i2 = (xq00Var.m91770i(l971Var2) ? 4 : 2) | i;
        } else {
            l971Var2 = l971Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= xq00Var.m91766g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= xq00Var.m91770i(eh00Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= xq00Var.m91770i(gh00Var) ? 2048 : 1024;
        }
        if (xq00Var.m91752Y(i2 & 1, (i2 & 1171) != 1170)) {
            if (str == null) {
                strM12k = AbstractC0000a.m12k(xq00Var, 156683704, R.string.chat_content_picker_search_placeholder, xq00Var, false);
            } else {
                xq00Var.m91771i0(156683115);
                xq00Var.m91788r(false);
                strM12k = str;
            }
            if (l971Var2.m58500d().f226935c.length() > 0) {
                xq00Var.m91771i0(562606598);
                fyfVarM75772x = rkk.m75772x(1366742233, new zt10(eh00Var, false, 25), xq00Var);
                xq00Var.m91788r(false);
            } else {
                xq00Var.m91771i0(563077395);
                xq00Var.m91788r(false);
                fyfVarM75772x = null;
            }
            fyf fyfVar = fyfVarM75772x;
            int i3 = i2;
            t0v t0vVar = new t0v(new n0v(leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138757a, leu.m58815a(xq00Var).f112824b.f138758b, leu.m58815a(xq00Var).f112824b.f138760d, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112823a.f229875b.f123093a, leu.m58815a(xq00Var).f112824b.f138759c, 0L, 896));
            fxh0 fxh0VarM96866z = zsf1.m96866z(mi21.m61826j(mi21.m61822f(1.0f, cxh0.f43038a), leu.m58816b(xq00Var).f117232d.f137887c, 0.0f, 2), leu.m58816b(xq00Var).f117230b.f224763f, leu.m58816b(xq00Var).f117230b.f224761d);
            boolean z = (i3 & 7168) == 2048;
            Object objM91750T = xq00Var.m91750T();
            if (z || objM91750T == t6x0.f217647t) {
                objM91750T = new jhy0(2, gh00Var);
                xq00Var.m91793t0(objM91750T);
            }
            wze1.m89429e(l971Var2, t0vVar, p1m0.m68834o(fxh0VarM96866z, (gh00) objM91750T), null, strM12k, m6h.f140518b, fyfVar, false, null, null, null, null, q771.f186043b, null, null, null, null, 0.0f, xq00Var, (i3 & 14) | 196608, 0, 1040264);
        } else {
            xq00Var.m91757b0();
        }
        pgv0 pgv0VarM91796v = xq00Var.m91796v();
        if (pgv0VarM91796v != null) {
            pgv0VarM91796v.f177419d = new zmu0(l971Var, str, eh00Var, gh00Var, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    /* JADX INFO: renamed from: e */
    public static Object m35734e(f8b0 f8b0Var, u8b0 u8b0Var, int i, boolean z, float f, t8b0 t8b0Var, float f2, boolean z2, mb61 mb61Var, int i2) {
        float f3;
        int iM41027f = f8b0Var.m41027f();
        int iIntValue = (i2 & 4) != 0 ? ((Number) f8b0Var.f66942c.getValue()).intValue() : i;
        boolean zBooleanValue = (i2 & 8) != 0 ? ((Boolean) f8b0Var.f66943d.getValue()).booleanValue() : z;
        float fM41029j = (i2 & 16) != 0 ? f8b0Var.m41029j() : f;
        t8b0 t8b0VarM41024c = (i2 & 32) != 0 ? f8b0Var.m41024c() : t8b0Var;
        if ((i2 & 64) != 0) {
            float fMo74978b = 0.0f;
            if (fM41029j < 0.0f && u8b0Var == null) {
                fMo74978b = 1.0f;
            } else if (u8b0Var != null) {
                if (fM41029j < 0.0f) {
                    if (t8b0VarM41024c != null) {
                        fMo74978b = t8b0VarM41024c.mo74977a(u8b0Var);
                    } else {
                        fMo74978b = 1.0f;
                    }
                } else if (t8b0VarM41024c != null) {
                    fMo74978b = t8b0VarM41024c.mo74978b(u8b0Var);
                }
            }
            f3 = fMo74978b;
        } else {
            f3 = f2;
        }
        Object objM30301b = f8b0Var.f66936M0.m30301b(xqi0.f265055a, new c8b0(f8b0Var, iM41027f, iIntValue, zBooleanValue, fM41029j, t8b0VarM41024c, u8b0Var, f3, false, (i2 & 128) != 0 ? false : z2, 1, null), mb61Var);
        return objM30301b == yuk.f276404a ? objM30301b : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: f */
    public static void m35735f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(klh.m56833e(obj2, "null key in entry: null="));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    /* JADX INFO: renamed from: g */
    public static void m35736g(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(edb.m38565n(str, " cannot be negative but was: ", i));
        }
    }

    /* JADX INFO: renamed from: h */
    public static final String m35737h(jn91 jn91Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("type: " + jn91Var);
        sb.append('\n');
        sb.append("hashCode: " + jn91Var.hashCode());
        sb.append('\n');
        sb.append("javaClass: " + jn91Var.getClass().getCanonicalName());
        sb.append('\n');
        for (oqo oqoVarMo25169G = jn91Var.mo25169G(); oqoVarMo25169G != null; oqoVarMo25169G = oqoVarMo25169G.mo27379o()) {
            sb.append("fqName: " + jxq.f117170c.m54718v(oqoVarMo25169G));
            sb.append('\n');
            sb.append("javaClass: " + oqoVarMo25169G.getClass().getCanonicalName());
            sb.append('\n');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m35738i(int i, int i2) {
        return i == i2;
    }

    /* JADX INFO: renamed from: j */
    public static void m35739j(File file, InputStream inputStream) throws Throwable {
        byte[] bArr = new byte[8192];
        GZIPOutputStream gZIPOutputStream = null;
        try {
            GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(new FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        gZIPOutputStream2.finish();
                        upf.m83700q(gZIPOutputStream2);
                        return;
                    }
                    gZIPOutputStream2.write(bArr, 0, i);
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    upf.m83700q(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m35740k(sh50 sh50Var) {
        ig21 ig21Var = sh50Var.f209105c;
        return (ig21Var instanceof eg21) && wj50.m88271j(((eg21) ig21Var).f59203a, yf21.f272108a);
    }

    /* JADX INFO: renamed from: l */
    public static int m35741l(int i) {
        return Integer.hashCode(i);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m35742m(ifo ifoVar) {
        List list;
        if (ifoVar instanceof gfo) {
            return ((gfo) ifoVar).f79415b instanceof ijo;
        }
        if (!(ifoVar instanceof efo) || ((list = ((efo) ifoVar).f59082a) != null && list.isEmpty())) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m35742m((ifo) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static void m35743n(File file, ArrayList arrayList) {
        String str;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            kva kvaVar = (kva) it.next();
            InputStream inputStreamM57454a = null;
            try {
                inputStreamM57454a = kvaVar.m57454a();
                if (inputStreamM57454a != null) {
                    switch (kvaVar.f126804a) {
                        case 0:
                            str = kvaVar.f126806c;
                            break;
                        default:
                            str = kvaVar.f126806c;
                            break;
                    }
                    m35739j(new File(file, str), inputStreamM57454a);
                }
            } catch (IOException unused) {
            } finally {
                upf.m83700q(null);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static Object m35744o(f8b0 f8b0Var, u8b0 u8b0Var, float f, mb61 mb61Var, int i) {
        if ((i & 1) != 0) {
            u8b0Var = f8b0Var.m41025d();
        }
        Object objM30301b = f8b0Var.f66936M0.m30301b(xqi0.f265055a, new e8b0(f8b0Var, u8b0Var, f, (i & 4) != 0 ? f8b0Var.m41027f() : 1, !(f == f8b0Var.m41028i()), null), mb61Var);
        return objM30301b == yuk.f276404a ? objM30301b : w2a1.f247311a;
    }

    /* JADX INFO: renamed from: p */
    public static final wcs0 m35745p(jcs0 jcs0Var, e3y e3yVar) {
        if (e3yVar == null) {
            return new wcs0(jcs0Var.f111184b, "", new ow71(""), "", "", "", "", "", "", null, null);
        }
        ycs0 ycs0Var = e3yVar.f55899a;
        String str = ycs0Var.f271561f;
        String str2 = ycs0Var.f271556a;
        i2h1 nw71Var = str != null ? new nw71(str, str2) : new ow71(str2);
        String str3 = jcs0Var.f111184b;
        String str4 = ycs0Var.f271557b;
        String str5 = ycs0Var.f271558c;
        String str6 = ycs0Var.f271559d;
        String str7 = ycs0Var.f271560e;
        String str8 = ycs0Var.f271563h;
        String str9 = ycs0Var.f271562g;
        String str10 = ycs0Var.f271566k;
        if (str10 == null || wl51.m88460J0(str10)) {
            str10 = null;
        }
        return new wcs0(str3, ycs0Var.f271559d, nw71Var, str4, str5, str6, str7, str8, str9, str10, e3yVar.f55900b);
    }
}
