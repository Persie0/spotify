package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class wwv {

    /* JADX INFO: renamed from: a */
    public final String f255840a;

    /* JADX INFO: renamed from: b */
    public final uwv f255841b;

    public wwv(String str, uwv uwvVar) {
        this.f255840a = str;
        this.f255841b = uwvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wwv)) {
            return false;
        }
        wwv wwvVar = (wwv) obj;
        return wj50.m88271j(this.f255840a, wwvVar.f255840a) && this.f255841b == wwvVar.f255841b;
    }

    public final int hashCode() {
        return this.f255841b.hashCode() + (this.f255840a.hashCode() * 31);
    }
}
