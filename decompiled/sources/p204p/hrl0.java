package p204p;

import android.widget.TextView;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class hrl0 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f94482a;

    /* JADX INFO: renamed from: b */
    public static final hrl0 f94471b = new hrl0(0);

    /* JADX INFO: renamed from: c */
    public static final hrl0 f94473c = new hrl0(1);

    /* JADX INFO: renamed from: d */
    public static final hrl0 f94475d = new hrl0(2);

    /* JADX INFO: renamed from: e */
    public static final hrl0 f94476e = new hrl0(3);

    /* JADX INFO: renamed from: f */
    public static final hrl0 f94477f = new hrl0(4);

    /* JADX INFO: renamed from: g */
    public static final hrl0 f94478g = new hrl0(5);

    /* JADX INFO: renamed from: h */
    public static final hrl0 f94479h = new hrl0(6);

    /* JADX INFO: renamed from: i */
    public static final hrl0 f94480i = new hrl0(7);

    /* JADX INFO: renamed from: t */
    public static final hrl0 f94481t = new hrl0(8);

    /* JADX INFO: renamed from: X */
    public static final hrl0 f94464X = new hrl0(9);

    /* JADX INFO: renamed from: Y */
    public static final hrl0 f94466Y = new hrl0(10);

    /* JADX INFO: renamed from: Z */
    public static final hrl0 f94468Z = new hrl0(11);

    /* JADX INFO: renamed from: L0 */
    public static final hrl0 f94452L0 = new hrl0(12);

    /* JADX INFO: renamed from: M0 */
    public static final hrl0 f94453M0 = new hrl0(13);

    /* JADX INFO: renamed from: N0 */
    public static final hrl0 f94454N0 = new hrl0(14);

    /* JADX INFO: renamed from: O0 */
    public static final hrl0 f94455O0 = new hrl0(15);

    /* JADX INFO: renamed from: P0 */
    public static final hrl0 f94456P0 = new hrl0(16);

    /* JADX INFO: renamed from: Q0 */
    public static final hrl0 f94457Q0 = new hrl0(17);

    /* JADX INFO: renamed from: R0 */
    public static final hrl0 f94458R0 = new hrl0(18);

    /* JADX INFO: renamed from: S0 */
    public static final hrl0 f94459S0 = new hrl0(19);

    /* JADX INFO: renamed from: T0 */
    public static final hrl0 f94460T0 = new hrl0(20);

    /* JADX INFO: renamed from: U0 */
    public static final hrl0 f94461U0 = new hrl0(21);

    /* JADX INFO: renamed from: V0 */
    public static final hrl0 f94462V0 = new hrl0(22);

    /* JADX INFO: renamed from: W0 */
    public static final hrl0 f94463W0 = new hrl0(23);

    /* JADX INFO: renamed from: X0 */
    public static final hrl0 f94465X0 = new hrl0(24);

    /* JADX INFO: renamed from: Y0 */
    public static final hrl0 f94467Y0 = new hrl0(25);

    /* JADX INFO: renamed from: Z0 */
    public static final hrl0 f94469Z0 = new hrl0(26);

    /* JADX INFO: renamed from: a1 */
    public static final hrl0 f94470a1 = new hrl0(27);

    /* JADX INFO: renamed from: b1 */
    public static final hrl0 f94472b1 = new hrl0(28);

    /* JADX INFO: renamed from: c1 */
    public static final hrl0 f94474c1 = new hrl0(29);

    public /* synthetic */ hrl0(int i) {
        this.f94482a = i;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:133:0x0226  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p204p.gh00
    public final Object invoke(Object obj) throws IOException {
        jd21 jd21VarMo27380q;
        d6a1 d6a1VarM81644r;
        gd70 gd70VarMo29933i;
        vfe vfeVarM81933f;
        gd70 gd70VarMo29933i2;
        boolean zM59169b;
        eab eabVarM81929b;
        String strM64249l;
        boolean z = true;
        switch (this.f94482a) {
            case 0:
                List list = irl0.f105011c;
                s3b1 s3b1Var = (s3b1) g6f.m43689C0(((mi00) obj).mo32015K());
                if (s3b1Var == null || txq.m81928a(s3b1Var) || s3b1Var.f205254X != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
            case 1:
                mi00 mi00Var = (mi00) obj;
                List list2 = irl0.f105011c;
                oqo oqoVarMo27379o = mi00Var.mo27379o();
                if (oqoVarMo27379o instanceof nfe) {
                    qti0 qti0Var = ib70.f100456e;
                    if (ib70.m50145b((nfe) oqoVarMo27379o, qm41.f190093a)) {
                        return null;
                    }
                }
                Collection collectionMo32019p = mi00Var.mo32019p();
                if (!collectionMo32019p.isEmpty()) {
                    Iterator it = collectionMo32019p.iterator();
                    while (it.hasNext()) {
                        oqo oqoVarMo27379o2 = ((mi00) it.next()).mo27379o();
                        if (oqoVarMo27379o2 instanceof nfe) {
                            qti0 qti0Var2 = ib70.f100456e;
                            if (ib70.m50145b((nfe) oqoVarMo27379o2, qm41.f190093a)) {
                                return null;
                            }
                        }
                    }
                }
                oqo oqoVarMo27379o3 = mi00Var.mo27379o();
                nfe nfeVar = oqoVarMo27379o3 instanceof nfe ? (nfe) oqoVarMo27379o3 : null;
                if (nfeVar != null) {
                    if (!rt40.m76366b(nfeVar)) {
                        nfeVar = null;
                    }
                    if (nfeVar != null && (jd21VarMo27380q = nfeVar.mo27380q()) != null && (d6a1VarM81644r = tw41.m81644r(jd21VarMo27380q)) != null && (gd70VarMo29933i = mi00Var.mo29933i()) != null && wj50.m88271j(((pqo) mi00Var).getName(), jrl0.f115218d)) {
                        qti0 qti0Var3 = ib70.f100456e;
                        if ((ib70.m50135C(gd70VarMo29933i, qm41.f190107h) || ib70.m50138F(gd70VarMo29933i)) && mi00Var.mo32015K().size() == 1 && wj50.m88271j(tw41.m81644r(((s3b1) mi00Var.mo32015K().get(0)).getType()), d6a1VarM81644r) && mi00Var.mo32018n0().isEmpty() && mi00Var.mo32017Q() == null) {
                            return null;
                        }
                    }
                }
                StringBuilder sb = new StringBuilder("must override ''equals()'' in Any");
                if (rt40.m76366b(mi00Var.mo27379o())) {
                    sb.append(" or define ''equals(other: " + jxq.f117171d.m54688U(tw41.m81644r(((nfe) mi00Var.mo27379o()).mo27380q())) + "): Boolean''");
                }
                return sb.toString();
            case 2:
                mi00 mi00Var2 = (mi00) obj;
                List list3 = irl0.f105011c;
                wr70 wr70VarMo32016N = mi00Var2.mo32016N();
                if (wr70VarMo32016N == null) {
                    wr70VarMo32016N = mi00Var2.mo32017Q();
                }
                if (wr70VarMo32016N == null) {
                    z = false;
                } else {
                    gd70 gd70VarMo29933i3 = mi00Var2.mo29933i();
                    if (!(gd70VarMo29933i3 != null ? id70.f100964a.m59169b(gd70VarMo29933i3, wr70VarMo32016N.getType()) : false)) {
                        rzu0 rzu0VarM88808H1 = wr70VarMo32016N.m88808H1();
                        if (rzu0VarM88808H1 instanceof kg40) {
                            nfe nfeVar2 = ((kg40) rzu0VarM88808H1).f122298a;
                            if (nfeVar2.mo28471g0() && (vfeVarM81933f = txq.m81933f(nfeVar2)) != null) {
                                qge qgeVarM65522h = nsf1.m65522h(rxq.m76665c(nfeVar2), vfeVarM81933f);
                                cn91 cn91Var = qgeVarM65522h instanceof cn91 ? (cn91) qgeVarM65522h : null;
                                if (cn91Var == null || (gd70VarMo29933i2 = mi00Var2.mo29933i()) == null) {
                                    zM59169b = false;
                                } else {
                                    zM59169b = id70.f100964a.m59169b(gd70VarMo29933i2, ((syq) cn91Var).m79711I1());
                                }
                            } else {
                                zM59169b = false;
                            }
                        } else {
                            zM59169b = false;
                        }
                        if (!zM59169b) {
                            z = false;
                        }
                    }
                }
                if (z) {
                    return null;
                }
                return "receiver must be a supertype of the return type";
            case 3:
                return ((n3m0) ((m3m0) obj)).f150085f;
            case 4:
                return Boolean.valueOf(obj instanceof izd1);
            case 5:
                return "(raw) ".concat((String) obj);
            case 6:
                List list4 = bov0.f29260a;
                Type ownerType = ((ParameterizedType) obj).getOwnerType();
                if (ownerType instanceof ParameterizedType) {
                    return (ParameterizedType) ownerType;
                }
                return null;
            case 7:
                List list5 = bov0.f29260a;
                return bk5.m29613h0(((ParameterizedType) obj).getActualTypeArguments());
            case 8:
                return Boolean.valueOf(((Class) obj).getSimpleName().length() == 0);
            case 9:
                String simpleName = ((Class) obj).getSimpleName();
                if (!qti0.m73842f(simpleName)) {
                    simpleName = null;
                }
                if (simpleName != null) {
                    return qti0.m73841e(simpleName);
                }
                return null;
            case 10:
                hr60 hr60Var = (hr60) obj;
                StringBuilder sb2 = new StringBuilder();
                String name = hr60Var.getName();
                if (name == null) {
                    name = "_";
                }
                sb2.append(name);
                sb2.append(": ");
                sb2.append(hr60Var.getType());
                return sb2.toString();
            case 11:
                return qyq0.m74225j(((hr60) obj).getType(), false);
            case 12:
                return qyq0.m74225j(((hr60) obj).getType(), false);
            case 13:
                return gga.m44680s((qti0) obj);
            case 14:
                return (String) obj;
            case 15:
                ib70 ib70Var = (ib70) obj;
                ycx0 ycx0Var = ycx0.f271591c;
                ib70Var.getClass();
                return ib70Var.m50166t(her0.BOOLEAN);
            case 16:
                ib70 ib70Var2 = (ib70) obj;
                zcx0 zcx0Var = zcx0.f281584c;
                ib70Var2.getClass();
                return ib70Var2.m50166t(her0.INT);
            case 17:
                adx0 adx0Var = adx0.f14694c;
                return ((ib70) obj).m50169x();
            case 18:
                Class cls = (Class) obj;
                wj50.m88279p(cls);
                return bov0.m30094b(cls);
            case 19:
                String str = (String) obj;
                return str.length() > 1 ? dq60.m36608h(';', "L", str) : str;
            case 20:
                wr70 wr70VarMo32017Q = ((eab) obj).mo32017Q();
                wj50.m88279p(wr70VarMo32017Q);
                return wr70VarMo32017Q.getType();
            case 21:
                gd70 gd70VarMo29933i4 = ((eab) obj).mo29933i();
                wj50.m88279p(gd70VarMo29933i4);
                return gd70VarMo29933i4;
            case 22:
                return Boolean.valueOf(((d6a1) obj) instanceof tbu0);
            case 23:
                qge qgeVarMo25169G = ((d6a1) obj).mo36063C0().mo25169G();
                if (qgeVarMo25169G == null) {
                    return Boolean.FALSE;
                }
                qti0 name2 = qgeVarMo25169G.getName();
                y400 y400Var = vd60.f240332f;
                return Boolean.valueOf(wj50.m88271j(name2, y400Var.f269048a.m95306g()) && wj50.m88271j(txq.m81930c(qgeVarMo25169G), y400Var));
            case 24:
                return Boolean.valueOf(gyf1.m46153s(txq.m81936i((eab) obj)));
            case 25:
                int i = zqa.f285336l;
                qc21 qc21Var = (qc21) ((eab) obj);
                return Boolean.valueOf(ib70.m50133A(qc21Var) && txq.m81929b(qc21Var, new C2483v5(qc21Var, 8)) != null);
            case 26:
                eab eabVar = (eab) obj;
                if (ib70.m50133A(eabVar)) {
                    int i2 = ara.f18984l;
                    if (!ox31.f170867e.contains(eabVar.getName()) || (eabVarM81929b = txq.m81929b(eabVar, a53.f12405e)) == null || (strM64249l = nec.m64249l(eabVarM81929b)) == null) {
                        z = false;
                    } else if (!ox31.f170864b.contains(strM64249l)) {
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                return Boolean.valueOf(obj instanceof TextView);
            case 28:
                return Integer.valueOf(((j1t0) obj).f107858d.size());
            default:
                return (qc21) obj;
        }
    }
}
