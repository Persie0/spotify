package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class g581 implements j581 {

    /* JADX INFO: renamed from: a */
    public final int f76614a;

    /* JADX INFO: renamed from: b */
    public final String f76615b;

    public g581(int i, String str) {
        this.f76614a = i;
        this.f76615b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g581)) {
            return false;
        }
        g581 g581Var = (g581) obj;
        return this.f76614a == g581Var.f76614a && wj50.m88271j(this.f76615b, g581Var.f76615b);
    }

    public final int hashCode() {
        return this.f76615b.hashCode() + (Integer.hashCode(this.f76614a) * 31);
    }
}
