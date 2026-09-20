package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class gw81 implements nv81 {

    /* JADX INFO: renamed from: a */
    public final kv91 f84954a;

    /* JADX INFO: renamed from: b */
    public final dyp f84955b;

    public gw81(kv91 kv91Var, dyp dypVar) {
        this.f84954a = kv91Var;
        this.f84955b = dypVar;
    }

    @Override // p204p.nv81
    /* JADX INFO: renamed from: a */
    public final d850 mo31273a(String str) {
        o5h0 o5h0VarM37347a = this.f84955b.m37347a();
        yt91 yt91VarM96903c = o5h0VarM37347a.f161972b.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("trailer", null, null, str, null));
        yt91VarM96903c.f276056j = true;
        yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
        yt91VarM96903c2.f276055i.add(new bu91("context_menu_button", null, null, null, null));
        yt91VarM96903c2.f276056j = false;
        return this.f84954a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c2.m94607a(), o5h0VarM37347a.f161971a, System.currentTimeMillis()), null);
    }
}
