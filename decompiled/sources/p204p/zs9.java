package p204p;

import java.util.Collections;

/* JADX INFO: loaded from: classes5.dex */
public final class zs9 implements wr2 {

    /* JADX INFO: renamed from: a */
    public final erg0 f285891a = new erg0(1);

    @Override // p204p.wr2
    /* JADX INFO: renamed from: a */
    public final d850 mo88796a(String str, kv91 kv91Var) {
        erg0 erg0Var = this.f285891a;
        erg0Var.getClass();
        yt91 yt91VarM96903c = erg0Var.f62130a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("disclaimer_link", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        return kv91Var.mo57453r(new av91("", "", dv91Var, new bv91("ui_navigate", 1, Collections.singletonMap("destination", string)), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    @Override // p204p.wr2
    /* JADX INFO: renamed from: b */
    public final d850 mo88797b(kv91 kv91Var) {
        erg0 erg0Var = this.f285891a;
        erg0Var.getClass();
        yt91 yt91VarM96903c = erg0Var.f62130a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("disclosure_confirm", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        return kv91Var.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }
}
