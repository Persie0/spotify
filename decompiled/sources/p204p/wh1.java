package p204p;

import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class wh1 implements f7x0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f251223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f251224b;

    public /* synthetic */ wh1(Object obj, int i) {
        this.f251223a = i;
        this.f251224b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v128, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v76, types: [p.gh00, p.ri00] */
    @Override // p204p.f7x0
    /* JADX INFO: renamed from: e */
    public final void mo29825e(c7x0 c7x0Var) {
        String strMo48710e;
        Object p9dVar;
        int i;
        c8r c8rVar;
        switch (this.f251223a) {
            case 0:
                n6x0 n6x0Var = c7x0Var instanceof n6x0 ? (n6x0) c7x0Var : null;
                if (n6x0Var != null) {
                    cut0 cut0Var = (cut0) ((C1947hm) this.f251224b).f92783c;
                    hv31 hv31Var = cut0Var.f42216a;
                    boolean z = cut0Var.f42217b;
                    List listM88477a1 = cut0.f42215d;
                    if (z && (strMo48710e = hv31Var.mo48710e(cut0.f42214c, null)) != null) {
                        listM88477a1 = wl51.m88477a1(strMo48710e, new String[]{"\n"}, 0, 6);
                    }
                    ArrayList arrayListM43701O0 = g6f.m43701O0(((jd01) n6x0Var.f150980a).f111218a, listM88477a1);
                    if (z) {
                        lv31 lv31VarEdit = hv31Var.edit();
                        lv31VarEdit.m60051d(cut0.f42214c, g6f.m43753y0(arrayListM43701O0, "\n", null, null, null, 62));
                        lv31VarEdit.m60054g();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (c7x0Var instanceof n6x0) {
                    bqa bqaVar = ((ip5) this.f251224b).f104385a;
                    avc1 avc1Var = (avc1) ((n6x0) c7x0Var).f150980a;
                    bqaVar.mo30231j(new vn5(avc1Var.f20158a, avc1Var.f20159b));
                    return;
                }
                return;
            case 2:
                if (c7x0Var instanceof n6x0) {
                    yi6 yi6Var = (yi6) ((n6x0) c7x0Var).f150980a;
                    List list = yi6Var.f273045a;
                    ArrayList arrayList = new ArrayList(i6f.m49804T(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new mf6(((br50) it.next()).getUri(), yi6Var.f273046b));
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    ((bqa) ((w0e1) this.f251224b).f246722d).mo30231j(new nf6(arrayList));
                    return;
                }
                return;
            case 3:
                hol0 hol0Var = (hol0) this.f251224b;
                if (c7x0Var instanceof n6x0) {
                    int iOrdinal = ((ui6) hol0Var.f93562b).ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1) {
                        ((rmm0) hol0Var.f93565e).mo29871c().m66891n(c7x0Var);
                        return;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ((ek6) hol0Var.f93564d).f60390a.onNext(new wj6(((yi6) ((n6x0) c7x0Var).f150980a).f273045a));
                        return;
                    }
                }
                return;
            case 4:
                if (c7x0Var instanceof n6x0) {
                    fn9 fn9Var = (fn9) ((n6x0) c7x0Var).f150980a;
                    String str = fn9Var.f71234b;
                    Object vms0Var = str != null ? new vms0(str) : ums0.f231950a;
                    un9 un9Var = (un9) this.f251224b;
                    x0h1.m89578u(un9Var.f232105i, null, 0, new ez4(un9Var, fn9Var.f71233a, vms0Var, null, 26), 3);
                    return;
                }
                return;
            case 5:
                if (c7x0Var.equals(b6x0.f24069a)) {
                    na6.m63971s("Returning the result from Chat Content Picker has failed");
                    return;
                }
                if (!(c7x0Var instanceof n6x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                wyn0 wyn0Var = ((rzc) ((n6x0) c7x0Var).f150980a).f204125a;
                szc szcVar = (szc) this.f251224b;
                if (wyn0Var instanceof tyn0) {
                    p9dVar = new cad(((tyn0) wyn0Var).f225012a);
                } else if (wyn0Var instanceof vyn0) {
                    vyn0 vyn0Var = (vyn0) wyn0Var;
                    p9dVar = new aad(new xdj(vyn0Var.f246294a, false), vyn0Var.f246295b);
                } else {
                    if (!(wyn0Var instanceof uyn0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kdj kdjVar = ((uyn0) wyn0Var).f235342a;
                    sfx0 sfx0Var = kdjVar.f121686b;
                    String str2 = sfx0Var != null ? sfx0Var.f208653a : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    p9dVar = new p9d(kdjVar, str2);
                }
                szcVar.f215461b.accept(p9dVar);
                return;
            case 6:
                if (c7x0Var.equals(b6x0.f24069a)) {
                    return;
                }
                if (!(c7x0Var instanceof n6x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((g3d) this.f251224b).f76179a.accept(x7d.f258873a);
                return;
            case 7:
                if (c7x0Var instanceof n6x0) {
                    ((rqc) this.f251224b).invoke(((n6x0) c7x0Var).f150980a);
                    return;
                }
                return;
            case 8:
                ((bqa) ((nt7) this.f251224b).f157998b).mo30231j(new oki(c7x0Var instanceof n6x0 ? l3j.f129338a : k3j.f118919a));
                return;
            case 9:
                if (c7x0Var instanceof n6x0) {
                    Object obj = ((kcm) ((n6x0) c7x0Var).f150980a).f121509a.get(new c251("confirm-generation-location"));
                    String str3 = null;
                    bma0 bma0Var = obj instanceof bma0 ? (bma0) obj : null;
                    if (bma0Var != null) {
                        bqa bqaVar2 = ((ami) this.f251224b).f17145a;
                        String str4 = bma0Var.f28481a;
                        if (str4 != null && !wl51.m88460J0(str4)) {
                            str3 = str4;
                        }
                        bqaVar2.mo30231j(new dli(str3));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                if (c7x0Var instanceof n6x0) {
                    ((bqa) ((ujh) this.f251224b).f231032b).mo30231j(jki.f113318a);
                    return;
                }
                return;
            case 11:
                if (c7x0Var instanceof n6x0) {
                    ((bqa) ((n6i) this.f251224b).f150891b).mo30231j(new oli(((wl21) ((n6x0) c7x0Var).f150980a).f252351a));
                    return;
                }
                return;
            case 12:
                if (c7x0Var instanceof n6x0) {
                    bqa bqaVar3 = (bqa) ((np7) this.f251224b).f156890b;
                    avc1 avc1Var2 = (avc1) ((n6x0) c7x0Var).f150980a;
                    bqaVar3.mo30231j(new rli(avc1Var2.f20158a, avc1Var2.f20159b));
                    return;
                }
                return;
            case 13:
                ((ami) this.f251224b).f17145a.mo30231j(c7x0Var instanceof n6x0 ? l3j.f129338a : k3j.f118919a);
                return;
            case 14:
                zpj zpjVar = (zpj) this.f251224b;
                if (!(c7x0Var instanceof n6x0)) {
                    if (!c7x0Var.equals(b6x0.f24069a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
                wyn0 wyn0Var2 = ((rzc) ((n6x0) c7x0Var).f150980a).f204125a;
                if (wyn0Var2 instanceof tyn0) {
                    zpjVar.f285135b.invoke(new ocl0(((tyn0) wyn0Var2).f225012a, null, null, null, null, 120));
                    return;
                }
                if (wyn0Var2 instanceof vyn0) {
                    vyn0 vyn0Var2 = (vyn0) wyn0Var2;
                    zpjVar.f285136c.invoke(new xdj(vyn0Var2.f246294a, false), Long.valueOf(vyn0Var2.f246295b));
                    return;
                } else {
                    if (!(wyn0Var2 instanceof uyn0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zpjVar.f285137d.invoke(((uyn0) wyn0Var2).f235342a);
                    return;
                }
            case 15:
                szc szcVar2 = (szc) this.f251224b;
                if (c7x0Var.equals(b6x0.f24069a)) {
                    na6.m63971s("Returning the result from Custom Reactions Picker has failed");
                    return;
                } else {
                    if (!(c7x0Var instanceof n6x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                    egm0 egm0Var = szcVar2.f215461b;
                    qam qamVar = (qam) ((n6x0) c7x0Var).f150980a;
                    egm0Var.accept(new h9d(qamVar.f186901a, qamVar.f186902b, seconds));
                    return;
                }
            case 16:
                if (c7x0Var.equals(b6x0.f24069a)) {
                    return;
                }
                if (!(c7x0Var instanceof n6x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((w6q) this.f251224b).f248443a.invoke(new ag3(pmf0.m70312B(((ds31) ((n6x0) c7x0Var).f150980a).f52480a)));
                return;
            case 17:
                if (!(c7x0Var instanceof n6x0)) {
                    return;
                }
                hwz hwzVar = ((cwz) this.f251224b).f42862c;
                azy azyVar = (azy) ((n6x0) c7x0Var).f150980a;
                zvz zvzVar = hwzVar.f96097i;
                nr31 nr31Var = azyVar.f21708a;
                List list2 = azyVar.f21709b;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    if (((n2z) obj2).f149876b) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((n2z) it2.next()).f149875a);
                }
                Set setM43736n1 = g6f.m43736n1(arrayList3);
                ArrayList<n2z> arrayList4 = hwzVar.f96087W0;
                ArrayList arrayList5 = new ArrayList(i6f.m49804T(arrayList4, 10));
                for (n2z n2zVar : arrayList4) {
                    arrayList5.add(n2z.m63573c(n2zVar, setM43736n1.contains(n2zVar.f149875a)));
                }
                hwzVar.f96087W0 = arrayList5;
                lr31 lr31Var = nr31Var.f157438b;
                kr31 kr31Var = nr31Var.f157440d;
                ArrayList arrayList6 = hwzVar.f96089X0;
                ArrayList arrayList7 = new ArrayList(i6f.m49804T(arrayList6, 10));
                Iterator it3 = arrayList6.iterator();
                while (true) {
                    int i2 = 1;
                    if (!it3.hasNext()) {
                        hwzVar.f96089X0 = arrayList7;
                        zvzVar.getClass();
                        lr31 lr31Var2 = nr31Var.f157438b;
                        zvzVar.f286851b = lr31Var2;
                        if (kr31Var == null || (i = kr31Var.f125536a) == 0) {
                            int iOrdinal2 = lr31Var2.ordinal();
                            if (iOrdinal2 != 0 && iOrdinal2 == 2) {
                                i2 = 2;
                            }
                            i = i2;
                        }
                        zvzVar.f286852c = i;
                        ArrayList arrayList8 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (((n2z) obj3).f149876b) {
                                arrayList8.add(obj3);
                            }
                        }
                        ArrayList arrayList9 = new ArrayList(i6f.m49804T(arrayList8, 10));
                        Iterator it4 = arrayList8.iterator();
                        while (it4.hasNext()) {
                            arrayList9.add(((n2z) it4.next()).f149875a);
                        }
                        Set setM43736n2 = g6f.m43736n1(arrayList9);
                        lv31 lv31VarEdit2 = zvzVar.f286850a.edit();
                        lv31VarEdit2.m60052e(awz.f20735a, setM43736n2);
                        lv31VarEdit2.m60054g();
                        zv41 zv41Var = zvzVar.f286853d;
                        pqm0 pqm0Var = new pqm0(zvzVar.m97100a(), zvzVar.m97103d());
                        zv41Var.getClass();
                        zv41Var.m97091m(null, pqm0Var);
                        sdo sdoVar = hwzVar.f96095g;
                        x401 x401VarM97101b = zvzVar.m97101b();
                        i490 i490VarM97102c = zvzVar.m97102c();
                        zv41 zv41Var2 = (zv41) sdoVar.f208053g;
                        vvz vvzVar = new vvz(x401VarM97101b, i490VarM97102c);
                        zv41Var2.getClass();
                        zv41Var2.m97091m(null, vvzVar);
                        return;
                    }
                    nr31 nr31Var2 = (nr31) it3.next();
                    arrayList7.add(nr31Var2.f157438b == lr31Var ? nr31.m65468c(nr31Var2, true, kr31Var, 3) : nr31.m65468c(nr31Var2, false, null, 11));
                }
                break;
            case 18:
                if (c7x0Var instanceof n6x0) {
                    bqa bqaVar4 = (bqa) ((etz) this.f251224b).f62823b;
                    uk6 uk6Var = (uk6) ((n6x0) c7x0Var).f150980a;
                    bqaVar4.mo30231j(new uk70(uk6Var.f231235a, uk6Var.f231236b));
                    return;
                }
                return;
            case 19:
                if (c7x0Var instanceof n6x0) {
                    ((t690) this.f251224b).invoke(((n6x0) c7x0Var).f150980a);
                    return;
                }
                return;
            case 20:
                if (c7x0Var.equals(b6x0.f24069a)) {
                    return;
                }
                if (!(c7x0Var instanceof n6x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                d510 d510Var = ((ila0) ((n6x0) c7x0Var).f150980a).f103339a;
                if (d510Var != null) {
                    ((wl90) this.f251224b).f252494e.invoke(new dcx(d510Var));
                    return;
                }
                return;
            case 21:
                hqb hqbVar = (hqb) this.f251224b;
                if (hqbVar.isActive()) {
                    if (c7x0Var instanceof n6x0) {
                        c8rVar = ((a8r) ((n6x0) c7x0Var).f150980a).f13344a;
                    } else {
                        if (!(c7x0Var instanceof b6x0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c8rVar = c8r.f35307c;
                    }
                    hqbVar.resumeWith(c8rVar);
                    return;
                }
                return;
            case 22:
                if (c7x0Var instanceof n6x0) {
                    ((imb0) this.f251224b).f103662a.invoke(((n6x0) c7x0Var).f150980a);
                    return;
                } else {
                    if (!(c7x0Var instanceof b6x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                }
            case 23:
                hx4 hx4Var = ((ckd0) this.f251224b).f38923b;
                if (c7x0Var.equals(b6x0.f24069a)) {
                    hx4Var.invoke(null);
                    return;
                } else {
                    if (!(c7x0Var instanceof n6x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hx4Var.invoke(((n6x0) c7x0Var).f150980a);
                    return;
                }
            case 24:
                hb11 hb11Var = (hb11) ((vyr0) this.f251224b).f246314c;
                if (c7x0Var instanceof n6x0) {
                    hb11Var.mo46962a(new ezt0(((yyt0) ((n6x0) c7x0Var).f150980a).f277583a));
                    return;
                } else {
                    if (!(c7x0Var instanceof b6x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hb11Var.mo46962a(dzt0.f54734a);
                    return;
                }
            case 25:
                ycm0 ycm0Var = (ycm0) this.f251224b;
                hb11 hb11Var2 = (hb11) ycm0Var.f271528c;
                String str5 = (String) ycm0Var.f271530e;
                String str6 = (String) ycm0Var.f271531f;
                ycm0Var.f271530e = null;
                ycm0Var.f271531f = null;
                if (!(c7x0Var instanceof n6x0)) {
                    if (!(c7x0Var instanceof b6x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    hb11Var2.mo46962a(new pkt0(null));
                    return;
                } else {
                    if (str5 == null || str6 == null) {
                        return;
                    }
                    gp8 gp8Var = ((y5u0) ((n6x0) c7x0Var).f150980a).f269551a;
                    hb11Var2.mo46962a(new pkt0(new jjt0(str5, gp8Var.f83101a, str6, gp8Var.f83102b)));
                    return;
                }
            case 26:
                if (c7x0Var.equals(b6x0.f24069a)) {
                    return;
                }
                if (!(c7x0Var instanceof n6x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                oyp0 oyp0Var = (oyp0) this.f251224b;
                dlu0 dlu0Var = (dlu0) ((n6x0) c7x0Var).f150980a;
                if (dlu0Var.f50369d) {
                    ((egm0) oyp0Var.f171834d).accept(new h9d(dlu0Var.f50366a, dlu0Var.f50368c, TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis())));
                    return;
                } else {
                    mjd.m61965a((z9j0) oyp0Var.f171833c, mjd.m61974j(dlu0Var.f50367b), null, null);
                    return;
                }
            case 27:
                if (!(c7x0Var instanceof n6x0)) {
                    if (!(c7x0Var instanceof b6x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return;
                } else {
                    br50 br50Var = (br50) g6f.m43745s0(((yi6) ((n6x0) c7x0Var).f150980a).f273045a);
                    if (br50Var != null) {
                        ((gsy0) this.f251224b).f84046c.f105786a.invoke(new p0x(br50Var.getUri()));
                        return;
                    }
                    return;
                }
            case 28:
                ?? r0 = ((nm11) this.f251224b).f155266c;
                if (c7x0Var.equals(b6x0.f24069a)) {
                    r0.invoke(c6z.f34646a);
                    return;
                } else {
                    if (!(c7x0Var instanceof n6x0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    pse1 pse1Var = (pse1) ((n6x0) c7x0Var).f150980a;
                    r0.invoke(new b6z(new hs61(pse1Var.f180832a, pse1Var.f180833b, 0)));
                    return;
                }
            default:
                if (c7x0Var.equals(b6x0.f24069a)) {
                    return;
                }
                if (!(c7x0Var instanceof n6x0)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((PublishSubject) ((C2300qn) this.f251224b).f190445b).onNext(new ag3(pmf0.m70312B(((ds31) ((n6x0) c7x0Var).f150980a).f52480a)));
                return;
        }
    }
}
