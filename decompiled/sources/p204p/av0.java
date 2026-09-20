package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class av0 {

    /* JADX INFO: renamed from: a */
    public final boolean f20058a;

    /* JADX INFO: renamed from: b */
    public final boolean f20059b;

    public av0(boolean z, boolean z2) {
        this.f20058a = z;
        this.f20059b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av0)) {
            return false;
        }
        av0 av0Var = (av0) obj;
        return this.f20058a == av0Var.f20058a && this.f20059b == av0Var.f20059b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f20059b) + (Boolean.hashCode(this.f20058a) * 31);
    }
}
