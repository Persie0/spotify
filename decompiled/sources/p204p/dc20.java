package p204p;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class dc20 {

    /* JADX INFO: renamed from: a */
    public final gx71 f47404a;

    /* JADX INFO: renamed from: b */
    public final pde f47405b;

    /* JADX INFO: renamed from: c */
    public final List f47406c;

    /* JADX INFO: renamed from: d */
    public final wg61 f47407d;

    public dc20(gx71 gx71Var, pde pdeVar, List list, eh00 eh00Var) {
        this.f47404a = gx71Var;
        this.f47405b = pdeVar;
        this.f47406c = list;
        this.f47407d = new wg61(new es3(eh00Var, 2));
    }

    /* JADX INFO: renamed from: a */
    public final List m35618a() {
        return (List) this.f47407d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dc20)) {
            return false;
        }
        dc20 dc20Var = (dc20) obj;
        return dc20Var.f47404a == this.f47404a && wj50.m88271j(dc20Var.f47405b, this.f47405b) && wj50.m88271j(dc20Var.m35618a(), m35618a()) && wj50.m88271j(dc20Var.f47406c, this.f47406c);
    }

    public final int hashCode() {
        return this.f47406c.hashCode() + ((m35618a().hashCode() + ((this.f47405b.hashCode() + ((this.f47404a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listM35618a = m35618a();
        ArrayList arrayList = new ArrayList(i6f.m49804T(listM35618a, 10));
        for (Certificate certificate : listM35618a) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f47404a);
        sb.append(" cipherSuite=");
        sb.append(this.f47405b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f47406c;
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
