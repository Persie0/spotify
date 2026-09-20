package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ihl0 implements shl0 {

    /* JADX INFO: renamed from: a */
    public final f5r f102316a;

    /* JADX INFO: renamed from: b */
    public final String f102317b;

    public ihl0(String str, f5r f5rVar) {
        this.f102316a = f5rVar;
        this.f102317b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihl0)) {
            return false;
        }
        ihl0 ihl0Var = (ihl0) obj;
        return wj50.m88271j(this.f102316a, ihl0Var.f102316a) && wj50.m88271j(this.f102317b, ihl0Var.f102317b);
    }

    public final int hashCode() {
        return this.f102317b.hashCode() + (this.f102316a.hashCode() * 31);
    }
}
