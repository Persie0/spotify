package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class byl0 extends eyl0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f32271a;

    public byl0(Throwable th) {
        this.f32271a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byl0) && wj50.m88271j(this.f32271a, ((byl0) obj).f32271a);
    }

    public final int hashCode() {
        return this.f32271a.hashCode();
    }

    public final String toString() {
        return "Failure(throwable=" + this.f32271a + ")";
    }
}
