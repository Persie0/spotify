package p204p;

import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class poj0 implements InterfaceC2024jq {
    @Override // p204p.InterfaceC2024jq
    /* JADX INFO: renamed from: a */
    public final Single mo54013a(String str) {
        System.out.println((Object) "AccountSwitching: removeUserInfo() NO-OP");
        return Single.just(Boolean.FALSE);
    }

    @Override // p204p.InterfaceC2024jq
    /* JADX INFO: renamed from: b */
    public final Single mo54014b(ms41 ms41Var) {
        System.out.println((Object) "AccountSwitching: saveCurrentUser() NO-OP");
        return Single.just(f4y0.f65854a);
    }

    @Override // p204p.InterfaceC2024jq
    /* JADX INFO: renamed from: h */
    public final Single mo54015h(ArrayList arrayList) {
        System.out.println((Object) "AccountSwitching: saveUsers() NO-OP");
        return Single.just(Boolean.FALSE);
    }

    @Override // p204p.InterfaceC2024jq
    /* JADX INFO: renamed from: k */
    public final void mo54016k() {
        System.out.println((Object) "AccountSwitching: clearCredentials() NO-OP");
    }
}
