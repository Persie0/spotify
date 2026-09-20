package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class lxa1 {

    /* JADX INFO: renamed from: a */
    public final kv91 f137770a;

    /* JADX INFO: renamed from: b */
    public final ylh0 f137771b = new ylh0();

    public lxa1(kv91 kv91Var) {
        this.f137770a = kv91Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m60174a(pp71 pp71Var) {
        kp71 kp71Var = pp71Var.f179940b;
        if (kp71Var instanceof hp71) {
            int i = ((hp71) kp71Var).f93710b;
            ylh0 ylh0Var = this.f137771b;
            kv91 kv91Var = this.f137770a;
            if (i <= 0) {
                ylh0Var.getClass();
                yt91 yt91VarM96903c = ylh0Var.f274028a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("loaded_all_content", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                kv91Var.mo57449i((ou91) nu91Var.m87248a(), null);
                return;
            }
            Integer numValueOf = Integer.valueOf(i - 1);
            ylh0Var.getClass();
            yt91 yt91VarM96903c2 = ylh0Var.f274028a.m96903c();
            yt91VarM96903c2.f276055i.add(new bu91("page_loaded", null, numValueOf, null, null));
            yt91VarM96903c2.f276056j = true;
            zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
            nu91 nu91Var2 = new nu91();
            nu91Var2.f248107a = zt91VarM94607a2;
            nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
            kv91Var.mo57449i((ou91) nu91Var2.m87248a(), null);
        }
    }
}
