package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class qhs0 extends ths0 {

    /* JADX INFO: renamed from: a */
    public final String f188846a;

    /* JADX INFO: renamed from: b */
    public final String f188847b;

    /* JADX INFO: renamed from: c */
    public final long f188848c;

    /* JADX INFO: renamed from: d */
    public final boolean f188849d;

    public qhs0(String str, String str2, long j, boolean z) {
        this.f188846a = str;
        this.f188847b = str2;
        this.f188848c = j;
        this.f188849d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qhs0)) {
            return false;
        }
        qhs0 qhs0Var = (qhs0) obj;
        return this.f188846a.equals(qhs0Var.f188846a) && this.f188847b.equals(qhs0Var.f188847b) && this.f188848c == qhs0Var.f188848c && this.f188849d == qhs0Var.f188849d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188849d) + dq60.m36605e(s571.m77243b(this.f188846a.hashCode() * 31, 31, this.f188847b), this.f188848c, 31);
    }
}
