package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class i670 implements j670 {

    /* JADX INFO: renamed from: a */
    public final int f99114a;

    public i670(int i) {
        this.f99114a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i670) && this.f99114a == ((i670) obj).f99114a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99114a);
    }
}
