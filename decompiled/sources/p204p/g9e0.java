package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class g9e0 {

    /* JADX INFO: renamed from: a */
    public final s2o f77754a;

    /* JADX INFO: renamed from: b */
    public final pgq0 f77755b;

    public g9e0(s2o s2oVar) {
        this.f77754a = s2oVar;
        n06 n06Var = (n06) s2oVar.f205039f;
        this.f77755b = new pgq0(21, (mxh0) n06Var.f148908c, (da80) n06Var.f148904Y);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC2440u5 m44016a(oqo oqoVar) {
        if (oqoVar instanceof m3m0) {
            y400 y400Var = ((n3m0) ((m3m0) oqoVar)).f150085f;
            s2o s2oVar = this.f77754a;
            return new c2t0(y400Var, (pui0) s2oVar.f205040g, (ayz) s2oVar.f205035b, (gyq) s2oVar.f205038e);
        }
        if (oqoVar instanceof fyq) {
            return ((fyq) oqoVar).f74804S0;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m44017b(List list, List list2, u110 u110Var, int i) {
        g9e0 g9e0Var = this;
        s2o s2oVar = g9e0Var.f77754a;
        cab cabVar = (cab) ((oqo) s2oVar.f205041h);
        AbstractC2440u5 abstractC2440u5M44016a = g9e0Var.m44016a(cabVar.mo27379o());
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                h6f.m46722S();
                throw null;
            }
            j1t0 j1t0Var = (j1t0) obj;
            r1t0 r1t0Var = (r1t0) g6f.m43747t0(i2, list2);
            wr70 wr70VarM42113D = fmg1.m42113D(cabVar, ((clq0) s2oVar.f205042i).m33315O(j1t0Var), null, (abstractC2440u5M44016a == null || !nfz.f153462c.mo51423d((r1t0Var == null || (r1t0Var.f194913c & 1) != 1) ? 0 : r1t0Var.f194914d).booleanValue()) ? e370.f55667h : new vnj0((y751) ((n06) s2oVar.f205039f).f148907b, new f9e0(g9e0Var, abstractC2440u5M44016a, u110Var, i, i2, r1t0Var, 1)), i2);
            if (wr70VarM42113D != null) {
                arrayList.add(wr70VarM42113D);
            }
            g9e0Var = this;
            i2 = i3;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public final l25 m44018c(u110 u110Var, int i, int i2) {
        return !nfz.f153462c.mo51423d(i).booleanValue() ? e370.f55667h : new vnj0((y751) ((n06) this.f77754a.f205039f).f148907b, new d9e0(this, u110Var, i2, 0));
    }

    /* JADX INFO: renamed from: d */
    public final l25 m44019d(y0t0 y0t0Var, boolean z) {
        return !nfz.f153462c.mo51423d(y0t0Var.f268080d).booleanValue() ? e370.f55667h : new vnj0((y751) ((n06) this.f77754a.f205039f).f148907b, new e9e0(this, z, y0t0Var));
    }

    /* JADX INFO: renamed from: e */
    public final yxq m44020e(c0t0 c0t0Var, boolean z) {
        uxq uxqVar;
        s2o s2oVar = this.f77754a;
        nfe nfeVar = (nfe) ((oqo) s2oVar.f205041h);
        yxq yxqVar = new yxq(nfeVar, null, m44018c(c0t0Var, c0t0Var.f32861d, 1), z, 1, c0t0Var, (pui0) s2oVar.f205040g, (ayz) s2oVar.f205035b, (ceb1) s2oVar.f205036c, (gyq) s2oVar.f205038e, null);
        List listM44023h = ((g9e0) s2oVar.m77086k(yxqVar, lau.f131415a, (pui0) s2oVar.f205040g, (ayz) s2oVar.f205035b, (ceb1) s2oVar.f205036c, (pf9) s2oVar.f205037d).f205043t).m44023h(c0t0Var.f32862e, c0t0Var, 1);
        x1t0 x1t0Var = (x1t0) nfz.f153463d.mo51423d(c0t0Var.f32861d);
        switch (x1t0Var == null ? -1 : j2t0.f108145b[x1t0Var.ordinal()]) {
            case 1:
                uxqVar = vxq.f245809d;
                break;
            case 2:
                uxqVar = vxq.f245806a;
                break;
            case 3:
                uxqVar = vxq.f245807b;
                break;
            case 4:
                uxqVar = vxq.f245808c;
                break;
            case 5:
                uxqVar = vxq.f245810e;
                break;
            case 6:
                uxqVar = vxq.f245811f;
                break;
            default:
                uxqVar = vxq.f245806a;
                break;
        }
        yxqVar.m53173W1(listM44023h, uxqVar);
        yxqVar.m70065R1(nfeVar.mo27380q());
        yxqVar.f177785Q0 = nfeVar.mo28471g0();
        yxqVar.f177789U0 = !nfz.f153474o.mo51423d(c0t0Var.f32861d).booleanValue();
        return yxqVar;
    }

    /* JADX INFO: renamed from: f */
    public final ryq m44021f(q0t0 q0t0Var) {
        int i;
        gd70 gd70VarM33315O;
        s2o s2oVar = this.f77754a;
        pui0 pui0Var = (pui0) s2oVar.f205040g;
        ayz ayzVar = (ayz) s2oVar.f205035b;
        int i2 = 1;
        if ((q0t0Var.f184091c & 1) == 1) {
            i = q0t0Var.f184092d;
        } else {
            int i3 = q0t0Var.f184093e;
            i = ((i3 >> 8) << 6) + (i3 & 63);
        }
        l25 l25VarM44018c = m44018c(q0t0Var, i, 1);
        int i4 = q0t0Var.f184091c;
        l25 wxqVar = ((i4 & 32) == 32 || (i4 & 64) == 64) ? new wxq((y751) ((n06) s2oVar.f205039f).f148907b, new d9e0(this, q0t0Var, i2, 1)) : e370.f55667h;
        int i5 = i;
        ryq ryqVar = new ryq((oqo) s2oVar.f205041h, null, l25VarM44018c, fcg1.m41317k(pui0Var, q0t0Var.f184094f), iig1.m50729p((r0t0) nfz.f153476q.mo51423d(i)), q0t0Var, (pui0) s2oVar.f205040g, (ayz) s2oVar.f205035b, txq.m81934g((oqo) s2oVar.f205041h).m92785a(fcg1.m41317k(pui0Var, q0t0Var.f184094f)).equals(kb61.f121101a) ? ceb1.f37074b : (ceb1) s2oVar.f205036c, (gyq) s2oVar.f205038e, null);
        s2o s2oVarM77086k = s2oVar.m77086k(ryqVar, q0t0Var.f184097i, (pui0) s2oVar.f205040g, (ayz) s2oVar.f205035b, (ceb1) s2oVar.f205036c, (pf9) s2oVar.f205037d);
        g9e0 g9e0Var = (g9e0) s2oVarM77086k.f205043t;
        clq0 clq0Var = (clq0) s2oVarM77086k.f205042i;
        j1t0 j1t0VarM78228y = sig1.m78228y(q0t0Var, ayzVar);
        wr70 wr70VarM42119J = (j1t0VarM78228y == null || (gd70VarM33315O = clq0Var.m33315O(j1t0VarM78228y)) == null) ? null : fmg1.m42119J(ryqVar, gd70VarM33315O, wxqVar);
        oqo oqoVar = (oqo) s2oVar.f205041h;
        nfe nfeVar = oqoVar instanceof nfe ? (nfe) oqoVar : null;
        ryqVar.mo64196V1(wr70VarM42119J, nfeVar != null ? nfeVar.mo30974z0() : null, g9e0Var.m44017b(sig1.m78219p(q0t0Var, ayzVar), q0t0Var.f184077M0, q0t0Var, 1), clq0Var.m33332m(), g9e0Var.m44023h(q0t0Var.f184078N0, q0t0Var, 1), clq0Var.m33315O(sig1.m78197B(q0t0Var, ayzVar)), crq0.m33744a((s0t0) nfz.f153464e.mo51423d(i5)), iig1.m50723j((x1t0) nfz.f153463d.mo51423d(i5)), nau.f152117a);
        ryqVar.f177780L0 = nfz.f153477r.mo51423d(i5).booleanValue();
        ryqVar.f177781M0 = nfz.f153478s.mo51423d(i5).booleanValue();
        ryqVar.f177782N0 = nfz.f153481v.mo51423d(i5).booleanValue();
        ryqVar.f177783O0 = nfz.f153479t.mo51423d(i5).booleanValue();
        ryqVar.f177784P0 = nfz.f153480u.mo51423d(i5).booleanValue();
        ryqVar.f177788T0 = nfz.f153482w.mo51423d(i5).booleanValue();
        ryqVar.f177785Q0 = nfz.f153483x.mo51423d(i5).booleanValue();
        ryqVar.f177789U0 = !nfz.f153484y.mo51423d(i5).booleanValue();
        ((sp5) ((n06) s2oVar.f205039f).f148905Z).getClass();
        return ryqVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x015e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [p.nfe] */
    /* JADX INFO: renamed from: g */
    public final qyq m44022g(y0t0 y0t0Var, boolean z) {
        int i;
        l25 l25VarM44018c;
        g9e0 g9e0Var;
        l25 wxqVar;
        gd70 gd70Var;
        wr70 wr70VarM42119J;
        mfz mfzVar;
        boolean z2;
        tys0 tys0VarM42114E;
        tys0 tys0Var;
        xma0 xma0Var;
        zys0 zys0VarM42115F;
        gd70 gd70VarM33315O;
        k25 k25Var = e370.f55667h;
        s2o s2oVar = this.f77754a;
        pui0 pui0Var = (pui0) s2oVar.f205040g;
        ayz ayzVar = (ayz) s2oVar.f205035b;
        if ((y0t0Var.f268079c & 1) == 1) {
            i = y0t0Var.f268080d;
        } else {
            int i2 = y0t0Var.f268081e;
            i = ((i2 >> 8) << 6) + (i2 & 63);
        }
        if (z) {
            List<wzs0> list = y0t0Var.f268065S0;
            ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
            for (wzs0 wzs0Var : list) {
                wj50.m88279p(wzs0Var);
                arrayList.add(this.f77755b.m69913l(wzs0Var, pui0Var));
            }
            l25VarM44018c = arrayList.isEmpty() ? k25Var : new n25(arrayList, 0);
        } else {
            l25VarM44018c = null;
        }
        oqo oqoVar = (oqo) s2oVar.f205041h;
        if (l25VarM44018c == null) {
            l25VarM44018c = m44018c(y0t0Var, i, 2);
        }
        mfz mfzVar2 = nfz.f153464e;
        int iM33744a = crq0.m33744a((s0t0) mfzVar2.mo51423d(i));
        mfz mfzVar3 = nfz.f153463d;
        int i3 = i;
        qyq qyqVar = new qyq(oqoVar, null, l25VarM44018c, iM33744a, iig1.m50723j((x1t0) mfzVar3.mo51423d(i)), nfz.f153441A.mo51423d(i).booleanValue(), fcg1.m41317k(pui0Var, y0t0Var.f268082f), iig1.m50729p((r0t0) nfz.f153476q.mo51423d(i)), nfz.f153445E.mo51423d(i).booleanValue(), nfz.f153444D.mo51423d(i).booleanValue(), nfz.f153447G.mo51423d(i).booleanValue(), nfz.f153448H.mo51423d(i).booleanValue(), nfz.f153449I.mo51423d(i).booleanValue(), y0t0Var, (pui0) s2oVar.f205040g, (ayz) s2oVar.f205035b, (ceb1) s2oVar.f205036c, (gyq) s2oVar.f205038e);
        s2o s2oVarM77086k = s2oVar.m77086k(qyqVar, y0t0Var.f268085i, (pui0) s2oVar.f205040g, (ayz) s2oVar.f205035b, (ceb1) s2oVar.f205036c, (pf9) s2oVar.f205037d);
        clq0 clq0Var = (clq0) s2oVarM77086k.f205042i;
        boolean zBooleanValue = nfz.f153442B.mo51423d(i3).booleanValue();
        int i4 = 3;
        if (zBooleanValue) {
            int i5 = y0t0Var.f268079c;
            if ((i5 & 32) == 32 || (i5 & 64) == 64) {
                g9e0Var = this;
                wxqVar = new wxq((y751) ((n06) s2oVar.f205039f).f148907b, new d9e0(g9e0Var, y0t0Var, i4, 1));
            } else {
                g9e0Var = this;
                wxqVar = k25Var;
            }
        } else {
            g9e0Var = this;
            wxqVar = k25Var;
        }
        gd70 gd70VarM33315O2 = clq0Var.m33315O(sig1.m78198C(y0t0Var, ayzVar));
        List listM33332m = clq0Var.m33332m();
        oqo oqoVar2 = (oqo) s2oVar.f205041h;
        nfe nfeVar = oqoVar2 instanceof nfe ? (nfe) oqoVar2 : null;
        wr70 wr70VarMo30974z0 = nfeVar != null ? nfeVar.mo30974z0() : null;
        j1t0 j1t0VarM78229z = sig1.m78229z(y0t0Var, ayzVar);
        if (j1t0VarM78229z == null || (gd70VarM33315O = clq0Var.m33315O(j1t0VarM78229z)) == null) {
            gd70Var = r11;
            wr70VarM42119J = null;
        } else {
            wr70VarM42119J = fmg1.m42119J(qyqVar, gd70VarM33315O, wxqVar);
            gd70Var = gd70VarM33315O2;
        }
        qyqVar.m71660O1(gd70Var, listM33332m, wr70VarMo30974z0, wr70VarM42119J, ((g9e0) s2oVarM77086k.f205043t).m44017b(sig1.m78220q(y0t0Var, ayzVar), y0t0Var.f268059M0, y0t0Var, 3));
        int iM64368b = nfz.m64368b(nfz.f153462c.mo51423d(i3).booleanValue(), (x1t0) mfzVar3.mo51423d(i3), (s0t0) mfzVar2.mo51423d(i3));
        ri5 ri5Var = du31.f52959o0;
        if (zBooleanValue) {
            int i6 = (y0t0Var.f268079c & 256) == 256 ? y0t0Var.f268061O0 : iM64368b;
            boolean zBooleanValue2 = nfz.f153454N.mo51423d(i6).booleanValue();
            boolean zBooleanValue3 = nfz.f153455O.mo51423d(i6).booleanValue();
            boolean zBooleanValue4 = nfz.f153456P.mo51423d(i6).booleanValue();
            l25 l25VarM44018c2 = g9e0Var.m44018c(y0t0Var, i6, 3);
            if (zBooleanValue2) {
                z2 = true;
                mfzVar = mfzVar2;
                tys0VarM42114E = new tys0(qyqVar, l25VarM44018c2, crq0.m33744a((s0t0) mfzVar2.mo51423d(i6)), iig1.m50723j((x1t0) mfzVar3.mo51423d(i6)), !zBooleanValue2, zBooleanValue3, zBooleanValue4, qyqVar.mo38278l0(), null, ri5Var);
            } else {
                mfzVar = mfzVar2;
                z2 = true;
                tys0VarM42114E = fmg1.m42114E(qyqVar, l25VarM44018c2);
            }
            tys0VarM42114E.m82003K1(qyqVar.mo29933i());
        } else {
            iM64368b = iM64368b;
            mfzVar = mfzVar2;
            g9e0Var = g9e0Var;
            z2 = true;
            tys0VarM42114E = null;
        }
        if (nfz.f153443C.mo51423d(i3).booleanValue()) {
            int i7 = (y0t0Var.f268079c & 512) == 512 ? y0t0Var.f268062P0 : iM64368b;
            boolean zBooleanValue5 = nfz.f153454N.mo51423d(i7).booleanValue();
            boolean zBooleanValue6 = nfz.f153455O.mo51423d(i7).booleanValue();
            boolean zBooleanValue7 = nfz.f153456P.mo51423d(i7).booleanValue();
            l25 l25VarM44018c3 = g9e0Var.m44018c(y0t0Var, i7, 4);
            if (zBooleanValue5) {
                tys0Var = tys0VarM42114E;
                zys0 zys0Var = new zys0(qyqVar, l25VarM44018c3, crq0.m33744a((s0t0) mfzVar.mo51423d(i7)), iig1.m50723j((x1t0) mfzVar3.mo51423d(i7)), !zBooleanValue5, zBooleanValue6, zBooleanValue7, qyqVar.mo38278l0(), null, ri5Var);
                s3b1 s3b1Var = (s3b1) g6f.m43706T0(((g9e0) s2oVarM77086k.m77086k(zys0Var, lau.f131415a, (pui0) s2oVarM77086k.f205040g, (ayz) s2oVarM77086k.f205035b, (ceb1) s2oVarM77086k.f205036c, (pf9) s2oVarM77086k.f205037d).f205043t).m44023h(Collections.singletonList(y0t0Var.f268060N0), y0t0Var, 4));
                if (s3b1Var == null) {
                    zys0.m97244A0(6);
                    throw null;
                }
                zys0Var.f287664L0 = s3b1Var;
                zys0VarM42115F = zys0Var;
                xma0Var = null;
            } else {
                tys0Var = tys0VarM42114E;
                xma0Var = null;
                zys0VarM42115F = fmg1.m42115F(qyqVar, l25VarM44018c3);
            }
        } else {
            tys0Var = tys0VarM42114E;
            xma0Var = null;
            zys0VarM42115F = null;
        }
        if (nfz.f153446F.mo51423d(i3).booleanValue()) {
            qyqVar.m71658M1(xma0Var, new c9e0(g9e0Var, y0t0Var, qyqVar, 0));
        }
        oqo oqoVar3 = (oqo) s2oVar.f205041h;
        ?? r0 = oqoVar3 instanceof nfe ? (nfe) oqoVar3 : xma0Var;
        if ((r0 != 0 ? r0.mo30969p0() : 0) == 5) {
            qyqVar.m71658M1(xma0Var, new c9e0(g9e0Var, y0t0Var, qyqVar, 1));
        }
        qyqVar.m71657L1(tys0Var, zys0VarM42115F, new huy(g9e0Var.m44019d(y0t0Var, false)), new huy(g9e0Var.m44019d(y0t0Var, z2)));
        return qyqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [p.gd70] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX INFO: renamed from: h */
    public final List m44023h(List list, u110 u110Var, int i) {
        int i2;
        j1t0 j1t0Var;
        l25 vnj0Var;
        g9e0 g9e0Var = this;
        s2o s2oVar = g9e0Var.f77754a;
        ayz ayzVar = (ayz) s2oVar.f205035b;
        clq0 clq0Var = (clq0) s2oVar.f205042i;
        cab cabVar = (cab) ((oqo) s2oVar.f205041h);
        AbstractC2440u5 abstractC2440u5M44016a = g9e0Var.m44016a(cabVar.mo27379o());
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        int i3 = 0;
        for (Object obj : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                h6f.m46722S();
                throw null;
            }
            r1t0 r1t0Var = (r1t0) obj;
            int i5 = (r1t0Var.f194913c & 1) == 1 ? r1t0Var.f194914d : 0;
            if (abstractC2440u5M44016a == null || !nfz.f153462c.mo51423d(i5).booleanValue()) {
                i2 = i3;
                j1t0Var = null;
                vnj0Var = e370.f55667h;
            } else {
                i2 = i3;
                j1t0Var = null;
                vnj0Var = new vnj0((y751) ((n06) s2oVar.f205039f).f148907b, new f9e0(g9e0Var, abstractC2440u5M44016a, u110Var, i, i2, r1t0Var, 0));
            }
            qti0 qti0VarM41317k = fcg1.m41317k((pui0) s2oVar.f205040g, r1t0Var.f194915e);
            gd70 gd70VarM33315O = clq0Var.m33315O(sig1.m78202G(r1t0Var, ayzVar));
            boolean zBooleanValue = nfz.f153451K.mo51423d(i5).booleanValue();
            boolean zBooleanValue2 = nfz.f153452L.mo51423d(i5).booleanValue();
            boolean zBooleanValue3 = nfz.f153453M.mo51423d(i5).booleanValue();
            int i6 = r1t0Var.f194913c;
            j1t0 j1t0VarM27558a = (i6 & 16) == 16 ? r1t0Var.f194918h : (i6 & 32) == 32 ? ayzVar.m27558a(r1t0Var.f194919i) : j1t0Var;
            ?? M33315O = j1t0VarM27558a != null ? clq0Var.m33315O(j1t0VarM27558a) : j1t0Var;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new s3b1(cabVar, null, i2, vnj0Var, qti0VarM41317k, gd70VarM33315O, zBooleanValue, zBooleanValue2, zBooleanValue3, M33315O, du31.f52959o0));
            arrayList = arrayList2;
            i3 = i4;
            g9e0Var = this;
        }
        return g6f.m43728j1(arrayList);
    }
}
