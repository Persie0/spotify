package p204p;

import com.spotify.cosmos.cosmos.Request;
import java.net.ProtocolException;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class yvu0 implements old1, tld1 {

    /* JADX INFO: renamed from: x */
    public static final List f276750x = geg1.m44518y(r3t0.HTTP_1_1);

    /* JADX INFO: renamed from: a */
    public final grl0 f276751a;

    /* JADX INFO: renamed from: b */
    public final Random f276752b;

    /* JADX INFO: renamed from: c */
    public final long f276753c;

    /* JADX INFO: renamed from: e */
    public final long f276755e;

    /* JADX INFO: renamed from: f */
    public final long f276756f;

    /* JADX INFO: renamed from: g */
    public final String f276757g;

    /* JADX INFO: renamed from: h */
    public zuu0 f276758h;

    /* JADX INFO: renamed from: i */
    public tqr f276759i;

    /* JADX INFO: renamed from: j */
    public uld1 f276760j;

    /* JADX INFO: renamed from: k */
    public zld1 f276761k;

    /* JADX INFO: renamed from: l */
    public final kv61 f276762l;

    /* JADX INFO: renamed from: m */
    public String f276763m;

    /* JADX INFO: renamed from: n */
    public rb5 f276764n;

    /* JADX INFO: renamed from: q */
    public long f276767q;

    /* JADX INFO: renamed from: r */
    public boolean f276768r;

    /* JADX INFO: renamed from: t */
    public String f276770t;

    /* JADX INFO: renamed from: u */
    public boolean f276771u;

    /* JADX INFO: renamed from: v */
    public int f276772v;

    /* JADX INFO: renamed from: w */
    public boolean f276773w;

    /* JADX INFO: renamed from: d */
    public rld1 f276754d = null;

    /* JADX INFO: renamed from: o */
    public final ArrayDeque f276765o = new ArrayDeque();

    /* JADX INFO: renamed from: p */
    public final ArrayDeque f276766p = new ArrayDeque();

    /* JADX INFO: renamed from: s */
    public int f276769s = -1;

    public yvu0(lv61 lv61Var, auw0 auw0Var, grl0 grl0Var, Random random, long j, long j2, long j3) {
        this.f276751a = grl0Var;
        this.f276752b = random;
        this.f276753c = j;
        this.f276755e = j2;
        this.f276756f = j3;
        this.f276762l = lv61Var.m60068d();
        String str = auw0Var.f20038b;
        if (!Request.GET.equals(str)) {
            throw new IllegalArgumentException(edb.m38564m("Request must be GET: ", str).toString());
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.f276757g = a7j0.m24946H(bArr).mo51744a();
    }

    /* JADX INFO: renamed from: c */
    public static void m94746c(yvu0 yvu0Var, Exception exc, n2x0 n2x0Var, int i) {
        zld1 zld1Var;
        if ((i & 2) != 0) {
            n2x0Var = null;
        }
        boolean z = (i & 4) == 0;
        rlv0 rlv0Var = new rlv0();
        synchronized (yvu0Var) {
            try {
                if (yvu0Var.f276771u) {
                    return;
                }
                yvu0Var.f276771u = true;
                rb5 rb5Var = yvu0Var.f276764n;
                zld1 zld1Var2 = yvu0Var.f276761k;
                rlv0Var.f200373a = zld1Var2;
                yvu0Var.f276761k = null;
                if (!z && zld1Var2 != null) {
                    kv61.m57439c(yvu0Var.f276762l, yvu0Var.f276763m + " writer close", 0L, new ew40(rlv0Var, 11), 2);
                }
                yvu0Var.f276762l.m57445g();
                try {
                    yvu0Var.f276751a.mo40716D(exc, n2x0Var);
                } finally {
                    if (rb5Var != null) {
                        rb5Var.cancel();
                    }
                    if (z && (zld1Var = (zld1) rlv0Var.f200373a) != null) {
                        a0f1.m24341b(zld1Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final ck31 m94747a(n2x0 n2x0Var) {
        sn20 sn20Var = n2x0Var.f149862f;
        int i = n2x0Var.f149860d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(dq60.m36617q(sb, n2x0Var.f149859c, '\''));
        }
        String strM78534b = sn20Var.m78534b("Connection");
        if (strM78534b == null) {
            strM78534b = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strM78534b)) {
            throw new ProtocolException(dq60.m36608h('\'', "Expected 'Connection' header value 'Upgrade' but was '", strM78534b));
        }
        String strM78534b2 = sn20Var.m78534b("Upgrade");
        if (strM78534b2 == null) {
            strM78534b2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strM78534b2)) {
            throw new ProtocolException(dq60.m36608h('\'', "Expected 'Upgrade' header value 'websocket' but was '", strM78534b2));
        }
        String strM78534b3 = sn20Var.m78534b("Sec-WebSocket-Accept");
        String str = strM78534b3 != null ? strM78534b3 : null;
        byte[] bArrM56679u = kk40.m56679u(this.f276757g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bArrM56679u, 0, bArrM56679u.length);
        byte[] bArrDigest = messageDigest.digest();
        wj50.m88279p(bArrDigest);
        String strMo51744a = new iva(bArrDigest).mo51744a();
        if (wj50.m88271j(strMo51744a, str)) {
            ck31 ck31Var = n2x0Var.f149864h;
            if (ck31Var != null) {
                return ck31Var;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strMo51744a + "' but was '" + str + '\'');
    }

    /* JADX INFO: renamed from: b */
    public final boolean m94748b(int i, String str) {
        iva ivaVar;
        long j = this.f276756f;
        synchronized (this) {
            try {
                w1h1.m87010o(i);
                if (str != null) {
                    ivaVar = new iva(kk40.m56679u(str));
                    ivaVar.f106180c = str;
                    if (ivaVar.f106178a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                } else {
                    ivaVar = null;
                }
                if (!this.f276771u && !this.f276768r) {
                    this.f276768r = true;
                    this.f276766p.add(new wvu0(i, j, ivaVar));
                    m94750e();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m94749d() {
        int i;
        String str;
        uld1 uld1Var;
        boolean z;
        synchronized (this) {
            try {
                i = this.f276769s;
                str = this.f276770t;
                uld1Var = this.f276760j;
                this.f276760j = null;
                if (this.f276768r && this.f276766p.isEmpty()) {
                    zld1 zld1Var = this.f276761k;
                    if (zld1Var != null) {
                        this.f276761k = null;
                        kv61.m57439c(this.f276762l, this.f276763m + " writer close", 0L, new ew40(zld1Var, 10), 2);
                    }
                    this.f276762l.m57445g();
                }
                z = (this.f276771u || this.f276761k != null || this.f276769s == -1) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            grl0 grl0Var = this.f276751a;
            wj50.m88279p(str);
            grl0Var.mo40714B(i, str);
        }
        if (uld1Var != null) {
            a0f1.m24341b(uld1Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m94750e() {
        TimeZone timeZone = c0f1.f32774a;
        tqr tqrVar = this.f276759i;
        if (tqrVar != null) {
            this.f276762l.m57443d(tqrVar, 0L);
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m94751f(int i, iva ivaVar) {
        if (!this.f276771u && !this.f276768r) {
            long j = this.f276767q;
            byte[] bArr = ivaVar.f106178a;
            if (((long) bArr.length) + j > 16777216) {
                m94748b(1001, null);
                return false;
            }
            this.f276767q = j + ((long) bArr.length);
            this.f276766p.add(new xvu0(i, ivaVar));
            m94750e();
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m94752g() {
        String str;
        int i;
        zld1 zld1Var;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.f276771u) {
                    return false;
                }
                zld1 zld1Var2 = this.f276761k;
                Object objPoll = this.f276765o.poll();
                Object obj = null;
                if (objPoll == null) {
                    Object objPoll2 = this.f276766p.poll();
                    if (objPoll2 instanceof wvu0) {
                        i = this.f276769s;
                        str = this.f276770t;
                        if (i != -1) {
                            zld1Var = this.f276761k;
                            this.f276761k = null;
                            if (zld1Var != null && this.f276760j == null) {
                                z = true;
                            }
                            this.f276762l.m57445g();
                        } else {
                            long jM89159a = ((wvu0) objPoll2).m89159a();
                            kv61.m57439c(this.f276762l, this.f276763m + " cancel", TimeUnit.MILLISECONDS.toNanos(jM89159a), new ew40(this, 12), 4);
                            zld1Var = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        zld1Var = null;
                    }
                    obj = objPoll2;
                } else {
                    str = null;
                    i = -1;
                    zld1Var = null;
                }
                try {
                    if (objPoll != null) {
                        wj50.m88279p(zld1Var2);
                        zld1Var2.m96362a(10, (iva) objPoll);
                    } else if (obj instanceof xvu0) {
                        wj50.m88279p(zld1Var2);
                        zld1Var2.m96363c(((xvu0) obj).m92257b(), ((xvu0) obj).m92256a());
                        synchronized (this) {
                            this.f276767q -= (long) ((xvu0) obj).m92256a().mo51747d();
                        }
                    } else {
                        if (!(obj instanceof wvu0)) {
                            throw new AssertionError();
                        }
                        wj50.m88279p(zld1Var2);
                        int iM89160b = ((wvu0) obj).m89160b();
                        iva ivaVarM89161c = ((wvu0) obj).m89161c();
                        iva ivaVarMo45417J0 = iva.f106177d;
                        if (iM89160b != 0 || ivaVarM89161c != null) {
                            if (iM89160b != 0) {
                                w1h1.m87010o(iM89160b);
                            }
                            npa npaVar = new npa();
                            npaVar.m65302N(iM89160b);
                            if (ivaVarM89161c != null) {
                                ivaVarM89161c.mo51760s(npaVar, ivaVarM89161c.mo51747d());
                            }
                            ivaVarMo45417J0 = npaVar.mo45417J0(npaVar.f156904b);
                        }
                        try {
                            zld1Var2.m96362a(8, ivaVarMo45417J0);
                            zld1Var2.f283994h = true;
                            if (z) {
                                grl0 grl0Var = this.f276751a;
                                wj50.m88279p(str);
                                grl0Var.mo40714B(i, str);
                            }
                        } catch (Throwable th) {
                            zld1Var2.f283994h = true;
                            throw th;
                        }
                    }
                    if (zld1Var != null) {
                        a0f1.m24341b(zld1Var);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (zld1Var != null) {
                        a0f1.m24341b(zld1Var);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
