package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes7.dex */
public final class z170 extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f278250a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ lyz f278251b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z170(lyz lyzVar, int i) {
        super(0);
        this.f278250a = i;
        this.f278251b = lyzVar;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f278250a) {
            case 0:
                lyz lyzVar = this.f278251b;
                lyzVar.f138144b = true;
                lyzVar.m60281d();
                break;
            default:
                nui0 nui0Var = (nui0) this.f278251b.f138147e;
                kv91 kv91Var = nui0Var.f158656a;
                yt91 yt91VarM96903c = nui0Var.f158657b.f104499b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("support_site_button", null, null, null, null));
                yt91VarM96903c.f276056j = false;
                kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/article/managed-accounts-for-premium-family/plain/")), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
                break;
        }
        return w2a1.f247311a;
    }
}
