package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class pr80 implements sr80 {

    /* JADX INFO: renamed from: a */
    public final rp80 f180528a;

    public pr80(rp80 rp80Var) {
        this.f180528a = rp80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pr80) && wj50.m88271j(this.f180528a, ((pr80) obj).f180528a);
    }

    public final int hashCode() {
        return this.f180528a.hashCode();
    }
}
