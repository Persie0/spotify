package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class vxs implements wxs {

    /* JADX INFO: renamed from: a */
    public final int f245824a;

    public vxs(int i) {
        this.f245824a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vxs) && this.f245824a == ((vxs) obj).f245824a;
    }

    public final int hashCode() {
        return edb.m38547C(this.f245824a);
    }
}
