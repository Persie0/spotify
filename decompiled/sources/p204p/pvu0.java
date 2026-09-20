package p204p;

import com.spotify.cosmos.cosmos.Request;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class pvu0 {

    /* JADX INFO: renamed from: a */
    public final lv61 f181834a;

    /* JADX INFO: renamed from: b */
    public final lfs f181835b;

    /* JADX INFO: renamed from: c */
    public final int f181836c;

    /* JADX INFO: renamed from: d */
    public final int f181837d;

    /* JADX INFO: renamed from: e */
    public final int f181838e;

    /* JADX INFO: renamed from: f */
    public final int f181839f;

    /* JADX INFO: renamed from: g */
    public final int f181840g;

    /* JADX INFO: renamed from: h */
    public final boolean f181841h;

    /* JADX INFO: renamed from: i */
    public final boolean f181842i;

    /* JADX INFO: renamed from: j */
    public final yv1 f181843j;

    /* JADX INFO: renamed from: k */
    public final utu0 f181844k;

    /* JADX INFO: renamed from: l */
    public final zuu0 f181845l;

    /* JADX INFO: renamed from: m */
    public final boolean f181846m;

    /* JADX INFO: renamed from: n */
    public sgz f181847n;

    /* JADX INFO: renamed from: o */
    public nnx0 f181848o;

    /* JADX INFO: renamed from: p */
    public smx0 f181849p;

    /* JADX INFO: renamed from: q */
    public final hj5 f181850q = new hj5();

    public pvu0(lv61 lv61Var, lfs lfsVar, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, yv1 yv1Var, utu0 utu0Var, zuu0 zuu0Var, auw0 auw0Var) {
        this.f181834a = lv61Var;
        this.f181835b = lfsVar;
        this.f181836c = i;
        this.f181837d = i2;
        this.f181838e = i3;
        this.f181839f = i4;
        this.f181840g = i5;
        this.f181841h = z;
        this.f181842i = z2;
        this.f181843j = yv1Var;
        this.f181844k = utu0Var;
        this.f181845l = zuu0Var;
        this.f181846m = !wj50.m88271j(auw0Var.f20038b, Request.GET);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m71198a(avu0 avu0Var) {
        nnx0 nnx0Var;
        smx0 smx0Var;
        if (this.f181850q.isEmpty() && this.f181849p == null) {
            if (avu0Var != null) {
                synchronized (avu0Var) {
                    smx0Var = null;
                    if (avu0Var.f20274m == 0 && avu0Var.f20272k && c0f1.m31130a(avu0Var.f20264c.f210738a.f276529h, this.f181843j.f276529h)) {
                        smx0Var = avu0Var.f20264c;
                    }
                }
                if (smx0Var != null) {
                    this.f181849p = smx0Var;
                    return true;
                }
            }
            sgz sgzVar = this.f181847n;
            if ((sgzVar == null || sgzVar.f208958b >= ((ArrayList) sgzVar.f208959c).size()) && (nnx0Var = this.f181848o) != null) {
                return nnx0Var.m65218a();
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: b */
    public final gnx0 m71199b() {
        Socket socketM97076l;
        gdx0 gdx0Var;
        zti ztiVarM71200c;
        String hostName;
        int port;
        List listM88309t;
        boolean zContains;
        avu0 avu0Var = this.f181845l.f286539t;
        if (avu0Var == null) {
            gdx0Var = null;
        } else {
            boolean zM27266h = avu0Var.m27266h(this.f181846m);
            synchronized (avu0Var) {
                try {
                    if (!zM27266h) {
                        avu0Var.f20272k = true;
                        socketM97076l = this.f181845l.m97076l();
                    } else if (!avu0Var.f20272k) {
                        ph30 ph30Var = avu0Var.f20264c.f210738a.f276529h;
                        ph30 ph30Var2 = this.f181843j.f276529h;
                        socketM97076l = !(ph30Var.f177460e == ph30Var2.f177460e && wj50.m88271j(ph30Var.f177459d, ph30Var2.f177459d)) ? this.f181845l.m97076l() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f181845l.f286539t == null) {
                if (socketM97076l != null) {
                    c0f1.m31132c(socketM97076l);
                }
                zuu0 zuu0Var = this.f181845l;
                zuu0Var.f286534e.mo80138l(zuu0Var, avu0Var);
                gdx0Var = null;
            } else {
                if (socketM97076l != null) {
                    throw new IllegalStateException("Check failed.");
                }
                gdx0Var = new gdx0(avu0Var);
            }
        }
        if (gdx0Var != null) {
            return gdx0Var;
        }
        gdx0 gdx0VarM71201d = m71201d(null, null);
        if (gdx0VarM71201d != null) {
            return gdx0VarM71201d;
        }
        if (!this.f181850q.isEmpty()) {
            return (gnx0) this.f181850q.removeFirst();
        }
        smx0 smx0Var = this.f181849p;
        if (smx0Var != null) {
            this.f181849p = null;
            ztiVarM71200c = m71200c(smx0Var, null);
        } else {
            sgz sgzVar = this.f181847n;
            if (sgzVar == null || sgzVar.f208958b >= ((ArrayList) sgzVar.f208959c).size()) {
                nnx0 nnx0Var = this.f181848o;
                if (nnx0Var == null) {
                    nnx0Var = new nnx0(this.f181843j, this.f181844k, this.f181845l, this.f181842i);
                    this.f181848o = nnx0Var;
                }
                if (!nnx0Var.m65218a()) {
                    throw new IOException("exhausted all routes");
                }
                if (!nnx0Var.m65218a()) {
                    throw new NoSuchElementException();
                }
                ArrayList arrayList = new ArrayList();
                while (nnx0Var.f156515f < nnx0Var.f156514e.size()) {
                    yv1 yv1Var = nnx0Var.f156510a;
                    if (nnx0Var.f156515f >= nnx0Var.f156514e.size()) {
                        throw new SocketException("No route to " + yv1Var.f276529h.f177459d + "; exhausted proxy configurations: " + nnx0Var.f156514e);
                    }
                    List list = nnx0Var.f156514e;
                    int i = nnx0Var.f156515f;
                    nnx0Var.f156515f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    zuu0 zuu0Var2 = nnx0Var.f156512c;
                    ArrayList arrayList2 = new ArrayList();
                    nnx0Var.f156516g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        ph30 ph30Var3 = yv1Var.f276529h;
                        hostName = ph30Var3.f177459d;
                        port = ph30Var3.f177460e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                    } else {
                        if (xze1.f267614a.m83873e(hostName)) {
                            listM88309t = geg1.m44518y(InetAddress.getByName(hostName));
                        } else {
                            zuu0Var2.f286534e.mo80142p(zuu0Var2, hostName);
                            yv1Var.f276522a.getClass();
                            try {
                                List listM29620k1 = bk5.m29620k1(InetAddress.getAllByName(hostName));
                                if (listM29620k1.isEmpty()) {
                                    throw new UnknownHostException(yv1Var.f276522a + " returned no addresses for " + hostName);
                                }
                                zuu0Var2.f286534e.mo80141o(zuu0Var2, hostName, listM29620k1);
                                listM88309t = listM29620k1;
                            } catch (NullPointerException e) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                unknownHostException.initCause(e);
                                throw unknownHostException;
                            }
                        }
                        if (nnx0Var.f156513d) {
                            listM88309t = wjf1.m88309t(listM88309t);
                        }
                        Iterator it = listM88309t.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                        }
                    }
                    Iterator it2 = nnx0Var.f156516g.iterator();
                    while (it2.hasNext()) {
                        smx0 smx0Var2 = new smx0(nnx0Var.f156510a, proxy, (InetSocketAddress) it2.next());
                        utu0 utu0Var = nnx0Var.f156511b;
                        synchronized (utu0Var) {
                            zContains = ((LinkedHashSet) utu0Var.f233995a).contains(smx0Var2);
                        }
                        if (zContains) {
                            nnx0Var.f156517h.add(smx0Var2);
                        } else {
                            arrayList.add(smx0Var2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    j6f.m52564V(nnx0Var.f156517h, arrayList);
                    nnx0Var.f156517h.clear();
                }
                sgz sgzVar2 = new sgz(arrayList);
                this.f181847n = sgzVar2;
                if (this.f181845l.f286524P0) {
                    throw new IOException("Canceled");
                }
                if (sgzVar2.f208958b >= arrayList.size()) {
                    throw new NoSuchElementException();
                }
                int i2 = sgzVar2.f208958b;
                sgzVar2.f208958b = i2 + 1;
                ztiVarM71200c = m71200c((smx0) arrayList.get(i2), arrayList);
            } else {
                int i3 = sgzVar.f208958b;
                ArrayList arrayList3 = (ArrayList) sgzVar.f208959c;
                if (i3 >= arrayList3.size()) {
                    throw new NoSuchElementException();
                }
                int i4 = sgzVar.f208958b;
                sgzVar.f208958b = i4 + 1;
                ztiVarM71200c = m71200c((smx0) arrayList3.get(i4), null);
            }
        }
        gdx0 gdx0VarM71201d2 = m71201d(ztiVarM71200c, ztiVarM71200c.f286181l);
        return gdx0VarM71201d2 != null ? gdx0VarM71201d2 : ztiVarM71200c;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX INFO: renamed from: c */
    public final zti m71200c(smx0 smx0Var, ArrayList arrayList) throws UnknownServiceException {
        auw0 auw0Var;
        r3t0 r3t0Var = r3t0.H2_PRIOR_KNOWLEDGE;
        yv1 yv1Var = smx0Var.f210738a;
        if (yv1Var.f276524c == null) {
            if (!yv1Var.f276531j.contains(nzi.f160092h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = smx0Var.f210738a.f276529h.f177459d;
            wco0 wco0Var = wco0.f250081a;
            if (!wco0.f250081a.mo47864i(str)) {
                throw new UnknownServiceException(s571.m77251j("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (yv1Var.f276530i.contains(r3t0Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        if (smx0Var.f210739b.type() != Proxy.Type.HTTP) {
            auw0Var = null;
        } else {
            yv1 yv1Var2 = smx0Var.f210738a;
            if (yv1Var2.f276524c != null || yv1Var2.f276530i.contains(r3t0Var)) {
                ztw0 ztw0Var = new ztw0();
                ztw0Var.f286275a = smx0Var.f210738a.f276529h;
                ztw0Var.m96951d("CONNECT", null);
                yv1 yv1Var3 = smx0Var.f210738a;
                ztw0Var.f286277c.m77925B("Host", c0f1.m31138i(yv1Var3.f276529h, true));
                ztw0Var.f286277c.m77925B("Proxy-Connection", "Keep-Alive");
                ztw0Var.f286277c.m77925B("User-Agent", "okhttp/5.3.2");
                auw0 auw0Var2 = new auw0(ztw0Var);
                o3x0 o3x0Var = p3x0.f173765a;
                sep sepVar = new sep(1, false);
                sepVar.m77925B("Proxy-Authenticate", "OkHttp-Preemptive");
                sepVar.m77935i();
                yv1Var3.f276527f.getClass();
                auw0Var = auw0Var2;
            } else {
                auw0Var = null;
            }
        }
        return new zti(this.f181834a, this.f181835b, this.f181836c, this.f181837d, this.f181838e, this.f181839f, this.f181840g, this.f181841h, this.f181845l, this, smx0Var, arrayList, auw0Var, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:14:0x0030, B:22:0x003d, B:25:0x0044), top: B:53:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:14:0x0030, B:22:0x003d, B:25:0x0044), top: B:53:0x0030 }] */
    /* JADX INFO: renamed from: d */
    public final gdx0 m71201d(zti ztiVar, List list) {
        avu0 avu0Var;
        boolean z;
        Socket socketM97076l;
        lfs lfsVar = this.f181835b;
        boolean z2 = this.f181846m;
        yv1 yv1Var = this.f181843j;
        zuu0 zuu0Var = this.f181845l;
        boolean z3 = ztiVar != null && ztiVar.isReady();
        Iterator it = ((ConcurrentLinkedQueue) lfsVar.f133007e).iterator();
        while (true) {
            if (!it.hasNext()) {
                avu0Var = null;
                break;
            }
            avu0Var = (avu0) it.next();
            wj50.m88279p(avu0Var);
            synchronized (avu0Var) {
                if (z3) {
                    try {
                        if (!(avu0Var.f20271j != null)) {
                            z = false;
                        } else if (avu0Var.m27265g(yv1Var, list)) {
                            zuu0Var.m97068c(avu0Var);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (avu0Var.m27265g(yv1Var, list)) {
                    z = false;
                } else {
                    zuu0Var.m97068c(avu0Var);
                    z = true;
                }
            }
            if (z) {
                if (avu0Var.m27266h(z2)) {
                    break;
                }
                synchronized (avu0Var) {
                    avu0Var.f20272k = true;
                    socketM97076l = zuu0Var.m97076l();
                }
                if (socketM97076l != null) {
                    c0f1.m31132c(socketM97076l);
                }
            }
        }
        if (avu0Var == null) {
            return null;
        }
        if (ztiVar != null) {
            this.f181849p = ztiVar.f286180k;
            Socket socket = ztiVar.f286187r;
            if (socket != null) {
                c0f1.m31132c(socket);
            }
        }
        zuu0 zuu0Var2 = this.f181845l;
        zuu0Var2.f286534e.mo55534k(zuu0Var2, avu0Var);
        return new gdx0(avu0Var);
    }
}
