package p204p;

import android.net.TrafficStats;
import android.os.Trace;
import com.spotify.cosmos.cosmos.Request;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.net.HttpURLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.net.CronetException;
import org.chromium.net.ExperimentalUrlRequest;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes11.dex */
public final class ue60 extends ExperimentalUrlRequest {

    /* JADX INFO: renamed from: z */
    public static final /* synthetic */ int f229413z = 0;

    /* JADX INFO: renamed from: a */
    public final re60 f229414a;

    /* JADX INFO: renamed from: b */
    public final te60 f229415b;

    /* JADX INFO: renamed from: c */
    public final String f229416c;

    /* JADX INFO: renamed from: d */
    public final TreeMap f229417d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f229418e;

    /* JADX INFO: renamed from: f */
    public final AtomicInteger f229419f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f229420g;

    /* JADX INFO: renamed from: h */
    public final boolean f229421h;

    /* JADX INFO: renamed from: i */
    public final String f229422i;

    /* JADX INFO: renamed from: j */
    public final lfa1 f229423j;

    /* JADX INFO: renamed from: k */
    public final Executor f229424k;

    /* JADX INFO: renamed from: l */
    public volatile int f229425l;

    /* JADX INFO: renamed from: m */
    public String f229426m;

    /* JADX INFO: renamed from: n */
    public ReadableByteChannel f229427n;

    /* JADX INFO: renamed from: o */
    public yka1 f229428o;

    /* JADX INFO: renamed from: p */
    public String f229429p;

    /* JADX INFO: renamed from: q */
    public HttpURLConnection f229430q;

    /* JADX INFO: renamed from: r */
    public se60 f229431r;

    /* JADX INFO: renamed from: s */
    public final fd60 f229432s;

    /* JADX INFO: renamed from: t */
    public final int f229433t;

    /* JADX INFO: renamed from: u */
    public final mhf1 f229434u;

    /* JADX INFO: renamed from: v */
    public final long f229435v;

    /* JADX INFO: renamed from: w */
    public int f229436w;

    /* JADX INFO: renamed from: x */
    public int f229437x;

    /* JADX INFO: renamed from: y */
    public boolean f229438y;

    public ue60(fd60 fd60Var, UrlRequest.Callback callback, ThreadPoolExecutor threadPoolExecutor, Executor executor, String str, String str2, boolean z, boolean z2, int i, boolean z3, int i2, long j, String str3, ArrayList arrayList, UploadDataProvider uploadDataProvider, Executor executor2) {
        lfa1 lfa1Var;
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        this.f229417d = treeMap;
        this.f229418e = new ArrayList();
        this.f229419f = new AtomicInteger(0);
        this.f229420g = new AtomicBoolean(false);
        this.f229425l = -1;
        why0.m88178a("Cronet JavaUrlRequest#JavaUrlRequest");
        try {
            Objects.requireNonNull(str, "URL is required");
            Objects.requireNonNull(callback, "Listener is required");
            Objects.requireNonNull(threadPoolExecutor, "Executor is required");
            Objects.requireNonNull(executor, "userExecutor is required");
            this.f229421h = z;
            this.f229414a = new re60(this, callback, executor);
            this.f229415b = new te60(new ne60(threadPoolExecutor, z2 ? i : TrafficStats.getThreadStatsTag(), z3, i2));
            this.f229432s = fd60Var;
            this.f229433t = fd60Var.f68351c;
            this.f229434u = fd60Var.f68352d;
            this.f229426m = str;
            this.f229416c = str2;
            this.f229435v = j;
            m82892a(str3);
            this.f229422i = str3;
            m82896e(arrayList);
            if (uploadDataProvider == null) {
                lfa1Var = null;
            } else {
                if (!treeMap.containsKey("Content-Type")) {
                    throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                }
                lfa1Var = new lfa1(uploadDataProvider, 1);
            }
            this.f229423j = lfa1Var;
            this.f229424k = (executor2 == null || z) ? executor2 : new zr20(executor2, 3);
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m82892a(String str) {
        Objects.requireNonNull(str, "Method is required.");
        if (!"OPTIONS".equalsIgnoreCase(str) && !Request.GET.equalsIgnoreCase(str) && !"HEAD".equalsIgnoreCase(str) && !Request.POST.equalsIgnoreCase(str) && !Request.PUT.equalsIgnoreCase(str) && !Request.DELETE.equalsIgnoreCase(str) && !"TRACE".equalsIgnoreCase(str) && !"PATCH".equalsIgnoreCase(str)) {
            throw new IllegalArgumentException("Invalid http method ".concat(str));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m82893b(CronetException cronetException) {
        AtomicInteger atomicInteger;
        int i;
        do {
            atomicInteger = this.f229419f;
            i = atomicInteger.get();
            if (i == 0) {
                throw new IllegalStateException("Can't enter error state before start");
            }
            if (i == 6 || i == 7 || i == 8) {
                return;
            }
        } while (!atomicInteger.compareAndSet(i, 6));
        m82894c(new me60(this, 2), "fireDisconnect");
        m82895d();
        yka1 yka1Var = this.f229428o;
        re60 re60Var = this.f229414a;
        Executor executor = re60Var.f198293c;
        ue60 ue60Var = re60Var.f198294d;
        ue60Var.m82894c(new me60(ue60Var, 0), "closeResponseChannel");
        zq4 zq4Var = new zq4(re60Var, yka1Var, cronetException, 25);
        try {
            re60Var.m75384c(zq4Var, "onFailed");
        } catch (InlineExecutionProhibitedException unused) {
            if (executor != null) {
                why0.m88178a("Cronet JavaUrlRequest.AsyncUrlRequestCallback#executeOnFallbackExecutor onFailed");
                try {
                    executor.execute(new ig10(zq4Var, 6));
                    Trace.endSection();
                } catch (Throwable th) {
                    try {
                        Trace.endSection();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m82894c(Runnable runnable, String str) {
        why0.m88178a("Cronet JavaUrlRequest#executeOnExecutor ".concat(str));
        try {
            this.f229415b.execute(new oe60(str, runnable, 0));
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void cancel() {
        int andSet = this.f229419f.getAndSet(8);
        if (andSet == 1 || andSet == 2 || andSet == 3 || andSet == 4 || andSet == 5) {
            m82894c(new me60(this, 2), "fireDisconnect");
            m82895d();
            yka1 yka1Var = this.f229428o;
            re60 re60Var = this.f229414a;
            ue60 ue60Var = re60Var.f198294d;
            ue60Var.m82894c(new me60(ue60Var, 0), "closeResponseChannel");
            re60Var.m75384c(new qe60(re60Var, yka1Var, 0), "onCanceled");
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m82895d() {
        lfa1 lfa1Var = this.f229423j;
        if (lfa1Var == null || !this.f229420g.compareAndSet(false, true)) {
            return;
        }
        try {
            this.f229424k.execute(new ke60(this, new yaz(lfa1Var, 18), 0));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX INFO: renamed from: e */
    public final void m82896e(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ',' && cCharAt != '/' && cCharAt != '{' && cCharAt != '}') {
                    switch (cCharAt) {
                        case '\'':
                        case '(':
                        case ')':
                            break;
                        default:
                            switch (cCharAt) {
                                case ':':
                                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                            break;
                                        default:
                                            if (!Character.isISOControl(cCharAt) && !Character.isWhitespace(cCharAt)) {
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    while (i < str.length()) {
                        char cCharAt2 = str.charAt(i);
                        if (cCharAt2 == ',') {
                        }
                    }
                }
                throw new IllegalArgumentException(edb.m38564m("Invalid header with headername: ", (String) entry.getKey()));
            }
            if (((String) entry.getValue()).contains("\r\n")) {
                throw new IllegalArgumentException(edb.m38564m("Invalid header with headername: ", (String) entry.getKey()));
            }
            this.f229417d.put((String) entry.getKey(), (String) entry.getValue());
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m82897f(int i, int i2, Runnable runnable) {
        AtomicInteger atomicInteger = this.f229419f;
        if (!atomicInteger.compareAndSet(i, i2)) {
            int i3 = atomicInteger.get();
            if (i3 != 8 && i3 != 6) {
                throw new IllegalStateException(edb.m38566o("Invalid state transition - expected ", glg1.m45175z(i), " but was ", glg1.m45175z(i3)));
            }
            return;
        }
        why0.m88178a("Cronet JavaUrlRequest#transitionStates " + glg1.m45175z(i) + " -> " + glg1.m45175z(i2));
        try {
            runnable.run();
            Trace.endSection();
        } catch (Throwable th) {
            try {
                Trace.endSection();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.chromium.net.UrlRequest
    public final void followRedirect() {
        m82897f(3, 1, new kk00(this, 6));
    }

    @Override // org.chromium.net.UrlRequest
    public final void getStatus(UrlRequest.StatusListener statusListener) {
        int i = this.f229419f.get();
        int i2 = this.f229425l;
        switch (i) {
            case 0:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            case 1:
                break;
            case 2:
            case 3:
            case 4:
                i2 = 0;
                break;
            case 5:
                i2 = 14;
                break;
            default:
                throw new IllegalStateException(s571.m77246e(i, "Switch is exhaustive: "));
        }
        re60 re60Var = this.f229414a;
        feb1 feb1Var = new feb1(statusListener);
        re60Var.getClass();
        re60Var.m75384c(new lx6(feb1Var, i2, 6), "sendStatus");
    }

    @Override // org.chromium.net.UrlRequest
    public final boolean isDone() {
        int i = this.f229419f.get();
        return i == 7 || i == 6 || i == 8;
    }

    @Override // org.chromium.net.UrlRequest
    public final void read(ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("ByteBuffer is already full.");
        }
        m82897f(4, 5, new zaz(9, this, new us30(1, this, byteBuffer)));
    }

    @Override // org.chromium.net.UrlRequest
    public final void start() {
        this.f229425l = 10;
        this.f229432s.f68353e.incrementAndGet();
        m82897f(0, 1, new me60(this, 3));
    }
}
