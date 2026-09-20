package p204p;

import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class ouu0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f170356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ b121 f170357b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Consumer f170358c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ouu0(b121 b121Var, Consumer consumer, int i) {
        super(0);
        this.f170356a = i;
        this.f170357b = b121Var;
        this.f170358c = consumer;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f170356a) {
            case 0:
                String str = xoc1.f263941M6.f243453a;
                b121 b121Var = this.f170357b;
                kv91 kv91Var = b121Var.f22186a;
                gpg0 gpg0Var = b121Var.f22187b;
                gpg0Var.getClass();
                yt91 yt91VarM96903c = gpg0Var.f83186a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("continue_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                dv91 dv91Var = new dv91("hit", 1);
                String string = str.toString();
                if (string == null) {
                    string = "";
                }
                kv91Var.mo57452p(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()));
                this.f170358c.accept(mxw.f148208a);
                break;
            default:
                b121 b121Var2 = this.f170357b;
                kv91 kv91Var2 = b121Var2.f22186a;
                gpg0 gpg0Var2 = b121Var2.f22187b;
                gpg0Var2.getClass();
                yt91 yt91VarM96903c2 = gpg0Var2.f83186a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var2.mo57452p(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()));
                this.f170358c.accept(pww.f182147a);
                break;
        }
        return w2a1.f247311a;
    }
}
