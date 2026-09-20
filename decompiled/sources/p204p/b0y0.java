package p204p;

import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class b0y0 extends SSLSocketFactory {

    /* JADX INFO: renamed from: a */
    public final String[] f22153a = {"TLSv1.2", "TLSv1.3"};

    /* JADX INFO: renamed from: b */
    public final SSLSocketFactory f22154b;

    public b0y0(SSLSocketFactory sSLSocketFactory) {
        this.f22154b = sSLSocketFactory;
    }

    /* JADX INFO: renamed from: a */
    public final SSLSocket m27857a(Socket socket) {
        if (!(socket instanceof SSLSocket)) {
            throw new IllegalArgumentException("The socket is not an instance of the SSL socket");
        }
        SSLSocket sSLSocket = (SSLSocket) socket;
        HashSet hashSet = new HashSet(Arrays.asList(sSLSocket.getSupportedProtocols()));
        ArrayList arrayList = new ArrayList();
        for (String str : this.f22153a) {
            if (hashSet.contains(str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            throw new SecurityException("No safe protocol version is supported for this SSL socket");
        }
        sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[0]));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return m27857a(this.f22154b.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f22154b.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f22154b.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) {
        return m27857a(this.f22154b.createSocket(socket, str, i, z));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        return m27857a(this.f22154b.createSocket(str, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return m27857a(this.f22154b.createSocket(str, i, inetAddress, i2));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        return m27857a(this.f22154b.createSocket(inetAddress, i));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return m27857a(this.f22154b.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
