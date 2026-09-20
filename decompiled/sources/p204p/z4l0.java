package p204p;

import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class z4l0 implements w8b {

    /* JADX INFO: renamed from: G */
    public static final List f279262G = c0f1.m31140k(new r3t0[]{r3t0.HTTP_2, r3t0.HTTP_1_1});

    /* JADX INFO: renamed from: H */
    public static final List f279263H = c0f1.m31140k(new nzi[]{nzi.f160091g, nzi.f160092h});

    /* JADX INFO: renamed from: A */
    public final int f279264A;

    /* JADX INFO: renamed from: B */
    public final int f279265B;

    /* JADX INFO: renamed from: C */
    public final long f279266C;

    /* JADX INFO: renamed from: D */
    public final utu0 f279267D;

    /* JADX INFO: renamed from: E */
    public final lv61 f279268E;

    /* JADX INFO: renamed from: F */
    public final xyi f279269F;

    /* JADX INFO: renamed from: a */
    public final osr f279270a;

    /* JADX INFO: renamed from: b */
    public final List f279271b;

    /* JADX INFO: renamed from: c */
    public final List f279272c;

    /* JADX INFO: renamed from: d */
    public final w5x f279273d;

    /* JADX INFO: renamed from: e */
    public final boolean f279274e;

    /* JADX INFO: renamed from: f */
    public final boolean f279275f;

    /* JADX INFO: renamed from: g */
    public final xzk f279276g;

    /* JADX INFO: renamed from: h */
    public final boolean f279277h;

    /* JADX INFO: renamed from: i */
    public final boolean f279278i;

    /* JADX INFO: renamed from: j */
    public final xzk f279279j;

    /* JADX INFO: renamed from: k */
    public final x2b f279280k;

    /* JADX INFO: renamed from: l */
    public final t6x0 f279281l;

    /* JADX INFO: renamed from: m */
    public final ProxySelector f279282m;

    /* JADX INFO: renamed from: n */
    public final xzk f279283n;

    /* JADX INFO: renamed from: o */
    public final SocketFactory f279284o;

    /* JADX INFO: renamed from: p */
    public final SSLSocketFactory f279285p;

    /* JADX INFO: renamed from: q */
    public final X509TrustManager f279286q;

    /* JADX INFO: renamed from: r */
    public final List f279287r;

    /* JADX INFO: renamed from: s */
    public final List f279288s;

    /* JADX INFO: renamed from: t */
    public final HostnameVerifier f279289t;

    /* JADX INFO: renamed from: u */
    public final sic f279290u;

    /* JADX INFO: renamed from: v */
    public final q3d0 f279291v;

    /* JADX INFO: renamed from: w */
    public final int f279292w;

    /* JADX INFO: renamed from: x */
    public final int f279293x;

    /* JADX INFO: renamed from: y */
    public final int f279294y;

    /* JADX INFO: renamed from: z */
    public final int f279295z;

    public z4l0(y4l0 y4l0Var) throws NoSuchAlgorithmException, KeyStoreException {
        this.f279270a = y4l0Var.f269172a;
        this.f279271b = c0f1.m31139j(y4l0Var.f269174c);
        this.f279272c = c0f1.m31139j(y4l0Var.f269175d);
        this.f279273d = y4l0Var.f269176e;
        this.f279274e = y4l0Var.f269177f;
        this.f279275f = y4l0Var.f269178g;
        this.f279276g = y4l0Var.f269179h;
        this.f279277h = y4l0Var.f269180i;
        this.f279278i = y4l0Var.f269181j;
        this.f279279j = y4l0Var.f269182k;
        this.f279280k = y4l0Var.f269183l;
        this.f279281l = y4l0Var.f269184m;
        ProxySelector proxySelector = y4l0Var.f269185n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = elk0.f60729a;
        }
        this.f279282m = proxySelector;
        this.f279283n = y4l0Var.f269186o;
        this.f279284o = y4l0Var.f269187p;
        List list = y4l0Var.f269190s;
        this.f279287r = list;
        this.f279288s = y4l0Var.f269191t;
        this.f279289t = y4l0Var.f269192u;
        this.f279292w = y4l0Var.f269195x;
        this.f279293x = y4l0Var.f269196y;
        this.f279294y = y4l0Var.f269197z;
        this.f279295z = y4l0Var.f269166A;
        this.f279264A = y4l0Var.f269167B;
        this.f279265B = y4l0Var.f269168C;
        this.f279266C = y4l0Var.f269169D;
        utu0 utu0Var = y4l0Var.f269170E;
        this.f279267D = utu0Var == null ? new utu0(3) : utu0Var;
        lv61 lv61Var = y4l0Var.f269171F;
        this.f279268E = lv61Var == null ? lv61.f137239l : lv61Var;
        xyi xyiVar = y4l0Var.f269173b;
        if (xyiVar == null) {
            TimeUnit timeUnit = TimeUnit.MINUTES;
            xyiVar = new xyi(5, 5L);
            y4l0Var.f269173b = xyiVar;
        }
        this.f279269F = xyiVar;
        if (list != null && list.isEmpty()) {
            this.f279285p = null;
            this.f279291v = null;
            this.f279286q = null;
            this.f279290u = sic.f209392c;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.f279285p = null;
                this.f279291v = null;
                this.f279286q = null;
                this.f279290u = sic.f209392c;
                break;
            }
            if (((nzi) it.next()).f160093a) {
                SSLSocketFactory sSLSocketFactory = y4l0Var.f269188q;
                if (sSLSocketFactory != null) {
                    this.f279285p = sSLSocketFactory;
                    q3d0 q3d0Var = y4l0Var.f269194w;
                    wj50.m88279p(q3d0Var);
                    this.f279291v = q3d0Var;
                    X509TrustManager x509TrustManager = y4l0Var.f269189r;
                    wj50.m88279p(x509TrustManager);
                    this.f279286q = x509TrustManager;
                    sic sicVar = y4l0Var.f269193v;
                    this.f279290u = wj50.m88271j(sicVar.f209394b, q3d0Var) ? sicVar : new sic(sicVar.f209393a, q3d0Var);
                    break;
                }
                wco0 wco0Var = wco0.f250081a;
                wco0.f250081a.getClass();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                wj50.m88279p(trustManagers);
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                        this.f279286q = x509TrustManager2;
                        wco0 wco0Var2 = wco0.f250081a;
                        wco0Var2.getClass();
                        try {
                            SSLContext sSLContextMo47866l = wco0Var2.mo47866l();
                            sSLContextMo47866l.init(null, new TrustManager[]{x509TrustManager2}, null);
                            this.f279285p = sSLContextMo47866l.getSocketFactory();
                            q3d0 q3d0VarMo47859c = wco0.f250081a.mo47859c(x509TrustManager2);
                            this.f279291v = q3d0VarMo47859c;
                            sic sicVar2 = y4l0Var.f269193v;
                            this.f279290u = wj50.m88271j(sicVar2.f209394b, q3d0VarMo47859c) ? sicVar2 : new sic(sicVar2.f209393a, q3d0VarMo47859c);
                            break;
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS: " + e, e);
                        }
                    }
                }
                throw new IllegalStateException("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)).toString());
            }
        }
        X509TrustManager x509TrustManager3 = this.f279286q;
        q3d0 q3d0Var2 = this.f279291v;
        SSLSocketFactory sSLSocketFactory2 = this.f279285p;
        List list2 = this.f279272c;
        List list3 = this.f279271b;
        if (list3.contains(null)) {
            throw new IllegalStateException(("Null interceptor: " + list3).toString());
        }
        if (list2.contains(null)) {
            throw new IllegalStateException(("Null network interceptor: " + list2).toString());
        }
        List list4 = this.f279287r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((nzi) it2.next()).f160093a) {
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("sslSocketFactory == null");
                    }
                    if (q3d0Var2 == null) {
                        throw new IllegalStateException("certificateChainCleaner == null");
                    }
                    if (x509TrustManager3 == null) {
                        throw new IllegalStateException("x509TrustManager == null");
                    }
                    return;
                }
            }
        }
        if (sSLSocketFactory2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (q3d0Var2 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (x509TrustManager3 != null) {
            throw new IllegalStateException("Check failed.");
        }
        if (!wj50.m88271j(this.f279290u, sic.f209392c)) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: a */
    public final y4l0 m95347a() {
        y4l0 y4l0Var = new y4l0();
        y4l0Var.f269172a = this.f279270a;
        y4l0Var.f269173b = this.f279269F;
        j6f.m52564V(this.f279271b, y4l0Var.f269174c);
        j6f.m52564V(this.f279272c, y4l0Var.f269175d);
        y4l0Var.f269176e = this.f279273d;
        y4l0Var.f269177f = this.f279274e;
        y4l0Var.f269178g = this.f279275f;
        y4l0Var.f269179h = this.f279276g;
        y4l0Var.f269180i = this.f279277h;
        y4l0Var.f269181j = this.f279278i;
        y4l0Var.f269182k = this.f279279j;
        y4l0Var.f269183l = this.f279280k;
        y4l0Var.f269184m = this.f279281l;
        y4l0Var.f269185n = this.f279282m;
        y4l0Var.f269186o = this.f279283n;
        y4l0Var.f269187p = this.f279284o;
        y4l0Var.f269188q = this.f279285p;
        y4l0Var.f269189r = this.f279286q;
        y4l0Var.f269190s = this.f279287r;
        y4l0Var.f269191t = this.f279288s;
        y4l0Var.f269192u = this.f279289t;
        y4l0Var.f269193v = this.f279290u;
        y4l0Var.f269194w = this.f279291v;
        y4l0Var.f269195x = this.f279292w;
        y4l0Var.f269196y = this.f279293x;
        y4l0Var.f269197z = this.f279294y;
        y4l0Var.f269166A = this.f279295z;
        y4l0Var.f269167B = this.f279264A;
        y4l0Var.f269168C = this.f279265B;
        y4l0Var.f269169D = this.f279266C;
        y4l0Var.f269170E = this.f279267D;
        y4l0Var.f269171F = this.f279268E;
        return y4l0Var;
    }

    /* JADX INFO: renamed from: b */
    public final zuu0 m95348b(auw0 auw0Var) {
        return new zuu0(this, auw0Var, false);
    }

    /* JADX INFO: renamed from: c */
    public final yvu0 m95349c(auw0 auw0Var, grl0 grl0Var) {
        yvu0 yvu0Var = new yvu0(this.f279268E, auw0Var, grl0Var, new Random(), this.f279264A, this.f279266C, this.f279265B);
        if (auw0Var.f20039c.m78534b("Sec-WebSocket-Extensions") != null) {
            yvu0.m94746c(yvu0Var, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return yvu0Var;
        }
        y4l0 y4l0VarM95347a = m95347a();
        TimeZone timeZone = c0f1.f32774a;
        y4l0VarM95347a.f269176e = new pxd1();
        ArrayList arrayList = new ArrayList(yvu0.f276750x);
        r3t0 r3t0Var = r3t0.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(r3t0Var) && !arrayList.contains(r3t0.HTTP_1_1)) {
            throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
        }
        if (arrayList.contains(r3t0Var) && arrayList.size() > 1) {
            throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
        }
        if (arrayList.contains(r3t0.HTTP_1_0)) {
            throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
        }
        if (arrayList.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        }
        arrayList.remove(r3t0.SPDY_3);
        if (!arrayList.equals(y4l0VarM95347a.f269191t)) {
            y4l0VarM95347a.f269170E = null;
        }
        y4l0VarM95347a.f269191t = Collections.unmodifiableList(arrayList);
        z4l0 z4l0Var = new z4l0(y4l0VarM95347a);
        ztw0 ztw0VarM27219b = auw0Var.m27219b();
        ztw0VarM27219b.f286277c.m77925B("Upgrade", "websocket");
        ztw0VarM27219b.f286277c.m77925B("Connection", "Upgrade");
        ztw0VarM27219b.f286277c.m77925B("Sec-WebSocket-Key", yvu0Var.f276757g);
        ztw0VarM27219b.f286277c.m77925B("Sec-WebSocket-Version", "13");
        ztw0VarM27219b.f286277c.m77925B("Sec-WebSocket-Extensions", "permessage-deflate");
        auw0 auw0Var2 = new auw0(ztw0VarM27219b);
        zuu0 zuu0Var = new zuu0(z4l0Var, auw0Var2, true);
        yvu0Var.f276758h = zuu0Var;
        zuu0Var.m97070e(new u4l0(11, yvu0Var, auw0Var2));
        return yvu0Var;
    }

    public z4l0() {
        this(new y4l0());
    }
}
