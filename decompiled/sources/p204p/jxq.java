package p204p;

import com.comscore.streaming.ContentType;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes11.dex */
public final class jxq implements lxq {

    /* JADX INFO: renamed from: c */
    public static final jxq f117170c;

    /* JADX INFO: renamed from: d */
    public static final jxq f117171d;

    /* JADX INFO: renamed from: e */
    public static final jxq f117172e;

    /* JADX INFO: renamed from: a */
    public final nxq f117173a;

    /* JADX INFO: renamed from: b */
    public final wg61 f117174b = new wg61(new C2642z9(this, 20));

    static {
        nxq nxqVar = new nxq();
        gbu gbuVar = gbu.f78413a;
        nxqVar.mo54708j(gbuVar);
        nxqVar.f159555a = true;
        new jxq(nxqVar);
        nxq nxqVar2 = new nxq();
        nxqVar2.mo54710l();
        nxqVar2.f159555a = true;
        new jxq(nxqVar2);
        nxq nxqVar3 = new nxq();
        nxqVar3.mo54710l();
        nxqVar3.mo54708j(gbuVar);
        nxqVar3.f159555a = true;
        new jxq(nxqVar3);
        nxq nxqVar4 = new nxq();
        nxqVar4.mo54710l();
        nxqVar4.mo54708j(gbuVar);
        nxqVar4.mo54705g();
        nxqVar4.f159555a = true;
        new jxq(nxqVar4);
        nxq nxqVar5 = new nxq();
        nxqVar5.mo54708j(gbuVar);
        sge sgeVar = sge.f208840c;
        nxqVar5.mo54698c(sgeVar);
        ptm0 ptm0Var = ptm0.f181199b;
        nxqVar5.mo54707i(ptm0Var);
        nxqVar5.f159555a = true;
        new jxq(nxqVar5);
        nxq nxqVar6 = new nxq();
        nxqVar6.mo54710l();
        nxqVar6.mo54708j(gbuVar);
        nxqVar6.mo54698c(sgeVar);
        nxqVar6.mo54700d();
        nxqVar6.mo54707i(ptm0.f181200c);
        nxqVar6.mo54694a();
        nxqVar6.mo54696b();
        nxqVar6.mo54705g();
        nxqVar6.mo54702e();
        nxqVar6.f159555a = true;
        new jxq(nxqVar6);
        nxq nxqVar7 = new nxq();
        nxqVar7.mo54708j(kxq.f127541b);
        nxqVar7.f159555a = true;
        f117170c = new jxq(nxqVar7);
        nxq nxqVar8 = new nxq();
        nxqVar8.mo54708j(kxq.f127542c);
        nxqVar8.f159555a = true;
        new jxq(nxqVar8);
        nxq nxqVar9 = new nxq();
        nxqVar9.mo54698c(sgeVar);
        nxqVar9.mo54707i(ptm0Var);
        nxqVar9.f159555a = true;
        f117171d = new jxq(nxqVar9);
        nxq nxqVar10 = new nxq();
        nxqVar10.mo54706h();
        nxqVar10.mo54698c(sge.f208839b);
        nxqVar10.mo54708j(kxq.f127542c);
        nxqVar10.f159555a = true;
        f117172e = new jxq(nxqVar10);
        nxq nxqVar11 = new nxq();
        nxqVar11.mo54711m();
        nxqVar11.mo54708j(kxq.f127542c);
        nxqVar11.f159555a = true;
        new jxq(nxqVar11);
    }

    public jxq(nxq nxqVar) {
        this.f117173a = nxqVar;
    }

    /* JADX INFO: renamed from: T */
    public static void m54665T(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static boolean m54666f0(gd70 gd70Var) {
        if (!bjg1.m29435V(gd70Var)) {
            return false;
        }
        List listMo36061A0 = gd70Var.mo36061A0();
        if (listMo36061A0 != null && listMo36061A0.isEmpty()) {
            return true;
        }
        Iterator it = listMo36061A0.iterator();
        while (it.hasNext()) {
            if (((ho91) it.next()).mo48024c()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static final void m54667n(jxq jxqVar, nys0 nys0Var, StringBuilder sb) throws IOException {
        boolean zM54714q = jxqVar.m54714q();
        nxq nxqVar = jxqVar.f117173a;
        if (!zM54714q) {
            pc0 pc0Var = nxqVar.f159561g;
            qr60[] qr60VarArr = nxq.f159530Y;
            qr60 qr60Var = qr60VarArr[5];
            if (!((Boolean) pc0Var.f61172a).booleanValue()) {
                jxqVar.m54669A(sb, nys0Var.mo32018n0());
                if (jxqVar.m54713p().contains(kxq.ANNOTATIONS)) {
                    jxqVar.m54720x(sb, nys0Var, null);
                    huy huyVarMo65910m0 = nys0Var.mo65910m0();
                    if (huyVarMo65910m0 != null) {
                        jxqVar.m54720x(sb, huyVarMo65910m0, g25.FIELD);
                    }
                    huy huyVarMo65907R = nys0Var.mo65907R();
                    if (huyVarMo65907R != null) {
                        jxqVar.m54720x(sb, huyVarMo65907R, g25.PROPERTY_DELEGATE_FIELD);
                    }
                    pc0 pc0Var2 = nxqVar.f159538H;
                    qr60 qr60Var2 = qr60VarArr[32];
                    if (((mys0) pc0Var2.f61172a) == mys0.f148508b) {
                        tys0 tys0VarMo65908b = nys0Var.mo65908b();
                        if (tys0VarMo65908b != null) {
                            jxqVar.m54720x(sb, tys0VarMo65908b, g25.PROPERTY_GETTER);
                        }
                        zys0 zys0VarMo65909c = nys0Var.mo65909c();
                        if (zys0VarMo65909c != null) {
                            jxqVar.m54720x(sb, zys0VarMo65909c, g25.PROPERTY_SETTER);
                            s3b1 s3b1Var = (s3b1) g6f.m43706T0(zys0VarMo65909c.mo32015K());
                            wj50.m88279p(s3b1Var);
                            jxqVar.m54720x(sb, s3b1Var, g25.SETTER_PARAMETER);
                        }
                    }
                }
                jxqVar.m54701d0(nys0Var.mo28470e(), sb);
                jxqVar.m54680L(sb, jxqVar.m54713p().contains(kxq.CONST) && nys0Var.mo40726b0(), "const");
                jxqVar.m54677I(nys0Var, sb);
                jxqVar.m54679K(nys0Var, sb);
                jxqVar.m54685Q(nys0Var, sb);
                jxqVar.m54680L(sb, jxqVar.m54713p().contains(kxq.LATEINIT) && nys0Var.mo40728q0(), "lateinit");
                jxqVar.m54676H(nys0Var, sb);
            }
            jxqVar.m54695a0(nys0Var, sb, false);
            jxqVar.m54693Z(sb, nys0Var.getTypeParameters(), true);
            wr70 wr70VarMo32017Q = nys0Var.mo32017Q();
            if (wr70VarMo32017Q != null) {
                jxqVar.m54720x(sb, wr70VarMo32017Q, g25.RECEIVER);
                sb.append(jxqVar.m54673E(wr70VarMo32017Q.getType(), false));
                sb.append(".");
            }
        }
        jxqVar.m54682N(nys0Var, sb, true);
        sb.append(": ");
        sb.append(jxqVar.m54688U(nys0Var.getType()));
        jxqVar.m54687S(nys0Var, sb);
        jxqVar.m54674F(nys0Var, sb);
        jxqVar.m54703e0(sb, nys0Var.getTypeParameters());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004f A[RETURN] */
    /* JADX INFO: renamed from: u */
    public static int m54668u(b9e0 b9e0Var) {
        if (b9e0Var instanceof nfe) {
            if (((nfe) b9e0Var).mo30969p0() == 2) {
                return 4;
            }
            return 1;
        }
        oqo oqoVarMo27379o = b9e0Var.mo27379o();
        nfe nfeVar = oqoVarMo27379o instanceof nfe ? (nfe) oqoVarMo27379o : null;
        if (nfeVar != null && (b9e0Var instanceof eab)) {
            eab eabVar = (eab) b9e0Var;
            if (!eabVar.mo32019p().isEmpty() && nfeVar.mo28473t() != 1) {
                return 3;
            }
            if (nfeVar.mo30969p0() == 2 && !wj50.m88271j(eabVar.mo28470e(), vxq.f245806a)) {
                if (eabVar.mo28473t() == 4) {
                    return 4;
                }
                return 3;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: A */
    public final void m54669A(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            sb.append(m54673E(((wr70) it.next()).getType(), true));
            if (i == h6f.m46714K(list)) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX INFO: renamed from: B */
    public final void m54670B(StringBuilder sb, jd21 jd21Var) {
        pc0 pc0Var;
        m54720x(sb, jd21Var, null);
        if (qug1.m73946p(jd21Var)) {
            boolean z = jd21Var instanceof zgw;
            nxq nxqVar = this.f117173a;
            if (z && ((zgw) jd21Var).f282721d.f38124b) {
                pc0 pc0Var2 = nxqVar.f159552V;
                qr60 qr60Var = nxq.f159530Y[47];
                if (((Boolean) pc0Var2.f61172a).booleanValue()) {
                    ehw ehwVar = ehw.f59682a;
                    if (z) {
                        boolean z2 = ((zgw) jd21Var).f282721d.f38124b;
                    }
                    sb.append(m54671C(((bhw) jd21Var.mo36063C0()).f27249b[0]));
                } else {
                    if (z) {
                        pc0Var = nxqVar.f159554X;
                        qr60 qr60Var2 = nxq.f159530Y[49];
                        if (((Boolean) pc0Var.f61172a).booleanValue()) {
                            sb.append(jd21Var.mo36063C0().toString());
                        } else {
                            sb.append(((zgw) jd21Var).f282725h);
                        }
                    } else {
                        sb.append(jd21Var.mo36063C0().toString());
                    }
                    sb.append(m54689V(jd21Var.mo36061A0()));
                }
            } else {
                if (z) {
                    pc0Var = nxqVar.f159554X;
                    qr60 qr60Var3 = nxq.f159530Y[49];
                    if (((Boolean) pc0Var.f61172a).booleanValue()) {
                        sb.append(((zgw) jd21Var).f282725h);
                    } else {
                        sb.append(jd21Var.mo36063C0().toString());
                    }
                } else {
                    sb.append(jd21Var.mo36063C0().toString());
                }
                sb.append(m54689V(jd21Var.mo36061A0()));
            }
        } else {
            jn91 jn91VarMo36063C0 = jd21Var.mo36063C0();
            qge qgeVarMo25169G = jd21Var.mo36063C0().mo25169G();
            r3n0 r3n0VarM69232k = p711.m69232k(jd21Var, qgeVarMo25169G instanceof rge ? (rge) qgeVarMo25169G : null, 0);
            if (r3n0VarM69232k == null) {
                sb.append(m54690W(jn91VarMo36063C0));
                sb.append(m54689V(jd21Var.mo36061A0()));
            } else {
                m54686R(sb, r3n0VarM69232k);
            }
        }
        if (jd21Var.mo36064D0()) {
            sb.append("?");
        }
        if (jd21Var instanceof pkq) {
            sb.append(" & Any");
        }
    }

    /* JADX INFO: renamed from: C */
    public final String m54671C(String str) {
        int iOrdinal = m54715r().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return s571.m77251j("<font color=red><b>", str, "</b></font>");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: D */
    public final String m54672D(String str, String str2, ib70 ib70Var) {
        if (gga.m44685x(str, str2)) {
            return bm51.m29803n0(str2, "(", false) ? s571.m77251j("(", str, ")!") : str.concat("!");
        }
        int i = 1;
        String strM44681t = gga.m44681t(str, str2, new hxq(this, ib70Var, 0), new hxq(this, ib70Var, i), new k6i(i, this, jxq.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 0, 28));
        if (strM44681t != null) {
            return strM44681t;
        }
        return "(" + str + ".." + str2 + ')';
    }

    /* JADX INFO: renamed from: E */
    public final String m54673E(gd70 gd70Var, boolean z) throws IOException {
        String strM54688U = m54688U(gd70Var);
        return ((!m54666f0(gd70Var) || so91.m78634e(gd70Var)) && !(gd70Var instanceof pkq) && (!z || gd70Var.getAnnotations().isEmpty())) ? strM54688U : dq60.m36608h(')', "(", strM54688U);
    }

    /* JADX INFO: renamed from: F */
    public final void m54674F(f4b1 f4b1Var, StringBuilder sb) {
        i5j i5jVarMo40727i0;
        String strM54722z;
        pc0 pc0Var = this.f117173a.f159575u;
        qr60 qr60Var = nxq.f159530Y[19];
        if (!((Boolean) pc0Var.f61172a).booleanValue() || (i5jVarMo40727i0 = f4b1Var.mo40727i0()) == null || (strM54722z = m54722z(i5jVarMo40727i0)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(m54712o(strM54722z));
    }

    /* JADX INFO: renamed from: G */
    public final String m54675G(String str) {
        int iOrdinal = m54715r().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            pc0 pc0Var = this.f117173a.f159553W;
            qr60 qr60Var = nxq.f159530Y[48];
            if (!((Boolean) pc0Var.f61172a).booleanValue()) {
                return s571.m77251j("<b>", str, "</b>");
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: H */
    public final void m54676H(eab eabVar, StringBuilder sb) {
        String str;
        if (m54713p().contains(kxq.MEMBER_KIND) && m54717t() && eabVar.mo38278l0() != 1) {
            sb.append("/*");
            int iMo38278l0 = eabVar.mo38278l0();
            if (iMo38278l0 == 1) {
                str = "DECLARATION";
            } else if (iMo38278l0 == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iMo38278l0 == 3) {
                str = "DELEGATION";
            } else {
                if (iMo38278l0 != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(hxh.m49034u(str));
            sb.append("*/ ");
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m54677I(b9e0 b9e0Var, StringBuilder sb) {
        m54680L(sb, b9e0Var.mo28472s(), "external");
        boolean z = false;
        m54680L(sb, m54713p().contains(kxq.EXPECT) && b9e0Var.mo28471g0(), "expect");
        if (m54713p().contains(kxq.ACTUAL) && b9e0Var.mo28469X()) {
            z = true;
        }
        m54680L(sb, z, "actual");
    }

    /* JADX INFO: renamed from: J */
    public final void m54678J(StringBuilder sb, int i, int i2) {
        String str;
        pc0 pc0Var = this.f117173a.f159570p;
        qr60 qr60Var = nxq.f159530Y[14];
        if (((Boolean) pc0Var.f61172a).booleanValue() || i != i2) {
            boolean zContains = m54713p().contains(kxq.MODALITY);
            if (i == 1) {
                str = "FINAL";
            } else if (i == 2) {
                str = "SEALED";
            } else if (i == 3) {
                str = "OPEN";
            } else {
                if (i != 4) {
                    throw null;
                }
                str = "ABSTRACT";
            }
            m54680L(sb, zContains, hxh.m49034u(str));
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m54679K(eab eabVar, StringBuilder sb) {
        if (rxq.m76679q(eabVar) && eabVar.mo28473t() == 1) {
            return;
        }
        pc0 pc0Var = this.f117173a.f159532B;
        qr60 qr60Var = nxq.f159530Y[26];
        if (((x1m0) pc0Var.f61172a) == x1m0.f257232a && eabVar.mo28473t() == 3 && !eabVar.mo32019p().isEmpty()) {
            return;
        }
        m54678J(sb, eabVar.mo28473t(), m54668u(eabVar));
    }

    /* JADX INFO: renamed from: L */
    public final void m54680L(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(m54675G(str));
            sb.append(" ");
        }
    }

    /* JADX INFO: renamed from: M */
    public final String m54681M(qti0 qti0Var, boolean z) {
        String strM54712o = m54712o(gga.m44680s(qti0Var));
        pc0 pc0Var = this.f117173a.f159553W;
        qr60 qr60Var = nxq.f159530Y[48];
        return (((Boolean) pc0Var.f61172a).booleanValue() && m54715r() == zkw0.f283856b && z) ? s571.m77251j("<b>", strM54712o, "</b>") : strM54712o;
    }

    /* JADX INFO: renamed from: N */
    public final void m54682N(oqo oqoVar, StringBuilder sb, boolean z) {
        sb.append(m54681M(oqoVar.getName(), z));
    }

    /* JADX INFO: renamed from: O */
    public final void m54683O(StringBuilder sb, gd70 gd70Var) throws IOException {
        d6a1 d6a1VarMo35108F0 = gd70Var.mo35108F0();
        C2554x c2554x = d6a1VarMo35108F0 instanceof C2554x ? (C2554x) d6a1VarMo35108F0 : null;
        if (c2554x == null) {
            m54684P(sb, gd70Var);
            return;
        }
        jd21 jd21Var = c2554x.f256713c;
        jd21 jd21Var2 = c2554x.f256712b;
        nxq nxqVar = this.f117173a;
        pc0 pc0Var = nxqVar.f159548R;
        qr60[] qr60VarArr = nxq.f159530Y;
        qr60 qr60Var = qr60VarArr[42];
        boolean zBooleanValue = ((Boolean) pc0Var.f61172a).booleanValue();
        xkw0 xkw0Var = zkw0.f283856b;
        if (zBooleanValue) {
            m54684P(sb, jd21Var2);
            pc0 pc0Var2 = nxqVar.f159549S;
            qr60 qr60Var2 = qr60VarArr[43];
            if (((Boolean) pc0Var2.f61172a).booleanValue()) {
                if (m54715r() == xkw0Var) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                m54684P(sb, jd21Var);
                sb.append(" */");
                if (m54715r() == xkw0Var) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        m54684P(sb, jd21Var);
        pc0 pc0Var3 = nxqVar.f159547Q;
        qr60 qr60Var3 = qr60VarArr[41];
        if (((Boolean) pc0Var3.f61172a).booleanValue()) {
            if (m54715r() == xkw0Var) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            m54684P(sb, jd21Var2);
            sb.append(" */");
            if (m54715r() == xkw0Var) {
                sb.append("</i></font>");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b3  */
    /* JADX INFO: renamed from: P */
    public final void m54684P(StringBuilder sb, gd70 gd70Var) throws IOException {
        wi00 wi00VarM29428O;
        String strM54712o;
        wi00 wi00VarM29428O2;
        boolean z;
        nxq nxqVar = this.f117173a;
        if ((gd70Var instanceof hz70) && nxqVar.m65846n()) {
            yma0 yma0Var = ((hz70) gd70Var).f96807d;
            if (yma0Var.f263330c == zma0.f284204a || yma0Var.f263330c == zma0.f284205b) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        d6a1 d6a1VarMo35108F0 = gd70Var.mo35108F0();
        if (d6a1VarMo35108F0 instanceof dhz) {
            sb.append(((dhz) d6a1VarMo35108F0).mo36067K0(this, this));
            return;
        }
        if (!(d6a1VarMo35108F0 instanceof jd21)) {
            throw new NoWhenBranchMatchedException();
        }
        jd21 jd21Var = (jd21) d6a1VarMo35108F0;
        if (jd21Var.equals(so91.f211152b) || jd21Var.mo36063C0() == so91.f211151a.f282719b) {
            sb.append("???");
            return;
        }
        jn91 jn91VarMo36063C0 = jd21Var.mo36063C0();
        int i = 0;
        if ((jn91VarMo36063C0 instanceof bhw) && ((bhw) jn91VarMo36063C0).f27248a == chw.UNINFERRED_TYPE_VARIABLE) {
            pc0 pc0Var = nxqVar.f159574t;
            qr60 qr60Var = nxq.f159530Y[18];
            if (((Boolean) pc0Var.f61172a).booleanValue()) {
                sb.append(m54671C(((bhw) jd21Var.mo36063C0()).f27249b[0]));
                return;
            } else {
                sb.append("???");
                return;
            }
        }
        if (qug1.m73946p(jd21Var)) {
            m54670B(sb, jd21Var);
            return;
        }
        if (!m54666f0(jd21Var)) {
            m54670B(sb, jd21Var);
            return;
        }
        int length = sb.length();
        ((jxq) this.f117174b.getValue()).m54720x(sb, jd21Var, null);
        boolean z2 = sb.length() != length;
        gd70 gd70VarM29431R = bjg1.m29431R(jd21Var);
        List listM29426M = bjg1.m29426M(jd21Var);
        qge qgeVarMo25169G = jd21Var.mo36063C0().mo25169G();
        if (qgeVarMo25169G != null && (qgeVarMo25169G instanceof nfe) && ib70.m50143K(qgeVarMo25169G)) {
            int i2 = txq.f224744a;
            wi00VarM29428O = bjg1.m29428O(rxq.m76668f(qgeVarMo25169G));
        } else {
            wi00VarM29428O = null;
        }
        boolean zM88271j = wj50.m88271j(wi00VarM29428O, vi00.f241575d);
        boolean zMo36064D0 = jd21Var.mo36064D0();
        boolean z3 = zMo36064D0 || (z2 && gd70VarM29431R != null);
        if (z3) {
            if (zM88271j) {
                sb.insert(length, '(');
            } else {
                if (z2) {
                    zn91.m96537Y(wl51.m88461K0(sb));
                    if (sb.charAt(wl51.m88453C0(sb) - 1) != ')') {
                        sb.insert(wl51.m88453C0(sb), "()");
                    }
                }
                sb.append("(");
            }
        }
        m54680L(sb, zM88271j, "suspend");
        if (!listM29426M.isEmpty()) {
            sb.append("context(");
            Iterator it = listM29426M.subList(0, h6f.m46714K(listM29426M)).iterator();
            while (it.hasNext()) {
                m54683O(sb, (gd70) it.next());
                sb.append(", ");
            }
            m54683O(sb, (gd70) g6f.m43687A0(listM29426M));
            sb.append(") ");
        }
        if (gd70VarM29431R != null) {
            if (!m54666f0(gd70VarM29431R) || gd70VarM29431R.mo36064D0()) {
                qge qgeVarMo25169G2 = gd70VarM29431R.mo36063C0().mo25169G();
                if (qgeVarMo25169G2 != null && (qgeVarMo25169G2 instanceof nfe) && ib70.m50143K(qgeVarMo25169G2)) {
                    int i3 = txq.f224744a;
                    wi00VarM29428O2 = bjg1.m29428O(rxq.m76668f(qgeVarMo25169G2));
                } else {
                    wi00VarM29428O2 = null;
                }
                if (wj50.m88271j(wi00VarM29428O2, vi00.f241575d) || !gd70VarM29431R.getAnnotations().isEmpty() || (gd70VarM29431R instanceof pkq)) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                sb.append("(");
            }
            m54683O(sb, gd70VarM29431R);
            if (z) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!bjg1.m29435V(jd21Var) || jd21Var.getAnnotations().mo55148M(qm41.f190115p) == null || jd21Var.mo36061A0().size() > 1) {
            int i4 = 0;
            for (ho91 ho91Var : bjg1.m29432S(jd21Var)) {
                int i5 = i4 + 1;
                if (i4 > 0) {
                    sb.append(", ");
                }
                pc0 pc0Var2 = nxqVar.f159551U;
                qr60 qr60Var2 = nxq.f159530Y[45];
                qti0 qti0VarM29424K = ((Boolean) pc0Var2.f61172a).booleanValue() ? bjg1.m29424K(ho91Var.mo48023b()) : null;
                if (qti0VarM29424K != null) {
                    sb.append(m54681M(qti0VarM29424K, false));
                    sb.append(": ");
                }
                StringBuilder sb2 = new StringBuilder();
                g6f.m43752x0(Collections.singletonList(ho91Var), sb2, ", ", null, null, new ixq(this, i), 60);
                sb.append(sb2.toString());
                i4 = i5;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = m54715r().ordinal();
        if (iOrdinal == 0) {
            strM54712o = m54712o("->");
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            strM54712o = "&rarr;";
        }
        sb.append(strM54712o);
        sb.append(" ");
        bjg1.m29435V(jd21Var);
        m54683O(sb, ((ho91) g6f.m43687A0(jd21Var.mo36061A0())).mo48023b());
        if (z3) {
            sb.append(")");
        }
        if (zMo36064D0) {
            sb.append("?");
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m54685Q(eab eabVar, StringBuilder sb) {
        if (m54713p().contains(kxq.OVERRIDE) && !eabVar.mo32019p().isEmpty()) {
            pc0 pc0Var = this.f117173a.f159532B;
            qr60 qr60Var = nxq.f159530Y[26];
            if (((x1m0) pc0Var.f61172a) != x1m0.f257233b) {
                m54680L(sb, true, "override");
                if (m54717t()) {
                    sb.append("/*");
                    sb.append(eabVar.mo32019p().size());
                    sb.append("*/ ");
                }
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m54686R(StringBuilder sb, r3n0 r3n0Var) {
        r3n0 r3n0Var2 = (r3n0) r3n0Var.f195527d;
        rge rgeVar = (rge) r3n0Var.f195525b;
        if (r3n0Var2 != null) {
            m54686R(sb, r3n0Var2);
            sb.append('.');
            sb.append(m54681M(rgeVar.getName(), false));
        } else {
            sb.append(m54690W(rgeVar.mo27378k()));
        }
        sb.append(m54689V((List) r3n0Var.f195526c));
    }

    /* JADX INFO: renamed from: S */
    public final void m54687S(eab eabVar, StringBuilder sb) {
        wr70 wr70VarMo32017Q;
        pc0 pc0Var = this.f117173a.f159536F;
        qr60 qr60Var = nxq.f159530Y[30];
        if (((Boolean) pc0Var.f61172a).booleanValue() && (wr70VarMo32017Q = eabVar.mo32017Q()) != null) {
            sb.append(" on ");
            sb.append(m54688U(wr70VarMo32017Q.getType()));
        }
    }

    /* JADX INFO: renamed from: U */
    public final String m54688U(gd70 gd70Var) throws IOException {
        StringBuilder sb = new StringBuilder();
        pc0 pc0Var = this.f117173a.f159579y;
        qr60 qr60Var = nxq.f159530Y[23];
        m54683O(sb, (gd70) ((gh00) pc0Var.f61172a).invoke(gd70Var));
        return sb.toString();
    }

    /* JADX INFO: renamed from: V */
    public final String m54689V(List list) throws IOException {
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m54712o("<"));
        g6f.m43752x0(list, sb, ", ", null, null, new ixq(this, 0), 60);
        sb.append(m54712o(">"));
        return sb.toString();
    }

    /* JADX INFO: renamed from: W */
    public final String m54690W(jn91 jn91Var) {
        qge qgeVarMo25169G = jn91Var.mo25169G();
        if ((qgeVarMo25169G instanceof bo91) || (qgeVarMo25169G instanceof nfe) || (qgeVarMo25169G instanceof cn91)) {
            if (ehw.m39009e(qgeVarMo25169G)) {
                return qgeVarMo25169G.mo27378k().toString();
            }
            pc0 pc0Var = this.f117173a.f159556b;
            qr60 qr60Var = nxq.f159530Y[0];
            return ((tge) pc0Var.f61172a).mo78056a(qgeVarMo25169G, this);
        }
        if (qgeVarMo25169G == null) {
            return jn91Var instanceof jj50 ? ((jj50) jn91Var).m53525b(a53.f12401b1) : jn91Var.toString();
        }
        throw new IllegalStateException(("Unexpected classifier: " + qgeVarMo25169G.getClass()).toString());
    }

    /* JADX INFO: renamed from: X */
    public final void m54691X(bo91 bo91Var, StringBuilder sb, boolean z) {
        String str;
        if (z) {
            sb.append(m54712o("<"));
        }
        if (m54717t()) {
            sb.append("/*");
            sb.append(bo91Var.getIndex());
            sb.append("*/ ");
        }
        m54680L(sb, bo91Var.mo27373A(), "reified");
        int iMo27374C = bo91Var.mo27374C();
        if (iMo27374C == 1) {
            str = "";
        } else if (iMo27374C == 2) {
            str = "in";
        } else {
            if (iMo27374C != 3) {
                throw null;
            }
            str = "out";
        }
        boolean z2 = true;
        m54680L(sb, str.length() > 0, str);
        m54720x(sb, bo91Var, null);
        m54682N(bo91Var, sb, z);
        int size = bo91Var.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            gd70 gd70Var = (gd70) bo91Var.getUpperBounds().iterator().next();
            if (gd70Var == null) {
                ib70.m50144a(141);
                throw null;
            }
            if (!ib70.m50148y(gd70Var) || !gd70Var.mo36064D0()) {
                sb.append(" : ");
                sb.append(m54688U(gd70Var));
            }
        } else if (z) {
            for (gd70 gd70Var2 : bo91Var.getUpperBounds()) {
                if (gd70Var2 == null) {
                    ib70.m50144a(141);
                    throw null;
                }
                if (!ib70.m50148y(gd70Var2) || !gd70Var2.mo36064D0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(m54688U(gd70Var2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(m54712o(">"));
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m54692Y(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m54691X((bo91) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m54693Z(StringBuilder sb, List list, boolean z) {
        pc0 pc0Var = this.f117173a.f159577w;
        qr60 qr60Var = nxq.f159530Y[21];
        if (((Boolean) pc0Var.f61172a).booleanValue() || list.isEmpty()) {
            return;
        }
        sb.append(m54712o("<"));
        m54692Y(sb, list);
        sb.append(m54712o(">"));
        if (z) {
            sb.append(" ");
        }
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: a */
    public final void mo54694a() {
        this.f117173a.mo54694a();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m54695a0(f4b1 f4b1Var, StringBuilder sb, boolean z) {
        if (z || !(f4b1Var instanceof s3b1)) {
            sb.append(m54675G(f4b1Var.mo40725P() ? "var" : "val"));
            sb.append(" ");
        }
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: b */
    public final void mo54696b() {
        this.f117173a.mo54696b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX INFO: renamed from: b0 */
    public final void m54697b0(s3b1 s3b1Var, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(m54675G("value-parameter"));
            sb.append(" ");
        }
        if (m54717t()) {
            sb.append("/*");
            sb.append(s3b1Var.f205256g);
            sb.append("*/ ");
        }
        m54720x(sb, s3b1Var, null);
        m54680L(sb, s3b1Var.f205258i, "crossinline");
        m54680L(sb, s3b1Var.f205259t, "noinline");
        nxq nxqVar = this.f117173a;
        pc0 pc0Var = nxqVar.f159572r;
        qr60[] qr60VarArr = nxq.f159530Y;
        qr60 qr60Var = qr60VarArr[16];
        boolean z4 = false;
        if (((Boolean) pc0Var.f61172a).booleanValue()) {
            cab cabVarM77124J1 = s3b1Var.m77124J1();
            jfe jfeVar = cabVarM77124J1 instanceof jfe ? (jfe) cabVarM77124J1 : null;
            if (jfeVar == null || !jfeVar.f111881c1) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            pc0 pc0Var2 = nxqVar.f159573s;
            qr60 qr60Var2 = qr60VarArr[17];
            m54680L(sb, ((Boolean) pc0Var2.f61172a).booleanValue(), "actual");
        }
        gd70 type = s3b1Var.getType();
        gd70 gd70Var = s3b1Var.f205254X;
        gd70 gd70Var2 = gd70Var == null ? type : gd70Var;
        m54680L(sb, gd70Var != null, "vararg");
        if (z3 || (z2 && !m54714q())) {
            m54695a0(s3b1Var, sb, z3);
        }
        if (z) {
            m54682N(s3b1Var, sb, z2);
            sb.append(": ");
        }
        sb.append(m54688U(gd70Var2));
        m54674F(s3b1Var, sb);
        if (m54717t() && gd70Var != null) {
            sb.append(" /*");
            sb.append(m54688U(type));
            sb.append("*/");
        }
        pc0 pc0Var3 = nxqVar.f159580z;
        qr60 qr60Var3 = qr60VarArr[24];
        if (((gh00) pc0Var3.f61172a) != null) {
            if (nxqVar.m65846n() ? s3b1Var.m77123I1() : txq.m81928a(s3b1Var)) {
                z4 = true;
            }
        }
        if (z4) {
            StringBuilder sb2 = new StringBuilder(" = ");
            pc0 pc0Var4 = nxqVar.f159580z;
            qr60 qr60Var4 = qr60VarArr[24];
            gh00 gh00Var = (gh00) pc0Var4.f61172a;
            wj50.m88279p(gh00Var);
            sb2.append((String) gh00Var.invoke(s3b1Var));
            sb.append(sb2.toString());
        }
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: c */
    public final void mo54698c(tge tgeVar) {
        this.f117173a.mo54698c(tgeVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX INFO: renamed from: c0 */
    public final void m54699c0(StringBuilder sb, List list, boolean z) {
        boolean z2;
        pc0 pc0Var = this.f117173a.f159535E;
        qr60 qr60Var = nxq.f159530Y[29];
        int iOrdinal = ((ptm0) pc0Var.f61172a).ordinal();
        if (iOrdinal == 0) {
            z2 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z) {
                z2 = true;
            }
            z2 = false;
        }
        int size = list.size();
        m54716s().getClass();
        sb.append("(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            s3b1 s3b1Var = (s3b1) it.next();
            m54716s().getClass();
            m54697b0(s3b1Var, z2, sb, false);
            m54716s().getClass();
            if (i != size - 1) {
                sb.append(", ");
            }
            i = i2;
        }
        m54716s().getClass();
        sb.append(")");
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: d */
    public final void mo54700d() {
        this.f117173a.mo54700d();
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m54701d0(uxq uxqVar, StringBuilder sb) {
        if (!m54713p().contains(kxq.VISIBILITY)) {
            return false;
        }
        nxq nxqVar = this.f117173a;
        pc0 pc0Var = nxqVar.f159568n;
        qr60[] qr60VarArr = nxq.f159530Y;
        qr60 qr60Var = qr60VarArr[12];
        if (((Boolean) pc0Var.f61172a).booleanValue()) {
            uxqVar = vxq.m86676g(uxqVar.f235026a.mo43574k());
        }
        pc0 pc0Var2 = nxqVar.f159569o;
        qr60 qr60Var2 = qr60VarArr[13];
        if (!((Boolean) pc0Var2.f61172a).booleanValue() && wj50.m88271j(uxqVar, vxq.f245816k)) {
            return false;
        }
        sb.append(m54675G(uxqVar.f235026a.mo43567d()));
        sb.append(" ");
        return true;
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: e */
    public final void mo54702e() {
        this.f117173a.mo54702e();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m54703e0(StringBuilder sb, List list) throws IOException {
        pc0 pc0Var = this.f117173a.f159577w;
        qr60 qr60Var = nxq.f159530Y[21];
        if (((Boolean) pc0Var.f61172a).booleanValue()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bo91 bo91Var = (bo91) it.next();
            for (gd70 gd70Var : g6f.m43729k0(bo91Var.getUpperBounds(), 1)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m54681M(bo91Var.getName(), false));
                sb2.append(" : ");
                wj50.m88279p(gd70Var);
                sb2.append(m54688U(gd70Var));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(m54675G("where"));
        sb.append(" ");
        g6f.m43752x0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: f */
    public final Set mo54704f() {
        return this.f117173a.mo54704f();
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: g */
    public final void mo54705g() {
        this.f117173a.mo54705g();
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: h */
    public final void mo54706h() {
        this.f117173a.mo54706h();
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: i */
    public final void mo54707i(ptm0 ptm0Var) {
        this.f117173a.mo54707i(ptm0Var);
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: j */
    public final void mo54708j(Set set) {
        this.f117173a.mo54708j(set);
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: k */
    public final void mo54709k(LinkedHashSet linkedHashSet) {
        this.f117173a.mo54709k(linkedHashSet);
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: l */
    public final void mo54710l() {
        this.f117173a.mo54710l();
    }

    @Override // p204p.lxq
    /* JADX INFO: renamed from: m */
    public final void mo54711m() {
        this.f117173a.mo54711m();
    }

    /* JADX INFO: renamed from: o */
    public final String m54712o(String str) {
        return m54715r().mo91369a(str);
    }

    /* JADX INFO: renamed from: p */
    public final Set m54713p() {
        pc0 pc0Var = this.f117173a.f159559e;
        qr60 qr60Var = nxq.f159530Y[3];
        return (Set) pc0Var.f61172a;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m54714q() {
        pc0 pc0Var = this.f117173a.f159560f;
        qr60 qr60Var = nxq.f159530Y[4];
        return ((Boolean) pc0Var.f61172a).booleanValue();
    }

    /* JADX INFO: renamed from: r */
    public final zkw0 m54715r() {
        pc0 pc0Var = this.f117173a.f159534D;
        qr60 qr60Var = nxq.f159530Y[28];
        return (zkw0) pc0Var.f61172a;
    }

    /* JADX INFO: renamed from: s */
    public final gxq m54716s() {
        pc0 pc0Var = this.f117173a.f159533C;
        qr60 qr60Var = nxq.f159530Y[27];
        return (gxq) pc0Var.f61172a;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m54717t() {
        pc0 pc0Var = this.f117173a.f159564j;
        qr60 qr60Var = nxq.f159530Y[8];
        return ((Boolean) pc0Var.f61172a).booleanValue();
    }

    /* JADX INFO: renamed from: v */
    public final String m54718v(oqo oqoVar) {
        oqo oqoVarMo27379o;
        String str;
        StringBuilder sb = new StringBuilder();
        oqoVar.mo27381y(new b5p(this, 15), sb);
        nxq nxqVar = this.f117173a;
        pc0 pc0Var = nxqVar.f159557c;
        qr60[] qr60VarArr = nxq.f159530Y;
        qr60 qr60Var = qr60VarArr[1];
        if (((Boolean) pc0Var.f61172a).booleanValue() && !(oqoVar instanceof m3m0) && !(oqoVar instanceof v3m0) && (oqoVarMo27379o = oqoVar.mo27379o()) != null && !(oqoVarMo27379o instanceof mxh0)) {
            sb.append(" ");
            int iOrdinal = m54715r().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            z400 z400VarM76668f = rxq.m76668f(oqoVarMo27379o);
            sb.append(z400VarM76668f.m95303c() ? "root package" : m54712o(gga.m44682u(z400.m95300f(z400VarM76668f))));
            pc0 pc0Var2 = nxqVar.f159558d;
            qr60 qr60Var2 = qr60VarArr[2];
            if (((Boolean) pc0Var2.f61172a).booleanValue() && (oqoVarMo27379o instanceof m3m0) && (oqoVar instanceof qqo)) {
                ((qqo) oqoVar).getSource().getClass();
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: w */
    public final String m54719w(y15 y15Var, g25 g25Var) throws IOException {
        jfe jfeVarMo30956G;
        List listMo32015K;
        nxq nxqVar = this.f117173a;
        pc0 pc0Var = nxqVar.f159544N;
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (g25Var != null) {
            sb.append(g25Var.f75845a + ':');
        }
        gd70 type = y15Var.getType();
        sb.append(m54688U(type));
        qr60[] qr60VarArr = nxq.f159530Y;
        qr60 qr60Var = qr60VarArr[38];
        if (((u15) pc0Var.f61172a).f225683a) {
            Map mapMo51607a = y15Var.mo51607a();
            pc0 pc0Var2 = nxqVar.f159539I;
            qr60 qr60Var2 = qr60VarArr[33];
            List list = null;
            nfe nfeVarM81931d = ((Boolean) pc0Var2.f61172a).booleanValue() ? txq.m81931d(y15Var) : null;
            if (nfeVarM81931d != null && (jfeVarMo30956G = nfeVarM81931d.mo30956G()) != null && (listMo32015K = jfeVarMo30956G.mo32015K()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo32015K) {
                    if (((s3b1) obj).m77123I1()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((s3b1) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = lau.f131415a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapMo51607a.containsKey((qti0) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(i6f.m49804T(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((qti0) it2.next()).m73844b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapMo51607a.entrySet();
            ArrayList arrayList5 = new ArrayList(i6f.m49804T(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                qti0 qti0Var = (qti0) entry.getKey();
                i5j i5jVar = (i5j) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(qti0Var.m73844b());
                sb2.append(" = ");
                sb2.append(!list.contains(qti0Var) ? m54722z(i5jVar) : "...");
                arrayList5.add(sb2.toString());
            }
            List listM43710X0 = g6f.m43710X0(g6f.m43700N0(arrayList5, arrayList4));
            qr60 qr60Var3 = nxq.f159530Y[38];
            if (((u15) pc0Var.f61172a).f225684b || !listM43710X0.isEmpty()) {
                g6f.m43752x0(listM43710X0, sb, ", ", "(", ")", null, ContentType.LONG_FORM_ON_DEMAND);
            }
        }
        if (m54717t() && (qug1.m73946p(type) || (type.mo36063C0().mo25169G() instanceof spj0))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: x */
    public final void m54720x(StringBuilder sb, d15 d15Var, g25 g25Var) {
        Set setMo54704f;
        if (m54713p().contains(kxq.ANNOTATIONS)) {
            boolean z = d15Var instanceof gd70;
            nxq nxqVar = this.f117173a;
            if (z) {
                setMo54704f = nxqVar.mo54704f();
            } else {
                pc0 pc0Var = nxqVar.f159541K;
                qr60 qr60Var = nxq.f159530Y[35];
                setMo54704f = (Set) pc0Var.f61172a;
            }
            pc0 pc0Var2 = nxqVar.f159543M;
            qr60 qr60Var2 = nxq.f159530Y[37];
            gh00 gh00Var = (gh00) pc0Var2.f61172a;
            for (y15 y15Var : d15Var.getAnnotations()) {
                if (!g6f.m43725i0(setMo54704f, y15Var.mo51608b()) && !wj50.m88271j(y15Var.mo51608b(), qm41.f190117r) && (gh00Var == null || ((Boolean) gh00Var.invoke(y15Var)).booleanValue())) {
                    sb.append(m54719w(y15Var, g25Var));
                    pc0 pc0Var3 = nxqVar.f159540J;
                    qr60 qr60Var3 = nxq.f159530Y[34];
                    if (((Boolean) pc0Var3.f61172a).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m54721y(rge rgeVar, StringBuilder sb) {
        List listMo30970r = rgeVar.mo30970r();
        List listMo25171e = rgeVar.mo27378k().mo25171e();
        if (m54717t() && rgeVar.mo30968n() && listMo25171e.size() > listMo30970r.size()) {
            sb.append(" /*captured type parameters: ");
            m54692Y(sb, listMo25171e.subList(listMo30970r.size(), listMo25171e.size()));
            sb.append("*/");
        }
    }

    /* JADX INFO: renamed from: z */
    public final String m54722z(i5j i5jVar) {
        pc0 pc0Var = this.f117173a.f159576v;
        qr60 qr60Var = nxq.f159530Y[20];
        gh00 gh00Var = (gh00) pc0Var.f61172a;
        if (gh00Var != null) {
            return (String) gh00Var.invoke(i5jVar);
        }
        if (i5jVar instanceof ak5) {
            Iterable iterable = (Iterable) ((ak5) i5jVar).f98976a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strM54722z = m54722z((i5j) it.next());
                if (strM54722z != null) {
                    arrayList.add(strM54722z);
                }
            }
            return g6f.m43753y0(arrayList, ", ", "{", "}", null, 56);
        }
        if (i5jVar instanceof j25) {
            return wl51.m88469S0(m54719w((y15) ((j25) i5jVar).f98976a, null), "@");
        }
        if (!(i5jVar instanceof hq60)) {
            return i5jVar.toString();
        }
        gq60 gq60Var = (gq60) ((hq60) i5jVar).f98976a;
        if (gq60Var instanceof eq60) {
            return ((eq60) gq60Var).f61795a + "::class";
        }
        if (!(gq60Var instanceof fq60)) {
            throw new NoWhenBranchMatchedException();
        }
        yfe yfeVar = ((fq60) gq60Var).f72080a;
        String strM36608h = yfeVar.f272211a.m85354a().f269048a.f279080a;
        int i = yfeVar.f272212b;
        for (int i2 = 0; i2 < i; i2++) {
            strM36608h = dq60.m36608h('>', "kotlin.Array<", strM36608h);
        }
        return s571.m77250i(strM36608h, "::class");
    }
}
