package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class vei {

    /* JADX INFO: renamed from: a */
    public final String f240758a;

    /* JADX INFO: renamed from: b */
    public final String f240759b;

    public vei(String str, String str2) {
        this.f240758a = str;
        this.f240759b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vei)) {
            return false;
        }
        vei veiVar = (vei) obj;
        return wj50.m88271j(this.f240758a, veiVar.f240758a) && wj50.m88271j(this.f240759b, veiVar.f240759b);
    }

    public final int hashCode() {
        return this.f240759b.hashCode() + (this.f240758a.hashCode() * 31);
    }
}
