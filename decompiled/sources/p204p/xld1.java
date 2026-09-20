package p204p;

import io.ably.lib.types.AblyException;
import io.ably.lib.types.ErrorInfo;
import io.ably.lib.types.ProtocolMessage;
import io.ably.lib.types.ProtocolSerializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.java_websocket.exceptions.InvalidHandshakeException;

/* JADX INFO: loaded from: classes15.dex */
public final class xld1 implements Runnable, nld1 {

    /* JADX INFO: renamed from: L0 */
    public Thread f263111L0;

    /* JADX INFO: renamed from: M0 */
    public final CountDownLatch f263112M0;

    /* JADX INFO: renamed from: N0 */
    public final CountDownLatch f263113N0;

    /* JADX INFO: renamed from: O0 */
    public final C1761d0 f263114O0;

    /* JADX INFO: renamed from: P0 */
    public final vld1 f263115P0;

    /* JADX INFO: renamed from: Q0 */
    public Timer f263116Q0;

    /* JADX INFO: renamed from: R0 */
    public TimerTask f263117R0;

    /* JADX INFO: renamed from: S0 */
    public long f263118S0;

    /* JADX INFO: renamed from: T0 */
    public boolean f263119T0;

    /* JADX INFO: renamed from: U0 */
    public final /* synthetic */ yld1 f263120U0;

    /* JADX INFO: renamed from: X */
    public OutputStream f263121X;

    /* JADX INFO: renamed from: Y */
    public final Proxy f263122Y;

    /* JADX INFO: renamed from: Z */
    public Thread f263123Z;

    /* JADX INFO: renamed from: a */
    public i3o0 f263124a;

    /* JADX INFO: renamed from: b */
    public final xra0 f263125b;

    /* JADX INFO: renamed from: c */
    public ScheduledExecutorService f263126c;

    /* JADX INFO: renamed from: d */
    public ScheduledFuture f263127d;

    /* JADX INFO: renamed from: e */
    public final long f263128e;

    /* JADX INFO: renamed from: f */
    public final Object f263129f;

    /* JADX INFO: renamed from: g */
    public final URI f263130g;

    /* JADX INFO: renamed from: h */
    public final sld1 f263131h;

    /* JADX INFO: renamed from: i */
    public Socket f263132i;

    /* JADX INFO: renamed from: t */
    public SocketFactory f263133t;

    public xld1(yld1 yld1Var, URI uri, vld1 vld1Var) {
        this.f263120U0 = yld1Var;
        dcs dcsVar = new dcs();
        this.f263125b = bsa0.m30425b(xld1.class);
        this.f263128e = TimeUnit.SECONDS.toNanos(60L);
        this.f263129f = new Object();
        this.f263130g = null;
        this.f263131h = null;
        this.f263132i = null;
        this.f263133t = null;
        this.f263122Y = Proxy.NO_PROXY;
        this.f263112M0 = new CountDownLatch(1);
        this.f263113N0 = new CountDownLatch(1);
        this.f263114O0 = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        this.f263130g = uri;
        this.f263114O0 = new C1761d0();
        this.f263131h = new sld1(this, dcsVar);
        this.f263116Q0 = new Timer();
        this.f263117R0 = null;
        this.f263119T0 = true;
        this.f263115P0 = vld1Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m91421a(xld1 xld1Var, nld1 nld1Var, long j) {
        xra0 xra0Var = xld1Var.f263125b;
        if (nld1Var instanceof sld1) {
            sld1 sld1Var = (sld1) nld1Var;
            if (sld1Var.f210396Z < j) {
                xra0Var.mo27141l(sld1Var, "Closing connection due to no pong received: {}");
                sld1Var.m78461d("The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection", 1006, false);
            } else {
                if (sld1Var.f210401e != 2) {
                    xra0Var.mo27141l(sld1Var, "Trying to ping a non open connection: {}");
                    return;
                }
                xld1 xld1Var2 = sld1Var.f210399c;
                if (xld1Var2.f263124a == null) {
                    xld1Var2.f263124a = new i3o0(4, 0);
                }
                i3o0 i3o0Var = xld1Var2.f263124a;
                if (i3o0Var == null) {
                    throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
                }
                sld1Var.m78471n(i3o0Var);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m91422b(xld1 xld1Var) {
        synchronized (xld1Var) {
            xld1Var.f263117R0 = null;
            long jM91425e = xld1Var.m91425e() - (System.currentTimeMillis() - xld1Var.f263118S0);
            if (jM91425e > 0) {
                tx8.m81897l("p.yld1", "onActivityTimerExpiry: ok");
                xld1Var.m91434n(jM91425e + 100);
                return;
            }
            tx8.m81889d("p.yld1", "No activity for " + xld1Var.m91425e() + "ms, closing connection");
            xld1Var.f263131h.m78460c(1006, "timed out");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m91423c() {
        if (this.f263111L0 != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.f263111L0 = thread;
        thread.setName("WebSocketConnectReadThread-" + this.f263111L0.getId());
        this.f263111L0.start();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m91424d() {
        this.f263118S0 = System.currentTimeMillis();
        this.f263120U0.f273987c.m86801u(this.f263118S0);
        if (this.f263117R0 == null && this.f263120U0.f273987c.f246145w != 0) {
            synchronized (this) {
                long jM91425e = m91425e();
                if (jM91425e == 0) {
                    tx8.m81897l("p.yld1", "checkActivity: infinite timeout");
                } else if (this.f263117R0 == null) {
                    m91434n(jM91425e + 100);
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final long m91425e() {
        yld1 yld1Var = this.f263120U0;
        return yld1Var.f273987c.f246145w + yld1Var.f273987c.f246124b.f7157a.realtimeRequestTimeout;
    }

    /* JADX INFO: renamed from: f */
    public final int m91426f() {
        URI uri = this.f263130g;
        int port = uri.getPort();
        String scheme = uri.getScheme();
        if ("wss".equals(scheme)) {
            if (port == -1) {
                return 443;
            }
        } else {
            if (!"ws".equals(scheme)) {
                throw new IllegalArgumentException("unknown scheme: " + scheme);
            }
            if (port == -1) {
                return 80;
            }
        }
        return port;
    }

    /* JADX INFO: renamed from: g */
    public final void m91427g(Exception exc) {
        tx8.m81890e("p.yld1", "Connection error ", exc);
        yld1 yld1Var = this.f263120U0;
        ((vyi) yld1Var.f273990f).m86796p(yld1Var, new ErrorInfo(exc.getMessage(), 503, 80000));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX INFO: renamed from: h */
    public final void m91428h(String str, int i, boolean z) {
        ErrorInfo errorInfo;
        synchronized (this.f263129f) {
            try {
                if (this.f263126c != null || this.f263127d != null) {
                    this.f263125b.mo27145p("Connection lost timer stopped");
                    ScheduledExecutorService scheduledExecutorService = this.f263126c;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.shutdownNow();
                        this.f263126c = null;
                    }
                    ScheduledFuture scheduledFuture = this.f263127d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f263127d = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Thread thread = this.f263123Z;
        if (thread != null) {
            thread.interrupt();
        }
        tx8.m81888c("p.yld1", "onClose(): wsCode = " + i + "; wsReason = " + str + "; remote = " + z);
        if (i == -2 || i == -1 || i == 1000 || i == 1001) {
            errorInfo = vyi.f246122z;
        } else if (i == 1003) {
            errorInfo = vyi.f246119C;
        } else if (i == 1006) {
            errorInfo = vyi.f246122z;
        } else if (i != 1008) {
            errorInfo = i != 1009 ? vyi.f246118B : vyi.f246120D;
        } else {
            errorInfo = vyi.f246119C;
        }
        ((vyi) this.f263120U0.f273990f).m86796p(this.f263120U0, errorInfo);
        synchronized (this) {
            try {
                this.f263116Q0.cancel();
                this.f263116Q0 = null;
            } catch (IllegalStateException unused) {
            }
        }
        this.f263112M0.countDown();
        this.f263113N0.countDown();
    }

    /* JADX INFO: renamed from: i */
    public final void m91429i(String str) {
        try {
            ProtocolMessage protocolMessageFromJSON = ProtocolSerializer.fromJSON(str);
            tx8.m81888c("p.yld1", "onMessage(): msg (text) = " + protocolMessageFromJSON);
            this.f263115P0.m85946a(protocolMessageFromJSON);
        } catch (AblyException e) {
            tx8.m81890e("p.yld1", "Unexpected exception processing received text message", e);
        }
        m91424d();
    }

    /* JADX INFO: renamed from: j */
    public final void m91430j(ByteBuffer byteBuffer) {
        try {
            ProtocolMessage msgpack = ProtocolSerializer.readMsgpack(byteBuffer.array());
            tx8.m81888c("p.yld1", "onMessage(): msg (binary) = " + msgpack);
            this.f263115P0.m85946a(msgpack);
        } catch (AblyException e) {
            tx8.m81890e("p.yld1", "Unexpected exception processing received binary message", e);
        }
        m91424d();
    }

    /* JADX INFO: renamed from: k */
    public final void m91431k(gc20 gc20Var) {
        synchronized (this.f263129f) {
            try {
                if (this.f263128e <= 0) {
                    this.f263125b.mo27145p("Connection lost timer deactivated");
                } else {
                    this.f263125b.mo27145p("Connection lost timer started");
                    ScheduledExecutorService scheduledExecutorService = this.f263126c;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.shutdownNow();
                        this.f263126c = null;
                    }
                    ScheduledFuture scheduledFuture = this.f263127d;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        this.f263127d = null;
                    }
                    this.f263126c = Executors.newSingleThreadScheduledExecutor(new fvi0());
                    RunnableC1972ia runnableC1972ia = new RunnableC1972ia(this);
                    ScheduledExecutorService scheduledExecutorService2 = this.f263126c;
                    long j = this.f263128e;
                    this.f263127d = scheduledExecutorService2.scheduleAtFixedRate(runnableC1972ia, j, j, TimeUnit.NANOSECONDS);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        tx8.m81888c("p.yld1", "onOpen()");
        yld1 yld1Var = this.f263120U0;
        if (yld1Var.f273986b.f117278a.tls && this.f263119T0) {
            String str = yld1Var.f273986b.f117279b;
            Socket socket = this.f263132i;
            if (!(socket instanceof SSLSocket)) {
                throw new IllegalArgumentException("This websocket uses ws instead of wss. No SSLSession available.");
            }
            SSLSession session = ((SSLSocket) socket).getSession();
            if (HttpsURLConnection.getDefaultHostnameVerifier().verify(str, session)) {
                tx8.m81897l("p.yld1", "Successfully verified hostname");
                ((vyi) yld1Var.f273990f).m86795o(yld1Var);
                m91424d();
            } else {
                tx8.m81889d("p.yld1", "Hostname verification failed, expected " + str + ", found " + session.getPeerHost());
                if (this.f263123Z != null) {
                    this.f263131h.m78459b();
                }
            }
        } else {
            ((vyi) yld1Var.f273990f).m86795o(yld1Var);
            m91424d();
        }
        this.f263112M0.countDown();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m91432l() throws IOException {
        Proxy proxy = Proxy.NO_PROXY;
        Proxy proxy2 = this.f263122Y;
        if (proxy2 != proxy) {
            this.f263132i = new Socket(proxy2);
            return true;
        }
        SocketFactory socketFactory = this.f263133t;
        if (socketFactory != null) {
            this.f263132i = socketFactory.createSocket();
            return false;
        }
        Socket socket = this.f263132i;
        if (socket == null) {
            this.f263132i = new Socket(proxy2);
            return true;
        }
        if (socket.isClosed()) {
            throw new IOException();
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m91433m() throws InvalidHandshakeException {
        String str;
        URI uri = this.f263130g;
        String rawPath = uri.getRawPath();
        String rawQuery = uri.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int iM91426f = m91426f();
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getHost());
        if (iM91426f == 80 || iM91426f == 443) {
            str = "";
        } else {
            str = ":" + iM91426f;
        }
        sb.append(str);
        String string = sb.toString();
        ec20 ec20Var = new ec20();
        ec20Var.m38467e(rawPath);
        ec20Var.m47093d("Host", string);
        this.f263131h.m78472o(ec20Var);
    }

    /* JADX INFO: renamed from: n */
    public final synchronized void m91434n(long j) {
        if (this.f263117R0 == null) {
            wld1 wld1Var = new wld1(this);
            this.f263117R0 = wld1Var;
            synchronized (this) {
                Timer timer = this.f263116Q0;
                if (timer != null) {
                    try {
                        timer.schedule(wld1Var, j);
                    } catch (IllegalStateException e) {
                        tx8.m81890e("p.yld1", "Unexpected exception scheduling activity timer", e);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m91435o() throws NoSuchAlgorithmException, KeyManagementException {
        SSLSocketFactory socketFactory;
        SocketFactory socketFactory2 = this.f263133t;
        if (socketFactory2 instanceof SSLSocketFactory) {
            socketFactory = (SSLSocketFactory) socketFactory2;
        } else {
            SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
            sSLContext.init(null, null, null);
            socketFactory = sSLContext.getSocketFactory();
        }
        this.f263132i = socketFactory.createSocket(this.f263132i, this.f263130g.getHost(), m91426f(), true);
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        sld1 sld1Var = this.f263131h;
        try {
            boolean zM91432l = m91432l();
            this.f263132i.setTcpNoDelay(false);
            this.f263132i.setReuseAddress(false);
            boolean zIsConnected = this.f263132i.isConnected();
            URI uri = this.f263130g;
            if (!zIsConnected) {
                this.f263132i.connect(this.f263114O0 == null ? InetSocketAddress.createUnresolved(uri.getHost(), m91426f()) : new InetSocketAddress(C1761d0.m34486a(uri), m91426f()), 0);
            }
            if (zM91432l && "wss".equals(uri.getScheme())) {
                m91435o();
            }
            Socket socket = this.f263132i;
            if (socket instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) socket;
                SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                try {
                    sSLParameters.setEndpointIdentificationAlgorithm("HTTPS");
                    this.f263119T0 = false;
                } catch (NoSuchMethodError e) {
                    tx8.m81898m(e);
                    this.f263119T0 = true;
                }
                sSLSocket.setSSLParameters(sSLParameters);
            }
            InputStream inputStream = this.f263132i.getInputStream();
            this.f263121X = this.f263132i.getOutputStream();
            m91433m();
            Thread thread = new Thread(new iyi(this, this));
            this.f263123Z = thread;
            thread.start();
            byte[] bArr = new byte[16384];
            while (!sld1Var.m78467j() && !sld1Var.m78466i() && (i = inputStream.read(bArr)) != -1) {
                try {
                    sld1Var.m78462e(ByteBuffer.wrap(bArr, 0, i));
                } catch (IOException e2) {
                    if (e2 instanceof SSLException) {
                        m91427g(e2);
                    }
                    sld1Var.m78464g();
                } catch (RuntimeException e3) {
                    m91427g(e3);
                    sld1Var.m78460c(1006, e3.getMessage());
                }
            }
            sld1Var.m78464g();
            this.f263111L0 = null;
        } catch (Exception e4) {
            m91427g(e4);
            sld1Var.m78460c(-1, e4.getMessage());
        } catch (InternalError e5) {
            if (!(e5.getCause() instanceof InvocationTargetException) || !(e5.getCause().getCause() instanceof IOException)) {
                throw e5;
            }
            IOException iOException = (IOException) e5.getCause().getCause();
            m91427g(iOException);
            sld1Var.m78460c(-1, iOException.getMessage());
        }
    }
}
