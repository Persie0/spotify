package p204p;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class xmn0 extends qe70 implements xh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f263408a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ymn0 f263409b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xmn0(ymn0 ymn0Var, int i) {
        super(4);
        this.f263408a = i;
        this.f263409b = ymn0Var;
    }

    @Override // p204p.xh00
    /* JADX INFO: renamed from: M */
    public final Object mo24818M(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f263408a) {
            case 0:
                ((Number) obj3).intValue();
                return new hlh0((slh0) this.f263409b.f274314d);
            default:
                rmn0 rmn0Var = (rmn0) obj4;
                if (!rmn0Var.equals(omn0.f167066a)) {
                    if (rmn0Var.equals(pmn0.f179122a) || rmn0Var.equals(qmn0.f190361a)) {
                        return null;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                yt91 yt91VarM96903c = ((slh0) this.f263409b.f274314d).f210419a.m96903c();
                yt91VarM96903c.f276055i.add(new bu91("enable_activity_banner", null, null, null, null));
                yt91VarM96903c.f276056j = true;
                yt91 yt91VarM96903c2 = yt91VarM96903c.m94607a().m96903c();
                yt91VarM96903c2.f276055i.add(new bu91("enable_activity_button", null, null, null, null));
                yt91VarM96903c2.f276056j = false;
                return new av91("", "", new dv91("hit", 1), new bv91("ui_select", 1, nau.f152117a), yt91VarM96903c2.m94607a(), st91.f213865b, System.currentTimeMillis());
        }
    }
}
