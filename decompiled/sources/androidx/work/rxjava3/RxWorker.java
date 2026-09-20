package androidx.work.rxjava3;

import android.content.Context;
import androidx.work.WorkerParameters;
import io.reactivex.rxjava3.core.Single;
import p204p.ekr;
import p204p.f890;
import p204p.jbb;
import p204p.k9w0;
import p204p.n5h1;
import p204p.u790;

/* JADX INFO: loaded from: classes.dex */
public abstract class RxWorker extends f890 {

    /* JADX INFO: renamed from: e */
    public static final ekr f1434e = new ekr(5);

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // p204p.f890
    /* JADX INFO: renamed from: a */
    public final jbb mo1146a() {
        return n5h1.m63736l(new k9w0(3, this, Single.error(new IllegalStateException("Expedited WorkRequests require a RxWorker to provide an implementation for `getForegroundInfo()`"))));
    }

    @Override // p204p.f890
    /* JADX INFO: renamed from: d */
    public final u790 mo1147d() {
        return n5h1.m63736l(new k9w0(3, this, mo1170f()));
    }

    /* JADX INFO: renamed from: f */
    public abstract Single mo1170f();
}
