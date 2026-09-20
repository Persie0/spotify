package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class kie1 extends mie1 {

    /* JADX INFO: renamed from: a */
    public final String f122952a;

    /* JADX INFO: renamed from: b */
    public final boolean f122953b;

    public kie1(String str, boolean z) {
        this.f122952a = str;
        this.f122953b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kie1)) {
            return false;
        }
        kie1 kie1Var = (kie1) obj;
        return this.f122952a.equals(kie1Var.f122952a) && this.f122953b == kie1Var.f122953b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122953b) + (this.f122952a.hashCode() * 31);
    }
}
