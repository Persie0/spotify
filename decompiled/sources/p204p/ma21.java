package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class ma21 implements na21 {

    /* JADX INFO: renamed from: a */
    public final Throwable f141439a;

    public ma21(Throwable th) {
        this.f141439a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ma21) && wj50.m88271j(this.f141439a, ((ma21) obj).f141439a);
    }

    public final int hashCode() {
        return this.f141439a.hashCode();
    }
}
