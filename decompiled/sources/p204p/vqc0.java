package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vqc0 extends erc0 {

    /* JADX INFO: renamed from: a */
    public final Throwable f243924a;

    public vqc0(Throwable th) {
        this.f243924a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqc0) && wj50.m88271j(this.f243924a, ((vqc0) obj).f243924a);
    }

    public final int hashCode() {
        return this.f243924a.hashCode();
    }
}
