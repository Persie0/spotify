package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cib {

    /* JADX INFO: renamed from: a */
    public final String f38270a;

    /* JADX INFO: renamed from: b */
    public final int f38271b;

    public cib(String str, int i) {
        this.f38270a = str;
        this.f38271b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cib)) {
            return false;
        }
        cib cibVar = (cib) obj;
        return wj50.m88271j(this.f38270a, cibVar.f38270a) && this.f38271b == cibVar.f38271b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38271b) + (this.f38270a.hashCode() * 31);
    }
}
