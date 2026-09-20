package p204p;

import android.graphics.RectF;
import android.widget.TextView;
import com.spotify.casita.p040v1.resolved.ResolvedHome;
import com.spotify.encoreconsumermobile.elements.find.FindInContextView;
import com.spotify.encoreconsumermobile.layout.headers.BehaviorRetainingAppBarLayout;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class p200 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f173202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f173203b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f173204c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p200(int i, Object obj, Object obj2) {
        super(0);
        this.f173202a = i;
        this.f173203b = obj;
        this.f173204c = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v109, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v114, types: [p.gh00, p.qe70] */
    /* JADX WARN: Type inference failed for: r0v23, types: [p.eh00, p.ri00] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.util.List] */
    @Override // p204p.eh00
    public final Object invoke() {
        String strConcat;
        switch (this.f173202a) {
            case 0:
                if (!((q200) this.f173203b).f184445c) {
                    whr0.f251426i.f251432f.mo31986a((r200) this.f173204c);
                }
                return w2a1.f247311a;
            case 1:
                zxi0 zxi0Var = (zxi0) this.f173203b;
                i500 i500Var = (i500) this.f173204c;
                for (uxi0 uxi0Var : (Iterable) zxi0Var.f287332f.f158717a.getValue()) {
                    if (u700.m82478n()) {
                        Objects.toString(uxi0Var);
                        Objects.toString(i500Var);
                    }
                    zxi0Var.m97201b(uxi0Var);
                }
                return w2a1.f247311a;
            case 2:
                return new cjc0((dut) ((le00) this.f173203b).f132415a.invoke((q2c) this.f173204c), a200.f11536a1);
            case 3:
                ((gk10) this.f173203b).f80672c.m95285c((vn80) this.f173204c);
                return w2a1.f247311a;
            case 4:
                zm10 zm10Var = (zm10) this.f173203b;
                tm10 tm10Var = (tm10) this.f173204c;
                zm10Var.f284126i = tm10Var;
                di41 di41Var = zm10Var.f284127t;
                fbk fbkVar = null;
                if (di41Var != null) {
                    di41Var.mo26601e(null);
                }
                zm10Var.f284127t = x0h1.m89578u(zm10Var.f284124g, null, 0, new dbz(zm10Var, fbkVar, 20), 3);
                fuf fufVar = zm10Var.f284125h;
                if (fufVar != null) {
                    if (!fufVar.isActive()) {
                        fufVar = null;
                    }
                    if (fufVar != null) {
                        ((guf) fufVar).m38797k0(tm10Var);
                    }
                }
                zm10Var.f284125h = null;
                return w2a1.f247311a;
            case 5:
                ((ri00) this.f173203b).invoke();
                ((eh00) this.f173204c).invoke();
                return w2a1.f247311a;
            case 6:
                po10 po10Var = (po10) this.f173203b;
                kv91 kv91Var = (kv91) ((e0n) po10Var.f179559b).get();
                yt91 yt91VarM96903c = ((xlg0) po10Var.f179560c).f263144b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("ok_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                ((gh00) this.f173204c).invoke(iww.f106523d);
                return w2a1.f247311a;
            case 7:
                m600 m600Var = (m600) this.f173203b;
                kv91 kv91Var2 = (kv91) ((e0n) m600Var.f140329b).get();
                yt91 yt91VarM96903c2 = ((xlg0) m600Var.f140330c).f263144b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("next_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                String str = xoc1.f264028Y3.f243453a;
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                ((gh00) this.f173204c).invoke(new kxw(kv91Var2.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null)));
                return w2a1.f247311a;
            case 8:
                ((gh00) this.f173203b).invoke(((lfe0) this.f173204c).f132932c);
                return w2a1.f247311a;
            case 9:
                ((gh00) this.f173203b).invoke(((g8e0) this.f173204c).f77468b);
                return w2a1.f247311a;
            case 10:
                return ((p7o) this.f173203b).m69286e((String) this.f173204c).map(iaz.f100395e).map(jaz.f110594e).onErrorComplete();
            case 11:
                String str2 = (String) this.f173203b;
                if (str2 == null || (strConcat = " - ".concat(str2)) == null) {
                    strConcat = "";
                }
                return s571.m77250i((String) ((rv41) this.f173204c).getValue(), strConcat);
            case 12:
                yw70 yw70Var = (yw70) this.f173203b;
                tw70 tw70Var = (tw70) g6f.m43745s0(yw70Var.m94779h().f214605k);
                return new m390(((c581) this.f173204c).f34107c.m84031v(), ((vum0) yw70Var.f276892e.f191125c).m86437v() == 0 && wj50.m88271j(tw70Var != null ? tw70Var.f224336l : null, "list_ux_platform_header"));
            case 13:
                u12 u12Var = (u12) this.f173203b;
                ((BehaviorRetainingAppBarLayout) u12Var.f225648b).clearFocus();
                dky0 dky0Var = ((BehaviorRetainingAppBarLayout) u12Var.f225648b).f3778T0;
                if (dky0Var != null) {
                    dky0Var.f50067p = false;
                }
                FindInContextView findInContextView = (FindInContextView) u12Var.f225655i;
                findInContextView.setVisibility(8);
                ((TextView) u12Var.f225646Y).setVisibility(0);
                k0e1.m54966A(findInContextView.f3658S0);
                ((tnp) this.f173204c).invoke();
                return w2a1.f247311a;
            case 14:
                ((bo20) this.f173203b).f28989b.mo47346g((String) this.f173204c);
                return w2a1.f247311a;
            case 15:
                ((n430) ((pyu) this.f173203b).f183520b).mo47346g((String) this.f173204c);
                return w2a1.f247311a;
            case 16:
                if (((ro20) this.f173203b).f201052d != null) {
                    ((gh00) this.f173204c).invoke(oo20.f167451a);
                }
                return w2a1.f247311a;
            case 17:
                ((qe70) ((rls0) this.f173203b).f200364f).invoke((hy31) this.f173204c);
                return w2a1.f247311a;
            case 18:
                ((qe70) ((rls0) this.f173203b).f200364f).invoke((cp3) this.f173204c);
                return w2a1.f247311a;
            case 19:
                ((gh00) this.f173203b).invoke(new dt20(((qt20) this.f173204c).f192261b.f105405h.f94586a));
                return w2a1.f247311a;
            case 20:
                ((gh00) this.f173203b).invoke((rsu0) this.f173204c);
                return w2a1.f247311a;
            case 21:
                ((d030) this.f173203b).m34515d((exh0) this.f173204c);
                return w2a1.f247311a;
            case 22:
                ((peu) this.f173203b).f176849b.invoke();
                ((kqi0) this.f173204c).setValue(Boolean.TRUE);
                return w2a1.f247311a;
            case 23:
                return kpg1.m57051x(((ResolvedHome) this.f173203b).m5768p().m5618p(), (bqx) this.f173204c);
            case 24:
                x0h1.m89578u((xuk) this.f173203b, null, 0, new joz((dw4) this.f173204c, (fbk) null, 24), 3);
                return w2a1.f247311a;
            case 25:
                a540 a540Var = (a540) this.f173203b;
                if (a540Var.f12426h) {
                    ((y8q) ((wa30) this.f173204c).f249354c).m93123a(a540Var.f12420b, a540Var.f12421c);
                }
                return w2a1.f247311a;
            case 26:
                ((gh00) this.f173203b).invoke(((a540) this.f173204c).f12427i);
                return w2a1.f247311a;
            case 27:
                da40 da40Var = (da40) this.f173203b;
                kv91 kv91Var3 = da40Var.f46971a;
                ipg0 ipg0Var = da40Var.f46972b;
                ipg0Var.getClass();
                yt91 yt91VarM96903c3 = ipg0Var.f104499b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("back", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                kv91Var3.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                l7l.m58437r((rmm0) this.f173204c);
                return w2a1.f247311a;
            case 28:
                ((gh00) this.f173203b).invoke(new na40((RectF) ((rlv0) this.f173204c).f200373a));
                return w2a1.f247311a;
            default:
                ((gh00) this.f173203b).invoke(zd40.f281625a);
                ((ee40) this.f173204c).f58671a.invoke();
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p200(eh00 eh00Var, eh00 eh00Var2) {
        super(0);
        this.f173202a = 5;
        this.f173203b = (ri00) eh00Var;
        this.f173204c = eh00Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p200(uxi0 uxi0Var, zxi0 zxi0Var, u700 u700Var, i500 i500Var) {
        super(0);
        this.f173202a = 1;
        this.f173203b = zxi0Var;
        this.f173204c = i500Var;
    }
}
