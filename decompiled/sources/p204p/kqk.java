package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kqk extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f125322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zqk f125323b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ gh00 f125324c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kqk(zqk zqkVar, gh00 gh00Var, int i) {
        super(0);
        this.f125322a = i;
        this.f125323b = zqkVar;
        this.f125324c = gh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f125322a) {
            case 0:
                zqk zqkVar = this.f125323b;
                kv91 kv91Var = (kv91) zqkVar.f285415c.getValue();
                yt91 yt91VarM96903c = zqkVar.f285414b.f104499b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("error_view", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("try_again_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                this.f125324c.invoke(wqk.f254052a);
                break;
            default:
                zqk zqkVar2 = this.f125323b;
                kv91 kv91Var2 = (kv91) zqkVar2.f285415c.getValue();
                yt91 yt91VarM96903c3 = zqkVar2.f285414b.f104499b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("error_view", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                yt91 yt91VarM96903c4 = yt91VarM96903c3.m94607a().m96903c();
                yt91VarM96903c4.f276055i.add(new bu91("dismiss_button", null, null, null, null));
                yt91VarM96903c4.f276056j = false;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_navigate_back", 1, nau.f152117a), yt91VarM96903c4.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                this.f125324c.invoke(tqk.f222826a);
                break;
        }
        return w2a1.f247311a;
    }
}
