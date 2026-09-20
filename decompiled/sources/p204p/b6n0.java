package p204p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: classes2.dex */
public final class b6n0 {

    /* JADX INFO: renamed from: a */
    public final Scheduler f23995a;

    /* JADX INFO: renamed from: b */
    public final d6n0 f23996b;

    public b6n0(RetrofitMaker retrofitMaker, Scheduler scheduler) {
        this.f23995a = scheduler;
        this.f23996b = (d6n0) retrofitMaker.createWebgateService(d6n0.class, "android-partner-apps-domain");
    }
}
