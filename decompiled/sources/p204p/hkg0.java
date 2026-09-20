package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class hkg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f92439a;

    public hkg0(slg0 slg0Var) {
        yt91 yt91VarM96903c = slg0Var.f210416a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("remove_from_playlist_item", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f92439a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f92439a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m47814e(String str, String str2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("item_to_be_removed_from_playlist", string);
        String string2 = str2 != null ? str2.toString() : null;
        return new av91("", "", dv91Var, new bv91("remove_item_from_playlist", 2, kkc0.m56695h0(pqm0Var, new pqm0("playlist", string2 != null ? string2 : ""))), this.f92439a, st91.f213865b, System.currentTimeMillis());
    }
}
