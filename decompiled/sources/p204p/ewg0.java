package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ewg0 implements pv91, rv91 {

    /* JADX INFO: renamed from: a */
    public final zt91 f63545a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cag0 f63546b;

    public ewg0(cag0 cag0Var, String str, Integer num, int i) {
        String str2;
        this.f63546b = cag0Var;
        yt91 yt91VarM96903c = cag0Var.f35816b.m96903c();
        if (i == 1) {
            str2 = "activated";
        } else {
            if (i != 2) {
                throw null;
            }
            str2 = "unactivated";
        }
        yt91VarM96903c.f276055i.add(new bu91("grid_item", str, num, null, str2));
        yt91VarM96903c.f276056j = true;
        this.f63545a = yt91VarM96903c.m94607a();
    }

    @Override // p204p.pv91
    /* JADX INFO: renamed from: d */
    public final st91 mo24361d() {
        st91 st91Var = st91.f213865b;
        zt91 zt91Var = this.f63545a;
        return new st91(ikc0.m50940l(zt91Var, "location", zt91Var));
    }

    @Override // p204p.rv91
    /* JADX INFO: renamed from: e */
    public final ou91 mo24514e() {
        nu91 nu91Var = new nu91();
        nu91Var.f248107a = this.f63545a;
        nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
        nu91Var.f158542f = ((xug0) this.f63546b.f35817c).f266110c;
        return (ou91) nu91Var.m87248a();
    }
}
