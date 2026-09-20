package p204p;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes11.dex */
public final class gl4 implements cl91 {

    /* JADX INFO: renamed from: a */
    public final X509TrustManager f80989a;

    /* JADX INFO: renamed from: b */
    public final Method f80990b;

    public gl4(X509TrustManager x509TrustManager, Method method) {
        this.f80989a = x509TrustManager;
        this.f80990b = method;
    }

    @Override // p204p.cl91
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo33258a(X509Certificate x509Certificate) {
        try {
            return ((TrustAnchor) this.f80990b.invoke(this.f80989a, x509Certificate)).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl4)) {
            return false;
        }
        gl4 gl4Var = (gl4) obj;
        return wj50.m88271j(this.f80989a, gl4Var.f80989a) && wj50.m88271j(this.f80990b, gl4Var.f80990b);
    }

    public final int hashCode() {
        return this.f80990b.hashCode() + (this.f80989a.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f80989a + ", findByIssuerAndSignatureMethod=" + this.f80990b + ')';
    }
}
