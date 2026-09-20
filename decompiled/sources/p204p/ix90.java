package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class ix90 implements jx90 {

    /* JADX INFO: renamed from: a */
    public final String f106628a;

    public ix90(String str) {
        this.f106628a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix90) && wj50.m88271j(this.f106628a, ((ix90) obj).f106628a);
    }

    public final int hashCode() {
        return this.f106628a.hashCode();
    }
}
