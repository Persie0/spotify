package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class uyh0 implements xyh0 {

    /* JADX INFO: renamed from: a */
    public final String f235257a;

    /* JADX INFO: renamed from: b */
    public final int f235258b;

    public uyh0(String str, int i) {
        this.f235257a = str;
        this.f235258b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uyh0)) {
            return false;
        }
        uyh0 uyh0Var = (uyh0) obj;
        return wj50.m88271j(this.f235257a, uyh0Var.f235257a) && this.f235258b == uyh0Var.f235258b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f235258b) + (this.f235257a.hashCode() * 31);
    }
}
