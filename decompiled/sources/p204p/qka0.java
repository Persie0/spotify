package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class qka0 {

    /* JADX INFO: renamed from: a */
    public final String f189513a;

    /* JADX INFO: renamed from: b */
    public final boolean f189514b;

    public qka0(String str, boolean z) {
        this.f189513a = str;
        this.f189514b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qka0)) {
            return false;
        }
        qka0 qka0Var = (qka0) obj;
        return wj50.m88271j(this.f189513a, qka0Var.f189513a) && this.f189514b == qka0Var.f189514b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189514b) + (this.f189513a.hashCode() * 31);
    }
}
