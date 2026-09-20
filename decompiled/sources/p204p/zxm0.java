package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class zxm0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f287351a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ rs51 f287352b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f287353c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gh00 f287354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zxm0(rs51 rs51Var, String str, gh00 gh00Var, int i) {
        super(0);
        this.f287351a = i;
        this.f287352b = rs51Var;
        this.f287353c = str;
        this.f287354d = gh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f287351a) {
            case 0:
                voc1 voc1VarM70998s = ptl.m70998s("spotify:internal:parental-control:login-choice:", this.f287353c, xoc1.f264151o0);
                rs51 rs51Var = this.f287352b;
                kv91 kv91Var = (kv91) rs51Var.f202186c.getValue();
                yt91 yt91VarM96903c = rs51Var.f202185b.f104499b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("login_options_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                String str = voc1VarM70998s.f243453a;
                dv91 dv91Var = new dv91("hit", 1);
                String string = str != null ? str.toString() : null;
                if (string == null) {
                    string = "";
                }
                this.f287354d.invoke(new pym0(kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null)));
                break;
            default:
                voc1 voc1VarM70998s2 = ptl.m70998s("spotify:internal:managed-account-details:child:", this.f287353c, xoc1.f263938M3);
                rs51 rs51Var2 = this.f287352b;
                kv91 kv91Var2 = (kv91) rs51Var2.f202186c.getValue();
                yt91 yt91VarM96903c2 = rs51Var2.f202185b.f104499b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                String str2 = voc1VarM70998s2.f243453a;
                dv91 dv91Var2 = new dv91("hit", 1);
                String string2 = str2 != null ? str2.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                this.f287354d.invoke(new nym0(kv91Var2.mo57453r(new av91("", "", dv91Var2, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string2)), zt91VarM94607a2, st91.f213865b, System.currentTimeMillis()), null)));
                break;
        }
        return w2a1.f247311a;
    }
}
