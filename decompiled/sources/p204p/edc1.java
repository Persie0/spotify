package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class edc1 {

    /* JADX INFO: renamed from: a */
    public final ddc1 f58500a;

    /* JADX INFO: renamed from: b */
    public final boolean f58501b;

    public edc1(ddc1 ddc1Var, boolean z) {
        this.f58500a = ddc1Var;
        this.f58501b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edc1)) {
            return false;
        }
        edc1 edc1Var = (edc1) obj;
        return wj50.m88271j(this.f58500a, edc1Var.f58500a) && this.f58501b == edc1Var.f58501b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f58501b) + (this.f58500a.hashCode() * 31);
    }
}
