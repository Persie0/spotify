package p204p;

import com.spotify.mobius.functions.Consumer;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class b7t extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f24379a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Consumer f24380b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c7t f24381c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7t(Consumer consumer, c7t c7tVar, int i) {
        super(1);
        this.f24379a = i;
        this.f24380b = consumer;
        this.f24381c = c7tVar;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        switch (this.f24379a) {
            case 0:
                g6t g6tVar = (g6t) obj;
                if (g6tVar instanceof f6t) {
                    this.f24380b.accept(new z4t(((f6t) g6tVar).f66499a));
                } else if (g6tVar instanceof d6t) {
                    u5t u5tVar = this.f24381c.f35010e;
                    kv91 kv91Var = u5tVar.f227105a;
                    xug0 xug0Var = u5tVar.f227106b;
                    xug0Var.getClass();
                    yt91 yt91VarM96903c = xug0Var.f266109b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("user_displayname_text", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                    yt91VarM96903c2.f276055i.add(new bu91("user_clear_displayname_button", null, null, null, null));
                    yt91VarM96903c2.f276056j = false;
                    String str = kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("text_clear", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                } else if (!(g6tVar instanceof e6t)) {
                    throw new NoWhenBranchMatchedException();
                }
                return w2a1.f247311a;
            default:
                this.f24380b.accept(t4t.f217070a);
                u5t u5tVar2 = this.f24381c.f35010e;
                kv91 kv91Var2 = u5tVar2.f227105a;
                xug0 xug0Var2 = u5tVar2.f227106b;
                xug0Var2.getClass();
                yt91 yt91VarM96903c3 = xug0Var2.f266109b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("change_photo_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                String str2 = kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                return w2a1.f247311a;
        }
    }
}
