package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class uu80 extends av80 {

    /* JADX INFO: renamed from: a */
    public final int f234121a;

    /* JADX INFO: renamed from: b */
    public final i6a0 f234122b;

    public uu80(int i, i6a0 i6a0Var) {
        this.f234121a = i;
        this.f234122b = i6a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu80)) {
            return false;
        }
        uu80 uu80Var = (uu80) obj;
        return this.f234121a == uu80Var.f234121a && wj50.m88271j(this.f234122b, uu80Var.f234122b);
    }

    public final int hashCode() {
        return this.f234122b.hashCode() + (Integer.hashCode(this.f234121a) * 31);
    }
}
