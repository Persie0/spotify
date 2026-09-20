package p204p;

/* JADX INFO: loaded from: classes4.dex */
public final class vuw implements k3x {

    /* JADX INFO: renamed from: a */
    public final String f245087a;

    /* JADX INFO: renamed from: b */
    public final String f245088b;

    public vuw(String str, String str2) {
        this.f245087a = str;
        this.f245088b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vuw)) {
            return false;
        }
        vuw vuwVar = (vuw) obj;
        return wj50.m88271j(this.f245087a, vuwVar.f245087a) && wj50.m88271j(this.f245088b, vuwVar.f245088b);
    }

    public final int hashCode() {
        int iHashCode = this.f245087a.hashCode() * 31;
        String str = this.f245088b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
