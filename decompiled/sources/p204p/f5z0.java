package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class f5z0 extends i5z0 {

    /* JADX INFO: renamed from: a */
    public final String f66224a;

    /* JADX INFO: renamed from: b */
    public final wa7 f66225b;

    public f5z0(String str, wa7 wa7Var) {
        this.f66224a = str;
        this.f66225b = wa7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5z0)) {
            return false;
        }
        f5z0 f5z0Var = (f5z0) obj;
        return wj50.m88271j(this.f66224a, f5z0Var.f66224a) && wj50.m88271j(this.f66225b, f5z0Var.f66225b);
    }

    public final int hashCode() {
        return this.f66225b.hashCode() + (this.f66224a.hashCode() * 31);
    }
}
