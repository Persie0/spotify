package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class f581 implements j581 {

    /* JADX INFO: renamed from: a */
    public final int f65979a;

    /* JADX INFO: renamed from: b */
    public final String f65980b;

    public f581(int i, String str) {
        this.f65979a = i;
        this.f65980b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f581)) {
            return false;
        }
        f581 f581Var = (f581) obj;
        return this.f65979a == f581Var.f65979a && wj50.m88271j(this.f65980b, f581Var.f65980b);
    }

    public final int hashCode() {
        return this.f65980b.hashCode() + (Integer.hashCode(this.f65979a) * 31);
    }
}
