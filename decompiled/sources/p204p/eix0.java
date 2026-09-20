package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class eix0 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60053a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ aaq0 f60054b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rjh0 f60055c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f60056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eix0(aaq0 aaq0Var, rjh0 rjh0Var, String str, int i) {
        super(0);
        this.f60053a = i;
        this.f60054b = aaq0Var;
        this.f60055c = rjh0Var;
        this.f60056d = str;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f60053a) {
            case 0:
                kv91 kv91Var = (kv91) this.f60054b.f13908b;
                rjh0 rjh0Var = this.f60055c;
                yt91 yt91VarM96903c = rjh0Var.f199837b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("video_preview", this.f60056d, null, null, "loaded"));
                yt91VarM96903c.f276056j = true;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_element_toggle", 1, nau.f152117a), yt91VarM96903c.m94607a(), rjh0Var.f199836a, System.currentTimeMillis()), null);
                break;
            default:
                kv91 kv91Var2 = (kv91) this.f60054b.f13908b;
                rjh0 rjh0Var2 = this.f60055c;
                yt91 yt91VarM96903c2 = rjh0Var2.f199837b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("video_preview", this.f60056d, null, null, "error"));
                yt91VarM96903c2.f276056j = true;
                kv91Var2.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("retry", 1, nau.f152117a), yt91VarM96903c2.m94607a(), rjh0Var2.f199836a, System.currentTimeMillis()), null);
                break;
        }
        return w2a1.f247311a;
    }
}
