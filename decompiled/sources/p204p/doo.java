package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class doo {

    /* JADX INFO: renamed from: a */
    public final String f51086a;

    /* JADX INFO: renamed from: b */
    public final int f51087b;

    public doo(String str, int i) {
        this.f51086a = str;
        this.f51087b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doo)) {
            return false;
        }
        doo dooVar = (doo) obj;
        return wj50.m88271j(this.f51086a, dooVar.f51086a) && this.f51087b == dooVar.f51087b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51087b) + (this.f51086a.hashCode() * 31);
    }
}
