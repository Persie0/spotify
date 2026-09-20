package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vvv extends wvv {

    /* JADX INFO: renamed from: a */
    public final int f245339a;

    public vvv(int i) {
        this.f245339a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vvv) && this.f245339a == ((vvv) obj).f245339a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f245339a);
    }
}
