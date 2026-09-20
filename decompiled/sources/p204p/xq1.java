package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class xq1 {

    /* JADX INFO: renamed from: a */
    public final kv91 f264839a;

    /* JADX INFO: renamed from: b */
    public final q8g0 f264840b;

    /* JADX INFO: renamed from: c */
    public final String f264841c;

    public xq1(zam0 zam0Var, kv91 kv91Var, qr1 qr1Var) {
        this.f264839a = kv91Var;
        this.f264840b = new q8g0(zam0Var.path());
        String str = qr1Var.f191694c;
        this.f264841c = str.length() == 0 ? "none" : str;
    }

    /* JADX INFO: renamed from: a */
    public final void m91803a(String str, String str2) {
        q8g0 q8g0Var = this.f264840b;
        q8g0Var.getClass();
        yt91 yt91VarM96903c = q8g0Var.f186318a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("item", null, -1, str, this.f264841c));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str.toString();
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("playlist", string);
        String string2 = str2.toString();
        this.f264839a.mo57453r(new av91("", "", dv91Var, new bv91("add_to_playlist", 2, kkc0.m56695h0(pqm0Var, new pqm0("item_to_be_added", string2 != null ? string2 : ""))), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: b */
    public final void m91804b() {
        q8g0 q8g0Var = this.f264840b;
        q8g0Var.getClass();
        yt91 yt91VarM96903c = q8g0Var.f186318a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("back", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f264839a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: c */
    public final void m91805c() {
        q8g0 q8g0Var = this.f264840b;
        q8g0Var.getClass();
        yt91 yt91VarM96903c = q8g0Var.f186318a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("outside_area", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f264839a.mo57453r(new av91("", "", new dv91("hit", 1), new bv91("ui_hide", 1, nau.f152117a), yt91VarM96903c.m94607a(), st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: d */
    public final void m91806d(String str, String str2) {
        q8g0 q8g0Var = this.f264840b;
        q8g0Var.getClass();
        yt91 yt91VarM96903c = q8g0Var.f186318a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("item", null, -1, str, this.f264841c));
        yt91VarM96903c.f276056j = false;
        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
        dv91 dv91Var = new dv91("hit", 1);
        String string = str2.toString();
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("item_to_be_removed_from_playlist", string);
        String string2 = str.toString();
        this.f264839a.mo57453r(new av91("", "", dv91Var, new bv91("remove_item_from_playlist", 2, kkc0.m56695h0(pqm0Var, new pqm0("playlist", string2 != null ? string2 : ""))), zt91VarM94607a, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: e */
    public final void m91807e() {
        q8g0 q8g0Var = this.f264840b;
        q8g0Var.getClass();
        this.f264839a.mo57453r(new av91("", "", new dv91("drag", 1), new bv91("ui_hide", 1, nau.f152117a), q8g0Var.f186318a, st91.f213865b, System.currentTimeMillis()), null);
    }

    /* JADX INFO: renamed from: f */
    public final void m91808f() {
        q8g0 q8g0Var = this.f264840b;
        q8g0Var.getClass();
        this.f264839a.mo57453r(new av91("", "", new dv91("drag", 1), new bv91("ui_reveal", 1, nau.f152117a), q8g0Var.f186318a, st91.f213865b, System.currentTimeMillis()), null);
    }
}
