package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n47 {

    /* JADX INFO: renamed from: a */
    public final i47 f150223a;

    /* JADX INFO: renamed from: b */
    public final int f150224b;

    public n47(i47 i47Var, int i) {
        this.f150223a = i47Var;
        this.f150224b = i;
    }

    /* JADX INFO: renamed from: a */
    public final i47 m63655a() {
        return this.f150223a;
    }

    /* JADX INFO: renamed from: b */
    public final int m63656b() {
        return this.f150224b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n47)) {
            return false;
        }
        n47 n47Var = (n47) obj;
        return wj50.m88271j(this.f150223a, n47Var.f150223a) && this.f150224b == n47Var.f150224b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f150224b) + (this.f150223a.hashCode() * 31);
    }
}
