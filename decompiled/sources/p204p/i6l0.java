package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class i6l0 {

    /* JADX INFO: renamed from: a */
    public final String f99288a;

    /* JADX INFO: renamed from: b */
    public final boolean f99289b;

    public i6l0(String str, boolean z) {
        this.f99288a = str;
        this.f99289b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6l0)) {
            return false;
        }
        i6l0 i6l0Var = (i6l0) obj;
        return wj50.m88271j(this.f99288a, i6l0Var.f99288a) && this.f99289b == i6l0Var.f99289b;
    }

    public final int hashCode() {
        String str = this.f99288a;
        return Boolean.hashCode(this.f99289b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
