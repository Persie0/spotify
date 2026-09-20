package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class vfi {

    /* JADX INFO: renamed from: a */
    public final foo f240988a;

    public vfi(foo fooVar) {
        this.f240988a = fooVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vfi) && wj50.m88271j(this.f240988a, ((vfi) obj).f240988a);
    }

    public final int hashCode() {
        return this.f240988a.hashCode();
    }
}
