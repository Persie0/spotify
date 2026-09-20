package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fi31 implements mi31 {

    /* JADX INFO: renamed from: a */
    public final String f69766a;

    /* JADX INFO: renamed from: b */
    public final boolean f69767b;

    public fi31(String str, boolean z) {
        this.f69766a = str;
        this.f69767b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fi31)) {
            return false;
        }
        fi31 fi31Var = (fi31) obj;
        return wj50.m88271j(this.f69766a, fi31Var.f69766a) && this.f69767b == fi31Var.f69767b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69767b) + (this.f69766a.hashCode() * 31);
    }
}
