package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class o9d implements lad {

    /* JADX INFO: renamed from: a */
    public final String f162998a;

    /* JADX INFO: renamed from: b */
    public final String f162999b;

    public o9d(String str, String str2) {
        this.f162998a = str;
        this.f162999b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9d)) {
            return false;
        }
        o9d o9dVar = (o9d) obj;
        return wj50.m88271j(this.f162998a, o9dVar.f162998a) && wj50.m88271j(this.f162999b, o9dVar.f162999b);
    }

    public final int hashCode() {
        return this.f162999b.hashCode() + (this.f162998a.hashCode() * 31);
    }
}
