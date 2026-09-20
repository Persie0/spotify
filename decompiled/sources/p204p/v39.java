package p204p;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes11.dex */
public final class v39 implements cl91 {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f236812a;

    public v39(X509Certificate... x509CertificateArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Object linkedHashSet = linkedHashMap.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, linkedHashSet);
            }
            ((Set) linkedHashSet).add(x509Certificate);
        }
        this.f236812a = linkedHashMap;
    }

    @Override // p204p.cl91
    /* JADX INFO: renamed from: a */
    public final X509Certificate mo33258a(X509Certificate x509Certificate) {
        Set set = (Set) this.f236812a.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        for (Object obj2 : set) {
            try {
                x509Certificate.verify(((X509Certificate) obj2).getPublicKey());
                obj = obj2;
                break;
            } catch (Exception unused) {
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof v39) && wj50.m88271j(((v39) obj).f236812a, this.f236812a);
        }
        return true;
    }

    public final int hashCode() {
        return this.f236812a.hashCode();
    }
}
