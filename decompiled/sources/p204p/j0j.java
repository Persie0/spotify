package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class j0j implements k0j {

    /* JADX INFO: renamed from: a */
    public final int f107474a;

    /* JADX INFO: renamed from: b */
    public final String f107475b;

    public j0j(int i, String str) {
        this.f107474a = i;
        this.f107475b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0j)) {
            return false;
        }
        j0j j0jVar = (j0j) obj;
        return this.f107474a == j0jVar.f107474a && wj50.m88271j(this.f107475b, j0jVar.f107475b);
    }

    public final int hashCode() {
        return this.f107475b.hashCode() + (Integer.hashCode(this.f107474a) * 31);
    }
}
