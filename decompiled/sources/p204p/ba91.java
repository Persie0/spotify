package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class ba91 {

    /* JADX INFO: renamed from: a */
    public final String f25121a;

    /* JADX INFO: renamed from: b */
    public final boolean f25122b;

    public ba91(String str, boolean z) {
        this.f25121a = str;
        this.f25122b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba91)) {
            return false;
        }
        ba91 ba91Var = (ba91) obj;
        return wj50.m88271j(this.f25121a, ba91Var.f25121a) && this.f25122b == ba91Var.f25122b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25122b) + (this.f25121a.hashCode() * 31);
    }
}
