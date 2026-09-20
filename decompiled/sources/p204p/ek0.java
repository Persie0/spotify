package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class ek0 implements gk0 {

    /* JADX INFO: renamed from: a */
    public final String f60325a;

    /* JADX INFO: renamed from: b */
    public final boolean f60326b;

    public ek0(String str, boolean z) {
        this.f60325a = str;
        this.f60326b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ek0)) {
            return false;
        }
        ek0 ek0Var = (ek0) obj;
        return wj50.m88271j(this.f60325a, ek0Var.f60325a) && this.f60326b == ek0Var.f60326b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f60326b) + (this.f60325a.hashCode() * 31);
    }
}
