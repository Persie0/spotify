package p204p;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class sk1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f209970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f209971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f209972c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f209973d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk1(Object obj, Object obj2, boolean z, int i) {
        super(0);
        this.f209970a = i;
        this.f209972c = obj;
        this.f209973d = obj2;
        this.f209971b = z;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        irb1 irb1Var;
        switch (this.f209970a) {
            case 0:
                gh00 gh00Var = (gh00) this.f209972c;
                if (this.f209971b) {
                    gh00Var.invoke(lk1.f134199a);
                } else {
                    ((kqi0) this.f209973d).setValue(Boolean.TRUE);
                    gh00Var.invoke(mk1.f144468a);
                }
                return w2a1.f247311a;
            case 1:
                m47 m47Var = (m47) this.f209972c;
                jcg0 jcg0Var = (jcg0) m47Var.f139857c;
                jcg0Var.getClass();
                yt91 yt91VarM96903c = jcg0Var.f111122b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("notes_toggle", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                boolean z = this.f209971b;
                nau nauVar = nau.f152117a;
                ((kv91) m47Var.f139856b).mo57453r(z ? new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nauVar), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
                ((eh00) this.f209973d).invoke();
                return w2a1.f247311a;
            case 2:
                ((gh00) this.f209972c).invoke(new rff(((wu71) this.f209973d).f255120c, this.f209971b));
                return w2a1.f247311a;
            case 3:
                return Boolean.valueOf(!this.f209971b && wj50.m88271j(((Map) ((kqi0) this.f209973d).getValue()).get(Integer.valueOf(((vum0) ((dxp) this.f209972c).f264315d.f99667c).m86437v())), Boolean.TRUE));
            case 4:
                return fkr0.m41929a((Context) this.f209972c, null, (e940) this.f209973d, this.f209971b, false);
            case 5:
                ((umn) this.f209972c).m83474l((pck) this.f209973d, this.f209971b);
                return w2a1.f247311a;
            case 6:
                if (this.f209971b) {
                    ((f9y0) this.f209972c).m41112e((String) this.f209973d);
                }
                return w2a1.f247311a;
            case 7:
                whp whpVar = (whp) ((kkx0) this.f209973d).f123727c;
                kv91 kv91Var = (kv91) whpVar.f251419b;
                yt91 yt91VarM96903c2 = ((xlg0) whpVar.f251421d).f263144b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("navigation_bar", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("cancel_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c3.m94607a();
                boolean z2 = this.f209971b;
                nau nauVar2 = nau.f152117a;
                kv91Var.mo57453r(z2 ? new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nauVar2), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()) : new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nauVar2), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()), null);
                ((gh00) this.f209972c).invoke(ozs.f172352a);
                return w2a1.f247311a;
            case 8:
                i4z i4zVar = (i4z) this.f209973d;
                gh00 gh00Var2 = (gh00) this.f209972c;
                if (this.f209971b) {
                    gh00Var2.invoke(new d4z(i4zVar));
                } else {
                    gh00Var2.invoke(new e4z(i4zVar));
                }
                return w2a1.f247311a;
            case 9:
                x610 x610Var = (x610) this.f209973d;
                kv91 kv91Var2 = (kv91) ((e0n) x610Var.f258557b).get();
                yt91 yt91VarM96903c4 = ((xlg0) x610Var.f258558c).f263144b.m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("privacy_policy_toggle", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_element_toggle", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                ((gh00) this.f209972c).invoke(Boolean.valueOf(!this.f209971b));
                return w2a1.f247311a;
            case 10:
                String str = ((v330) this.f209973d).f236758c;
                gh00 gh00Var3 = (gh00) this.f209972c;
                if (this.f209971b) {
                    gh00Var3.invoke(new q330(str));
                } else {
                    gh00Var3.invoke(new r330(str));
                }
                return w2a1.f247311a;
            case 11:
                String str2 = ((w330) this.f209973d).f247467c;
                gh00 gh00Var4 = (gh00) this.f209972c;
                if (this.f209971b) {
                    gh00Var4.invoke(new s330(str2));
                } else {
                    gh00Var4.invoke(new t330(str2));
                }
                return w2a1.f247311a;
            case 12:
                o971 o971Var = (o971) this.f209973d;
                if (!wl51.m88460J0(o971Var.f162953a.f107641b) && !this.f209971b) {
                    ((gh00) this.f209972c).invoke(o971Var.f162953a.f107641b);
                }
                return w2a1.f247311a;
            case 13:
                gh00 gh00Var5 = (gh00) this.f209972c;
                wf80 wf80Var = (wf80) this.f209973d;
                if (this.f209971b) {
                    gh00Var5.invoke(new sf80(wf80Var));
                } else {
                    gh00Var5.invoke(new tf80(wf80Var));
                }
                return w2a1.f247311a;
            case 14:
                if (!this.f209971b) {
                    ((gb31) this.f209972c).remove((o3j0) this.f209973d);
                }
                return w2a1.f247311a;
            case 15:
                if (this.f209971b) {
                    ((ConnectivityManager) ((wg61) ((y0i0) this.f209972c).f267989b).getValue()).unregisterNetworkCallback((bij0) this.f209973d);
                }
                return w2a1.f247311a;
            case 16:
                xre xreVar = (xre) this.f209973d;
                cg21 cg21Var = (cg21) this.f209972c;
                if (this.f209971b) {
                    return Long.valueOf(n5h1.m63735k(cg21Var, xreVar != null ? Long.valueOf(System.currentTimeMillis()) : null));
                }
                Long lValueOf = xreVar != null ? Long.valueOf(System.currentTimeMillis()) : null;
                k7i0 k7i0Var = cg21Var.f37537a;
                if (k7i0Var == null) {
                    return null;
                }
                i7i0 i7i0Var = k7i0Var.f120139e;
                return Long.valueOf(n5h1.m63735k(cg21Var, lValueOf) + (i7i0Var != null ? i7i0Var.f99567a.longValue() : 0L));
            case 17:
                if (this.f209971b) {
                    ((ado0) ((jc20) this.f209973d)).m25615a(0);
                    ((gh00) this.f209972c).invoke(cju0.f38689a);
                }
                return w2a1.f247311a;
            case 18:
                return Boolean.valueOf(((mv31) this.f209972c).m62893n().getBoolean(((fv31) this.f209973d).f73630a, this.f209971b));
            case 19:
                return Boolean.valueOf(((SharedPreferences) this.f209972c).getBoolean((String) this.f209973d, this.f209971b));
            case 20:
                return Boolean.valueOf(!this.f209971b && ((Number) ((rv41) this.f209972c).getValue()).floatValue() == 0.0f && ((Number) ((kqi0) this.f209973d).getValue()).intValue() > 0);
            case 21:
                gh00 gh00Var6 = (gh00) this.f209972c;
                if (this.f209971b) {
                    irb1Var = irb1.f104945c;
                } else {
                    irb1Var = ((krb1) this.f209973d).f125605a ? irb1.f104943a : irb1.f104944b;
                }
                gh00Var6.invoke(irb1Var);
                return w2a1.f247311a;
            default:
                kxb1 kxb1Var = (kxb1) this.f209972c;
                cxb1 cxb1Var = (cxb1) ((dxb1) this.f209973d);
                kxb1Var.m57591b(cxb1Var.f42976b, cxb1Var.f42975a, cxb1Var.f42977c, this.f209971b);
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk1(Object obj, boolean z, Object obj2, int i) {
        super(0);
        this.f209970a = i;
        this.f209972c = obj;
        this.f209971b = z;
        this.f209973d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk1(Object obj, boolean z, gh00 gh00Var, int i) {
        super(0);
        this.f209970a = i;
        this.f209973d = obj;
        this.f209971b = z;
        this.f209972c = gh00Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk1(x610 x610Var, gh00 gh00Var, boolean z) {
        super(0);
        this.f209970a = 9;
        this.f209973d = x610Var;
        this.f209972c = gh00Var;
        this.f209971b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk1(boolean z, Object obj, Object obj2, int i) {
        super(0);
        this.f209970a = i;
        this.f209971b = z;
        this.f209972c = obj;
        this.f209973d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk1(boolean z, jc20 jc20Var, gh00 gh00Var) {
        super(0);
        this.f209970a = 17;
        this.f209971b = z;
        this.f209973d = jc20Var;
        this.f209972c = gh00Var;
    }
}
