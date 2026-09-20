package p204p;

import androidx.media3.session.legacy.PlaybackStateCompat;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class y4l0 {

    /* JADX INFO: renamed from: A */
    public int f269166A;

    /* JADX INFO: renamed from: B */
    public int f269167B;

    /* JADX INFO: renamed from: C */
    public int f269168C;

    /* JADX INFO: renamed from: D */
    public long f269169D;

    /* JADX INFO: renamed from: E */
    public utu0 f269170E;

    /* JADX INFO: renamed from: F */
    public lv61 f269171F;

    /* JADX INFO: renamed from: b */
    public xyi f269173b;

    /* JADX INFO: renamed from: e */
    public w5x f269176e;

    /* JADX INFO: renamed from: f */
    public boolean f269177f;

    /* JADX INFO: renamed from: g */
    public boolean f269178g;

    /* JADX INFO: renamed from: h */
    public xzk f269179h;

    /* JADX INFO: renamed from: i */
    public boolean f269180i;

    /* JADX INFO: renamed from: j */
    public boolean f269181j;

    /* JADX INFO: renamed from: k */
    public xzk f269182k;

    /* JADX INFO: renamed from: l */
    public x2b f269183l;

    /* JADX INFO: renamed from: m */
    public t6x0 f269184m;

    /* JADX INFO: renamed from: n */
    public ProxySelector f269185n;

    /* JADX INFO: renamed from: o */
    public xzk f269186o;

    /* JADX INFO: renamed from: p */
    public SocketFactory f269187p;

    /* JADX INFO: renamed from: q */
    public SSLSocketFactory f269188q;

    /* JADX INFO: renamed from: r */
    public X509TrustManager f269189r;

    /* JADX INFO: renamed from: s */
    public List f269190s;

    /* JADX INFO: renamed from: t */
    public List f269191t;

    /* JADX INFO: renamed from: u */
    public HostnameVerifier f269192u;

    /* JADX INFO: renamed from: v */
    public sic f269193v;

    /* JADX INFO: renamed from: w */
    public q3d0 f269194w;

    /* JADX INFO: renamed from: x */
    public int f269195x;

    /* JADX INFO: renamed from: y */
    public int f269196y;

    /* JADX INFO: renamed from: z */
    public int f269197z;

    /* JADX INFO: renamed from: a */
    public osr f269172a = new osr();

    /* JADX INFO: renamed from: c */
    public final ArrayList f269174c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f269175d = new ArrayList();

    public y4l0() {
        TimeZone timeZone = c0f1.f32774a;
        this.f269176e = new pxd1();
        this.f269177f = true;
        this.f269178g = true;
        xzk xzkVar = xzk.f267704g;
        this.f269179h = xzkVar;
        this.f269180i = true;
        this.f269181j = true;
        this.f269182k = xzk.f267679M0;
        this.f269184m = t6x0.f217622O0;
        this.f269186o = xzkVar;
        this.f269187p = SocketFactory.getDefault();
        this.f269190s = z4l0.f279263H;
        this.f269191t = z4l0.f279262G;
        this.f269192u = t4l0.f217044a;
        this.f269193v = sic.f209392c;
        this.f269196y = 10000;
        this.f269197z = 10000;
        this.f269166A = 10000;
        this.f269168C = 60000;
        this.f269169D = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }

    /* JADX INFO: renamed from: a */
    public final void m92814a(hc50 hc50Var) {
        this.f269174c.add(hc50Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m92815b(long j, TimeUnit timeUnit) {
        this.f269197z = c0f1.m31131b("timeout", j, timeUnit);
    }

    /* JADX INFO: renamed from: c */
    public final void m92816c(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (!sSLSocketFactory.equals(this.f269188q) || !x509TrustManager.equals(this.f269189r)) {
            this.f269170E = null;
        }
        this.f269188q = sSLSocketFactory;
        wco0 wco0Var = wco0.f250081a;
        this.f269194w = wco0.f250081a.mo47859c(x509TrustManager);
        this.f269189r = x509TrustManager;
    }

    /* JADX INFO: renamed from: d */
    public final void m92817d(long j, TimeUnit timeUnit) {
        this.f269166A = c0f1.m31131b("timeout", j, timeUnit);
    }
}
