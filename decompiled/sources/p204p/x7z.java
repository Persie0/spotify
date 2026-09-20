package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class x7z extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f259021a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ np0 f259022b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7z(np0 np0Var, int i) {
        super(4);
        this.f259021a = i;
        this.f259022b = np0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f259021a) {
            case 0:
                ((Number) obj3).intValue();
                return new flh0((slh0) this.f259022b.f156832b);
            default:
                if (!((t7z) obj4).equals(t7z.f217931a)) {
                    throw new NoWhenBranchMatchedException();
                }
                yt91 yt91VarM96903c = ((slh0) this.f259022b.f156832b).f210419a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("add_friends_banner", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("add_friends_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_reveal", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
        }
    }
}
