package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class e4x implements h4x {

    /* JADX INFO: renamed from: a */
    public final Throwable f56192a;

    public e4x(Throwable th) {
        this.f56192a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e4x) && wj50.m88271j(this.f56192a, ((e4x) obj).f56192a);
    }

    public final int hashCode() {
        return this.f56192a.hashCode();
    }
}
