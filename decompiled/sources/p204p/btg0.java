package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class btg0 implements pv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f30568a;

    public btg0(ctg0 ctg0Var) {
        yt91 yt91VarM96903c = ctg0Var.f41876a.m96903c();
        yt91VarM96903c.f276055i.add(new bu91("remove_participant_button", null, null, null, null));
        yt91VarM96903c.f276056j = false;
        this.f30568a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f30568a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    /* JADX INFO: renamed from: e */
    public final av91 m30465e(String str, String str2) {
        dv91 dv91Var = new dv91("hit", 1);
        String string = str != null ? str.toString() : null;
        if (string == null) {
            string = "";
        }
        pqm0 pqm0Var = new pqm0("participant_id", string);
        String string2 = str2 != null ? str2.toString() : null;
        return new av91("", "", dv91Var, new bv91("remove_participant", 1, kkc0.m56695h0(pqm0Var, new pqm0("session_id", string2 != null ? string2 : ""))), this.f30568a, st91.f213865b, System.currentTimeMillis());
    }
}
