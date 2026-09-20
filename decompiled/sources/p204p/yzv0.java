package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class yzv0 extends b0w0 {

    /* JADX INFO: renamed from: a */
    public final int f277908a;

    /* JADX INFO: renamed from: b */
    public final String f277909b;

    public yzv0(int i, String str) {
        this.f277908a = i;
        this.f277909b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzv0)) {
            return false;
        }
        yzv0 yzv0Var = (yzv0) obj;
        return this.f277908a == yzv0Var.f277908a && wj50.m88271j(this.f277909b, yzv0Var.f277909b);
    }

    public final int hashCode() {
        return this.f277909b.hashCode() + (Integer.hashCode(this.f277908a) * 31);
    }
}
