package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class p770 extends h870 {

    /* JADX INFO: renamed from: a */
    public final String f174614a;

    /* JADX INFO: renamed from: b */
    public final int f174615b;

    /* JADX INFO: renamed from: c */
    public final String f174616c;

    public p770(String str, int i) {
        this.f174614a = str;
        this.f174615b = i;
        if (i <= 0) {
            throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
        }
        StringBuilder sb = new StringBuilder("ArrayKClassValue(");
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.f174614a);
        int i3 = this.f174615b;
        for (int i4 = 0; i4 < i3; i4++) {
            sb.append(">");
        }
        sb.append(")");
        this.f174616c = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p770)) {
            return false;
        }
        p770 p770Var = (p770) obj;
        return wj50.m88271j(this.f174614a, p770Var.f174614a) && this.f174615b == p770Var.f174615b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f174615b) + (this.f174614a.hashCode() * 31);
    }

    public final String toString() {
        return this.f174616c;
    }
}
