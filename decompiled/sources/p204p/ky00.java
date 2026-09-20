package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class ky00 extends ly00 {

    /* JADX INFO: renamed from: a */
    public final int f127610a;

    /* JADX INFO: renamed from: b */
    public final String f127611b;

    public ky00(int i, String str) {
        this.f127610a = i;
        this.f127611b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky00)) {
            return false;
        }
        ky00 ky00Var = (ky00) obj;
        return this.f127610a == ky00Var.f127610a && wj50.m88271j(this.f127611b, ky00Var.f127611b);
    }

    public final int hashCode() {
        return this.f127611b.hashCode() + (Integer.hashCode(this.f127610a) * 31);
    }
}
