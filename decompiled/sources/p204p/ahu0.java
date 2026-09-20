package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ahu0 implements ehu0 {

    /* JADX INFO: renamed from: a */
    public final String f15775a;

    /* JADX INFO: renamed from: b */
    public final Throwable f15776b;

    public ahu0(String str, Throwable th) {
        this.f15775a = str;
        this.f15776b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahu0)) {
            return false;
        }
        ahu0 ahu0Var = (ahu0) obj;
        return wj50.m88271j(this.f15775a, ahu0Var.f15775a) && wj50.m88271j(this.f15776b, ahu0Var.f15776b);
    }

    public final int hashCode() {
        return this.f15776b.hashCode() + (this.f15775a.hashCode() * 31);
    }
}
