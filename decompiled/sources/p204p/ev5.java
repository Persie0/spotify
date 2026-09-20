package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ev5 extends ov5 {

    /* JADX INFO: renamed from: a */
    public final String f63140a;

    /* JADX INFO: renamed from: b */
    public final d850 f63141b;

    public ev5(String str, d850 d850Var) {
        this.f63140a = str;
        this.f63141b = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev5)) {
            return false;
        }
        ev5 ev5Var = (ev5) obj;
        return wj50.m88271j(this.f63140a, ev5Var.f63140a) && wj50.m88271j(this.f63141b, ev5Var.f63141b);
    }

    public final int hashCode() {
        return this.f63141b.hashCode() + (this.f63140a.hashCode() * 31);
    }
}
