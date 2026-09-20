package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class exa0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63725a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ da80 f63726b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f63727c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ axa0 f63728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exa0(da80 da80Var, gh00 gh00Var, axa0 axa0Var) {
        super(0);
        this.f63726b = da80Var;
        this.f63727c = gh00Var;
        this.f63728d = axa0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f63725a) {
            case 0:
                axa0 axa0Var = this.f63728d;
                if (axa0Var.f20824f == 1) {
                    da80 da80Var = this.f63726b;
                    kv91 kv91Var = (kv91) ((wg61) da80Var.f46998d).getValue();
                    lpg0 lpg0Var = (lpg0) ((wg61) da80Var.f46999e).getValue();
                    lpg0Var.getClass();
                    yt91 yt91VarM96903c = lpg0Var.f135764b.m96903c();
                    yt91VarM96903c.f276055i.add(new bu91("login_current_device_button", null, null, null, null));
                    yt91VarM96903c.f276056j = false;
                    this.f63727c.invoke(new vwa0(axa0Var.f20819a, axa0Var.f20820b, kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("login", 1, nau.f152117a), yt91VarM96903c.m94607a(), lpg0Var.f135763a, System.currentTimeMillis()), null).f46380a.f279709a));
                }
                break;
            default:
                da80 da80Var2 = this.f63726b;
                kv91 kv91Var2 = (kv91) ((wg61) da80Var2.f46998d).getValue();
                yt91 yt91VarM96903c2 = ((ipg0) da80Var2.f46997c).f104499b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("error_view", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                yt91 yt91VarM96903c3 = yt91VarM96903c2.m94607a().m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("retry_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                String str = kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("login", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null).f46380a.f279709a;
                axa0 axa0Var2 = this.f63728d;
                this.f63727c.invoke(new twa0(axa0Var2.f20819a, axa0Var2.f20820b, str));
                break;
        }
        return w2a1.f247311a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public exa0(axa0 axa0Var, da80 da80Var, gh00 gh00Var) {
        super(0);
        this.f63728d = axa0Var;
        this.f63726b = da80Var;
        this.f63727c = gh00Var;
    }
}
