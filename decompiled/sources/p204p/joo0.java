package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class joo0 {

    /* JADX INFO: renamed from: a */
    public final kts0 f114474a;

    public joo0(kts0 kts0Var) {
        this.f114474a = kts0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof joo0) && wj50.m88271j(this.f114474a, ((joo0) obj).f114474a);
    }

    public final int hashCode() {
        kts0 kts0Var = this.f114474a;
        if (kts0Var == null) {
            return 0;
        }
        return kts0Var.hashCode();
    }
}
