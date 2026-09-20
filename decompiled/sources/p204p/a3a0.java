package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class a3a0 extends c3a0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f11905a;

    public a3a0(Throwable th) {
        this.f11905a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3a0) && wj50.m88271j(this.f11905a, ((a3a0) obj).f11905a);
    }

    public final int hashCode() {
        return this.f11905a.hashCode();
    }
}
