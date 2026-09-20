package p204p;

import android.net.Uri;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: classes10.dex */
public final class owp0 implements hwp0 {

    /* JADX INFO: renamed from: a */
    public final hwp0 f170756a;

    public owp0(RetrofitMaker retrofitMaker) {
        this.f170756a = (hwp0) retrofitMaker.createWebgateService(hwp0.class, "android-profile-profilemainsections");
    }

    @Override // p204p.hwp0
    /* JADX INFO: renamed from: a */
    public final Single mo48946a(String str) {
        return this.f170756a.mo48946a(Uri.encode(str));
    }
}
