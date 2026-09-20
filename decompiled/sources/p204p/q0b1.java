package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class q0b1 {

    /* JADX INFO: renamed from: a */
    public final Object f183946a;

    /* JADX INFO: renamed from: b */
    public final long f183947b;

    /* JADX INFO: renamed from: c */
    public final Exception f183948c;

    public q0b1(Object obj, long j, Exception exc) {
        this.f183946a = obj;
        this.f183947b = j;
        this.f183948c = exc;
    }

    /* JADX INFO: renamed from: a */
    public final Object m71807a() {
        return this.f183946a;
    }

    /* JADX INFO: renamed from: b */
    public final long m71808b() {
        return this.f183947b;
    }

    /* JADX INFO: renamed from: c */
    public final Exception m71809c() {
        return this.f183948c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0b1)) {
            return false;
        }
        q0b1 q0b1Var = (q0b1) obj;
        return wj50.m88271j(this.f183946a, q0b1Var.f183946a) && this.f183947b == q0b1Var.f183947b && wj50.m88271j(this.f183948c, q0b1Var.f183948c);
    }

    public final int hashCode() {
        Object obj = this.f183946a;
        int iM36605e = dq60.m36605e((obj == null ? 0 : obj.hashCode()) * 31, this.f183947b, 31);
        Exception exc = this.f183948c;
        return iM36605e + (exc != null ? exc.hashCode() : 0);
    }
}
