package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class fuk0 {

    /* JADX INFO: renamed from: a */
    public final int f73519a;

    /* JADX INFO: renamed from: b */
    public final String f73520b;

    /* JADX INFO: renamed from: c */
    public final ebf0 f73521c;

    public fuk0(int i, String str, ebf0 ebf0Var) {
        this.f73519a = i;
        this.f73520b = str;
        this.f73521c = ebf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuk0)) {
            return false;
        }
        fuk0 fuk0Var = (fuk0) obj;
        return this.f73519a == fuk0Var.f73519a && wj50.m88271j(this.f73520b, fuk0Var.f73520b) && wj50.m88271j(this.f73521c, fuk0Var.f73521c);
    }

    public final int hashCode() {
        return this.f73521c.f57921a.hashCode() + s571.m77243b(Integer.hashCode(this.f73519a) * 31, 31, this.f73520b);
    }
}
