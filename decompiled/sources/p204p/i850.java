package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class i850 extends j850 {

    /* JADX INFO: renamed from: a */
    public final nh7 f99696a;

    public i850(nh7 nh7Var) {
        this.f99696a = nh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i850) && wj50.m88271j(this.f99696a, ((i850) obj).f99696a);
    }

    public final int hashCode() {
        return this.f99696a.hashCode();
    }
}
