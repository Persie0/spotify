package p204p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class jyx0 {

    /* JADX INFO: renamed from: a */
    public final my71 f117511a;

    /* JADX INFO: renamed from: b */
    public final Scheduler f117512b;

    /* JADX INFO: renamed from: c */
    public final qwx0 f117513c;

    public jyx0(my71 my71Var, Scheduler scheduler, qwx0 qwx0Var) {
        this.f117511a = my71Var;
        this.f117512b = scheduler;
        this.f117513c = qwx0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Single m54822a() {
        return ((rwx0) this.f117513c).m76590a("parental-pin-required", "0").map(new x4t0(16)).take(1L).single(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public final Single m54823b(Uri uri) {
        return this.f117511a.mo63159b(Uri.encode(uri.toString())).map(new pvw0(uri, 4)).timeout(3L, TimeUnit.SECONDS, this.f117512b, Single.just(uri));
    }

    /* JADX INFO: renamed from: c */
    public final Single m54824c(Uri uri) {
        return m54822a().flatMap(new iyx0(this, uri, 1));
    }
}
