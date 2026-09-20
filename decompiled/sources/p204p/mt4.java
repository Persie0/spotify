package p204p;

import android.net.http.UrlRequest;
import java.nio.ByteBuffer;
import java.util.Collection;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class mt4 extends ExperimentalUrlRequest {

    /* JADX INFO: renamed from: a */
    public final UrlRequest f146945a;

    /* JADX INFO: renamed from: b */
    public final n94 f146946b;

    /* JADX INFO: renamed from: c */
    public final String f146947c;

    /* JADX INFO: renamed from: d */
    public final Collection f146948d;

    /* JADX INFO: renamed from: e */
    public final deb1 f146949e;

    public mt4(UrlRequest urlRequest, n94 n94Var, String str, Collection collection, RequestFinishedInfo.Listener listener) {
        this.f146945a = urlRequest;
        this.f146946b = n94Var;
        this.f146947c = str;
        this.f146948d = collection;
        this.f146949e = listener == null ? null : new deb1(listener);
    }

    /* JADX INFO: renamed from: a */
    public final void m62788a(int i, nt4 nt4Var, CronetException cronetException) {
        jo4.m53859a(this.f146946b, this.f146947c, this.f146948d, this.f146949e, i, nt4Var, cronetException);
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        this.f146945a.cancel();
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        this.f146945a.followRedirect();
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(org.chromium.net.UrlRequest.StatusListener statusListener) {
        this.f146945a.getStatus(new lt4(statusListener));
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        return this.f146945a.isDone();
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        this.f146945a.read(byteBuffer);
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.f146945a.start();
    }
}
