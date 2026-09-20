package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class f311 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g311 f65336b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f311(g311 g311Var, int i) {
        super(4);
        this.f65335a = i;
        this.f65336b = g311Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f65335a) {
            case 0:
                ((Number) obj3).intValue();
                leh0 leh0Var = this.f65336b.f76071c;
                leh0Var.getClass();
                return new keh0(leh0Var);
            default:
                w211 w211Var = (w211) obj4;
                if (w211Var instanceof p211) {
                    p211 p211Var = (p211) w211Var;
                    if (p211Var.f173211c) {
                        leh0 leh0Var2 = this.f65336b.f76071c;
                        leh0Var2.getClass();
                        yt91 yt91VarM96903c = leh0Var2.f132552b.m96903c();
                        yt91VarM96903c.f276055i.add(new bu91("share_cards_carousel", null, null, null, null));
                        yt91VarM96903c.f276056j = false;
                        zt91 zt91VarM94607a = yt91VarM96903c.m94607a();
                        String str = p211Var.f173210b;
                        Integer numValueOf = Integer.valueOf(p211Var.f173209a);
                        yt91 yt91VarM96903c2 = zt91VarM94607a.m96903c();
                        yt91VarM96903c2.f276055i.add(new bu91("share_card", str, numValueOf, null, null));
                        yt91VarM96903c2.f276056j = true;
                        return new av91("", "", new dv91("swipe", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c2.m94607a(), leh0Var2.f132551a, System.currentTimeMillis());
                    }
                }
                return null;
        }
    }
}
