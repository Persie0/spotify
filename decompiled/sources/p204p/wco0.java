package p204p;

import android.os.Build;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wco0 {

    /* JADX INFO: renamed from: a */
    public static volatile wco0 f250081a;

    /* JADX INFO: renamed from: b */
    public static final Logger f250082b;

    static {
        try {
            for (Map.Entry entry : hf4.f90592b.entrySet()) {
                hf4.m47324b((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (RuntimeException e) {
            System.err.println("Possibly running android unit test without robolectric");
            e.printStackTrace();
        } catch (UnsatisfiedLinkError e2) {
            System.err.println("Possibly running android unit test without robolectric");
            e2.printStackTrace();
        }
        wco0 kt3Var = kt3.f126124e ? new kt3() : null;
        if (kt3Var == null) {
            boolean z = hl4.f92609e;
            kt3Var = q350.m72052g();
        }
        if (kt3Var == null) {
            throw new IllegalStateException(s571.m77246e(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
        }
        f250081a = kt3Var;
        f250082b = Logger.getLogger(z4l0.class.getName());
    }

    /* JADX INFO: renamed from: c */
    public q3d0 mo47859c(X509TrustManager x509TrustManager) {
        return new a29(mo47860d(x509TrustManager));
    }

    /* JADX INFO: renamed from: d */
    public cl91 mo47860d(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new v39((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo47861e(SSLSocket sSLSocket, String str, List list);

    /* JADX INFO: renamed from: f */
    public void mo47862f(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX INFO: renamed from: g */
    public abstract String mo47863g(SSLSocket sSLSocket);

    /* JADX INFO: renamed from: h */
    public Object mo57291h() {
        if (f250082b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo47864i(String str);

    /* JADX INFO: renamed from: j */
    public abstract void mo47865j(String str, int i, Throwable th);

    /* JADX INFO: renamed from: k */
    public void mo57292k(Object obj, String str) {
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        mo47865j(str, 5, (Throwable) obj);
    }

    /* JADX INFO: renamed from: l */
    public abstract SSLContext mo47866l();

    public final String toString() {
        return getClass().getSimpleName();
    }
}
