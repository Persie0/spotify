package p204p;

import java.util.Collection;
import java.util.Collections;
import org.chromium.net.CronetException;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UrlResponseInfo;

/* JADX INFO: loaded from: classes11.dex */
public abstract class bvw0 extends RequestFinishedInfo {

    /* JADX INFO: renamed from: a */
    public final String f31452a;

    /* JADX INFO: renamed from: b */
    public final Collection f31453b;

    /* JADX INFO: renamed from: c */
    public final eul f31454c;

    /* JADX INFO: renamed from: d */
    public final int f31455d;

    /* JADX INFO: renamed from: e */
    public final UrlResponseInfo f31456e;

    /* JADX INFO: renamed from: f */
    public final CronetException f31457f;

    public bvw0(String str, Collection collection, eul eulVar, int i, UrlResponseInfo urlResponseInfo, CronetException cronetException) {
        this.f31452a = str;
        this.f31453b = collection;
        this.f31454c = eulVar;
        this.f31455d = i;
        this.f31456e = urlResponseInfo;
        this.f31457f = cronetException;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final Collection getAnnotations() {
        Collection collection = this.f31453b;
        return collection == null ? Collections.EMPTY_LIST : collection;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final CronetException getException() {
        return this.f31457f;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final int getFinishedReason() {
        return this.f31455d;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final UrlResponseInfo getResponseInfo() {
        return this.f31456e;
    }

    @Override // org.chromium.net.RequestFinishedInfo
    public final String getUrl() {
        return this.f31452a;
    }
}
