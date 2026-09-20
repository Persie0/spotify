package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class j340 {

    /* JADX INFO: renamed from: a */
    public final String f108286a;

    /* JADX INFO: renamed from: b */
    public final String f108287b;

    public j340(String str, String str2) {
        this.f108286a = str;
        this.f108287b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j340)) {
            return false;
        }
        j340 j340Var = (j340) obj;
        return wj50.m88271j(this.f108286a, j340Var.f108286a) && wj50.m88271j(this.f108287b, j340Var.f108287b);
    }

    public final int hashCode() {
        return this.f108287b.hashCode() + (this.f108286a.hashCode() * 31);
    }
}
