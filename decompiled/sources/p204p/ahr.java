package p204p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class ahr extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f15755a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f15756b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f15757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ahr(int i, Object obj, Object obj2) {
        super(0);
        this.f15755a = i;
        this.f15756b = obj;
        this.f15757c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:111:0x0323  */
    /* JADX WARN: Code duplicated, block: B:112:0x0325  */
    /* JADX WARN: Code duplicated, block: B:115:0x032c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x032e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0334  */
    /* JADX WARN: Code duplicated, block: B:119:0x033a  */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Iterable, java.lang.Object] */
    @Override // p204p.eh00
    public final Object invoke() {
        float fM41028i;
        Object objM43700N0;
        long j;
        int i;
        int iM38547C;
        lnn0 lnn0Var;
        boolean zM52026a;
        noa1 noa1Var;
        noa1 noa1Var2;
        switch (this.f15755a) {
            case 0:
                ((hhr) this.f15756b).mo25260i((uxi0) this.f15757c, false);
                return w2a1.f247311a;
            case 1:
                ((cir) this.f15756b).f38425f.onNext((r521) this.f15757c);
                return w2a1.f247311a;
            case 2:
                ((f7x0) this.f15756b).mo29825e((c7x0) this.f15757c);
                return w2a1.f247311a;
            case 3:
                dzr dzrVar = (dzr) this.f15756b;
                ((gh00) this.f15757c).invoke(x821.f259034a);
                tzr tzrVar = (tzr) dzrVar.f54727q.getValue();
                synchronized (tzrVar) {
                    if (!((Boolean) tzrVar.f225289b.getValue()).booleanValue()) {
                        zv41 zv41Var = tzrVar.f225289b;
                        Boolean bool = Boolean.TRUE;
                        zv41Var.getClass();
                        zv41Var.m97091m(null, bool);
                        dzrVar.f54724n.m61519a();
                        k5m0.m55541i(dzrVar.f54722l, xoc1.f264211v4.f243453a, null, null, true, 6);
                    }
                }
                return w2a1.f247311a;
            case 4:
                x9s x9sVar = (x9s) this.f15756b;
                f8b0 f8b0Var = (f8b0) this.f15757c;
                if (wj50.m88271j(x9sVar, n9s.f151855a) || wj50.m88271j(x9sVar, p9s.f175296a) || wj50.m88271j(x9sVar, q9s.f186659a) || wj50.m88271j(x9sVar, t9s.f218351a)) {
                    fM41028i = 0.0f;
                } else if (x9sVar instanceof s9s) {
                    Float f = ((s9s) x9sVar).f207059a;
                    fM41028i = f != null ? f.floatValue() : f8b0Var.m41028i();
                } else if (wj50.m88271j(x9sVar, v9s.f239026a)) {
                    fM41028i = f8b0Var.m41028i();
                } else {
                    if (!wj50.m88271j(x9sVar, u9s.f228263a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    fM41028i = 0.0f;
                }
                return Float.valueOf(fM41028i);
            case 5:
                a77 a77Var = (a77) this.f15757c;
                eh00 eh00Var = (eh00) this.f15756b;
                if (eh00Var != null) {
                    g631 g631Var = (g631) eh00Var.invoke();
                    q831 q831Var = a77Var.f12975b;
                    q831 q831Var2 = a77Var.f12975b;
                    if (q831Var.m72301f()) {
                        q831Var2.m72305j(g631Var);
                    } else {
                        q831Var2.m72307m(g631Var);
                    }
                }
                return w2a1.f247311a;
            case 6:
                if (((ood0) ((cfp) this.f15756b).f37417g) != null) {
                    ood0.m67482u((ViewGroup) this.f15757c);
                }
                return w2a1.f247311a;
            case 7:
                hzd0 hzd0Var = (hzd0) this.f15756b;
                ArrayList arrayList = (ArrayList) this.f15757c;
                if (arrayList.isEmpty()) {
                    objM43700N0 = lau.f131415a;
                } else {
                    List listM43714b1 = g6f.m43714b1(arrayList, 1);
                    List listM43729k0 = g6f.m43729k0(arrayList, 1);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listM43729k0) {
                        qdm qdmVar = (qdm) obj;
                        if (!((sp80) ((xp80) qdmVar.f187713c).f264538k.f158717a.getValue()).f212769b.isEmpty() && ((v3a0) ((xp80) qdmVar.f187713c).f264537j.f158717a.getValue()).mo60646h()) {
                            arrayList2.add(obj);
                        }
                    }
                    objM43700N0 = g6f.m43700N0(arrayList2, listM43714b1);
                }
                hzd0Var.mo33104m(objM43700N0);
                return w2a1.f247311a;
            case 8:
                ((ago) this.f15756b).m25876m((xos) this.f15757c);
                return w2a1.f247311a;
            case 9:
                ((gh00) this.f15756b).invoke((cg9) this.f15757c);
                return w2a1.f247311a;
            case 10:
                whp whpVar = (whp) ((bzo) this.f15756b).f32543b;
                kv91 kv91Var = (kv91) whpVar.f251419b;
                zm8 zm8Var = (zm8) whpVar.f251421d;
                yt91 yt91VarM96903c = zm8Var.f284180c.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("cover_art", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                String strM27258a = avs.m27258a((String) whpVar.f251420c);
                dv91 dv91Var = new dv91("hit", 1);
                String string = strM27258a.toString();
                if (string == null) {
                    string = "";
                }
                ((gh00) this.f15757c).invoke(new yzs(kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, zm8Var.f284179b, System.currentTimeMillis()), null)));
                return w2a1.f247311a;
            case 11:
                kqi0 kqi0Var = (kqi0) this.f15757c;
                Boolean bool2 = Boolean.FALSE;
                kqi0Var.setValue(bool2);
                coz0 coz0Var = ((wvs) this.f15756b).f255582b;
                zv41 zv41Var2 = coz0Var.f40374c;
                zv41Var2.getClass();
                zv41Var2.m97091m(null, bool2);
                coz0Var.m33512a();
                return w2a1.f247311a;
            case 12:
                g2q g2qVar = ((c2t) this.f15756b).f33464a;
                kv91 kv91Var2 = (kv91) g2qVar.f75987b;
                yt91 yt91VarM96903c2 = ((xlg0) g2qVar.f75988c).f263144b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("remove_from_profile_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("toggle_state", 1, kkc0.m56695h0(new pqm0("state_before_toggle", "visible_on_profile"), new pqm0("state_after_toggle", "not_visible_on_profile"))), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                ((gh00) this.f15757c).invoke(n2t.f149830a);
                return w2a1.f247311a;
            case 13:
                gh00 gh00Var = (gh00) this.f15756b;
                ?? r2 = ((o9t) ((q9t) this.f15757c)).f163130a;
                ArrayList arrayList3 = new ArrayList(i6f.m49804T(r2, 10));
                Iterator it = r2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((dil) it.next()).f49410b);
                }
                gh00Var.invoke(new t9t(arrayList3));
                return w2a1.f247311a;
            case 14:
                return new tst(new ugy0((ygy0) this.f15757c, new mgi(1, 13), (gh00) null, new tys(2, 1), (eh00) null, new fts((vst) ((i4t0) this.f15756b).get(), 4), 84));
            case 15:
                gh00 gh00Var2 = (gh00) this.f15757c;
                pzt pztVar = (pzt) this.f15756b;
                xre xreVar = pztVar.f183800d;
                long j2 = pztVar.f183801e;
                if (j2 > 0) {
                    ((wy3) xreVar).getClass();
                    if (System.currentTimeMillis() >= j2) {
                        gh00Var2.invoke(new yta0(wta0.f254901a));
                    } else {
                        nps npsVar = pztVar.f183799c;
                        kv91 kv91Var3 = (kv91) npsVar.f157063b;
                        xlg0 xlg0Var = (xlg0) npsVar.f157064c;
                        xlg0Var.getClass();
                        yt91 yt91VarM96903c3 = xlg0Var.f263144b.m96903c();
                        yt91VarM96903c3.f276055i.add(new bu91("resend_code_button", null, null, null, null));
                        yt91VarM96903c3.f276056j = false;
                        kv91Var3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                        pztVar.m71789h(new sbq0("email_otp", "resend_email_otp", n850.f151357c, null));
                        j = pztVar.f183802f;
                        ((wy3) xreVar).getClass();
                        if (j > System.currentTimeMillis()) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        iM38547C = edb.m38547C(i);
                        if (iM38547C != 0) {
                            gh00Var2.invoke(new yta0(vta0.f244594a));
                        } else {
                            if (iM38547C == 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            pztVar.m71788g(fzt.f75180a);
                        }
                    }
                } else {
                    nps npsVar2 = pztVar.f183799c;
                    kv91 kv91Var4 = (kv91) npsVar2.f157063b;
                    xlg0 xlg0Var2 = (xlg0) npsVar2.f157064c;
                    xlg0Var2.getClass();
                    yt91 yt91VarM96903c4 = xlg0Var2.f263144b.m96903c();
                    yt91VarM96903c4.f276055i.add(new bu91("resend_code_button", null, null, null, null));
                    yt91VarM96903c4.f276056j = false;
                    kv91Var4.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                    pztVar.m71789h(new sbq0("email_otp", "resend_email_otp", n850.f151357c, null));
                    j = pztVar.f183802f;
                    ((wy3) xreVar).getClass();
                    if (j > System.currentTimeMillis()) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    iM38547C = edb.m38547C(i);
                    if (iM38547C != 0) {
                        gh00Var2.invoke(new yta0(vta0.f244594a));
                    } else {
                        if (iM38547C == 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        pztVar.m71788g(fzt.f75180a);
                    }
                }
                return w2a1.f247311a;
            case 16:
                ((kqi0) this.f15757c).setValue(Boolean.FALSE);
                g1u g1uVar = (g1u) this.f15756b;
                ubq0 ubq0Var = g1uVar.f75724S1;
                Map map = null;
                if (ubq0Var == null) {
                    wj50.m88260d0("preAuthUbiTracker");
                    throw null;
                }
                ubq0Var.mo59114a(new qbq0("email_method_picker", 4, map, "dialog_dismissed"));
                g1uVar.m83052i1(false, false);
                return w2a1.f247311a;
            case 17:
                ((CopyOnWriteArraySet) ((q6u) this.f15756b).f185925b).remove((iz1) this.f15757c);
                return w2a1.f247311a;
            case 18:
                wiu wiuVar = (wiu) ((slv0) this.f15756b).f210497a;
                if (wiuVar == null || ((Boolean) wiuVar.invoke(yf11.f272099a)).booleanValue()) {
                    ((fgu) this.f15757c).m41614a();
                }
                return w2a1.f247311a;
            case 19:
                hku hkuVar = (hku) this.f15756b;
                if (hkuVar.f92527e) {
                    ((fku) this.f15757c).f70623b.f176849b.invoke();
                    hkuVar.m47853a();
                }
                return w2a1.f247311a;
            case 20:
                h2v h2vVar = (h2v) this.f15756b;
                return h2vVar.f87067b.m23343X(new g2v((tsb) this.f15757c, 0)).m23331J(new k9u(h2vVar, 1));
            case 21:
                ((gh00) this.f15756b).invoke((t4v) this.f15757c);
                return w2a1.f247311a;
            case 22:
                ((gh00) this.f15756b).invoke((c6v) this.f15757c);
                return w2a1.f247311a;
            case 23:
                ((gh00) this.f15756b).invoke(new ynv(((cov) this.f15757c).f40345a));
                return w2a1.f247311a;
            case 24:
                quv quvVar = (quv) this.f15756b;
                b93 b93Var = quvVar.f192823g;
                qho qhoVarM25241r = aag1.m25241r((pgo) this.f15757c, quvVar.f192826j, quvVar.f192818b);
                oho ohoVar = qhoVarM25241r instanceof oho ? (oho) qhoVarM25241r : null;
                return b93Var.m28443a(ohoVar != null ? (hz80) ohoVar.f165512a : null);
            case 25:
                return new cjc0((dut) ((ewv) this.f15756b).f63607a.invoke((q2c) this.f15757c), kuv.f126692T0);
            case 26:
                h3n h3nVar = (h3n) this.f15756b;
                return ((p7o) ((skp) h3nVar.f87273b).f210178b).m69286e((String) h3nVar.f87274c).distinctUntilChanged().flatMap(let.f132700W0).distinctUntilChanged().onErrorReturn(e8f.f57174Z0).filter(ket.f121966b1).map(new zy5((so3) this.f15757c, 10));
            case 27:
                z6w z6wVar = (z6w) this.f15756b;
                pyu pyuVar = z6wVar.f280005i;
                qho qhoVarM25241r2 = aag1.m25241r((pgo) this.f15757c, z6wVar.f280008l, z6wVar.f279999c);
                oho ohoVar2 = qhoVarM25241r2 instanceof oho ? (oho) qhoVarM25241r2 : null;
                hz80 hz80Var = ohoVar2 != null ? (hz80) ohoVar2.f165512a : null;
                la80 la80Var = (la80) pyuVar.f183521c;
                boolean z = !(la80Var == la80.f131301c || la80Var == la80.f131300b || la80Var == la80.f131304f);
                uhw0 shw0Var = (hz80Var == null || (noa1Var2 = hz80Var.f96834t) == null || !noa1Var2.f156638b) ? thw0.f220511a : new shw0((String) pyuVar.f183520b);
                Boolean bool3 = ((nr50) pyuVar.f183523e).f157448b;
                if (bool3 != null) {
                    zM52026a = bool3.booleanValue();
                } else {
                    izj izjVar = (izj) pyuVar.f183522d;
                    String str = hz80Var != null ? hz80Var.f96829e : null;
                    if (hz80Var == null || (lnn0Var = hz80Var.f96833i) == null) {
                        lnn0Var = lnn0.f135183b;
                    }
                    zM52026a = izjVar.m52026a(str, lnn0Var);
                }
                return new x6w(z, (hz80Var == null || (noa1Var = hz80Var.f96834t) == null || !noa1Var.f156638b) ? false : true, zM52026a, shw0Var, 82);
            case 28:
                ViewGroup viewGroup = (ViewGroup) this.f15756b;
                View viewM25591c = adn.m25591c(viewGroup, R.layout.page_equalizer, viewGroup, false);
                int i2 = R.id.equalizer_picker;
                Space space = (Space) vie1.m85629k(viewM25591c, R.id.equalizer_picker);
                if (space != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewM25591c;
                    int i3 = R.id.header_shadow;
                    View viewM85629k = vie1.m85629k(viewM25591c, R.id.header_shadow);
                    if (viewM85629k != null) {
                        i3 = R.id.recycler_view;
                        RecyclerView recyclerView = (RecyclerView) vie1.m85629k(viewM25591c, R.id.recycler_view);
                        if (recyclerView != null) {
                            nam0 nam0Var = new nam0(constraintLayout, space, viewM85629k, recyclerView);
                            pyu pyuVar2 = (pyu) this.f15757c;
                            viewGroup.getContext();
                            recyclerView.setLayoutManager(new LinearLayoutManager(1));
                            recyclerView.setAdapter((zbw) pyuVar2.f183520b);
                            recyclerView.m1011i(new jkv0(viewGroup.getContext()));
                            p3h1.m69032r(recyclerView, acu.f14435L0);
                            return nam0Var;
                        }
                    }
                    i2 = i3;
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewM25591c.getResources().getResourceName(i2)));
            default:
                Space space2 = ((nam0) ((wg61) ((pyu) this.f15756b).f183521c).getValue()).f152099b;
                lgp lgpVar = new lgp(((eju) this.f15757c).f60301i.f38366a, 0);
                psg1.m70832H(space2, lgpVar.getView());
                lgpVar.getView().setPaddingRelative(space2.getPaddingStart(), space2.getPaddingTop(), space2.getPaddingEnd(), space2.getPaddingBottom());
                return lgpVar;
        }
    }
}
