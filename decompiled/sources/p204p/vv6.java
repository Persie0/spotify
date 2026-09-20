package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class vv6 extends r9g1 {

    /* JADX INFO: renamed from: d */
    public final String f245154d;

    public vv6(String str) {
        this.f245154d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vv6) && wj50.m88271j(this.f245154d, ((vv6) obj).f245154d);
    }

    public final int hashCode() {
        return this.f245154d.hashCode();
    }
}
