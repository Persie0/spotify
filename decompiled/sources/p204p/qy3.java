package p204p;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes2.dex */
public final class qy3 extends q3d0 {

    /* JADX INFO: renamed from: c */
    public final X509TrustManager f193794c;

    /* JADX INFO: renamed from: d */
    public final X509TrustManagerExtensions f193795d;

    public qy3(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f193794c = x509TrustManager;
        this.f193795d = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qy3) && ((qy3) obj).f193794c == this.f193794c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f193794c);
    }

    @Override // p204p.q3d0
    /* JADX INFO: renamed from: s */
    public final List mo24506s(String str, List list) throws SSLPeerUnverifiedException {
        try {
            return this.f193795d.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
