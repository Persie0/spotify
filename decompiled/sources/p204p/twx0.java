package p204p;

import com.spotify.connectivity.product_state.esperanto.proto.PutValuesSyncRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes.dex */
public final class twx0 {

    /* JADX INFO: renamed from: a */
    public final nkr0 f224503a;

    /* JADX INFO: renamed from: b */
    public final CompositeDisposable f224504b = new CompositeDisposable();

    public twx0(nkr0 nkr0Var) {
        this.f224503a = nkr0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m81761a(String str, String str2) {
        this.f224503a.m64703a(str, str2).subscribe(new swx0(this));
    }

    /* JADX INFO: renamed from: b */
    public final Completable m81762b(String str, String str2) {
        C2048kd c2048kd = this.f224503a.f154933a;
        kgt0 kgt0VarM7528o = PutValuesSyncRequest.m7528o();
        kgt0VarM7528o.m56371m(str, str2);
        return c2048kd.m56130g((PutValuesSyncRequest) kgt0VarM7528o.build()).flatMapCompletable(mkr0.f144655b);
    }
}
