package p204p;

import android.widget.FrameLayout;
import com.spotify.cosmos.servicebasedrouter.RemoteNativeRxRouter;
import com.spotify.encoreconsumermobile.elements.story.CircularVideoPreviewView;
import com.spotify.music.R;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class cn8 extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39913a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f39914b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f39915c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cn8(int i, Object obj, Object obj2) {
        super(1);
        this.f39913a = i;
        this.f39914b = obj;
        this.f39915c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [p.qe70, p.th00] */
    /* JADX WARN: Type inference failed for: r12v2, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r12v23, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r12v4, types: [p.mb61, p.th00] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, java.util.List] */
    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        tt80 tt80Var;
        String strConcat;
        int i = this.f39913a;
        int i2 = 14;
        int i3 = 2;
        int i4 = 17;
        int i5 = 0;
        int i6 = 3;
        int i7 = 1;
        fbk fbkVar = null;
        w2a1 w2a1Var = w2a1.f247311a;
        Object obj2 = this.f39915c;
        Object obj3 = this.f39914b;
        switch (i) {
            case 0:
                ((gh00) obj3).invoke(new RemoteNativeRxRouter(((zl8) obj).mo64738s().getRemoteNativeRouter(), ((dn8) obj2).f50703c.getUseComputationScheduler()));
                return w2a1Var;
            case 1:
                Set set = (Set) obj;
                ArrayList arrayList = new ArrayList(i6f.m49804T(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(((k35) it.next()).f118763b);
                }
                return new ea5((fiz) ((qe70) obj3).invoke(g6f.m43736n1(arrayList)), (tn61) obj2, i2);
            case 2:
                Set set2 = (Set) obj;
                ArrayList arrayList2 = new ArrayList(i6f.m49804T(set2, 10));
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((k35) it2.next()).f118763b);
                }
                Map map = (Map) ((gh00) obj3).invoke(g6f.m43736n1(arrayList2));
                tn61 tn61Var = (tn61) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(c95.m31820L(map.size()));
                for (Map.Entry entry : map.entrySet()) {
                    linkedHashMap.put(new k35(tn61Var, entry.getKey()), entry.getValue());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(c95.m31820L(linkedHashMap.size()));
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry2.getKey(), (pjo) entry2.getValue());
                }
                return linkedHashMap2;
            case 3:
                return new nzx0(new C1977ig((th00) obj3, (Set) obj, (th00) obj2, (fbk) null));
            case 4:
                qt5 qt5Var = (qt5) obj;
                pgo pgoVar = (pgo) obj3;
                zt5 zt5Var = (zt5) obj2;
                return new zux(fag1.m41173v(pgoVar, zt5Var.f286058a, qt5Var), qt5Var.f192294b.isEmpty() ? fag1.m41151B(pgoVar, zt5Var.f286060c, qt5Var) : fag1.m41151B(pgoVar, zt5Var.f286059b, qt5Var), new C2278q2(i6, i2, fbkVar), i7);
            case 5:
                return sjf1.m78337v(Single.fromCallable(new mc9((vc9) obj3, (bn70) obj2, (k6x0) obj, i5)), 7).compose(new zy5(i7));
            case 6:
                d850 d850Var = (d850) obj;
                Set set3 = dd41.f47702f;
                String strM35694A = r46.m74726U("spotify:blend:members:".concat(r46.m74726U((String) obj2).m35710h())).m35694A();
                z9j0 z9j0Var = ((ij9) obj3).f102760a;
                if (strM35694A == null) {
                    strM35694A = "";
                }
                z9j0Var.mo47342b(strM35694A, d850Var, null);
                return w2a1Var;
            case 7:
                List list = (List) obj;
                fk9 fk9Var = (fk9) obj2;
                List list2 = (List) obj3;
                if (list.size() == 0) {
                    tt80Var = new tt80(list2, lau.f131415a);
                } else {
                    ArrayList arrayList3 = new ArrayList();
                    int i8 = 0;
                    for (Object obj4 : list2) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            h6f.m46722S();
                            throw null;
                        }
                        if (wj50.m88271j(g6f.m43747t0(i8, list), Boolean.FALSE)) {
                            arrayList3.add(obj4);
                        }
                        i8 = i9;
                    }
                    tt80Var = new tt80(list2, arrayList3);
                }
                if (tt80Var.f223552b.isEmpty() && !tt80Var.f223551a.isEmpty()) {
                    return Single.just(new t4m(2));
                }
                Set set4 = dd41.f47702f;
                return fk9Var.f70505b.m64809a(new qm9(r46.m74726U(fk9Var.f70509f).m35710h(), (String) list2.get(0), "ADD_TRACK")).flatMap(new rc9(fk9Var, i7)).onErrorReturnItem(new t4m(3));
            case 8:
                CircularVideoPreviewView circularVideoPreviewView = (CircularVideoPreviewView) obj;
                sk9 sk9Var = (sk9) obj2;
                gh00 gh00Var = (gh00) obj3;
                circularVideoPreviewView.mo2820d(sk9Var.f210059a);
                circularVideoPreviewView.setVisibility(sk9Var.f210059a.f121867a.length() <= 0 ? 8 : 0);
                circularVideoPreviewView.f3768g = new ue9(i7, gh00Var);
                return w2a1Var;
            case 9:
                w0e1 w0e1Var = (w0e1) obj3;
                x0h1.m89578u(n5h1.m63737m((m500) w0e1Var.f246722d), null, 0, new C1977ig(w0e1Var, (String) obj2, (d850) obj, (fbk) null, 26), 3);
                return w2a1Var;
            case 10:
                ((cq9) obj3).f40799a.mo47342b((String) obj2, (d850) obj, null);
                return w2a1Var;
            case 11:
                d850 d850Var2 = (d850) obj;
                ry00 ry00Var = (ry00) ((e99) obj3).f57394b;
                ry00Var.getClass();
                Set set5 = dd41.f47702f;
                dd41 dd41VarM74726U = r46.m74726U((String) obj2);
                gn80 gn80Var = dd41VarM74726U.f47709c;
                int iOrdinal = gn80Var.ordinal();
                if (iOrdinal == 42) {
                    strConcat = "spotify:internal:parental-control:blocking:artist:".concat(dd41VarM74726U.m35710h());
                } else {
                    if (iOrdinal != 925) {
                        throw new IllegalArgumentException("Invalid link type: " + gn80Var + ". Expected artist or track.");
                    }
                    strConcat = "spotify:internal:parental-control:blocking:track:".concat(dd41VarM74726U.m35710h());
                }
                ry00Var.f203776a.mo47342b(strConcat, d850Var2, null);
                return w2a1Var;
            case 12:
                s5o0.m77291r((s5o0) obj, (t5o0) obj3, 0, 0, ((qq9) obj2).f191511M0, 4);
                return w2a1Var;
            case 13:
                ((r36) ((it9) obj3).f105467b).m74619a((String) obj2, (d850) obj);
                return w2a1Var;
            case 14:
                ((n0a) obj3).f148951b.m61893B((yyx0) obj, (o0a) obj2);
                return w2a1Var;
            case 15:
                fqb fqbVar = (fqb) obj3;
                pqm0 pqm0Var = new pqm0((i1a) obj, ((rlv0) obj2).f200373a);
                if (fqbVar.isActive()) {
                    fqbVar.resumeWith(pqm0Var);
                }
                return w2a1Var;
            case 16:
                return mvl0.m62953p(new zux((xv41) obj3, ((gmx) obj2).f81493a, new jl0(i6, i6, fbkVar), i7));
            case 17:
                rkc0 rkc0Var = (rkc0) obj3;
                String str = rkc0Var.f200048a;
                Set set6 = dd41.f47702f;
                w0e1 w0e1Var2 = (w0e1) obj2;
                x0h1.m89578u(n5h1.m63737m((m500) w0e1Var2.f246720b), null, 0, new C1977ig(29, rkc0Var, w0e1Var2, str, r46.m74726U(str).m35710h(), (fbk) null), 3);
                return w2a1Var;
            case 18:
                u16 u16Var = (u16) obj;
                gh00 gh00Var2 = (gh00) obj3;
                if (u16Var.equals(t16.f216159a)) {
                    gh00Var2.invoke(i9i.f100015a);
                } else {
                    if (!(u16Var instanceof s16)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    s16 s16Var = (s16) u16Var;
                    String str2 = s16Var.f204606a;
                    gh00Var2.invoke(new l9i(str2, ((np7) obj2).m65289f(new l750(str2, s16Var.f204607b))));
                }
                return w2a1Var;
            case 19:
                ((vc80) obj).f240072a = new of5((zha) obj3, (uha) obj2, fbkVar, i4);
                return w2a1Var;
            case 20:
                np7 np7Var = (np7) obj3;
                ((oz5) np7Var.f156891c).m68618a(((m500) np7Var.f156890b).getString(R.string.context_menu_artists_list_title), (List) obj2);
                return w2a1Var;
            case 21:
                f220 f220Var = (f220) obj;
                twz0 twz0Var = (twz0) obj2;
                Iterator it3 = ((rla) ((twy) obj3).f224510b).f200253a.iterator();
                while (it3.hasNext()) {
                    ((aoa) it3.next()).mo26572a(twz0Var, f220Var);
                }
                return w2a1Var;
            case 22:
                int iIntValue = ((Number) obj).intValue();
                ((vum0) obj2).m86438w(iIntValue);
                zv41 zv41Var = ((s1r) obj3).f204781a;
                zv41Var.m97091m(null, r1r.m74489a((r1r) zv41Var.getValue(), false, false, null, Integer.valueOf(iIntValue), 7));
                return w2a1Var;
            case 23:
                List<pqm0> list3 = (List) obj;
                g3b g3bVar = (g3b) obj2;
                ArrayList arrayList4 = new ArrayList(i6f.m49804T(list3, 10));
                for (pqm0 pqm0Var2 : list3) {
                    k35 k35Var = (k35) pqm0Var2.f180350a;
                    arrayList4.add(new pqm0(k35Var, g3b.m43475f(g3bVar, k35Var, (pjo) pqm0Var2.f180351b)));
                }
                if (!arrayList4.isEmpty()) {
                    ((qe70) obj3).invoke(arrayList4);
                }
                return w2a1Var;
            case 24:
                qf40 qf40Var = (qf40) obj3;
                ((uw70) obj).mo30902e(((AbstractC2282q6) qf40Var).mo33075a(), new C1954ht(20, qf40Var), new C1954ht(21, qf40Var), new fyf(new C2027jt(i3, (C2065kt) obj2, qf40Var), true, 802480018));
                return w2a1Var;
            case 25:
                return new zux((xv41) obj3, ((vhb) obj2).f241456b.m41340a(), new C2278q2(i6, i4, fbkVar), i7);
            case 26:
                ((ao20) obj3).mo26555a(((aib) obj2).f15927c, (FrameLayout) obj);
                return w2a1Var;
            case 27:
                ((vc80) obj).f240072a = new of5((frb) obj3, (kqi0) obj2, fbkVar, 19);
                return w2a1Var;
            case 28:
                ada adaVar = (ada) obj;
                if (adaVar instanceof zca) {
                    if (!((boolean[]) obj3)[0]) {
                        d97 d97Var = (d97) obj2;
                        kv91 kv91Var = (kv91) d97Var.f46706b;
                        j8g0 j8g0Var = (j8g0) d97Var.f46707c;
                        j8g0Var.getClass();
                        yt91 yt91VarM96903c = j8g0Var.f109936b.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("dismiss", null, null, null, null));
                        yt91VarM96903c.f276056j = false;
                        kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                    }
                } else if (!adaVar.equals(yca.f271432a) && !adaVar.equals(xca.f260173a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1Var;
            default:
                ((nub) obj3).f158552b.m61893B((yyx0) obj, (kpe0) obj2);
                return w2a1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn8(sk9 sk9Var, gh00 gh00Var) {
        super(1);
        this.f39913a = 8;
        this.f39915c = sk9Var;
        this.f39914b = gh00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cn8(gh00 gh00Var, g3b g3bVar) {
        super(1);
        this.f39913a = 23;
        this.f39914b = (qe70) gh00Var;
        this.f39915c = g3bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cn8(gh00 gh00Var, tn61 tn61Var) {
        super(1);
        this.f39913a = 1;
        this.f39914b = (qe70) gh00Var;
        this.f39915c = tn61Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cn8(th00 th00Var, th00 th00Var2) {
        super(1);
        this.f39913a = 3;
        this.f39914b = (mb61) th00Var;
        this.f39915c = (qe70) th00Var2;
    }
}
