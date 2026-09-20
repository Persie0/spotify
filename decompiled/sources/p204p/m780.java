package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes6.dex */
public final class m780 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f140735a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ n780 f140736b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zhr f140737c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m780(zhr zhrVar, n780 n780Var) {
        super(0);
        this.f140737c = zhrVar;
        this.f140736b = n780Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f140735a) {
            case 0:
                n780 n780Var = this.f140736b;
                i780 i780Var = n780Var.f151103c;
                zhr zhrVar = this.f140737c;
                String str = zhrVar.f283005a;
                if (zhrVar.equals(rhr.f199321e)) {
                    iz1 iz1Var = n780Var.f151107g;
                    if (iz1Var == null) {
                        wj50.m88260d0("premiumUpsellListener");
                        throw null;
                    }
                    String str2 = o780.f162489a;
                    iz1Var.invoke(str2);
                    kv91 kv91Var = (kv91) i780Var.f99465b;
                    rng0 rng0Var = (rng0) i780Var.f99466c;
                    rng0Var.getClass();
                    yt91 yt91VarM96903c = rng0Var.f200910b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("error_dialog", null, null, null, str));
                    yt91VarM96903c.f276056j = true;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("navigate_to_premium_button", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    zt91 zt91VarM94607a = yt91VarM96903c2.m94607a();
                    dv91 dv91Var = new dv91("hit", 1);
                    String string = str2.toString();
                    if (string == null) {
                        string = "";
                    }
                    kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, rng0Var.f200909a, System.currentTimeMillis()), null);
                } else {
                    i780Var.m49851l(str);
                }
                n780Var.f151104d.invoke();
                return w2a1.f247311a;
            default:
                n780 n780Var2 = this.f140736b;
                n780Var2.f151103c.m49851l(this.f140737c.f283005a);
                n780Var2.f151104d.invoke();
                return w2a1.f247311a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m780(n780 n780Var, zhr zhrVar) {
        super(0);
        this.f140736b = n780Var;
        this.f140737c = zhrVar;
    }
}
