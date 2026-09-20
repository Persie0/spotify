package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class z5e1 implements l6e1 {

    /* JADX INFO: renamed from: a */
    public final x67 f279550a;

    /* JADX INFO: renamed from: b */
    public final String f279551b;

    public z5e1(x67 x67Var, String str) {
        this.f279550a = x67Var;
        this.f279551b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5e1)) {
            return false;
        }
        z5e1 z5e1Var = (z5e1) obj;
        return wj50.m88271j(this.f279550a, z5e1Var.f279550a) && wj50.m88271j(this.f279551b, z5e1Var.f279551b);
    }

    public final int hashCode() {
        return this.f279551b.hashCode() + (this.f279550a.hashCode() * 31);
    }
}
