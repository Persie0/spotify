package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class sth {

    /* JADX INFO: renamed from: a */
    public final String f213914a;

    /* JADX INFO: renamed from: b */
    public final String f213915b;

    public sth(String str, String str2) {
        this.f213914a = str;
        this.f213915b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sth)) {
            return false;
        }
        sth sthVar = (sth) obj;
        return wj50.m88271j(this.f213914a, sthVar.f213914a) && wj50.m88271j(this.f213915b, sthVar.f213915b);
    }

    public final int hashCode() {
        return this.f213915b.hashCode() + (this.f213914a.hashCode() * 31);
    }
}
