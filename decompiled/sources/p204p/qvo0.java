package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class qvo0 implements cwo0 {

    /* JADX INFO: renamed from: a */
    public final String f193076a;

    /* JADX INFO: renamed from: b */
    public final boolean f193077b;

    public qvo0(String str, boolean z) {
        this.f193076a = str;
        this.f193077b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvo0)) {
            return false;
        }
        qvo0 qvo0Var = (qvo0) obj;
        return wj50.m88271j(this.f193076a, qvo0Var.f193076a) && this.f193077b == qvo0Var.f193077b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f193077b) + (this.f193076a.hashCode() * 31);
    }
}
