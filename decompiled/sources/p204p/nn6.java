package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class nn6 {

    /* JADX INFO: renamed from: a */
    public final czz f156335a;

    public nn6(czz czzVar) {
        this.f156335a = czzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nn6) && wj50.m88271j(this.f156335a, ((nn6) obj).f156335a);
    }

    public final int hashCode() {
        return this.f156335a.hashCode() * 31;
    }

    public final String toString() {
        return "Key(font=" + this.f156335a + ", loaderKey=null)";
    }
}
