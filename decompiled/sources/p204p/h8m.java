package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class h8m implements k8m {

    /* JADX INFO: renamed from: a */
    public final String f88728a;

    public h8m(String str) {
        this.f88728a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8m) && wj50.m88271j(this.f88728a, ((h8m) obj).f88728a);
    }

    public final int hashCode() {
        return this.f88728a.hashCode();
    }
}
