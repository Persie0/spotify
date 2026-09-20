package p204p;

import com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity;

/* JADX INFO: renamed from: p.gq */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C1906gq implements dqk0, gi00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f83306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AccountSwitcherActivity f83307b;

    public /* synthetic */ C1906gq(AccountSwitcherActivity accountSwitcherActivity, int i) {
        this.f83306a = i;
        this.f83307b = accountSwitcherActivity;
    }

    @Override // p204p.dqk0
    /* JADX INFO: renamed from: b */
    public final void mo31453b(Object obj) {
        switch (this.f83306a) {
            case 0:
                AccountSwitcherActivity.m2238u0(this.f83307b, (C1911gv) obj);
                break;
            default:
                AccountSwitcherActivity.m2238u0(this.f83307b, (C1911gv) obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f83306a) {
            case 0:
                if ((obj instanceof dqk0) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof dqk0) && (obj instanceof gi00)) {
                    return wj50.m88271j(getFunctionDelegate(), ((gi00) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    @Override // p204p.gi00
    public final ai00 getFunctionDelegate() {
        switch (this.f83306a) {
            case 0:
                break;
        }
        return new ri00(1, this.f83307b, AccountSwitcherActivity.class, "handleViewEffect", "handleViewEffect(Lcom/spotify/accountswitching/switcheruiimpl/mobius/logic/AccountSwitcherViewEffect;)V", 0, 0);
    }

    public final int hashCode() {
        switch (this.f83306a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
