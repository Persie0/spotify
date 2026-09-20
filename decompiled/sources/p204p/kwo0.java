package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class kwo0 {

    /* JADX INFO: renamed from: a */
    public final jwo0 f127136a;

    /* JADX INFO: renamed from: b */
    public final jwo0 f127137b;

    public kwo0(jwo0 jwo0Var, jwo0 jwo0Var2) {
        this.f127136a = jwo0Var;
        this.f127137b = jwo0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kwo0)) {
            return false;
        }
        kwo0 kwo0Var = (kwo0) obj;
        return this.f127136a == kwo0Var.f127136a && this.f127137b == kwo0Var.f127137b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f127137b.hashCode() + (this.f127136a.hashCode() * 31)) * 31);
    }
}
