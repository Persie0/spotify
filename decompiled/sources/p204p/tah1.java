package p204p;

import java.security.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes4.dex */
public final class tah1 {

    /* JADX INFO: renamed from: c */
    public static final tah1 f218611c = new tah1("NIST_P256", e4h1.f56092a);

    /* JADX INFO: renamed from: d */
    public static final tah1 f218612d = new tah1("NIST_P384", e4h1.f56093b);

    /* JADX INFO: renamed from: e */
    public static final tah1 f218613e = new tah1("NIST_P521", e4h1.f56094c);

    /* JADX INFO: renamed from: a */
    public final String f218614a;

    /* JADX INFO: renamed from: b */
    public final ECParameterSpec f218615b;

    public tah1(String str, ECParameterSpec eCParameterSpec) {
        this.f218614a = str;
        this.f218615b = eCParameterSpec;
    }

    public final String toString() {
        return this.f218614a;
    }
}
