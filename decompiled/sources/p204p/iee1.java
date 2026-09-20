package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class iee1 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f101393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h1l0 f101394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rjh0 f101395c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f101396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iee1(h1l0 h1l0Var, rjh0 rjh0Var, String str, int i) {
        super(0);
        this.f101393a = i;
        this.f101394b = h1l0Var;
        this.f101395c = rjh0Var;
        this.f101396d = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f101393a) {
            case 0:
                kv91 kv91Var = (kv91) this.f101394b.f86658d;
                rjh0 rjh0Var = this.f101395c;
                rjh0Var.getClass();
                yt91 yt91VarM96903c = rjh0Var.f199837b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("video_preview", this.f101396d, null, null, "loaded"));
                yt91VarM96903c.f276056j = true;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_element_toggle", 1, nau.f152117a), yt91VarM96903c.m94607a(), rjh0Var.f199836a, System.currentTimeMillis()), null);
                break;
            default:
                kv91 kv91Var2 = (kv91) this.f101394b.f86658d;
                rjh0 rjh0Var2 = this.f101395c;
                rjh0Var2.getClass();
                yt91 yt91VarM96903c2 = rjh0Var2.f199837b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("video_preview", this.f101396d, null, null, "error"));
                yt91VarM96903c2.f276056j = true;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c2.m94607a(), rjh0Var2.f199836a, System.currentTimeMillis()), null);
                break;
        }
        return w2a1.f247311a;
    }
}
