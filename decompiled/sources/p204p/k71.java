package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class k71 extends t71 {

    /* JADX INFO: renamed from: a */
    public final String f119899a;

    /* JADX INFO: renamed from: b */
    public final boolean f119900b;

    public k71(String str, boolean z) {
        this.f119899a = str;
        this.f119900b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k71)) {
            return false;
        }
        k71 k71Var = (k71) obj;
        return wj50.m88271j(this.f119899a, k71Var.f119899a) && this.f119900b == k71Var.f119900b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f119900b) + (this.f119899a.hashCode() * 31);
    }
}
