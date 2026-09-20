package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uk50 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231223a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wk50 f231224b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xlg0 f231225c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uk50(wk50 wk50Var, xlg0 xlg0Var, int i) {
        super(0);
        this.f231223a = i;
        this.f231224b = wk50Var;
        this.f231225c = xlg0Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f231223a) {
            case 0:
                wk50 wk50Var = this.f231224b;
                kv91 kv91Var = wk50Var.f252136f;
                yt91 yt91VarM96903c = this.f231225c.f263144b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                wk50Var.f252132b.mo47345e();
                break;
            default:
                wk50 wk50Var2 = this.f231224b;
                kv91 kv91Var2 = wk50Var2.f252136f;
                yt91 yt91VarM96903c2 = this.f231225c.f263144b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("close_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                wk50Var2.f252132b.mo47345e();
                break;
        }
        return w2a1.f247311a;
    }
}
