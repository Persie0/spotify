package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class pz61 {

    /* JADX INFO: renamed from: a */
    public final int f183617a;

    /* JADX INFO: renamed from: b */
    public final int f183618b;

    /* JADX INFO: renamed from: c */
    public final boolean f183619c;

    public pz61(int i, int i2, boolean z) {
        this.f183617a = i;
        this.f183618b = i2;
        this.f183619c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz61)) {
            return false;
        }
        pz61 pz61Var = (pz61) obj;
        return this.f183617a == pz61Var.f183617a && this.f183618b == pz61Var.f183618b && this.f183619c == pz61Var.f183619c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183619c) + mt60.m62800g(this.f183618b, Integer.hashCode(this.f183617a) * 31, 31);
    }
}
