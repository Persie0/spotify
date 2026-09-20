package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class b451 implements c451 {

    /* JADX INFO: renamed from: a */
    public final int f23227a;

    /* JADX INFO: renamed from: b */
    public final String f23228b;

    public b451(int i, String str) {
        this.f23227a = i;
        this.f23228b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b451)) {
            return false;
        }
        b451 b451Var = (b451) obj;
        return this.f23227a == b451Var.f23227a && wj50.m88271j(this.f23228b, b451Var.f23228b);
    }

    public final int hashCode() {
        return this.f23228b.hashCode() + (Integer.hashCode(this.f23227a) * 31);
    }
}
