package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ea01 implements fa01 {

    /* JADX INFO: renamed from: a */
    public final int f57562a;

    /* JADX INFO: renamed from: b */
    public final String f57563b;

    public ea01(int i, String str) {
        this.f57562a = i;
        this.f57563b = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("A non-empty URL must be provided.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea01)) {
            return false;
        }
        ea01 ea01Var = (ea01) obj;
        return this.f57562a == ea01Var.f57562a && this.f57563b.equals(ea01Var.f57563b);
    }

    @Override // p204p.fa01
    /* JADX INFO: renamed from: g */
    public final int mo35391g() {
        return this.f57562a;
    }

    public final int hashCode() {
        return this.f57563b.hashCode() + (Integer.hashCode(this.f57562a) * 31);
    }
}
