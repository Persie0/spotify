package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class r3b0 implements v3b0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f195470a;

    public r3b0(Throwable th) {
        this.f195470a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3b0) && wj50.m88271j(this.f195470a, ((r3b0) obj).f195470a);
    }

    public final int hashCode() {
        return this.f195470a.hashCode();
    }
}
