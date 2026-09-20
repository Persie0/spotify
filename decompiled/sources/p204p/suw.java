package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class suw implements y2x {

    /* JADX INFO: renamed from: a */
    public final String f214229a;

    /* JADX INFO: renamed from: b */
    public final String f214230b;

    public suw(String str, String str2) {
        this.f214229a = str;
        this.f214230b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof suw)) {
            return false;
        }
        suw suwVar = (suw) obj;
        return wj50.m88271j(this.f214229a, suwVar.f214229a) && wj50.m88271j(this.f214230b, suwVar.f214230b);
    }

    public final int hashCode() {
        return this.f214230b.hashCode() + (this.f214229a.hashCode() * 31);
    }
}
