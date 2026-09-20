package p204p;

import android.webkit.JavascriptInterface;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes10.dex */
public final class xf41 {

    /* JADX INFO: renamed from: a */
    public final amd1 f260832a;

    /* JADX INFO: renamed from: b */
    public final fke f260833b;

    /* JADX INFO: renamed from: c */
    public final PublishSubject f260834c = new PublishSubject();

    public xf41(amd1 amd1Var, fke fkeVar) {
        this.f260832a = amd1Var;
        this.f260833b = fkeVar;
    }

    @JavascriptInterface
    public final String getVersion() {
        return this.f260833b.m41917a();
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        Object c6x0Var;
        try {
            c6x0Var = (a7d1) this.f260832a.f17109a.fromJson(str);
            wj50.m88279p(c6x0Var);
        } catch (Throwable th) {
            c6x0Var = new c6x0(th);
        }
        Throwable thM77348a = s6x0.m77348a(c6x0Var);
        if (thM77348a != null) {
            Logger.m3967c(thM77348a, "Failed to parse incoming web message:\n ".concat(str), new Object[0]);
        } else {
            this.f260834c.onNext(new d6d1((a7d1) c6x0Var));
        }
    }
}
