package p204p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes10.dex */
public final class n2v0 implements m2v0 {

    /* JADX INFO: renamed from: a */
    public final m2v0 f149840a;

    public n2v0(RetrofitMaker retrofitMaker) {
        this.f149840a = (m2v0) retrofitMaker.createWebgateService(m2v0.class, "android-profile-profilemainsections");
    }

    @Override // p204p.m2v0
    /* JADX INFO: renamed from: a */
    public final Single mo60618a(String str) {
        return this.f149840a.mo60618a(str);
    }
}
