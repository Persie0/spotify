package p204p;

import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes4.dex */
public final class ooj0 implements InterfaceC1823eq {
    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: c */
    public final Single mo39712c(String str, String str2, boolean z) {
        System.out.println((Object) "AccountSwitching: switchToAccount() NO-OP");
        return Single.just(Boolean.TRUE);
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: d */
    public final Single mo39713d(String str) {
        System.out.println((Object) "AccountSwitching: addAccountSwitchingAccount() NO-OP");
        return Single.just(Boolean.TRUE);
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: e */
    public final fiz mo39714e() {
        System.out.println((Object) "AccountSwitching: getAvailableUsersFlow() NO-OP");
        return new ysk(lau.f131415a, 27);
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: f */
    public final C1681av mo39715f() {
        return null;
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: g */
    public final Single mo39716g(String str) {
        System.out.println((Object) "AccountSwitching: logInToAccountSwitchingAccount() NO-OP");
        return Single.just(Boolean.TRUE);
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: i */
    public final boolean mo39717i() {
        return false;
    }

    @Override // p204p.InterfaceC1823eq
    /* JADX INFO: renamed from: j */
    public final Single mo39718j() {
        System.out.println((Object) "AccountSwitching: getAvailableUsers() NO-OP");
        return Single.just(lau.f131415a);
    }
}
