package p204p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class yka1 extends UrlResponseInfo {

    /* JADX INFO: renamed from: a */
    public final List f273654a;

    /* JADX INFO: renamed from: b */
    public final int f273655b;

    /* JADX INFO: renamed from: c */
    public final String f273656c;

    /* JADX INFO: renamed from: d */
    public final String f273657d;

    /* JADX INFO: renamed from: e */
    public final String f273658e = "";

    /* JADX INFO: renamed from: f */
    public final AtomicLong f273659f = new AtomicLong(0);

    /* JADX INFO: renamed from: g */
    public final xka1 f273660g;

    public yka1(ArrayList arrayList, int i, String str, List list, String str2) {
        this.f273654a = Collections.unmodifiableList(arrayList);
        this.f273655b = i;
        this.f273656c = str;
        this.f273660g = new xka1(Collections.unmodifiableList(list));
        this.f273657d = str2;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final Map getAllHeaders() {
        return this.f273660g.getAsMap();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getAllHeadersAsList() {
        return this.f273660g.f262322a;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final int getHttpStatusCode() {
        return this.f273655b;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getHttpStatusText() {
        return this.f273656c;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getNegotiatedProtocol() {
        return this.f273657d;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getProxyServer() {
        return this.f273658e;
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final long getReceivedByteCount() {
        return this.f273659f.get();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final String getUrl() {
        List list = this.f273654a;
        return (String) list.get(list.size() - 1);
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final List getUrlChain() {
        return this.f273654a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String url = getUrl();
        String string = this.f273654a.toString();
        String string2 = this.f273660g.f262322a.toString();
        long j = this.f273659f.get();
        StringBuilder sbM38573v = edb.m38573v("UrlResponseInfo@[", hexString, "][", url, "]: urlChain = ");
        sbM38573v.append(string);
        sbM38573v.append(", httpStatus = ");
        sbM38573v.append(this.f273655b);
        sbM38573v.append(" ");
        klh.m56844p(sbM38573v, this.f273656c, ", headers = ", string2, ", wasCached = false, negotiatedProtocol = ");
        klh.m56844p(sbM38573v, this.f273657d, ", proxyServer= ", this.f273658e, ", receivedByteCount = ");
        sbM38573v.append(j);
        return sbM38573v.toString();
    }

    @Override // org.chromium.net.UrlResponseInfo
    public final boolean wasCached() {
        return false;
    }
}
