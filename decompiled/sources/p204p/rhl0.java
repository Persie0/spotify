package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class rhl0 implements shl0 {

    /* JADX INFO: renamed from: a */
    public final String f199254a;

    /* JADX INFO: renamed from: b */
    public final f5r f199255b;

    public rhl0(String str, f5r f5rVar) {
        this.f199254a = str;
        this.f199255b = f5rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhl0)) {
            return false;
        }
        rhl0 rhl0Var = (rhl0) obj;
        return wj50.m88271j(this.f199254a, rhl0Var.f199254a) && wj50.m88271j(this.f199255b, rhl0Var.f199255b);
    }

    public final int hashCode() {
        return this.f199255b.hashCode() + (this.f199254a.hashCode() * 31);
    }
}
