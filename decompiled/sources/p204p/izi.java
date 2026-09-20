package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class izi {

    /* JADX INFO: renamed from: a */
    public final dzi f107234a;

    /* JADX INFO: renamed from: b */
    public final dzi f107235b;

    public izi(dzi dziVar, dzi dziVar2) {
        this.f107234a = dziVar;
        this.f107235b = dziVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izi)) {
            return false;
        }
        izi iziVar = (izi) obj;
        return this.f107234a == iziVar.f107234a && this.f107235b == iziVar.f107235b;
    }

    public final int hashCode() {
        return this.f107235b.hashCode() + (this.f107234a.hashCode() * 31);
    }
}
