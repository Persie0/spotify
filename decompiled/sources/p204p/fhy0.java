package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class fhy0 {

    /* JADX INFO: renamed from: a */
    public final String f69730a;

    /* JADX INFO: renamed from: b */
    public final gh00 f69731b;

    public fhy0(String str, gh00 gh00Var) {
        this.f69730a = str;
        this.f69731b = gh00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhy0)) {
            return false;
        }
        fhy0 fhy0Var = (fhy0) obj;
        return wj50.m88271j(this.f69730a, fhy0Var.f69730a) && wj50.m88271j(this.f69731b, fhy0Var.f69731b);
    }

    public final int hashCode() {
        return this.f69731b.hashCode() + (this.f69730a.hashCode() * 31);
    }
}
