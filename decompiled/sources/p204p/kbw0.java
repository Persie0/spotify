package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class kbw0 implements pbw0 {

    /* JADX INFO: renamed from: a */
    public final b7x0 f121297a;

    /* JADX INFO: renamed from: b */
    public final boolean f121298b;

    public kbw0(b7x0 b7x0Var, boolean z) {
        this.f121297a = b7x0Var;
        this.f121298b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbw0)) {
            return false;
        }
        kbw0 kbw0Var = (kbw0) obj;
        return wj50.m88271j(this.f121297a, kbw0Var.f121297a) && this.f121298b == kbw0Var.f121298b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121298b) + (this.f121297a.hashCode() * 31);
    }
}
