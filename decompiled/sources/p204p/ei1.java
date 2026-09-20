package p204p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes6.dex */
public final class ei1 implements th00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59756a;

    /* JADX INFO: renamed from: b */
    public final Object f59757b;

    /* JADX INFO: renamed from: c */
    public final Object f59758c;

    public /* synthetic */ ei1(int i, Object obj, Object obj2) {
        this.f59756a = i;
        this.f59757b = obj;
        this.f59758c = obj2;
    }

    /* JADX INFO: renamed from: j */
    public static y3y m39050j(s310 s310Var) {
        String str = s310Var.f205154a;
        int i = s310Var.f205156c;
        int i2 = s310Var.f205157d;
        List<y1z> list = s310Var.f205155b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (y1z y1zVar : list) {
            arrayList.add(new ixy(y1zVar.f268424b, y1zVar.f268423a));
        }
        return new y3y(i, i2, str, arrayList);
    }

    /* JADX INFO: renamed from: k */
    public static e4y m39051k(s310 s310Var) {
        String str = s310Var.f205154a;
        int i = s310Var.f205156c;
        int i2 = s310Var.f205157d;
        List<y1z> list = s310Var.f205155b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (y1z y1zVar : list) {
            arrayList.add(new ixy(y1zVar.f268424b, y1zVar.f268423a));
        }
        return new e4y(i, i2, str, arrayList);
    }

    /* JADX INFO: renamed from: l */
    public static rx31 m39052l(s310 s310Var) {
        String str = s310Var.f205154a;
        int i = s310Var.f205156c;
        int i2 = s310Var.f205157d;
        List<y1z> list = s310Var.f205155b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (y1z y1zVar : list) {
            arrayList.add(new ixy(y1zVar.f268424b, y1zVar.f268423a));
        }
        return new rx31(i, i2, str, arrayList);
    }

    /* JADX INFO: renamed from: n */
    public static ay31 m39053n(zx31 zx31Var) {
        String str = zx31Var.f287193a;
        int i = zx31Var.f287198f;
        int i2 = zx31Var.f287199g;
        List<y1z> list = zx31Var.f287197e;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        for (y1z y1zVar : list) {
            arrayList.add(new ixy(y1zVar.f268424b, y1zVar.f268423a));
        }
        return new ay31(str, arrayList, zx31Var.f287194b, zx31Var.f287195c, zx31Var.f287196d, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0233, code lost:
    
        if (r1 == r7) goto L77;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m39054a(lc10 lc10Var, fbk fbkVar) {
        b4y0 b4y0Var;
        jp20 ip20Var;
        mqa1 lqa1Var;
        mqa1 lqa1Var2;
        jp20 ip20Var2;
        lc10 lc10Var2 = lc10Var;
        if (fbkVar instanceof b4y0) {
            b4y0Var = (b4y0) fbkVar;
            int i = b4y0Var.f23434d;
            if ((i & Integer.MIN_VALUE) != 0) {
                b4y0Var.f23434d = i - Integer.MIN_VALUE;
            } else {
                b4y0Var = new b4y0(this, fbkVar);
            }
        } else {
            b4y0Var = new b4y0(this, fbkVar);
        }
        Object objM39058i = b4y0Var.f23432b;
        int i2 = b4y0Var.f23434d;
        Object obj = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM39058i);
            b4y0Var.f23431a = lc10Var2;
            b4y0Var.f23434d = 1;
            objM39058i = m39058i(lc10Var2, b4y0Var);
            if (objM39058i != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            lc10Var2 = b4y0Var.f23431a;
            bga.m29073P(objM39058i);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM39058i);
        }
        return z3y0.f279059a;
        a4y0 a4y0Var = (a4y0) objM39058i;
        if (a4y0Var instanceof y3y0) {
            return new y3y0(((y3y0) a4y0Var).f269006a);
        }
        if (!(a4y0Var instanceof z3y0)) {
            throw new NoWhenBranchMatchedException();
        }
        b4y0Var.f23431a = null;
        b4y0Var.f23434d = 2;
        rx31 rx31VarM39052l = m39052l(lc10Var2.f131796c.f236751a);
        v310 v310Var = lc10Var2.f131796c;
        s310 s310Var = v310Var.f236752b;
        s310 s310Var2 = v310Var.f236753c;
        e4y e4yVarM39051k = m39051k(s310Var);
        y3y y3yVarM39050j = m39050j(s310Var2);
        List list = lc10Var2.f131795b;
        ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
        Iterator it = list.iterator();
        while (true) {
            String str = "BLUETOOTH";
            if (it.hasNext()) {
                w5a1 w5a1Var = (w5a1) it.next();
                s310 s310Var3 = s310Var2;
                String str2 = w5a1Var.f248047b;
                if (wj50.m88271j(str2, "BLUETOOTH")) {
                    ip20Var2 = new hp20(w5a1Var.f248046a, "GENERIC");
                } else {
                    if (!wj50.m88271j(str2, "WIRED")) {
                        throw new IllegalArgumentException(edb.m38564m("[Puffin] Unsupported connection type: ", w5a1Var.f248047b));
                    }
                    ip20Var2 = new ip20("GENERIC");
                }
                arrayList.add(ip20Var2);
                s310Var2 = s310Var3;
            } else {
                s310 s310Var4 = s310Var2;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jp20 jp20Var = (jp20) it2.next();
                    if (jp20Var instanceof hp20) {
                        lqa1Var2 = new kqa1((hp20) jp20Var, new bqa1(e4yVarM39051k.f56195a, y3yVarM39050j.f269002a, null, rx31VarM39052l.f203481a, null, true, false));
                    } else {
                        if (!(jp20Var instanceof ip20)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lqa1Var2 = new lqa1((ip20) jp20Var, new bqa1(e4yVarM39051k.f56195a, y3yVarM39050j.f269002a, null, rx31VarM39052l.f203481a, null, true, false));
                    }
                    arrayList2.add(lqa1Var2);
                    it2 = it2;
                    e4yVarM39051k = e4yVarM39051k;
                }
                rx31 rx31VarM39052l2 = m39052l(v310Var.f236751a);
                e4y e4yVarM39051k2 = m39051k(v310Var.f236752b);
                y3y y3yVarM39050j2 = m39050j(s310Var4);
                List list2 = lc10Var2.f131794a;
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    h661 h661Var = (h661) it3.next();
                    zx31 zx31Var = h661Var.f88016c;
                    String str3 = h661Var.f88015b;
                    ay31 ay31VarM39053n = m39053n(zx31Var);
                    Iterator it4 = it3;
                    zx31 zx31Var2 = h661Var.f88016c;
                    if (wj50.m88271j(str3, str)) {
                        ip20Var = new hp20(h661Var.f88014a, zx31Var2.f287196d);
                    } else {
                        if (!wj50.m88271j(str3, "WIRED")) {
                            throw new IllegalArgumentException(edb.m38564m("[Puffin] Unsupported connection type: ", str3));
                        }
                        String str4 = zx31Var2.f287196d;
                        if (str4 == null) {
                            str4 = "GENERIC";
                        }
                        ip20Var = new ip20(str4);
                    }
                    if (ip20Var instanceof hp20) {
                        lqa1Var = new kqa1((hp20) ip20Var, new bqa1(e4yVarM39051k2.f56195a, y3yVarM39050j2.f269002a, ay31VarM39053n.f21084a, rx31VarM39052l2.f203481a, ay31VarM39053n.f21088e, true, true));
                    } else {
                        if (!(ip20Var instanceof ip20)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        lqa1Var = new lqa1((ip20) ip20Var, new bqa1(e4yVarM39051k2.f56195a, y3yVarM39050j2.f269002a, ay31VarM39053n.f21084a, rx31VarM39052l2.f203481a, ay31VarM39053n.f21088e, true, true));
                    }
                    arrayList3.add(lqa1Var);
                    it3 = it4;
                    str = str;
                }
                Object objM56684z = kk40.m56684z(new d4y0(g6f.m43700N0(arrayList3, arrayList2), this, null, 1), b4y0Var);
                if (objM56684z != obj) {
                    objM56684z = w2a1.f247311a;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public Object m39055e(mtc0 mtc0Var, fbk fbkVar) {
        zal zalVar;
        if (fbkVar instanceof zal) {
            zalVar = (zal) fbkVar;
            int i = zalVar.f281088d;
            if ((i & Integer.MIN_VALUE) != 0) {
                zalVar.f281088d = i - Integer.MIN_VALUE;
            } else {
                zalVar = new zal(this, fbkVar);
            }
        } else {
            zalVar = new zal(this, fbkVar);
        }
        Object objM70241b = zalVar.f281086b;
        int i2 = zalVar.f281088d;
        try {
            if (i2 == 0) {
                bga.m29073P(objM70241b);
                el2 el2Var = (el2) this.f59757b;
                String str = mtc0Var.f147023a;
                zalVar.f281085a = mtc0Var;
                zalVar.f281088d = 1;
                objM70241b = ((pl2) el2Var).m70241b(str, zalVar);
                yuk yukVar = yuk.f276404a;
                if (objM70241b == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mtc0Var = zalVar.f281085a;
                bga.m29073P(objM70241b);
            }
            am2 am2Var = (am2) objM70241b;
            zcl zclVar = (zcl) this.f59758c;
            zclVar.f281537a.put(mtc0Var.f147023a, am2Var.f17028a);
            return new iwc0(mtc0Var.f147023a, am2Var.f17028a);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return new gwc0(mtc0Var.f147023a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public Object m39056f(fbk fbkVar) {
        hhe hheVar;
        if (fbkVar instanceof hhe) {
            hheVar = (hhe) fbkVar;
            int i = hheVar.f91372c;
            if ((i & Integer.MIN_VALUE) != 0) {
                hheVar.f91372c = i - Integer.MIN_VALUE;
            } else {
                hheVar = new hhe(this, fbkVar);
            }
        } else {
            hheVar = new hhe(this, fbkVar);
        }
        Object obj = hheVar.f91370a;
        int i2 = hheVar.f91372c;
        if (i2 == 0) {
            bga.m29073P(obj);
            qnk qnkVar = (qnk) this.f59757b;
            hheVar.f91372c = 1;
            Object objM30136a = ((bpk) qnkVar).m30136a(hheVar);
            yuk yukVar = yuk.f276404a;
            if (objM30136a == yukVar) {
                return yukVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(obj);
        }
        ((zcl) this.f59758c).f281537a.clear();
        return w2a1.f247311a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public Object m39057g(fbk fbkVar) {
        qz90 qz90Var;
        if (fbkVar instanceof qz90) {
            qz90Var = (qz90) fbkVar;
            int i = qz90Var.f194152c;
            if ((i & Integer.MIN_VALUE) != 0) {
                qz90Var.f194152c = i - Integer.MIN_VALUE;
            } else {
                qz90Var = new qz90(this, fbkVar);
            }
        } else {
            qz90Var = new qz90(this, fbkVar);
        }
        Object objM30157w = qz90Var.f194150a;
        int i2 = qz90Var.f194152c;
        yuk yukVar = yuk.f276404a;
        if (i2 == 0) {
            bga.m29073P(objM30157w);
            qnk qnkVar = (qnk) this.f59757b;
            qz90Var.f194152c = 1;
            objM30157w = ((bpk) qnkVar).m30157w(null, qz90Var);
            if (objM30157w != yukVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bga.m29073P(objM30157w);
            return objM30157w;
        }
        bga.m29073P(objM30157w);
        String str = (String) objM30157w;
        if (str == null) {
            return mwc0.f147765a;
        }
        sm2 sm2Var = (sm2) this.f59758c;
        qz90Var.f194152c = 2;
        Object objM78509b = sm2Var.m78509b(str, qz90Var);
        return objM78509b == yukVar ? yukVar : objM78509b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public Object m39058i(lc10 lc10Var, ibk ibkVar) {
        c4y0 c4y0Var;
        if (ibkVar instanceof c4y0) {
            c4y0Var = (c4y0) ibkVar;
            int i = c4y0Var.f34032c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4y0Var.f34032c = i - Integer.MIN_VALUE;
            } else {
                c4y0Var = new c4y0(this, ibkVar);
            }
        } else {
            c4y0Var = new c4y0(this, ibkVar);
        }
        Object obj = c4y0Var.f34030a;
        int i2 = c4y0Var.f34032c;
        try {
            if (i2 == 0) {
                bga.m29073P(obj);
                List list = lc10Var.f131794a;
                v310 v310Var = lc10Var.f131796c;
                ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(m39053n(((h661) it.next()).f88016c));
                }
                d4y0 d4y0Var = new d4y0(g6f.m43701O0(m39051k(v310Var.f236752b), g6f.m43701O0(m39050j(v310Var.f236753c), g6f.m43701O0(m39052l(v310Var.f236751a), arrayList))), this, null, 0);
                c4y0Var.f34032c = 1;
                Object objM56684z = kk40.m56684z(d4y0Var, c4y0Var);
                yuk yukVar = yuk.f276404a;
                if (objM56684z == yukVar) {
                    return yukVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bga.m29073P(obj);
            }
            return z3y0.f279059a;
        } catch (IOException e) {
            Logger.m3966b("[Puffin] Error downloading filters " + e, new Object[0]);
            return new y3y0(e);
        }
    }

    @Override // p204p.th00
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f59756a) {
            case 0:
                String str = (String) obj;
                fbk fbkVar = null;
                return ((Boolean) obj2).booleanValue() ? g0b1.m43282x(xsr.f265652b, new ci1(this, str, fbkVar, 0)).m23295g(new di1(this, 0)) : g0b1.m43282x(xsr.f265652b, new ci1(this, str, fbkVar, 1)).m23295g(new di1(this, 1));
            case 1:
                return vjf1.m85770t((luk) this.f59758c, new ez4(this, (String) obj, (String) obj2, null, 19)).onErrorReturn(opg1.f167917Y);
            case 2:
                xq00 xq00Var = (xq00) obj;
                int iIntValue = ((Number) obj2).intValue();
                String str2 = (String) this.f59757b;
                if (xq00Var.m91752Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zM91766g = xq00Var.m91766g(str2);
                    Object objM91750T = xq00Var.m91750T();
                    if (zM91766g || objM91750T == t6x0.f217647t) {
                        objM91750T = new p39(str2, 0);
                        xq00Var.m91793t0(objM91750T);
                    }
                    fxh0 fxh0VarM96644b = zoz0.m96644b(cxh0.f43038a, false, (gh00) objM91750T);
                    fyf fyfVar = (fyf) this.f59758c;
                    m6d0 m6d0VarM36007d = dha.m36007d(d7f0.f46166e, false);
                    int iM70356o = pmg1.m70356o(xq00Var);
                    wpn0 wpn0VarM91778m = xq00Var.m91778m();
                    fxh0 fxh0VarM48286s = hqg1.m48286s(xq00Var, fxh0VarM96644b);
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
                    yhh yhhVar = roh.f201265j;
                    if (xq00Var.f264808S || !wj50.m88271j(xq00Var.m91750T(), Integer.valueOf(iM70356o))) {
                        pi9.m70087l(iM70356o, xq00Var, iM70356o, yhhVar);
                    }
                    zsf1.m96835F(fxh0VarM48286s, roh.f201259d, xq00Var);
                    ms2.m62690o(0, fyfVar, xq00Var, xq00Var, true);
                } else {
                    xq00Var.m91757b0();
                }
                return w2a1.f247311a;
            case 3:
                xq00 xq00Var2 = (xq00) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (xq00Var2.m91752Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    ((vh00) this.f59757b).mo24510D0(((zda) this.f59758c).f281657b, xq00Var2, 0);
                } else {
                    xq00Var2.m91757b0();
                }
                return w2a1.f247311a;
            case 4:
                xq00 xq00Var3 = (xq00) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (xq00Var3.m91752Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    fxh0 fxh0VarM96864x = zsf1.m96864x(mi21.m61817a(cxh0.f43038a, bta.f30539c, bta.f30540d), (f4m0) this.f59757b);
                    vi5 vi5Var = bj5.f27614e;
                    vb9 vb9Var = d7f0.f46142M0;
                    fyf fyfVar2 = (fyf) this.f59758c;
                    irx0 irx0VarM36744a = drx0.m36744a(vi5Var, vb9Var, xq00Var3, 54);
                    int iM70356o2 = pmg1.m70356o(xq00Var3);
                    wpn0 wpn0VarM91778m2 = xq00Var3.m91778m();
                    fxh0 fxh0VarM48286s2 = hqg1.m48286s(xq00Var3, fxh0VarM96864x);
                    soh.f211194A.getClass();
                    C2087le c2087le2 = roh.f201257b;
                    if (xq00Var3.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var3.m91779m0();
                    if (xq00Var3.f264808S) {
                        xq00Var3.m91776l(c2087le2);
                    } else {
                        xq00Var3.m91799w0();
                    }
                    zsf1.m96835F(irx0VarM36744a, roh.f201262g, xq00Var3);
                    zsf1.m96835F(wpn0VarM91778m2, roh.f201261f, xq00Var3);
                    yhh yhhVar2 = roh.f201265j;
                    if (xq00Var3.f264808S || !wj50.m88271j(xq00Var3.m91750T(), Integer.valueOf(iM70356o2))) {
                        pi9.m70087l(iM70356o2, xq00Var3, iM70356o2, yhhVar2);
                    }
                    zsf1.m96835F(fxh0VarM48286s2, roh.f201259d, xq00Var3);
                    fyfVar2.mo24510D0(prx0.f180692a, xq00Var3, 6);
                    xq00Var3.m91788r(true);
                } else {
                    xq00Var3.m91757b0();
                }
                return w2a1.f247311a;
            case 5:
                return m39056f((fbk) obj2);
            case 6:
                return m39055e((mtc0) obj, (fbk) obj2);
            case 7:
                return Boolean.valueOf(wj50.m88271j((oqo) obj, (cab) this.f59757b) && wj50.m88271j((oqo) obj2, (cab) this.f59758c));
            case 8:
                return ((Single) ((n90) this.f59757b).invoke((String) obj, (String) obj2)).flatMap(new j3p(this, 18));
            case 9:
                int iIntValue4 = ((Number) obj2).intValue();
                return new tz10(((tz10) ((hv60) this.f59757b).mo24510D0((vs70) obj, Integer.valueOf(iIntValue4), ((List) this.f59758c).get(iIntValue4))).f225083a);
            case 10:
                return m39057g((fbk) obj2);
            case 11:
                xq00 xq00Var4 = (xq00) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (xq00Var4.m91752Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    va71.m85016a(((qp91) this.f59757b).f191231j, (fyf) this.f59758c, xq00Var4, 0);
                } else {
                    xq00Var4.m91757b0();
                }
                return w2a1.f247311a;
            case 12:
                int iIntValue6 = ((Number) obj2).intValue();
                return new tz10(((tz10) ((bnl0) this.f59757b).mo24510D0((vs70) obj, Integer.valueOf(iIntValue6), ((List) this.f59758c).get(iIntValue6))).f225083a);
            case 13:
                return m39054a((lc10) obj, (fbk) obj2);
            case 14:
                xq00 xq00Var5 = (xq00) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (xq00Var5.m91752Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    fyf fyfVar3 = (fyf) this.f59757b;
                    jay0 jay0Var = (jay0) this.f59758c;
                    m6d0 m6d0VarM36007d2 = dha.m36007d(d7f0.f46166e, false);
                    int iM70356o3 = pmg1.m70356o(xq00Var5);
                    wpn0 wpn0VarM91778m3 = xq00Var5.m91778m();
                    fxh0 fxh0VarM48286s3 = hqg1.m48286s(xq00Var5, cxh0.f43038a);
                    soh.f211194A.getClass();
                    C2087le c2087le3 = roh.f201257b;
                    if (xq00Var5.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var5.m91779m0();
                    if (xq00Var5.f264808S) {
                        xq00Var5.m91776l(c2087le3);
                    } else {
                        xq00Var5.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d2, roh.f201262g, xq00Var5);
                    zsf1.m96835F(wpn0VarM91778m3, roh.f201261f, xq00Var5);
                    yhh yhhVar3 = roh.f201265j;
                    if (xq00Var5.f264808S || !wj50.m88271j(xq00Var5.m91750T(), Integer.valueOf(iM70356o3))) {
                        pi9.m70087l(iM70356o3, xq00Var5, iM70356o3, yhhVar3);
                    }
                    zsf1.m96835F(fxh0VarM48286s3, roh.f201259d, xq00Var5);
                    fyfVar3.mo24510D0(jay0Var, xq00Var5, 6);
                    xq00Var5.m91788r(true);
                } else {
                    xq00Var5.m91757b0();
                }
                return w2a1.f247311a;
            case 15:
                xq00 xq00Var6 = (xq00) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (xq00Var6.m91752Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    vh00 vh00Var = (vh00) this.f59757b;
                    y631 y631Var = (y631) this.f59758c;
                    wj50.m88279p(y631Var);
                    vh00Var.mo24510D0(y631Var, xq00Var6, 0);
                } else {
                    xq00Var6.m91757b0();
                }
                return w2a1.f247311a;
            case 16:
                xq00 xq00Var7 = (xq00) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (xq00Var7.m91752Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ((vh00) this.f59757b).mo24510D0((x671) this.f59758c, xq00Var7, 6);
                } else {
                    xq00Var7.m91757b0();
                }
                return w2a1.f247311a;
            default:
                xq00 xq00Var8 = (xq00) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (xq00Var8.m91752Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    kqi0 kqi0Var = (kqi0) this.f59757b;
                    Object objM91750T2 = xq00Var8.m91750T();
                    if (objM91750T2 == t6x0.f217647t) {
                        objM91750T2 = new cr4(kqi0Var, 9);
                        xq00Var8.m91793t0(objM91750T2);
                    }
                    fxh0 fxh0VarM85877w = vkf1.m85877w(cxh0.f43038a, (gh00) objM91750T2);
                    fyf fyfVar4 = (fyf) this.f59758c;
                    m6d0 m6d0VarM36007d3 = dha.m36007d(d7f0.f46166e, false);
                    int iM70356o4 = pmg1.m70356o(xq00Var8);
                    wpn0 wpn0VarM91778m4 = xq00Var8.m91778m();
                    fxh0 fxh0VarM48286s4 = hqg1.m48286s(xq00Var8, fxh0VarM85877w);
                    soh.f211194A.getClass();
                    C2087le c2087le4 = roh.f201257b;
                    if (xq00Var8.f264811a == null) {
                        pmg1.m70360s();
                        throw null;
                    }
                    xq00Var8.m91779m0();
                    if (xq00Var8.f264808S) {
                        xq00Var8.m91776l(c2087le4);
                    } else {
                        xq00Var8.m91799w0();
                    }
                    zsf1.m96835F(m6d0VarM36007d3, roh.f201262g, xq00Var8);
                    zsf1.m96835F(wpn0VarM91778m4, roh.f201261f, xq00Var8);
                    yhh yhhVar4 = roh.f201265j;
                    if (xq00Var8.f264808S || !wj50.m88271j(xq00Var8.m91750T(), Integer.valueOf(iM70356o4))) {
                        pi9.m70087l(iM70356o4, xq00Var8, iM70356o4, yhhVar4);
                    }
                    zsf1.m96835F(fxh0VarM48286s4, roh.f201259d, xq00Var8);
                    ms2.m62690o(0, fyfVar4, xq00Var8, xq00Var8, true);
                } else {
                    xq00Var8.m91757b0();
                }
                return w2a1.f247311a;
        }
    }
}
