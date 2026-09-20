package p204p;

import com.spotify.cosmos.cosmos.Request;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;
import org.chromium.net.ExperimentalBidirectionalStream;

/* JADX INFO: loaded from: classes11.dex */
public final class ac9 extends ExperimentalBidirectionalStream.Builder {

    /* JADX INFO: renamed from: a */
    public final n94 f14285a;

    /* JADX INFO: renamed from: b */
    public final String f14286b;

    /* JADX INFO: renamed from: c */
    public final BidirectionalStream.Callback f14287c;

    /* JADX INFO: renamed from: d */
    public final Executor f14288d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f14289e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public String f14290f = Request.POST;

    /* JADX INFO: renamed from: g */
    public int f14291g = 3;

    /* JADX INFO: renamed from: h */
    public boolean f14292h;

    /* JADX INFO: renamed from: i */
    public ArrayList f14293i;

    /* JADX INFO: renamed from: j */
    public boolean f14294j;

    /* JADX INFO: renamed from: k */
    public int f14295k;

    /* JADX INFO: renamed from: l */
    public boolean f14296l;

    /* JADX INFO: renamed from: m */
    public int f14297m;

    public ac9(String str, BidirectionalStream.Callback callback, Executor executor, n94 n94Var) {
        Objects.requireNonNull(str, "URL is required.");
        this.f14286b = str;
        Objects.requireNonNull(callback, "Callback is required.");
        this.f14287c = callback;
        Objects.requireNonNull(executor, "Executor is required.");
        this.f14288d = executor;
        this.f14285a = n94Var;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder addHeader(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.f14289e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final /* bridge */ /* synthetic */ BidirectionalStream.Builder addRequestAnnotation(Object obj) {
        addRequestAnnotation(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.f14292h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f14290f = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setPriority(int i) {
        this.f14291g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.f14294j = true;
        this.f14295k = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.f14296l = true;
        this.f14297m = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder addRequestAnnotation(Object obj) {
        Objects.requireNonNull(obj, "Invalid metrics annotation.");
        if (this.f14293i == null) {
            this.f14293i = new ArrayList();
        }
        this.f14293i.add(obj);
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream build() {
        return this.f14285a.m63882c(this.f14286b, this.f14287c, this.f14288d, this.f14290f, this.f14289e, this.f14291g, this.f14292h, this.f14293i, this.f14294j, this.f14295k, this.f14296l, this.f14297m);
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder delayRequestHeadersUntilFirstFlush(boolean z) {
        this.f14292h = z;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setHttpMethod(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f14290f = str;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setPriority(int i) {
        this.f14291g = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsTag(int i) {
        this.f14294j = true;
        this.f14295k = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder setTrafficStatsUid(int i) {
        this.f14296l = true;
        this.f14297m = i;
        return this;
    }

    @Override // org.chromium.net.ExperimentalBidirectionalStream.Builder, org.chromium.net.BidirectionalStream.Builder
    public final ExperimentalBidirectionalStream.Builder addHeader(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.f14289e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
        return this;
    }

    @Override // org.chromium.net.BidirectionalStream.Builder
    public final BidirectionalStream.Builder bindToNetwork(long j) {
        return this;
    }
}
