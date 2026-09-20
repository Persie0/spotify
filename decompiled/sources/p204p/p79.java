package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class p79 implements avt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f174623a;

    /* JADX INFO: renamed from: b */
    public final keg0 f174624b;

    public p79(int i) {
        this.f174623a = i;
        switch (i) {
            case 1:
                this.f174624b = new keg0(st91.f213865b);
                break;
            case 2:
                this.f174624b = new keg0(st91.f213865b);
                break;
            default:
                this.f174624b = new keg0(st91.f213865b);
                break;
        }
    }

    @Override // p204p.avt
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo26460b(Object obj, Object obj2, Object obj3, b250 b250Var) {
        switch (this.f174623a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return null;
    }

    @Override // p204p.avt
    /* JADX INFO: renamed from: d */
    public final Object mo26462d(Object obj, Object obj2, b250 b250Var) {
        switch (this.f174623a) {
            case 0:
                keg0 keg0Var = this.f174624b;
                keg0Var.getClass();
                yt91 yt91VarM96903c = keg0Var.f121888b.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("benefit_list_card", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                nu91 nu91Var = new nu91();
                nu91Var.f248107a = zt91VarM94607a;
                nu91Var.f248108b = st91.f213865b;
                nu91Var.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var.m87248a();
            case 1:
                keg0 keg0Var2 = this.f174624b;
                keg0Var2.getClass();
                yt91 yt91VarM96903c2 = keg0Var2.f121888b.m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("bottom_text", null, null, null, null));
                yt91VarM96903c2.f276056j = true;
                zt91 zt91VarM94607a2 = yt91VarM96903c2.m94607a();
                nu91 nu91Var2 = new nu91();
                nu91Var2.f248107a = zt91VarM94607a2;
                nu91Var2.f248108b = st91.f213865b;
                nu91Var2.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var2.m87248a();
            default:
                keg0 keg0Var3 = this.f174624b;
                keg0Var3.getClass();
                yt91 yt91VarM96903c3 = keg0Var3.f121888b.m96903c();
                yt91VarM96903c3.f276055i.add(new bu91("offer_card", null, null, null, null));
                yt91VarM96903c3.f276056j = true;
                zt91 zt91VarM94607a3 = yt91VarM96903c3.m94607a();
                nu91 nu91Var3 = new nu91();
                nu91Var3.f248107a = zt91VarM94607a3;
                nu91Var3.f248108b = st91.f213865b;
                nu91Var3.f248109c = Long.valueOf(System.currentTimeMillis());
                return (ou91) nu91Var3.m87248a();
        }
    }
}
