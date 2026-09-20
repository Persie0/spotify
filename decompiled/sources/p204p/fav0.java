package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class fav0 extends gav0 {

    /* JADX INFO: renamed from: a */
    public final String f67642a;

    public fav0(String str) {
        this.f67642a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fav0) && wj50.m88271j(this.f67642a, ((fav0) obj).f67642a);
    }

    public final int hashCode() {
        return this.f67642a.hashCode();
    }
}
