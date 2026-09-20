package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class pcu {

    /* JADX INFO: renamed from: a */
    public final String f176228a;

    /* JADX INFO: renamed from: b */
    public final int f176229b;

    public pcu(String str, int i) {
        this.f176228a = str;
        this.f176229b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcu)) {
            return false;
        }
        pcu pcuVar = (pcu) obj;
        return wj50.m88271j(this.f176228a, pcuVar.f176228a) && this.f176229b == pcuVar.f176229b;
    }

    public final int hashCode() {
        return edb.m38547C(this.f176229b) + (this.f176228a.hashCode() * 31);
    }
}
