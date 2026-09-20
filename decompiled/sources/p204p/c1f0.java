package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class c1f0 extends d1f0 {

    /* JADX INFO: renamed from: a */
    public final String f33083a;

    /* JADX INFO: renamed from: b */
    public final String f33084b;

    /* JADX INFO: renamed from: c */
    public final ker0 f33085c;

    public c1f0(String str, String str2, ker0 ker0Var) {
        this.f33083a = str;
        this.f33084b = str2;
        this.f33085c = ker0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1f0)) {
            return false;
        }
        c1f0 c1f0Var = (c1f0) obj;
        return wj50.m88271j(this.f33083a, c1f0Var.f33083a) && wj50.m88271j(this.f33084b, c1f0Var.f33084b) && this.f33085c == c1f0Var.f33085c;
    }

    public final int hashCode() {
        return this.f33085c.hashCode() + s571.m77243b(this.f33083a.hashCode() * 31, 31, this.f33084b);
    }
}
