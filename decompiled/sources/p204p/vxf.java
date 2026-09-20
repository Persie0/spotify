package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class vxf {

    /* JADX INFO: renamed from: a */
    public final Object f245727a;

    /* JADX INFO: renamed from: b */
    public final String f245728b;

    public vxf(Object obj, String str) {
        this.f245727a = obj;
        this.f245728b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxf)) {
            return false;
        }
        vxf vxfVar = (vxf) obj;
        return wj50.m88271j(this.f245727a, vxfVar.f245727a) && wj50.m88271j(this.f245728b, vxfVar.f245728b);
    }

    public final int hashCode() {
        Object obj = this.f245727a;
        return this.f245728b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }
}
