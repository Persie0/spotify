package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class goq0 implements joq0 {

    /* JADX INFO: renamed from: a */
    public final String f83003a;

    public goq0(String str) {
        this.f83003a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof goq0) && wj50.m88271j(this.f83003a, ((goq0) obj).f83003a);
    }

    public final int hashCode() {
        return this.f83003a.hashCode();
    }
}
