package p204p;

import android.util.Log;
import com.spotify.cosmos.cosmos.Request;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.RequestFinishedInfo;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class wka1 extends ExperimentalUrlRequest.Builder {

    /* JADX INFO: renamed from: a */
    public final mtl f252180a;

    /* JADX INFO: renamed from: b */
    public final String f252181b;

    /* JADX INFO: renamed from: c */
    public final UrlRequest.Callback f252182c;

    /* JADX INFO: renamed from: d */
    public final Executor f252183d;

    /* JADX INFO: renamed from: e */
    public String f252184e;

    /* JADX INFO: renamed from: g */
    public boolean f252186g;

    /* JADX INFO: renamed from: i */
    public ArrayList f252188i;

    /* JADX INFO: renamed from: j */
    public UploadDataProvider f252189j;

    /* JADX INFO: renamed from: k */
    public Executor f252190k;

    /* JADX INFO: renamed from: l */
    public boolean f252191l;

    /* JADX INFO: renamed from: m */
    public boolean f252192m;

    /* JADX INFO: renamed from: n */
    public int f252193n;

    /* JADX INFO: renamed from: o */
    public boolean f252194o;

    /* JADX INFO: renamed from: p */
    public int f252195p;

    /* JADX INFO: renamed from: q */
    public RequestFinishedInfo.Listener f252196q;

    /* JADX INFO: renamed from: f */
    public final ArrayList f252185f = new ArrayList();

    /* JADX INFO: renamed from: h */
    public int f252187h = 3;

    /* JADX INFO: renamed from: r */
    public long f252197r = -1;

    public wka1(String str, UrlRequest.Callback callback, Executor executor, mtl mtlVar) {
        Objects.requireNonNull(str, "URL is required.");
        this.f252181b = str;
        Objects.requireNonNull(callback, "Callback is required.");
        this.f252182c = callback;
        Objects.requireNonNull(executor, "Executor is required.");
        this.f252183d = executor;
        this.f252180a = mtlVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m88363a(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        if (!"Accept-Encoding".equalsIgnoreCase(str)) {
            this.f252185f.add(new AbstractMap.SimpleEntry(str, str2));
        } else if (Log.isLoggable("wka1", 3)) {
            new Exception();
        }
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ ExperimentalUrlRequest.Builder addHeader(String str, String str2) {
        m88363a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        if (this.f252188i == null) {
            this.f252188i = new ArrayList();
        }
        this.f252188i.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder allowDirectExecutor() {
        this.f252191l = true;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder bindToNetwork(long j) {
        this.f252197r = j;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder disableCache() {
        this.f252186g = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder setHttpMethod(String str) {
        setHttpMethod(str);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setPriority(int i) {
        this.f252187h = i;
        return this;
    }

    @Override // org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setRawCompressionDictionary(byte[] bArr, ByteBuffer byteBuffer, String str) {
        Objects.requireNonNull(bArr, "Hash is required");
        if (bArr.length != 32) {
            throw new IllegalArgumentException("SHA-256 hashes are supposed to be 32 bytes");
        }
        Objects.requireNonNull(byteBuffer, "Dictionary is required");
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        Objects.requireNonNull(str, "Dictionary ID cannot be null. If missing, pass an empty string");
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f252196q = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setTrafficStatsTag(int i) {
        this.f252192m = true;
        this.f252193n = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setTrafficStatsUid(int i) {
        this.f252194o = true;
        this.f252195p = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.f252189j = uploadDataProvider;
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        this.f252190k = executor;
        if (this.f252184e == null) {
            this.f252184e = Request.POST;
        }
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final /* bridge */ /* synthetic */ UrlRequest.Builder addHeader(String str, String str2) {
        m88363a(str, str2);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder allowDirectExecutor() {
        this.f252191l = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest build() {
        int i = this.f252187h;
        ArrayList arrayList = this.f252188i;
        boolean z = this.f252186g;
        boolean z2 = this.f252191l;
        boolean z3 = this.f252192m;
        int i2 = this.f252193n;
        boolean z4 = this.f252194o;
        int i3 = this.f252195p;
        RequestFinishedInfo.Listener listener = this.f252196q;
        long j = this.f252197r;
        String str = this.f252184e;
        if (str == null) {
            str = Request.GET;
        }
        return this.f252180a.mo41361a(this.f252181b, this.f252182c, this.f252183d, i, arrayList, z, z2, z3, i2, z4, i3, listener, j, str, this.f252185f, this.f252189j, this.f252190k);
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder disableCache() {
        this.f252186g = true;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f252184e = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setPriority(int i) {
        this.f252187h = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setRequestFinishedListener(RequestFinishedInfo.Listener listener) {
        this.f252196q = listener;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setTrafficStatsTag(int i) {
        this.f252192m = true;
        this.f252193n = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setTrafficStatsUid(int i) {
        this.f252194o = true;
        this.f252195p = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        if (this.f252188i == null) {
            this.f252188i = new ArrayList();
        }
        this.f252188i.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder, org.chromium.net.UrlRequest.Builder
    public final UrlRequest.Builder setUploadDataProvider(UploadDataProvider uploadDataProvider, Executor executor) {
        Objects.requireNonNull(uploadDataProvider, "Invalid UploadDataProvider.");
        this.f252189j = uploadDataProvider;
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        this.f252190k = executor;
        if (this.f252184e == null) {
            this.f252184e = Request.POST;
        }
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final ExperimentalUrlRequest.Builder disableConnectionMigration() {
        return this;
    }

    @Override // org.chromium.net.ExperimentalUrlRequest.Builder
    public final ExperimentalUrlRequest.Builder setIdempotency(int i) {
        return this;
    }
}
