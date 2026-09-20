package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class f1k0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kv91 f64920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ qxg0 f64921c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ eh00 f64922d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1k0(kv91 kv91Var, qxg0 qxg0Var, eh00 eh00Var, int i) {
        super(0);
        this.f64919a = i;
        this.f64920b = kv91Var;
        this.f64921c = qxg0Var;
        this.f64922d = eh00Var;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f64919a) {
            case 0:
                qxg0 qxg0Var = this.f64921c;
                qxg0Var.getClass();
                yt91 yt91VarM96903c = qxg0Var.f193677a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("cancel_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                this.f64920b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                this.f64922d.invoke();
                break;
            case 1:
                qxg0 qxg0Var2 = this.f64921c;
                qxg0Var2.getClass();
                yt91 yt91VarM96903c2 = qxg0Var2.f193677a.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("settings_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                this.f64920b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("open_os_settings", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                this.f64922d.invoke();
                break;
            default:
                qxg0 qxg0Var3 = this.f64921c;
                qxg0Var3.getClass();
                yt91 yt91VarM96903c3 = qxg0Var3.f193677a.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("cancel_button", null, null, null, null));
                yt91VarM96903c3.f276056j = false;
                this.f64920b.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c3.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                this.f64922d.invoke();
                break;
        }
        return w2a1.f247311a;
    }
}
