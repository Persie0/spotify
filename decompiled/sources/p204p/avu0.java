package p204p;

import androidx.car.app.model.Alert;
import com.spotify.playbacknative.AudioDriver;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes2.dex */
public final class avu0 extends dg30 implements egx {

    /* JADX INFO: renamed from: b */
    public final lv61 f20263b;

    /* JADX INFO: renamed from: c */
    public final smx0 f20264c;

    /* JADX INFO: renamed from: d */
    public final Socket f20265d;

    /* JADX INFO: renamed from: e */
    public final Socket f20266e;

    /* JADX INFO: renamed from: f */
    public final dc20 f20267f;

    /* JADX INFO: renamed from: g */
    public final r3t0 f20268g;

    /* JADX INFO: renamed from: h */
    public final rb5 f20269h;

    /* JADX INFO: renamed from: i */
    public final int f20270i;

    /* JADX INFO: renamed from: j */
    public fg30 f20271j;

    /* JADX INFO: renamed from: k */
    public boolean f20272k;

    /* JADX INFO: renamed from: l */
    public boolean f20273l;

    /* JADX INFO: renamed from: m */
    public int f20274m;

    /* JADX INFO: renamed from: n */
    public int f20275n;

    /* JADX INFO: renamed from: o */
    public int f20276o;

    /* JADX INFO: renamed from: p */
    public int f20277p = 1;

    /* JADX INFO: renamed from: q */
    public final ArrayList f20278q = new ArrayList();

    /* JADX INFO: renamed from: r */
    public long f20279r = Long.MAX_VALUE;

    public avu0(lv61 lv61Var, smx0 smx0Var, Socket socket, Socket socket2, dc20 dc20Var, r3t0 r3t0Var, rb5 rb5Var, int i) {
        this.f20263b = lv61Var;
        this.f20264c = smx0Var;
        this.f20265d = socket;
        this.f20266e = socket2;
        this.f20267f = dc20Var;
        this.f20268g = r3t0Var;
        this.f20269h = rb5Var;
        this.f20270i = i;
    }

    /* JADX INFO: renamed from: f */
    public static void m27259f(z4l0 z4l0Var, smx0 smx0Var, IOException iOException) {
        if (smx0Var.f210739b.type() != Proxy.Type.DIRECT) {
            yv1 yv1Var = smx0Var.f210738a;
            yv1Var.f276528g.connectFailed(yv1Var.f276529h.m69945i(), smx0Var.f210739b.address(), iOException);
        }
        utu0 utu0Var = z4l0Var.f279267D;
        synchronized (utu0Var) {
            ((LinkedHashSet) utu0Var.f233995a).add(smx0Var);
        }
    }

    @Override // p204p.dg30
    /* JADX INFO: renamed from: a */
    public final void mo27260a(x601 x601Var) {
        synchronized (this) {
            this.f20277p = (x601Var.f258552a & 8) != 0 ? x601Var.f258553b[3] : Alert.DURATION_SHOW_INDEFINITELY;
        }
    }

    @Override // p204p.egx
    /* JADX INFO: renamed from: b */
    public final void mo27261b() {
        synchronized (this) {
            this.f20272k = true;
        }
    }

    @Override // p204p.dg30
    /* JADX INFO: renamed from: c */
    public final void mo27262c(mg30 mg30Var) {
        mg30Var.m61681c(8, null);
    }

    @Override // p204p.egx
    public final void cancel() {
        c0f1.m31132c(this.f20265d);
    }

    @Override // p204p.egx
    /* JADX INFO: renamed from: d */
    public final smx0 mo27263d() {
        return this.f20264c;
    }

    @Override // p204p.egx
    /* JADX INFO: renamed from: e */
    public final void mo27264e(zuu0 zuu0Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.f20271j != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.f20272k = true;
                        if (this.f20275n == 0) {
                            if (iOException != null) {
                                m27259f(zuu0Var.f286530a, this.f20264c, iOException);
                            }
                            this.f20274m++;
                        }
                    }
                } else if (((StreamResetException) iOException).f10944a == 8) {
                    int i = this.f20276o + 1;
                    this.f20276o = i;
                    if (i > 1) {
                        this.f20272k = true;
                        this.f20274m++;
                    }
                } else if (((StreamResetException) iOException).f10944a != 9 || !zuu0Var.f286524P0) {
                    this.f20272k = true;
                    this.f20274m++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m27265g(yv1 yv1Var, List list) {
        ph30 ph30Var = yv1Var.f276529h;
        TimeZone timeZone = c0f1.f32774a;
        if (this.f20278q.size() < this.f20277p && !this.f20272k) {
            smx0 smx0Var = this.f20264c;
            yv1 yv1Var2 = smx0Var.f210738a;
            yv1 yv1Var3 = smx0Var.f210738a;
            if (yv1Var2.m94672a(yv1Var)) {
                if (!wj50.m88271j(ph30Var.f177459d, yv1Var3.f276529h.f177459d)) {
                    if (this.f20271j != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            smx0 smx0Var2 = (smx0) it.next();
                            Proxy.Type type = smx0Var2.f210739b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && smx0Var.f210739b.type() == type2 && wj50.m88271j(smx0Var.f210740c, smx0Var2.f210740c)) {
                                if (yv1Var.f276525d != t4l0.f217044a) {
                                    break;
                                }
                                TimeZone timeZone2 = c0f1.f32774a;
                                ph30 ph30Var2 = yv1Var3.f276529h;
                                int i = ph30Var.f177460e;
                                String str = ph30Var.f177459d;
                                if (i != ph30Var2.f177460e) {
                                    break;
                                }
                                boolean zM88271j = wj50.m88271j(str, ph30Var2.f177459d);
                                dc20 dc20Var = this.f20267f;
                                if (!zM88271j) {
                                    if (!this.f20273l && dc20Var != null) {
                                        List listM35618a = dc20Var.m35618a();
                                        if (listM35618a.isEmpty() || !t4l0.m80071b(str, (X509Certificate) listM35618a.get(0))) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    sic sicVar = yv1Var.f276526e;
                                    wj50.m88279p(sicVar);
                                    wj50.m88279p(dc20Var);
                                    dc20Var.m35618a();
                                    Iterator it2 = sicVar.f209393a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    ikc0.m50942n(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m27266h(boolean z) {
        long j;
        TimeZone timeZone = c0f1.f32774a;
        long jNanoTime = System.nanoTime();
        if (this.f20265d.isClosed() || this.f20266e.isClosed() || this.f20266e.isInputShutdown() || this.f20266e.isOutputShutdown()) {
            return false;
        }
        fg30 fg30Var = this.f20271j;
        if (fg30Var != null) {
            synchronized (fg30Var) {
                if (fg30Var.f69207f) {
                    return false;
                }
                return fg30Var.f69187M0 >= fg30Var.f69186L0 || jNanoTime < fg30Var.f69188N0;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.f20279r;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.f20266e;
        vuu0 vuu0Var = (vuu0) this.f20269h.f197472c;
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !vuu0Var.mo45420R0();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m27267i() throws SocketException {
        this.f20279r = System.nanoTime();
        r3t0 r3t0Var = this.f20268g;
        if (r3t0Var == r3t0.HTTP_2 || r3t0Var == r3t0.H2_PRIOR_KNOWLEDGE) {
            this.f20266e.setSoTimeout(0);
            xzk xzkVar = xzk.f267694Z;
            oiz oizVar = oiz.f165912a;
            lv61 lv61Var = this.f20263b;
            bg30 bg30Var = new bg30();
            bg30Var.f26821b = lv61Var;
            bg30Var.f26824e = dg30.f48710a;
            bg30Var.f26825f = oiz.f165912a;
            rb5 rb5Var = this.f20269h;
            String str = this.f20264c.f210738a.f276529h.f177459d;
            bg30Var.f26822c = rb5Var;
            bg30Var.f26823d = c0f1.f32775b + ' ' + str;
            bg30Var.f26824e = this;
            bg30Var.f26820a = this.f20270i;
            bg30Var.f26825f = oizVar;
            fg30 fg30Var = new fg30(bg30Var);
            this.f20271j = fg30Var;
            x601 x601Var = fg30.f69185Y0;
            this.f20277p = (x601Var.f258552a & 8) != 0 ? x601Var.f258553b[3] : Alert.DURATION_SHOW_INDEFINITELY;
            ng30 ng30Var = fg30Var.f69196V0;
            synchronized (ng30Var) {
                try {
                    if (ng30Var.f153543d) {
                        throw new IOException("closed");
                    }
                    Logger logger = ng30.f153539f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(c0f1.m31133d(">> CONNECTION " + uf30.f229666a.mo51748e(), new Object[0]));
                    }
                    ng30Var.f153540a.mo42409q1(uf30.f229666a);
                    ng30Var.f153540a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            ng30 ng30Var2 = fg30Var.f69196V0;
            x601 x601Var2 = fg30Var.f69190P0;
            synchronized (ng30Var2) {
                try {
                    if (ng30Var2.f153543d) {
                        throw new IOException("closed");
                    }
                    ng30Var2.m64371e(0, Integer.bitCount(x601Var2.f258552a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & x601Var2.f258552a) == 0) {
                            z = false;
                        }
                        if (z) {
                            ng30Var2.f153540a.writeShort(i);
                            ng30Var2.f153540a.writeInt(x601Var2.f258553b[i]);
                        }
                    }
                    ng30Var2.f153540a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iM90052a = fg30Var.f69190P0.m90052a();
            if (iM90052a != 65535) {
                fg30Var.f69196V0.m64376k(0, iM90052a - AudioDriver.SPOTIFY_MAX_VOLUME);
            }
            kv61.m57439c(fg30Var.f69208g.m60068d(), fg30Var.f69204c, 0L, fg30Var.f69197W0, 6);
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        smx0 smx0Var = this.f20264c;
        sb.append(smx0Var.f210738a.f276529h.f177459d);
        sb.append(':');
        sb.append(smx0Var.f210738a.f276529h.f177460e);
        sb.append(", proxy=");
        sb.append(smx0Var.f210739b);
        sb.append(" hostAddress=");
        sb.append(smx0Var.f210740c);
        sb.append(" cipherSuite=");
        dc20 dc20Var = this.f20267f;
        if (dc20Var == null || (obj = dc20Var.f47405b) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f20268g);
        sb.append('}');
        return sb.toString();
    }
}
