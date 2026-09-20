package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class qdp0 {

    /* JADX INFO: renamed from: a */
    public final String f187733a;

    /* JADX INFO: renamed from: b */
    public final String f187734b;

    /* JADX INFO: renamed from: c */
    public final long f187735c;

    /* JADX INFO: renamed from: d */
    public final boolean f187736d;

    public qdp0(String str, String str2, long j, boolean z) {
        this.f187733a = str;
        this.f187734b = str2;
        this.f187735c = j;
        this.f187736d = z;
    }

    /* JADX INFO: renamed from: a */
    public final long m72595a() {
        return this.f187735c;
    }

    /* JADX INFO: renamed from: b */
    public final String m72596b() {
        return this.f187734b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdp0)) {
            return false;
        }
        qdp0 qdp0Var = (qdp0) obj;
        return wj50.m88271j(this.f187733a, qdp0Var.f187733a) && wj50.m88271j(this.f187734b, qdp0Var.f187734b) && this.f187735c == qdp0Var.f187735c && this.f187736d == qdp0Var.f187736d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f187736d) + dq60.m36605e(s571.m77243b(this.f187733a.hashCode() * 31, 31, this.f187734b), this.f187735c, 31);
    }
}
