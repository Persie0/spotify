package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class mhl0 implements shl0 {

    /* JADX INFO: renamed from: a */
    public final String f143834a;

    /* JADX INFO: renamed from: b */
    public final f5r f143835b;

    public mhl0(String str, f5r f5rVar) {
        this.f143834a = str;
        this.f143835b = f5rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhl0)) {
            return false;
        }
        mhl0 mhl0Var = (mhl0) obj;
        return wj50.m88271j(this.f143834a, mhl0Var.f143834a) && wj50.m88271j(this.f143835b, mhl0Var.f143835b);
    }

    public final int hashCode() {
        return this.f143835b.hashCode() + (this.f143834a.hashCode() * 31);
    }
}
