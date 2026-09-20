package p204p;

import android.net.Network;
import android.net.http.HttpEngine;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandlerFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class n94 extends mtl {

    /* JADX INFO: renamed from: c */
    public static boolean f151698c;

    /* JADX INFO: renamed from: d */
    public static boolean f151699d;

    /* JADX INFO: renamed from: a */
    public final HttpEngine f151700a;

    /* JADX INFO: renamed from: b */
    public final Map f151701b = Collections.synchronizedMap(new HashMap());

    public n94(HttpEngine httpEngine) {
        this.f151700a = httpEngine;
    }

    @Override // p204p.mtl
    /* JADX INFO: renamed from: a */
    public final ExperimentalUrlRequest mo41361a(String str, UrlRequest.Callback callback, Executor executor, int i, ArrayList arrayList, boolean z, boolean z2, boolean z3, int i2, boolean z4, int i3, RequestFinishedInfo.Listener listener, long j, String str2, ArrayList arrayList2, UploadDataProvider uploadDataProvider, Executor executor2) {
        kt4 kt4Var = new kt4(callback);
        android.net.http.UrlRequest.Builder builderNewUrlRequestBuilder = this.f151700a.newUrlRequestBuilder(str, executor, kt4Var);
        builderNewUrlRequestBuilder.setPriority(i);
        if (z) {
            builderNewUrlRequestBuilder.setCacheDisabled(z);
        }
        if (z2) {
            builderNewUrlRequestBuilder.setDirectExecutorAllowed(z2);
        }
        if (z3) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i2);
        }
        if (z4) {
            builderNewUrlRequestBuilder.setTrafficStatsTag(i3);
        }
        builderNewUrlRequestBuilder.bindToNetwork(j == -1 ? null : Network.fromNetworkHandle(j));
        builderNewUrlRequestBuilder.setHttpMethod(str2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builderNewUrlRequestBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        if (uploadDataProvider != null) {
            builderNewUrlRequestBuilder.setUploadDataProvider(new et4(uploadDataProvider), executor2);
        }
        mt4 mt4Var = new mt4(builderNewUrlRequestBuilder.build(), this, str, arrayList, listener);
        kt4Var.f126137b = mt4Var;
        return mt4Var;
    }

    @Override // org.chromium.net.CronetEngine
    public final void addRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f151701b.put(listener, new deb1(listener));
    }

    @Override // org.chromium.net.CronetEngine
    public final void bindToNetwork(long j) {
        this.f151700a.bindToNetwork(j == -1 ? null : Network.fromNetworkHandle(j));
    }

    /* JADX INFO: renamed from: c */
    public final ExperimentalBidirectionalStream m63882c(String str, BidirectionalStream.Callback callback, Executor executor, String str2, ArrayList arrayList, int i, boolean z, ArrayList arrayList2, boolean z2, int i2, boolean z3, int i3) {
        lx3 lx3Var = new lx3(callback);
        android.net.http.BidirectionalStream.Builder builderNewBidirectionalStreamBuilder = this.f151700a.newBidirectionalStreamBuilder(str, executor, lx3Var);
        builderNewBidirectionalStreamBuilder.setHttpMethod(str2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            builderNewBidirectionalStreamBuilder.addHeader((String) entry.getKey(), (String) entry.getValue());
        }
        builderNewBidirectionalStreamBuilder.setPriority(i);
        builderNewBidirectionalStreamBuilder.setDelayRequestHeadersUntilFirstFlushEnabled(z);
        if (z2) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsTag(i2);
        }
        if (z3) {
            builderNewBidirectionalStreamBuilder.setTrafficStatsUid(i3);
        }
        mx3 mx3Var = new mx3(builderNewBidirectionalStreamBuilder.build(), this, str, arrayList2);
        lx3Var.f137706b = mx3Var;
        return mx3Var;
    }

    @Override // org.chromium.net.CronetEngine
    public final URLStreamHandlerFactory createURLStreamHandlerFactory() {
        return this.f151700a.createUrlStreamHandlerFactory();
    }

    @Override // org.chromium.net.CronetEngine
    public final byte[] getGlobalMetricsDeltas() {
        if (!f151699d) {
            f151699d = true;
        }
        return new byte[0];
    }

    @Override // org.chromium.net.CronetEngine
    public final String getVersionString() {
        return HttpEngine.getVersionString();
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final BidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new ac9(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final UrlRequest.Builder newUrlRequestBuilder(String str, UrlRequest.Callback callback, Executor executor) {
        return new wka1(str, callback, executor, this);
    }

    @Override // org.chromium.net.CronetEngine
    public final URLConnection openConnection(URL url) {
        return (URLConnection) AbstractC1665af.m25777h(new m94(0, this, url), IOException.class);
    }

    @Override // org.chromium.net.CronetEngine
    public final void removeRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f151701b.remove(listener);
    }

    @Override // org.chromium.net.CronetEngine
    public final void shutdown() {
        this.f151700a.shutdown();
    }

    @Override // org.chromium.net.CronetEngine
    public final void startNetLogToFile(String str, boolean z) {
        if (f151698c) {
            return;
        }
        f151698c = true;
    }

    @Override // org.chromium.net.ExperimentalCronetEngine, org.chromium.net.CronetEngine
    public final ExperimentalBidirectionalStream.Builder newBidirectionalStreamBuilder(String str, BidirectionalStream.Callback callback, Executor executor) {
        return new ac9(str, callback, executor, this);
    }

    @Override // org.chromium.net.ExperimentalCronetEngine
    public final URLConnection openConnection(URL url, Proxy proxy) {
        if (proxy.type() != Proxy.Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || pka1.f178421b.equals(protocol)) {
            return openConnection(url);
        }
        throw new UnsupportedOperationException(edb.m38564m("Unexpected protocol:", protocol));
    }

    @Override // org.chromium.net.CronetEngine
    public final void stopNetLog() {
    }
}
