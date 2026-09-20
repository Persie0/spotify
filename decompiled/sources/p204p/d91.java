package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class d91 {

    /* JADX INFO: renamed from: a */
    public final String f46635a;

    /* JADX INFO: renamed from: b */
    public final k8j0 f46636b;

    public d91(String str, k8j0 k8j0Var) {
        this.f46635a = str;
        this.f46636b = k8j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d91)) {
            return false;
        }
        d91 d91Var = (d91) obj;
        return wj50.m88271j(this.f46635a, d91Var.f46635a) && this.f46636b == d91Var.f46636b;
    }

    public final int hashCode() {
        return this.f46636b.hashCode() + (this.f46635a.hashCode() * 31);
    }
}
